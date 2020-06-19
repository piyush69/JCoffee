


class c21195765 {

    private void writeFile(FileInputStream inFile, FileOutputStream outFile) throws IOException {
        byte[] buf = new byte[2048];
        int read;
        while ((read =(int)(Object) inFile.read(buf)) > 0) outFile.write(buf, 0, read);
        inFile.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
