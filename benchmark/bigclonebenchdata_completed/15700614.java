import java.io.*;
import java.lang.*;
import java.util.*;



class c15700614 {
public MyHelperClass NULL;
public MyHelperClass defaultContext;

    public void open() throws IOException, RecursionException {
        String encoding = null;
        MyHelperClass source = new MyHelperClass();
        if (source != null) {
//            MyHelperClass source = new MyHelperClass();
            Reader sourceReader =(Reader)(Object) source.getCharacterStream();
            if (sourceReader != null) {
                XMLReaderReader readerReader =(XMLReaderReader)(Object) NULL; //new XMLReaderReader();
                if (readerReader == null) readerReader = new XMLReaderReader();
//                MyHelperClass readerReader = new MyHelperClass();
                readerReader.reset(sourceReader, true);
                MyHelperClass isStandalone = new MyHelperClass();
                isStandalone = readerReader.isXMLStandalone();
                XMLReaderReader activeReader =(XMLReaderReader)(Object) NULL; //new XMLReaderReader();
                activeReader = readerReader;
                boolean isOpen =(boolean)(Object) NULL; //new boolean();
                isOpen = true;
                return;
            }
//            MyHelperClass source = new MyHelperClass();
            InputStream in =(InputStream)(Object) source.getByteStream();
            if (in != null) {
                XMLStreamReader streamReader =(XMLStreamReader)(Object) NULL; //new XMLStreamReader();
                if (streamReader == null) streamReader = new XMLStreamReader();
//                MyHelperClass source = new MyHelperClass();
                streamReader.reset(in, source.getEncoding(), true);
                boolean isOpen =(boolean)(Object) NULL; //new boolean();
                isOpen = true;
                MyHelperClass isStandalone = new MyHelperClass();
                isStandalone = streamReader.isXMLStandalone();
                XMLStreamReader activeReader =(XMLStreamReader)(Object) NULL; //new XMLStreamReader();
                activeReader = streamReader;
                return;
            }
            URL url =(URL)(Object) NULL; //new URL();
            url = new URL(defaultContext, source.getSystemId());
            String sysID =(String)(Object) NULL; //new String();
            sysID = url.toString();
//            MyHelperClass source = new MyHelperClass();
            encoding =(String)(Object) source.getEncoding();
        }
        XMLStreamReader streamReader =(XMLStreamReader)(Object) NULL; //new XMLStreamReader();
        if (streamReader == null) streamReader = new XMLStreamReader();
        MyHelperClass url = new MyHelperClass();
        streamReader.reset(url.openStream(), encoding, true);
        MyHelperClass isStandalone = new MyHelperClass();
        isStandalone = streamReader.isXMLStandalone();
        XMLStreamReader activeReader =(XMLStreamReader)(Object) NULL; //new XMLStreamReader();
        activeReader = streamReader;
        boolean isOpen =(boolean)(Object) NULL; //new boolean();
        isOpen = true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isXMLStandalone(){ return null; }
	public MyHelperClass getSystemId(){ return null; }
	public MyHelperClass getByteStream(){ return null; }
	public MyHelperClass getCharacterStream(){ return null; }
	public MyHelperClass getEncoding(){ return null; }
	public MyHelperClass reset(Reader o0, boolean o1){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass reset(MyHelperClass o0, String o1, boolean o2){ return null; }
	public MyHelperClass reset(InputStream o0, MyHelperClass o1, boolean o2){ return null; }}

class RecursionException extends Exception{
	public RecursionException(String errorMessage) { super(errorMessage); }
}

class XMLReaderReader {

public MyHelperClass reset(Reader o0, boolean o1){ return null; }
	public MyHelperClass isXMLStandalone(){ return null; }}

class XMLStreamReader {

public MyHelperClass reset(MyHelperClass o0, String o1, boolean o2){ return null; }
	public MyHelperClass isXMLStandalone(){ return null; }
	public MyHelperClass reset(InputStream o0, MyHelperClass o1, boolean o2){ return null; }}

class URL {

URL(MyHelperClass o0, MyHelperClass o1){}
	URL(){}}
