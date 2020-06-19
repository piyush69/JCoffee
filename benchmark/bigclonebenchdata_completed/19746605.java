import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19746605 {

    private synchronized Frame insertFrame(int index, File source, INSERT_TYPE type) throws Throwable, IOException {
        if (source == null) throw new NullPointerException("Parameter 'source' is null");
        if (!source.exists()) throw new IOException("File does not exist: " + source.getAbsolutePath());
        if (source.length() <= 0) throw new IOException("File is empty: " + source.getAbsolutePath());
        if (index < 0) throw new IndexOutOfBoundsException("index < 0");
        MyHelperClass frames_ = new MyHelperClass();
        if (index >= frames_.size()) throw new IndexOutOfBoundsException("index >= frames_.size()");
        MyHelperClass ConstantKeys = new MyHelperClass();
        File tmp = new File(Settings.getPropertyString(ConstantKeys.project_dir), "tmp.jpg");
        switch(type) {
            MyHelperClass MOVE = new MyHelperClass();
            case MOVE:
                MyHelperClass ConstantKeys = new MyHelperClass();
                if (source.getParentFile().compareTo(new File(Settings.getPropertyString(ConstantKeys.project_dir))) == 0 && source.getName().matches("img_[0-9]{5}\\.jpg")) {
                    MyHelperClass frames_ = new MyHelperClass();
                    for (int i = 0; i < frames_.size(); i++) {
                        MyHelperClass frames_ = new MyHelperClass();
                        Frame f = frames_.get(i);
                        if (f.getFile().compareTo(source) == 0) {
                            MyHelperClass frames_ = new MyHelperClass();
                            frames_.remove(i);
                            break;
                        }
                    }
                }
                source.renameTo(tmp);
                break;
            MyHelperClass COPY = new MyHelperClass();
            case COPY:
                FileChannel inChannel = new FileInputStream(source).getChannel();
                FileChannel outChannel = new FileOutputStream(tmp).getChannel();
                inChannel.transferTo(0, inChannel.size(), outChannel);
                if (inChannel != null) inChannel.close();
                if (outChannel != null) outChannel.close();
                break;
        }
        MyHelperClass frames_ = new MyHelperClass();
        for (int i = frames_.size() - 1; i >= index; i--) {
            MyHelperClass ConstantKeys = new MyHelperClass();
            Frame newFrame = new Frame(new File(Settings.getPropertyString(ConstantKeys.project_dir), formatFileName(i)));
            MyHelperClass frames_ = new MyHelperClass();
            frames_.get(i).moveTo(newFrame);
            MyHelperClass frames_ = new MyHelperClass();
            frames_.set(i, newFrame);
        }
        MyHelperClass ConstantKeys = new MyHelperClass();
        File newLocation = new File(Settings.getPropertyString(ConstantKeys.project_dir), formatFileName(index));
        tmp.renameTo(newLocation);
        Frame f = new Frame(newLocation);
        f.createThumbNail();
        MyHelperClass frames_ = new MyHelperClass();
        frames_.set(index, f);
        return f;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class INSERT_TYPE {

}

class Frame {

}

class FileChannel {

}
