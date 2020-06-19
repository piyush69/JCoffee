


class c15678383 {

    public void run() {
        MyHelperClass videoId = new MyHelperClass();
        videoId = videoId.trim();
        System.out.println("fetching video");
//        MyHelperClass videoId = new MyHelperClass();
        String requestUrl = "http://www.youtube.com/get_video_info?&video_id=" + videoId;
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line =(String)(Object) rd.readLine();
            int from = line.indexOf("&token=") + 7;
            int to = line.indexOf("&thumbnail_url=");
            String id = line.substring(from, to);
//            MyHelperClass videoId = new MyHelperClass();
            String tmp = "http://www.youtube.com/get_video?video_id=" + videoId + "&t=" + id;
            url = new URL(tmp);
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            rd.readLine();
            tmp = conn.getURL().toString();
            url = new URL(tmp);
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            InputStream is;
            OutputStream outStream;
            URLConnection uCon;
            byte[] buf;
            int ByteRead, ByteWritten = 0;
            url = new URL(tmp);
//            MyHelperClass videoId = new MyHelperClass();
            outStream =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(videoId + ".flv"));
            uCon =(URLConnection)(Object) url.openConnection();
            is =(InputStream)(Object) uCon.getInputStream();
            buf = new byte[1024];
            while ((ByteRead =(int)(Object) is.read(buf)) != -1) {
                outStream.write(buf, 0, ByteRead);
                ByteWritten += ByteRead;
            }
            is.close();
            outStream.close();
            MyHelperClass videoUrl = new MyHelperClass();
            System.out.println(videoUrl + " is ready");
        } catch (Exception e) {
//            MyHelperClass videoId = new MyHelperClass();
            System.out.println("Could not find flv-url " + videoId + "! " + e.getMessage());
        } finally {
            boolean ready;// = new boolean();
            ready = true;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass trim(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getURL(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
