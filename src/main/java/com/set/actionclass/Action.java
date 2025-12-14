/**
 * 
 */
package com.set.actionclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.set.baseclass.baseclass;

/**
 * @author datta.tandale
 *
 */
public class Action extends baseclass
  {
	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}

	public void click(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();
	}

	public static boolean findelement(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			ele.isDisplayed();
			flag = true;
		} catch (Exception e) {
			System.out.println("Locator not found: " + ele);
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully Found element at webpage");
			} else {
				System.out.println("Unable to locate element at webpage");
			}
		}
		return flag;
	}

	public static boolean isDisplayed(WebDriver driver, WebElement ele) {
		boolean flag = false;
		flag = findelement(driver, ele);
		if (flag) {
			flag = ele.isDisplayed();
			if (flag) {

				System.out.println("Successfully Found element at webpage");
			} else {
				System.out.println("Unable to locate element at webpage");
			}

		} else {
			System.out.println("Not displayed");
		}

		return flag;
	}

	public boolean isSelected(WebDriver driver, WebElement ele) {
		boolean flag = false;
		flag = findelement(driver, ele);
		if (flag) {
			flag = ele.isSelected();
			if (flag) {

				System.out.println("Element is selected");
			} else {
				System.out.println("Element is not selected");
			}

		} else {
			System.out.println("Not selected");
		}
		return flag;
	}

	public static boolean isEnabled(WebDriver driver, WebElement ele) {
		boolean flag = false;
		flag = findelement(driver, ele);
		if (flag) {
			flag = ele.isEnabled();
			if (flag) {

				System.out.println("Element is enabled");
			} else {
				System.out.println("Element is not enabled");
			}

		} else {
			System.out.println("Not enables");
		}
		return flag;
	}

	public static boolean sendKey(WebElement ele, String text) {
		boolean flag = false;
		try {
			ele.isDisplayed();
			System.out.println(ele.isDisplayed());
			ele.clear();
			ele.sendKeys(text);
			// logger/into("Entered text :"+text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not Found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value");
			} else {
				System.out.println("Unable to enter value");
			}
		}
		return flag;

	}

	public boolean selectBysendKeys(String value, WebElement ele) {
		boolean flag = false;
		try {
			ele.sendKeys(value);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Selected value from the dropdown");
			} else {
				System.out.println("Not Selected value from the dropdown");
			}
		}

	}

	public boolean selectByIndex(WebElement ele, int index) {
		boolean flag = false;
		try {
			Select s = new Select(ele);
			s.selectByIndex(index);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Option selected by Index");
			} else {
				System.out.println("Option not selected by Index");
			}
		}

	}

	public boolean selectByValue(WebElement ele, String value) {
		boolean flag = false;
		try {
			Select s = new Select(ele);
			s.selectByValue(value);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Option selected by value");
			} else {
				System.out.println("Option not selected by value");
			}
		}

	}

	public boolean selectByVisibleText(WebElement ele, String visibletext) {
		boolean flag = false;
		try {
			Select s = new Select(ele);
			s.selectByValue(visibletext);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Option selected by VisibleText");
			} else {
				System.out.println("Option not selected by VisibleText");
			}
		}

	}

	public boolean mouseHoverByJavaScript(WebElement ele) {
		boolean flag = false;
		try {
			WebElement mo = ele;
			String javaScript = "var evObj = document cretedEvent('MouseEvents')evObj.initMouseEvent(\"mouseover\",true,false,window,0,0,0,0,0 arguments[0].dispaychEvent(evObj);";
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(javaScript, mo);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("MouseOver Action is performed");
			} else {
				System.out.println("MouseOver Action is not performed");
			}
		}
	}

	public boolean JSClick(WebDriver driver, WebElement ele) throws Exception {
		boolean flag = false;
		try {
			// webelement element=driver.findelement(locator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
			// driver.executeAsyncScript("arguments[0].click();", element);
			flag = true;
		} catch (Exception e) {
			throw e;
		} finally {
			if (flag) {
				System.out.println("Click Action is performed");
			}

			else {
				System.out.println("Click Action is not performed");
			}

		}
		return flag;
	}

	public static boolean switchToFrameByIndex(WebDriver driver, int index) {
		boolean flag = false;
		try {
			// List<WebElement> iframes = new WebDriverWait(driver, 15)
			// .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//iframe")));
			driver.switchTo().frame(index);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Frame with index\"" + index + "\" is selected");
			}

			else {
				System.out.println("Frame with index\"" + index + "\" is not selected");
			}
		}

	}

	public static boolean switchToFrameByID(WebDriver driver, String idValue) {
		boolean flag = false;
		try {
			// List<WebElement> iframes = new WebDriverWait(driver, 15)
			// .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//iframe")));
			driver.switchTo().frame(idValue);
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("Frame with id\"" + idValue + "\" is selected");
			}

			else {
				System.out.println("Frame with id\"" + idValue + "\" is not selected");
			}
		}

	}

	public static boolean switchToFrameByName(WebDriver driver, String nameValue) {
		boolean flag = false;
		try {
			driver.switchTo().frame(nameValue);
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("Frame with name\"" + nameValue + "\" is selected");
			}

			else {
				System.out.println("Frame with name\"" + nameValue + "\" is not selected");
			}
		}

	}

	public static boolean switchToDefaultFrame(WebDriver driver) {
		boolean flag = false;
		try {
			driver.switchTo().defaultContent();
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("Frame with name is selected");
			}

			else {
				System.out.println("Frame with name is not selected");
			}
		}

	}

	public void mouseOverElement(WebDriver driver, WebElement element) {
		boolean flag = false;
		try {
			Actions Action = new Actions(driver);
			Action.moveToElement(element).build().perform();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				System.out.println("MouseOver Action is performed on");
			}

			else {
				System.out.println("MouseOver Action is not performed on");
			}
		}

	}

	public boolean moveToElement(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			// WebElement element=driver.findElement(Locator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", ele);
			Actions actions = new Actions(driver);
			// actions.moveToElement(driver.findElement((Locator)).build().perform();
			actions.moveToElement(ele).build().perform();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (flag) {
				System.out.println("MovetoElement Action is performed on");
			}

			else {
				System.out.println("MovetoElement Action is not performed on");
			}
		}
		return flag;
	}

	public boolean mouseover(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			// WebElement element=driver.findElement(Locator);
			Actions actions = new Actions(driver);
			// actions.moveToElement(driver.findElement((Locator)).build().perform();
			actions.moveToElement(ele).build().perform();
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return true;

		} finally {
			if (flag) {
				System.out.println("MouseOver Action is performed on");
			}

			else {
				System.out.println("MouseOver Action is not performed on");
			}

		}
	}

	public boolean draggable(WebDriver driver, WebElement source, int x, int y) {
		boolean flag = false;
		try {
			Actions actions = new Actions(driver);
			actions.dragAndDropBy(source, x, y).build().perform();
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return true;

		} finally {
			if (flag) {
				System.out.println("Dragged Action is performed on");
			}

			else {
				System.out.println("Dragged Action is not performed on");
			}
		}
	}

	public boolean draganddrop(WebDriver driver, WebElement source, WebElement target) {
		boolean flag = false;
		try {
			Actions actions = new Actions(driver);
			actions.dragAndDrop(source, target).perform();
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return true;

		} finally {
			if (flag) {
				System.out.println("DragAndDrop Action is performed on");
			}

			else {
				System.out.println("DragAndDrop Action is not performed on");
			}
		}
	}

	public boolean slider(WebDriver driver, WebElement ele, int x, int y) {
		boolean flag = false;
		try {
			Actions actions = new Actions(driver);
			actions.dragAndDropBy(ele, x, y).build().perform();
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return true;

		} finally {
			if (flag) {
				System.out.println("Slider Action is performed on");
			}

			else {
				System.out.println("Slider Action is not performed on");
			}
		}
	}

	public boolean rightclcik(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			Actions actions = new Actions(driver);
			actions.contextClick(ele).perform();
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return true;

		} finally {
			if (flag) {
				System.out.println("RightClick Action is performed on");
			}

			else {
				System.out.println("RightClick Action is not performed on");
			}
		}
	}

	public boolean swicthWindowByTitle(WebDriver driver, String windowTitle, int count) {
		boolean flag = false;
		try {
			Set<String> windowlist = driver.getWindowHandles();
			String[] array = windowlist.toArray(new String[0]);
			driver.switchTo().window(array[count - 1]);
			if (driver.getTitle().contains(windowTitle)) {
				flag = true;
			} else {
				flag = false;
			}
			return flag;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Navigated to the window with title");
			}

			else {
				System.out.println("Not Navigated to the window with title");
			}
		}
	}

	public boolean swicthToNewWindow(WebDriver driver) {
		boolean flag = false;
		try {
			Set<String> s = driver.getWindowHandles();
			ArrayList<String> s1 = new ArrayList<String>(s);
			driver.switchTo().window(s1.get(1));
			flag = true;
			return flag;
		} catch (Exception e) {
			flag = false;
			return false;
		} finally {
			if (flag) {
				System.out.println("Window is Navigated with title");
			}

			else {
				System.out.println("Window is Not Navigated");
			}
		}
	}

	public boolean swicthTo01Window(WebDriver driver) {
		boolean flag = false;
		try {
			Set<String> s = driver.getWindowHandles();
			ArrayList<String> s1 = new ArrayList<String>(s);
			driver.switchTo().window(s1.get(0));
			flag = true;
			return flag;
		} catch (Exception e) {
			flag = false;
			return false;
		} finally {
			if (flag) {
				System.out.println("Window is Navigated with title");
			}

			else {
				System.out.println("Window is Not Navigated");
			}
		}
	}

	public int getColumncount(WebElement row) {
		List<WebElement> columns = row.findElements(By.xpath(""));
		int a = columns.size();
		System.out.println(a);
		for (WebElement column : columns) {
			System.out.println(column.getText());
			System.out.println("|");
		}
		return a;
	}

	public int getRowCount(WebElement table) {
		List<WebElement> rows = table.findElements(By.xpath(""));
		int a = rows.size();
		System.out.println(a);
		return a;
	}

	public boolean Alert(WebDriver driver) {
		boolean presentFlag = false;
		org.openqa.selenium.Alert alert = null;
		try {
			// check the presence of alert
			alert = driver.switchTo().alert();
			alert.accept();
			presentFlag = true;
		} catch (Exception e) {
			e.printStackTrace();
			presentFlag = false;
		} finally {
			if (presentFlag) {
				System.out.println("Alert is present");
			}

			else {
				System.out.println("Alert is not present");
			}
		}

		return presentFlag;

	}

	public boolean launchUrl(WebDriver driver, String url) {
		boolean flag = false;
		try {
			driver.navigate().to(url);
			flag = true;
			return flag;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Successfully launched");
			} else {
				System.out.println("Failes to launch");
			}
		}
	}

	public boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public static String getTitle(WebDriver driver) {
		String text = driver.getTitle();
		return text;
	}

	public String getCurrentURL(WebDriver driver) {
		String text = driver.getCurrentUrl();
		return text;
	}

	public static boolean Click1(WebElement locator) {
		boolean flag = false;
		try {
			locator.click();
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		} finally {
			if (flag) {
				System.out.println("Able to Click");
			} else {
				System.out.println("Not able to click");
			}
		}
	}

	public static void implicitwait(WebDriver driver, int timeOut) {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	public static void explicitwait(WebDriver driver, WebElement element, int timeOut) {
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void pageLoadTimeOut(WebDriver driver, int timeOut) {
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeOut));
		driver.manage().timeouts().pageLoadTimeout(timeOut, TimeUnit.SECONDS);
	}

	// written by me
	public static void movetoelement(WebElement ele) {
		Actions act = new Actions(driver);
		try {
			act.moveToElement(ele).build().perform();
			System.out.println("Moved to element");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Not moved to element");
		}
	}

	public static void moveandclicktoelement(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();
	}

	public static String getText(WebElement ele) {
		String elementtext = ele.getText();
		return elementtext;
	}

	public static boolean switchToFramebyXpath(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			driver.switchTo().frame(ele);
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("Frame with xpath is selected");
			}

			else {
				System.out.println("Frame with xpath is not selected");
			}
		}

	}
}
