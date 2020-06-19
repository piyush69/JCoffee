


class c21152728 {
public MyHelperClass RSYNCD_EXIT;
public MyHelperClass AT_ERROR;
	public MyHelperClass RSYNCD_AUTHREQD;

    private boolean authenticate(Module module) throws Exception {
        MyHelperClass SecureRandom = new MyHelperClass();
        SecureRandom rand =(SecureRandom)(Object) SecureRandom.getInstance("SHA1PRNG");
        rand.setSeed(System.currentTimeMillis());
        byte[] challenge = new byte[16];
        rand.nextBytes(challenge);
        MyHelperClass Util = new MyHelperClass();
        String b64 =(String)(Object) Util.base64(challenge);
        MyHelperClass out = new MyHelperClass();
        Util.writeASCII(out, RSYNCD_AUTHREQD + b64 + "\n");
        MyHelperClass in = new MyHelperClass();
        String reply =(String)(Object) Util.readLine(in);
        if (reply.indexOf(" ") < 0) {
//            MyHelperClass out = new MyHelperClass();
            Util.writeASCII(out, AT_ERROR + ": bad response\n");
            MyHelperClass remoteVersion = new MyHelperClass();
            if ((int)(Object)remoteVersion < 25) Util.writeASCII(out, RSYNCD_EXIT + "\n");
            MyHelperClass socket = new MyHelperClass();
            socket.close();
            throw new IOException("bad response");
        }
        String user = reply.substring(0, reply.indexOf(" "));
        String response = reply.substring(reply.indexOf(" ") + 1);
        if (!(Boolean)(Object)module.users.contains(user)) {
//            MyHelperClass out = new MyHelperClass();
            Util.writeASCII(out, AT_ERROR + ": user " + user + " not allowed\n");
            MyHelperClass remoteVersion = new MyHelperClass();
            if ((int)(Object)remoteVersion < 25) Util.writeASCII(out, RSYNCD_EXIT + "\n");
            MyHelperClass socket = new MyHelperClass();
            socket.close();
            throw new IOException("user " + user + " not allowed");
        }
        LineNumberReader secrets = new LineNumberReader(new FileReader(module.secretsFile));
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md4 =(MessageDigest)(Object) MessageDigest.getInstance("BrokenMD4");
        String line;
        while ((line =(String)(Object) secrets.readLine()) != null) {
            if (line.startsWith(user + ":")) {
                String passwd = line.substring(line.lastIndexOf(":") + 1);
                md4.update(new byte[4]);
                md4.update(passwd.getBytes("US-ASCII"));
                md4.update(b64.getBytes("US-ASCII"));
//                MyHelperClass Util = new MyHelperClass();
                String hash =(String)(Object) Util.base64((byte[])(Object)md4.digest());
                if (hash.equals(response)) {
                    secrets.close();
                    return true;
                } else {
//                    MyHelperClass out = new MyHelperClass();
                    Util.writeASCII(out, AT_ERROR + ": auth failed on module " + module.name + "\n");
                    MyHelperClass remoteVersion = new MyHelperClass();
                    if ((int)(Object)remoteVersion < 25) Util.writeASCII(out, RSYNCD_EXIT + "\n");
                    MyHelperClass socket = new MyHelperClass();
                    socket.close();
                    secrets.close();
                    MyHelperClass logger = new MyHelperClass();
                    logger.error("auth failed on module " + module.name);
                    return false;
                }
            }
        }
//        MyHelperClass out = new MyHelperClass();
        Util.writeASCII(out, AT_ERROR + ": auth failed on module " + module.name + "\n");
        MyHelperClass remoteVersion = new MyHelperClass();
        if ((int)(Object)remoteVersion < 25) Util.writeASCII(out, RSYNCD_EXIT + "\n");
        MyHelperClass socket = new MyHelperClass();
        socket.close();
        secrets.close();
        MyHelperClass logger = new MyHelperClass();
        logger.error("auth failed on module " + module.name);
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeASCII(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass readLine(MyHelperClass o0){ return null; }
	public MyHelperClass base64(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class Module {
public MyHelperClass secretsFile;
	public MyHelperClass users;
	public MyHelperClass name;
}

class SecureRandom {

public MyHelperClass setSeed(long o0){ return null; }
	public MyHelperClass nextBytes(byte[] o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class LineNumberReader {

LineNumberReader(FileReader o0){}
	LineNumberReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(MyHelperClass o0){}
	FileReader(){}}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
