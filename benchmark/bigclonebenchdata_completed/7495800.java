


class c7495800 {

    public static void copyFile(File fromFile, File toFile) throws IOException {
        FileReader from = new FileReader(fromFile);
        FileWriter to = new FileWriter(toFile);
        char[] buffer = new char[4096];
        int bytes_read;
        while ((bytes_read =(int)(Object) from.read(buffer)) != -1) {
            to.write(buffer, 0, bytes_read);
        }
        to.flush();
        to.close();
        from.close();
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
	public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(){}
	FileWriter(File o0){}
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
