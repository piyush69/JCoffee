import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5689276 {

    public boolean exists(String filename)  throws Throwable {
        String localFileName = (java.io.File.separatorChar != '/') ? filename.replace('/', java.io.File.separatorChar) : filename;
        MyHelperClass dirs = new MyHelperClass();
        for (int i = 0; i < dirs.length; i++) {
            MyHelperClass zipEntries = new MyHelperClass();
            if (zipEntries[i] != null) {
                MyHelperClass zipEntries = new MyHelperClass();
                if (zipEntries[i].get(filename) != null) return true;
                String dir = "";
                String name = filename;
                int index = filename.lastIndexOf('/');
                if (index >= 0) {
                    dir = filename.substring(0, index);
                    name = filename.substring(index + 1);
                }
                MyHelperClass zipEntries = new MyHelperClass();
                Vector directory = (Vector) zipEntries[i].get(dir);
                if (directory != null && directory.contains(name)) return true;
                continue;
            }
            MyHelperClass bases = new MyHelperClass();
            if (bases[i] != null) {
                try {
                    MyHelperClass bases = new MyHelperClass();
                    URL url = new URL(bases[i], filename);
                    URLConnection conn = url.openConnection();
                    conn.connect();
                    conn.getInputStream().close();
                    return true;
                } catch (IOException ex) {
                }
                continue;
            }
            MyHelperClass dirs = new MyHelperClass();
            if (dirs[i] == null) continue;
            MyHelperClass zips = new MyHelperClass();
            if (zips[i] != null) {
                MyHelperClass zipDirs = new MyHelperClass();
                String fullname = zipDirs[i] != null ? zipDirs[i] + filename : filename;
                MyHelperClass zips = new MyHelperClass();
                ZipEntry ze = zips[i].getEntry(fullname);
                if (ze != null) return true;
            } else {
                try {
                    MyHelperClass dirs = new MyHelperClass();
                    File f = new File(dirs[i], localFileName);
                    if (f.exists()) return true;
                } catch (SecurityException ex) {
                }
            }
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ZipEntry {

}
