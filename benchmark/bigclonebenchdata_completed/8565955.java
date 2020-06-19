


class c8565955 {

    private static String webService(String strUrl) {
        StringBuffer buffer = new StringBuffer();
        try {
            URL url = new URL(strUrl);
            InputStream input =(InputStream)(Object) url.openStream();
            String sCurrentLine = "";
            InputStreamReader read = new InputStreamReader(input, "utf-8");
            BufferedReader l_reader =(BufferedReader)(Object) new java.io.BufferedReader((java.io.Reader)(Object)(Reader)(Object)read);
            while ((sCurrentLine =(String)(Object) l_reader.readLine()) != null) {
                buffer.append(sCurrentLine);
            }
            return buffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
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

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class BufferedReader {

public MyHelperClass readLine(){ return null; }}

class Reader {

}
