


class c7540262 {

    public static boolean sendPostRequest(String path, Map params, String encoding) throws Exception {
        StringBuilder sb = new StringBuilder("");
        if (params != null && !(Boolean)(Object)params.isEmpty()) {
            for (Entry entry :(Entry[])(Object) (Object[])(Object)params.entrySet()) {
                MyHelperClass URLEncoder = new MyHelperClass();
                sb.append(entry.getKey()).append('=').append(URLEncoder.encode(entry.getValue(), encoding)).append('&');
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        byte[] data = sb.toString().getBytes();
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setConnectTimeout(5 * 1000);
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length", String.valueOf(data.length));
        OutputStream outStream =(OutputStream)(Object) conn.getOutputStream();
        outStream.write(data);
        outStream.flush();
        outStream.close();
        if ((int)(Object)conn.getResponseCode() == 200) {
            InputStream inputStream =(InputStream)(Object) conn.getInputStream();
            MyHelperClass ResponseResult = new MyHelperClass();
            return(boolean)(Object) ResponseResult.parseXML(inputStream);
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parseXML(InputStream o0){ return null; }
	public MyHelperClass encode(MyHelperClass o0, String o1){ return null; }}

class Map {

public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass entrySet(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}
