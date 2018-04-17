package com.example.hema.grubmate2.DataClass;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by tianhangliu on 10/12/17.
 */

public class Post implements Serializable {
    public Integer postID;
    public Integer posterID;
    public String posterName;
    public String title;

    public String[] postPhotos;
     public String category;
    // pos 0 start time, pos 1 end time
    public String[] timePeriod;
    public String description;
     public ArrayList<Integer> requestsIDs;
    public Boolean isActive;
     public static final String[] allergyNames = new String[]{"Milk", "Egg", "Fish"};
}
