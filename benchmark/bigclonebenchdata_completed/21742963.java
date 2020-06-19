


class c21742963 {

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("usage: PutFromFile [properties file] [file with pmpxml]");
            throw new IllegalArgumentException("Wrong number of arguments");
        }
        Reader is =(Reader)(Object) new FileReader(args[1]);
        char[] b = new char[1024];
        StringBuffer sb = new StringBuffer();
        int n;
        while ((n =(int)(Object) is.read(b)) > 0) {
            sb.append(b, 0, n);
        }
        String test = sb.toString();
        System.out.println(test);
        String strurl = args[0];
        MyHelperClass URLEncoder = new MyHelperClass();
        String data = "verb=PutRecord&xml=" + URLEncoder.encode(test, "UTF-8");
        URL url = new URL(strurl);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write(data);
        wr.flush();
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line =(String)(Object) rd.readLine()) != null) {
            System.out.println(line);
        }
        wr.close();
        rd.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class Reader {

public MyHelperClass read(char[] o0){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
