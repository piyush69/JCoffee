import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5428177 {

    public void invoke() throws Throwable, IOException {
        MyHelperClass files = new MyHelperClass();
        String[] command = new String[files.length + options.length + 2];
        MyHelperClass chmod = new MyHelperClass();
        command[0] = chmod;
        MyHelperClass options = new MyHelperClass();
        System.arraycopy(options, 0, command, 1, options.length);
        MyHelperClass options = new MyHelperClass();
        command[1 + options.length] = perms;
        MyHelperClass files = new MyHelperClass();
        for (int i = 0; i < files.length; i++) {
            MyHelperClass files = new MyHelperClass();
            File file = files[i];
            MyHelperClass options = new MyHelperClass();
            command[2 + options.length + i] = file.getAbsolutePath();
        }
        Process p = Runtime.getRuntime().exec(command);
        try {
            p.waitFor();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        if (p.exitValue() != 0) {
            StringWriter writer = new StringWriter();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(p.getErrorStream(), writer);
            throw new IOException("Unable to chmod files: " + writer.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
