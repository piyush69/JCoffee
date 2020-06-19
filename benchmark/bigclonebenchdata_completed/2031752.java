


class c2031752 {

    public String readFile(String filename) throws UnsupportedEncodingException, FileNotFoundException, IOException {
        MyHelperClass baseDir = new MyHelperClass();
        File f = new File(baseDir);
        f = new File(f, filename);
        StringWriter w = new StringWriter();
        Reader fr =(Reader)(Object) new InputStreamReader(new FileInputStream(f), "UTF-8");
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(fr, w);
        fr.close();
        w.close();
        String contents = w.toString();
        return contents;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(Reader o0, StringWriter o1){ return null; }}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(File o0, String o1){}
	File(MyHelperClass o0){}
	File(){}}

class StringWriter {

public MyHelperClass close(){ return null; }}

class Reader {

public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(FileInputStream o0, String o1){}
	InputStreamReader(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
