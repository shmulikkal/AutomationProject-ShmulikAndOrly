package automation;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainUnit {
	private Map<String, Object> vars;
	js = (JavascriptExecutor) driver;
	//vars = new HashMap<String, Object>();
	public static void main(String[] args) throws InterruptedException {
		 
		 
		
		WebDriver chdriver = null; // need to import WebDriver
		System.out.println("Starting Driver");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); //set the path to the Chrome
		chdriver = new ChromeDriver (); // need to import ChromeDriver
		chdriver.manage().window().maximize();
		
		//chdriver.get("https://www.google.com");

		//mail_login page
		chdriver.get("https://www.yahoo.com/");
	    chdriver.findElement(By.id("root_1")).click();
	    Thread.sleep(6000);
	    chdriver.findElement(By.id("login-username")).click();
	    Thread.sleep(5000);
	    chdriver.findElement(By.id("login-username")).sendKeys("orly.turner");
	    Thread.sleep(3000);
	    chdriver.findElement(By.id("login-signin")).click();
	    Thread.sleep(2000);
	    chdriver.findElement(By.id("login-passwd")).click();
	    Thread.sleep(3000);
	    chdriver.findElement(By.id("login-passwd")).click();
	    chdriver.findElement(By.id("login-passwd")).sendKeys("1234Qwerty5678");
	    chdriver.findElement(By.id("login-signin")).click();
	    Thread.sleep(3000);
	    chdriver.findElement(By.cssSelector(".P_dRA > .D_F")).click();
	    chdriver.findElement(By.linkText("חבר")).click();
	    Thread.sleep(2000);
	    chdriver.findElement(By.cssSelector(".H_6UbO")).click();
	    chdriver.findElement(By.cssSelector(".P_1EudUu")).click();
	    Thread.sleep(2000);
	    chdriver.findElement(By.id("message-to-field")).sendKeys("grer");
	    chdriver.findElement(By.cssSelector(".D_Z1YJkyX > .c27KHO0_n > .D_F")).click();
	    
	    //News page 
	    chdriver.get("https://www.yahoo.com/");
	    chdriver.manage().window().setSize(new Dimension(1296, 768));
	    chdriver.findElement(By.id("root_2")).click();
	    chdriver.findElement(By.cssSelector(".Start\\(a\\)")).click();
	    js.executeScript("window.scrollTo(0,1200)");
	    js.executeScript("window.scrollTo(0,1400)");
	    vars.put("window_handles", chdriver.getWindowHandles());
	    chdriver.findElement(By.linkText("Sign up for The Morning newsletter from the New York Times")).click();
	    vars.put("win6144", waitForWindow(2000));
	    vars.put("root", chdriver.getWindowHandle());
	    chdriver.switchTo().window(vars.get("win6144").toString());
	    chdriver.findElement(By.cssSelector(".css-1fzhd9j")).click();
	    chdriver.switchTo().window(vars.get("root").toString());
	    chdriver.findElement(By.cssSelector(".\\_yb_fdbgo")).click();
	    
	   
	    
	}

}
