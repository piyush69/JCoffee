import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13964622 {
public MyHelperClass NULL;
public MyHelperClass getDisplay(){ return null; }
public MyHelperClass currentProject;
public MyHelperClass Display;
	public MyHelperClass redraw(){ return null; }

    public void setImage(java.awt.Image img)  throws Throwable {
        MyHelperClass imageName = new MyHelperClass();
        if (imageName != null &&(int)(Object) imageName.length() > 0) {
            try {
//                MyHelperClass imageName = new MyHelperClass();
                InputStream url =(InputStream)(Object) currentProject.getUrl(imageName).openStream();
                Image image =(Image)(Object) NULL; //new Image();
                image = new Image(getDisplay(), url);
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
            Display.getDefault().asyncExec(new Runnable() {

                public void run() {
                    redraw();
                }
            });
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass asyncExec(){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass getUrl(MyHelperClass o0){ return null; }
	public MyHelperClass asyncExec( Runnable o0){ return null; }}

class Image {

Image(MyHelperClass o0, InputStream o1){}
	Image(){}}
