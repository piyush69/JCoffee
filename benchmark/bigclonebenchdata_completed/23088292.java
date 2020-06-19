


class c23088292 {

    private void Submit2URL(URL url) throws Exception {
        HttpURLConnection urlc = null;
        try {
            urlc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            urlc.setRequestMethod("GET");
            urlc.setDoOutput(true);
            urlc.setDoInput(true);
            urlc.setUseCaches(false);
            urlc.setAllowUserInteraction(false);
            if ((int)(Object)urlc.getResponseCode() != 200) {
                InputStream in = null;
                Reader reader = null;
                try {
                    in =(InputStream)(Object) urlc.getInputStream();
                    reader =(Reader)(Object) new InputStreamReader(in, "UTF-8");
                    int read = 0;
                    char[] buf = new char[1024];
                    String error = null;
                    while ((read =(int)(Object) reader.read(buf)) >= 0) {
                        if (error == null) error = new String(buf, 0, read); else error += new String(buf, 0, read);
                    }
                    MyHelperClass ErrorHelper = new MyHelperClass();
                    throw new NpsException(error, ErrorHelper.SYS_UNKOWN);
                } finally {
                    if (reader != null) try {
                        reader.close();
                    } catch (Exception e1) {
                    }
                    if (in != null) try {
                        in.close();
                    } catch (Exception e1) {
                    }
                }
            }
        } finally {
            if (urlc != null) try {
                urlc.disconnect();
            } catch (Exception e1) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SYS_UNKOWN;
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class Reader {

public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class NpsException extends Exception{
	public NpsException(String errorMessage) { super(errorMessage); }
	NpsException(){}
	NpsException(String o0, MyHelperClass o1){}
}
