


class c4208869 {

    public static void putNextJarEntry(JarOutputStream modelStream, String name, File file) throws IOException {
        JarEntry entry = new JarEntry(name);
        entry.setSize(file.length());
        modelStream.putNextEntry(entry);
        InputStream fileStream =(InputStream)(Object) new BufferedInputStream(new FileInputStream(file));
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(fileStream, modelStream);
        fileStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, JarOutputStream o1){ return null; }}

class JarOutputStream {

public MyHelperClass putNextEntry(JarEntry o0){ return null; }}

class File {

public MyHelperClass length(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JarEntry {

JarEntry(String o0){}
	JarEntry(){}
	public MyHelperClass setSize(MyHelperClass o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
