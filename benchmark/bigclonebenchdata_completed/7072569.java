import java.io.*;
import java.lang.*;
import java.util.*;



class c7072569 {

    public StringBuffer get(URL url) throws IOException {
        StringBuffer pageContents = new StringBuffer();
        PDFReader reader = new PDFReader(url.openStream());
        reader.open();
        int pageCount =(int)(Object) reader.getNumberOfPages();
        for (int i = 0; i < pageCount; i++) pageContents.append(new String((byte[])(Object)reader.extractTextFromPage(i).getBytes(), "UTF-8"));
        reader.close();
        return pageContents;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class PDFReader {

PDFReader(MyHelperClass o0){}
	PDFReader(){}
	public MyHelperClass getNumberOfPages(){ return null; }
	public MyHelperClass open(){ return null; }
	public MyHelperClass extractTextFromPage(int o0){ return null; }
	public MyHelperClass close(){ return null; }}
