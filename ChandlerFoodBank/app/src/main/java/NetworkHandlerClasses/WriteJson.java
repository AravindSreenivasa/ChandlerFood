package NetworkHandlerClasses;

import org.json.JSONException;
import org.json.JSONObject;

import DetailsClass.Account;
import DetailsClass.Event;
import DetailsClass.Help;
import DetailsClass.Job;
import DetailsClass.Program;

/**
 * Created by Aravind on 10/10/2015.
 */
public class WriteJson {

    public JSONObject writeAccountJSON(Account account) {
        JSONObject object = new JSONObject();
        try {
            object.put("userid", account.getUsername());
            object.put("password", account.getPassword());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return object;
    }

    public JSONObject writeEventJSON(Event event) {
        JSONObject object = new JSONObject();
        try {
            object.put("name", event.getName());
            object.put("time", event.getTime());
            object.put("date", event.getDate());
            object.put("contact", event.getContact());
            object.put("details", event.getDetails());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return object;
    }

    public JSONObject writeProgramsJSON(Program program) {
        JSONObject object = new JSONObject();
        try {
            object.put("name", program.getName());
            object.put("details", program.getDetails());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return object;
    }

    public JSONObject writeHelpJSON(Help program) {
        JSONObject object = new JSONObject();
        try {
            object.put("name", program.getName());
            object.put("details", program.getDetails());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return object;
    }

    public JSONObject writeJobsJSON(Job job) {
        JSONObject object = new JSONObject();
        try {
            object.put("name", job.getName());
            object.put("company", job.getCompany());
            object.put("contact", job.getContact());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return object;
    }
}
