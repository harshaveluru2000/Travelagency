package com.travel.Travelagency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class activities {
    @Autowired
    private Travelpackage Travelpackage;

    public String actvityname[]=new String[10];
    public String activitydescription[]=new String[10];
    public long activitycost[]=new long[10];
    public int activitycapacity[]=new int[10];

    public activities(String[] actvityname, String[] activitydescription, long[] activitycost, int[] activitycapacity) {
        this.actvityname = actvityname;
        this.activitydescription = activitydescription;
        this.activitycost = activitycost;
        this.activitycapacity = activitycapacity;
    }
   /* public void activities1(){
         String activityname1[]= Travelpackage.actvityname;
      if ()
    }*/

   }


