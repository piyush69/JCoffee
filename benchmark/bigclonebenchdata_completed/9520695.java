import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9520695 {
public MyHelperClass _dataurl;
	public MyHelperClass _documentBase;
	public MyHelperClass NULL;
public MyHelperClass[] _errorMsg;
public MyHelperClass _binary;
//	public MyHelperClass _errorMsg;
	public MyHelperClass _parseLine(String o0){ return null; }
	public MyHelperClass _newFile(){ return null; }
	public MyHelperClass _parseBinaryStream(DataInputStream o0){ return null; }

    public void parseFile(String dataurl, URL documentBase)  throws Throwable {
        DataInputStream in;
        MyHelperClass _debug = new MyHelperClass();
        if ((int)(Object)_debug > 2) System.out.println("PlotBox: parseFile(" + dataurl + " " + documentBase + ") _dataurl = " + _dataurl + " " + _documentBase);
        if (dataurl == null || dataurl.length() == 0) {
            in = new DataInputStream(System.in);
        } else {
            try {
                URL url;
                MyHelperClass _documentBase = new MyHelperClass();
                if (documentBase == null && _documentBase != null) {
//                    MyHelperClass _documentBase = new MyHelperClass();
                    documentBase =(URL)(Object) _documentBase;
                }
                if (documentBase == null) {
                    MyHelperClass _dataurl = new MyHelperClass();
                    url = new URL((String)(Object)_dataurl);
                } else {
                    try {
                        url = new URL(documentBase, dataurl);
                    } catch (NullPointerException e) {
                        MyHelperClass _dataurl = new MyHelperClass();
                        url = new URL((String)(Object)_dataurl);
                    }
                }
                in = new DataInputStream(url.openStream());
            } catch (MalformedURLException e) {
                try {
                    in = new DataInputStream(new FileInputStream(dataurl));
                } catch (FileNotFoundException me) {
                    String[] _errorMsg = NULL; //new String[]();
                    _errorMsg = new String[2];
//                    MyHelperClass _errorMsg = new MyHelperClass();
                    _errorMsg[0] = "File not found: " + dataurl;
//                    MyHelperClass _errorMsg = new MyHelperClass();
                    _errorMsg[1] = me.getMessage();
                    return;
                } catch (SecurityException me) {
                    String[] _errorMsg = NULL; //new String[]();
                    _errorMsg = new String[2];
//                    MyHelperClass _errorMsg = new MyHelperClass();
                    _errorMsg[0] = "Security Exception: " + dataurl;
//                    MyHelperClass _errorMsg = new MyHelperClass();
                    _errorMsg[1] = me.getMessage();
                    return;
                }
            } catch (IOException ioe) {
                String[] _errorMsg = NULL; //new String[]();
                _errorMsg = new String[2];
//                MyHelperClass _errorMsg = new MyHelperClass();
                _errorMsg[0] = "Failure opening URL: " + dataurl;
//                MyHelperClass _errorMsg = new MyHelperClass();
                _errorMsg[1] = ioe.getMessage();
                return;
            }
        }
        _newFile();
        try {
            if ((boolean)(Object)_binary) {
                _parseBinaryStream(in);
            } else {
                String line = in.readLine();
                while (line != null) {
                    _parseLine(line);
                    line = in.readLine();
                }
            }
        } catch (MalformedURLException e) {
            _errorMsg =(MyHelperClass[])(Object)(MyHelperClass)(Object) new String[2];
            _errorMsg[0] = "Malformed URL: "(MyHelperClass)(Object) + dataurl;
            _errorMsg[1] =(MyHelperClass)(Object) e.getMessage();
            return;
        } catch (IOException e) {
            _errorMsg =(MyHelperClass[])(Object)(MyHelperClass)(Object) new String[2];
            _errorMsg[0] = "Failure reading data: "(MyHelperClass)(Object) + dataurl;
            _errorMsg[1] =(MyHelperClass)(Object) e.getMessage();
        } catch (PlotDataException e) {
            _errorMsg =(MyHelperClass[])(Object)(MyHelperClass)(Object) new String[2];
            _errorMsg[0] = "Incorrectly formatted plot data in "(MyHelperClass)(Object) + dataurl;
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

class PlotDataException extends Exception{
	public PlotDataException(String errorMessage) { super(errorMessage); }
}
