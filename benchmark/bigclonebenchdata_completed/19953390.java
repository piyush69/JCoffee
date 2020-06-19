import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19953390 {
public MyHelperClass EntityUtils;
	public MyHelperClass getHttpClient(){ return null; }
	public MyHelperClass getDirectories(String o0){ return null; }

    private void getDirectories() throws Throwable, IOException {
        MyHelperClass user = new MyHelperClass();
        if (user == null || ukey == null) {
            System.out.println("user and or ukey null");
        }
        MyHelperClass directories = new MyHelperClass();
        if (directories != null) {
            MyHelperClass directories = new MyHelperClass();
            if (directories.length != 0) {
                System.out.println("directories already present");
                return;
            }
        }
        MyHelperClass GET_DIRECTORIES_KEY_URL = new MyHelperClass();
        HttpPost requestdirectories = new HttpPost(GET_DIRECTORIES_KEY_URL + "?ukey=" + ukey.getValue() + "&user=" + user.getValue());
        HttpResponse dirResponse = getHttpClient().execute(requestdirectories);
        String ds = EntityUtils.toString(dirResponse.getEntity());
        dirResponse.getEntity().consumeContent();
        getDirectories(ds);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpPost {

}

class HttpResponse {

}
