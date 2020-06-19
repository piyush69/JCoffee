import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9210168 {

//            @Override
            public void run()  throws Throwable {
                try {
                    MyHelperClass path = new MyHelperClass();
                    URL url = Thread.currentThread().getContextClassLoader().getResource((String)(Object)path);
                    InputStream fis = url.openStream();
                    InputStreamReader r = new InputStreamReader(fis, "UTF-8");
                    BufferedReader br = new BufferedReader(r);
                    String line;
                    StringBuilder sb = new StringBuilder();
                    while (null != (line = br.readLine())) {
                        sb.append(line);
                        sb.append("\r\n");
                    }
                    br.close();
                    r.close();
                    fis.close();
                    final String text = sb.toString();
                    MyHelperClass SwingUtilities = new MyHelperClass();
                    SwingUtilities.invokeLater(new Runnable() {

//                        @Override
                        public void run() {
                            MainPanel.this.source.setText(text);
                            MainPanel.this.source.setCaretPosition(0);
                        }
                    });
                } catch (Exception ex) {
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass invokeLater(){ return null; }
	public MyHelperClass invokeLater(<anonymous Runnable> o0){ return null; }}

class MainPanel {

}
