package test;
  
    import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	 
	public class Amazon {
	 
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
	     //   driver.findElement(By.name("q")).sendKeys("India");
	      //  driver.findElement(By.xpath(input[@class='gN089b']);
		}
	 
	}
	