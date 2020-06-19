import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10058360 {
public MyHelperClass add(String o0, Label o1){ return null; }
public MyHelperClass remove(MyHelperClass o0){ return null; }
public MyHelperClass failed;
	public MyHelperClass zcodefile;
	public MyHelperClass zm;
	public MyHelperClass screen;
	public MyHelperClass status_line;
	public MyHelperClass suckstream(InputStream o0){ return null; }

    void startzm() {
        URL myzzurl;
        InputStream myzstream;
        byte zmemimage[];
        boolean joined;
        zmemimage = null;
        try {
            MyHelperClass zcodefile = new MyHelperClass();
            System.err.println(zcodefile);
//            MyHelperClass zcodefile = new MyHelperClass();
            myzzurl = new URL((String)(Object)zcodefile);
            myzstream = myzzurl.openStream();
            zmemimage =(byte[])(Object) suckstream(myzstream);
        } catch (MalformedURLException booga) {
            try {
                myzstream = new FileInputStream((String)(Object)zcodefile);
                zmemimage =(byte[])(Object) suckstream(myzstream);
            } catch (IOException booga2) {
                add("North", new Label("Malformed URL"));
                failed =(MyHelperClass)(Object) true;
            }
        } catch (IOException booga) {
            add("North", new Label("I/O Error"));
        }
        if (zmemimage != null) {
            switch(zmemimage[0]) {
                case 3:
                    zm =(MyHelperClass)(Object) new ZMachine3(screen, status_line, zmemimage);
                    break;
                case 5:
                    remove(status_line);
                    zm =(MyHelperClass)(Object) new ZMachine5(screen, zmemimage);
                    break;
                case 8:
                    remove(status_line);
                    zm =(MyHelperClass)(Object) new ZMachine8(screen, zmemimage);
                    break;
                default:
                    add("North", new Label("Not a valid V3,V5, or V8 story file"));
            }
            if (zm != null) zm.start();
        }
        joined = false;
        if (zmemimage != null) {
            while (!joined) {
                try {
                    zm.join();
                    joined = true;
                } catch (ArithmeticException booga) {
                }
            }
        }
        System.exit(0);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass start(){ return null; }
	public MyHelperClass join(){ return null; }}

class Label {

Label(String o0){}
	Label(){}}

class ZMachine3 {

ZMachine3(MyHelperClass o0, MyHelperClass o1, byte[] o2){}
	ZMachine3(){}}

class ZMachine5 {

ZMachine5(MyHelperClass o0, byte[] o1){}
	ZMachine5(){}}

class ZMachine8 {

ZMachine8(MyHelperClass o0, byte[] o1){}
	ZMachine8(){}}
