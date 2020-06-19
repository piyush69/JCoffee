


class c6992204 {
public static MyHelperClass log(String o0){ return null; }
//public MyHelperClass log(String o0){ return null; }

    public static void executePost(String targetURL, File file, int msec) {
        URL url;
        HttpURLConnection connection = null;
        try {
            long wrCount = 0;
            long fileLen =(long)(Object) file.length();
            log("File length is " + fileLen);
            log("Sleep " + msec + " between each send");
            FileInputStream fis = new FileInputStream(file);
            url = new URL(targetURL);
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "text/xml");
            connection.setRequestProperty("Content-Length", Long.toString(fileLen));
            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            OutputStream wr =(OutputStream)(Object) connection.getOutputStream();
            int count = 0;
            byte[] buffer = new byte[1024 * 10];
            while ((count =(int)(Object) fis.read(buffer)) != -1) {
                wr.write(buffer, 0, count);
                wr.flush();
                wrCount += (long) count;
                log("Progress is " + (wrCount * 100) / fileLen + "%");
                Thread.sleep(msec);
            }
            wr.close();
            fis.close();
            InputStream is =(InputStream)(Object) connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line =(String)(Object) rd.readLine()) != null) {
                System.out.println(line);
            }
            rd.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass length(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

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
