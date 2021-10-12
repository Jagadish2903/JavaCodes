package Webdriver_archit;

public class AppTest {

	static WebDriver driver;
	
	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();	
		//FirefoxDriver driver=new FirefoxDriver();
		//SafariDriver driver=new SafariDriver();
		
		
		String browser="firefox";
		
		
		//Top Casting
		
		if (browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if(browser.equals("Safari")){
			driver=new SafariDriver();
		}else {
			System.out.println("please launch correct browser");
		}
	
		
		
		driver.getTitle();
		driver.launchUrl("www.amazon.com");
		driver.getUrl();
		driver.findElement();
		driver.findElements();
		driver.sendKeys("Jaggu");
		driver.sendKeys("Jaggu@gmail");
		driver.click();
		driver.close();
	

	}

}
