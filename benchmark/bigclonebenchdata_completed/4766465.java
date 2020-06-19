import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4766465 {
public MyHelperClass StatisticsStorage;
	public MyHelperClass setProgress(int o0){ return null; }
	public MyHelperClass publish(String o0){ return null; }

    private void saveVideo(URL url, DownloadTask task)  throws Throwable {
        if (url == null) {
            return;
        }
        FileOutputStream out = null;
        InputStream stream = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        File file = new File((String)(Object)task.source.getPreferredVideoLocation("mp4"));
        publish("Starting download to file:" + file.getAbsolutePath());
        try {
            out = new FileOutputStream(file);
            URLConnection uc = url.openConnection();
            String contentType = uc.getContentType();
            int length = uc.getContentLength();
           (int)(Object) StatisticsStorage.numberofdownloadedbytes += length;
            publish("Content type: " + contentType + " with a length of " + length);
            stream = uc.getInputStream();
            bis = new BufferedInputStream(stream);
            bos = new BufferedOutputStream(out);
            byte[] bytes = new byte[1024];
            int i = 0;
            long time = System.currentTimeMillis();
            int nextbyte;
            while ((nextbyte = bis.read()) != -1) {
                bos.write(nextbyte);
                i++;
                if (System.currentTimeMillis() - time >= 1000) {
                    publish("downloaded " + (i++) + " bytes of " + length + " bytes.");
                    time = System.currentTimeMillis();
                    int progress = (i - 1) / length;
                    if (progress <= 100 && progress >= 0) setProgress(progress);
                }
            }
            bos.write(bytes);
        } catch (IOException e) {
            System.err.println(url);
            e.printStackTrace();
        } finally {
            try {
                if (out != null) out.close();
                if (stream != null) stream.close();
                if (bis != null) bis.close();
                if (bos != null) bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("done downloading video");
        task.source.setVideo(file.getAbsolutePath());
        if ((boolean)(Object)task.source.hasLyrics()) {
            task.source.getLyrics().setTag("Video", file.getName());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass numberofdownloadedbytes;
public MyHelperClass hasLyrics(){ return null; }
	public MyHelperClass getPreferredVideoLocation(String o0){ return null; }
	public MyHelperClass getLyrics(){ return null; }
	public MyHelperClass setVideo(String o0){ return null; }
	public MyHelperClass setTag(String o0, String o1){ return null; }}

class DownloadTask {
public MyHelperClass source;
}
