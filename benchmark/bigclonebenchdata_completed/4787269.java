


class c4787269 {

    public static String getDeclaredXMLEncoding(URL url) throws IOException {
        InputStream stream =(InputStream)(Object) url.openStream();
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(stream));
        String firstLine =(String)(Object) buffReader.readLine();
        if (firstLine == null) {
            MyHelperClass SYSTEM_ENCODING = new MyHelperClass();
            return (String)(Object)SYSTEM_ENCODING;
        }
        int piStart = firstLine.indexOf("<?xml version=\"1.0\"");
        if (piStart != -1) {
            int attributeStart = firstLine.indexOf("encoding=\"");
            if (attributeStart >= 0) {
                int nextQuote = firstLine.indexOf('"', attributeStart + 10);
                if (nextQuote >= 0) {
                    String encoding = firstLine.substring(attributeStart + 10, nextQuote);
                    return encoding.trim();
                }
            }
        }
        stream.close();
        MyHelperClass SYSTEM_ENCODING = new MyHelperClass();
        return (String)(Object)SYSTEM_ENCODING;
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

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
