


class c20492893 {

    public static String loadUrlContentAsString(URL url) throws IOException {
        char[] buf = new char[2048];
        StringBuffer ret = new StringBuffer();
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        for (int chars =(int)(Object) reader.read(buf); chars != -1; chars =(int)(Object) reader.read(buf)) {
            ret.append(buf, 0, chars);
        }
        reader.close();
        return ret.toString();
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
