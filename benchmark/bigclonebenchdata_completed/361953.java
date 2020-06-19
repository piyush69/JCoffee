import java.io.*;
import java.lang.*;
import java.util.*;



class c361953 {
public static MyHelperClass MAIN_CLASS;
//public MyHelperClass MAIN_CLASS;

    private static Manifest getManifest() throws IOException {
        Stack manifests = new Stack();
        MyHelperClass MANIFEST = new MyHelperClass();
        for (Enumeration e = Run.class.getClassLoader().getResources((String)(Object)MANIFEST); e.hasMoreElements(); ) manifests.add(e.nextElement());
        while (!manifests.isEmpty()) {
            URL url = (URL) manifests.pop();
            InputStream in =(InputStream)(Object) url.openStream();
            Manifest mf = new Manifest(in);
            in.close();
            MyHelperClass MAIN_CLASS = new MyHelperClass();
            if (mf.getMainAttributes().getValue(MAIN_CLASS) != null) return mf;
        }
//        MyHelperClass MANIFEST = new MyHelperClass();
        throw new Error("No " + MANIFEST + " with " + MAIN_CLASS + " found");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getValue(MyHelperClass o0){ return null; }}

class Manifest {

Manifest(){}
	Manifest(InputStream o0){}
	public MyHelperClass getMainAttributes(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Run {

}
