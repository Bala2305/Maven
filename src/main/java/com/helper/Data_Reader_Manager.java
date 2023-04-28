package com.helper;

public class Data_Reader_Manager {

	
	private Data_Reader_Manager() {
		
		
	}
	
	
	public static Data_Reader_Manager getInstanceDRM() {

		Data_Reader_Manager drm = new Data_Reader_Manager();	
		
		return drm;
	
	
	}
	
	
	public DataReader getInstanceDR() throws Throwable {

		
		DataReader dr = new DataReader();
		
		return dr;
		
	
		
	}
	
}
