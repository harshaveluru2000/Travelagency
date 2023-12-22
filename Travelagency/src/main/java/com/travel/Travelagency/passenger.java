package com.travel.Travelagency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class   passenger {

    public String passengername []=new String[10];
    public String []passengersubscription=new String[10];
    public int []passengernumber = new int[10];
    public long []balance=new long[10];
    public String actvityname[]=new String[10];
    public String []destination=new String[10];
    public long activitycost[]=new long[10];

    public passenger(String[] passengername, String[] passengersubscription, int[] passengernumber) {
        this.passengername = passengername;
        this.passengersubscription = passengersubscription;
        this.passengernumber = passengernumber;
    }

    public void  eachpassenger() {
        for (int i=0;i<passengername.length;i++) {
            System.out.println("3.passengername:" + passengername[i] + " passengernumber:" + passengernumber[i] );
        }
        for (int i=0;i<destination.length;i++){
            System.out.println("destination:" + destination[i]);
        }
for (int i=0;i<actvityname.length;i++){
    System.out.println("activityname:"+actvityname[i]+ " activitycost:" + activitycost[i]);
}
    }
}
