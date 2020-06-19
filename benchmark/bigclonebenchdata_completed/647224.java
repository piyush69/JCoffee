


class c647224 {

    public void uploadFile(File inputFile, String targetFile) throws IOException {
        System.out.println("Uploading " + inputFile.getName() + " to " + targetFile);
        File outputFile = new File(targetFile);
        if (targetFile.endsWith("/")) {
            outputFile = new File(outputFile, inputFile.getName());
        } else if ((boolean)(Object)outputFile.getParentFile().exists() == false) {
            outputFile.getParentFile().mkdirs();
        }
        if ((boolean)(Object)inputFile.renameTo(outputFile) == false) {
            InputStream in =(InputStream)(Object) new FileInputStream(inputFile);
            OutputStream out =(OutputStream)(Object) new FileOutputStream(outputFile);
            byte[] line = new byte[16384];
            int bytes = -1;
            while ((bytes =(int)(Object) in.read(line)) != -1) out.write(line, 0, bytes);
            in.close();
            out.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

File(){}
	File(String o0){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
