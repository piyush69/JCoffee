


class c19883483 {

    public static void copy(String file1, String file2) throws IOException {
        File inputFile = new File(file1);
        File outputFile = new File(file2);
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        System.out.println("Copy file from: " + file1 + " to: " + file2);
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

class File {

File(String o0){}
	File(){}}

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
