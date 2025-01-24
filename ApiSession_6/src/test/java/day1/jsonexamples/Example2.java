package day1.jsonexamples;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.testng.annotations.Test;

public class Example2 {
  @Test
  public void testMapWithJSON() {
	  Map emp1=new HashMap();
		emp1.put("firstName", "Kaushal");
		emp1.put("LastName", "Mehta");
		emp1.put("Email", "abc@gmail.com");
		System.out.println("MAP object emp1 value: \n"+emp1);
		//converting MAP into JSON String
		String jsonString=JSONValue.toJSONString(emp1);
		System.out.println("MAP after convertion into JSON String:\n\n "+jsonString);
  }
  
  @Test
  public void stringIntoJSONObject() {
	  String str="{\"firstName\":\"Kaushal\",\"Email\":\"abc@gmail.com\",\"LastName\":\"Mehta\"}";
	  
	  //converting String into Object
	  Object obj=JSONValue.parse(str);
	  //Converting Object into JSONObject
	  JSONObject jsonObj=(JSONObject)obj;
	  System.out.println("JSON Object is: "+jsonObj);
	  
	  System.out.println("FirstName is: "+jsonObj.get("firstName"));
  }
}
