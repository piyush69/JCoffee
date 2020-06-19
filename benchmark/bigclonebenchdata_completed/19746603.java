import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19746603 {

    private synchronized Frame addFrame(INSERT_TYPE type, File source) throws Throwable, IOException {
        if (source == null) throw new NullPointerException("Parameter 'source' is null");
        if (!source.exists()) throw new IOException("File does not exist: " + source.getAbsolutePath());
        if (source.length() <= 0) throw new IOException("File is empty: " + source.getAbsolutePath());
        MyHelperClass ConstantKeys = new MyHelperClass();
        File newLocation = new File(Settings.getPropertyString(ConstantKeys.project_dir), formatFileName(frames_.size()));
        if (newLocation.compareTo(source) != 0) {
            switch(type) {
                MyHelperClass MOVE = new MyHelperClass();
                case MOVE:
                    source.renameTo(newLocation);
                    break;
                MyHelperClass COPY = new MyHelperClass();
                case COPY:
                    FileChannel inChannel = new FileInputStream(source).getChannel();
                    FileChannel outChannel = new FileOutputStream(newLocation).getChannel();
                    inChannel.transferTo(0, inChannel.size(), outChannel);
                    if (inChannel != null) inChannel.close();
                    if (outChannel != null) outChannel.close();
                    break;
            }
        }
        Frame f = new Frame(newLocation);
        f.createThumbNail();
        MyHelperClass frames_ = new MyHelperClass();
        frames_.add(f);
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
