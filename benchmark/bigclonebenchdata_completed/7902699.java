
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7902699 {
public static MyHelperClass Logger;
//public MyHelperClass Logger;

    public static List getLevelIndex(URL fetchUrl) {
        List levelNames =(List)(Object) new ArrayList();
        BufferedReader bufferedreader;
        try {
            URLConnection urlconnection =(URLConnection)(Object) fetchUrl.openConnection();
            urlconnection.setConnectTimeout(30000);
            if (urlconnection.getContentEncoding() != null) {
                bufferedreader = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(), urlconnection.getContentEncoding()));
            } else {
                bufferedreader = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(), "utf-8"));
            }
        } catch (UncheckedIOException _ex) {
            System.err.println("HexTD::readFile:: Can't read from " + fetchUrl);
            return levelNames;
        }
        String sLine1;
        try {
            while ((sLine1 =(String)(Object) bufferedreader.readLine()) != null) {
                if (sLine1.trim().length() != 0) {
                    levelNames.add(sLine1);
                }
            }
        } catch (UncheckedIOException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(MapLoaderClient.class.getName()).log(Level.SEVERE, null,(IOException)(Object) ex);
        }
        return levelNames;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class URLConnection {

public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0, MyHelperClass o1){}
	InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MapLoaderClient {

}
