


class c22602225 {

    private static void writeBinaryFile(String filename, String target) throws IOException {
        File outputFile = new File(target);
        MyHelperClass AgentFilesystem = new MyHelperClass();
        AgentFilesystem.forceDir(outputFile.getParent());
        FileOutputStream output = new FileOutputStream(new File(target));
        FileInputStream inputStream = new FileInputStream(filename);
        byte[] buffer = new byte[4096];
        int bytesRead = 0;
        while ((bytesRead =(int)(Object) inputStream.read(buffer)) > -1) output.write(buffer, 0, bytesRead);
        inputStream.close();
        output.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass forceDir(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getParent(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
