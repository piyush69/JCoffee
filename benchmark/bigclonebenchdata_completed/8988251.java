


class c8988251 {

    private static void exportConfigResource(ClassLoader classLoader, String resourceName, String targetFileName) throws Exception {
        InputStream is =(InputStream)(Object) classLoader.getResourceAsStream(resourceName);
        FileOutputStream fos = new FileOutputStream(targetFileName, false);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(is, fos);
        fos.close();
        is.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(String o0, boolean o1){}
	public MyHelperClass close(){ return null; }}
