import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14869434 {
public MyHelperClass pb;

//    @Override
    public void run()  throws Throwable {
        try {
            MyHelperClass inputfile = new MyHelperClass();
            FileChannel in = (FileChannel)(Object)new FileInputStream((String)(Object)inputfile).getChannel();
            long pos = 0;
            MyHelperClass noofparts = new MyHelperClass();
            for (int i = 1; i <= (int)(Object)noofparts; i++) {
                MyHelperClass outputfile = new MyHelperClass();
                FileChannel out = (FileChannel)(Object)new FileOutputStream(outputfile.getAbsolutePath() + "." + "v" + i).getChannel();
                MyHelperClass status = new MyHelperClass();
                status.setText("Rozdělovač: Rozděluji část " + i + "..");
                MyHelperClass splitsize = new MyHelperClass();
                in.transferTo(pos, splitsize, out);
//                MyHelperClass splitsize = new MyHelperClass();
                pos += (long)(Object)splitsize;
                MyHelperClass remainingsize = new MyHelperClass();
               (int)(Object) remainingsize -= (int)(Object)splitsize;
//                MyHelperClass remainingsize = new MyHelperClass();
                if ((int)(Object)remainingsize < (int)(Object)splitsize) in.transferTo(pos, remainingsize, out);
//                MyHelperClass noofparts = new MyHelperClass();
                pb.setValue(100 * i / (int)(Object)noofparts);
                out.close();
            }
            in.close();
            MyHelperClass deleteOnFinish = new MyHelperClass();
            if ((boolean)(Object)deleteOnFinish) new File(inputfile + "").delete();
            MyHelperClass status = new MyHelperClass();
            status.setText("Rozdělovač: Hotovo..");
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, "Rozděleno!", "Rozdělovač", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass setValue(int o0){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class FileChannel {

public MyHelperClass transferTo(long o0, MyHelperClass o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }}
