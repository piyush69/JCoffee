import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9806167 {

    private ArrayList<IdLocation> doGet(String identifier) throws Throwable, IdLocatorException {
        MyHelperClass baseurl = new MyHelperClass();
        String openurl = baseurl.toString() + "?url_ver=Z39.88-2004&rft_id=" + identifier;
        URL url;
        SRUSearchRetrieveResponse sru;
        try {
            url = new URL(openurl);
            HttpURLConnection huc = (HttpURLConnection) (url.openConnection());
            int code = huc.getResponseCode();
            if (code == 200) {
                MyHelperClass SRUSearchRetrieveResponse = new MyHelperClass();
                sru =(SRUSearchRetrieveResponse)(Object) SRUSearchRetrieveResponse.read(huc.getInputStream());
            } else throw new IdLocatorException("cannot get " + url.toString());
        } catch (MalformedURLException e) {
            throw new IdLocatorException("A MalformedURLException occurred for " + openurl);
        } catch (IOException e) {
            throw new IdLocatorException("An IOException occurred attempting to connect to " + openurl);
        } catch (SRUException e) {
            throw new IdLocatorException("An SRUException occurred attempting to parse the response");
        }
        ArrayList<IdLocation> ids = new ArrayList<IdLocation>();
        for (SRUDC dc :(SRUDC[])(Object) (Object[])(Object)sru.getRecords()) {
            IdLocation id = new IdLocation();
            id.setId(dc.getKeys(Key.IDENTIFIER).firstElement());
            id.setRepo(dc.getKeys(Key.SOURCE).firstElement());
            id.setDate(dc.getKeys(Key.DATE).firstElement());
            ids.add(id);
        }
        Collections.sort(ids);
        return ids;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass read(InputStream o0){ return null; }}

class IdLocation {

}

class IdLocatorException extends Exception{
	public IdLocatorException(String errorMessage) { super(errorMessage); }
}

class SRUSearchRetrieveResponse {

public MyHelperClass getRecords(){ return null; }}

class SRUException extends Exception{
	public SRUException(String errorMessage) { super(errorMessage); }
}

class SRUDC {

}

class Collections {

public static MyHelperClass sort(ArrayList<IdLocation> o0){ return null; }}
