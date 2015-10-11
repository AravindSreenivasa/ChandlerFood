package DetailsClass;

/**
 * Created by Aravind on 10/10/2015.
 */
public class Account {
    private long id;
    private String username;
    private String password;
    private Boolean signedIn;

    public long getId(){
        return id;
    }

    public void setId(long id1){
        id = id1;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String r){
        username = r;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String r){
        password = r;
    }

    public void setSignedIn(Boolean r){
        signedIn = r;
    }

    public Boolean getSignedIn(){
        return signedIn;
    }
}
