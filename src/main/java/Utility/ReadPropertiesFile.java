package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	private File file;
	private FileInputStream finstream;
	private Properties prop;
	private String url;
	private String yopmail_url;
	private String username;
	private String password;
	private String firstname;
	private String newUserPassword;
	private String yopmailAddress;
	private String picmakerHomePageTitle;

	public ReadPropertiesFile() {
		try {
			file =new File("./src/test/resources/EnvironmentVariables.properties");
			finstream=new FileInputStream(file);
		}
		catch(FileNotFoundException exception) {
			System.out.println(exception.getMessage());	
		}
		prop=new Properties();
		try {
			
			prop.load(finstream);

		}
		catch(IOException e) {
			System.out.println(e.getMessage());	
		}

		//prop.clear();
		try {
			finstream.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		


	}
	public String getURL(String environment)	{
		
		

		if(environment.equalsIgnoreCase("Dev")) {
			url=prop.getProperty("Dev");
		}
		else if(environment.equalsIgnoreCase("Snbx")) {
			url=prop.getProperty("Snbx");
		}
		else if(environment.equalsIgnoreCase("Prod")) {
			url=prop.getProperty("Production");
		}

		return url;


	}
	public String getYopmailURL()	{

		yopmail_url=prop.getProperty("yopmail_url");

		return yopmail_url;


	}
	public String getUsername()	{

		username=prop.getProperty("emailAddress");

		return username;


	}
	public String getPassword()	{

		password=prop.getProperty("password");

		return password;


	}
	
	public String getFirstName()	{

		firstname=prop.getProperty("FirstName");

		return firstname;


	}
	
	public String getYopmailAddress()	{

		yopmailAddress=prop.getProperty("yopmail_id");

		return yopmailAddress;


	}
	
	public String getNewUserPassword()	{

		newUserPassword=prop.getProperty("NewPassword");

		return newUserPassword;


	}
	
	public String getPicmakerHomePageTitle()	{

		picmakerHomePageTitle=prop.getProperty("Picmaker_Dashboard");

		return picmakerHomePageTitle;


	}

	
	
	
}
