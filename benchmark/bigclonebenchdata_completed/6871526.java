
import java.io.UncheckedIOException;


class c6871526 {
public MyHelperClass configCenter;
	public MyHelperClass fileEditor;
	public MyHelperClass getCacheString(boolean o0){ return null; }

    private boolean cacheUrlFile(String filePath, String realUrl, boolean isOnline) {
        try {
            URL url = new URL(realUrl);
            String encoding = "gbk";
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), encoding));
            StringBuilder sb = new StringBuilder();
            sb.append(configCenter.getWebRoot()).append(getCacheString(isOnline)).append(filePath);
            fileEditor.createDirectory(sb.toString());
            return(boolean)(Object) fileEditor.saveFile(sb.toString(), in);
        } catch (UncheckedIOException e) {
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createDirectory(String o0){ return null; }
	public MyHelperClass getWebRoot(){ return null; }
	public MyHelperClass saveFile(String o0, BufferedReader o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
