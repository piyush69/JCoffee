


class c12626919 {

    public void xtestFile1() throws Exception {
        MyHelperClass IOTest = new MyHelperClass();
        InputStream inputStream =(InputStream)(Object) new FileInputStream(IOTest.FILE);
        OutputStream outputStream =(OutputStream)(Object) new FileOutputStream("C:/Temp/testFile1.mp4");
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(inputStream, outputStream);
        inputStream.close();
        outputStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FILE;
public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
