import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RegistrationTest extends BaseUI{




    String name = "Al";
    By BUTTON_SUBMIT = By.xpath("//a");
    int number = 3;
    boolean requirement = true;
    boolean requirement2 = false;

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);

    }


    @Test
    public void testRegistration() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_NAME).sendKeys(Data.name);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);


    }

   // @AfterMethod
    public void afterActions(){
        driver.quit();
    }

}