package mt_Project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DW009 {
	@Test
	public void f() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Nisha");
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capability.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capability);
		driver.get("http://demowebshop.tricentis.com/"); 

		driver.findElement(By.xpath("//span[@class='icon']")).click();
		driver.findElement(By.xpath("(//span[@class='expand'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//select[@id='products-orderby']")).sendKeys("Created on");
		Thread.sleep(5000);
		String exptxt="Created on";
        String actualtxt=driver.findElement(By.xpath("//option[contains(text(),'Created on')]")).getText();
        Assert.assertEquals(actualtxt, exptxt);
        System.out.println("Application allows user to sort Notebooks by Created on");

	}
}
