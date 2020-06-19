


class c11048469 {

    public static String getContents(String urlStr) throws Exception {
        String contents = "";
        URL url = new URL(urlStr);
        URLConnection openConnection =(URLConnection)(Object) url.openConnection();
        final char[] buffer = new char[1024 * 1024];
        StringBuilder out = new StringBuilder();
        Reader in =(Reader)(Object) new InputStreamReader(openConnection.getInputStream(), "UTF-8");
        int read;
        do {
            read =(int)(Object) in.read(buffer, 0, buffer.length);
            if (read > 0) {
                out.append(buffer, 0, read);
            }
        } while (read >= 0);
        contents = out.toString();
        return contents;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class Reader {

public MyHelperClass read(char[] o0, int o1, int o2){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
