import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16921914 {
public MyHelperClass SwingUtilities;
	public MyHelperClass yield(){ return null; }

    public void run()  throws Throwable {
        try {
            ThreadGroup transfers = new ThreadGroup("transfers");
            URL url = new URL("jar:http://jopenrpg.sourceforge.net/files/dev/pythonlib.jar!/");
            JarURLConnection juc = (JarURLConnection) url.openConnection();
            File top = new File(System.getProperty("user.home"), "jopenrpg");
            final JarFile jarfile =(JarFile)(Object) juc.getJarFile();
            Enumeration enumer =(Enumeration)(Object) jarfile.entries();
            while (enumer.hasMoreElements()) {
                final JarEntry entry = (JarEntry) enumer.nextElement();
                final File f = new File((String)(Object)top, entry.getName());
                if ((boolean)(Object)entry.isDirectory()) {
                    f.mkdirs();
                } else {
                    if (!entry.getName().startsWith("META-INF")) new Thread(transfers, new Runnable() {

                        public void run() {
                            try {
                                BufferedReader br = new BufferedReader(new InputStreamReader((InputStream)(Object)jarfile.getInputStream(entry)));
                                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
                                StringBuffer buf = new StringBuffer();
                                while (br.ready()) {
                                    buf.append(br.read());
                                }
                                bw.write(buf.toString(), 0, buf.length());
                                bw.close();
                                br.close();
                            } catch (Exception ex) {
                                System.out.println(ex);
                            }
                        }
                    }).start();
                }
            }
            while (transfers.activeCount() > 0) yield();
            SwingUtilities.invokeLater(new Runnable() {

                public void run() {
                    MyHelperClass ReferenceManager = new MyHelperClass();
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(ReferenceManager.getInstance().getMainFrame(), "Jython libraries installed.");
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMainFrame(){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass invokeLater(){ return null; }
	public MyHelperClass invokeLater(<anonymous Runnable> o0){ return null; }}

class JarFile {

public MyHelperClass entries(){ return null; }
	public MyHelperClass getInputStream(JarEntry o0){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}
