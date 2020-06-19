import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16805228 {
public MyHelperClass NULL;
public MyHelperClass[] _errorMsg;
//public MyHelperClass _errorMsg;
	public MyHelperClass _parseLine(String o0){ return null; }

public void parseFile(String filespec, URL documentBase)  throws Throwable {
        DataInputStream in = null;
        if (filespec == null || filespec.length() == 0) {
            in = new DataInputStream(System.in);
        } else {
            try {
                URL url = null;
                MyHelperClass _documentBase = new MyHelperClass();
                if (documentBase == null && _documentBase != null) {
//                    MyHelperClass _documentBase = new MyHelperClass();
                    documentBase =(URL)(Object) _documentBase;
                }
                if (documentBase == null) {
                    url = new URL(filespec);
                } else {
                    try {
                        url = new URL(documentBase, filespec);
                    } catch (NullPointerException e) {
                        url = new URL(filespec);
                    }
                }
                in = new DataInputStream(url.openStream());
            } catch (MalformedURLException e) {
                try {
                    in = new DataInputStream(new FileInputStream(filespec));
                } catch (FileNotFoundException me) {
                    String[] _errorMsg = NULL; //new String[]();
                    _errorMsg = new String[2];
//                    MyHelperClass _errorMsg = new MyHelperClass();
                    _errorMsg[0] = "File not found: " + filespec;
//                    MyHelperClass _errorMsg = new MyHelperClass();
                    _errorMsg[1] = me.getMessage();
                    return;
                } catch (SecurityException me) {
                    String[] _errorMsg = NULL; //new String[]();
                    _errorMsg = new String[2];
//                    MyHelperClass _errorMsg = new MyHelperClass();
                    _errorMsg[0] = "Security Exception: " + filespec;
//                    MyHelperClass _errorMsg = new MyHelperClass();
                    _errorMsg[1] = me.getMessage();
                    return;
                }
            } catch (IOException ioe) {
                String[] _errorMsg = NULL; //new String[]();
                _errorMsg = new String[3];
//                MyHelperClass _errorMsg = new MyHelperClass();
                _errorMsg[0] = "Failure opening URL: ";
//                MyHelperClass _errorMsg = new MyHelperClass();
                _errorMsg[1] = " " + filespec;
//                MyHelperClass _errorMsg = new MyHelperClass();
                _errorMsg[2] = ioe.getMessage();
                return;
            }
        }
        try {
            BufferedReader din = new BufferedReader(new InputStreamReader(in));
            String line = din.readLine();
            while (line != null) {
                _parseLine(line);
                line = din.readLine();
            }
        } catch (MalformedURLException e) {
            _errorMsg =(MyHelperClass[])(Object)(MyHelperClass)(Object) new String[2];
            _errorMsg[0] = "Malformed URL: "(MyHelperClass)(Object) + filespec;
            _errorMsg[1] =(MyHelperClass)(Object) e.getMessage();
            return;
        } catch (IOException e) {
            _errorMsg =(MyHelperClass[])(Object)(MyHelperClass)(Object) new String[2];
            _errorMsg[0] = "Failure reading data: "(MyHelperClass)(Object) + filespec;
            _errorMsg[1] =(MyHelperClass)(Object) e.getMessage();
            _errorMsg[1] =(MyHelperClass)(Object) e.getMessage();
        } finally {
            try {
                in.close();
            } catch (IOException me) {
            }
        }
    }
}

// Code below this line has been added to remove errors
class MyHelperClass {

}
