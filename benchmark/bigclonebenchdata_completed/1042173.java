


class c1042173 {

//    @Test
    public void config() throws IOException {
        Reader reader =(Reader)(Object) new FileReader(new File("src/test/resources/test.yml"));
        Writer writer =(Writer)(Object) new FileWriter(new File("src/site/apt/config.apt"));
        writer.write("------\n");
        MyHelperClass FileUtils = new MyHelperClass();
        writer.write((String)(Object)FileUtils.readFully(reader));
        writer.flush();
        writer.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readFully(Reader o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Test {

}

class Reader {

}

class FileReader {

FileReader(){}
	FileReader(File o0){}}

class File {

File(String o0){}
	File(){}}

class Writer {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class FileWriter {

FileWriter(){}
	FileWriter(File o0){}}
