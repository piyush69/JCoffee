import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13726761 {
public MyHelperClass ext;

    protected void handleUrl(URL url) throws Exception {
        MyHelperClass dir = new MyHelperClass();
        File file = new File(dir.getAbsolutePath() + "/" + new Date().getTime() + "." + this.ext);
        FileWriter writer = new FileWriter(file);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String s;
        while ((s = in.readLine()) != null) {
            writer.write(s + "\n");
        }
        in.close();
        writer.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAbsolutePath(){ return null; }}
