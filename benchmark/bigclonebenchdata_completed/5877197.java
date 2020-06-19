
import java.io.UncheckedIOException;


class c5877197 {
public MyHelperClass DataBaseQuery;

    public List getAllMosquaisFromDataBase() {
        List mosquais =(List)(Object) new ArrayList();
        InputStream is = null;
        String result = "";
        ArrayList nameValuePairs = new ArrayList();
        MyHelperClass MyMapActivity = new MyHelperClass();
        if ((boolean)(Object)MyMapActivity.DEVELOPER_MODE) {
            MyHelperClass Param = new MyHelperClass();
            nameValuePairs.add(new BasicNameValuePair(Param.LATITUDE, MyMapActivity.mLatitude + ""));
//            MyHelperClass Param = new MyHelperClass();
            nameValuePairs.add(new BasicNameValuePair(Param.LONGITUDE, MyMapActivity.mLongitude + ""));
        } else {
            MyHelperClass Param = new MyHelperClass();
            nameValuePairs.add(new BasicNameValuePair(Param.LATITUDE, MyMapActivity.myLocation.getLatitude() + ""));
//            MyHelperClass Param = new MyHelperClass();
            nameValuePairs.add(new BasicNameValuePair(Param.LONGITUDE, MyMapActivity.myLocation.getLongitude() + ""));
        }
        MyHelperClass Param = new MyHelperClass();
        nameValuePairs.add(new BasicNameValuePair(Param.RAYON,(int)(Object) DataBaseQuery.rayon * (int)(Object)Param.KM_MARGE + ""));
        try {
            HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
//            MyHelperClass Param = new MyHelperClass();
            HttpPost httppost = new HttpPost(Param.URI_SELECT_ALL_DATA_BASE);
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(httppost);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            is =(InputStream)(Object) entity.getContent();
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("log_tag", "Error in http connection " + e.toString());
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "iso-8859-1"), 8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line =(String)(Object) reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            result = sb.toString();
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("log_tag", "Error converting result " + e.toString());
        }
        try {
            JSONArray jArray = new JSONArray(result);
            for (int i = 0; i < (int)(Object)jArray.length(); i++) {
                JSONObject json_data =(JSONObject)(Object) jArray.getJSONObject(i);
//                MyHelperClass Param = new MyHelperClass();
                Mosque mosquai = new Mosque(json_data.getInt(Param.ID), json_data.getString(Param.NOM), json_data.getDouble(Param.LATITUDE), json_data.getDouble(Param.LONGITUDE), json_data.getString(Param.INFO),(int)(Object) json_data.getInt(Param.HAVE_PICTURE) == 1 ? true : false, json_data.getString(Param.PICTURE));
                mosquais.add(mosquai);
            }
        } catch (UncheckedIOException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("log_tag", "Error parsing data " + e.toString());
        }
        return mosquais;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass rayon;
	public MyHelperClass DEVELOPER_MODE;
	public MyHelperClass HAVE_PICTURE;
	public MyHelperClass RAYON;
	public MyHelperClass mLongitude;
	public MyHelperClass KM_MARGE;
	public MyHelperClass NOM;
	public MyHelperClass ID;
	public MyHelperClass LONGITUDE;
	public MyHelperClass URI_SELECT_ALL_DATA_BASE;
	public MyHelperClass PICTURE;
	public MyHelperClass INFO;
	public MyHelperClass LATITUDE;
	public MyHelperClass myLocation;
	public MyHelperClass mLatitude;
public MyHelperClass e(String o0, String o1){ return null; }
	public MyHelperClass getLatitude(){ return null; }
	public MyHelperClass getLongitude(){ return null; }}

class List {

public MyHelperClass add(Mosque o0){ return null; }}

class Mosque {

Mosque(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4, boolean o5, MyHelperClass o6){}
	Mosque(){}}

class ArrayList {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(MyHelperClass o0, String o1){}}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(ArrayList o0){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class BufferedReader {

BufferedReader(InputStreamReader o0, int o1){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class JSONArray {

JSONArray(String o0){}
	JSONArray(){}
	public MyHelperClass length(){ return null; }
	public MyHelperClass getJSONObject(int o0){ return null; }}

class JSONObject {

public MyHelperClass getDouble(MyHelperClass o0){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass getInt(MyHelperClass o0){ return null; }}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}
