


class c9592646 {

    public static void copy(String path1, String path2) throws IOException {
        FileReader in = new FileReader(path1);
        FileWriter out = new FileWriter(path2);
        int c;
        while ((c =(int)(Object) in.read()) != -1) out.write(c);
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileReader {

FileReader(String o0){}
	FileReader(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
