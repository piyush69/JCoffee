


class c76718 {
public MyHelperClass getItems(){ return null; }

    private void refresh(String val) {
        HttpHost targetHost = new HttpHost("localhost", 8080, "http");
        DefaultHttpClient httpclient = new DefaultHttpClient();
        BasicHttpContext localcontext = new BasicHttpContext();
        String searchString = val.trim().replaceAll("\\s+", "+");
        HttpGet httpget = new HttpGet("/geoserver/rest/gazetteer-search/result.json?q=" + searchString);
        try {
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(targetHost, httpget, localcontext);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            String responseText = "";
            if (entity != null) {
                MyHelperClass EntityUtils = new MyHelperClass();
                responseText = new String((String)(Object)EntityUtils.toByteArray(entity));
            } else {
                responseText = "Fail";
            }
            MyHelperClass JSONObject = new MyHelperClass();
            JSONObject responseJson =(JSONObject)(Object) JSONObject.fromObject(responseText);
            JSONObject search =(JSONObject)(Object) responseJson.getJSONObject("org.ala.rest.GazetteerSearch");
            JSONArray results =(JSONArray)(Object) search.getJSONObject("results").getJSONArray("org.ala.rest.SearchResultItem");
            Iterator it =(Iterator)(Object) getItems().iterator();
            for (int i = 0; i < (int)(Object)results.size(); i++) {
                String itemString = (String)(String)(Object) results.getJSONObject(i).get("name");
                if (it != null && (boolean)(Object)it.hasNext()) {
                    ((Comboitem)(Comboitem)(Object) it.next()).setLabel(itemString);
                } else {
                    it = null;
                    new Comboitem(itemString).setParent(this);
                }
            }
            while (it != null && (boolean)(Object)it.hasNext()) {
                it.next();
                it.remove();
            }
        } catch (Exception e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass fromObject(String o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass toByteArray(HttpEntity o0){ return null; }
	public MyHelperClass getJSONArray(String o0){ return null; }}

class HttpHost {

HttpHost(String o0, int o1, String o2){}
	HttpHost(){}}

class DefaultHttpClient {

public MyHelperClass execute(HttpHost o0, HttpGet o1, BasicHttpContext o2){ return null; }}

class BasicHttpContext {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class JSONObject {

public MyHelperClass getJSONObject(String o0){ return null; }}

class JSONArray {

public MyHelperClass size(){ return null; }
	public MyHelperClass getJSONObject(int o0){ return null; }}

class Iterator {

public MyHelperClass remove(){ return null; }
	public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class Comboitem {

Comboitem(String o0){}
	Comboitem(){}
	public MyHelperClass setParent(c76718 o0){ return null; }
	public MyHelperClass setLabel(String o0){ return null; }}
