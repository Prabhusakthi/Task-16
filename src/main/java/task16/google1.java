package task16;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class google1 {
	    public static void main(String[] args) {
	        // Set the path to the GeckoDriver executable
	        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\project\\Task16\\src\\main\\java\\task16\\geckodriver.exe");

	        // Create an instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();

	       driver.get("https:google.com/");
	       
	       driver.manage().window().maximize();
	       
	       driver.close();
	        
	    }
	}


