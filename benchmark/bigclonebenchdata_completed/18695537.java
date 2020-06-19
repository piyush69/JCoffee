import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18695537 {

        public InputSource resolveEntity(String pPublicId, String pSystemId) throws Throwable, SAXException, IOException {
            try {
                URL url = new URL(pSystemId);
                MyHelperClass urlMap = new MyHelperClass();
                String fileName = (String)(String)(Object) urlMap.get(url);
                if (fileName != null) {
                    MyHelperClass schemaDir = new MyHelperClass();
                    FileInputStream istream = new FileInputStream(new File((String)(Object)schemaDir, fileName));
                    InputSource isource = new InputSource(istream);
                    isource.setSystemId(url.toString());
                    return isource;
                }
                String file = url.getFile();
                if (file == null) {
                    file = "";
                } else {
                    int offset = file.lastIndexOf('/');
                    if (offset >= 0) {
                        file = file.substring(offset + 1);
                    }
                }
                if ("".equals(file)) {
                    file = "schema.xsd";
                }
                int offset = file.lastIndexOf('.');
                String prefix;
                String suffix;
                String numAsStr = "";
                if (offset > 0 && offset < file.length()) {
                    prefix = file.substring(0, offset);
                    suffix = file.substring(offset);
                } else {
                    prefix = file;
                    suffix = ".xsd";
                }
                File f;
                for (int num = 1; ; ++num) {
                    MyHelperClass schemaDir = new MyHelperClass();
                    f = new File((String)(Object)schemaDir, prefix + numAsStr + suffix);
                    if (f.exists()) {
                        numAsStr = "_" + num;
                    } else {
                        break;
                    }
                }
                InputStream istream = url.openStream();
                MyHelperClass schemaDir = new MyHelperClass();
                schemaDir.mkdirs();
                FileOutputStream fos = new FileOutputStream(f);
                try {
                    byte[] buffer = new byte[1024];
                    for (; ; ) {
                        int res = istream.read(buffer);
                        if (res == -1) {
                            break;
                        } else if (res > 0) {
                            fos.write(buffer, 0, res);
                        }
                    }
                    istream.close();
                    fos.close();
                    fos = null;
                } finally {
                    if (fos != null) {
                        try {
                            f.delete();
                        } catch (Throwable ignore) {
                        }
                    }
                }
//                MyHelperClass urlMap = new MyHelperClass();
                urlMap.put(url, f.getName());
                InputSource isource = new InputSource(new FileInputStream(f));
                isource.setSystemId(url.toString());
                return isource;
            } catch (Exception e) {
                JaxMeServlet.this.log("Failed to resolve URL " + pSystemId, e);
            }
            return null;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(URL o0, String o1){ return null; }
	public MyHelperClass get(URL o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class InputSource {

InputSource(FileInputStream o0){}
	InputSource(){}
	public MyHelperClass setSystemId(String o0){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class JaxMeServlet {

}
