


class c14341904 {

    private static void copyFile(String from, String to) throws IOException {
        FileReader in = new FileReader(from);
        FileWriter out = new FileWriter(to);
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
