package CodingAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainTest {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver102.exe");
		driver = new ChromeDriver();
		driver.get("https://www.imdb.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 2)
	public void Maintest() {
		IMDBPage m = new IMDBPage(driver);
		m.clickSearchbox("Pushpa: The Rise");
		m.clickbtn();
		m.ClickOnMovieName();
		m.GetMoviedate();
		m.GetCountry();
	}

	@Test(priority = 3)
	public void setup1() {
		driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority = 4)
	public void MainTest() {
		WikiPage wk = new WikiPage(driver);
		wk.ClickSearchSendValue("Pushpa: The Rise");
		wk.ClickSearchBtn();
		wk.GetReleazedate();
		wk.GetCountryName();
	}
	@Test(priority = 5)
	public void Comapair() {
		System.out.println(IMDBPage.D);
		System.out.println(IMDBPage.cntry);
		System.out.println(WikiPage.country);
		System.out.println(WikiPage.Date);
	}
	@Test(priority=6)
	public void compairCountry() {
		if(IMDBPage.cntry.equals(WikiPage.country)) {
			System.out.println("Test Case is Pass");
		}
	}
}
