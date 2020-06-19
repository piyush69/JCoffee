


class c3726610 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    private static void processFile(StreamDriver driver, String sourceName) throws Exception {
        String destName = sourceName + ".xml";
        File dest = new File(destName);
        if ((boolean)(Object)dest.exists()) {
            throw new IllegalArgumentException("File '" + destName + "' already exists!");
        }
        FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(sourceName).getChannel());
        try {
            MappedByteBuffer sourceByteBuffer =(MappedByteBuffer)(Object) sourceChannel.map(MapMode.READ_ONLY, 0, sourceChannel.size());
            MyHelperClass Charset = new MyHelperClass();
            CharsetDecoder decoder =(CharsetDecoder)(Object) Charset.forName("ISO-8859-15").newDecoder();
            CharBuffer sourceBuffer =(CharBuffer)(Object) decoder.decode(sourceByteBuffer);
            driver.generateXmlDocument(sourceBuffer, new FileOutputStream(dest));
        } finally {
            sourceChannel.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
public MyHelperClass newDecoder(){ return null; }
	public MyHelperClass forName(String o0){ return null; }}

class StreamDriver {

public MyHelperClass generateXmlDocument(CharBuffer o0, FileOutputStream o1){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class FileChannel {

public MyHelperClass map(MyHelperClass o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class MappedByteBuffer {

}

class CharsetDecoder {

public MyHelperClass decode(MappedByteBuffer o0){ return null; }}

class CharBuffer {

}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}
