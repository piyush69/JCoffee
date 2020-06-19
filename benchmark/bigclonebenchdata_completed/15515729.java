import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15515729 {
public MyHelperClass log;
	public MyHelperClass endpointURL;

    public void get(File fileToGet) throws IOException {
        String fileName = fileToGet.getName();
        URL url = new URL(this.endpointURL + fileName);
        URLConnection connection = url.openConnection();
        InputStream input = connection.getInputStream();
        log.debug("get: " + fileName);
        try {
            FileOutputStream fileStream = new FileOutputStream(fileToGet);
            byte[] bt = new byte[10000];
            int cnt = input.read(bt);
            log.debug("Read bytes: " + cnt);
            while (cnt != -1) {
                fileStream.write(bt, 0, cnt);
                cnt = input.read(bt);
            }
            input.close();
            fileStream.close();
        } catch (IOException e) {
            new File(fileName).delete();
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}
