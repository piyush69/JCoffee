import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18424153 {
public MyHelperClass extnMap;
	public MyHelperClass TEXT_HTML;
	public MyHelperClass TEXT_CSS;
	public MyHelperClass RES;
	public MyHelperClass canParse;

    private  void MimeTypes()  throws Throwable {
        try {
            final URL url =(URL)(Object) RES.getURL("types");
            final InputStream is = url.openStream();
            final BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = br.readLine();
            while (line != null) {
                line = line.trim();
                final int p = line.indexOf('#');
                if (p >= 0) {
                    line = line.substring(0, p).trim();
                }
                if (line.length() > 0) {
                    final StringTokenizer st = new StringTokenizer(line, " \t");
                    if (st.countTokens() > 1) {
                        final String mime = st.nextToken();
                        while (st.hasMoreTokens()) {
                            extnMap.put(st.nextToken(), mime);
                        }
                    }
                }
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        canParse.add(TEXT_HTML);
        canParse.add(TEXT_CSS);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getURL(String o0){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}
