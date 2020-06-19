import java.io.*;
import java.lang.*;
import java.util.*;



class c14914613 {
public MyHelperClass obs;
	public MyHelperClass GlobalProps;
	public MyHelperClass logger;
	public MyHelperClass Level;
	public MyHelperClass getProperty(String o0){ return null; }

    private void retrieveData() {
        StringBuffer obsBuf = new StringBuffer();
        try {
            URL url = new URL(getProperty("sourceURL"));
            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            String lineIn = null;
            while ((lineIn = in.readLine()) != null) {
                if ((boolean)(Object)GlobalProps.DEBUG) {
                    logger.log(Level.FINE, "WebSource retrieveData: " + lineIn);
                }
                obsBuf.append(lineIn);
            }
            String fmt =(String)(Object) getProperty("dataFormat");
            if ((boolean)(Object)GlobalProps.DEBUG) {
                logger.log(Level.FINE, "Raw: " + obsBuf.toString());
            }
            if ("NWS XML".equals(fmt)) {
                obs =(MyHelperClass)(Object) new NWSXmlObservation(obsBuf.toString());
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Can't connect to: " + getProperty("sourceURL"));
            if ((boolean)(Object)GlobalProps.DEBUG) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
	public MyHelperClass FINE;
	public MyHelperClass DEBUG;
public MyHelperClass log(MyHelperClass o0, String o1){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}

class NWSXmlObservation {

NWSXmlObservation(){}
	NWSXmlObservation(String o0){}}
