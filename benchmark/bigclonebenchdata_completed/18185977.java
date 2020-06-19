import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c18185977 {
public MyHelperClass setListAdapter(ArrayAdapter o0){ return null; }
public MyHelperClass setContentView(MyHelperClass o0){ return null; }
public MyHelperClass layout;
public MyHelperClass dm;
	public MyHelperClass Log;

//    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.onCreate(savedInstanceState);
        setContentView(layout.listview);
        MyHelperClass SERVICE_URI = new MyHelperClass();
        HttpGet request = new HttpGet(SERVICE_URI + "/json/getroutes/1");
        request.setHeader("Accept", "application/json");
        request.setHeader("Content-type", "application/json");
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String theString = new String("");
        try {
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(request);
            HttpEntity responseEntity =(HttpEntity)(Object) response.getEntity();
            InputStream stream =(InputStream)(Object) responseEntity.getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            Vector<String> vectorOfStrings = new Vector<String>();
            String tempString = new String();
            String tempStringAgent = new String();
            String tempStringClient = new String();
            String tempStringRoute = new String();
            String tempStringZone = new String();
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            stream.close();
            theString = builder.toString();
            JSONObject json = new JSONObject(theString);
            MyHelperClass Log = new MyHelperClass();
            Log.i("_GetClient_", "<jsonobject> \n " + json.toString() + " \n </jsonobject>");
            this.dm =(MyHelperClass)(Object) new DataManipulator(this);
            JSONArray nameArray =(JSONArray)(Object) json.getJSONArray("GetRoutesByAgentResult");
            for (int i = 0; i < (int)(Object)nameArray.length(); i++) {
                tempStringAgent =(String)(Object) nameArray.getJSONObject(i).getString("Agent");
                tempStringClient =(String)(Object) nameArray.getJSONObject(i).getString("Client");
                tempStringRoute =(String)(Object) nameArray.getJSONObject(i).getString("Route");
                tempStringZone =(String)(Object) nameArray.getJSONObject(i).getString("Zone");
                Log.i("_GetClient_", "<Agent" + i + ">" + tempStringAgent + "</Agent" + i + ">\n");
                Log.i("_GetClient_", "<Client" + i + ">" + tempStringClient + "</Client" + i + ">\n");
                Log.i("_GetClient_", "<Route" + i + ">" + tempStringRoute + "</Route" + i + ">\n");
                Log.i("_GetClient_", "<Zone" + i + ">" + tempStringZone + "</Zone" + i + ">\n");
                this.dm.insertIntoClients(tempStringAgent, tempStringClient, tempStringRoute, tempStringZone);
                tempString = nameArray.getJSONObject(i).getString("Client") + "\n" + nameArray.getJSONObject(i).getString("Route") + "\n" + nameArray.getJSONObject(i).getString("Zone");
                vectorOfStrings.add(new String(tempString));
            }
            int orderCount = vectorOfStrings.size();
            String[] orderTimeStamps = new String[orderCount];
            vectorOfStrings.copyInto(orderTimeStamps);
            setListAdapter(new ArrayAdapter(this, layout.simple_list_item_1, orderTimeStamps));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass listview;
	public MyHelperClass simple_list_item_1;
public MyHelperClass insertIntoClients(String o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass i(String o0, String o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class Bundle {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass getJSONArray(String o0){ return null; }}

class JSONArray {

public MyHelperClass length(){ return null; }
	public MyHelperClass getJSONObject(int o0){ return null; }}

class ArrayAdapter {

ArrayAdapter(c18185977 o0, MyHelperClass o1, String[] o2){}
	ArrayAdapter(){}}

class DataManipulator {

DataManipulator(c18185977 o0){}
	DataManipulator(){}}
