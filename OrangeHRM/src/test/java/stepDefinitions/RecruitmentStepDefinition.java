package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverManager.WebDriverManager;
import io.cucumber.java.en.When;
import pageObjects.RecruitmentPage;

public class RecruitmentStepDefinition {
	
	WebDriver driver = WebDriverManager.getDriver();
	RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
	
	@When("User clicks on Recruitment menu item")
	public void user_clicks_on_recruitment_menu_item() {
		recruitmentPage.clickOnRecruitmentItem();
	}
	
	@When("User clicks on Vacancies Tab")
	public void user_clicks_on_vacancies_tab() {
		recruitmentPage.clickOnVacanciesTab();
	}

}