import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Loc {

	public static void main(String[] args) {
		
		WebDriver driver;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("adityabahirat12@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.linkText("Forgotten password?")).click();
		
	
		

	}

}
