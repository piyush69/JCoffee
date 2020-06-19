


class c10839253 {

    public static String getWebContent(String remoteUrl, String encoding) {
        StringBuffer sb = new StringBuffer();
        try {
            java.net.URL url = new java.net.URL(remoteUrl);
            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream(), encoding));
            String line;
            while ((line =(String)(Object) in.readLine()) != null) {
                sb.append(line);
            }
            in.close();
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("获取远程网址内容失败 - " + remoteUrl, e);
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class InputStream {

}
