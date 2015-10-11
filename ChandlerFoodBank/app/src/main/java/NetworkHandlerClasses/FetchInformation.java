package NetworkHandlerClasses;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Aravind on 10/10/2015.
 */
public class FetchInformation extends AsyncTask<String,Void, String> {

    private final String LOG_TAG = FetchInformation.class.getSimpleName();

    @Override
    protected String doInBackground(String... strings) {

        if (strings.length == 0)
            return null;


        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;

        String forecastJsonStr = null;
        NetworkConnection networkConnection = new NetworkConnection();

        try {
            URL url = networkConnection.URLBuilder();

            Log.v(LOG_TAG, "Built URI " + url.toString());

            // Create the request and open the connection
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            // Read the input stream into a String
            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();
            if (inputStream == null) {
                // Nothing to do.
                return null;
            }
            reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line + "\n");
            }

            if (buffer.length() == 0) {
                // Stream was empty.  No point in parsing.
                return null;
            }
            forecastJsonStr = buffer.toString();
            int a = 1;

        } catch (IOException e) {
            Log.e("ForecastFragment", "Error ", e);
            return null;
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (final IOException e) {
                    Log.e("ForecastFragment", "Error closing stream", e);
                }
            }
        }
        try {
            return forecastJsonStr;
        } catch (Exception ex) {
            Log.e(LOG_TAG, ex.getMessage(), ex);
        }
        return null;
    }
}
