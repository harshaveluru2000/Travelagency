package com.travel.Travelagency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class passengerslist extends passenger{
    private String Travelpackagename;
    private int passengercapacity,noofpassengerenrolled;

    public passengerslist(String Travelpackagename, int passengercapacity, int noofpassengerenrolled,String []passengername,String []passengersubscription,int []passengernumber) {
        super( passengername,passengersubscription,passengernumber);
        this.Travelpackagename = Travelpackagename;
        this.passengercapacity = passengercapacity;
        this.noofpassengerenrolled = noofpassengerenrolled;
    }
    public void Totalpassengers() {
        System.out.println("2.Travelpackagename:" + Travelpackagename + " passengercapacity:" + passengercapacity  + " noofpassengerenrolled:" + noofpassengerenrolled);
        for (int i=0;i<passengername.length;i++) {
            System.out.println("passengername:" + passengername[i] + " passengernumber:" + passengernumber[i]);
        }

    }
}
