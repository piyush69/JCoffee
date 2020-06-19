import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17569036 {
public MyHelperClass sequence;
public MyHelperClass program;
public MyHelperClass rid;
	public MyHelperClass database;

    public void search() throws Throwable, Exception {
        URL searchurl = new URL("" + "http://www.ncbi.nlm.nih.gov/blast/Blast.cgi" + "?CMD=Put" + "&DATABASE=" + this.database + "&PROGRAM=" + this.program + "&QUERY=" + this.sequence.seqString());
        BufferedReader reader = new BufferedReader(new InputStreamReader(searchurl.openStream(), "UTF-8"));
        String line = "";
        while ((line = reader.readLine()) != null) {
            if (line.contains("Request ID"))(int)(Object) this.rid +=(int)(Object)(MyHelperClass)(Object) line.substring(70, 81);
        }
        reader.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass seqString(){ return null; }}
