


class c6190161 {

    public void xtest2() throws Exception {
        InputStream input1 =(InputStream)(Object) new FileInputStream("C:/Documentos/j931_01.pdf");
        InputStream input2 =(InputStream)(Object) new FileInputStream("C:/Documentos/j931_02.pdf");
        InputStream tmp =(InputStream)(Object) (new ITextManager().merge(new InputStream[] { input1, input2 }));
        FileOutputStream output = new FileOutputStream("C:/temp/split.pdf");
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(tmp, output);
        input1.close();
        input2.close();
        tmp.close();
        output.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class ITextManager {

public MyHelperClass merge(InputStream[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
