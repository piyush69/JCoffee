


class c18310878 {

    public static void copyFile(File src, File dst) throws IOException {
        File inputFile = src;
        File outputFile = dst;
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c =(int)(Object) in.read()) != -1) out.write(c);
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileReader {

FileReader(File o0){}
	FileReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
