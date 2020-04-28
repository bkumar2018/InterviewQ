package SeleniumQuestions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WindowType;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenShot {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		
		WebElement lga = driver.findElement(By.id("lga"));
		WebElement gSbtn = driver.findElement(By.name("btnK"));
		
		takeElementScreenShot(lga, "googlescreen");
		//takeElementScreenShot(gSbtn, "googleSearchbtn");
		
		
		System.out.println(driver.getTitle());
		
		//Take screen shot of all page using Webdriver
		takeSnapShot(driver,"D://eclipse-workspace//selenium.web//target//screenShots//webdriver.png");
				
		driver.quit();
		
	}


	//1. Take screen shot of WebElement
	public static void takeElementScreenShot(WebElement el, String filename) {
	
		File srcFile = el.getScreenshotAs(OutputType.FILE);
		
		try{
			FileUtils.copyFile(srcFile, new File("D://eclipse-workspace//selenium.web//target//screenShots//"+ filename+ ".png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	// 2. Another way to take screenshot but of Webdriver
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
	
}
