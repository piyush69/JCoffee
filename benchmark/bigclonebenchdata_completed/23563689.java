import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c23563689 {
public MyHelperClass Toast;
	public MyHelperClass OK;
	public MyHelperClass DataService;

//            @Override
            protected String doInBackground(Location... params) {
                if (params == null || params.length == 0 || params[0] == null) {
                    return null;
                }
                Location location = params[0];
                String address = "";
                MyHelperClass mContext = new MyHelperClass();
                String cachedAddress =(String)(Object) DataService.GetInstance(mContext).getAddressFormLocationCache(location.getLatitude(), location.getLongitude());
                MyHelperClass TextUtils = new MyHelperClass();
                if (!(Boolean)(Object)TextUtils.isEmpty(cachedAddress)) {
                    address = cachedAddress;
                } else {
                    StringBuilder jsonText = new StringBuilder();
                    HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
                    MyHelperClass GoogleMapAPITemplate = new MyHelperClass();
                    String url = String.format((String)(Object)GoogleMapAPITemplate, location.getLatitude(), location.getLongitude());
                    HttpGet httpGet = new HttpGet(url);
                    try {
                        HttpResponse response =(HttpResponse)(Object) client.execute(httpGet);
                        StatusLine statusLine =(StatusLine)(Object) response.getStatusLine();
                        int statusCode =(int)(Object) statusLine.getStatusCode();
                        if (statusCode == 200) {
                            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
                            InputStream content =(InputStream)(Object) entity.getContent();
                            BufferedReader reader = new BufferedReader(new InputStreamReader(content));
                            String line;
                            while ((line = reader.readLine()) != null) {
                                jsonText.append(line);
                            }
                            JSONObject result = new JSONObject(jsonText.toString());
                            MyHelperClass GoogleMapStatusSchema = new MyHelperClass();
                            String status =(String)(Object) result.getString(GoogleMapStatusSchema.status);
                            if (OK.equals(status)) {
//                                MyHelperClass GoogleMapStatusSchema = new MyHelperClass();
                                JSONArray addresses =(JSONArray)(Object) result.getJSONArray(GoogleMapStatusSchema.results);
                                if ((int)(Object)addresses.length() > 0) {
//                                    MyHelperClass GoogleMapStatusSchema = new MyHelperClass();
                                    address =(String)(Object) addresses.getJSONObject(0).getString(GoogleMapStatusSchema.formatted_address);
                                    MyHelperClass currentBestLocationAddress = new MyHelperClass();
                                    if (!(Boolean)(Object)TextUtils.isEmpty(currentBestLocationAddress)) {
//                                        MyHelperClass currentBestLocationAddress = new MyHelperClass();
                                        DataService.GetInstance(mContext).updateAddressToLocationCache(location.getLatitude(), location.getLongitude(), currentBestLocationAddress);
                                    }
                                }
                            }
                        } else {
                            MyHelperClass Log = new MyHelperClass();
                            Log.e("Error", "Failed to get address via google map API.");
                        }
                    } catch (UncheckedIOException e) {
                        e.printStackTrace();
//                        MyHelperClass mContext = new MyHelperClass();
                        Toast.makeText(mContext, "Failed to get location.", Toast.LENGTH_SHORT).show();
                    } catch (IOException e) {
//                        MyHelperClass mContext = new MyHelperClass();
                        Toast.makeText(mContext, "Failed to get location.", Toast.LENGTH_SHORT).show();
                    } catch (ArithmeticException e) {
//                        MyHelperClass mContext = new MyHelperClass();
                        Toast.makeText(mContext, "Failed to get location.", Toast.LENGTH_SHORT).show();
                    }
                }
                return address;
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass formatted_address;
	public MyHelperClass status;
	public MyHelperClass LENGTH_SHORT;
	public MyHelperClass results;
public MyHelperClass updateAddressToLocationCache(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass makeText(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass GetInstance(MyHelperClass o0){ return null; }
	public MyHelperClass getAddressFormLocationCache(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass show(){ return null; }
	public MyHelperClass isEmpty(MyHelperClass o0){ return null; }
	public MyHelperClass e(String o0, String o1){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }}

class Location {

public MyHelperClass getLongitude(){ return null; }
	public MyHelperClass getLatitude(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(){}
	HttpGet(String o0){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class StatusLine {

public MyHelperClass getStatusCode(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class JSONObject {

JSONObject(){}
	JSONObject(String o0){}
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass getJSONArray(MyHelperClass o0){ return null; }}

class JSONArray {

public MyHelperClass getJSONObject(int o0){ return null; }
	public MyHelperClass length(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}
