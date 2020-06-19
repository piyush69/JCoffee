import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c12575599 {
public MyHelperClass cxt;
	public MyHelperClass string;
public MyHelperClass mensa;
	public MyHelperClass WeekPlan;
	public MyHelperClass VERSION;
	public MyHelperClass parseWeekplan(JSONObject o0){ return null; }
public MyHelperClass menues;
	public MyHelperClass valuability;
	public MyHelperClass getStringFromInputStream(InputStream o0){ return null; }

//    @Override
    public void processSource() {
        try {
            MyHelperClass weekNumber = new MyHelperClass();
            URL url = new URL((String)(Object)this.mensa.getJsonUrl(weekNumber));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            StringBuilder agentBuilder = new StringBuilder();
            MyHelperClass Build = new MyHelperClass();
            agentBuilder.append(cxt.getString(string.app_name)).append(' ').append(cxt.getString(string.app_version)).append('|').append(Build.DISPLAY).append('|').append(VERSION.RELEASE).append('|').append(Build.ID).append('|').append(Build.MODEL).append('|').append(Locale.getDefault().getLanguage()).append('-').append(Locale.getDefault().getCountry());
            connection.setRequestProperty("User-Agent", agentBuilder.toString());
            InputStream inStream = connection.getInputStream();
            String response =(String)(Object) getStringFromInputStream(inStream);
            JSONObject weekplanJsonObj = new JSONObject(response);
            this.menues = parseWeekplan(weekplanJsonObj);
            this.valuability = WeekPlan.VALUABLE;
        } catch (IOException ex) {
            this.valuability = WeekPlan.NOCON;
            this.menues = null;
        } catch (UncheckedIOException ex) {
            this.valuability = WeekPlan.ERROR;
            this.menues = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
	public MyHelperClass RELEASE;
	public MyHelperClass app_name;
	public MyHelperClass MODEL;
	public MyHelperClass NOCON;
	public MyHelperClass ID;
	public MyHelperClass app_version;
	public MyHelperClass DISPLAY;
	public MyHelperClass VALUABLE;
public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass getJsonUrl(MyHelperClass o0){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}
