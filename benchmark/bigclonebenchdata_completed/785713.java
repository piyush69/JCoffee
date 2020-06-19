import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c785713 {
public MyHelperClass plugin;
	public MyHelperClass sink;

        public void run()  throws Throwable {
            try {
                MessageDigest md = MessageDigest.getInstance("SHA-1");
                ChannelMap cm = new ChannelMap();
                MyHelperClass picm = new MyHelperClass();
                for (int i = 0; i < picm.NumberOfChannels(); i++) {
//                    MyHelperClass picm = new MyHelperClass();
                    cm.Add(picm.GetName(i));
                }
//                MyHelperClass picm = new MyHelperClass();
                String[] folder = picm.GetFolderList();
                for (int i = 0; i < folder.length; i++) {
                    cm.AddFolder(folder[i]);
                }
//                MyHelperClass picm = new MyHelperClass();
                sink.Request(cm, picm.GetRequestStart(), picm.GetRequestDuration(), picm.GetRequestReference());
                MyHelperClass timeout = new MyHelperClass();
                cm = sink.Fetch(timeout);
                if (cm.GetIfFetchTimedOut()) {
                    System.err.println("Signature Data Fetch Timed Out!");
//                    MyHelperClass picm = new MyHelperClass();
                    picm.Clear();
                } else {
                    md.reset();
                    folder = cm.GetFolderList();
//                    MyHelperClass picm = new MyHelperClass();
                    for (int i = 0; i < folder.length; i++) picm.AddFolder(folder[i]);
                    int sigIdx = -1;
                    for (int i = 0; i < cm.NumberOfChannels(); i++) {
                        String chan = cm.GetName(i);
                        if (chan.endsWith("/_signature")) {
                            sigIdx = i;
                            continue;
                        }
//                        MyHelperClass picm = new MyHelperClass();
                        int idx = picm.GetIndex(chan);
//                        MyHelperClass picm = new MyHelperClass();
                        if (idx == -1) idx = picm.Add(chan);
//                        MyHelperClass picm = new MyHelperClass();
                        picm.PutTimeRef(cm, i);
//                        MyHelperClass picm = new MyHelperClass();
                        picm.PutDataRef(idx, cm, i);
                        md.update(cm.GetData(i));
                        md.update((new Double(cm.GetTimeStart(i))).toString().getBytes());
                    }
                    if (cm.NumberOfChannels() > 0) {
                        MyHelperClass signature = new MyHelperClass();
                        byte[] amd = md.digest(signature.getBytes());
                        if (sigIdx >= 0) {
                            if (MessageDigest.isEqual(amd, cm.GetDataAsByteArray(sigIdx)[0])) {
                                MyHelperClass pluginName = new MyHelperClass();
                                System.err.println(pluginName + ": signature matched for: " + cm.GetName(0));
                            } else {
                                MyHelperClass pluginName = new MyHelperClass();
                                System.err.println(pluginName + ": failed signature test, sending null response");
//                                MyHelperClass picm = new MyHelperClass();
                                picm.Clear();
                            }
                        } else {
                            MyHelperClass pluginName = new MyHelperClass();
                            System.err.println(pluginName + ": _signature attached for: " + cm.GetName(0));
//                            MyHelperClass picm = new MyHelperClass();
                            int idx = picm.Add("_signature");
//                            MyHelperClass picm = new MyHelperClass();
                            picm.PutTime(0., 0.);
//                            MyHelperClass picm = new MyHelperClass();
                            picm.PutDataAsByteArray(idx, amd);
                        }
                    }
                }
//                MyHelperClass picm = new MyHelperClass();
                plugin.Flush(picm);
            } catch (Exception e) {
                e.printStackTrace();
            }
            MyHelperClass threadStack = new MyHelperClass();
            if (threadStack.size() < 4) threadStack.push(this); else sink.CloseRBNBConnection();
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass PutTime(double o0, double o1){ return null; }
	public MyHelperClass GetRequestReference(){ return null; }
	public MyHelperClass PutDataRef(int o0, ChannelMap o1, int o2){ return null; }
	public MyHelperClass AddFolder(String o0){ return null; }
	public MyHelperClass GetFolderList(){ return null; }
	public MyHelperClass GetRequestDuration(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass Add(String o0){ return null; }
	public MyHelperClass NumberOfChannels(){ return null; }
	public MyHelperClass GetIndex(String o0){ return null; }
	public MyHelperClass push(c785713 o0){ return null; }
	public MyHelperClass Clear(){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass GetRequestStart(){ return null; }
	public MyHelperClass PutTimeRef(ChannelMap o0, int o1){ return null; }
	public MyHelperClass GetName(int o0){ return null; }
	public MyHelperClass PutDataAsByteArray(int o0, byte[] o1){ return null; }}

class ChannelMap {

public MyHelperClass GetIfFetchTimedOut(){ return null; }
	public MyHelperClass GetDataAsByteArray(int o0){ return null; }
	public MyHelperClass GetFolderList(){ return null; }
	public MyHelperClass GetData(int o0){ return null; }
	public MyHelperClass GetTimeStart(int o0){ return null; }
	public MyHelperClass NumberOfChannels(){ return null; }
	public MyHelperClass AddFolder(String o0){ return null; }
	public MyHelperClass GetName(int o0){ return null; }}
