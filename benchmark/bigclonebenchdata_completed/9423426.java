import java.io.*;
import java.lang.*;
import java.util.*;



class c9423426 {

    private void initialize() {
        MyHelperClass initialized = new MyHelperClass();
        if (!(Boolean)(Object)initialized) {
            MyHelperClass context = new MyHelperClass();
            if (context.getJavadocLinks() != null) {
//                MyHelperClass context = new MyHelperClass();
                for (String url :(String[])(Object) (Object[])(Object)context.getJavadocLinks()) {
                    if (!url.endsWith("/")) {
                        url += "/";
                    }
                    StringWriter writer = new StringWriter();
                    try {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(new URL(url + "package-list").openStream(), writer);
                    } catch (Exception e) {
                        e.printStackTrace();
                        continue;
                    }
                    StringTokenizer tokenizer2 = new StringTokenizer(writer.toString());
                    while (tokenizer2.hasMoreTokens()) {
                        MyHelperClass javadocByPackage = new MyHelperClass();
                        javadocByPackage.put(tokenizer2.nextToken(), url);
                    }
                }
            }
//            MyHelperClass initialized = new MyHelperClass();
            initialized =(MyHelperClass)(Object) true;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getJavadocLinks(){ return null; }
	public MyHelperClass copy(MyHelperClass o0, StringWriter o1){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}
