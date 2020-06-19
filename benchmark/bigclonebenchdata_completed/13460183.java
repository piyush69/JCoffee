import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13460183 {
public MyHelperClass removeLocalKeys(Map<Key o0, ValueItem o1){ return null; }
	public MyHelperClass resolveMap(Map<Key o0, ValueItem o1){ return null; }
public MyHelperClass getAsUrl(String o0){ return null; }
	public MyHelperClass getFilename(){ return null; }

    private LoadReturnCode loadChild(Map<Key, ValueItem> map, String fileOrUrl, LoadReturnCode defaultResult) throws Throwable, IOException {
        try {
            URL childurl =(URL)(Object) getAsUrl(fileOrUrl);
            if (childurl == null) return defaultResult;
            InputStream childStream = childurl.openStream();
            fileOrUrl = childurl.toString();
            LinkedProperties child = new LinkedProperties();
            child.initFromParent(this);
            child.setFilename(fileOrUrl);
            int p = fileOrUrl.lastIndexOf('/');
            setLoadPath((p < 0) ? null : fileOrUrl.substring(0, p));
            Map<Key, ValueItem> childMap = new HashMap<Key, ValueItem>(map);
            removeLocalKeys(childMap);
//            @SuppressWarnings("unused") LoadReturnCode childresult = child.onLoad(childMap, childStream);
            try {
                if (childStream != null) childStream.close();
            } catch (IOException ioex) {
            }
            childStream = null;
            map.putAll(childMap);
            return resolveMap(map);
        } catch (IOException ioe) {
            System.out.println(getFilename() + ": error loading childfile " + fileOrUrl);
            throw ioe;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ValueItem {

}

class LoadReturnCode {

}

class LinkedProperties {

public MyHelperClass initFromParent(c13460183 o0){ return null; }
	public MyHelperClass setFilename(String o0){ return null; }}
