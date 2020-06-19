


class c8693874 {

    public void test5() {
        try {
            SocketAddress proxyAddress =(SocketAddress)(Object) new InetSocketAddress("127.0.0.1", 8080);
            MyHelperClass Type = new MyHelperClass();
            Proxy proxy = new Proxy(Type.HTTP, proxyAddress);
            URL url = new URL("http://woodstock.net.br:8443");
            URLConnection connection =(URLConnection)(Object) url.openConnection(proxy);
            InputStream inputStream =(InputStream)(Object) connection.getInputStream();
            Scanner scanner = new Scanner(inputStream);
            while ((boolean)(Object)scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP;
}

class SocketAddress {

}

class InetSocketAddress {

InetSocketAddress(String o0, int o1){}
	InetSocketAddress(){}}

class Proxy {

Proxy(MyHelperClass o0, SocketAddress o1){}
	Proxy(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(Proxy o0){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class Scanner {

Scanner(InputStream o0){}
	Scanner(){}
	public MyHelperClass hasNextLine(){ return null; }
	public MyHelperClass nextLine(){ return null; }}
