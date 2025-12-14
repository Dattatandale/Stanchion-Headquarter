/**
 * 
 */
package com.set.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.set.actionclass.Action;
import com.set.baseclass.baseclass;

/**
 * @author datta.tandale
 *
 */
public class MDMCampaignReasons extends baseclass {
	@FindBy(xpath = "//frame[@name='frdetail']")
	private WebElement CampaignReasonframe;
	@FindBy(xpath = "//td[text()='Campaign Reasons']")
	private WebElement CampaignReasonTitle;
	@FindBy(xpath = "//img[@src='/multistore/gifs/but_txt_add_en.gif']")
	private WebElement AddButton;
	@FindBy(xpath = "(//input[@class='inputText'])[2]")
	private WebElement DescriptionInput;
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement startdateselectionbutton;
	@FindBy(xpath = "(//input[@type='button'])[2]")
	private WebElement enddateselectionbutton;
	@FindBy(xpath = "//a[text()='15']")
	private WebElement startdateselection;
	@FindBy(xpath = "//a[text()='30']")
	private WebElement enddateselection;
	@FindBy(xpath = "//img[@src='/multistore/gifs/but_txt_ok.gif']")
	private WebElement Okbutton;

	public MDMCampaignReasons(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void SwitchToFrame() {
		Action.switchToFramebyXpath(driver, CampaignReasonframe);
	}

	public String CampaignReasonText() {
		String TextResult = Action.getText(CampaignReasonTitle);
		return TextResult;
	}

}
