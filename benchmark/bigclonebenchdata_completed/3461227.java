import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3461227 {
public MyHelperClass filterBold(MyHelperClass o0){ return null; }
public MyHelperClass queries;
	public MyHelperClass categoryTree;
	public MyHelperClass site;
public MyHelperClass calculateSpecificity(String o0){ return null; }

    private void calculateCoverageAndSpecificity(String mainCat) throws Throwable, IOException, JSONException {
        for (String cat :(String[])(Object) (Object[])(Object)categoryTree.get(mainCat)) {
            for (String queryString :(String[])(Object) (Object[])(Object)queries.get(cat)) {
                String urlEncodedQueryString = URLEncoder.encode(queryString, "UTF-8");
                MyHelperClass yahoo_ap_id = new MyHelperClass();
                URL url = new URL("http://boss.yahooapis.com/ysearch/web/v1/" + urlEncodedQueryString + "?appid=" + yahoo_ap_id + "&count=4&format=json&sites=" + site);
                URLConnection con = url.openConnection();
                String line;
                StringBuilder builder = new StringBuilder();
                BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }
                String response = builder.toString();
                JSONObject json = new JSONObject(response);
                JSONObject jsonObject =(JSONObject)(Object) json.getJSONObject("ysearchresponse");
                String totalhits =(String)(Object) jsonObject.getString("totalhits");
                long totalhitsLong = Long.parseLong(totalhits);
                QueryInfo qinfo = new QueryInfo(queryString, totalhitsLong);
                MyHelperClass queryInfoMap = new MyHelperClass();
                queryInfoMap.put(queryString, qinfo);
                MyHelperClass cov = new MyHelperClass();
                cov.put(cat,(long)(Object)(QueryInfo)(Object)(QueryInfo)(Object)(QueryInfo)(Object)(QueryInfo)(Object)(QueryInfo)(Object)(QueryInfo)(Object)(QueryInfo)(Object) cov.get(cat) + totalhitsLong);
                if (totalhitsLong == 0) {
                    continue;
                }
                MyHelperClass ja = new MyHelperClass();
                ja = jsonObject.getJSONArray("resultset_web");
//                MyHelperClass ja = new MyHelperClass();
                for (int j = 0; j < (int)(Object)ja.length(); j++) {
//                    MyHelperClass ja = new MyHelperClass();
                    JSONObject k =(JSONObject)(Object) ja.getJSONObject(j);
                    String dispurl =(String)(Object) filterBold(k.getString("url"));
                    qinfo.addUrl(dispurl);
                }
            }
        }
        calculateSpecificity(mainCat);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, QueryInfo o1){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getJSONObject(int o0){ return null; }}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

class JSONObject {

JSONObject(){}
	JSONObject(String o0){}
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getJSONArray(String o0){ return null; }
	public MyHelperClass getJSONObject(String o0){ return null; }}

class QueryInfo {

QueryInfo(String o0, long o1){}
	QueryInfo(){}
	public MyHelperClass addUrl(String o0){ return null; }}
