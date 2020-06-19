


class c1002618 {
public MyHelperClass control_listening;
	public MyHelperClass xsl;
	public MyHelperClass xlin;
	public MyHelperClass as_php;
	public MyHelperClass pservname;

    public void run() {
        MyHelperClass withlinlyn = new MyHelperClass();
        if ((boolean)(Object)withlinlyn == true) {
            try {
                MyHelperClass file = new MyHelperClass();
                xlin.erase(file);
            } catch (Exception e) {
                System.out.println("Error erasing");
            }
        MyHelperClass as_php = new MyHelperClass();
        } else if ((boolean)(Object)as_php) {
            try {
                MyHelperClass http = new MyHelperClass();
                URL url = new URL(http + "REM:" + pservname);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                System.out.println("Response from REMOVE:");
                String s;
                while ((s =(String)(Object) br.readLine()) != null) {
                    System.out.println(s);
                }
                br.close();
            } catch (Exception e) {
                System.out.println("Error erasing/php!");
            }
        }
        try {
            MyHelperClass InetAddress = new MyHelperClass();
            InetAddress ia =(InetAddress)(Object) InetAddress.getLocalHost();
            ServerSocket ss;// = new ServerSocket();
            ss = new ServerSocket(0, 50, ia);
            long startserv;// = new long();
            startserv = System.currentTimeMillis();
//            MyHelperClass ss = new MyHelperClass();
            ss.setSoTimeout(0);
            String svname =(String)(Object) ia.getHostAddress();
            System.out.println(svname + ":sv");
//            MyHelperClass ss = new MyHelperClass();
            String mssg = "<SERVER><IP>" + svname + "</IP><PORT>" + ss.getLocalPort() + "</PORT></SERVER>";
//            MyHelperClass withlinlyn = new MyHelperClass();
            if ((boolean)(Object)withlinlyn == true) {
                try {
                    MyHelperClass file = new MyHelperClass();
                    xlin.replace(file, mssg);
                    System.out.println("mssg:" + mssg + ", sent");
                } catch (Exception e) {
                    System.out.println("Error posting address");
                    return;
                }
            MyHelperClass as_php = new MyHelperClass();
            } else if ((boolean)(Object)as_php) {
                try {
                    MyHelperClass http = new MyHelperClass();
                    URL url = new URL(http + "ADD:" + svname + ":" + ss.getLocalPort() + ":" + pservname);
                    BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                    String response = "";
                    String s;
                    while ((s =(String)(Object) br.readLine()) != null) {
                        response = response + s + System.getProperty("line.separator");
                    }
                    br.close();
                    String resp =(String)(Object) (new xLineSplit().ssplit("REPLY", response));
                    if (!resp.equalsIgnoreCase("ADDED")) {
                        System.out.println("potential error posting via php:\nReponse was:\n" + response);
                    }
                } catch (Exception e) {
                    System.out.println("Error in posting php:" + e.toString());
                }
            }
//            MyHelperClass ss = new MyHelperClass();
            xsl.regserver(svname, new String("" + ss.getLocalPort()));
            Socket server = null;
            boolean listening;// = new boolean();
            listening = true;
//            MyHelperClass listening = new MyHelperClass();
            while ((boolean)(Object)listening) {
//                MyHelperClass ss = new MyHelperClass();
                server =(Socket)(Object) ss.accept();
                if (server != null) {
                    MyHelperClass xsl = new MyHelperClass();
                    xsl.add(server);
                    System.out.println("added connect");
                } else {
                    System.out.println("Received null socket");
                }
                server = null;
//                MyHelperClass listening = new MyHelperClass();
                listening =(boolean)(Object) control_listening;
            }
            long finserv;// = new long();
            finserv = System.currentTimeMillis();
//            MyHelperClass finserv = new MyHelperClass();
            long l =(int)(Object) finserv - startserv;
            long m = l / 1000;
            System.err.println("Server socket has closed, time elapsed:" + m);
            System.out.println("Server socket has closed, time elapsed:" + m);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replace(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass accept(){ return null; }
	public MyHelperClass erase(MyHelperClass o0){ return null; }
	public MyHelperClass getLocalPort(){ return null; }
	public MyHelperClass regserver(String o0, String o1){ return null; }
	public MyHelperClass getLocalHost(){ return null; }
	public MyHelperClass setSoTimeout(int o0){ return null; }
	public MyHelperClass add(Socket o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class InetAddress {

public MyHelperClass getHostAddress(){ return null; }}

class xLineSplit {

public MyHelperClass ssplit(String o0, String o1){ return null; }}

class Socket {

}

class ServerSocket {

ServerSocket(int o0, int o1, InetAddress o2){}
	ServerSocket(){}
	public MyHelperClass accept(){ return null; }
	public MyHelperClass getLocalPort(){ return null; }
	public MyHelperClass setSoTimeout(int o0){ return null; }}
