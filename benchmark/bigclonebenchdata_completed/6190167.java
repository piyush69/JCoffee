


class c6190167 {

    public void xtest11() throws Exception {
        PDFManager manager =(PDFManager)(Object) new ITextManager();
        InputStream pdf =(InputStream)(Object) new FileInputStream("/tmp/UML2.pdf");
        InputStream page1 =(InputStream)(Object) manager.cut(pdf, 1, 1);
        OutputStream outputStream =(OutputStream)(Object) new FileOutputStream("/tmp/page.pdf");
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(page1, outputStream);
        outputStream.close();
        pdf.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class PDFManager {

public MyHelperClass cut(InputStream o0, int o1, int o2){ return null; }}

class ITextManager {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
