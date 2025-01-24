package day1.jsonexamples;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class Example3 {
  @Test
  public void readJsonFileData() throws IOException, ParseException {
	  //create an object of FileReader to provide JSON file location
	  FileReader fr=new FileReader(".\\src\\test\\resources\\testData\\person.json");
	  //Create an instance of JSONParser to parse the content of JSON file into Object class
	  JSONParser jp=new JSONParser();
	  //using JSONParser converting JSON file content into Object class
	  Object obj=jp.parse(fr);
	  //convert Object class object into JSONOBject
	  JSONObject ref=(JSONObject)obj;
	  
	  System.out.println(ref.get("firstName"));
	  System.out.println(ref.get("LastName"));
	  System.out.println(ref.get("Email"));
  }
}
