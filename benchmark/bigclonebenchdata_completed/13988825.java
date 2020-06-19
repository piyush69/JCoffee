import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13988825 {
public MyHelperClass key;
	public MyHelperClass baseDirectory;

    private void setNodekeyInJsonResponse(String service) throws Exception {
        String filename = this.baseDirectory + service + ".json";
        Scanner s = new Scanner(new File(filename));
        PrintWriter fw = new PrintWriter(new File(filename + ".new"));
        while (s.hasNextLine()) {
            fw.println(s.nextLine().replaceAll("NODEKEY",(String)(Object) this.key));
        }
        s.close();
        fw.close();
        (new File(filename + ".new")).renameTo(new File(filename));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
