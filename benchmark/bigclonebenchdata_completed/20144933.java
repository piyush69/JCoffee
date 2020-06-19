import java.io.*;
import java.lang.*;
import java.util.*;



class c20144933 {
public static MyHelperClass attach(HttpServletRequest o0, int o1, String o2, int o3, String o4){ return null; }
//public MyHelperClass attach(HttpServletRequest o0, int o1, String o2, int o3, String o4){ return null; }

    public static String filtraDoc(HttpServletRequest request, String resource, Repository rep, String template) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        int sec = 0;
        try {
            URL url =(URL)(Object) rep.getResource(request, resource);
            if (url == null) {
                return "Documento " + rep.dir + "/" + resource + " no encontrado";
            }
            br = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream(),(String)(Object) rep.encoding));
            String line = br.readLine();
            while (line != null) {
                int pos = line.indexOf("KAttach(");
                if (pos > -1) {
                    sb.append(attach(request, ++sec, line, pos, template));
                } else {
                    line = line.replaceAll("%20", "-");
                    MyHelperClass Config = new MyHelperClass();
                    sb.append(new String(line.getBytes((String)(Object)rep.encoding),(int)(Object) Config.getMng().getEncoding())).append("\n");
                }
                line = br.readLine();
            }
        } finally {
            if (br != null) br.close();
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getEncoding(){ return null; }
	public MyHelperClass getMng(){ return null; }}

class HttpServletRequest {

}

class Repository {
public MyHelperClass encoding;
	public MyHelperClass dir;
public MyHelperClass getResource(HttpServletRequest o0, String o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
