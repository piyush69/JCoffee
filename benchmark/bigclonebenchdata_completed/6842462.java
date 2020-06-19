import java.io.*;
import java.lang.*;
import java.util.*;



class c6842462 {
public MyHelperClass NULL;
public MyHelperClass getCacheDir(){ return null; }

    private void playAudio(String mediaUrl) {
        try {
            URLConnection cn =(URLConnection)(Object) (new URL(mediaUrl).openConnection());
            InputStream is =(InputStream)(Object) cn.getInputStream();
            File mediaFile =(File)(Object) NULL; //new File();
            mediaFile = new File((String)(Object)this.getCacheDir(), "mediafile");
//            MyHelperClass mediaFile = new MyHelperClass();
            FileOutputStream fos = new FileOutputStream((String)(Object)mediaFile);
            byte buf[] = new byte[16 * 1024];
            MyHelperClass Log = new MyHelperClass();
            Log.i("FileOutputStream", "Download");
            do {
                int numread = is.read(buf);
                if (numread <= 0) break;
                fos.write(buf, 0, numread);
            } while (true);
            fos.flush();
            fos.close();
//            MyHelperClass Log = new MyHelperClass();
            Log.i("FileOutputStream", "Saved");
            OnCompletionListener listener = new OnCompletionListener() {

                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                    Log.i("MediaPlayer.OnCompletionListener", "MediaPlayer Released");
                }
            };
            MyHelperClass mixPlayer = new MyHelperClass();
            mixPlayer.setOnCompletionListener(listener);
//            MyHelperClass mediaFile = new MyHelperClass();
            FileInputStream fis = new FileInputStream((String)(Object)mediaFile);
//            MyHelperClass mixPlayer = new MyHelperClass();
            mixPlayer.setDataSource(fis.getFD());
//            MyHelperClass mixPlayer = new MyHelperClass();
            mixPlayer.prepare();
//            MyHelperClass Log = new MyHelperClass();
            Log.i("MediaPlayer", "Start Player");
            boolean loading =(boolean)(Object) NULL; //new boolean();
            loading = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setOnCompletionListener(OnCompletionListener o0){ return null; }
	public MyHelperClass i(String o0, String o1){ return null; }
	public MyHelperClass setDataSource(FileDescriptor o0){ return null; }
	public MyHelperClass prepare(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class OnCompletionListener {

}

class MediaPlayer {

public MyHelperClass release(){ return null; }}
