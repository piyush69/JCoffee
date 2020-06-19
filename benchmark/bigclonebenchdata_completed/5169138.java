import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5169138 {
public MyHelperClass NULL;
public MyHelperClass[] cache_idx;
public MyHelperClass socketip;
	public MyHelperClass socket;
	public MyHelperClass midi;
	public MyHelperClass threadreq;
	public MyHelperClass threadliveid;
	public MyHelperClass midiplay;
	public MyHelperClass wave;
	public MyHelperClass uid;
	public MyHelperClass cache_dat;
	public MyHelperClass urlreq;
	public MyHelperClass urlstream;
	public MyHelperClass savelen;
	public MyHelperClass savebuf;
	public MyHelperClass socketreq;
	public MyHelperClass savereq;
	public MyHelperClass waveplay;
	public MyHelperClass mainapp;
	public MyHelperClass threadreqpri;
	public MyHelperClass dns;
//	public MyHelperClass cache_idx;
	public MyHelperClass dnsreq;
	public MyHelperClass getuid(String o0){ return null; }
	public MyHelperClass findcachedir(){ return null; }

    public final void run()  throws Throwable {
        boolean active =(boolean)(Object) NULL; //new boolean();
        active = true;
        String s =(String)(Object) findcachedir();
        uid = getuid(s);
        try {
            File file = new File(s + "main_file_cache.dat");
            if (file.exists() && file.length() > 0x3200000L) file.delete();
            cache_dat =(MyHelperClass)(Object) new RandomAccessFile(s + "main_file_cache.dat", "rw");
            for (int j = 0; j < 5; j++) cache_idx[j] =(MyHelperClass)(Object) new RandomAccessFile(s + "main_file_cache.idx" + j, "rw");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        for (int i =(int)(Object) threadliveid;(int)(Object) threadliveid == i; ) {
            if ((int)(Object)socketreq != 0) {
                try {
                    socket =(MyHelperClass)(Object) new Socket((String)(Object)socketip,(int)(Object) socketreq);
                } catch (Exception _ex) {
                    socket = null;
                }
                socketreq =(MyHelperClass)(Object) 0;
            } else if (threadreq != null) {
                Thread thread = new Thread((Runnable)(Object)threadreq);
                thread.setDaemon(true);
                thread.start();
                thread.setPriority((int)(Object)threadreqpri);
                threadreq = null;
            } else if (dnsreq != null) {
                try {
                    dns =(MyHelperClass)(Object) InetAddress.getByName((String)(Object)dnsreq).getHostName();
                } catch (Exception _ex) {
                    dns =(MyHelperClass)(Object) "unknown";
                }
                dnsreq = null;
            } else if (savereq != null) {
                if (savebuf != null) try {
                    FileOutputStream fileoutputstream = new FileOutputStream(s + savereq);
                    fileoutputstream.write((byte[])(Object)savebuf, 0,(int)(Object) savelen);
                    fileoutputstream.close();
                } catch (Exception _ex) {
                }
                if ((boolean)(Object)waveplay) {
                    wave =(MyHelperClass)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) s + (int)(Object)savereq;
                    waveplay =(MyHelperClass)(Object) false;
                }
                if ((boolean)(Object)midiplay) {
                    midi =(MyHelperClass)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) s + (int)(Object)savereq;
                    midiplay =(MyHelperClass)(Object) false;
                }
                savereq = null;
            } else if (urlreq != null) {
                try {
                    urlstream =(MyHelperClass)(Object) new DataInputStream((new URL((URL)(Object)mainapp.getCodeBase(),(String)(Object) urlreq)).openStream());
                } catch (Exception _ex) {
                    urlstream = null;
                }
                urlreq = null;
            }
            try {
                Thread.sleep(50L);
            } catch (Exception _ex) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCodeBase(){ return null; }}
