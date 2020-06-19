import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1775942 {
public MyHelperClass processXML(MyHelperClass o0){ return null; }
public MyHelperClass GET_PARAM_UNIT_PREFIX;
	public MyHelperClass context;
	public MyHelperClass string;
	public MyHelperClass Context;
	public MyHelperClass GET_PARAM_ACODE_PREFIX;
	public MyHelperClass GET_PARAM_ACODE;
	public MyHelperClass GET_PARAM_CITY_CODE_PREFIX;
	public MyHelperClass PreferenceManager;

//    @Override
    public void run()  throws Throwable {
        HttpGet httpGet = null;
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            MyHelperClass DataModel = new MyHelperClass();
            DataModel model =(DataModel)(Object) DataModel.getInstance();
            MyHelperClass citiesToBeUpdated = new MyHelperClass();
            for (City city :(City[])(Object) (Object[])(Object)citiesToBeUpdated) {
                String preferredUnitType =(String)(Object) PreferenceManager.getDefaultSharedPreferences(context).getString(context.getString(string.settings_units_key), context.getString(string.settings_units_default_value));
                MyHelperClass GET_PARAM_ZIP_PREFIX = new MyHelperClass();
                String codePrefix =(boolean)(Object) city.getCountryName().startsWith("United States") ? GET_PARAM_ZIP_PREFIX : GET_PARAM_CITY_CODE_PREFIX;
                MyHelperClass GET_URL = new MyHelperClass();
                String requestUri = new String(GET_URL + "?" + GET_PARAM_ACODE_PREFIX + "=" + GET_PARAM_ACODE + "&" + codePrefix + "=" + city.getId() + "&" + GET_PARAM_UNIT_PREFIX + "=" + preferredUnitType);
                httpGet = new HttpGet(requestUri);
                HttpResponse response =(HttpResponse)(Object) httpClient.execute(httpGet);
                MyHelperClass HttpStatus = new MyHelperClass();
                if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                    processXML(response.getEntity().getContent());
                    MyHelperClass forecast = new MyHelperClass();
                    for (ForecastedDay day :(ForecastedDay[])(Object) (Object[])(Object)forecast) {
                        int pos =(int)(Object) day.getImageURL().lastIndexOf('/');
                        if (pos < 0 || pos + 1 == (int)(Object)day.getImageURL().length()) throw new Exception("Invalid image URL");
                        final String imageFilename =(String)(Object) day.getImageURL().substring(pos + 1);
                        MyHelperClass ForecastedDay = new MyHelperClass();
                        File downloadDir =(File)(Object) context.getDir(ForecastedDay.DOWNLOAD_DIR, Context.MODE_PRIVATE);
                        File[] imagesFilteredByName = downloadDir.listFiles(new FilenameFilter() {

//                            @Override
                            public boolean accept(File dir, String filename) {
                                if (filename.equals(imageFilename)) return true; else return false;
                            }
                        });
                        if (imagesFilteredByName.length == 0) {
                            httpGet = new HttpGet((String)(Object)day.getImageURL());
                            response =(HttpResponse)(Object) httpClient.execute(httpGet);
//                            MyHelperClass HttpStatus = new MyHelperClass();
                            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                                BufferedOutputStream bus = null;
                                try {
                                    bus = new BufferedOutputStream(new FileOutputStream(downloadDir.getAbsolutePath() + "/" + imageFilename));
                                    response.getEntity().writeTo(bus);
                                } finally {
                                    bus.close();
                                }
                            }
                        }
                    }
//                    MyHelperClass forecast = new MyHelperClass();
                    city.setDays(forecast);
                    city.setLastUpdated(Calendar.getInstance().getTime());
                    model.saveCity(city);
                }
            }
        } catch (Exception e) {
            httpGet.abort();
            e.printStackTrace();
        } finally {
            MyHelperClass handler = new MyHelperClass();
            handler.sendEmptyMessage(1);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass DOWNLOAD_DIR;
	public MyHelperClass settings_units_default_value;
	public MyHelperClass MODE_PRIVATE;
	public MyHelperClass settings_units_key;
public MyHelperClass getDir(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass writeTo(BufferedOutputStream o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass getString(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass lastIndexOf(char o0){ return null; }
	public MyHelperClass sendEmptyMessage(int o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getDefaultSharedPreferences(MyHelperClass o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass abort(){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DataModel {

public MyHelperClass saveCity(City o0){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class City {

public MyHelperClass getCountryName(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass setLastUpdated(Date o0){ return null; }
	public MyHelperClass setDays(MyHelperClass o0){ return null; }}

class ForecastedDay {

public MyHelperClass getImageURL(){ return null; }}
