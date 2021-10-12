package Webdriver_archit;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver() {
		System.out.println("Launching Chrome ");
	}

	@Override
	public void findElement() {
		System.out.println("---Find Element");
		
	}

	@Override
	public void findElements() {
		System.out.println("---Find Elements");
		
	}

	@Override
	public String getTitle() {
		return "Title of the page" ;
	}

	@Override
	public void launchUrl(String url) {
		System.out.println("launching URL"+" "+url);
		
	}

	@Override
	public String getUrl() {
		return "www.amazon.com";
	}

	@Override
	public void click() {
		System.out.println("click the element");
		
	}
    
	@Override
	public void sendKeys(String value) {
		System.out.println("entering the value .."+value);
		
	}
	
		
	

	@Override
	public void close() {
		System.out.println("Browser is closed");
		
	}

	

	
	
	
}
