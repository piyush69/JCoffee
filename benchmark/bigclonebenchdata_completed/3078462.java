
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3078462 {
public MyHelperClass Debug;

        public void handle() {
            FileChannel srcChannel, destChannel;
            MyHelperClass databaseName = new MyHelperClass();
            String destOutFile = databaseName + ".script." + System.currentTimeMillis();
//            MyHelperClass databaseName = new MyHelperClass();
            String destOutFileCompressed = databaseName + ".script." + System.currentTimeMillis() + ".gz";
            MyHelperClass rotateDest = new MyHelperClass();
            if (rotateDest != null) {
//                MyHelperClass rotateDest = new MyHelperClass();
                (new File(rotateDest)).mkdirs();
                if (destOutFile.indexOf("/") != -1) {
//                    MyHelperClass rotateDest = new MyHelperClass();
                    destOutFile = rotateDest + "/" + destOutFile.substring(destOutFile.lastIndexOf("/") + 1);
                }
                if (destOutFileCompressed.indexOf("/") != -1) {
//                    MyHelperClass rotateDest = new MyHelperClass();
                    destOutFileCompressed = rotateDest + "/" + destOutFileCompressed.substring(destOutFileCompressed.lastIndexOf("/") + 1);
                }
            }
            MyHelperClass rotateCompress = new MyHelperClass();
            if ((boolean)(Object)rotateCompress) {
                try {
                    GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(destOutFileCompressed));
//                    MyHelperClass databaseName = new MyHelperClass();
                    FileInputStream in = new FileInputStream(databaseName + ".script");
                    byte buf[] = new byte[1024];
                    int len;
                    while ((len =(int)(Object) in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                    }
                    in.close();
                    out.finish();
                    out.close();
                    buf = null;
                    in = null;
                    out = null;
//                    MyHelperClass databaseName = new MyHelperClass();
                    Debug.debug("Rotated database file '" + databaseName + ".script' to '" + destOutFileCompressed + "'");
                } catch (Exception e) {
//                    MyHelperClass databaseName = new MyHelperClass();
                    Debug.debug("Unable to rotate database file '" + databaseName + ".script': " + e);
                }
            } else {
                try {
//                    MyHelperClass databaseName = new MyHelperClass();
                    srcChannel =(FileChannel)(Object) (new FileInputStream(databaseName + ".script").getChannel());
                } catch (UncheckedIOException e) {
//                    MyHelperClass databaseName = new MyHelperClass();
                    Debug.debug("Unable to read file '" + databaseName + ".script' for database rotation.");
                    return;
                }
                try {
                    destChannel =(FileChannel)(Object) (new FileOutputStream(destOutFile).getChannel());
                } catch (UncheckedIOException e) {
                    MyHelperClass Debug = new MyHelperClass();
                    Debug.debug("Unable to rotate file to '" + destOutFile + "': " + e.getMessage());
                    return;
                }
                try {
                    destChannel.transferFrom(srcChannel, 0, srcChannel.size());
                    srcChannel.close();
                    destChannel.close();
                    srcChannel = null;
                    destChannel = null;
                } catch (UncheckedIOException e) {
                    MyHelperClass Debug = new MyHelperClass();
                    Debug.debug("Unable to copy data for file rotation: " + e.getMessage());
                    return;
                }
//                MyHelperClass databaseName = new MyHelperClass();
                Debug.debug("Rotated database file '" + databaseName + ".script' to '" + destOutFile + "'");
            }
//            MyHelperClass rotateDest = new MyHelperClass();
            if (rotateDest != null) {
                MyHelperClass rotateDays = new MyHelperClass();
                long comparisonTime =(int)(Object) rotateDays * (60 * 60 * 24 * 1000);
                long currentTime = System.currentTimeMillis();
//                MyHelperClass rotateDest = new MyHelperClass();
                File fileList[] =(File[])(Object) (new File(rotateDest)).listFiles();
                DateFormat format1 =(DateFormat)(Object) new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date date = new java.util.Date(currentTime);
                String archiveFile = format1.format((Date)(Object)date).toString() + ".zip";
                MyHelperClass rotateArchive = new MyHelperClass();
                if (rotateArchive != null) {
//                    MyHelperClass rotateArchive = new MyHelperClass();
                    archiveFile = rotateArchive + "/" + archiveFile;
//                    MyHelperClass rotateArchive = new MyHelperClass();
                    (new File(rotateArchive)).mkdirs();
                }
                Archive archive = new Archive(archiveFile);
                for (int i = 0; i < fileList.length; i++) {
                    String currentFilename =(String)(Object) fileList[i].getName();
                    long timeDifference = (currentTime - (long)(Object)fileList[i].lastModified());
//                    MyHelperClass rotateCompress = new MyHelperClass();
                    if (((boolean)(Object)rotateCompress && currentFilename.endsWith(".gz")) || (!(Boolean)(Object)rotateCompress && currentFilename.indexOf(".script.") != -1)) {
//                        MyHelperClass rotateDest = new MyHelperClass();
                        if (rotateDest != null) {
//                            MyHelperClass rotateDest = new MyHelperClass();
                            currentFilename = rotateDest + "/" + currentFilename;
                        }
                        if (timeDifference > comparisonTime) {
                            archive.addFile(fileList[i].getName(), currentFilename);
                            fileList[i].delete();
                        }
                    }
                }
                archive = null;
                fileList = null;
                format1 = null;
                date = null;
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getName(){ return null; }}

class GZIPOutputStream {

GZIPOutputStream(){}
	GZIPOutputStream(FileOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass finish(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DateFormat {

public MyHelperClass format(Date o0){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}}

class Archive {

Archive(String o0){}
	Archive(){}
	public MyHelperClass addFile(MyHelperClass o0, String o1){ return null; }}

class Date {

}
