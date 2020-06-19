import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1276377 {
public static MyHelperClass in;
	public static MyHelperClass out;
	public static MyHelperClass rconSocket;
	public static MyHelperClass digestedToHex(byte[] o0){ return null; }
	public static MyHelperClass readResponse(BufferedReader o0, StringBuffer o1){ return null; }
public MyHelperClass rconSocket;
	public MyHelperClass in;
	public MyHelperClass out;
	public MyHelperClass digestedToHex(byte[] o0){ return null; }
	public MyHelperClass readResponse(BufferedReader o0, StringBuffer o1){ return null; }

    public static String send(String ipStr, int port, String password, String command, InetAddress localhost, int localPort) throws Throwable, SocketTimeoutException, BadRcon,(Throwable)(Object) ResponseEmpty {
        StringBuffer response = new StringBuffer();
        try {
            Socket rconSocket = NULL; //new Socket();
            rconSocket = new Socket();
//            MyHelperClass rconSocket = new MyHelperClass();
            rconSocket.bind(new InetSocketAddress(localhost, localPort));
            MyHelperClass RESPONSE_TIMEOUT = new MyHelperClass();
            rconSocket.connect(new InetSocketAddress(ipStr, port), RESPONSE_TIMEOUT);
            MyHelperClass out = new MyHelperClass();
            out = rconSocket.getOutputStream();
            MyHelperClass in = new MyHelperClass();
            in = rconSocket.getInputStream();
//            MyHelperClass in = new MyHelperClass();
            BufferedReader buffRead = new BufferedReader(new InputStreamReader((InputStream)(Object)in));
//            MyHelperClass RESPONSE_TIMEOUT = new MyHelperClass();
            rconSocket.setSoTimeout(RESPONSE_TIMEOUT);
            String digestSeed = "";
            boolean loggedIn = false;
            boolean keepGoing = true;
            while (keepGoing) {
                String receivedContent = buffRead.readLine();
                if (receivedContent.startsWith("### Digest seed: ")) {
                    digestSeed = receivedContent.substring(17, receivedContent.length());
                    try {
                        MessageDigest md5 = MessageDigest.getInstance("MD5");
                        md5.update(digestSeed.getBytes());
                        md5.update(password.getBytes());
                        String digestStr = "login " + digestedToHex(md5.digest()) + "\n";
                        out.write(digestStr.getBytes());
                    } catch (NoSuchAlgorithmException e1) {
                        response.append("MD5 algorithm not available - unable to complete RCON request.");
                        keepGoing = false;
                    }
                } else if (receivedContent.startsWith("error: not authenticated: you can only invoke 'login'")) {
                    throw(Throwable)(Object) new BadRcon();
                } else if (receivedContent.startsWith("Authentication failed.")) {
                    throw(Throwable)(Object) new BadRcon();
                } else if (receivedContent.startsWith("Authentication successful, rcon ready.")) {
                    keepGoing = false;
                    loggedIn = true;
                }
            }
            if (loggedIn) {
                String cmd = "exec " + command + "\n";
                out.write(cmd.getBytes());
                readResponse(buffRead, response);
                if (response.length() == 0) {
                    throw(Throwable)(Object) new ResponseEmpty();
                }
            }
        } catch (SocketTimeoutException timeout) {
            throw timeout;
        } catch (UnknownHostException e) {
            response.append("UnknownHostException: " + e.getMessage());
        } catch (IOException e) {
            response.append("Couldn't get I/O for the connection: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
                if (rconSocket != null) {
                    rconSocket.close();
                }
            } catch (IOException e1) {
            }
        }
        return response.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass connect(InetSocketAddress o0, MyHelperClass o1){ return null; }
	public MyHelperClass setSoTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass bind(InetSocketAddress o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass close(){ return null; }}

class BadRcon {

}

class ResponseEmpty {

}
