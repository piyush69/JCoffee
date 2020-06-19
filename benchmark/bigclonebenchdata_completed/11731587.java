


class c11731587 {

    public File createFileFromClasspathResource(String resourceUrl) throws IOException {
        MyHelperClass File = new MyHelperClass();
        File fichierTest =(File)(Object) File.createTempFile("xmlFieldTestFile", "");
        FileOutputStream fos = new FileOutputStream(fichierTest);
        InputStream is =(InputStream)(Object) XmlFieldDomSelectorTest.class.getResourceAsStream(resourceUrl);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(is, fos);
        is.close();
        fos.close();
        return fichierTest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class XmlFieldDomSelectorTest {

}
