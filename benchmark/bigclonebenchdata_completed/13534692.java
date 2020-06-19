import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13534692 {
public MyHelperClass script;

    public  c13534692(ActionDTO dto, URL url) throws Throwable, IOException {
        super(dto);
        InputStream in = url.openStream();
        InputStreamReader rin = new InputStreamReader(in);
        BufferedReader reader = new BufferedReader(rin);
        StringBuffer s = new StringBuffer();
        String str;
        while ((str = reader.readLine()) != null) {
            s.append(str);
            s.append("\n");
        }
        in.close();
        script =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) s.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ActionDTO {

}

class Object {

Object(ActionDTO o0){}
	Object(){}}
