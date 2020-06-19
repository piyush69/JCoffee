import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21979717 {
public MyHelperClass fileChooser;

//    @ActionMethod
    public void upload() throws Throwable, IOException {
        MyHelperClass frame = new MyHelperClass();
        final int fileResult =(int)(Object) fileChooser.showOpenDialog(frame);
        MyHelperClass JFileChooser = new MyHelperClass();
        if (fileResult != (int)(Object)JFileChooser.APPROVE_OPTION) {
            return;
        }
        MyHelperClass fileChooser = new MyHelperClass();
        final InputStream in = new FileInputStream((String)(Object)fileChooser.getSelectedFile());
        try {
            MyHelperClass testPort = new MyHelperClass();
            final URL url = new URL("http://127.0.0.1:" + testPort + "/databases/" + fileChooser.getSelectedFile().getName());
            final HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("PUT");
            con.setDoOutput(true);
            MyHelperClass Http11Header = new MyHelperClass();
            con.setRequestProperty((String)(Object)Http11Header.AUTHORIZATION, "Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==");
//            MyHelperClass Http11Header = new MyHelperClass();
            con.setRequestProperty((String)(Object)Http11Header.WWW_AUTHENTICATE, "Basic realm=\"karatasi\"");
//            MyHelperClass Http11Header = new MyHelperClass();
            con.setRequestProperty((String)(Object)Http11Header.CONTENT_LENGTH, Long.toString((long)(Object)fileChooser.getSelectedFile().length()));
//            MyHelperClass Http11Header = new MyHelperClass();
            con.setRequestProperty((String)(Object)Http11Header.CONTENT_TYPE, "application/octet-stream");
            final OutputStream out = con.getOutputStream();
            try {
                MyHelperClass Util = new MyHelperClass();
                Util.copy(in, out);
                con.connect();
                final InputStream in2 = con.getInputStream();
                try {
                    MyHelperClass textArea = new MyHelperClass();
                    textArea.setText("");
                    final byte[] buf = new byte[4096];
                    for (int bytesRead; (bytesRead = in2.read(buf)) != -1; ) {
//                        MyHelperClass textArea = new MyHelperClass();
                        textArea.append(new String(buf, 0, bytesRead));
                    }
                } finally {
                    in2.close();
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass AUTHORIZATION;
	public MyHelperClass CONTENT_TYPE;
	public MyHelperClass CONTENT_LENGTH;
	public MyHelperClass APPROVE_OPTION;
	public MyHelperClass WWW_AUTHENTICATE;
public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass showOpenDialog(MyHelperClass o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass append(String o0){ return null; }}

class ActionMethod {

}
