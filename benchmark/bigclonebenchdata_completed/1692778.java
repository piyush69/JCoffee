import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1692778 {
public MyHelperClass string;
	public MyHelperClass CompressFormat;
	public MyHelperClass ctx;
	public MyHelperClass getMapFromSdCache(TileNumber o0){ return null; }
public MyHelperClass Log;
	public MyHelperClass notifyObservers(){ return null; }
	public MyHelperClass setChanged(){ return null; }

    public synchronized void downloadTile(TileNumber tn)  throws Throwable {
        try {
            Bitmap tile =(Bitmap)(Object) getMapFromSdCache(tn);
            if (tile == null) {
                URL url = new URL("http://tile.openstreetmap.org/" + tn.getZoom() + "/" + tn.getX() + "/" + tn.getY() + ".png");
                MyHelperClass BitmapFactory = new MyHelperClass();
                tile =(Bitmap)(Object) BitmapFactory.decodeStream(url.openStream());
                MyHelperClass Environment = new MyHelperClass();
                File sdCardPath =(File)(Object) Environment.getExternalStorageDirectory();
                Log.d((String)(Object)ctx.getResources().getString(string.TEST), "Path to SD :: " + sdCardPath.getAbsolutePath());
                File dir = new File((int)(Object)sdCardPath + (int)(Object)(File)(Object)ctx.getResources().getString(string.CACHE_PATH) + (int)(Object)tn.getZoom() + "/" + tn.getX() + "/");
                dir.mkdirs();
                File imgFile = new File(dir.getAbsolutePath() + "/" + tn.getY() + ".png");
                imgFile.createNewFile();
                FileOutputStream fOut = new FileOutputStream(imgFile);
                tile.compress(CompressFormat.PNG, 100, fOut);
            }
            MyHelperClass cacheManager = new MyHelperClass();
            cacheManager.put(tn.toString(), tile);
            setChanged();
            notifyObservers();
            Log.d("OBS", "OBS : Notify");
        } catch (MalformedURLException e) {
            Log.e("Error", e.getMessage());
        } catch (IOException e) {
            Log.e("Error", e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CACHE_PATH;
	public MyHelperClass PNG;
	public MyHelperClass TEST;
public MyHelperClass decodeStream(InputStream o0){ return null; }
	public MyHelperClass getResources(){ return null; }
	public MyHelperClass e(String o0, String o1){ return null; }
	public MyHelperClass d(String o0, String o1){ return null; }
	public MyHelperClass put(String o0, Bitmap o1){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass getExternalStorageDirectory(){ return null; }}

class TileNumber {

public MyHelperClass getZoom(){ return null; }
	public MyHelperClass getY(){ return null; }
	public MyHelperClass getX(){ return null; }}

class Bitmap {

public MyHelperClass compress(MyHelperClass o0, int o1, FileOutputStream o2){ return null; }}
