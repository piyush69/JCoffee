


class c9061980 {

    public static void copyFile(String source, String destination, TimeSlotTracker timeSlotTracker) {
        MyHelperClass LOG = new MyHelperClass();
        LOG.info("copying [" + source + "] to [" + destination + "]");
        BufferedInputStream sourceStream = null;
        BufferedOutputStream destStream = null;
        try {
            File destinationFile = new File(destination);
            if ((boolean)(Object)destinationFile.exists()) {
                destinationFile.delete();
            }
            sourceStream = new BufferedInputStream(new FileInputStream(source));
            destStream = new BufferedOutputStream(new FileOutputStream(destinationFile));
            int readByte;
            while ((readByte =(int)(Object) sourceStream.read()) > 0) {
                destStream.write(readByte);
            }
            Object[] arg = { destinationFile.getName() };
            String msg =(String)(Object) timeSlotTracker.getString("datasource.xml.copyFile.copied", arg);
//            MyHelperClass LOG = new MyHelperClass();
            LOG.fine(msg);
        } catch (Exception e) {
            Object[] expArgs = { e.getMessage() };
            String expMsg =(String)(Object) timeSlotTracker.getString("datasource.xml.copyFile.exception", expArgs);
            timeSlotTracker.errorLog(expMsg);
            timeSlotTracker.errorLog(e);
        } finally {
            try {
                if (destStream != null) {
                    destStream.close();
                }
                if (sourceStream != null) {
                    sourceStream.close();
                }
            } catch (Exception e) {
                Object[] expArgs = { e.getMessage() };
                String expMsg =(String)(Object) timeSlotTracker.getString("datasource.xml.copyFile.exception", expArgs);
                timeSlotTracker.errorLog(expMsg);
                timeSlotTracker.errorLog(e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class TimeSlotTracker {

public MyHelperClass errorLog(String o0){ return null; }
	public MyHelperClass errorLog(Exception o0){ return null; }
	public MyHelperClass getString(String o0, Object[] o1){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
