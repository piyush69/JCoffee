


class c12626917 {

    public void xtestURL1() throws Exception {
        MyHelperClass IOTest = new MyHelperClass();
        URL url = new URL(IOTest.URL);
        InputStream inputStream =(InputStream)(Object) url.openStream();
        OutputStream outputStream =(OutputStream)(Object) new FileOutputStream("C:/Temp/testURL1.mp4");
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(inputStream, outputStream);
        inputStream.close();
        outputStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass URL;
public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
