


class c12820117 {

    static void invalidSlave(String msg, Socket sock) throws IOException {
        BufferedReader _sinp = null;
        PrintWriter _sout = null;
        try {
            _sout = new PrintWriter(sock.getOutputStream(), true);
            _sinp = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            _sout.println(msg);
            MyHelperClass logger = new MyHelperClass();
            logger.info("NEW< " + msg);
            MyHelperClass SocketSlaveListener = new MyHelperClass();
            String txt =(String)(Object) SocketSlaveListener.readLine(_sinp, 30);
            String sname = "";
            String spass = "";
            String shash = "";
            try {
                String[] items = txt.split(" ");
                sname = items[1].trim();
                spass = items[2].trim();
                shash = items[3].trim();
            } catch (Exception e) {
                throw new IOException("Slave Inititalization Faailed");
            }
            MyHelperClass _pass = new MyHelperClass();
            String pass = sname + spass + _pass;
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.reset();
            md5.update(pass.getBytes());
//            MyHelperClass SocketSlaveListener = new MyHelperClass();
            String hash =(String)(Object) SocketSlaveListener.hash2hex(md5.digest()).toLowerCase();
            if (!hash.equals(shash)) {
                throw new IOException("Slave Inititalization Faailed");
            }
        } catch (Exception e) {
        }
        throw new IOException("Slave Inititalization Faailed");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readLine(BufferedReader o0, int o1){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass hash2hex(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class Socket {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class PrintWriter {

PrintWriter(){}
	PrintWriter(MyHelperClass o0, boolean o1){}
	public MyHelperClass println(String o0){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
