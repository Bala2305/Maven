package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class DataReader {
	
	
	public static Properties p;
	
	public DataReader() throws Throwable {
		
		File f = new File("C:\\Users\\murug\\adactinproject\\MavenProjectForTesting\\src\\main\\java\\com\\properties\\TestData.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
		
		
	}
	
	
	public String getPropURL() {

		
		String propURL = p.getProperty("url");
		
		return propURL;
		
	}
	
public String getPropID() {

		
		String propID = p.getProperty("id");
		
		return propID;
		
	}
	
public String getPropPWD() {

	
	String propPWD = p.getProperty("pass");
	
	return propPWD;
	
}

public String getProplocation() {

	
	String proplocation = p.getProperty("country");
	
	return proplocation;
	
}

public String getPropHotel() {

	
	String propHotel = p.getProperty("hotel");
	
	return propHotel;
	
}

public String getPropRT() {

	
	String propRT = p.getProperty("roomtype");
	
	return propRT;
	
}

public String getPropNOR() {

	
	String propNOR = p.getProperty("noofroom");
	
	return propNOR;
	
}

public String getPropCI() {

	
	String propCI = p.getProperty("checkin");
	
	return propCI;
	
}

public String getPropCO() {

	
	String propCO = p.getProperty("checkout");
	
	return propCO;
	
}

public String getPropAdults() {

	
	String propAdults = p.getProperty("adults");
	
	return propAdults;
	
}

public String getPropChild() {

	
	String propChild = p.getProperty("child");
	
	return propChild;
	
}

}
