import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11962480 {

    public void read(String skeletonFilename) throws Throwable, Exception {
        ClassLoader loader = UnicodePropertiesSkeleton.class.getClassLoader();
        URL url = loader.getResource(skeletonFilename);
        if (null == url) {
            throw new Exception("Cannot locate '" + skeletonFilename + "' - aborting.");
        }
        String line;
        StringBuilder section = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
        while (null != (line = reader.readLine())) {
            if (line.startsWith("---")) {
                MyHelperClass sections = new MyHelperClass();
                sections.add(section.toString());
                section.setLength(0);
            } else {
                section.append(line);
                MyHelperClass NL = new MyHelperClass();
                section.append(NL);
            }
        }
        if (section.length() > 0) {
            MyHelperClass sections = new MyHelperClass();
            sections.add(section.toString());
        }
        MyHelperClass sections = new MyHelperClass();
        if (sections.size() != size) {
             static MyHelperClass sections = new MyHelperClass();
            throw new Exception("Skeleton file '" + skeletonFilename + "' has " + sections.size() + " static sections, but " + size + " were expected.");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class UnicodePropertiesSkeleton {

}
