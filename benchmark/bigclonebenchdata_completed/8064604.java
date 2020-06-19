import java.io.*;
import java.lang.*;
import java.util.*;



class c8064604 {
public MyHelperClass NULL;
	public MyHelperClass hash2hex(MyHelperClass o0){ return null; }
public MyHelperClass _cman;
	public MyHelperClass _spsw;
	public MyHelperClass logger;
	public MyHelperClass MessageDigest;
	public MyHelperClass AsyncSlaveListener;
	public MyHelperClass _name;
	public MyHelperClass _mpsw;
	public MyHelperClass _sock;
	public MyHelperClass start(){ return null; }
	public MyHelperClass sendLine(String o0){ return null; }
	public MyHelperClass getSlaveStatus(){ return null; }
	public MyHelperClass readLine(int o0){ return null; }

    public void init(ConnectionManager mgr, Hashtable cfg, Socket sock) throws RemoteException {
        ConnectionManager _cman =(ConnectionManager)(Object) NULL; //new ConnectionManager();
        _cman = mgr;
        Socket _sock =(Socket)(Object) NULL; //new Socket();
        _sock = sock;
        for (int i = 0; i < 256; i++) {
            String key = Integer.toHexString(i);
            if (key.length() < 2) key = "0" + key;
            MyHelperClass availcmd = new MyHelperClass();
            availcmd.push(key);
            MyHelperClass commands = new MyHelperClass();
            commands.put(key, null);
        }
        try {
            PrintWriter _sout =(PrintWriter)(Object) NULL; //new PrintWriter();
            _sout = new PrintWriter((Writer)(Object)_sock.getOutputStream(), true);
            BufferedReader _sinp =(BufferedReader)(Object) NULL; //new BufferedReader();
            _sinp = new BufferedReader(new InputStreamReader((InputStream)(Object)_sock.getInputStream()));
            String seed = "";
            Random rand = new Random();
            for (int i = 0; i < 16; i++) {
                String hex = Integer.toHexString(rand.nextInt(256));
                if (hex.length() < 2) hex = "0" + hex;
                seed += hex.substring(hex.length() - 2);
            }
            MyHelperClass _mpsw = new MyHelperClass();
            String pass = _mpsw + seed + _spsw;
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.reset();
            md5.update(pass.getBytes());
            String hash =(String)(Object) hash2hex(md5.digest()).toLowerCase();
            String banner = "INIT " + "servername" + " " + hash + " " + seed;
            sendLine(banner);
            String txt =(String)(Object) readLine(5);
            if (txt == null) {
                throw new IOException("Slave did not send banner !!");
            }
            String sname = "";
            String spass = "";
            String sseed = "";
            try {
                String[] items = txt.split(" ");
                sname = items[1].trim();
                spass = items[2].trim();
                sseed = items[3].trim();
            } catch (Exception e) {
                AsyncSlaveListener.invalidSlave("INITFAIL BadKey",(MyHelperClass)(Object) _sock);
            }
            pass = _spsw + sseed + _mpsw;
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.reset();
            md5.update(pass.getBytes());
            hash =(String)(Object) hash2hex(md5.digest()).toLowerCase();
            if (!sname.equals(_name)) {
                AsyncSlaveListener.invalidSlave("INITFAIL Unknown",(MyHelperClass)(Object) _sock);
            }
            if (!spass.toLowerCase().equals(hash.toLowerCase())) {
                AsyncSlaveListener.invalidSlave("INITFAIL BadKey",(MyHelperClass)(Object) _sock);
            }
            _cman.getSlaveManager().addSlave(_name, this, getSlaveStatus(), -1);
            start();
        } catch (IOException e) {
            if ((ConnectIOException)(Object)e instanceof ConnectIOException && e.getCause() instanceof EOFException) {
                logger.info("Check slaves.xml on the master that you are allowed to connect.");
            }
            logger.info("IOException: " + e.toString());
            try {
                sock.close();
            } catch (Exception e1) {
            }
        } catch (Exception e) {
            logger.warn("Exception: " + e.toString());
            try {
                sock.close();
            } catch (Exception e2) {
            }
        }
        System.gc();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSlaveManager(){ return null; }
	public MyHelperClass addSlave(MyHelperClass o0, c8064604 o1, MyHelperClass o2, int o3){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass push(String o0){ return null; }
	public MyHelperClass invalidSlave(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass put(String o0, Object o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass toLowerCase(){ return null; }}

class ConnectionManager {

public MyHelperClass getSlaveManager(){ return null; }}

class Socket {

public MyHelperClass close(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class RemoteException extends Exception{
	public RemoteException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }}

class ConnectIOException extends Exception{
	public ConnectIOException(String errorMessage) { super(errorMessage); }
}
