import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7998444 {

    public static boolean isDicom(URL url)  throws Throwable {
        assert url != null;
        boolean isDicom = false;
        BufferedInputStream is = null;
        try {
            is = new BufferedInputStream(url.openStream());
            MyHelperClass DICOM_PREAMBLE_SIZE = new MyHelperClass();
            is.skip(DICOM_PREAMBLE_SIZE);
            MyHelperClass DICM = new MyHelperClass();
            byte[] buf = new byte[DICM.length];
            is.read(buf);
            MyHelperClass DICM = new MyHelperClass();
            if (buf[0] == DICM[0] && buf[1] == DICM[1] && buf[2] == DICM[2] && buf[3] == DICM[3]) {
                isDicom = true;
            }
        } catch (Exception exc) {
            System.out.println("ImageFactory::isDicom(): exc=" + exc);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception exc) {
                }
            }
        }
        return isDicom;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
