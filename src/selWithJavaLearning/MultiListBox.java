package selWithJavaLearning;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiListBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
//		Dimension d=new Dimension(800,100);
//		driver.manage().window().setSize(d);
		driver.switchTo().frame("iframeResult");
		WebElement ele=driver.findElement(By.id("cars"));
		Select opts=new Select(ele);
		opts.selectByIndex(0);
		opts.selectByValue("saab");
		opts.selectByVisibleText("Audi");
		driver.findElement(By.xpath("/html/body/form/input")).click();
		Thread.sleep(5000);
		String selCars=driver.findElement(By.xpath("/html/body/div[1]")).getText();
		System.out.println("Selected Cars="+selCars);
		String[] cars=selCars.split("&");
		for(String x:cars)
			System.out.println(x);
		
		driver.quit();
		
	}

}
