import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10940445 {
public MyHelperClass ACTION_PARAMETER;
	public int totalCalls;
public MyHelperClass maxTime;
	public MyHelperClass timingsOn;
	public MyHelperClass minTime;
//	public MyHelperClass totalCalls;
	public MyHelperClass totalTime;
	public MyHelperClass encode(String o0){ return null; }
	public MyHelperClass getHttpClient(){ return null; }

    protected HttpResponse doGet(String action, String[][] args) throws Throwable, IOException {
        long startTime = System.currentTimeMillis();
        MyHelperClass host = new MyHelperClass();
        String getString = host + "?" + ACTION_PARAMETER + "=" + action;
        if (args != null && args.length != 0) {
            for (int i = 0; i < args.length; i++) {
                if (args[i].length != 0) {
                    getString = getString + "&" + args[i][0] + "=" + encode(args[i][1]);
                }
            }
        }
        HttpGet httpGet = new HttpGet(getString);
        HttpResponse response =(HttpResponse)(Object) getHttpClient().execute(httpGet);
        if ((boolean)(Object)timingsOn) {
            totalCalls++;
            long elapsedTime = (System.currentTimeMillis() - startTime);
            if ((int)(Object)totalCalls != 1) {
                totalTime =(long)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) totalTime + elapsedTime;
                minTime =(MyHelperClass)(Object) Math.min((int)(Object)minTime, elapsedTime);
                maxTime =(MyHelperClass)(Object) Math.max((int)(Object)maxTime, elapsedTime);
            } else {
                minTime =(MyHelperClass)(Object) elapsedTime;
                maxTime =(MyHelperClass)(Object) 0L;
            }
            System.out.println("http get took " + elapsedTime + " ms., (calls, min, max, av) = (" + totalCalls + ", " + minTime + ", " + maxTime + ", " + ((int)(Object)totalTime / (int)(Object)totalCalls) + ")");
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpResponse {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}
