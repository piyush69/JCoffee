import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16210657 {
public MyHelperClass Malgn;
	public MyHelperClass doc;
	public MyHelperClass encoding;
	public MyHelperClass path;
	public MyHelperClass DocumentBuilderFactory;
	public MyHelperClass setError(String o0){ return null; }

    public void SimpleParser(String filepath) throws Exception {
        this.path =(MyHelperClass)(Object) filepath;
        InputStream is = null;
        try {
            if ((int)(Object)this.path.indexOf("http") == 0) {
                URL url = new URL((String)(Object)this.path);
                is = url.openStream();
            } else if ((int)(Object)this.path.indexOf("<?xml") == 0) {
                is = new ByteArrayInputStream(filepath.getBytes((String)(Object)encoding));
            } else {
                File f = new File((String)(Object)this.path);
                if (!f.exists()) {
                    setError("File not found : " + this.path);
                } else {
                    is = new FileInputStream(f);
                }
            }
            if (is != null) {
                DocumentBuilderFactory dbFactory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder =(DocumentBuilder)(Object) dbFactory.newDocumentBuilder();
                doc = dBuilder.parse(is);
                doc.getDocumentElement().normalize();
            }
        } catch (Exception ex) {
            Malgn.errorLog("{SimpleParser.constructor} Path:" + filepath + " " + ex.getMessage());
            setError("Parser Error : " + ex.getMessage());
        } finally {
            if (is != null) is.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDocumentElement(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass errorLog(String o0){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass normalize(){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}
