import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7842021 {
public MyHelperClass doParagraph(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass forUser;
	public MyHelperClass doc;
	public MyHelperClass trip;
	public MyHelperClass fis;
	public MyHelperClass doHeader(){ return null; }

    public FileInputStream execute()  throws Throwable {
        MyHelperClass FacesContext = new MyHelperClass();
        FacesContext faces =(FacesContext)(Object) FacesContext.getCurrentInstance();
        HttpServletResponse response = (HttpServletResponse)(HttpServletResponse)(Object) faces.getExternalContext().getResponse();
//        MyHelperClass FacesContext = new MyHelperClass();
        String pdfPath =(String)(Object) FacesContext.getCurrentInstance().getExternalContext().getRealPath("/pdf");
        try {
            FileOutputStream outputStream = new FileOutputStream(pdfPath + "/driveTogether.pdf");
            MyHelperClass doc = new MyHelperClass();
            PdfWriter writer =(PdfWriter)(Object) PdfWriter.getInstance(doc, outputStream);
//            MyHelperClass doc = new MyHelperClass();
            doc.open();
//            MyHelperClass FacesContext = new MyHelperClass();
            String pfad =(String)(Object) FacesContext.getCurrentInstance().getExternalContext().getRealPath("/pdf/template.pdf");
            MyHelperClass logger = new MyHelperClass();
            logger.info("Loading PDF-Template: " + pfad);
            PdfReader reader = new PdfReader(pfad);
            PdfImportedPage page =(PdfImportedPage)(Object) writer.getImportedPage(reader, 1);
            PdfContentByte cb =(PdfContentByte)(Object) writer.getDirectContent();
            cb.addTemplate(page, 0, 0);
            doHeader();
            doParagraph(trip, forUser);
            doc.close();
            fis =(MyHelperClass)(Object) new FileInputStream(pdfPath + "/driveTogether.pdf");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return(FileInputStream)(Object) fis;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass open(){ return null; }
	public MyHelperClass getCurrentInstance(){ return null; }
	public MyHelperClass getRealPath(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getResponse(){ return null; }
	public MyHelperClass getExternalContext(){ return null; }
	public MyHelperClass close(){ return null; }}

class FacesContext {

public MyHelperClass getExternalContext(){ return null; }}

class HttpServletResponse {

}

class PdfWriter {

public MyHelperClass getImportedPage(PdfReader o0, int o1){ return null; }
	public static MyHelperClass getInstance(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass getDirectContent(){ return null; }}

class PdfReader {

PdfReader(String o0){}
	PdfReader(){}}

class PdfImportedPage {

}

class PdfContentByte {

public MyHelperClass addTemplate(PdfImportedPage o0, int o1, int o2){ return null; }}

class DocumentException extends Exception{
	public DocumentException(String errorMessage) { super(errorMessage); }
}
