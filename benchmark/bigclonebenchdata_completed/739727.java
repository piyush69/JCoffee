


class c739727 {

    private static String fetch(String urltxt, String cookie) {
        try {
            URL url = new URL(urltxt);
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            InputStream source =(InputStream)(Object) url.openStream();
            String data =(String)(Object) (new Scanner(source).useDelimiter("\\A").next());
            MyHelperClass Pattern = new MyHelperClass();
            Pattern p =(Pattern)(Object) Pattern.compile("form action=\"(.*)\" method=\"post\"");
            Matcher m =(Matcher)(Object) p.matcher(data);
            if (!(Boolean)(Object)m.find()) return "";
            urltxt =(String)(Object) m.group(1);
            url = new URL(urltxt);
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setRequestProperty("Cookie", cookie);
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
            out.write("dl.start=PREMIUM");
            out.flush();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer sb = new StringBuffer();
            while ((data =(String)(Object) in.readLine()) != null) sb.append(data + System.getProperty("line.separator"));
            data = urltxt.substring(urltxt.lastIndexOf("/") + 1);
//            MyHelperClass Pattern = new MyHelperClass();
            p =(Pattern)(Object) Pattern.compile("<tr><td><a href=\"(.*?)" + data);
            m =(Matcher)(Object) p.matcher(sb.toString());
            data = ((boolean)(Object)m.find()) ? (m.group(1) + data + System.getProperty("line.separator")) : "";
            return data;
        } catch (Exception e) {
            return "";
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class Scanner {

Scanner(){}
	Scanner(InputStream o0){}
	public MyHelperClass useDelimiter(String o0){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass group(int o0){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
