import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5775448 {

    private void writeData(IBaseType dataType, Writer writer) throws Throwable, XMLStreamException {
        InputStream isData;
        MyHelperClass baseType = new MyHelperClass();
        DataType data = (DataType)(DataType)(Object) baseType;
        if ((boolean)(Object)data.isSetInputStream()) {
            isData =(InputStream)(Object) data.getInputStream();
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(isData, writer);
            } catch (UncheckedIOException e) {
                throw new XMLStreamException("DataType fail writing streaming data ",(IOException)(Object) e);
            }
        } else if ((boolean)(Object)data.isSetOutputStream()) {
            throw new XMLStreamException("DataType only can write streaming input, its an output stream (only for reading) ");
        } else {
            MyHelperClass startElement = new MyHelperClass();
            new CharactersEventImpl(startElement.getLocation(), String.valueOf(baseType.asData()), false).writeAsEncodedUnicode(writer);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, Writer o1){ return null; }
	public MyHelperClass asData(){ return null; }
	public MyHelperClass getLocation(){ return null; }}

class IBaseType {

}

class XMLStreamException extends Exception{
	public XMLStreamException(String errorMessage) { super(errorMessage); }
	XMLStreamException(){}
	XMLStreamException(String o0, IOException o1){}
}

class DataType {

public MyHelperClass isSetOutputStream(){ return null; }
	public MyHelperClass isSetInputStream(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class CharactersEventImpl {

CharactersEventImpl(MyHelperClass o0, String o1, boolean o2){}
	CharactersEventImpl(){}
	public MyHelperClass writeAsEncodedUnicode(Writer o0){ return null; }}
