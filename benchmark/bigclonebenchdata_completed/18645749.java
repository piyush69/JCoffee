import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c18645749 {
public MyHelperClass _pwd;
public MyHelperClass _user;
	public MyHelperClass MyFanfou;

    public void GetList() throws Exception {
        Authenticator.setDefault((Authenticator)(Object)new MyAuth(this._user, this._pwd));
        URL url = new URL((String)(Object)MyFanfou.PublicTimeLine);
        InputStream ins = url.openConnection().getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
        String json = "";
        String line;
        while ((line = reader.readLine()) != null) json += line;
        JSONArray array = new JSONArray(json);
        for (int i = 0; i < (int)(Object)array.length(); i++) {
            JSONObject object =(JSONObject)(Object) array.getJSONObject(i);
            String users =(String)(Object) object.getString("user");
            JSONObject user = new JSONObject(users);
            System.out.println(object.getString("id") + ":" + user.getString("birthday"));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PublicTimeLine;
}

class MyAuth {

MyAuth(){}
	MyAuth(MyHelperClass o0, MyHelperClass o1){}}

class JSONArray {

JSONArray(String o0){}
	JSONArray(){}
	public MyHelperClass length(){ return null; }
	public MyHelperClass getJSONObject(int o0){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass getString(String o0){ return null; }}
