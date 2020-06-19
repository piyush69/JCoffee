
import java.io.UncheckedIOException;


class c5456371 {

    public MapInfo loadLocalMapData(String fileName) {
        MyHelperClass mapCacheLocal = new MyHelperClass();
        MapInfo info =(MapInfo)(Object) mapCacheLocal.get(fileName);
        if (info != null && info.getContent() == null) {
            try {
                BufferedReader bufferedreader;
                MyHelperClass localMapContextUrl = new MyHelperClass();
                URL fetchUrl = new URL(localMapContextUrl, fileName);
                URLConnection urlconnection =(URLConnection)(Object) fetchUrl.openConnection();
                if (urlconnection.getContentEncoding() != null) {
                    bufferedreader = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(), urlconnection.getContentEncoding()));
                } else {
                    bufferedreader = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(), "utf-8"));
                }
                String line;
                StringBuilder mapContent = new StringBuilder();
                while ((line =(String)(Object) bufferedreader.readLine()) != null) {
                    mapContent.append(line);
                    mapContent.append("\n");
                }
                info.setContent(mapContent.toString());
                MyHelperClass GameMapImplementation = new MyHelperClass();
                GameMapImplementation gameMap =(GameMapImplementation)(Object) GameMapImplementation.createFromMapInfo(info);
            } catch (UncheckedIOException _ex) {
                System.err.println("HexTD::readFile:: Can't read from " + fileName);
            }
        } else {
            System.err.println("HexTD::readFile:: file not in cache: " + fileName);
        }
        return info;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass createFromMapInfo(MapInfo o0){ return null; }}

class MapInfo {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass setContent(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0, MyHelperClass o1){}
	InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class GameMapImplementation {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
