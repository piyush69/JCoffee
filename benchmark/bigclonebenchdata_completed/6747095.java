import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6747095 {
public MyHelperClass NULL;

    public void notifyTerminated(Writer r)  throws Throwable {
        MyHelperClass all_writers = new MyHelperClass();
        all_writers.remove(r);
//        MyHelperClass all_writers = new MyHelperClass();
        if ((boolean)(Object)all_writers.isEmpty()) {
            boolean all_terminated =(boolean)(Object) NULL; //new boolean();
            all_terminated = true;
            MyHelperClass open_files = new MyHelperClass();
            Iterator iterator =(Iterator)(Object) open_files.iterator();
            while (iterator.hasNext()) {
                FileWriter.FileChunk fc = (FileWriter.FileChunk) iterator.next();
                do {
                    try {
                        fc.stream.flush();
                        fc.stream.close();
                    } catch (IOException e) {
                    }
                    fc = fc.next;
                } while (fc != null);
            }
//            MyHelperClass open_files = new MyHelperClass();
            iterator =(Iterator)(Object) open_files.iterator();
            boolean all_ok = true;
            while (iterator.hasNext()) {
                FileWriter.FileChunk fc = (FileWriter.FileChunk) iterator.next();
                MyHelperClass logger = new MyHelperClass();
                logger.logComment("File chunk <" + fc.name + "> " + fc.start_byte + " " + fc.position + " " + fc.actual_file);
                boolean ok = true;
                while (fc.next != null) {
                    ok = ok && (fc.start_byte + fc.actual_file.length()) == fc.next.start_byte;
                    fc = fc.next;
                }
                if (ok) {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.logComment("Received file <" + fc.name + "> is contiguous (and hopefully complete)");
                } else {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.logError("Received file <" + fc.name + "> is NOT contiguous");
                    all_ok = false;
                }
            }
            if (all_ok) {
                byte[] buffer = new byte[16384];
//                MyHelperClass open_files = new MyHelperClass();
                iterator =(Iterator)(Object) open_files.iterator();
                while (iterator.hasNext()) {
                    FileWriter.FileChunk fc = (FileWriter.FileChunk) iterator.next();
                    try {
                        if (fc.next != null) {
                            FileOutputStream fos = new FileOutputStream(fc.actual_file, true);
                            fc = fc.next;
                            while (fc != null) {
                                FileInputStream fis = new FileInputStream(fc.actual_file);
                                int actually_read = fis.read(buffer);
                                while (actually_read != -1) {
                                    fos.write(buffer, 0, actually_read);
                                    actually_read = fis.read(buffer);
                                }
                                fc.actual_file.delete();
                                fc = fc.next;
                            }
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            MyHelperClass fte = new MyHelperClass();
            fte.allWritersTerminated();
//            MyHelperClass fte = new MyHelperClass();
            fte = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass remove(Writer o0){ return null; }
	public MyHelperClass allWritersTerminated(){ return null; }
	public MyHelperClass iterator(){ return null; }}

class FileChunk {

}
