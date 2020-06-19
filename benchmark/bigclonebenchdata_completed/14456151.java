


class c14456151 {
public MyHelperClass logInfo(String o0){ return null; }

    List HttpPost(URL url, List requestList) throws IOException {
        List responseList =(List)(Object) new ArrayList();
        URLConnection con;
        BufferedReader in;
        OutputStreamWriter out;
        StringBuffer req;
        String line;
        logInfo("HTTP POST: " + url);
        con =(URLConnection)(Object) url.openConnection();
        con.setDoInput(true);
        con.setDoOutput(true);
        con.setUseCaches(false);
        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        out = new OutputStreamWriter(con.getOutputStream());
        req = new StringBuffer();
        for (int i = 0, n =(int)(Object) requestList.size(); i < n; i++) {
            if (i != 0) req.append("&");
            req.append(((HttpHeader)(HttpHeader)(Object) requestList.get(i)).key);
            req.append("=");
            if ((boolean)(Object)((HttpHeader)(HttpHeader)(Object) requestList.get(i)).unicode) {
                StringBuffer tmp = new StringBuffer(200);
                byte[] uniBytes =(byte[])(Object) ((HttpHeader)(HttpHeader)(Object) requestList.get(i)).value.getBytes("UnicodeBigUnmarked");
                for (int j = 0; j < uniBytes.length; j++) tmp.append(Integer.toHexString(uniBytes[j]).length() == 1 ? "0" + Integer.toHexString(uniBytes[j]) : Integer.toHexString(uniBytes[j]));
                req.append(tmp.toString().replaceAll("ff", ""));
            } else req.append(((HttpHeader)(HttpHeader)(Object) requestList.get(i)).value);
        }
        out.write(req.toString());
        out.flush();
        out.close();
        in = new BufferedReader(new InputStreamReader((con.getInputStream())));
        while ((line =(String)(Object) in.readLine()) != null) responseList.add(line);
        in.close();
        return responseList;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class HttpHeader {
public MyHelperClass key;
	public MyHelperClass value;
	public MyHelperClass unicode;
}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
