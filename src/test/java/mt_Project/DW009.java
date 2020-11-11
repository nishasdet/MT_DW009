package mt_Project;

import java.awt.SecondaryLoop;
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
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[2]/li[2]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//select[@id='products-orderby']")).sendKeys("Created on");
		Thread.sleep(5000);
		String exptxt="Created on";
        String actualtxt=driver.findElement(By.xpath("//option[contains(text(),'Created on')]")).getText();
        Assert.assertEquals(actualtxt, exptxt);
        System.out.println("Application allows user to sort Desktops by Created on");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//select[@id='products-orderby']")).sendKeys("Position");
		Thread.sleep(5000);
		String DD1="Position";
        String DD1act=driver.findElement(By.xpath("//option[contains(text(),'Position')]")).getText();
        Assert.assertEquals(DD1act, DD1);
        System.out.println("Application allows user to sort Desktops by Position");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//select[@id='products-orderby']")).sendKeys("Name: A to Z");
		Thread.sleep(5000);
		String DD2="Name: A to Z";
        String DD2act=driver.findElement(By.xpath("//option[contains(text(),'Name: A to Z')]")).getText();
        Assert.assertEquals(DD2act, DD2);
        System.out.println("Application allows user to sort Desktops by Name: A to Z");
        
    	Thread.sleep(5000);
        driver.findElement(By.xpath("//select[@id='products-orderby']")).sendKeys("Name: Z to A");
		Thread.sleep(5000);
		String DD3="Name: Z to A";
        String DD3act=driver.findElement(By.xpath("//option[contains(text(),'Name: Z to A')]")).getText();
        Assert.assertEquals(DD3act, DD3);
        System.out.println("Application allows user to sort Desktops by Name: Z to A");
        
    	Thread.sleep(5000);
        driver.findElement(By.xpath("//select[@id='products-orderby']")).sendKeys("Price: Low to High");
		Thread.sleep(5000);
		String DD4="Price: Low to High";
        String DD4act=driver.findElement(By.xpath("//option[contains(text(),'Price: Low to High')]")).getText();
        Assert.assertEquals(DD4act, DD4);
        System.out.println("Application allows user to sort Desktops by Price: Low to High");
        
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//select[@id='products-orderby']")).sendKeys("Price: High to Low");
		Thread.sleep(5000);
		String DD5="Price: High to Low";
        String DD5act=driver.findElement(By.xpath("//option[contains(text(),'Price: High to Low')]")).getText();
        Assert.assertEquals(DD5act, DD5);
        System.out.println("Application allows user to sort Desktops by Price: High to Low");
       

	}
}
