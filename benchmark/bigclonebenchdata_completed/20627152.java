import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20627152 {
public MyHelperClass licence_text_id;
public MyHelperClass files;
	public MyHelperClass licence_text;

    public void loadLicenceText()  throws Throwable {
        try {
            URL url = this.getClass().getResource("/licences/" + this.files[(int)(Object)this.licence_text_id]);
            InputStreamReader ins = new InputStreamReader(url.openStream());
            BufferedReader br = new BufferedReader(ins);
            String line;
            StringBuffer sb = new StringBuffer();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            this.licence_text =(MyHelperClass)(Object) sb.toString();
        } catch (Exception ex) {
            System.out.println("LicenceInfo::error reading. Ex: " + ex);
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
