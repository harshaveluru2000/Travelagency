package com.travel.Travelagency;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public  class Travelpackage extends activities {
    public String Travelpackagename;
    public String[] destination=new String[10];
    public  Travelpackage(String Travelpackagename, String[] destination,String[] activityname,String[] activitydescription,long[] activitycost,int[] activitycapacity) {

        super(activityname, activitydescription, activitycost, activitycapacity);

        this.Travelpackagename = Travelpackagename;
        this.destination = destination;
    }
    public void Traveldetails() {
         System.out.println("The output is \n"+"1. Travelpackagename:" + Travelpackagename);
        for (int i=0;i<destination.length;i++){
            System.out.println("destination:" + destination[i]);
        }
        for (int i=0;i<actvityname.length;i++){
            System.out.println("activityname:"+actvityname[i]+ " ,activitydescription:" + activitydescription[i] + " ,activitycost:" + activitycost[i] + " ,activitycapacity:" + activitycapacity[i]);
        }
    }
}













