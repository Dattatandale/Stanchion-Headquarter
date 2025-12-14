package com.set.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.set.actionclass.Action;
import com.set.baseclass.baseclass;

public class MDMPageSET extends baseclass {
	@FindBy(xpath = "//frame[@name='frmenu']")
	private WebElement frame;
	@FindBy(xpath = "//td[text()='Master Data Management']")
	private WebElement MDMMenuTitle;
	@FindBy(xpath = "//span[text()='Campaign Reasons']")
	private WebElement CampaignReasonOption;

	public MDMPageSET(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void SwitchToMDMFrame() {
		Action.switchToFramebyXpath(driver, frame);
	}

	public String MDMMenuTitleText() {
		String TextResult = Action.getText(MDMMenuTitle);
		return TextResult;
	}

	public MDMCampaignReasons ClickCampaignReason() {
		Action.Click1(CampaignReasonOption);
		return new MDMCampaignReasons(driver);

	}

}
