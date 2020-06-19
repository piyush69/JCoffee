import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4404642 {
public MyHelperClass setContentView(MyHelperClass o0){ return null; }
public MyHelperClass layout;
public MyHelperClass dm;
	public MyHelperClass Log;

//    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.onCreate(savedInstanceState);
        setContentView(layout.listview);
        MyHelperClass SERVICE_URI = new MyHelperClass();
        HttpGet request = new HttpGet(SERVICE_URI + "/json/getproducts");
        request.setHeader("Accept", "application/json");
        request.setHeader("Content-type", "application/json");
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String theString = new String("");
//        MyHelperClass SERVICE_URI = new MyHelperClass();
        HttpGet request1 = new HttpGet(SERVICE_URI + "/json/getroutes/3165");
        request.setHeader("Accept", "application/json");
        request.setHeader("Content-type", "application/json");
        DefaultHttpClient httpClient1 = new DefaultHttpClient();
        try {
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(request);
            HttpEntity responseEntity =(HttpEntity)(Object) response.getEntity();
            InputStream stream =(InputStream)(Object) responseEntity.getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            Vector<String> vectorOfStrings = new Vector<String>();
            String tempString = new String();
            String tempStringID = new String();
            String tempStringName = new String();
            String tempStringPrice = new String();
            String tempStringSymbol = new String();
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            stream.close();
            theString = builder.toString();
            JSONObject json = new JSONObject(theString);
            MyHelperClass Log = new MyHelperClass();
            Log.i("_GetPerson_", "<jsonobject>\n" + json.toString() + "\n</jsonobject>");
            this.dm =(MyHelperClass)(Object) new DataManipulator(this);
            JSONArray nameArray;
            nameArray =(JSONArray)(Object) json.getJSONArray("getProductsResult");
            for (int i = 0; i < (int)(Object)nameArray.length(); i++) {
                tempStringID =(String)(Object) nameArray.getJSONObject(i).getString("ID");
                tempStringName =(String)(Object) nameArray.getJSONObject(i).getString("Name");
                tempStringPrice =(String)(Object) nameArray.getJSONObject(i).getString("Price");
                tempStringSymbol =(String)(Object) nameArray.getJSONObject(i).getString("Symbol");
                this.dm.insertIntoProducts(tempStringID, tempStringName, tempStringPrice, tempStringSymbol);
                tempString = nameArray.getJSONObject(i).getString("Name") + "\n" + nameArray.getJSONObject(i).getString("Price") + "\n" + nameArray.getJSONObject(i).getString("Symbol");
                vectorOfStrings.add(new String(tempString));
            }
            int orderCount = vectorOfStrings.size();
            String[] orderTimeStamps = new String[orderCount];
            vectorOfStrings.copyInto(orderTimeStamps);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            HttpResponse response1 =(HttpResponse)(Object) httpClient1.execute(request1);
            HttpEntity response1Entity =(HttpEntity)(Object) response1.getEntity();
            InputStream stream1 =(InputStream)(Object) response1Entity.getContent();
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(stream1));
            Vector<String> vectorOfStrings = new Vector<String>();
            String tempString1 = new String();
            String tempStringAgent = new String();
            String tempStringClient = new String();
            String tempStringRoute = new String();
            String tempStringZone = new String();
            StringBuilder builder1 = new StringBuilder();
            String line1;
            while ((line1 = reader1.readLine()) != null) {
                builder1.append(line1);
            }
            stream1.close();
            theString = builder1.toString();
            JSONObject json1 = new JSONObject(theString);
            Log.i("_GetPerson_", "<jsonobject>\n" + json1.toString() + "\n</jsonobject>");
            this.dm =(MyHelperClass)(Object) new DataManipulator(this);
            JSONArray nameArray1;
            nameArray1 =(JSONArray)(Object) json1.getJSONArray("GetRoutesByAgentResult");
            for (int i = 0; i < (int)(Object)nameArray1.length(); i++) {
                tempStringAgent =(String)(Object) nameArray1.getJSONObject(i).getString("Agent");
                tempStringClient =(String)(Object) nameArray1.getJSONObject(i).getString("Client");
                tempStringRoute =(String)(Object) nameArray1.getJSONObject(i).getString("Route");
                tempStringZone =(String)(Object) nameArray1.getJSONObject(i).getString("Zone");
                this.dm.insertIntoClients(tempStringAgent, tempStringClient, tempStringRoute, tempStringZone);
                tempString1 = nameArray1.getJSONObject(i).getString("Client") + "\n" + nameArray1.getJSONObject(i).getString("Route") + "\n" + nameArray1.getJSONObject(i).getString("Zone");
                vectorOfStrings.add(new String(tempString1));
            }
            int orderCount1 = vectorOfStrings.size();
            String[] orderTimeStamps1 = new String[orderCount1];
            vectorOfStrings.copyInto(orderTimeStamps1);
        } catch (Exception a) {
            a.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass listview;
public MyHelperClass insertIntoClients(String o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass i(String o0, String o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass insertIntoProducts(String o0, String o1, String o2, String o3){ return null; }}

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

class DataManipulator {

DataManipulator(c4404642 o0){}
	DataManipulator(){}}
