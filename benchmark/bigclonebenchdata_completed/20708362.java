import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20708362 {
public MyHelperClass FLAGS;
public MyHelperClass checksum;

    public void updateChecksum()  throws Throwable {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA");
            MyHelperClass parameter_instances = new MyHelperClass();
            List<Parameter> sortedKeys = new ArrayList<Parameter>((int)(Object)parameter_instances.keySet());
            for (Parameter p : sortedKeys) {
//                MyHelperClass parameter_instances = new MyHelperClass();
                if (parameter_instances.get(p) != null && !((OPTIONS)(Object)parameter_instances.get(p) instanceof OPTIONS) && !(parameter_instances.get(p).equals(FLAGS.OFF))) {
//                    MyHelperClass parameter_instances = new MyHelperClass();
                    md.update(parameter_instances.get(p).toString().getBytes());
                }
            }
            this.checksum =(MyHelperClass)(Object) md.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OFF;
public MyHelperClass get(Parameter o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class Parameter {

}

class OPTIONS {

}
