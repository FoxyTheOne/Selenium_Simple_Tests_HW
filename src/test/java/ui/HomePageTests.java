package ui;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Класс для тестирования сайта bonigarcia.dev/selenium-webdriver-java/
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HomePageTests {
    WebDriver driver;
    private static final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/";

    @BeforeAll
    void setUpAll() {
        if (System.getProperty("local").equals("true")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        }
        // У нас здесь достаточно простые тесты, нет необходимости очищать и открывать новый браузер перед каждым из них
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterAll
    void tearDown() {
        driver.getPageSource();
        driver.quit();
    }

    @BeforeEach
    void setup() {
        driver.get(BASE_URL);
    }

    /**
     * Тест для проверки заголовка - тот ли сайт мы открыли
     */
    @Test
    void openHomePageTest() {
        String actualTitle = driver.getTitle();

        assertEquals("Hands-On Selenium WebDriver with Java", actualTitle);
    }

    /**
     * Простой тест для проверки, что все ссылки для Chapter 3-9 доступны и при нажатии открывается соответствующая страница
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1)
    void checkChaptersUrlsAndTitles(String chapterXpath, String expectedPageTitle, String expectedUrl) {
        driver.findElement(By.xpath(chapterXpath)).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals(expectedPageTitle, actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }


    /**
     * Аналогичнай тест, но текст actualPageTitle находится в фрейме
     */
    @Test
    void checkChapter4FramesUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[@href='frames.html']")).click();
        String actualMainTitle = driver.getTitle();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "frames.html";

        // Обработка frame
        WebElement frameElement = driver.findElement(By.cssSelector("frame[name='frame-header']"));
        driver.switchTo().frame(frameElement);
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Frames", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }
}
