package com.set.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.set.actionclass.Action;
import com.set.baseclass.baseclass;

public class HomePageSET extends baseclass {
	@FindBy(xpath = "//img[@src='/multistore/gifs/but_files-module.gif']")
	private WebElement MDMLogo;
	@FindBy(xpath = "//img[@src='/multistore/gifs/but_promopack-module.gif']")
	private WebElement PromoPackLogo;
	@FindBy(xpath = "//img[@src='/multistore/gifs/but_communication-module.gif']")
	private WebElement CommunicationLogo;
	@FindBy(xpath = "//img[@src='/multistore/gifs/but_dotnetrpts-module.gif']")
	private WebElement ReportsLogo;
	@FindBy(xpath = "//img[@src='/multistore/gifs/but_reports-module.gif']")
	private WebElement ListsLogo;
	@FindBy(xpath = "//img[@src='/multistore/gifs/but_crm-module.gif']")
	private WebElement VouchersLogo;
	@FindBy(xpath = "//img[@src='/multistore/gifs/but_application-module.gif']")
	private WebElement ApplicationLogo;

	public HomePageSET(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Methods to check element Is Displayed.
	public boolean MDMLogoDisplayed() {
		boolean MDMLogoResult = Action.isDisplayed(driver, MDMLogo);
		return MDMLogoResult;
	}

	public boolean PromoPackLogoDisplayed() {
		boolean PromoPackLogoResult = Action.isDisplayed(driver, PromoPackLogo);
		return PromoPackLogoResult;
	}

	public boolean CommunicationLogoDisplayed() {
		boolean CommunicationLogoResult = Action.isDisplayed(driver, CommunicationLogo);
		return CommunicationLogoResult;
	}

	public boolean ReportsLogoDisplayed() {
		boolean ReportsLogoResult = Action.isDisplayed(driver, ReportsLogo);
		return ReportsLogoResult;
	}

	public boolean ListsLogoDisplayed() {
		boolean ListsLogoResult = Action.isDisplayed(driver, ListsLogo);
		return ListsLogoResult;
	}

	public boolean VouchersLogoDisplayed() {
		boolean VouchersLogoResult = Action.isDisplayed(driver, VouchersLogo);
		return VouchersLogoResult;
	}

	public boolean ApplicationLogoDisplayed() {
		boolean ApplicationLogoResult = Action.isDisplayed(driver, ApplicationLogo);
		return ApplicationLogoResult;
	}

	// Methods to check element Is Enabled.
	public boolean MDMLogoEnabled() {
		boolean MDMLogoResult = Action.isEnabled(driver, MDMLogo);
		return MDMLogoResult;
	}

	public boolean PromoPackLogoEnabled() {
		boolean PromoPackLogoResult = Action.isEnabled(driver, PromoPackLogo);
		return PromoPackLogoResult;
	}

	public boolean CommunicationLogoEnabled() {
		boolean CommunicationLogoResult = Action.isEnabled(driver, CommunicationLogo);
		return CommunicationLogoResult;
	}

	public boolean ReportsLogoEnabled() {
		boolean ReportsLogoResult = Action.isEnabled(driver, ReportsLogo);
		return ReportsLogoResult;
	}

	public boolean ListsLogoEnabled() {
		boolean ListsLogoResult = Action.isEnabled(driver, ListsLogo);
		return ListsLogoResult;
	}

	public boolean VouchersLogoEnabled() {
		boolean VouchersLogoResult = Action.isEnabled(driver, VouchersLogo);
		return VouchersLogoResult;
	}

	public boolean ApplicationLogoEnabled() {
		boolean ApplicationLogoResult = Action.isEnabled(driver, ApplicationLogo);
		return ApplicationLogoResult;
	}

	// Method to check page title
	public String PageTitle() {
		String TitleResult = driver.getTitle();
		return TitleResult;
	}

	// Methods to check click Action
	public MDMPageSET MDMLogoClick() {
		Action.Click1(MDMLogo);
		return new MDMPageSET(driver);
	}

	public PromoPackPageSET PromoPackLogoClick() {
		Action.Click1(PromoPackLogo);
		return new PromoPackPageSET();
	}

	public CommunicationPageSET CommunicationLogoClick() {
		Action.Click1(CommunicationLogo);
		return new CommunicationPageSET();
	}

	public ReportsPageSET ReportsLogoClick() {
		Action.Click1(ReportsLogo);
		return new ReportsPageSET();
	}

	public ListsPageSET ListsLogoClick() {
		Action.Click1(ListsLogo);
		return new ListsPageSET();
	}

	public VouchersPageSET VouchersLogoClick() {
		Action.Click1(VouchersLogo);
		return new VouchersPageSET();
	}

	public ApplicationPageSET ApplicationLogoClick() {
		Action.Click1(ApplicationLogo);
		return new ApplicationPageSET();
	}

}
