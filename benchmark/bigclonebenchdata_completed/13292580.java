import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13292580 {
public MyHelperClass bytePos;
	public MyHelperClass NULL;
	public MyHelperClass putHook(){ return null; }
public MyHelperClass inputBuffer;
	public MyHelperClass outputBuffer;
	public MyHelperClass inputStream;
	public MyHelperClass output;
	public MyHelperClass outputStream;
	public MyHelperClass Interpreter;
	public MyHelperClass input;
public MyHelperClass readTimeOut;
	public MyHelperClass urlConnection;
	public MyHelperClass connectTimeOut;
	public MyHelperClass setBufIn(InputStream o0){ return null; }
	public MyHelperClass setBufOut(PrintStream o0){ return null; }

    public Node external_open_url(Node startAt) throws Throwable, Exception {
        MyHelperClass inUse = new MyHelperClass();
        if ((boolean)(Object)inUse) {
            MyHelperClass StdErrors = new MyHelperClass();
            throw new InterpreterException((String)(Object)StdErrors.extend(StdErrors.Already_used, "File already open"));
        }
//        MyHelperClass inUse = new MyHelperClass();
        inUse =(MyHelperClass)(Object) true;
        startAt.isGoodArgsLength(false, 2);
        MyHelperClass Node = new MyHelperClass();
        ExtURL url = new ExtURL(startAt.getSubNode(1, Node.TYPE_STRING).getString());
        String protocol =(String)(Object) url.getProtocol();
        String mode = null;
        Node props = null;
        Node datas = null;
        byte[] buffer = null;
        String old_c = null;
        String old_r = null;
        int max_i =(int)(Object) startAt.size() - 1;
        if ((boolean)(Object)startAt.elementAt(max_i).getSymbolicValue_undestructive().isVList()) {
//            MyHelperClass Node = new MyHelperClass();
            props =(Node)(Object) startAt.getSubNode(max_i--, Node.TYPE_LIST);
        }
        int i_ = 2;
        if (i_ <= max_i) {
//            MyHelperClass Node = new MyHelperClass();
            mode =(String)(Object) startAt.getSubNode(i_++, Node.TYPE_STRING).getString().toUpperCase().trim();
            if (protocol.equalsIgnoreCase("http") || protocol.equalsIgnoreCase("https")) {
                if (!(mode.equals("GET") || mode.equals("POST") || mode.equals("PUT"))) {
                    throw new InterpreterException(128010, "Unsupported request methode");
                }
            } else if (protocol.equalsIgnoreCase("ftp") || protocol.equalsIgnoreCase("file")) {
                if (!(mode.equalsIgnoreCase("r") || mode.equalsIgnoreCase("w"))) {
                    throw new InterpreterException(128015, "Unsupported access methode");
                }
            } else if (protocol.equalsIgnoreCase("jar") || protocol.equalsIgnoreCase("stdin")) {
                if (!(mode.equalsIgnoreCase("r"))) {
                    throw new InterpreterException(128015, "Unsupported access methode");
                }
            } else if (protocol.equalsIgnoreCase("tcp") || protocol.equalsIgnoreCase("ssl+tcp")) {
                if (!(mode.equalsIgnoreCase("rw"))) {
                    throw new InterpreterException(128015, "Unsupported access methode");
                }
            } else if (protocol.equalsIgnoreCase("stdout") || protocol.equalsIgnoreCase("stderr")) {
                if (!(mode.equalsIgnoreCase("w"))) {
                    throw new InterpreterException(128015, "Unsupported access methode");
                }
            } else {
                throw new InterpreterException(128011, "Unsupported protocol");
            }
        }
        if (i_ <= max_i) {
            if (!protocol.equalsIgnoreCase("http") && !protocol.equalsIgnoreCase("https")) {
                throw new InterpreterException(128016, "Unsupported request datas");
            }
//            MyHelperClass Node = new MyHelperClass();
            datas = startAt.getSubNode(i_++,(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) Node.TYPE_STRING | (int)(Object)Node.TYPE_OBJECT);
            if ((boolean)(Object)datas.isVObject()) {
                Object obj = datas.getVObjectExternalInstance();
                if (External_Buffer.class.isInstance(obj)) {
                    Buffer bbuffer =(Buffer)(Object) ((External_Buffer) obj).getBuffer();
                    buffer =(byte[])(Object) bbuffer.read_bytes();
                } else {
                    MyHelperClass StdErrors = new MyHelperClass();
                    throw new InterpreterException((String)(Object)StdErrors.extend(StdErrors.Invalid_parameter, "Object (" + obj.getClass().getName() + ") required " + External_Buffer.class.getName()));
                }
            } else {
                buffer =(byte[])(Object) datas.getString().getBytes();
            }
        }
        if (datas != null && mode != null && mode.equals("GET")) {
            throw new InterpreterException(128012, "GET request with data body");
        }
        if (props != null && (!protocol.equalsIgnoreCase("http") && !protocol.equalsIgnoreCase("https"))) {
            throw new InterpreterException(128013, "Cannot handle header properties in request");
        }
        try {
            if (protocol.equalsIgnoreCase("file") && mode != null && mode.equalsIgnoreCase("w")) {
                File f = new File((String)(Object)url.toURI());
                FileOutputStream outputStream =(FileOutputStream)(Object) NULL; //new FileOutputStream();
                outputStream = new FileOutputStream(f);
                BufferedOutputStream outputBuffer =(BufferedOutputStream)(Object) NULL; //new BufferedOutputStream();
                outputBuffer = new BufferedOutputStream((OutputStream)(Object)outputStream);
                DataOutputStream output =(DataOutputStream)(Object) NULL; //new DataOutputStream();
                output = new DataOutputStream((OutputStream)(Object)outputBuffer);
            } else if (protocol.equalsIgnoreCase("tcp")) {
                MyHelperClass tcpHost = new MyHelperClass();
                tcpHost = url.getHost();
                MyHelperClass tcpPort = new MyHelperClass();
                tcpPort = url.getPort();
//                MyHelperClass tcpPort = new MyHelperClass();
                if ((int)(Object)tcpPort < 0 ||(int)(Object) tcpPort > 65535) {
                    MyHelperClass StdErrors = new MyHelperClass();
                    throw new InterpreterException((String)(Object)StdErrors.extend(StdErrors.Out_of_range, "" + tcpPort));
                }
                Socket socket =(Socket)(Object) NULL; //new Socket();
                socket = new Socket((String)(Object)tcpHost,(int)(Object) tcpPort);
                MyHelperClass readTimeOut = new MyHelperClass();
                if ((int)(Object)readTimeOut > 0) {
//                    MyHelperClass readTimeOut = new MyHelperClass();
                    socket.setSoTimeout((int)(Object)readTimeOut);
                }
                InputStream inputStream =(InputStream)(Object) NULL; //new InputStream();
                inputStream = socket.getInputStream();
                BufferedInputStream inputBuffer =(BufferedInputStream)(Object) NULL; //new BufferedInputStream();
                inputBuffer = new BufferedInputStream((InputStream)(Object)inputStream);
                DataInputStream input =(DataInputStream)(Object) NULL; //new DataInputStream();
                input = new DataInputStream((InputStream)(Object)inputBuffer);
                OutputStream outputStream =(OutputStream)(Object) NULL; //new OutputStream();
                outputStream = socket.getOutputStream();
                BufferedOutputStream outputBuffer =(BufferedOutputStream)(Object) NULL; //new BufferedOutputStream();
                outputBuffer = new BufferedOutputStream((OutputStream)(Object)outputStream);
                DataOutputStream output =(DataOutputStream)(Object) NULL; //new DataOutputStream();
                output = new DataOutputStream((OutputStream)(Object)outputBuffer);
            } else if (protocol.equalsIgnoreCase("ssl+tcp")) {
                MyHelperClass tcpHost = new MyHelperClass();
                tcpHost = url.getHost();
                MyHelperClass tcpPort = new MyHelperClass();
                tcpPort = url.getPort();
//                MyHelperClass tcpPort = new MyHelperClass();
                if ((int)(Object)tcpPort < 0 ||(int)(Object) tcpPort > 65535) {
                    MyHelperClass StdErrors = new MyHelperClass();
                    throw new InterpreterException((String)(Object)StdErrors.extend(StdErrors.Out_of_range, "" + tcpPort));
                }
                MyHelperClass SSLSocketFactory = new MyHelperClass();
                SocketFactory socketFactory =(SocketFactory)(Object) SSLSocketFactory.getDefault();
                MyHelperClass socket = new MyHelperClass();
                socket = socketFactory.createSocket(tcpHost, tcpPort);
                MyHelperClass readTimeOut = new MyHelperClass();
                if ((int)(Object)readTimeOut > 0) {
//                    MyHelperClass readTimeOut = new MyHelperClass();
                    socket.setSoTimeout(readTimeOut);
                }
                MyHelperClass inputStream = new MyHelperClass();
                inputStream = socket.getInputStream();
                BufferedInputStream inputBuffer =(BufferedInputStream)(Object) NULL; //new BufferedInputStream();
                inputBuffer = new BufferedInputStream((InputStream)(Object)inputStream);
                DataInputStream input =(DataInputStream)(Object) NULL; //new DataInputStream();
                input = new DataInputStream((InputStream)(Object)inputBuffer);
                MyHelperClass outputStream = new MyHelperClass();
                outputStream = socket.getOutputStream();
                BufferedOutputStream outputBuffer =(BufferedOutputStream)(Object) NULL; //new BufferedOutputStream();
                outputBuffer = new BufferedOutputStream((OutputStream)(Object)outputStream);
                DataOutputStream output =(DataOutputStream)(Object) NULL; //new DataOutputStream();
                output = new DataOutputStream((OutputStream)(Object)outputBuffer);
            } else if (protocol.equalsIgnoreCase("stdout")) {
                setBufOut(System.out);
            } else if (protocol.equalsIgnoreCase("stderr")) {
                setBufOut(System.err);
            } else if (protocol.equalsIgnoreCase("stdin")) {
                setBufIn(System.in);
            } else {
                urlConnection = url.openConnection();
                if ((int)(Object)connectTimeOut > 0) {
                    urlConnection.setConnectTimeout(connectTimeOut);
                }
                if ((int)(Object)readTimeOut > 0) {
                    urlConnection.setReadTimeout(readTimeOut);
                }
                urlConnection.setUseCaches(false);
                urlConnection.setDoInput(true);
                if ((HttpURLConnection)(Object)urlConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpCon = (HttpURLConnection)(HttpURLConnection)(Object) urlConnection;
                    if (props != null) {
                        for (int i = 0; i < (int)(Object)props.size(); i++) {
                            Node pnode =(Node)(Object) props.getSubNode(i, Node.TYPE_DICO);
                            String header_s =(String)(Object) Node.getPairKey(pnode);
                            String value_s =(String)(Object) Node.node2VString(Node.getPairValue(pnode)).getString();
                            Interpreter.Log("   HTTP-Header: " + header_s + " : " + value_s);
                            httpCon.setRequestProperty(header_s, value_s);
                        }
                    }
                    if (mode != null && (mode.equals("POST") || mode.equals("PUT"))) {
                        if (mode.equals("PUT")) {
                            Interpreter.Log("   HTTP PUT: " + url.toString());
                        } else {
                            Interpreter.Log("   HTTP POST: " + url.toString());
                        }
                        urlConnection.setDoOutput(true);
                        httpCon.setRequestMethod(mode);
                        outputStream = urlConnection.getOutputStream();
                        outputBuffer =(MyHelperClass)(Object) new BufferedOutputStream((OutputStream)(Object)outputStream);
                        output =(MyHelperClass)(Object) new DataOutputStream((OutputStream)(Object)outputBuffer);
                        output.write(buffer);
                        output.flush();
                    }
                    inputStream = urlConnection.getInputStream();
                    inputBuffer =(MyHelperClass)(Object) new BufferedInputStream((InputStream)(Object)inputStream);
                    input =(MyHelperClass)(Object) new DataInputStream((InputStream)(Object)inputBuffer);
                } else {
                    if (mode == null || (mode != null && mode.equalsIgnoreCase("r"))) {
                        Interpreter.Log("   " + protocol + " read : " + url.toString());
                        inputStream = urlConnection.getInputStream();
                        inputBuffer =(MyHelperClass)(Object) new BufferedInputStream((InputStream)(Object)inputStream);
                        input =(MyHelperClass)(Object) new DataInputStream((InputStream)(Object)inputBuffer);
                    } else {
                        Interpreter.Log("   " + protocol + " write : " + url.toString());
                        outputStream = urlConnection.getOutputStream();
                        outputBuffer =(MyHelperClass)(Object) new BufferedOutputStream((OutputStream)(Object)outputStream);
                        output =(MyHelperClass)(Object) new DataOutputStream((OutputStream)(Object)outputBuffer);
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
        bytePos =(MyHelperClass)(Object) 0;
        putHook();
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TYPE_DICO;
	public MyHelperClass TYPE_OBJECT;
	public MyHelperClass TYPE_STRING;
	public MyHelperClass Already_used;
	public MyHelperClass Invalid_parameter;
	public MyHelperClass TYPE_LIST;
	public MyHelperClass Out_of_range;
public MyHelperClass getPairKey(Node o0){ return null; }
	public MyHelperClass Log(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass node2VString(MyHelperClass o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setSoTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass extend(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass isVList(){ return null; }
	public MyHelperClass getString(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getPairValue(Node o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass toUpperCase(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getSymbolicValue_undestructive(){ return null; }}

class Node {

public MyHelperClass size(){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }
	public MyHelperClass getSubNode(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass getString(){ return null; }
	public MyHelperClass isGoodArgsLength(boolean o0, int o1){ return null; }
	public MyHelperClass isVObject(){ return null; }
	public MyHelperClass getVObjectExternalInstance(){ return null; }}

class InterpreterException extends Exception{
	public InterpreterException(String errorMessage) { super(errorMessage); }
	InterpreterException(int o0, String o1){}
	InterpreterException(){}
}

class ExtURL {

ExtURL(MyHelperClass o0){}
	ExtURL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass toURI(){ return null; }}

class External_Buffer {

public MyHelperClass getBuffer(){ return null; }}

class Buffer {

public MyHelperClass read_bytes(){ return null; }}

class SocketFactory {

public MyHelperClass createSocket(MyHelperClass o0, MyHelperClass o1){ return null; }}
