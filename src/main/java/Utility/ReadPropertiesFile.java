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
	private String picmakerAppTitle;
	private String categoryName;
	private String text;
	private String projectName;
	private String preBuiltID;
	private String title;
	private String subTitle;
	private String bodyText;




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

	public String getPicmakerApptitle()	{

		picmakerAppTitle=prop.getProperty("Picmaker_App");

		return picmakerAppTitle;


	}



	public String getCategoryName() {

		categoryName=prop.getProperty("CategoryName");

		return categoryName;


	}


	public String getBigTextValue() {

		text=prop.getProperty("BigText");
		System.out.println(text);

		return text;

	}


	public String getTitle() {

		title=prop.getProperty("Title");

		return title;

	}

	public String getsubTitle() {

		subTitle=prop.getProperty("SubTitle");

		return subTitle;

	}

	public String getbodyText() {

		bodyText=prop.getProperty("BodyText");

		return bodyText;

	}


	public String getProjectName() {

		projectName=prop.getProperty("Name");

		return projectName;

	}

	public String getPrebuiltID() {

		preBuiltID=prop.getProperty("PrebuiltID");

		return preBuiltID;

	}



}
