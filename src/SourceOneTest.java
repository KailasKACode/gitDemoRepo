import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SourceOneTest {	
	
	@Test
	public void validateTheBooking() {
		WebDriver driver=new ChromeDriver();;	
		driver.get("https://www.ixigo.com");

	}
}
