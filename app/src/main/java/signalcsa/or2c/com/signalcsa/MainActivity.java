package signalcsa.or2c.com.signalcsa;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

//import com.google.api.client.auth.oauth2.Credential;
/*import com.google.api.client.auth.oauth2.Credential;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;

//import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.extensions.appengine.auth.oauth2.AppIdentityCredential;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;*/


import com.google.api.services.sheets.v4.model.ValueRange;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

//import signalcsa.or2c.com.signalcsa.ui.csasignal.core.ImageLoader;
//import signalcsa.or2c.com.signalcsa.ui.csasignal.core.ImageLoaderConfiguration;

public class MainActivity extends AppCompatActivity {

    final Gson gson = new GsonBuilder().serializeNulls().create();

    String action;
    String type;
    Intent intent;

    /** Global instance of the HTTP transport. */
    //private static HttpTransport httpTransport = AndroidHttp.newCompatibleTransport();
    /** Global instance of the JSON factory. */
    //private static final JsonFactory jsonFactory = JacksonFactory.getDefaultInstance();

    /**
     * Global instance of the scopes required by this quickstart.
     * If modifying these scopes, delete your previously saved tokens/ folder.
     */
    /*private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "tokens";
    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
    private static final String CREDENTIALS_FILE_PATH = "credentials.json";*/

    /**
     * Creates an authorized Credential object.
     *  HTTP_TRANSPORT The network HTTP Transport.
     *  in
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
   /* private static Credential getCredentials(final HttpTransport HTTP_TRANSPORT, InputStream in) throws IOException {
        // Load client secrets.
        //InputStream in = MainActivity.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        //InputStream in =  getAssets().open(CREDENTIALS_FILE_PATH);
        if (in == null) {
            throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
        }
        //GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        GoogleClientSecrets.Details web = new GoogleClientSecrets.Details();
        web.setClientId("36943710640-797n7bs2caamncnhm1aj8i6hbicbm6nn.apps.googleusercontent.com");
        web.setClientSecret("AIzaSyDes-EZDyFxmT878vk70_XOs4sfm9VjLr8");

        GoogleClientSecrets clientSecrets = new GoogleClientSecrets();

        clientSecrets.setWeb(web);

        // Build flow and trigger user authorization request.
        /*GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                //.setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");*/
        //return new  GoogleCredential().setAccessToken("AIzaSyDes-EZDyFxmT878vk70_XOs4sfm9VjLr8");
       /* return new AppIdentityCredential(
                Collections.singletonList());
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                //Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
                Intent intent = new Intent(getApplicationContext(), CsaSignal.class);
                startActivity(intent);
            }
        });*/

        ImageLoader instance = ImageLoader.getInstance();
        if (!instance.isInited()) {
            instance.init(ImageLoaderConfiguration.createDefault(this));
        }


        // Google Accounts
        /*GoogleAccountCredential credential = GoogleAccountCredential.usingOAuth2(this, Collections.singleton(TasksScopes.TASKS));
        SharedPreferences settings = getPreferences(Context.MODE_PRIVATE);
        credential.setSelectedAccountName(settings.getString(PREF_ACCOUNT_NAME, null));
        // Tasks client
        Tasks service = new Tasks.Builder(httpTransport, jsonFactory, credential)
                .setApplicationName("Google-TasksAndroidSample/1.0").build();*/




        /*GoogleAccountCredential mCredential = GoogleAccountCredential.usingOAuth2(
                getApplicationContext(), Arrays.asList(String.valueOf(new List[]{SCOPES})))
                .setBackOff(new ExponentialBackOff());*/




        /*final NetHttpTransport HTTP_TRANSPORT;
        try {
           // HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        InputStream in =  getAssets().open(CREDENTIALS_FILE_PATH);

        final String spreadsheetId = "1a4NJWlxvOrbrwBc57_M1TOdWGj6XpXoIPbNBjtK5Z0A";
        final String range = "Class Data!A:H";
        Sheets service = new Sheets.Builder(httpTransport, JSON_FACTORY, getCredentials(httpTransport,in))
                .setApplicationName(APPLICATION_NAME)
                .build();

            ValueRange response = service.spreadsheets().values()
                    .get(spreadsheetId, range)
                    .execute();

        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }*/


         intent = getIntent();
         action = intent.getAction();
         type = intent.getType();


            new RetrieveFeedTask().execute();




    }

    void handleSendText(String data) {
        String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);
        String id = intent.getStringExtra(Intent.EXTRA_REFERRER);
        if (sharedText != null && id!=null) {
            // Update UI to reflect text being shared

            Intent _intent = new Intent(this, WebViewActivity.class);
            _intent.putExtra("viewid",id);
            _intent.putExtra("data",data);

            //intent.putExtra(Intent.EXTRA_TEXT,"");
            this.startActivity(_intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    class RetrieveFeedTask extends AsyncTask<String, Void, Void> {

        private Exception exception;

        protected Void doInBackground(String... urls) {
            try {
                //InputStream in =  getAssets().open(CREDENTIALS_FILE_PATH);

                final String spreadsheetId = "1a4NJWlxvOrbrwBc57_M1TOdWGj6XpXoIPbNBjtK5Z0A";
                final String range = "Class Data!A:H";
                /*Sheets service = new Sheets.Builder(httpTransport, JSON_FACTORY, getCredentials(httpTransport,in))
                        .setApplicationName(APPLICATION_NAME)
                        .build();

                ValueRange response = service.spreadsheets().values()
                        .get(spreadsheetId, range)
                        .execute();*/

                String data = getData();

                if (Intent.ACTION_SEND.equals(action) && type != null) {
                    if ("text/plain".equals(type)) {
                        handleSendText(data); // Handle text being sent
                    }
                }else {
                   //ValueRange result = gson.fromJson(data,ValueRange.class);
                    Intent intent = new Intent(getApplicationContext(), CsaSignal.class);
                    intent.putExtra("data",data);
                    startActivity(intent);
                }

                int i =0;
            } catch (Exception e) {
                this.exception = e;

                return null;
            }
            return null;
        }

        protected void onPostExecute() {
            // TODO: check this.exception
            // TODO: do something with the feed
        }
    }

    private String getData() throws IOException {
        /**
         * pggination
         * https://sheets.googleapis.com/v4/spreadsheets/1a4NJWlxvOrbrwBc57_M1TOdWGj6XpXoIPbNBjtK5Z0A/values/A2:H3?key=AIzaSyDes-EZDyFxmT878vk70_XOs4sfm9VjLr8
         */
        //URL url = new URL("https://sheets.googleapis.com/v4/spreadsheets/1a4NJWlxvOrbrwBc57_M1TOdWGj6XpXoIPbNBjtK5Z0A/values/A:H?key=AIzaSyDes-EZDyFxmT878vk70_XOs4sfm9VjLr8");
        URL url = new URL("https://sheets.googleapis.com/v4/spreadsheets/1pMz-u3tp1RGop8eq673z6r7VhACJOI1AWyQnYRi_uUw/values/A:H?key=AIzaSyAB0HCsHFcyNlkcSqucY9IDLbf0Brb2wEY");

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            return readStream(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            urlConnection.disconnect();
        }
        return null;
    }

    private String getData(String id) throws IOException {
        /**
         * pggination
         * https://sheets.googleapis.com/v4/spreadsheets/1a4NJWlxvOrbrwBc57_M1TOdWGj6XpXoIPbNBjtK5Z0A/values/A2:H3?key=AIzaSyDes-EZDyFxmT878vk70_XOs4sfm9VjLr8
         */
        URL url = new URL("https://sheets.googleapis.com/v4/spreadsheets/1pMz-u3tp1RGop8eq673z6r7VhACJOI1AWyQnYRi_uUw/values/A"+id+":H"+id+"?key=AIzaSyAB0HCsHFcyNlkcSqucY9IDLbf0Brb2wEY");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            return readStream(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            urlConnection.disconnect();
        }
        return null;
    }

    private String readStream(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader r = new BufferedReader(new InputStreamReader(is),1000);
        for (String line = r.readLine(); line != null; line =r.readLine()){
            sb.append(line);
        }
        is.close();
        return sb.toString();
    }

}
