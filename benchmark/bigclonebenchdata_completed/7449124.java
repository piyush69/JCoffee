import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7449124 {
public MyHelperClass applet;

    private long getRecordedSessionLength() {
        long lRet = -1;
        MyHelperClass Constants = new MyHelperClass();
        String strLength =(String)(Object) this.applet.getParameter(Constants.PLAYBACK_MEETING_LENGTH_PARAM);
        if (null != strLength) {
            lRet = (new Long(strLength)).longValue();
        } else {
            Properties recProps = new Properties();
            try {
                MyHelperClass applet = new MyHelperClass();
                URL urlProps = new URL((URL)(Object)applet.getDocumentBase(),(String)(Object) Constants.RECORDED_SESSION_INFO_PROPERTIES);
                recProps.load(urlProps.openStream());
//                MyHelperClass Constants = new MyHelperClass();
                lRet = (new Long(recProps.getProperty((String)(Object)Constants.PLAYBACK_MEETING_LENGTH_PARAM))).longValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return lRet;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PLAYBACK_MEETING_LENGTH_PARAM;
	public MyHelperClass RECORDED_SESSION_INFO_PROPERTIES;
public MyHelperClass getParameter(MyHelperClass o0){ return null; }
	public MyHelperClass getDocumentBase(){ return null; }}
