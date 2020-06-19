


class c16499420 {
public MyHelperClass IOUtils;

    private void saveFile(InputStream in, String fullPath) {
        try {
            File sysfile = new File(fullPath);
            if (!(Boolean)(Object)sysfile.exists()) {
                sysfile.createNewFile();
            }
            java.io.OutputStream out =(java.io.OutputStream)(Object)(OutputStream)(Object) new FileOutputStream(sysfile);
            IOUtils.copy(in,(OutputStream)(Object) out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class OutputStream {

}
