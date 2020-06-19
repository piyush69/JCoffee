import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19657659 {
public MyHelperClass post(MyHelperClass o0, String o1){ return null; }
public MyHelperClass[] segments;
	public MyHelperClass Level;
public MyHelperClass Configuration;
//	public MyHelperClass segments;
	public MyHelperClass tempFolder;
	public MyHelperClass url;
	public MyHelperClass name;
	public MyHelperClass status;
	public MyHelperClass totalSize;
	public MyHelperClass Mediator;
	public MyHelperClass dest;
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getTempFolder(){ return null; }

    public  void Download(URL url, int segs)  throws Throwable {
        this.url =(MyHelperClass)(Object) url;
        Mediator.register(this);
        status =(MyHelperClass)(Object) "Starting...";
        try {
            totalSize =(MyHelperClass)(Object) url.openConnection().getContentLength();
            name =(MyHelperClass)(Object) url.getPath().substring(url.getPath().lastIndexOf('/') + 1);
            if ((boolean)(Object)name.isEmpty()) {
                name =(MyHelperClass)(Object) "UNKNOWN";
            }
            tempFolder = new File((String)(Object)Configuration.PARTS_FOLDER,(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) getName());
            tempFolder.mkdir();
        } catch (IOException ex) {
            post(Level.WARNING, "URL could not be opened: " + url);
        }
        dest =(MyHelperClass)(Object) new File(System.getProperty("user.home") + File.separator + name);
        if (segs > (int)(Object)totalSize) {
            segs =(int)(Object) totalSize;
        }
        Properties props = new Properties();
        props.setProperty("url", getUrl().toString());
        props.setProperty("segments", String.valueOf(segs));
        try {
            props.storeToXML(new FileOutputStream(new File((String)(Object)getTempFolder(), "index.xml")), "Warning: Editing this file may compromise the integrity of the download");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        segments =(MyHelperClass[])(Object)(MyHelperClass)(Object) new Segment[segs];
        for (int i = 0; i < segs; i++) {
            segments[i] =(MyHelperClass)(Object) new Segment(this, i);
        }
        Thread thread = new Thread((Runnable)(Object)this);
        thread.setDaemon(true);
        thread.start();
        status =(MyHelperClass)(Object) "Downloading...";
        Mediator.post(new DownloadStatusChanged(this));
        post(Level.INFO, "Starting download: " + getName());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
	public MyHelperClass WARNING;
	public MyHelperClass PARTS_FOLDER;
public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass post(DownloadStatusChanged o0){ return null; }
	public MyHelperClass register(c19657659 o0){ return null; }
	public MyHelperClass mkdir(){ return null; }}

class Segment {

Segment(c19657659 o0, int o1){}
	Segment(){}}

class DownloadStatusChanged {

DownloadStatusChanged(c19657659 o0){}
	DownloadStatusChanged(){}}
