package com.travel.Travelagency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravelagencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelagencyApplication.class, args);
		Travelpackage object = new Travelpackage("Indiatour", new String[]{"srinagar", "manali"}, new String[]{"Srinagar-gulmarg-pahalgam","Srinagar-gulmarg-pahalgam-sonamarg"}, new String[]{"Excursion to Sonamarg & Yusmarg\nOptional houseboat stay in Srinaga,Houseboat at Dal Lake\nDay Trip to Sonamarg-Gulmarg-Pahalgam", "Excursion to Solang Valley\nvan Vihar and Hot spring Water,Day Trip to Rohtang Pass & Solang Valley from Manali\nexcursion to Kufri, Mashobra, Naldehra, Rohtang Pass"}, new long[]{30000 - 28999, 12999 - 17999}, new int[]{25, 23});
		passengerslist object1=new passengerslist("Indiatour",20,18, new String[]{"karthi","deva"}, new String[]{"gold","premium"}, new int[]{12,14});
	   passenger object2=new passenger(new String[]{"karthi", "deva"}, new String[]{"gold", "premium"}, new int[]{12, 14}, new long[]{2000, 5000}, new String[]{"Srinagar-gulmarg-pahalgam","Manali-Kullu"}, new String[]{"srinagar", "manali"}, new long[]{30000, 12999});

object.Traveldetails();
object1.Totalpassengers();
object2.eachpassenger();



	}

}
