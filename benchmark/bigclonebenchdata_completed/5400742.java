


class c5400742 {

    private void appendAndDelete(FileOutputStream outstream, String file) throws FileNotFoundException, IOException {
        FileInputStream input = new FileInputStream(file);
        byte[] buffer = new byte[65536];
        int l;
        while ((l =(int)(Object) input.read(buffer)) != -1) outstream.write(buffer, 0, l);
        input.close();
        new File(file).delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }}
