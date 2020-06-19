


class c6568286 {
public MyHelperClass readStream(InputStream o0){ return null; }

    private void getPicture(String urlPath, String picId) throws Exception {
        URL url = new URL(urlPath);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(10000);
        if ((int)(Object)conn.getResponseCode() == 200) {
            InputStream inputStream =(InputStream)(Object) conn.getInputStream();
            byte[] data =(byte[])(Object) readStream(inputStream);
            MyHelperClass picDirectory = new MyHelperClass();
            File file = new File(picDirectory + picId);
            FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write(data);
            outputStream.close();
        }
        conn.disconnect();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class InputStream {

}

class File {

File(String o0){}
	File(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}
