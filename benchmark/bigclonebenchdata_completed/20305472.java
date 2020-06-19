import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20305472 {
public MyHelperClass deleteOnFinish;
	public MyHelperClass noofparts;
	public MyHelperClass originalfilename;
	public MyHelperClass splitsize;
	public MyHelperClass JOptionPane;
	public MyHelperClass pb;
	public MyHelperClass status;

//    @Override
    public void run() {
        try {
            MyHelperClass outputfile = new MyHelperClass();
            FileChannel out = (FileChannel)(Object)new FileOutputStream((String)(Object)outputfile).getChannel();
            long pos = 0;
            MyHelperClass status = new MyHelperClass();
            status.setText("Slučovač: Proces Slučování spuštěn.. Prosím čekejte..");
            MyHelperClass noofparts = new MyHelperClass();
            for (int i = 1; i <= (int)(Object)noofparts; i++) {
                MyHelperClass originalfilename = new MyHelperClass();
                FileChannel in = (FileChannel)(Object)new FileInputStream(originalfilename.getAbsolutePath() + "." + "v" + i).getChannel();
//                MyHelperClass status = new MyHelperClass();
                status.setText("Slučovač: Slučuji část " + i + "..");
                this.splitsize = in.size();
                out.transferFrom(in, pos, splitsize);
                pos += (long)(Object)splitsize;
                in.close();
                if ((boolean)(Object)deleteOnFinish) new File(originalfilename + ".v" + i).delete();
                pb.setValue(100 * i / (int)(Object)noofparts);
            }
            out.close();
            status.setText("Slučovač: Hotovo..");
            JOptionPane.showMessageDialog(null, "Sloučeno!", "Slučovač", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass setValue(int o0){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, long o1, MyHelperClass o2){ return null; }}
