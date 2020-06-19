import java.io.*;
import java.lang.*;
import java.util.*;



class c12024124 {
public MyHelperClass client;
	public MyHelperClass logger;
	public MyHelperClass getLocation(JSONObject o0){ return null; }

    public boolean pollLocation(int device) {
        MyHelperClass numDevices = new MyHelperClass();
        if (device < (int)(Object)numDevices) {
            try {
                MyHelperClass post = new MyHelperClass();
                HttpResponse response =(HttpResponse)(Object) client.execute(post);
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)response.getEntity().getContent(), "UTF-8"));
                MyHelperClass JSONValue = new MyHelperClass();
                JSONObject object = (JSONObject)(JSONObject)(Object) JSONValue.parse(reader);
                JSONArray array = ((JSONArray)(JSONArray)(Object) object.get("content"));
                object = (JSONObject)(JSONObject)(Object) array.get(device);
                IPhoneLocation iPhoneLocation =(IPhoneLocation)(Object) getLocation(object);
                if (iPhoneLocation != null) {
                    MyHelperClass iPhoneRouteList = new MyHelperClass();
                    iPhoneRouteList.get(device).addLocation(iPhoneLocation);
                }
            } catch (UncheckedIOException ex) {
                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.SEVERE,(Object)(Object) null,(IOException)(Object) ex);
                return false;
            } catch (IOException ex) {
                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.SEVERE, null, ex);
                return false;
            }
        } else {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.WARNING, "Device {0} is out of range ({1} max)", new Object[] { (device + 1), numDevices });
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
	public MyHelperClass SEVERE;
public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass addLocation(IPhoneLocation o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, ClientProtocolException o2){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass parse(BufferedReader o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Object[] o2){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class JSONObject {

public MyHelperClass get(String o0){ return null; }}

class JSONArray {

public MyHelperClass get(int o0){ return null; }}

class IPhoneLocation {

}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}
