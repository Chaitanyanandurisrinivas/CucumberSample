import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Constants;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class GetQuotes {

	public static WebDriver driver = null;

	@Given("Navigate to Compare the Market URL")
	public void navigate_to_compare_the_market_url() {
		SeleniumDriver.setUpDriver();
		SeleniumDriver.openPage(Constants.COMPARE_THE_MARKET_URL);
		SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.ACCEPT_AND_CONTINUE_BUTTON);
	}

	@When("Click on Life Insurance")
	public void click_on_life_insurance() throws Exception {
		if (SeleniumHelper.isElementExists(SeleniumDriver.getDriver(), Constants.LIFE_INSURANCE_MENU_HOME_PAGE)) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.LIFE_INSURANCE_MENU_HOME_PAGE);
		}
	}

	@And("Click Just myself and Next button")
	public void click_just_myself_and_next_button() throws InterruptedException {
		SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.JUST_MYSELF_COVER);
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.NEXT_BUTTON);
	}

	@And("select Title as {string}")
	public void select_title_as(String title) {
		if (title.equalsIgnoreCase("Mr")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.TITLE_MR);
		} else if (title.equalsIgnoreCase("Mrs")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.TITLE_MRS);
		} else if (title.equalsIgnoreCase("Ms")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.TITLE_MS);
		} else if (title.equalsIgnoreCase("Miss")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.TITLE_MISS);
		}
	}

	@And("Enter {string} as First Name {string} as Surname and Click on Next")
	public void enter_as_first_name_as_surname_and_click_on_next(String firstName, String Surname) {
		SeleniumHelper.enterText(SeleniumDriver.getDriver(), Constants.FIRST_NAME, firstName);
		SeleniumHelper.enterText(SeleniumDriver.getDriver(), Constants.SURNAME, Surname);
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.NEXT_BUTTON);
	}

	@And("Select {string} from Date of Birth Day Dropdown {string} from Date of Birth Month Dropdown {string} from Date of Birth Year Dropdown and Click on Next")
	public void select_from_date_of_birth_day_dropdown_from_date_of_birth_month_dropdown_from_date_of_birth_year_dropdown_and_click_on_next(
			String day, String month, String year) {
		SeleniumHelper.selectDropDownByVisibleText(SeleniumDriver.getDriver(), Constants.DOB_DAY, day);
		SeleniumHelper.selectDropDownByVisibleText(SeleniumDriver.getDriver(), Constants.DOB_MONTH, month);
		SeleniumHelper.selectDropDownByVisibleText(SeleniumDriver.getDriver(), Constants.DOB_YEAR, year);
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.NEXT_BUTTON);
	}

	@And("Select {string} under In the past 12 months have you used any tobacco products question and Click on Next")
	public void select_under_in_the_past_12_months_have_you_used_any_tobacco_products_question_and_click_on_next(
			String smoked) {
		if (smoked.equalsIgnoreCase("Yes")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.SMOKING_YES);
		} else if (smoked.equalsIgnoreCase("No")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.SMOKING_NO);
		}
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.NEXT_BUTTON);
	}

	@And("Select {string} under type of cover question and Click on Next")
	public void select_under_type_of_cover_question_and_click_on_next(String cover) {
		if (cover.equalsIgnoreCase("Level Term")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.COVER_LEVELTERM);
		} else if (cover.equalsIgnoreCase("Decreasing")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.COVER_DECREASING);
		}
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.NEXT_BUTTON);
	}

	@And("Enter {string} under How many years would you like your cover to last question and Click on Next")
	public void enter_under_how_many_years_would_you_like_your_cover_to_last_question_and_click_on_next(
			String termYears) {
		SeleniumHelper.enterText(SeleniumDriver.getDriver(), Constants.TERM_YEARS, termYears);
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.NEXT_BUTTON);
	}

	@And("Enter {string} under minimum amount of cover question and Click on Next")
	public void enter_under_minimum_amount_of_cover_question_and_click_on_next(String coverAmount) {
		SeleniumHelper.enterText(SeleniumDriver.getDriver(), Constants.COVER_AMOUNT, coverAmount);
		SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.COVER_AMOUNT_SECONDARY_TEXT);
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.NEXT_BUTTON);
	}

	@And("Select {string} under Critical Illness Cover question and Click on Next")
	public void select_under_critical_illness_cover_question_and_click_on_next(String criticalIllCover) {
		if (criticalIllCover.equalsIgnoreCase("Yes")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.CRITICAL_ILLNESS_COVER_YES);
		} else if (criticalIllCover.equalsIgnoreCase("No/Decide Later")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.CRITICAL_ILLNESS_COVER_NO);
		}
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.NEXT_BUTTON);
	}

	@And("Enter {string} under email address {string} under phone number and Click on Next")
	public void enter_under_email_address_under_phone_number_and_click_on_next(String email, String phoneNumber) {
		SeleniumHelper.enterText(SeleniumDriver.getDriver(), Constants.EMAIL_ADDRESS, email);
		SeleniumHelper.enterText(SeleniumDriver.getDriver(), Constants.PHONE_NUMBER, phoneNumber);
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.NEXT_BUTTON);
	}

	@And("Enter {string} under post code question and click Find Address Button, Wait for Some time")
	public void enter_under_post_code_question_and_click_find_address_button_wait_for_some_time(String postCode)
			throws Exception {
		SeleniumHelper.enterText(SeleniumDriver.getDriver(), Constants.POST_CODE, postCode);
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.FIND_ADDRESS);
		Thread.sleep(2000);
	}

	@And("Select Address from dropdown and Click on Next")
	public void select_address_from_dropdown_and_click_on_next() {
		SeleniumHelper.selectDropDownByVisibleText(SeleniumDriver.getDriver(), Constants.ADDRESS_DROPDOWN,
				"Tesco Stores Ltd, Exchange Street, Macclesfield, SK11 6UZ");
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.NEXT_BUTTON);
	}

	@And("Select {string} from Can we stay in touch question and Click on Next and and Click on Next and Confirm")
	public void select_from_can_we_stay_in_touch_question_and_click_on_next_and_and_click_on_next_and_confirm(
			String stayInTouchOption) throws Exception {
		if (stayInTouchOption.equalsIgnoreCase("Email")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.EMAIL_STAY_IN_TOUCH);
		}
		if (stayInTouchOption.equalsIgnoreCase("Phone")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.PHONE_STAY_IN_TOUCH);
		}
		if (stayInTouchOption.equalsIgnoreCase("Text")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.TEXT_STAY_IN_TOUCH);
		}
		if (stayInTouchOption.equalsIgnoreCase("Post")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.POST_STAY_IN_TOUCH);
		}
		if (stayInTouchOption.equalsIgnoreCase("Do not Contact")) {
			SeleniumHelper.clickElement(SeleniumDriver.getDriver(), Constants.DO_NOT_CONTACT_STAY_IN_TOUCH);
		}
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.NEXT_BUTTON);
		Thread.sleep(2000);
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.NEXT_BUTTON);
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.CONFIRM_DETAILS);
	}

	@And("click on Get your quotes button and wait for some time")
	public void click_on_get_your_quotes_button_and_wait_for_some_time() throws Exception {
		SeleniumHelper.javaScriptClickElement(SeleniumDriver.getDriver(), Constants.GET_YOUR_QUOTES_BUTTON);
		Thread.sleep(5000);
	}

	@Then("Verify that List of Quotes are displayed")
	public void verify_that_list_of_quotes_are_displayed() {
		if (SeleniumHelper.isElementExists(SeleniumDriver.getDriver(), Constants.QUOTES_LIST)) {
			System.out.println("List of Quotes are displayed as per the Criteria entered.");
		} else {
			System.out.println("Quotes are NOT displayed, please refine the Search Criteria.");
		}

	}

}