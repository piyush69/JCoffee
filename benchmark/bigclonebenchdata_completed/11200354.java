


class c11200354 {
public MyHelperClass module;
	public MyHelperClass users;

    private boolean authenticate(String reply) {
        String user = reply.substring(0, reply.indexOf(" "));
        String resp = reply.substring(reply.indexOf(" ") + 1);
        if (!(Boolean)(Object)users.contains(user)) {
            String error;// = new String();
            error = "so such user " + user;
            return false;
        }
        try {
            MyHelperClass module = new MyHelperClass();
            LineNumberReader secrets = new LineNumberReader(new FileReader(module.secretsFile));
            String line;
            while ((line =(String)(Object) secrets.readLine()) != null) {
                if (line.startsWith(user + ":")) {
                    MyHelperClass MessageDigest = new MyHelperClass();
                    MessageDigest md4 =(MessageDigest)(Object) MessageDigest.getInstance("BrokenMD4");
                    md4.update(new byte[4]);
                    md4.update(line.substring(line.indexOf(":") + 1).getBytes("US-ASCII"));
                    MyHelperClass challenge = new MyHelperClass();
                    md4.update((byte[])(Object)challenge.getBytes("US-ASCII"));
                    MyHelperClass Util = new MyHelperClass();
                    String hash =(String)(Object) Util.base64(md4.digest());
                    if (hash.equals(resp)) {
                        secrets.close();
                        return true;
                    }
                }
            }
            secrets.close();
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.fatal(e.toString());
            String error;// = new String();
            error = "server configuration error";
            return false;
        }
        String error;// = new String();
        error = "authentication failure for module " + module.name;
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass secretsFile;
	public MyHelperClass name;
public MyHelperClass fatal(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass base64(MyHelperClass o0){ return null; }}

class LineNumberReader {

LineNumberReader(){}
	LineNumberReader(FileReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class FileReader {

FileReader(){}
	FileReader(MyHelperClass o0){}}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
