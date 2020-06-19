import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3691037 {
public MyHelperClass data;
	public MyHelperClass setSource(URL o0){ return null; }
	public MyHelperClass displayWarning(String o0, String o1, IOException o2){ return null; }
	public MyHelperClass setHasChanges(boolean o0){ return null; }
	public MyHelperClass loadOpenPVsFromData(){ return null; }

    public  void PVBrowserSearchDocument(URL url, PVBrowserModel applicationModel)  throws Throwable {
        this(applicationModel);
        if (url != null) {
            try {
                data.loadFromXML(url.openStream());
                loadOpenPVsFromData();
                setHasChanges(false);
                setSource(url);
            } catch (java.io.IOException exception) {
                System.err.println(exception);
                displayWarning("Open Failed!", exception.getMessage(), exception);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass loadFromXML(InputStream o0){ return null; }}

class PVBrowserModel {

}
