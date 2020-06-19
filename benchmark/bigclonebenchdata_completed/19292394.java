


class c19292394 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.sohu.com");
        InputStream is =(InputStream)(Object) url.openStream();
        MyHelperClass Charset = new MyHelperClass();
        InputStreamReader isr = new InputStreamReader(is, Charset.forName("GB18030"));
        FileOutputStream fos = new FileOutputStream("gen/sohu2.html");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        char[] b = new char[2048];
        int temp;
        while (-1 != (temp =(int)(Object) isr.read(b, 0, b.length))) {
            osw.write(b);
        }
        osw.close();
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass forName(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0, MyHelperClass o1){}
	InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}
	public MyHelperClass read(char[] o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0){}
	OutputStreamWriter(){}
	public MyHelperClass write(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}
