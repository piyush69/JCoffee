


class c12068151 {
public MyHelperClass setListAdapter(ArrayAdapter o0){ return null; }
public MyHelperClass setContentView(MyHelperClass o0){ return null; }
public MyHelperClass layout;

//    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.onCreate(savedInstanceState);
        setContentView(layout.cautaprodus);
        MyHelperClass SERVICE_URI = new MyHelperClass();
        HttpGet request = new HttpGet(SERVICE_URI + "/json/getproducts");
        request.setHeader("Accept", "application/json");
        request.setHeader("Content-type", "application/json");
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String theString = new String("");
        try {
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(request);
            HttpEntity responseEntity =(HttpEntity)(Object) response.getEntity();
            InputStream stream =(InputStream)(Object) responseEntity.getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            Vector vectorOfStrings = new Vector();
            String tempString = new String();
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                builder.append(line);
            }
            stream.close();
            theString = builder.toString();
            JSONObject json = new JSONObject(theString);
            MyHelperClass Log = new MyHelperClass();
            Log.i("_GetPerson_", "<jsonobject>\n" + json.toString() + "\n</jsonobject>");
            JSONArray nameArray =(JSONArray)(Object) json.getJSONArray("getProductsResult");
            for (int i = 0; i < (int)(Object)nameArray.length(); i++) {
//                MyHelperClass Log = new MyHelperClass();
                Log.i("_GetProducts_", "<ID" + i + ">" + nameArray.getJSONObject(i).getString("ID") + "</ID" + i + ">\n");
//                MyHelperClass Log = new MyHelperClass();
                Log.i("_GetProducts_", "<Name" + i + ">" + nameArray.getJSONObject(i).getString("Name") + "</Name" + i + ">\n");
//                MyHelperClass Log = new MyHelperClass();
                Log.i("_GetProducts_", "<Price" + i + ">" + nameArray.getJSONObject(i).getString("Price") + "</Price" + i + ">\n");
//                MyHelperClass Log = new MyHelperClass();
                Log.i("_GetProducts_", "<Symbol" + i + ">" + nameArray.getJSONObject(i).getString("Symbol") + "</Symbol" + i + ">\n");
                tempString = nameArray.getJSONObject(i).getString("Name") + "\n" + nameArray.getJSONObject(i).getString("Price") + "\n" + nameArray.getJSONObject(i).getString("Symbol");
                vectorOfStrings.add(new String(tempString));
            }
            int orderCount =(int)(Object) vectorOfStrings.size();
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
public MyHelperClass simple_list_item_1;
	public MyHelperClass cautaprodus;
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

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class Vector {

public MyHelperClass copyInto(String[] o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass getJSONArray(String o0){ return null; }}

class JSONArray {

public MyHelperClass length(){ return null; }
	public MyHelperClass getJSONObject(int o0){ return null; }}

class ArrayAdapter {

ArrayAdapter(){}
	ArrayAdapter(c12068151 o0, MyHelperClass o1, String[] o2){}}
