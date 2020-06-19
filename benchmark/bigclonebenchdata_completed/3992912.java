import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3992912 {

    public static List<Item> doService(List<String> itemIds, Boolean archive) throws Throwable, UnsupportedEncodingException, IOException {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        ToggleArchiveRequest request = new ToggleArchiveRequest();
        MyHelperClass RuntimeAccess = new MyHelperClass();
        String sessionId = (String) RuntimeAccess.getInstance().getSession().getAttribute("SESSION_ID");
        request.setItemIds(itemIds);
        request.setArchive(archive);
        request.setSessionId(sessionId);
        XStream writer = new XStream();
        MyHelperClass XStream = new MyHelperClass();
        writer.setMode(XStream.XPATH_ABSOLUTE_REFERENCES);
        writer.alias("ToggleArchiveRequest", ToggleArchiveRequest.class);
        XStream reader = new XStream();
//        MyHelperClass XStream = new MyHelperClass();
        reader.setMode(XStream.XPATH_ABSOLUTE_REFERENCES);
        reader.alias("ToggleArchiveResponse", ToggleArchiveResponse.class);
        String strRequest = URLEncoder.encode(reader.toXML(request), "UTF-8");
        MyHelperClass MewitProperties = new MyHelperClass();
        HttpPost httppost = new HttpPost(MewitProperties.getMewitUrl() + "/resources/toggleArchive?REQUEST=" + strRequest);
        HttpResponse response = httpclient.execute(httppost);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            MyHelperClass EntityUtils = new MyHelperClass();
            String result = URLDecoder.decode(EntityUtils.toString(entity), "UTF-8");
            ToggleArchiveResponse oResponse = (ToggleArchiveResponse) reader.fromXML(result);
            return oResponse.getItems();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass XPATH_ABSOLUTE_REFERENCES;
public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getMewitUrl(){ return null; }}

class Item {

}

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class ToggleArchiveRequest {

public MyHelperClass setSessionId(String o0){ return null; }
	public MyHelperClass setArchive(Boolean o0){ return null; }
	public MyHelperClass setItemIds(List<String o0){ return null; }}

class XStream {

public MyHelperClass toXML(ToggleArchiveRequest o0){ return null; }
	public MyHelperClass fromXML(String o0){ return null; }
	public MyHelperClass alias(String o0, Class<ToggleArchiveRequest o1){ return null; }
	public MyHelperClass alias(String o0, Class<ToggleArchiveResponse o1){ return null; }}

class ToggleArchiveResponse {

public MyHelperClass getItems(){ return null; }}

class HttpPost {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
