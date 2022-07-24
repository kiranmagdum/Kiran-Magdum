package CodingAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDBPage {
	public static String D;
	public static String cntry;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement SearchBox;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SearchBtn;
	@FindBy(xpath = "//a[text()='Pushpa: The Rise - Part 1']")
	private WebElement MovieName;
	@FindBy(xpath = "//a[text()='January 7, 2022 (United States)']")
	private WebElement Date;
	@FindBy(xpath = "//a[text()='India']")
	private WebElement Country;

	IMDBPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickSearchbox(String nm) {
		SearchBox.sendKeys(nm);
	}

	public void clickbtn() {
		SearchBtn.click();
	}

	public void ClickOnMovieName() {
		MovieName.click();
	}

	public void GetMoviedate() {
		D = Date.getText();
		System.out.println(D);
	}

	public void GetCountry() {
		cntry = Country.getText();
		System.out.println(cntry);
	}
}
