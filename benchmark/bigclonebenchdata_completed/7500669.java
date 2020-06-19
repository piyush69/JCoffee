import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7500669 {
public static MyHelperClass copy(FileInputStream o0, ByteArrayOutputStream o1){ return null; }
//public MyHelperClass copy(FileInputStream o0, ByteArrayOutputStream o1){ return null; }

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage:  java SOAPClient4XG " + "http://soapURL soapEnvelopefile.xml" + " [SOAPAction]");
            System.err.println("SOAPAction is optional.");
            System.exit(1);
        }
        String SOAPUrl = args[0];
        String xmlFile2Send = args[1];
        String SOAPAction = "";
        if (args.length > 2) SOAPAction = args[2];
        URL url = new URL(SOAPUrl);
        URLConnection connection = url.openConnection();
        HttpURLConnection httpConn = (HttpURLConnection) connection;
        FileInputStream fin = new FileInputStream(xmlFile2Send);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        copy(fin, bout);
        fin.close();
        byte[] b = bout.toByteArray();
        httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
        httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
        httpConn.setRequestProperty("SOAPAction", SOAPAction);
        httpConn.setRequestMethod("POST");
        httpConn.setDoOutput(true);
        httpConn.setDoInput(true);
        OutputStream out = httpConn.getOutputStream();
        out.write(b);
        out.close();
        InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
        BufferedReader in = new BufferedReader(isr);
        String inputLine;
        while ((inputLine = in.readLine()) != null) System.out.println(inputLine);
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
