package SelenuimSessions;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesFile {
	
	public static void main(String[] args) {//add the main method
		readPropertiesFile();
		
	}
	public static void readPropertiesFile() { 
		
		Properties prop = new Properties();
		try {
			InputStream input = new FileInputStream("/Users/ksv/Desktop/SeleniumWS/JavaTraining/Selenuimlearning/src/SelenuimSessions/BasicRead.propreties");
			prop.load(input);//in this line  we get an error so below in place of Filenotfound exception give generic one i.e EXCEPTION
			System.out.println(prop.getProperty("browser"));
			
			
		} catch (Exception e ) {
			
			e.printStackTrace();
		}
		
	}

}
