import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2513723 {

    protected String readScript(ClassLoader cl, String scriptName) throws Throwable, AxisFault(Throwable)(Object) {
        URL url = cl.getResource(scriptName);
        if (url == null) {
            throw new AxisFault("Script not found: " + scriptName);
        }
        InputStream is;
        try {
            is = url.openStream();
        } catch (IOException e) {
            throw new AxisFault("IOException opening script: " + scriptName, e);
        }
        try {
            Reader reader = new InputStreamReader(is, "UTF-8");
            char[] buffer = new char[1024];
            StringBuffer source = new StringBuffer();
            int count;
            while ((count = reader.read(buffer)) > 0) {
                source.append(buffer, 0, count);
            }
            return source.toString();
        } catch (IOException e) {
            throw new AxisFault("IOException reading script: " + scriptName, e);
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                throw new AxisFault("IOException closing script: " + scriptName, e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class AxisFault {

AxisFault(String o0, IOException o1){}
	AxisFault(String o0){}
	AxisFault(){}}
