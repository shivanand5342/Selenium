package selPract;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {



public static void main(String[] args) throws IOException {

// TODO Auto-generated method stub



Properties prop=new Properties();

FileInputStream fis =new FileInputStream("F:\\Shiva\\AutomationPro\\Selenium\\src\\selPract\\data.Properties");

prop.load(fis);//to put Properties file into read mode

System.out.println(prop.getProperty("browser"));

System.out.println(prop.getProperty("url"));

//prop.setProperty("browser", "firefox");

//System.out.println(prop.getProperty("browser"));

//FileOutputStream fos =new FileOutputStream("F:\\Shiva\\AutomationPro\\Selenium\\src\\selPract\\data.Properties");

//prop.store(fos, null);//to write the data into properties file


}



}
