package day1.jsonexamples;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Example1 {

	@Test
	public void testJsonObject() {
		
		JSONObject obj1=new JSONObject();
		obj1.put("firstName", "Kaushal");
		obj1.put("LastName", "Mehta");
		obj1.put("Email", "abc@gmail.com");
		System.out.println("JSON object value: "+obj1);
		System.out.println(obj1.get("firstName"));
	}
	
	@Test
	public void testJsonArray() {
		
		JSONObject emp1=new JSONObject();
		emp1.put("firstName", "Kaushal");
		emp1.put("LastName", "Mehta");
		emp1.put("Email", "abc@gmail.com");
		System.out.println("JSON object emp1 value: \n"+emp1);
	
		JSONObject emp2=new JSONObject();
		emp2.put("firstName", "Amar");
		emp2.put("LastName", "Kedar");
		emp2.put("Email", "xyz@gmail.com");
		System.out.println("JSON object emp2 value: \n"+emp2);
		
		JSONObject empDetails1=new JSONObject();
		empDetails1.put("employee", emp1);
		System.out.println("empDetails1: \n"+empDetails1);
		
		JSONObject empDetails2=new JSONObject();
		empDetails2.put("employee", emp2);
		System.out.println("empDetails2: \n"+empDetails2);
		
		JSONArray empList=new JSONArray();
		empList.add(empDetails1);
		empList.add(empDetails2);
		
		System.out.println("JSON Array values: \n\n\n"+empList);
	}
	@Test
	public void testJsonArrayInFile() {
		
		JSONObject emp1=new JSONObject();
		emp1.put("firstName", "Kaushal");
		emp1.put("LastName", "Mehta");
		emp1.put("Email", "abc@gmail.com");
		System.out.println("JSON object emp1 value: \n"+emp1);
	
		JSONObject emp2=new JSONObject();
		emp2.put("firstName", "Amar");
		emp2.put("LastName", "Kedar");
		emp2.put("Email", "xyz@gmail.com");
		System.out.println("JSON object emp2 value: \n"+emp2);
		
		JSONObject empDetails1=new JSONObject();
		empDetails1.put("employee", emp1);
		System.out.println("empDetails1: \n"+empDetails1);
		
		JSONObject empDetails2=new JSONObject();
		empDetails2.put("employee", emp2);
		System.out.println("empDetails2: \n"+empDetails2);
		
		JSONArray empList=new JSONArray();
		empList.add(empDetails1);
		empList.add(empDetails2);
		
		System.out.println("JSON Array values: \n\n\n"+empList);
		
		try {
			FileWriter file=new FileWriter(".\\src\\test\\resources\\testData\\employee.json");
			//storing JSON Array into file in the form of JSONSTring
			file.write(empList.toJSONString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON File is created.......");
	}
}
