import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17253878 {

    public void onUpload$btnFileUpload(UploadEvent ue)  throws Throwable {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        if (ue == null) {
            System.out.println("unable to upload file");
            return;
        } else {
            System.out.println("fileUploaded()");
        }
        try {
            Media m =(Media)(Object) ue.getMedia();
            System.out.println("m.getContentType(): " + m.getContentType());
            System.out.println("m.getFormat(): " + m.getFormat());
            try {
                InputStream is =(InputStream)(Object) m.getStreamData();
                in = new BufferedInputStream(is);
                MyHelperClass UPLOAD_PATH = new MyHelperClass();
                File baseDir = new File((String)(Object)UPLOAD_PATH);
                if (!baseDir.exists()) {
                    baseDir.mkdirs();
                }
//                MyHelperClass UPLOAD_PATH = new MyHelperClass();
                final File file = new File((String)(Object)(int)(Object)UPLOAD_PATH + (int)(Object)m.getName());
                OutputStream fout = new FileOutputStream(file);
                out = new BufferedOutputStream(fout);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, out);
                if (m.getFormat().equals("zip") || m.getFormat().equals("x-gzip")) {
                    final String filename =(String)(Object) m.getName();
                    MyHelperClass Messagebox = new MyHelperClass();
                    Messagebox.show("Archive file detected. Would you like to unzip this file?", "ALA Spatial Portal",(int)(Object) Messagebox.YES + (int)(Object)Messagebox.NO, Messagebox.QUESTION, new EventListener() {

//                        @Override
                        public void onEvent(Event event) throws Exception {
                            try {
                                int response = ((Integer)(Integer)(Object) event.getData()).intValue();
                                MyHelperClass Messagebox = new MyHelperClass();
                                if (response == (int)(Object)Messagebox.YES) {
                                    MyHelperClass UPLOAD_PATH = new MyHelperClass();
                                    System.out.println("unzipping file to: " + UPLOAD_PATH);
//                                    MyHelperClass UPLOAD_PATH = new MyHelperClass();
                                    MyHelperClass Zipper = new MyHelperClass();
                                    boolean success =(boolean)(Object) Zipper.unzipFile(filename, new FileInputStream(file), UPLOAD_PATH, false);
                                    if (success) {
//                                        MyHelperClass Messagebox = new MyHelperClass();
                                        Messagebox.show("File unzipped: '" + filename + "'");
                                    } else {
//                                        MyHelperClass Messagebox = new MyHelperClass();
                                        Messagebox.show("Unable to unzip '" + filename + "' ");
                                    }
                                } else {
                                    System.out.println("leaving archive file alone");
                                }
                            } catch (NumberFormatException nfe) {
                                System.out.println("Not a valid response");
                            }
                        }
                    });
                } else {
                    MyHelperClass Messagebox = new MyHelperClass();
                    Messagebox.show("File '" + m.getName() + "' successfully uploaded");
                }
            } catch (IOException e) {
                System.out.println("IO Exception while saving file: ");
                e.printStackTrace(System.out);
            } catch (Exception e) {
                System.out.println("General Exception: ");
                e.printStackTrace(System.out);
            } finally {
                try {
                    if (out != null) {
                        out.close();
                    }
                    if (in != null) {
                        in.close();
                    }
                } catch (IOException e) {
                    System.out.println("IO Exception while closing stream: ");
                    e.printStackTrace(System.out);
                }
            }
        } catch (Exception e) {
            System.out.println("Error uploading file.");
            e.printStackTrace(System.out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass YES;
	public MyHelperClass NO;
	public MyHelperClass QUESTION;
public MyHelperClass copy(BufferedInputStream o0, BufferedOutputStream o1){ return null; }
	public MyHelperClass show(String o0){ return null; }
	public MyHelperClass unzipFile(String o0, FileInputStream o1, MyHelperClass o2, boolean o3){ return null; }
	public MyHelperClass show(String o0, String o1, int o2, MyHelperClass o3,  EventListener o4){ return null; }}

class UploadEvent {

public MyHelperClass getMedia(){ return null; }}

class Media {

public MyHelperClass getStreamData(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getFormat(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class Event {

public MyHelperClass getData(){ return null; }}
