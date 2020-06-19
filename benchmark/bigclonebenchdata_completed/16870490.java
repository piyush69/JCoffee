import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16870490 {

    private List parseUrlGetUids(String url) throws Throwable, FetchError(Throwable)(Object) {
        List hids = new ArrayList();
        try {
            InputStream is = (new URL(url)).openStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            StringBuffer buffer = new StringBuffer();
            String inputLine = "";
            MyHelperClass Pattern = new MyHelperClass();
            Pattern pattern = Pattern.compile("\\<input\\s+type=hidden\\s+name=hid\\s+value=(\\d+)\\s?\\>", Pattern.CASE_INSENSITIVE);
            while ((inputLine = in.readLine()) != null) {
                Matcher matcher = pattern.matcher(inputLine);
                if (matcher.find()) {
                    String id = matcher.group(1);
                    if (!hids.contains(id)) {
                        hids.add(id);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            throw new FetchError(e);
        }
        return hids;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CASE_INSENSITIVE;
}

class FetchError {

FetchError(Exception o0){}
	FetchError(){}}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}
