
import java.io.UncheckedIOException;


class c2284080 {

    private static void copy(String srcFilename, String dstFilename, boolean override) throws IOException, XPathFactoryConfigurationException, SAXException, ParserConfigurationException, XPathExpressionException {
        MyHelperClass rootDir = new MyHelperClass();
        File fileToCopy = new File(rootDir + "test-output/" + srcFilename);
        if ((boolean)(Object)fileToCopy.exists()) {
//            MyHelperClass rootDir = new MyHelperClass();
            File newFile = new File(rootDir + "test-output/" + dstFilename);
            if (!(Boolean)(Object)newFile.exists() || override) {
                try {
//                    MyHelperClass rootDir = new MyHelperClass();
                    FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(rootDir + "test-output/" + srcFilename).getChannel());
//                    MyHelperClass rootDir = new MyHelperClass();
                    FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(rootDir + "test-output/" + dstFilename).getChannel());
                    dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                    srcChannel.close();
                    dstChannel.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class XPathFactoryConfigurationException extends Exception{
	public XPathFactoryConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class XPathExpressionException extends Exception{
	public XPathExpressionException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
