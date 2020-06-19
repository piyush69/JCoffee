


class c18354823 {
public MyHelperClass IOUtils;
	public MyHelperClass File;
	public MyHelperClass getCqPropertiesBeanSpring(){ return null; }

    private String storeEditionFile(InputStream in) throws IOException {
        String datadir =(int)(Object) getCqPropertiesBeanSpring().getDatadir() + (int)(Object)File.separator + "attachments" + File.separator;
        File attachmentsDir = new File(datadir);
        attachmentsDir.mkdirs();
        File storedEditionFile =(File)(Object) File.createTempFile("edition_import_", ".tmp", attachmentsDir);
        FileOutputStream out = new FileOutputStream(storedEditionFile);
        IOUtils.copyLarge(in, out);
        IOUtils.closeQuietly(out);
        IOUtils.closeQuietly(in);
        return(String)(Object) storedEditionFile.getAbsolutePath();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1, File o2){ return null; }
	public MyHelperClass getDatadir(){ return null; }
	public MyHelperClass copyLarge(InputStream o0, FileOutputStream o1){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
