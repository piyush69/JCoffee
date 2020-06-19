


class c19034719 {
public static MyHelperClass escape(MyHelperClass o0){ return null; }
//public MyHelperClass escape(MyHelperClass o0){ return null; }
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    public static void fillTemplate(String sourceFileName, String targetFileName, Map values) throws IOException {
        MyHelperClass File = new MyHelperClass();
        File targetDirectory = new File(targetFileName.substring(0, targetFileName.lastIndexOf((int)(Object)File.separator)));
        targetDirectory.mkdirs();
        File file = new File(sourceFileName);
        FileInputStream fis = new FileInputStream(file);
        FileChannel fc =(FileChannel)(Object) fis.getChannel();
        int sz = (int)(int)(Object) fc.size();
        MappedByteBuffer bb =(MappedByteBuffer)(Object) fc.map(MapMode.READ_ONLY, 0, sz);
        MyHelperClass Charset = new MyHelperClass();
        Charset charset =(Charset)(Object) Charset.forName("ISO-8859-15");
        CharsetDecoder decoder =(CharsetDecoder)(Object) charset.newDecoder();
        CharBuffer cb =(CharBuffer)(Object) decoder.decode(bb);
        String inString = cb.toString();
        fis.close();
        fc.close();
        Set keys =(Set)(Object) values.keySet();
        for (Object k : (Object[])(Object)keys) {
            inString = inString.replace((char)(Object)(String) k,(char)(Object) escape(values.get(k)));
        }
        FileOutputStream fos = new FileOutputStream(targetFileName);
        PrintStream ps = new PrintStream(fos);
        ps.print(inString);
        fos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
	public MyHelperClass separator;
public MyHelperClass forName(String o0){ return null; }}

class Map {

public MyHelperClass get(Object o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, int o2){ return null; }
	public MyHelperClass size(){ return null; }}

class MappedByteBuffer {

}

class Charset {

public MyHelperClass newDecoder(){ return null; }}

class CharsetDecoder {

public MyHelperClass decode(MappedByteBuffer o0){ return null; }}

class CharBuffer {

}

class Set {

}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(String o0){}
	public MyHelperClass close(){ return null; }}

class PrintStream {

PrintStream(FileOutputStream o0){}
	PrintStream(){}
	public MyHelperClass print(String o0){ return null; }}
