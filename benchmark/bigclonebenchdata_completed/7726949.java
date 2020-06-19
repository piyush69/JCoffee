


class c7726949 {

    protected static String readUrl(URL url) throws IOException {
        BufferedReader in = null;
        StringBuffer buf = new StringBuffer();
        try {
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            final char[] charBuf = new char[1024];
            int len = 0;
            while ((len =(int)(Object) in.read(charBuf)) != -1) buf.append(charBuf, 0, len);
        } finally {
            if (in != null) in.close();
        }
        return buf.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
