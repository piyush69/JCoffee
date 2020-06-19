


class c845651 {

    public static void main(String[] args) throws IOException, WrongFormatException, URISyntaxException {
        System.out.println(new URI("google.com.ua.css").toString());
        Scanner scc = new Scanner((InputStream)(Object)System.in);
        System.err.print(scc.nextLine().substring(1));
        ServerSocket s = new ServerSocket(5354);
        while (true) {
            Socket client =(Socket)(Object) s.accept();
            InputStream iStream =(InputStream)(Object) client.getInputStream();
            BufferedReader bf = new BufferedReader(new InputStreamReader(iStream));
            String line = "";
            while (!(line =(String)(Object) bf.readLine()).equals("")) {
                System.out.println(line);
            }
            System.out.println("end of request");
            new PrintWriter(client.getOutputStream()).println("hi");
            bf.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass substring(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class WrongFormatException extends Exception{
	public WrongFormatException(String errorMessage) { super(errorMessage); }
}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class URI {

URI(String o0){}
	URI(){}}

class Scanner {

Scanner(InputStream o0){}
	Scanner(){}
	public MyHelperClass nextLine(){ return null; }}

class ServerSocket {

ServerSocket(int o0){}
	ServerSocket(){}
	public MyHelperClass accept(){ return null; }}

class Socket {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class PrintWriter {

PrintWriter(MyHelperClass o0){}
	PrintWriter(){}
	public MyHelperClass println(String o0){ return null; }}
