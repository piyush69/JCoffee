


class c21370186 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    public static void replaceAll(File file, String substitute, String substituteReplacement) throws IOException {
        MyHelperClass log = new MyHelperClass();
        log.debug("Replace " + substitute + " by " + substituteReplacement);
        MyHelperClass Pattern = new MyHelperClass();
        Pattern pattern =(Pattern)(Object) Pattern.compile(substitute);
        FileInputStream fis = new FileInputStream(file);
        FileChannel fc =(FileChannel)(Object) fis.getChannel();
        int sz = (int)(int)(Object) fc.size();
        MappedByteBuffer bb =(MappedByteBuffer)(Object) fc.map(MapMode.READ_ONLY, 0, sz);
        MyHelperClass Charset = new MyHelperClass();
        Charset charset =(Charset)(Object) Charset.forName("ISO-8859-15");
        CharsetDecoder decoder =(CharsetDecoder)(Object) charset.newDecoder();
        CharBuffer cb =(CharBuffer)(Object) decoder.decode(bb);
        Matcher matcher =(Matcher)(Object) pattern.matcher(cb);
        String outString =(String)(Object) matcher.replaceAll(substituteReplacement);
//        MyHelperClass log = new MyHelperClass();
        log.debug(outString);
        FileOutputStream fos = new FileOutputStream(file.getAbsolutePath());
        PrintStream ps = new PrintStream(fos);
        ps.print(outString);
        ps.close();
        fos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass forName(String o0){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Pattern {

public MyHelperClass matcher(CharBuffer o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, int o2){ return null; }}

class MappedByteBuffer {

}

class Charset {

public MyHelperClass newDecoder(){ return null; }}

class CharsetDecoder {

public MyHelperClass decode(MappedByteBuffer o0){ return null; }}

class CharBuffer {

}

class Matcher {

public MyHelperClass replaceAll(String o0){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class PrintStream {

PrintStream(FileOutputStream o0){}
	PrintStream(){}
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }}
