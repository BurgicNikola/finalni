package home;

import java.util.UUID;

public class Kredencijali {

	public static final String NAME1 = "Pjer Zhon";
	public static final String EMAIL1 = Kredencijali.randomEmail();
	public static final String NAME2 = "Klod Dod";
	public static final String EMAIL2 = Kredencijali.randomEmail();
	public static final String PASS = "sifrabrate";
	public static final String LOGINEMAIL = "pjer06@pjer.com";
	
	public static String randomEmail() {
		return "didule" + UUID.randomUUID().toString() + "@gmail.com";
	}
}


