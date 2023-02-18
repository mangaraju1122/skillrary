package genericlibraries;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class contains all reusablemethods of webdriver
 * @author LakkanaboinaBhagyaLa
 *
 */
public class WebDriverUtility {
	WebDriver driver;
	
	/**
	 * This method is used to lounch the browser
	 * 
	 * @param browser
	 * @return
	 */
	public WebDriver openApplication(String browser,String url,long time) {
		switch(browser) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case"edge":
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser data");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		return driver;
	}
	
	/**
	 * This method is used to mousehover on an element 
	 * 
	 * @param element
	 */
	public void mouseHover(WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	/**
	 * This method is used to doubleclick on an element
	 * 
	 * @param element
	 */
	public void DoubleclickOneElement(WebElement element) {
		Actions action=new Actions(driver);
		action.doubleClick(element).perform();
	}
	
	/**
	 * This method is used to drag and drop on an element
	 * 
	 * @param src
	 * @param dest
	 */
	public void DragAndDropElement(WebElement src,WebElement dest) {
		Actions action=new Actions(driver);
		action.dragAndDrop(src, dest).perform();
	}
	
	/**
	 * This method is used to select an element from dropdown based index
	 * 
	 * @param element
	 * @param index
	 */
	public void DropDown(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	/**
	 * This method is used to select an element from dropdown based text
	 * 
	 * @param element
	 * @param Text
	 */
	public void DropDown(WebElement element,String Text) {
		Select s=new Select(element);
		s.selectByVisibleText(Text);
	}
	
	/**
	 * This method is used to select an element from dropdown based value
	 * 
	 * @param value
	 * @param element
	 */
	public void DropDown(String value, WebElement element) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * This method used to switch to frame based on index
	 * @param index
	 */
	public void SwitchToFrame() {
		driver.switchTo().frame(0);
	}
	
	/**
	 * This method used to switch back from frame
	 * @param index
	 */
	public void SwitchBackFromFrame() {
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This method is used to handle alert by
	 * 
	 */
	public void HandleAlert() {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * 
	 * This method is used handle child browser pop up
	 */
	public void handleChildBrowser() {
		Set<String> windowIDs = driver.getWindowHandles();
		for(String string:windowIDs) {
			driver.switchTo().window(string);
		}
	}
	
	/**
	 * This method is used to get parent window id
	 * 
	 */
		public void SwitchToParentWindow() {
			driver.switchTo().window(driver.getWindowHandle());
		}
		
		/**
		 * This method is used scroll the page till web element
		 * 
		 * @param element
		 */
		public void ScrollToElement(Object element) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("argument[0].scrollintoview(true)", element);
		}
		
		/**
		 * This method is used to fetch the screenshot based base^4 formet
		 * 
		 */
		public void takeScreenshot() {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./screensot/pitcure.png");
			
			try {
				FileUtils.copyFile(src, dest);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * This method is used to wait until the visibility web element
		 * 
		 * @param time
		 * @param element
		 */
		public void explicitwait(long time,WebElement element) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		/**
		 * 
		 * This method is used to close the current window
		 */
		public void closeCurrentwindow() {
			driver.close();
		}
		
		/**
		 * This is method used to close the all windows and exit browser
		 * 
		 */
		public void quitbrowser() {
			driver.quit();
		}

		
	}

