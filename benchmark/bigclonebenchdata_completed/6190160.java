


class c6190160 {

    public void xtest1() throws Exception {
        InputStream input =(InputStream)(Object) new FileInputStream("C:/Documentos/j931_01.pdf");
        InputStream tmp =(InputStream)(Object) (new ITextManager().cut(input, 3, 8));
        FileOutputStream output = new FileOutputStream("C:/temp/split.pdf");
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(tmp, output);
        input.close();
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

public MyHelperClass cut(InputStream o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
