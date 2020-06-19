import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c17415425 {
public MyHelperClass cred;
	public MyHelperClass assertTrue(boolean o0){ return null; }

    public void overwriteTest() throws Exception {
        SRBAccount srbAccount = new SRBAccount("srb1.ngs.rl.ac.uk", 5544, this.cred);
        srbAccount.setDefaultStorageResource("ral-ngs1");
        SRBFileSystem client = new SRBFileSystem(srbAccount);
        client.setFirewallPorts(64000, 65000);
        String home =(String)(Object) client.getHomeDirectory();
        System.out.println("home: " + home);
        SRBFile file = new SRBFile(client, home + "/test.txt");
        assertTrue((boolean)(Object)file.exists());
        File filefrom = new File("/tmp/from.txt");
        assertTrue(filefrom.exists());
        SRBFileOutputStream to = null;
        InputStream from = null;
        try {
            to = new SRBFileOutputStream((SRBFile) file);
            from = new FileInputStream(filefrom);
            byte[] buffer = new byte[4096];
            int bytes_read;
            while ((bytes_read = from.read(buffer)) != -1) {
                to.write(buffer, 0, bytes_read);
            }
            to.flush();
        } finally {
            try {
                if (to != null) {
                    to.close();
                }
            } catch (Exception ex) {
            }
            try {
                if (from != null) {
                    from.close();
                }
            } catch (Exception ex) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SRBAccount {

SRBAccount(){}
	SRBAccount(String o0, int o1, MyHelperClass o2){}
	public MyHelperClass setDefaultStorageResource(String o0){ return null; }}

class SRBFileSystem {

SRBFileSystem(SRBAccount o0){}
	SRBFileSystem(){}
	public MyHelperClass getHomeDirectory(){ return null; }
	public MyHelperClass setFirewallPorts(int o0, int o1){ return null; }}

class SRBFile {

SRBFile(SRBFileSystem o0, String o1){}
	SRBFile(){}
	public MyHelperClass exists(){ return null; }}

class SRBFileOutputStream {

SRBFileOutputStream(){}
	SRBFileOutputStream(SRBFile o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
