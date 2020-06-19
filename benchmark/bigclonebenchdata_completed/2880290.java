import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2880290 {
public MyHelperClass accept(File o0, String o1){ return null; }
public MyHelperClass Loader;
	public MyHelperClass url;
	public MyHelperClass fileList;
	public MyHelperClass file;
	public MyHelperClass classLoader;
	public MyHelperClass fillVectors(){ return null; }

    public  void PluginLoader(URL pluginLocation, ClassLoader loader)  throws Throwable {
        Loader =(MyHelperClass)(Object) loader;
        url =(MyHelperClass)(Object) pluginLocation;
        try {
            if (url.toString().substring(0, 3).compareTo("http") == 0) {
                System.out.println("url location is =" + url.toString());
                InputStream ips =(InputStream)(Object) url.openStream();
                Reader r = new InputStreamReader(ips);
                ParserDelegator parser = new ParserDelegator();
                ParserCallback callback = new ParserCallback() {

                    public void handleText(char[] dat, int pos) {
                        String data = new String(dat);
                        if ((boolean)(Object)accept(new File("."), data)) fileList.addElement(data);
                        System.out.println("\ngot a file in list" + data);
                    }
                };
                parser.parse(r, callback, false);
            } else {
                file =(MyHelperClass)(Object) new File((String)(Object)url.getPath());
                System.out.println("File location is =" + file.getPath());
                String[] tempList =(String[])(Object) file.list(this);
                for (int i = 0; i < tempList.length; i++) fileList.add(tempList[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        classLoader =(MyHelperClass)(Object) new SimpleClassLoader(url, Loader);
        System.out.println(file.getAbsolutePath());
        fillVectors();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addElement(String o0){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass list(c2880290 o0){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class ParserDelegator {

public MyHelperClass parse(Reader o0, ParserCallback o1, boolean o2){ return null; }}

class SimpleClassLoader {

SimpleClassLoader(MyHelperClass o0, MyHelperClass o1){}
	SimpleClassLoader(){}}

class ParserCallback {

}
