


class c2221297 {

    public static String getURLContent(String urlToSearchString) throws IOException {
        URL url = new URL(urlToSearchString);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        String encoding =(String)(Object) conn.getContentEncoding();
        if (encoding == null) encoding = "ISO-8859-1";
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), encoding));
        StringBuilder sb = new StringBuilder(16384);
        try {
            String line;
            while ((line =(String)(Object) br.readLine()) != null) {
                sb.append(line);
                sb.append('\n');
            }
        } finally {
            br.close();
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
