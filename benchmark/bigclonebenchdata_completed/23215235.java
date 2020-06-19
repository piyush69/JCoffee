import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23215235 {
public MyHelperClass zipFileName;
	public MyHelperClass parseAlertFiles(){ return null; }
	public MyHelperClass deleteAlertFiles(){ return null; }
	public MyHelperClass unzipNativeFormatFile(InputStream o0){ return null; }

    public void readFile(URL url) throws PedroException, IOException, ParserConfigurationException, SAXException {
        this.zipFileName =(MyHelperClass)(Object) url.toString();
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        unzipNativeFormatFile(inputStream);
        parseAlertFiles();
        deleteAlertFiles();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class PedroException extends Exception{
	public PedroException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
