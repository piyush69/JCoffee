import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c3799026 {
public MyHelperClass modelDataFile;
	public MyHelperClass setupStream(InputStream o0, String o1){ return null; }

    public void RecordIterator(URL fileUrl, ModelDataFile modelDataFile) throws DataFileException {
        this.modelDataFile =(MyHelperClass)(Object) modelDataFile;
        InputStream urlStream = null;
        try {
            urlStream = fileUrl.openStream();
        } catch (IOException e) {
            throw new DataFileException("Error open URL: " + fileUrl.toString(), e);
        }
        this.setupStream(urlStream, fileUrl.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ModelDataFile {

}

class DataFileException extends Exception{
	public DataFileException(String errorMessage) { super(errorMessage); }
	DataFileException(String o0, IOException o1){}
	DataFileException(){}
}
