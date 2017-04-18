package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.CalculatorPage;
import Setup.Setup5;

public class Calculator extends Setup5 {
	private CalculatorPage Cal;

	@BeforeClass
	public void setup() {
		Cal = new CalculatorPage(driver);
	}

	@Test
	public void TestCauculator() {

		// Click on CLR button.
		Cal.CLRButton.click();
		Cal.NumFive.click();
		Cal.PlusButton.click();
		Cal.NumNine.click();
		Cal.EqualButton.click();

		String result = Cal.ResultField.getText();

		System.out.println("Number sum result is : " + result);

	}
}
