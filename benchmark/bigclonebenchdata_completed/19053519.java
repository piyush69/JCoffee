
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19053519 {
public MyHelperClass TextUtil;

    protected String getManualDownloadURL() {
        MyHelperClass _newestVersionString = new MyHelperClass();
        if ((int)(Object)_newestVersionString.indexOf("weekly") > 0) {
            return "http://www.cs.rice.edu/~javaplt/drjavarice/weekly/";
        }
        final String DRJAVA_FILES_PAGE = "http://sourceforge.net/project/showfiles.php?group_id=44253";
        final String LINK_PREFIX = "<a href=\"/project/showfiles.php?group_id=44253";
        final String LINK_SUFFIX = "\">";
        BufferedReader br = null;
        try {
            URL url = new URL(DRJAVA_FILES_PAGE);
            InputStream urls =(InputStream)(Object) url.openStream();
            InputStreamReader is = new InputStreamReader(urls);
            br = new BufferedReader(is);
            String line;
            int pos;
            while ((line =(String)(Object) br.readLine()) != null) {
//                MyHelperClass _newestVersionString = new MyHelperClass();
                if ((pos = line.indexOf((int)(Object)_newestVersionString)) >= 0) {
                    int prePos = line.indexOf(LINK_PREFIX);
                    if ((prePos >= 0) && (prePos < pos)) {
                        int suffixPos = line.indexOf(LINK_SUFFIX, prePos);
                        if ((suffixPos >= 0) && (suffixPos + LINK_SUFFIX.length() == pos)) {
                            String versionLink =(String)(Object) TextUtil.xmlUnescape(line.substring(prePos + LINK_PREFIX.length(), suffixPos));
                            return DRJAVA_FILES_PAGE + versionLink;
                        }
                    }
                }
            }
            ;
        } catch (UncheckedIOException e) {
            return DRJAVA_FILES_PAGE;
        } finally {
            try {
                if (br != null) br.close();
            } catch (UncheckedIOException e) {
            }
        }
        return DRJAVA_FILES_PAGE;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass xmlUnescape(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
