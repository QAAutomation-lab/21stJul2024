package propertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Example2 {

	public static void main(String[] args) throws IOException {
		/*
		 * Absolute Path: starting root till target element
		 * 	example: "F:\Workplaces\CoreJava_Workspace\21stJulCoreJavaSession\TestData\AppData.properties"
		 * 
		 * Relative path: starting from the middle
		 * 	example: ".\TestData\AppData.properties"
		 * 			where: '.' indicates current working directory
		 * 	String currentDir=System.getProperty("user.dir");
		 * 	String filePath=currentDir+"\TestData\AppData.properties"
		 */
		String fileLocattion=".\\TestData\\AppData.properties";
		
		FileInputStream fis=new FileInputStream(fileLocattion);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("contact"));
		System.out.println(prop.getProperty("emailId"));
	}

}
/**
First find the location where you have stored property file
Create an instance of FileInputStream class and pass the property file location to its constructor.
Create an instance of Properties class
With the help of properties reference variable call load() properties class and pass
FileInputStream class reference to this method
Call getProperty(key) of Properties class to read data from property file
*/