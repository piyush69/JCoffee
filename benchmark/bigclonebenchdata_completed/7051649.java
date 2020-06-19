


class c7051649 {

    private void copyFile(String inputPath, String basis, String filename) throws GLMRessourceFileException {
        try {
            FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(new File(inputPath)).getChannel());
            File target = new File(basis, filename);
            FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(target).getChannel());
            inChannel.transferTo(0, inChannel.size(), outChannel);
            inChannel.close();
            outChannel.close();
        } catch (Exception e) {
            throw new GLMRessourceFileException((String)(Object)7);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class GLMRessourceFileException extends Exception{
	public GLMRessourceFileException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class File {

File(String o0){}
	File(String o0, String o1){}
	File(){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
