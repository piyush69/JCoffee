


class c22475641 {
public MyHelperClass getAddress(MyHelperClass o0, MyHelperClass o1){ return null; }

//            @Override
            public void onClick(View v) {
                MyHelperClass tm = new MyHelperClass();
                GsmCellLocation gcl = (GsmCellLocation)(GsmCellLocation)(Object) tm.getCellLocation();
                int cid =(int)(Object) gcl.getCid();
                int lac =(int)(Object) gcl.getLac();
//                MyHelperClass tm = new MyHelperClass();
                int mcc = Integer.valueOf((String)(Object)tm.getNetworkOperator().substring(0, 3));
//                MyHelperClass tm = new MyHelperClass();
                int mnc = Integer.valueOf((String)(Object)tm.getNetworkOperator().substring(3, 5));
                try {
                    JSONObject holder = new JSONObject();
                    holder.put("version", "1.1.0");
                    holder.put("host", "maps.google.com");
                    holder.put("request_address", true);
                    JSONArray array = new JSONArray();
                    JSONObject data = new JSONObject();
                    data.put("cell_id", cid);
                    data.put("location_area_code", lac);
                    data.put("mobile_country_code", mcc);
                    data.put("mobile_network_code", mnc);
                    array.put(data);
                    holder.put("cell_towers", array);
                    DefaultHttpClient client = new DefaultHttpClient();
                    HttpPost post = new HttpPost("http://www.google.com/loc/json");
                    StringEntity se = new StringEntity(holder.toString());
                    post.setEntity(se);
                    HttpResponse resp =(HttpResponse)(Object) client.execute(post);
                    HttpEntity entity =(HttpEntity)(Object) resp.getEntity();
                    BufferedReader br = new BufferedReader(new InputStreamReader(entity.getContent()));
                    StringBuffer sb = new StringBuffer();
                    String result =(String)(Object) br.readLine();
                    while (result != null) {
                        sb.append(result);
                        result =(String)(Object) br.readLine();
                    }
                    JSONObject jsonObject = new JSONObject(sb.toString());
                    JSONObject jsonObject1 = new JSONObject((String)(Object)jsonObject.getString("location"));
                    getAddress(jsonObject1.getString("latitude"), jsonObject1.getString("longitude"));
                } catch (Exception e) {
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCellLocation(){ return null; }
	public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass getNetworkOperator(){ return null; }}

class View {

}

class GsmCellLocation {

public MyHelperClass getCid(){ return null; }
	public MyHelperClass getLac(){ return null; }}

class JSONObject {

JSONObject(){}
	JSONObject(String o0){}
	public MyHelperClass put(String o0, JSONArray o1){ return null; }
	public MyHelperClass put(String o0, int o1){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass put(String o0, boolean o1){ return null; }}

class JSONArray {

public MyHelperClass put(JSONObject o0){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(StringEntity o0){ return null; }}

class StringEntity {

StringEntity(String o0){}
	StringEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
