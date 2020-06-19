


class c18034383 {

    public static File copy(String inFileName, String outFileName) throws IOException {
        File inputFile = new File(inFileName);
        File outputFile = new File(outFileName);
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c =(int)(Object) in.read()) != -1) out.write(c);
        in.close();
        out.close();
        return outputFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}}

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
