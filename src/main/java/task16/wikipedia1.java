package task16;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class wikipedia1 {

		public static void main(String args[])
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\project\\Task16\\src\\main\\java\\task16\\chromedriver.exe");
			// Instantiate a ChromeDriver class.
			WebDriver driver = new ChromeDriver();

			// Maximize the browser
			driver.manage().window().maximize();

			// Launch Website
			driver.get("https://www.wikipedia.org/");
			
			//page title
			System.out.println("Page title is : " + driver.getTitle()); 
			}
	}


