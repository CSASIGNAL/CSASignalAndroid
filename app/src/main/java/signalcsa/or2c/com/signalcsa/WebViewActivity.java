package signalcsa.or2c.com.signalcsa;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.google.api.services.sheets.v4.model.ValueRange;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.apache.commons.lang3.StringEscapeUtils;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    final Gson gson = new GsonBuilder().serializeNulls().create();

    private static String SETTING_KEY_NAME="SETTING_KEY_NAME";
    private static String SETTING_KEY_PRENOM="SETTING_KEY_PRENOM";
    private static String SETTING_KEY_MAIL="SETTING_KEY_MAIL";
    private static String SETTING_KEY_PHONE="SETTING_KEY_PHONE";

    @SuppressLint("JavascriptInterface")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        String dataStr = getIntent().getStringExtra("data");
          ValueRange result = gson.fromJson(dataStr,ValueRange.class);
         int i = getIntent().getIntExtra("viewid",0);

         i++;

        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);

        final String tvOrRadio = (String) result.getValues().get(i).get(1);
        final String channel = (String) result.getValues().get(i).get(2);
        final String emmision = (String) result.getValues().get(i).get(3);
        final String lettre = (String) result.getValues().get(i).get(7);
        final String date = (String) result.getValues().get(i).get(4);
        final String hour = (String) result.getValues().get(i).get(5);
        final String reason = (String) result.getValues().get(i).get(6);

        final String[] dateArray = date.split("/");
        final String[] hourArray = hour.split(":");

        final String isTv;
        if(tvOrRadio.equals("TV")) {
            isTv = "0";
        }
        else
        {
            if(tvOrRadio.equals("RADIO")) {
                isTv = "1";
            }
            else {
                isTv = "2";
            }
        }

        /*final CustomButton valid = new CustomButton(getApplicationContext());
        valid.setOnClickListener(new View.OnClickListener() {
            @JavascriptInterface
            @Override
            public void onClick(View v) {
                  String sn= valid.firstname;
                Log.v("TAG", "index=" +sn);
            }
        });*/


        final String name = getData(SETTING_KEY_NAME);
        final String prenom = getData(SETTING_KEY_PRENOM);
        final String mail = getData(SETTING_KEY_MAIL);
        final String phone = getData(SETTING_KEY_PHONE);



        WebSettings ws = webView.getSettings();
        ws.setJavaScriptEnabled(true);
        // Add the interface to record javascript events
//        webView.addJavascriptInterface(valid, "valid");
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
               /* webView.loadUrl(
                        "javascript:(function() { " +
                                "let element = document.getElementById('form_type_personne');" +
                                "element.value = '1';"+
                                "var element = document.getElementById('hplogo');"
                                + "element.parentNode.removeChild(element);" +
                                "})()");*/
               webView.evaluateJavascript("let element = document.getElementById('form_type_personne');" +
                       "element.value = '1';" +
                       "let textsView = document.getElementsByClassName('ui-selectmenu-text');" +
                       "document.getElementsByClassName('ui-selectmenu-text')[0].innerText=element.options[element.selectedIndex].text;" +
                       "personneSelect();" +
                       "var el = document.querySelector(\"input[name='ContentObjectAttribute_data_option_value_639295'][value='"+isTv+"']\");" +
                       "el.checked=true;" +
                       "serviceSelect(el);" +
                       "document.getElementById('form_nom_service_tv').value='"+channel+"';" +
                       "document.getElementById('form_nom_emission').value='"+emmision+"';" +
                       "document.getElementById('date_day').value='"+dateArray[0]+"';" +
                       "document.getElementById('date_month').value='"+dateArray[1]+"';" +
                       "document.getElementById('date_year').value='"+dateArray[2]+"';" +
                       "document.getElementById('time_hour').value='"+hourArray[0]+"';" +
                       "document.getElementById('time_minute').value='"+hourArray[1]+"';" +
                       "afficheblocSaisine();" +
                       "var el = document.querySelector(\"input[name='ContentObjectAttribute_data_option_value_639300'][value='"+reason+"']\");" +
                       "el.checked=true;" +
                       "document.getElementById('form_motif_saisine').value='"+StringEscapeUtils.escapeHtml4(lettre)+"';" +
                       //"var p = document.querySelector(\"input[name='ContentObjectAttribute_data_boolean_639306']\");" +
                       "var p = document.querySelector(\"input[name='ActionCollectInformation']\");" +
                       "p.onclick = function() { " +
                       // "valid.firstname=document.getElementById('form_nom').value; " +
                       /*"var name=document.getElementById('form_nom').value;" +
                       "var prenom=document.getElementById('form_prenom').value;" +
                       "var mail=document.getElementById('form_email').value;" +
                       "var phone=document.getElementById('form_telephone').value;" +*/
                       "Android.sendata(document.getElementById('form_nom').value,document.getElementById('form_prenom').value,document.getElementById('form_email').value,document.getElementById('form_telephone').value);" +
                       //"valid.performClick();" +
                       "};" +
                       "document.getElementById('form_nom').value='"+name+"';" +
                       "document.getElementById('form_prenom').value='"+prenom+"';" +
                       "document.getElementById('form_email').value='"+mail+"';" +
                       "document.getElementById('form_telephone').value='"+phone+"';" +
                       //"var cdg = document.querySelector(\"input[name='ContentObjectAttribute_data_boolean_639306']\");" +
                       //"cdg.checked=true;" +

                       //"textsView[0].html='hello'"+

                       "", new ValueCallback<String>() {
                           @Override
                           public void onReceiveValue(String s) {

                           }
                       }
               );


                //webView.scrollBy(0,3000);
            }
        });

        //webView.addJavascriptInterface(valid, "valid");
        webView.addJavascriptInterface(new WebAppInterface(this), "Android");
        webView.loadUrl("https://www.csa.fr/Mes-services/Alertez-nous-sur-un-programme2");
        //webView.setBackgroundColor(Color.BLUE);
    }


    /*public class CustomButton extends android.support.v7.widget.AppCompatButton {
        public String firstname;
        public String lastname;
        public String mail;
        public String phoneNumber;

        public CustomButton(Context context) {
            super(context);
        }
    }*/



    public class WebAppInterface {
        Context mContext;

        /** Instantiate the interface and set the context */
        WebAppInterface(Context c) {
            mContext = c;
        }

        @JavascriptInterface   // must be added for API 17 or higher
        public void sendata(String firstname,String lastname,String email, String phone) {
            Toast.makeText(mContext, firstname +" "+ lastname+" "+email+" "+phone, Toast.LENGTH_SHORT).show();
            savedata(SETTING_KEY_PRENOM,firstname);
            savedata(SETTING_KEY_NAME,lastname);
            savedata(SETTING_KEY_MAIL,email);
            savedata(SETTING_KEY_PHONE,phone);
        }
    }


    private void savedata( String key, String value) {
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(key, value);
        editor.commit();
    }

    private String getData(String key) {
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        return sharedPref.getString(key,"");
    }



}
