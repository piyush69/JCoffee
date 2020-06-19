import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3447266 {

//    @SuppressWarnings("unchecked")
//    @Override
    public synchronized void drop(DropTargetDropEvent arg0)  throws Throwable {
        MyHelperClass Helper = new MyHelperClass();
        Helper.log().debug("Dropped");
        Transferable t = arg0.getTransferable();
        try {
            arg0.acceptDrop(arg0.getDropAction());
            List<File> filelist = (List<File>) t.getTransferData(t.getTransferDataFlavors()[0]);
            for (File file : filelist) {
//                MyHelperClass Helper = new MyHelperClass();
                Helper.log().debug(file.getAbsolutePath());
                if (file.getName().toLowerCase().contains(".lnk")) {
//                    MyHelperClass Helper = new MyHelperClass();
                    Helper.log().debug(file.getName() + " is a link");
                    MyHelperClass rp = new MyHelperClass();
                    File target = new File(rp.getRoot().getFullPath() + "/" + file.getName());
//                    MyHelperClass Helper = new MyHelperClass();
                    Helper.log().debug("I have opened the mayor at " + target.getAbsolutePath());
                    FileOutputStream fo = new FileOutputStream(target);
                    FileInputStream fi = new FileInputStream(file);
                    int i = 0;
                    while (fi.available() > 0) {
                        fo.write(fi.read());
                        System.out.print(".");
                        i++;
                    }
//                    MyHelperClass Helper = new MyHelperClass();
                    Helper.log().debug(i + " bytes have been written to " + target.getAbsolutePath());
                    fo.close();
                    fi.close();
                }
            }
            MyHelperClass rp = new MyHelperClass();
            rp.redraw();
        } catch (Throwable tr) {
            tr.printStackTrace();
        }
//        MyHelperClass Helper = new MyHelperClass();
        Helper.log().debug(arg0.getSource().toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(){ return null; }
	public MyHelperClass redraw(){ return null; }
	public MyHelperClass getRoot(){ return null; }}

class DropTargetDropEvent {

public MyHelperClass getTransferable(){ return null; }
	public MyHelperClass getDropAction(){ return null; }
	public MyHelperClass getSource(){ return null; }}

class Transferable {

public MyHelperClass getTransferDataFlavors(){ return null; }}
