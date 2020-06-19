


class c7143591 {
public MyHelperClass webDepth;
	public MyHelperClass deepUrls;
	public MyHelperClass fPath;
	public MyHelperClass addReport(String o0){ return null; }
	public MyHelperClass addWebFailed(){ return null; }
	public MyHelperClass getUrlByString(String o0, String o1){ return null; }
	public MyHelperClass addWebSuccessed(){ return null; }

    public void getWebByUrl(String strUrl, String charset, String fileIndex) {
        try {
            System.out.println("Getting web by url: " + strUrl);
            addReport("Getting web by url: " + strUrl + "\n");
            URL url = new URL(strUrl);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            InputStream is = null;
            is =(InputStream)(Object) url.openStream();
            String filePath = fPath + "/web" + fileIndex + ".htm";
            PrintWriter pw = null;
            FileOutputStream fos = new FileOutputStream(filePath);
            OutputStreamWriter writer = new OutputStreamWriter(fos);
            pw = new PrintWriter(writer);
            BufferedReader bReader = new BufferedReader(new InputStreamReader(is));
            StringBuffer sb = new StringBuffer();
            String rLine = null;
            String tmp_rLine = null;
            while ((rLine =(String)(Object) bReader.readLine()) != null) {
                tmp_rLine = rLine;
                int str_len = tmp_rLine.length();
                if (str_len > 0) {
                    sb.append("\n" + tmp_rLine);
                    pw.println(tmp_rLine);
                    pw.flush();
                    if ((int)(Object)deepUrls.get(strUrl) < (int)(Object)webDepth) getUrlByString(tmp_rLine, strUrl);
                }
                tmp_rLine = null;
            }
            is.close();
            pw.close();
            System.out.println("Get web successfully! " + strUrl);
            addReport("Get web successfully! " + strUrl + "\n");
            addWebSuccessed();
        } catch (Exception e) {
            System.out.println("Get web failed!       " + strUrl);
            addReport("Get web failed!       " + strUrl + "\n");
            addWebFailed();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(OutputStreamWriter o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0){}
	OutputStreamWriter(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
