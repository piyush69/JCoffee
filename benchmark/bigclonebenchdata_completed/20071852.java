import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20071852 {

    void write() throws IOException {
        MyHelperClass allowUnlimitedArgs = new MyHelperClass();
        if (!allowUnlimitedArgs && args != null && args.length > 1) throw new IllegalArgumentException("Only one argument allowed unless allowUnlimitedArgs is enabled");
        MyHelperClass interpretter = new MyHelperClass();
        String shebang = "#!" + interpretter;
        MyHelperClass args = new MyHelperClass();
        for (int i = 0; i < args.length; i++) {
            MyHelperClass args = new MyHelperClass();
            shebang += " " + args[i];
        }
        shebang += '\n';
        MyHelperClass outputStream = new MyHelperClass();
        IOUtils.copy(new StringReader(shebang), outputStream);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
