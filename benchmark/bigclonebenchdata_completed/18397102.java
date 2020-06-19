import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18397102 {

    protected void extractArchive(File archive)  throws Throwable {
        ZipInputStream zis = null;
        FileOutputStream fos;
        ZipEntry entry;
        File curEntry;
        int n;
        try {
            zis = new ZipInputStream(new FileInputStream(archive));
            while ((entry = zis.getNextEntry()) != null) {
                MyHelperClass workingDir = new MyHelperClass();
                curEntry = new File(workingDir, entry.getName());
                if (entry.isDirectory()) {
                    System.out.println("skip directory: " + entry.getName());
                    continue;
                }
                System.out.print("zip-entry (file): " + entry.getName());
                System.out.println(" ==> real path: " + curEntry.getAbsolutePath());
                if (!curEntry.getParentFile().exists()) curEntry.getParentFile().mkdirs();
                fos = new FileOutputStream(curEntry);
                MyHelperClass buf = new MyHelperClass();
                while ((n = zis.read(buf, 0, buf.length)) > -1) fos.write(buf, 0, n);
                fos.close();
                zis.closeEntry();
            }
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            try {
                if (zis != null) zis.close();
            } catch (Throwable t) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ZipInputStream {

}

class ZipEntry {

}
