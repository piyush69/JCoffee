


class c3993124 {
public MyHelperClass close(FileOutputStream o0){ return null; }

    private File getTempFile(DigitalObject object, String pid) throws Exception {
        MyHelperClass tmpDir = new MyHelperClass();
        File directory = new File((File)(Object)tmpDir,(String)(Object) object.getId());
        File target = new File(directory, pid);
        if (!(Boolean)(Object)target.exists()) {
            target.getParentFile().mkdirs();
            target.createNewFile();
        }
        Payload payload =(Payload)(Object) object.getPayload(pid);
        InputStream in =(InputStream)(Object) payload.open();
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(target);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(in, out);
        } catch (Exception ex) {
            close(out);
            target.delete();
            payload.close();
            throw ex;
        }
        close(out);
        payload.close();
        return target;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass copyLarge(InputStream o0, FileOutputStream o1){ return null; }}

class DigitalObject {

public MyHelperClass getId(){ return null; }
	public MyHelperClass getPayload(String o0){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }}

class Payload {

public MyHelperClass open(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
