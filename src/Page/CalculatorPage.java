package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

	private WebDriver driver;

	public CalculatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "com.android.calculator2:id/del")
	public WebElement CLRButton;

	@FindBy(xpath = ".//android.widget.Button[@text='+']")
	public WebElement PlusButton;

	@FindBy(xpath = ".//android.widget.Button[@text='=']")
	public WebElement EqualButton;

	@FindBy(xpath = "//android.widget.Button[@text='5']")
	public WebElement NumFive;

	@FindBy(xpath = "//android.widget.Button[@text='9']")
	public WebElement NumNine;

	@FindBy(id = "com.android.calculator2:id/result")
	public WebElement ResultField;

}
