import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9687813 {

    public static InputStream getFileInputStream(String path) throws IOException {
        InputStream is = null;
        File file = new File(path);
        if (file.exists()) is = new BufferedInputStream(new FileInputStream(file));
        if (is == null) {
            URL url = FileUtils.class.getClassLoader().getResource(path);
            is = (url == null) ? null : url.openStream();
        }
        return is;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileUtils {

}
