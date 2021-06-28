package selPract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {
	
	public static void main(String[] args) {
		
	  System.setProperty("webdriver.Chrome.driver", "chromedriver.exe"); // Even without this line able to launch browser. 
		WebDriver cd=new ChromeDriver();
		cd.get("https://www.google.com");
		System.out.println(cd.getTitle());
		cd.close();
		/*
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe"); // Even without this line able to launch browser.
		WebDriver fd=new FirefoxDriver();
		fd.get("https://www.google.com");
		System.out.println(fd.getTitle());
		fd.close();
	
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe"); // Even without this line able to launch browser.
		WebDriver id=new InternetExplorerDriver();
		id.get("https://www.google.com");
		System.out.println(id.getTitle());
		id.close();
		*/
	}
	
	public void OpenIE() {
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe"); // Even without this line able to launch browser.
		WebDriver id=new InternetExplorerDriver();
		id.get("https://www.google.com");
		System.out.println(id.getTitle());
		id.close();
		
	}
	

}
