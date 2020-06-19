import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13320273 {

//    @Override
    public IMedium createMedium(String urlString, IMetadata optionalMetadata) throws MM4UCannotCreateMediumElementsException {
        MyHelperClass Debug = new MyHelperClass();
        Debug.println("createMedium(): URL: " + urlString);
        IAudio tempAudio = null;
        try {
            String cachedFileUri = null;
            try {
                URL url = new URL(urlString);
                InputStream is = url.openStream();
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                int len;
                while ((len = is.read(buf)) > 0) out.write(buf, 0, len);
                MediaCache cache = new MediaCache();
                cachedFileUri =(String)(Object) cache.addAudio(urlString, out).getURI().substring(5);
            } catch (MalformedURLException e) {
                cachedFileUri = urlString;
            }
            TAudioFileFormat fFormat = null;
            try {
                fFormat = (TAudioFileFormat) (TAudioFileFormat)(Object)new MpegAudioFileReader().getAudioFileFormat(new File(cachedFileUri));
            } catch (Exception e) {
                System.err.println("getAudioFileFormat() failed: " + e);
            }
            MyHelperClass Constants = new MyHelperClass();
            int length =(int)(Object) Constants.UNDEFINED_INTEGER;
            if (fFormat != null) {
                length = Math.round(Integer.valueOf(fFormat.properties().get("duration").toString()).intValue() / 1000);
            }
            MyHelperClass Utilities = new MyHelperClass();
            String mimeType =(String)(Object) Utilities.getMimetype(Utilities.getURISuffix(urlString));
            MyHelperClass IMedium = new MyHelperClass();
            optionalMetadata.addIfNotNull(IMedium.MEDIUM_METADATA_MIMETYPE, mimeType);
//            MyHelperClass Constants = new MyHelperClass();
            if (length != (int)(Object)Constants.UNDEFINED_INTEGER) {
                tempAudio =(IAudio)(Object) new Audio(this, length, urlString, optionalMetadata);
            }
        } catch (Exception exc) {
            exc.printStackTrace();
            return null;
        }
        return (IMedium)(Object)tempAudio;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UNDEFINED_INTEGER;
	public MyHelperClass MEDIUM_METADATA_MIMETYPE;
public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass getURI(){ return null; }
	public MyHelperClass getURISuffix(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass getMimetype(MyHelperClass o0){ return null; }}

class IMetadata {

public MyHelperClass addIfNotNull(MyHelperClass o0, String o1){ return null; }}

class IMedium {

}

class MM4UCannotCreateMediumElementsException extends Exception{
	public MM4UCannotCreateMediumElementsException(String errorMessage) { super(errorMessage); }
}

class IAudio {

}

class MediaCache {

public MyHelperClass addAudio(String o0, ByteArrayOutputStream o1){ return null; }}

class TAudioFileFormat {

public MyHelperClass properties(){ return null; }}

class MpegAudioFileReader {

public MyHelperClass getAudioFileFormat(File o0){ return null; }}

class Audio {

Audio(){}
	Audio(c13320273 o0, int o1, String o2, IMetadata o3){}}
