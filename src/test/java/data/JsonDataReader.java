package data;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader {
	
	//Declaring data aramters
	public String firstName, lastName , password , days,months,  years, firstNameAddress, lastNameAddress, company, address, state, postCode, city ,country, phoneNumber, aliasAddress, emailAddressExtention, userName; 

	//This method defines json data reader and getting data values from json file
	public void JsonReader() throws IOException, ParseException 
	{
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/UserData.json";

		File srcFile = new File(filePath); 

		JSONParser parser = new JSONParser(); 
		JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile)); 

		for(Object jsonObj : jarray) 
		{
			JSONObject person = (JSONObject) jsonObj ;
			
			firstName  = (String) person.get("firstName"); 
			System.out.println(firstName);

			lastName = (String) person.get("lastname"); 
			System.out.println(lastName);

			password = (String) person.get("password"); 
			System.out.println(password);

			days = (String) person.get("days"); 
			System.out.println(days);

			months  = (String) person.get("months"); 
			System.out.println(months);

			years = (String) person.get("years"); 
			System.out.println(years);

			firstNameAddress = (String) person.get("firstNameAddress"); 
			System.out.println(firstNameAddress);

			lastNameAddress = (String) person.get("lastNameAddress"); 
			System.out.println(lastNameAddress);
			
			company  = (String) person.get("company"); 
			System.out.println(company);

			address = (String) person.get("address"); 
			System.out.println(address);

			city = (String) person.get("city"); 
			System.out.println(city);
			
			state = (String) person.get("state"); 
			System.out.println(state);

			postCode = (String) person.get("postCode"); 
			System.out.println(postCode);
			
			country  = (String) person.get("country"); 
			System.out.println(country);

			phoneNumber = (String) person.get("phoneNumber"); 
			System.out.println(phoneNumber);

			aliasAddress = (String) person.get("aliasAddress"); 
			System.out.println(state);

			emailAddressExtention = (String) person.get("emailAddressExtention"); 
			System.out.println(emailAddressExtention);
			
			userName = (String) person.get("userName"); 
			System.out.println(userName);
		}

	}

}
