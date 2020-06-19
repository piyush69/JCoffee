import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18464490 {
public MyHelperClass getTable(){ return null; }

//        @Override
        public void actionPerformed(ActionEvent e)  throws Throwable {
            MyHelperClass copiedFiles_ = new MyHelperClass();
            if (copiedFiles_ != null) {
                MyHelperClass copiedFiles_ = new MyHelperClass();
                File[] tmpFiles = new File[copiedFiles_.length];
                MyHelperClass ConstantKeys = new MyHelperClass();
                File tmpDir = new File(Settings.getPropertyString(ConstantKeys.project_dir), "tmp/");
                tmpDir.mkdirs();
                MyHelperClass copiedFiles_ = new MyHelperClass();
                for (int i = copiedFiles_.length - 1; i >= 0; i--) {
                    MyHelperClass FrameManager = new MyHelperClass();
                    Frame f = FrameManager.getInstance().getFrameAtIndex(i);
                    try {
                        File in = f.getFile();
                        File out = new File(tmpDir, f.getFile().getName());
                        FileChannel inChannel = new FileInputStream(in).getChannel();
                        FileChannel outChannel = new FileOutputStream(out).getChannel();
                        inChannel.transferTo(0, inChannel.size(), outChannel);
                        if (inChannel != null) inChannel.close();
                        if (outChannel != null) outChannel.close();
                        tmpFiles[i] = out;
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                try {
                    getInstance().insertFrames(getTable().getSelectedRow(), INSERT_TYPE.MOVE, tmpFiles);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ActionEvent {

}

class Frame {

}

class FileChannel {

}
