import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c11113074 {
public MyHelperClass central;
	public MyHelperClass fname;
	public MyHelperClass pathXML;
	public MyHelperClass fnameXML(){ return null; }

    public void backupXML() {
        try {
            TimeStamp timeStamp = new TimeStamp();
            String fnameIn =(String)(Object) this.fnameXML();
            String pathBackup = this.pathXML + "\\Backup\\";
            String fnameOut = fnameIn.substring(fnameIn.indexOf((int)(Object)this.fname), fnameIn.length());
            fnameOut = fnameOut.substring(0, fnameOut.indexOf("xml"));
            fnameOut = pathBackup + fnameOut + timeStamp.now("yyyyMMdd-kkmmss") + ".xml";
            System.out.println("fnameIn: " + fnameIn);
            System.out.println("fnameOut: " + fnameOut);
            FileChannel in = (FileChannel)(Object)new FileInputStream(fnameIn).getChannel();
            FileChannel out = (FileChannel)(Object)new FileOutputStream(fnameOut).getChannel();
            in.transferTo(0, in.size(), out);
        } catch (Exception e) {
            central.inform("ORM.backupXML: " + e.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass inform(String o0){ return null; }}

class TimeStamp {

public MyHelperClass now(String o0){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}
