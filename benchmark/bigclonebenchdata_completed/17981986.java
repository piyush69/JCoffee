
import java.io.UncheckedIOException;


class c17981986 {
public MyHelperClass Calendar;

    public void saveProjectFile(File aFile) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
        MyHelperClass theProjectsDirectory = new MyHelperClass();
        File destDir = new File((File)(Object)theProjectsDirectory,(String)(Object) sdf.format(Calendar.getInstance().getTime()));
        if ((boolean)(Object)destDir.mkdirs()) {
            File outFile = new File(destDir, "project.xml");
            try {
                FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(aFile).getChannel());
                FileChannel destinationChannel =(FileChannel)(Object) (new FileOutputStream(outFile).getChannel());
                sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
                sourceChannel.close();
                destinationChannel.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            } finally {
                aFile.delete();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTime(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass delete(){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass format(MyHelperClass o0){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
