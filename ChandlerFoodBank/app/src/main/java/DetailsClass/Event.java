package DetailsClass;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Aravind on 10/10/2015.
 */
public class Event {
    private long id;
    private String name;
    private String details;
    private String date;
    private String time;
    private String contact;

    public long getId(){
        return id;
    }

    public void setId(long id1){
        id = id1;
    }

    public String getName(){
        return name;
    }

    public void setName(String r){
        name = r;
    }

    public void setDetails(String r){
        details = r;
    }
    public String getDetails(){
        return details;
    }
    public void setDate(String r){
        date = r;
    }
    public String getDate(){
        return date;
    }

    public void setTime(String r){
        time = r;
    }
    public String getTime(){
        return time;
    }
    public void setContact(String r){
        contact = r;
    }
    public String getContact(){
        return contact;
    }



}
