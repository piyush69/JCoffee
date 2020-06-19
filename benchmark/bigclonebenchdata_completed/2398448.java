import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c2398448 {
public MyHelperClass returnErrorResult(String o0){ return null; }
public MyHelperClass JSONTransformer;
	public MyHelperClass url;
	public MyHelperClass handleResultMap(Map o0){ return null; }
	public MyHelperClass prepareInputMap(){ return null; }

    private void handleURL() throws JspException, IOException {
        Map in_map =(Map)(Object) prepareInputMap();
        String in_str =(String)(Object) JSONTransformer.serialize(in_map);
        byte[] input = in_str.getBytes("UTF-8");
        HttpURLConnection conn = (HttpURLConnection) new URL((String)(Object)url).openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setDoInput(true);
        conn.setUseCaches(false);
        conn.connect();
        OutputStream os = conn.getOutputStream();
        os.write(input);
        os.close();
        InputStream is = conn.getInputStream();
        InputStreamReader reader = new InputStreamReader(is, "UTF-8");
        StringBuffer s_buf = new StringBuffer();
        char[] tmp_buf = new char[1024];
        int count;
        while ((count = reader.read(tmp_buf)) != -1) {
            if (count == 0) continue;
            s_buf.append(tmp_buf, 0, count);
        }
        reader.close();
        Map out_map = null;
        try {
            out_map =(Map)(Object) JSONTransformer.parseObject(s_buf.toString());
        } catch (UncheckedIOException e) {
            returnErrorResult(e.getMessage());
        }
        handleResultMap(out_map);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass serialize(Map o0){ return null; }
	public MyHelperClass parseObject(String o0){ return null; }}

class JspException extends Exception{
	public JspException(String errorMessage) { super(errorMessage); }
}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}
