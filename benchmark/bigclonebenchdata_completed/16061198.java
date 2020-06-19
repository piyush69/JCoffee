


class c16061198 {

    public void download(String target) {
        try {
            MyHelperClass url = new MyHelperClass();
            if (url == null) return;
            HttpURLConnection conn;// = new HttpURLConnection();
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
//            MyHelperClass conn = new MyHelperClass();
            conn.setRequestProperty("User-Agent", "Internet Explorer");
//            MyHelperClass conn = new MyHelperClass();
            conn.setReadTimeout(10000);
//            MyHelperClass conn = new MyHelperClass();
            conn.connect();
            BufferedReader httpReader;// = new BufferedReader();
            httpReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            java.io.BufferedWriter out =(java.io.BufferedWriter)(Object) new BufferedWriter(new FileWriter(target, false));
//            MyHelperClass httpReader = new MyHelperClass();
            String str =(String)(Object) httpReader.readLine();
            while (str != null) {
                out.write(str);
//                MyHelperClass httpReader = new MyHelperClass();
                str =(String)(Object) httpReader.readLine();
            }
            out.close();
//            MyHelperClass url = new MyHelperClass();
            System.out.println("file download successfully: " + url.getHost() + url.getPath());
            System.out.println("saved to: " + target);
        } catch (Exception e) {
            MyHelperClass url = new MyHelperClass();
            System.out.println("file download failed: " + url.getHost() + url.getPath());
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}}

class FileWriter {

FileWriter(){}
	FileWriter(String o0, boolean o1){}}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
