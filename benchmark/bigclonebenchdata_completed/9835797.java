


class c9835797 {
public static MyHelperClass closeStream(InputStream o0){ return null; }
	public static MyHelperClass closeReader(BufferedReader o0){ return null; }
//public MyHelperClass closeStream(InputStream o0){ return null; }
//	public MyHelperClass closeReader(BufferedReader o0){ return null; }

    public static void loadFile(final URL url, final StringBuffer buffer) throws IOException {
        InputStream in = null;
        BufferedReader dis = null;
        try {
            in =(InputStream)(Object) url.openStream();
            dis = new BufferedReader(new InputStreamReader(in));
            int i;
            while ((i =(int)(Object) dis.read()) != -1) {
                buffer.append((char) i);
            }
        } finally {
            closeStream(in);
            closeReader(dis);
        }
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

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass read(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
