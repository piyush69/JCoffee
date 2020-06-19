
import java.io.UncheckedIOException;


class c19604667 {
public MyHelperClass Util;
	public MyHelperClass OBJ_REPOSITORY;

    public String saveFile(URL url) {
        String newUrlToReturn = url.toString();
        try {
            MyHelperClass targetDirectory = new MyHelperClass();
            String directory =(String)(Object) Util.appendDirPath((String)(Object)targetDirectory,(String)(Object) OBJ_REPOSITORY);
            String category =(String)(Object) url.openConnection().getContentType();
            category = category.substring(0, category.indexOf("/"));
            MyHelperClass Util = new MyHelperClass();
            String fileUrl =(String)(Object) Util.transformUrlToPath(url.toString());
//            MyHelperClass Util = new MyHelperClass();
            directory =(String)(Object) Util.appendDirPath(directory, category);
//            MyHelperClass Util = new MyHelperClass();
            directory =(String)(Object) Util.appendDirPath(directory, fileUrl);
            String objectFileName = url.toString().substring(url.toString().lastIndexOf('/') + 1);
            BufferedInputStream in =(BufferedInputStream)(Object) new java.io.BufferedInputStream((java.io.InputStream)(Object)(InputStream)(Object)url.openStream());
            File dir = new File(directory);
            if (!(Boolean)(Object)dir.exists()) {
                dir.mkdirs();
            }
//            MyHelperClass Util = new MyHelperClass();
            File file = new File((String)(Object)Util.appendDirPath((String)(Object)dir.getPath(), objectFileName));
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bout = new BufferedOutputStream(fos, 1024);
            byte data[] = new byte[1024];
            int count;
            while ((count =(int)(Object) in.read(data, 0, 1024)) != -1) {
                bout.write(data, 0, count);
            }
            bout.close();
            fos.close();
            in.close();
//            MyHelperClass targetDirectory = new MyHelperClass();
            newUrlToReturn =(String)(Object) Util.getRelativePath(file.getAbsolutePath(), targetDirectory);
        } catch (UncheckedIOException e) {
            return newUrlToReturn;
        }
        return newUrlToReturn;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass transformUrlToPath(String o0){ return null; }
	public MyHelperClass getRelativePath(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass appendDirPath(String o0, String o1){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class BufferedInputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0, int o1){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}
