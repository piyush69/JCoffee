import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20377776 {

    public static void assertEquals(String xmlpath, Object actualObject) throws Throwable, Exception {
        InputStreamReader isr;
        try {
            isr = new FileReader(xmlpath);
        } catch (FileNotFoundException e) {
            URL url = AssertHelper.class.getClassLoader().getResource(xmlpath);
            if (null != url) {
                try {
                    isr = new InputStreamReader(url.openStream());
                } catch (Exception e1) {
                    throw new AssertionFailedError("Unable to find output xml : " + xmlpath);
                }
            } else {
                throw new AssertionFailedError("Could not read output xml : " + xmlpath);
            }
        }
        DOMParser parser = new DOMParser();
        parser.parse(new InputSource(isr));
        Document document = parser.getDocument();
        try {
            assertEqual(document.getDocumentElement(), actualObject);
        } catch (AssertionFailedError(Throwable)(Object) e) {
            String message = null;
            if (null != e.getCause()) {
                message = e.getCause().getMessage();
            } else {
                message = e.getMessage();
            }
            StringBuffer sbf = new StringBuffer(message + " \n " + xmlpath);
            MyHelperClass nodestack = new MyHelperClass();
            Iterator iter = nodestack.iterator();
            while (iter.hasNext()) {
                sbf.append(" -> " + ((Object[]) iter.next())[0]);
                iter.remove();
            }
            AssertionFailedError a = new AssertionFailedError(sbf.toString());
            a.setStackTrace(e.getStackTrace());
            throw(Throwable)(Object) a;
        } catch (Exception e) {
            String message = null;
            if (null != e.getCause()) {
                message = e.getCause().getMessage();
            } else {
                message = e.getMessage();
            }
            StringBuffer sbf = new StringBuffer(message + " \n " + xmlpath);
            MyHelperClass nodestack = new MyHelperClass();
            Iterator iter = nodestack.iterator();
            while (iter.hasNext()) {
                sbf.append(" -> " + ((Object[]) iter.next())[0]);
                iter.remove();
            }
            Exception ex = new Exception(sbf.toString());
            ex.setStackTrace(e.getStackTrace());
            throw ex;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass iterator(){ return null; }}

class AssertHelper {

}

class AssertionFailedError {

AssertionFailedError(){}
	AssertionFailedError(String o0){}
	public MyHelperClass getMessage(){ return null; }
	public MyHelperClass getStackTrace(){ return null; }
	public MyHelperClass getCause(){ return null; }}

class DOMParser {

public MyHelperClass getDocument(){ return null; }}

class InputSource {

InputSource(InputStreamReader o0){}
	InputSource(){}}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}
