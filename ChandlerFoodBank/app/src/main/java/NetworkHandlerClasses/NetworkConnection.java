package NetworkHandlerClasses;

import android.net.Uri;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Aravind on 10/10/2015.
 */
public class NetworkConnection {
    public URL URLBuilder(){
        final String FORECAST_BASE_URL =
                "http://api.openweathermap.org/data/2.5/forecast/daily?";
        //final String QUERY_PARAM = "q";

//            Uri builtUri = Uri.parse(FORECAST_BASE_URL).buildUpon()
//                    .appendQueryParameter(QUERY_PARAM, strings[0])
//                    .build();

        Uri builtUri = Uri.parse(FORECAST_BASE_URL).buildUpon().build();
        URL url = null;
        try {
            url = new URL(builtUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }
}
