import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3253205 {

    private String generateUniqueIdMD5(Run run, HttpServletRequest request, String groupIdString)  throws Throwable {
        String portalUrl = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
        String uniqueportalUrl = portalUrl + "run:" + run.getId().toString() + "group:" + groupIdString;
        MessageDigest m = null;
        try {
            m = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        m.update(uniqueportalUrl.getBytes(), 0, uniqueportalUrl.length());
        String uniqueIdMD5 = new BigInteger(1, m.digest()).toString(16);
        return uniqueIdMD5;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Run {

public MyHelperClass getId(){ return null; }}

class HttpServletRequest {

public MyHelperClass getScheme(){ return null; }
	public MyHelperClass getServerName(){ return null; }
	public MyHelperClass getServerPort(){ return null; }}
