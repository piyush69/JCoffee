import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13422842 {
public MyHelperClass view;
	public MyHelperClass properties;
	public MyHelperClass REGION_PROPERTIES;
	public MyHelperClass REGIONS_URL;

    public void EVECalcControllerImpl(EVECalcView gui) {
        this.view =(MyHelperClass)(Object) gui;
        properties =(MyHelperClass)(Object) new Properties();
        try {
            InputStream resStream;
            resStream = getClass().getResourceAsStream((String)(Object)REGION_PROPERTIES);
            if (resStream == null) {
                System.out.println("Loading for needed Properties files failed.");
                URL url = new URL((String)(Object)REGIONS_URL);
                try {
                    resStream = url.openStream();
                    properties.load(resStream);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                properties.load(resStream);
            }
        } catch (IOException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(InputStream o0){ return null; }}

class EVECalcView {

}
