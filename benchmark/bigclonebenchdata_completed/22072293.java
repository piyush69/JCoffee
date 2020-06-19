import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22072293 {

//    @TestTargetNew(level = TestLevel.ADDITIONAL, notes = "", method = "SecureCacheResponse", args = {  })
    public void test_additional() throws Throwable, Exception {
        URL url = new URL("http://google.com");
        ResponseCache.setDefault((ResponseCache)(Object)new TestResponseCache());
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setUseCaches(true);
        httpCon.connect();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        httpCon.disconnect();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class TestTargetNew {

}

class TestResponseCache {

}
