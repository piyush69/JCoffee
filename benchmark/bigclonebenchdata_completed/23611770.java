
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23611770 {
public MyHelperClass Debug;
	public MyHelperClass isFile;
public MyHelperClass rotateDays;
	public MyHelperClass rotateCompress;
	public MyHelperClass rotateDest;
	public MyHelperClass logFile;
	public MyHelperClass rotateArchive;
	public MyHelperClass reconfigureDebug(){ return null; }

                    public void handle() {
                        FileChannel srcChannel, destChannel;
                        MyHelperClass logFile = new MyHelperClass();
                        String destOutFile = logFile + "." + System.currentTimeMillis();
//                        MyHelperClass logFile = new MyHelperClass();
                        String destOutFileCompressed = logFile + "." + System.currentTimeMillis() + ".gz";
                        MyHelperClass rotateDest = new MyHelperClass();
                        if (rotateDest != null) {
//                            MyHelperClass rotateDest = new MyHelperClass();
                            (new File(rotateDest)).mkdirs();
                            if (destOutFile.indexOf("/") != -1) {
//                                MyHelperClass rotateDest = new MyHelperClass();
                                destOutFile = rotateDest + "/" + destOutFile.substring(destOutFile.lastIndexOf("/") + 1);
                            }
                            if (destOutFileCompressed.indexOf("/") != -1) {
//                                MyHelperClass rotateDest = new MyHelperClass();
                                destOutFileCompressed = rotateDest + "/" + destOutFileCompressed.substring(destOutFileCompressed.lastIndexOf("/") + 1);
                            }
                        }
                        MyHelperClass rotateCompress = new MyHelperClass();
                        if ((boolean)(Object)rotateCompress) {
                            try {
                                GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(destOutFileCompressed));
//                                MyHelperClass logFile = new MyHelperClass();
                                FileInputStream in = new FileInputStream(logFile);
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
//                                MyHelperClass logFile = new MyHelperClass();
                                Debug.debug("Rotated log file '" + logFile + "' to '" + destOutFileCompressed + "'");
                            } catch (Exception e) {
//                                MyHelperClass logFile = new MyHelperClass();
                                Debug.debug("Unable to rotate log file '" + logFile + "': " + e);
                            }
                        } else {
                            try {
//                                MyHelperClass logFile = new MyHelperClass();
                                srcChannel =(FileChannel)(Object) (new FileInputStream(logFile).getChannel());
                            } catch (UncheckedIOException e) {
//                                MyHelperClass logFile = new MyHelperClass();
                                Debug.debug("Unable to read log file '" + logFile + "': " + e.getMessage());
                                return;
                            }
                            try {
                                destChannel =(FileChannel)(Object) (new FileOutputStream(destOutFile).getChannel());
                            } catch (UncheckedIOException e) {
                                MyHelperClass Debug = new MyHelperClass();
                                Debug.debug("Unable to rotate log file to '" + destOutFile + "': " + e.getMessage());
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
//                            MyHelperClass logFile = new MyHelperClass();
                            Debug.debug("Rotated log file '" + logFile + "' to '" + destOutFile + "'");
                        }
                        MyHelperClass rotateDelete = new MyHelperClass();
                        if ((Boolean)(Object)rotateDelete && (Boolean)(Object)isFile) {
                            try {
                                MyHelperClass ps = new MyHelperClass();
                                ps.close();
                            } catch (Exception e) {
                            }
                            boolean isFile;// = new boolean();
                            isFile = false;
                            MyHelperClass ps = new MyHelperClass();
                            ps = null;
//                            MyHelperClass logFile = new MyHelperClass();
                            (new File(logFile)).delete();
                            reconfigureDebug();
                        }
                        if (rotateDest != null) {
                            long comparisonTime =(int)(Object) rotateDays * (60 * 60 * 24 * 1000);
                            long currentTime = System.currentTimeMillis();
                            File fileList[] =(File[])(Object) (new File(rotateDest)).listFiles();
                            DateFormat format1 =(DateFormat)(Object) new SimpleDateFormat("yyyy-MM-dd");
                            java.util.Date date = new java.util.Date(currentTime);
                            String archiveFile = format1.format((Date)(Object)date).toString() + ".zip";
                            if (rotateArchive != null) {
                                archiveFile = rotateArchive + "/" + archiveFile;
                                (new File(rotateArchive)).mkdirs();
                            }
                            Archive archive = new Archive(archiveFile);
                            for (int i = 0; i < fileList.length; i++) {
                                String currentFilename =(String)(Object) fileList[i].getName();
                                long timeDifference = (currentTime - (long)(Object)fileList[i].lastModified());
                                if (((boolean)(Object)rotateCompress && currentFilename.endsWith(".gz")) || (!(Boolean)(Object)rotateCompress && currentFilename.indexOf(logFile + ".") != -1)) {
                                    if (rotateDest != null) {
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

public MyHelperClass close(){ return null; }
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

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
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
