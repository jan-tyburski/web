import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExampleFileTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void enterPage() {
        System.out.println("Test page");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        WebDriver driver = new ChromeDriver(chromeOptions);
//        try {
//            // Navigate to Url
//            driver.get("https://google.com");
//        } finally {
//            driver.quit();
//        }
    }

    @Test
    public void nextPage() {
        System.out.println("Next test page");
    }
}