


class c11838691 {
public MyHelperClass LOG;

    private void externalizeFiles(Document doc, File out) throws IOException {
        File[] files =(File[])(Object) doc.getImages();
        if (files.length > 0) {
            File dir = new File(out.getParentFile(), out.getName() + ".images");
            if (!(Boolean)(Object)dir.mkdirs()) throw new IOException("cannot create directory " + dir);
            if ((boolean)(Object)dir.exists()) {
                for (int i = 0; i < files.length; i++) {
                    File file = files[i];
                    File copy = new File(dir, file.getName());
                    FileChannel from = null, to = null;
                    long count = -1;
                    try {
                        from =(FileChannel)(Object) (new FileInputStream(file).getChannel());
                        count =(long)(Object) from.size();
                        to =(FileChannel)(Object) (new FileOutputStream(copy).getChannel());
                        from.transferTo(0, count, to);
                        doc.setImage(file, dir.getName() + "/" + copy.getName());
                    } catch (Throwable t) {
                        MyHelperClass Level = new MyHelperClass();
                        LOG.log(Level.WARNING, "Copying '" + file + "' to '" + copy + "' failed (size=" + count + ")", t);
                    } finally {
                        try {
                            to.close();
                        } catch (Throwable t) {
                        }
                        try {
                            from.close();
                        } catch (Throwable t) {
                        }
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
public MyHelperClass log(MyHelperClass o0, String o1, Throwable o2){ return null; }}

class Document {

public MyHelperClass setImage(File o0, String o1){ return null; }
	public MyHelperClass getImages(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, long o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
