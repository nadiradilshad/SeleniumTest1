package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

	public static void main(String[] args) {
		
		WebDriver driver= Base.getDriver();
		
		
		//go to website
		
		driver.get("https://www.amazon.in/");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		// mobile search
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Mobile");
		
		driver.findElement(By.cssSelector("input[value=\"Go\"]")).click();
		
		//find first phone
	WebElement element=	driver.findElement(By.xpath("//span[@class='textContainer__text' or id='pdagDesktopSparkleHeadline']"));
	
	String find_first_mobile = element.getText();
	
	System.out.println(find_first_mobile);
	
	// close the window
	driver.close();
	
	}

	
}
