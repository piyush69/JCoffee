import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7844497 {

    public static String simplePostRequest(String path, Map<String, Object> model)  throws Throwable {
        try {
            URL url = new URL(path);
            URLConnection con = url.openConnection();
            con.setDoOutput(true);
            OutputStream out = con.getOutputStream();
            OutputStream bout = new BufferedOutputStream(out);
            OutputStreamWriter writer = new OutputStreamWriter(bout);
            boolean first = true;
            for (String name : model.keySet()) {
                String value = (String) model.get(name);
                if (!first) {
                    writer.write("&");
                    first = false;
                }
                writer.write(name + "=" + value);
            }
            writer.flush();
            writer.close();
            InputStream stream = new BufferedInputStream(con.getInputStream());
            Reader reader = new BufferedReader(new InputStreamReader(stream));
            StringBuilder buffer = new StringBuilder();
            for (int c = reader.read(); c != -1; c = reader.read()) {
                buffer.append((char) c);
            }
            return buffer.toString();
        } catch (MalformedURLException e) {
            throw new CVardbException((String)(Object)e);
        } catch (IOException e) {
            throw new CVardbException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class CVardbException extends Exception{
	public CVardbException(String errorMessage) { super(errorMessage); }
}
