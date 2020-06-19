import java.io.*;
import java.lang.*;
import java.util.*;



class c18164929 {

    public static boolean isCodebaseDownloadable(Properties p) {
        class CodebaseData {

            String file;

            boolean success = true;
        }
        String codebase = p.getProperty("java.rmi.server.codebase", null);
        if (null == codebase) {
            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("java.rmi.server.codebase = null (return false)");
            return false;
        }
        try {
            URL cbUrl = new URL(codebase);
            String protocol =(String)(Object) cbUrl.getProtocol();
            String filename =(String)(Object) cbUrl.getFile();
            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isDebugEnabled()) {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("Verifying java.rmi.server.codebase setting(s)...");
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("Codebase = " + cbUrl.toString());
            }
            if (protocol.equals("http")) {
                if (filename.indexOf("http") == -1) {
                    try {
                        int size =(int)(Object) cbUrl.openConnection().getContentLength();
//                        MyHelperClass logger = new MyHelperClass();
                        if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("Checking " + cbUrl + " : OK");
                        return true;
                    } catch (UncheckedIOException e) {
//                        MyHelperClass logger = new MyHelperClass();
                        if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("Checking " + cbUrl + " : FAIL");
                        return false;
                    } finally {
//                        MyHelperClass logger = new MyHelperClass();
                        if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("Verifying java.rmi.server.codebase setting(s)... Done!");
                    }
                } else {
                    ArrayList files = new ArrayList();
                    StringTokenizer st = new StringTokenizer(codebase);
                    URL url = null;
                    String part = null;
                    CodebaseData data = null;
                    while (st.hasMoreTokens()) {
                        part = st.nextToken();
                        url = new URL(part);
                        data = new CodebaseData();
                        try {
                            int len =(int)(Object) url.openConnection().getContentLength();
                            if (len == -1) {
                                data.success = false;
                                data.file = part;
                            } else {
                                data.file = part;
                            }
                        } catch (UncheckedIOException e) {
                            data.success = false;
                        }
                        files.add(data);
                    }
                    String wrong = null;
                    CodebaseData codebaseData = null;
                    boolean allOK = true;
                    int errorFiles = 0;
                    for (int i = 0; i < files.size(); i++) {
                        codebaseData = (CodebaseData) files.get(i);
                        if (!codebaseData.success) {
                            wrong += " " + codebaseData.file;
                            ++errorFiles;
                            allOK = false;
                        }
//                        MyHelperClass logger = new MyHelperClass();
                        if ((boolean)(Object)logger.isDebugEnabled()) logger.debug((i + 1) + ". Checking " + codebaseData.file + " : " + (codebaseData.success ? "OK" : "FAIL"));
                    }
                    if (errorFiles == 0) {
//                        MyHelperClass logger = new MyHelperClass();
                        if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("All entries can be downloaded successfully!");
                    } else {
//                        MyHelperClass logger = new MyHelperClass();
                        logger.error(errorFiles + " of " + files.size() + " entries can *not* be downloaded successfully!");
                    }
//                    MyHelperClass logger = new MyHelperClass();
                    if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("Verifying java.rmi.server.codebase setting(s)... Done!");
                    if (allOK) {
                        return true;
                    } else {
                        return false;
                    }
                }
            } else if (protocol.equalsIgnoreCase("file")) {
//                MyHelperClass logger = new MyHelperClass();
                if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("'file' protocol not supported for JSF");
            }
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.debug(e.getMessage());
            return false;
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
