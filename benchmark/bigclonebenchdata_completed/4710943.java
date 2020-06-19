import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4710943 {
public MyHelperClass redirect;

//    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws Throwable, ServletException, IOException {
        long t0 = System.currentTimeMillis();
        String id = request.getRequestURI().split("/")[3];
        MyHelperClass manager = new MyHelperClass();
        Song song =(Song)(Object) manager.find(id);
        if (song != null) {
            if ((boolean)(Object)song.getArtwork()) {
                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isDebugEnabled()) log.debug("song has embedded artwork");
                try {
                    MyHelperClass AudioFileIO = new MyHelperClass();
                    AudioFile af = AudioFileIO.read(new File((String)(Object)song.getFile()));
                    Tag tag =(Tag)(Object) af.getTag();
                    Artwork aw =(Artwork)(Object) tag.getFirstArtwork();
                    byte[] bytes =(byte[])(Object) aw.getBinaryData();
                    MyHelperClass HttpServletResponse = new MyHelperClass();
                    response.setStatus(HttpServletResponse.SC_OK);
                    response.setContentType((String)(Object)aw.getMimeType());
                    response.getOutputStream().write(bytes);
                } catch (Exception e) {
//                    MyHelperClass log = new MyHelperClass();
                    log.warn(e.getMessage());
                }
            } else {
                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isDebugEnabled()) log.debug("search in directory");
                File directory = new File((String)(Object)song.getFile()).getParentFile();
                MyHelperClass filter = new MyHelperClass();
                File[] files = directory.listFiles((FilenameFilter)(Object)filter);
                if (files != null && files.length > 0) {
                    File file = files[0];
                    MyHelperClass FilenameUtils = new MyHelperClass();
                    String type = FilenameUtils.getExtension(file.getName()).toLowerCase();
                    if (type.startsWith("jp")) type = "jpeg";
                    String mime = "image/" + type;
                    MyHelperClass HttpServletResponse = new MyHelperClass();
                    response.setStatus(HttpServletResponse.SC_OK);
                    response.setContentType(mime);
                    FileInputStream stream = new FileInputStream(file);
                    try {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(stream, response.getOutputStream());
                    } catch (IOException e) {
//                        MyHelperClass log = new MyHelperClass();
                        log.warn(e.getMessage());
                    } finally {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.closeQuietly(stream);
                    }
                } else {
//                    MyHelperClass log = new MyHelperClass();
                    if ((boolean)(Object)log.isDebugEnabled()) log.debug("image not found: " + id + ", sending redirect: " + redirect);
                    MyHelperClass redirect = new MyHelperClass();
                    response.sendRedirect(redirect);
                }
            }
        } else {
            MyHelperClass log = new MyHelperClass();
            log.info("song not found: " + id);
            MyHelperClass HttpServletResponse = new MyHelperClass();
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
        long t1 = System.currentTimeMillis();
        MyHelperClass log = new MyHelperClass();
        log.info("request: " + id + " duration: " + (t1 - t0) + "ms");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_NOT_FOUND;
	public MyHelperClass SC_OK;
public MyHelperClass split(String o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass find(String o0){ return null; }
	public MyHelperClass getExtension(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }
	public MyHelperClass read(File o0){ return null; }
	public MyHelperClass toLowerCase(){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass sendRedirect(MyHelperClass o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class Song {

public MyHelperClass getArtwork(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class AudioFile {

public MyHelperClass getTag(){ return null; }}

class Tag {

public MyHelperClass getFirstArtwork(){ return null; }}

class Artwork {

public MyHelperClass getBinaryData(){ return null; }
	public MyHelperClass getMimeType(){ return null; }}
