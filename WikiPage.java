package CodingAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage {
	public static String country;
	 public static String Date;
	
	
	@FindBy(xpath = "//input[@placeholder='Search Wikipedia']")private WebElement SearchBox;
	@FindBy(xpath="//input[@id='searchButton']")private WebElement Searchbtn;
	@FindBy(xpath = "(//div[@class='plainlist']/ul/li)[12]")private WebElement ReasizeDate;
	@FindBy(xpath = "//td[text()='India']")private WebElement Country;
	
	
	
	public WikiPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickSearchSendValue(String str) {
		SearchBox.sendKeys(str);
		
	}
	public void ClickSearchBtn() {
		Searchbtn.click();
		
	}
	public void GetReleazedate() {
		 Date = ReasizeDate.getText();
		System.out.println(Date);
		
	}
	public void GetCountryName() {
		 country = Country.getText();
		System.out.println(country);
	}
}
