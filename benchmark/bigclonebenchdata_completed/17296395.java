import java.io.*;
import java.lang.*;
import java.util.*;



class c17296395 {

    public static File copyToLibDirectory(final File file) throws FileNotFoundException, IOException {
        if (file == null || !file.exists()) {
            throw new FileNotFoundException();
        }
        File directory = new File("lib/");
        File dest = new File(directory, file.getName());
        File parent = dest.getParentFile();
        while (parent != null && !parent.equals(directory)) {
            parent = parent.getParentFile();
        }
        if (parent.equals(directory)) {
            return file;
        }
        FileChannel in = null;
        FileChannel out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(file).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            in.transferTo(0, in.size(), out);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
        return dest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }
	public MyHelperClass size(){ return null; }}
