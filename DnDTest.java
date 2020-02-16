package hw.selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


// "for Test both objects are in the column TO DO"
public class DnDTest {
    private String url;
    private WebDriver driver;

@BeforeClass
    public void BeforeMethod() {
    url = "https://jira.hillel.it/login.jsp";
    driver = new ChromeDriver();

 }
  @Test
    public void testMethod() {
    driver.get(url);
    driver.findElement(By.cssSelector("div.aui-page-panel input#login-form-username")).clear();
    driver.findElement(By.cssSelector("div.aui-page-panel input#login-form-username")).sendKeys("Zamohylnana");
    driver.findElement(By.cssSelector("div.aui-page-panel input#login-form-password")).clear();
    driver.findElement(By.cssSelector("div.aui-page-panel input#login-form-password")).sendKeys("29031964Ma");
    driver.findElement(By.cssSelector("div.buttons input#login-form-submit")).sendKeys(Keys.ENTER);

    driver.findElement(By.cssSelector("div.aui-header-secondary input#quickSearchInput")).clear();
    driver.findElement(By.cssSelector("div.aui-header-secondary input#quickSearchInput")).sendKeys("utyata");
    driver.findElement(By.cssSelector("div.aui-header-secondary input#quickSearchInput")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("a[href=\"/secure/RapidBoard.jspa\"]")).click();
    driver.findElement(By.cssSelector("ul.aui-list-truncate #rapidb_lnk_636_lnk")).click();


//      " First object from any column drags in first empty column -  works only for the first time"

//      WebElement source1 = driver.findElement(By.xpath("//div[@class='js-detailview ghx-issue js-issue ghx-has-avatar ghx-avatar-not-empty js-parent-drag ghx-type-10107']"));
//      WebElement target1 = driver.findElement(By.xpath("//div[@id='ghx-pool']//li"));
//      Actions actions1 = new Actions(driver);
//      actions1.dragAndDrop(source1, target1).perform();


//       "First found object from any column drags in second column "IN PROGRESS""

      WebElement source2 = driver.findElement(By.xpath("//div[@class='js-detailview ghx-issue js-issue ghx-has-avatar ghx-avatar-not-empty js-parent-drag ghx-type-10107']"));
      WebElement target2 = driver.findElement(By.xpath("//div[@id='ghx-pool']//li[2]"));
      Actions actions2 = new Actions(driver);
      actions2.dragAndDrop(source2, target2).perform();


//      "First found object from second column drags in third column "DONE""

      WebElement source3 = driver.findElement(By.cssSelector("li.ghx-column.ui-sortable:nth-child(2) div.js-detailview.ghx-issue.js-issue.ghx-has-avatar.ghx-avatar-not-empty.js-parent-drag.ghx-type-10107"));
      WebElement target3 = driver.findElement(By.cssSelector(" li.ghx-column.ui-sortable:nth-child(3)"));
      Actions actions3 = new Actions(driver);
      actions3.dragAndDrop(source3, target3).perform();

//      "First found object from any column drags in third column "DONE""

      WebElement source4 = driver.findElement(By.cssSelector("li.ghx-column.ui-sortable div.js-detailview.ghx-issue.js-issue.ghx-has-avatar.ghx-avatar-not-empty.js-parent-drag.ghx-type-10107"));
      WebElement target4 = driver.findElement(By.cssSelector("ul.ghx-columns li.ghx-column.ui-sortable:nth-child(3)"));
      Actions actions4 = new Actions(driver);
      actions4.dragAndDrop(source4, target4).perform();

           }

           @AfterClass
           public void afterMethod() {
       driver.quit();
           }

}
