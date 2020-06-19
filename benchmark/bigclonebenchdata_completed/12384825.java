


class c12384825 {

    public static void copyTo(File inFile, File outFile) throws IOException {
        char[] cbuff = new char[32768];
        BufferedReader reader = new BufferedReader(new FileReader(inFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
        int readedBytes = 0;
        long absWrittenBytes = 0;
        while ((readedBytes =(int)(Object) reader.read(cbuff, 0, cbuff.length)) != -1) {
            writer.write(cbuff, 0, readedBytes);
            absWrittenBytes += readedBytes;
        }
        reader.close();
        writer.close();
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

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(char[] o0, int o1, int o2){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}
