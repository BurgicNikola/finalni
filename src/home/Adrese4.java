package home;

import java.util.UUID;
import java.util.Random; 


public class Adrese4 {

	public static final String DOWNAROW_XPATH = "//*[@id=\"wrap_us_menu\"]/i";
	public static final String PROFILE_XPATH = "//*[@id=\"userm\"]/div/a[1]";
	public static final String EDITDETAILS_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String ADDRESS_XPATH = "//*[@id=\"address\"]";
	public static final String ADDRESS_STRING = randomBrojUlice();
	public static final String ZIP_XPATH = "//*[@id=\"zip\"]";
	public static final String ZIP_STRING = randomZip();
	public static final String SAVE_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[42]/td/input";
	
	
	public static String random() {
		return "ulica " + UUID.randomUUID().toString();
	}
	
	public static String randomBrojUlice() {
		Random rand = new Random(); 
		  
        int rand_int1 = rand.nextInt(1000); 
        
        return ("Ulica "+rand_int1); 
	}
	
	public static String randomZip() {
		Random rand = new Random(); 
		  
        int rand_int1 = rand.nextInt(1000); 
        
        return ("zip "+rand_int1); 
	}
	
}