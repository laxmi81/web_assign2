package com.user.info;
import java.io.FileReader;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class user_info {
	JSONParser parser = new JSONParser();
	
	@Test(priority=1) 
public void user_name() throws Throwable, Exception, ParseException 
{
		//find user name
	
			Object obj = parser.parse(new FileReader("C:\\Users\\urajp\\eclipse-workspace\\WebService_assign2\\src\\test\\java\\com\\user\\info\\data.json"));
    System.out.println("-----------------find user name-------------------------");
			// A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
			@SuppressWarnings("unused")
			JSONObject jsonObject = (JSONObject) obj;
 
			// A JSON array. JSONObject supports java.util.List interface.
			
			JSONObject user = (JSONObject) obj; 
			String username = (String) user.get("username");
			System.out.println("User Name= "+username);
			
	
}
	@Test(priority=2) 
	public void session_id()
	{
		//find all session id
		try {
			Object obj = parser.parse(new FileReader("C:\\Users\\urajp\\eclipse-workspace\\WebService_assign2\\src\\test\\java\\com\\user\\info\\data.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray session_id = (JSONArray) jsonObject.get("sessionid");
			System.out.println("------------------------find all session id------------------");
			@SuppressWarnings("unchecked")
			Iterator<JSONObject> iterator = session_id.iterator();
			while (iterator.hasNext()) {
				System.out.println("session id = "+iterator.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public void last_session()
	{
		//find last session id
				try {
					Object obj = parser.parse(new FileReader("C:\\Users\\urajp\\eclipse-workspace\\WebService_assign2\\src\\test\\java\\com\\user\\info\\data.json"));
					JSONObject jsonObject = (JSONObject) obj;
					JSONArray session_id = (JSONArray) jsonObject.get("sessionid");
					int s=session_id.size()-1;
					System.out.println("total sessions = "+s+1);
					System.out.println("----------------------find last session id---------------------------");
					int c=0;
					@SuppressWarnings("unchecked")
					Iterator<JSONObject> iterator = session_id.iterator();
					
					while (iterator.hasNext()) {
						iterator.next();
						c++;
						if(c==s)
						{
							System.out.println("last session id = "+iterator.next());
						}
						
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}
	@Test(priority=4)
	public void marks_student()
	{
		//find all marks of second student
				try {
					
					ObjectMapper mapper = new ObjectMapper();
					Object obj = parser.parse(new FileReader("C:\\Users\\urajp\\eclipse-workspace\\WebService_assign2\\src\\test\\java\\com\\user\\info\\data.json"));
					JSONObject jsonObject = (JSONObject) obj;
					JSONArray students = (JSONArray) jsonObject.get("students");
					Student stud_2 = mapper.readValue(students.get(1).toString(), Student.class);
					System.out.println("second student marks = "+stud_2.getMarks());
					int s=students.size();
					System.out.println("---------------------find all marks of second student--------------------");
					System.out.println("total student = "+s);
					
                  
				}
				 catch (Exception e) {
					e.printStackTrace();
				}
	}
	@Test(priority=5)
	public void ssecond_state_value_student()
	{
		//find second state value of first student
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			Object obj = parser.parse(new FileReader("C:\\Users\\urajp\\eclipse-workspace\\WebService_assign2\\src\\test\\java\\com\\user\\info\\data.json"));
			JSONObject jsonObject = (JSONObject) obj;
			System.out.println("---------------------------find second state value of first student------------------");
			JSONArray students = (JSONArray) jsonObject.get("students");
			Student stud_2 = mapper.readValue(students.get(0).toString(), Student.class);
			System.out.println("second state value of first student = "+stud_2.getAdresss().get(1).getState().toString());
				
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void second_contact_student()
	{
		//Find the ssecond contact value of second student
try {
			
			ObjectMapper mapper = new ObjectMapper();
			Object obj = parser.parse(new FileReader("C:\\Users\\urajp\\eclipse-workspace\\WebService_assign2\\src\\test\\java\\com\\user\\info\\data.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray students = (JSONArray) jsonObject.get("students");
			System.out.println("-------------------------Find the ssecond contact value of second student------------------");
			Student stud_2 = mapper.readValue(students.get(1).toString(), Student.class);
			System.out.println("second student contact value  = "+stud_2.getContact().toString());
				
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	public void second_student_city()
	{
		//Find all cities of second student
try {
			
			ObjectMapper mapper = new ObjectMapper();
			Object obj = parser.parse(new FileReader("C:\\Users\\urajp\\eclipse-workspace\\WebService_assign2\\src\\test\\java\\com\\user\\info\\data.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray students = (JSONArray) jsonObject.get("students");
			Student stud_2 = mapper.readValue(students.get(1).toString(), Student.class);
			System.out.println("----------------Find all cities of second student--------------");
			System.out.println("city1 = "+stud_2.getAdresss().get(0).getCity());
			System.out.println("city2 = "+ stud_2.getAdresss().get(1).getCity());
			
			
			//System.out.println("second student, all city  = "+stud_2.getAdresss().toString());
				
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
@Test(priority=8)
public void contact_all_student()
{
	//Find contacts of all students
try {
		
		ObjectMapper mapper = new ObjectMapper();
		Object obj = parser.parse(new FileReader("C:\\Users\\urajp\\eclipse-workspace\\WebService_assign2\\src\\test\\java\\com\\user\\info\\data.json"));
		JSONObject jsonObject = (JSONObject) obj;
		System.out.println("---------------------Find contacts of all students---------------------");
		JSONArray students = (JSONArray) jsonObject.get("students");
          if(students!=null)
          {
        	  
        	  Student stud = mapper.readValue(students.get(0).toString(), Student.class);
        	  System.out.println("contact of student 1= "+stud.getContact().toString());
        	  Student stud1 = mapper.readValue(students.get(1).toString(), Student.class);
        	  System.out.println("contact of student 2= "+stud1.getContact().toString());
          }
		
		
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}

@Test(priority=9)
public void address_1_student()
{
	//Find adress of first student
try {
		
		ObjectMapper mapper = new ObjectMapper();
		Object obj = parser.parse(new FileReader("C:\\Users\\urajp\\eclipse-workspace\\WebService_assign2\\src\\test\\java\\com\\user\\info\\data.json"));
		JSONObject jsonObject = (JSONObject) obj;
		System.out.println("-----Find adress of first student------------");
		JSONArray students = (JSONArray) jsonObject.get("students");
          if(students!=null)
          {
        	  
        	  Student stud = mapper.readValue(students.get(0).toString(), Student.class);
        	 
        	  
        	  System.out.println("1 student address 1 state 1= "+stud.getAdresss().get(0).getState().toString());
        	  System.out.println("1 student address 1 city 1= "+stud.getAdresss().get(0).getCity().toString());
        	  System.out.println("1 student address 1 state 2= "+stud.getAdresss().get(1).getState().toString());
        	  System.out.println("1 student address 1 city 2= "+stud.getAdresss().get(1).getCity().toString());
        	 // System.out.println("1 student address 1= "+stud.getAdresss().get(1).toString());
          }
		
		
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}
@Test(priority=10)
public void userId_7_check()
{
	//Check if response has " userId": "7"
	// Pass the test and display the title of that userId
	System.out.println("Check if response has  userId: 7and Pass the test and display the title of that userId");
	String post_sHostname="https://jsonplaceholder.typicode.com";
    String post_URI="/posts";
    String post_URL=post_sHostname+post_URI;
    
    RestAssured.baseURI=post_URL;
    
   Response res= RestAssured.given().contentType("application/json").get();
    
  // System.out.println("response= "+res.asString());
   
   Root1[] rt=res.as(Root1[].class);
   System.out.println("length of = "+rt.length);
   for (Root1 id: rt) {

       if (id.userId==7) {
         System.out.println("pass");
       	  System.out.println("Title = "+id.title.toString());
       	  break;
       }
   }	
   
   
     
}
   
}