import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22924615 {
public MyHelperClass NULL;
public MyHelperClass imageCache;
	public MyHelperClass url;
	public MyHelperClass log(String o0){ return null; }

//            @Override
            public void run()  throws Throwable {
                try {
                    BitmapDrawable bitmapDrawable =(BitmapDrawable)(Object) NULL; //new BitmapDrawable();
                    bitmapDrawable = new BitmapDrawable(new URL((String)(Object)url).openStream());
                    BitmapDrawable id =(BitmapDrawable)(Object) NULL; //new BitmapDrawable();
                    imageCache.put((MyHelperClass)(Object)id, new SoftReference((MyHelperClass)(Object)bitmapDrawable));
//                    MyHelperClass id = new MyHelperClass();
                    log("image::: put:  id = " + id + " ");
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                MyHelperClass handler = new MyHelperClass();
                handler.post(new Runnable() {

//                    @Override
                    public void run() {
                        MyHelperClass bitmapDrawable = new MyHelperClass();
                        MyHelperClass iv = new MyHelperClass();
                        iv.setImageDrawable(bitmapDrawable);
                    }
                });
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setImageDrawable(MyHelperClass o0){ return null; }
	public MyHelperClass post( Runnable o0){ return null; }
	public MyHelperClass post(){ return null; }
	public MyHelperClass put(MyHelperClass o0, SoftReference o1){ return null; }}

class BitmapDrawable {

BitmapDrawable(){}
	BitmapDrawable(InputStream o0){}}

class SoftReference {

SoftReference(){}
	SoftReference(MyHelperClass o0){}}

class Drawable {

}
