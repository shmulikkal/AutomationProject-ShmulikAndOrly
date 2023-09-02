package automation;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;


public class project4_Orly_Shmulik {
//	 private Map<String, Object> vars;
//	 vars = new HashMap<String, Object>();
	 
	public static void main(String[] args) throws InterruptedException {
		
/** This is Java Project. It's divided to the following sections:
 * 1) creating the WebDriver & opening the WebDriver
 * 2) Yahoo's Mail page - Log in
 * 3) Navigating: News' page
 * 4) {for Shmulik to fill out}
 *  
 *  ffDriver = FireFoxe; chDriver = Chrome
 */
		// 1) Creating & opening the WebDriver: FireFox (Second Driver: Chrome)
		WebDriver ffdriver = null;	
		System.out.println("Starting Driver Now");
		System.setProperty("webdriver.gecko.driver", "c:\\Selenium\\geckodriver.exe");
		ffdriver = new FirefoxDriver();
		ffdriver.manage().window().maximize();		
		ffdriver.get("https://www.yahoo.com/");
		Thread.sleep(1000);
		
		int count = 0;
		 int expectedLinks = 73;
		 List<WebElement> link = ffdriver.findElements(By.tagName("a"));
		 System.out.println(link.size()); // this will print the number of links in a page.
		 count =  link.size();
		 
		 if(count==expectedLinks){
			 System.out.println("Number of links in the News page are correct " + count );
		 }else
		 {
			 System.out.println("Number of links  in the News page are incorrect " + count + " vs "+expectedLinks);
		 }
		 
		
		/*WebDriver chDriver = null;
		System.setProperty("webdriver.chrome.driver", "c:\\Selenium\\chromedriver.exe");
		chDriver = new ChromeDriver();
		chDriver.manage().window().maximize();		
		chDriver.get("https://www.yahoo.com");
		Thread.sleep(1000);
		int count = 0;
		 int expectedLinks = 73;
		 List<WebElement> link = ffdriver.findElements(By.tagName("a"));
		 System.out.println(link.size()); // this will print the number of links in a page.
		 count =  link.size();
		 
		 if(count==expectedLinks){
			 System.out.println("Number of links in the News page are correct " + count );
		 }else
		 {
			 System.out.println("Number of links  in the News page are incorrect " + count + " vs "+expectedLinks);
		 }
		*/
		
		 
		 
		 
		 
		 
		 
		/*2) Yahoo's Mail page - Log in
			UserName: orly.turner
			Password: 1234Qwerty5678
		*/
		
		ffdriver.findElement(By.id("root_1")).click();
		System.out.println("Moving on to purple page");
		Thread.sleep(4000);
	//	ffdriver.findElement(By.id("login-username")).click(); //If repeatedly skipping purple page, don't use this line
		ffdriver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		ffdriver.findElement(By.id("login-username")).sendKeys("orly.turner");
		System.out.println("Typing UserName");
		ffdriver.findElement(By.ByXPath.cssSelector("label:nth-child(2)")).click();
	    Thread.sleep(4000);
	    ffdriver.findElement(By.name("signin")).click();
	    Thread.sleep(3000);
	    ffdriver.findElement(By.id("login-passwd")).click();
	    ffdriver.findElement(By.id("login-passwd")).sendKeys("1234Qwerty5678");
	    System.out.println("Typing Password");
	    System.out.println("LINK START!");
	    Thread.sleep(3000);
	    ffdriver.findElement(By.id("login-signin")).click();
	    Thread.sleep(5000);
	    ffdriver.findElement(By.cssSelector(".C4_Z29WjXl:nth-child(1)")).click();
	    ffdriver.findElement(By.cssSelector(".G_e:nth-child(2) .X_6Eb4")).click();
		
	    /*chDriver.findElement(By.id("root_1")).click();
		System.out.println("Moving on to purple page");
		Thread.sleep(3000);
	//	chDriver.findElement(By.id("login-username")).click(); If repeatedly skipping purple page, don't use this line
		chDriver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		chDriver.findElement(By.id("login-username")).sendKeys("orly.turner");
		System.out.println("Typing UserName");
	    Thread.sleep(3000);
	    chDriver.findElement(By.name("signin")).click();
	    Thread.sleep(3000);
	    chDriver.findElement(By.id("login-passwd")).click();
	    chDriver.findElement(By.id("login-passwd")).sendKeys("1234Qwerty5678");
	    System.out.println("Typing Password");
	    System.out.println("LINK START!");
	    Thread.sleep(3000);
	    chDriver.findElement(By.id("login-signin")).click();
	    Thread.sleep(5000);
	     */
		
		
		
		//3) Navigating: News' page (from inbox)
			
		System.out.println("Lets go to the NEWS page");	
	    ffdriver.findElement(By.linkText("NEWS")).click();
	    Thread.sleep(4000); 
	    //going to search bar
	    ffdriver.findElement(By.id("ybar-sbq")).click(); //try new recording
	    ffdriver.findElement(By.id("ybar-sbq")).sendKeys("football");
	    ffdriver.findElement(By.id("ybar-search")).click();	
	    }
}
	    
	    
	    
	 /*WebDriver vars;
		//   vars.put("win5590", waitForWindow(2000));
	 //   ffdriver.switchTo().window(vars.get("win5590").toString());
	 //   js.executeScript("window.scrollTo(0,159)");
	 //   ffdriver.findElement(By.cssSelector(".Start\\(a\\)")).click();
	 //   Thread.sleep(3000);
	//    js.executeScript("window.scrollTo(0,103)");
	//    js.executeScript("window.scrollTo(0,918)");
	    ffdriver.findElement(By.cssSelector("p:nth-child(8) > .link > em")).click();
	    ffdriver.findElement(By.cssSelector(".caas-lightbox")).click();
	    ffdriver.findElement(By.cssSelector(".wafer-lightbox-close:nth-child(2)")).click();
	//    js.executeScript("window.scrollTo(0,2062)");
		
	}

	    */