import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumTest {

    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.techlistic.com/p/selenium-practice-form.html");

        WebElement we =driver.findElement(By.name("firstname"));
        we.sendKeys("carla");
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("cavli");
        List<WebElement> gender = driver.findElements( By.name( "sex" ) );
        WebElement secondElementOfGender = gender.get( 1 );
        secondElementOfGender.click();
        List<WebElement> experience = driver.findElements(By.name("exp"));
        experience.get(0).click();
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("12.16.2109");
        WebElement checkbox = driver.findElement( By.id( "profession-1" ) );
        checkbox.click();
        WebElement tools = driver.findElement(By.id("tool-2"));
        tools.click();
        WebElement continent = driver.findElement(By.name("continents"));
        Select dropdown = new Select(continent);
        dropdown.selectByVisibleText("North America");
//
        Select select = new Select(driver.findElement(By.id("selenium_commands")));
        select.deselectAll();
        List<WebElement> selectOptions = select.getOptions();
        for (WebElement option : selectOptions) {
            select.selectByVisibleText(option.getText());
        }
        }


    }

