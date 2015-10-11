package DetailsClass;

/**
 * Created by Aravind on 10/10/2015.
 */
public class Job {
    private long id;
    private String Name;
    private String company;
    private String contact;

    public long getId(){
        return id;
    }

    public void setId(long id1){
        id = id1;
    }

    public String getName(){
        return Name;
    }

    public void setName(String r){
        Name = r;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(String r){
        company = r;
    }

    public void setContact(String r){
        contact = r;
    }

    public String getContact(){
        return contact;
    }
}
