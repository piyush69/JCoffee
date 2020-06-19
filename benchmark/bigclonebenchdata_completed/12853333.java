


class c12853333 {

    public static String getURLContent(String href) throws BuildException {
        URL url = null;
        String content;
        try {
            URL context = new URL("file:" + System.getProperty("user.dir") + "/");
            url = new URL(context, href);
            InputStream is =(InputStream)(Object) url.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            StringBuffer stringBuffer = new StringBuffer();
            char[] buffer = new char[1024];
            int len;
            while ((len =(int)(Object) isr.read(buffer, 0, 1024)) > 0) stringBuffer.append(buffer, 0, len);
            content = stringBuffer.toString();
            isr.close();
        } catch (Exception ex) {
            throw new BuildException("Cannot get content of URL " + href + ": " + ex);
        }
        return content;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	URL(URL o0, String o1){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(char[] o0, int o1, int o2){ return null; }}
