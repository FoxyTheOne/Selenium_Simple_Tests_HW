package ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Класс для тестирования сайта bonigarcia.dev/selenium-webdriver-java/
 */
class HomePageTests {
    WebDriver driver;
    private static final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/";

    @BeforeEach
    void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\javaProjects\\autoTests\\004_Selenium_Web_Driver\\Selenium_Tests_HW\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() {
        driver.getPageSource();
        driver.quit();
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
     * Тесты для проверки, что все ссылки для Chapter 3-9 доступны и при нажатии открывается соответствующая страница
     */
    @Test
    void checkChapter3WebFormUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'web-form')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "web-form.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Web form", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter3NavigationUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'navigation')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "navigation1.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Navigation example", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter3DropdownMenuUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'dropdown-menu')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "dropdown-menu.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Dropdown menu", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter3MouseOverUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'mouse-over')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "mouse-over.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Mouse over", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter3DragAndDropUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'drag-and-drop')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "drag-and-drop.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Drag and drop", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter3DrawInCanvasUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'draw-in-canvas')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "draw-in-canvas.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Drawing in canvas", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter3LoadingImagesUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'loading-images')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "loading-images.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Loading images", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter3SlowCalculatorUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'slow-calculator')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "slow-calculator.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Slow calculator", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter4LongPageUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[contains(@href, 'long-page')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "long-page.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("This is a long page", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter4InfiniteScrollUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[contains(@href, 'infinite-scroll')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "infinite-scroll.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Infinite scroll", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter4ShadowDomUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[contains(@href, 'shadow-dom')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "shadow-dom.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Shadow DOM", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter4CookiesUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[contains(@href, 'cookies')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "cookies.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Cookies", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter4FramesUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[@href='frames.html']")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "frames.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Frames", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter4IFramesUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[contains(@href, 'iframes')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "iframes.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("IFrame", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter4DialogBoxesUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[contains(@href, 'dialog-boxes')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "dialog-boxes.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Dialog boxes", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter4WebStorageUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[contains(@href, 'web-storage')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "web-storage.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Web storage", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter5GeolocationUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 5. Browser-Specific Manipulation']/../a[contains(@href, 'geolocation')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "geolocation.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Geolocation", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter5NotificationsUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 5. Browser-Specific Manipulation']/../a[contains(@href, 'notifications')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "notifications.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Notifications", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter5GetUserMediaUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 5. Browser-Specific Manipulation']/../a[contains(@href, 'get-user-media')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "get-user-media.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Get user media", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter5MultilanguageUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 5. Browser-Specific Manipulation']/../a[contains(@href, 'multilanguage')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "multilanguage.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter5ConsoleLogsUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 5. Browser-Specific Manipulation']/../a[contains(@href, 'console-logs')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "console-logs.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Console logs", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter7LoginFormUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 7. The Page Object Model (POM)']/../a[contains(@href, 'login-form')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "login-form.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Login form", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter7SlowLoginUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 7. The Page Object Model (POM)']/../a[contains(@href, 'slow')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "login-slow.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Slow login form", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter8RandomCalculatorUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 8. Testing Framework Specifics']/../a[contains(@href, 'random-calculator')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "random-calculator.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Random calculator", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter9DownloadUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 9. Third-Party Integrations']/../a[contains(@href, 'download')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "download.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Download files", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter9AbTestingUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 9. Third-Party Integrations']/../a[contains(@href, 'ab-testing')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "ab-testing.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("A/B Testing", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }

    @Test
    void checkChapter9DataTypesUrlAndTitle() {
        driver.findElement(By.xpath("//h5[text() = 'Chapter 9. Third-Party Integrations']/../a[contains(@href, 'data-types')]")).click();
        String actualMainTitle = driver.getTitle();
        WebElement actualPageTitle = driver.findElement(By.className("display-6"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "data-types.html";

        assertAll(
                () -> assertEquals("Hands-On Selenium WebDriver with Java", actualMainTitle),
                () -> assertEquals("Data types", actualPageTitle.getText()),
                () -> assertEquals(BASE_URL + expectedUrl, actualUrl)
        );
    }
}
