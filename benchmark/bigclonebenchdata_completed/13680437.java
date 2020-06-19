


class c13680437 {
public static MyHelperClass writeRawBytes(String o0, String o1){ return null; }
//public MyHelperClass writeRawBytes(String o0, String o1){ return null; }

    public static void writeFromURL(String urlstr, String filename) throws Exception {
        URL url = new URL(urlstr);
        InputStream in =(InputStream)(Object) url.openStream();
        BufferedReader bf = null;
        StringBuffer sb = new StringBuffer();
        try {
            bf = new BufferedReader(new InputStreamReader(in, "latin1"));
            String s;
            while (true) {
                s =(String)(Object) bf.readLine();
                if (s != null) {
                    sb.append(s);
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            throw e;
        } finally {
            bf.close();
        }
        writeRawBytes(sb.toString(), filename);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}
