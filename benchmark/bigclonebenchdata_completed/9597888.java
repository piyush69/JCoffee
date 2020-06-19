


class c9597888 {

    private void javaToHtml(File source, File destination) throws IOException {
        Reader reader =(Reader)(Object) new FileReader(source);
        Writer writer =(Writer)(Object) new FileWriter(destination);
        MyHelperClass JavaUtils = new MyHelperClass();
        JavaUtils.writeJava(reader, writer);
        writer.flush();
        writer.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeJava(Reader o0, Writer o1){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Reader {

}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class Writer {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}
