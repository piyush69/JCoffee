import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13583203 {

    public void sendMail() throws Throwable, Exception {
        try {
            MyHelperClass param = new MyHelperClass();
            if (param.length > 0) {
                MyHelperClass param = new MyHelperClass();
                System.setProperty("mail.host", param[0].trim());
                MyHelperClass param = new MyHelperClass();
                URL url = new URL("mailto:" + param[1].trim());
                URLConnection conn = url.openConnection();
                PrintWriter out = new PrintWriter(conn.getOutputStream(), true);
                MyHelperClass param = new MyHelperClass();
                out.print("To:" + param[1].trim() + "\n");
                MyHelperClass param = new MyHelperClass();
                out.print("Subject: " + param[2] + "\n");
                out.print("MIME-Version: 1.0\n");
                out.print("Content-Type: multipart/mixed; boundary=\"tcppop000\"\n\n");
                out.print("--tcppop000\n");
                out.print("Content-Type: text/plain\n");
                out.print("Content-Transfer-Encoding: 7bit\n\n\n");
                MyHelperClass param = new MyHelperClass();
                out.print(param[3] + "\n\n\n");
                out.print("--tcppop000\n");
                MyHelperClass param = new MyHelperClass();
                String filename = param[4].trim();
                int sep = filename.lastIndexOf(File.separator);
                if (sep > 0) {
                    filename = filename.substring(sep + 1, filename.length());
                }
                out.print("Content-Type: text/html; name=\"" + filename + "\"\n");
                out.print("Content-Transfer-Encoding: binary\n");
                out.print("Content-Disposition: attachment; filename=\"" + filename + "\"\n\n");
                System.out.println("FOR ATTACHMENT Content-Transfer-Encoding: binary ");
                MyHelperClass param = new MyHelperClass();
                RandomAccessFile file = new RandomAccessFile(param[4].trim(), "r");
                byte[] buffer = new byte[(int) file.length()];
                file.readFully(buffer);
                file.close();
                String fileContent = new String(buffer);
                out.print(fileContent);
                out.print("\n");
                out.print("--tcppop000--");
                out.close();
            } else {
            }
        } catch (MalformedURLException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
