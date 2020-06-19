
import java.io.UncheckedIOException;


class c23087434 {

    private int[] get51JobId(String address, String category, int pageNum) {
        StringBuffer htmlContent = null;
        try {
            MyHelperClass ConfigJob51 = new MyHelperClass();
            URL url = new URL(ConfigJob51.STR_51JOB_ADVANCE);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.setDoOutput(true);
            OutputStream raw =(OutputStream)(Object) connection.getOutputStream();
            OutputStream buf =(OutputStream)(Object) new BufferedOutputStream(raw);
            OutputStreamWriter out = new OutputStreamWriter(buf, "gb2312");
            out.write("jobarea=" + address + "&funtype=" + category + "&curr_page=" + pageNum + "");
            out.flush();
            out.close();
            InputStream in =(InputStream)(Object) connection.getInputStream();
            in =(InputStream)(Object) new BufferedInputStream(in);
            Reader r =(Reader)(Object) new InputStreamReader(in);
            int c;
            htmlContent = new StringBuffer();
            while ((c =(int)(Object) r.read()) != -1) {
                htmlContent.append((char) c);
            }
            in.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        MyHelperClass JOB51_SEARCHLIST_URL_PATTERN = new MyHelperClass();
        Pattern p =(Pattern)(Object) Pattern.compile(JOB51_SEARCHLIST_URL_PATTERN, Pattern.CASE_INSENSITIVE);
        Matcher matcher =(Matcher)(Object) p.matcher(htmlContent);
        int idSum = 0;
        int writeToDBSuccessful = 0;
        while ((boolean)(Object)matcher.find()) {
            String s =(String)(Object) matcher.group();
            String sql = "insert into `job51`(`id`,`retryCnt`,`Category`) values('" + s.replaceAll("[^0-9]", "") + "','0','" + category + "')";
            MyHelperClass mysql = new MyHelperClass();
            if ((boolean)(Object)mysql.executeInsert(sql)) {
                writeToDBSuccessful++;
            }
            idSum++;
        }
        return new int[] { idSum, writeToDBSuccessful };
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STR_51JOB_ADVANCE;
public MyHelperClass executeInsert(String o0){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStream {

}

class BufferedOutputStream {

BufferedOutputStream(OutputStream o0){}
	BufferedOutputStream(){}}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(OutputStream o0, String o1){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}}

class Reader {

public MyHelperClass read(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Pattern {
public static MyHelperClass CASE_INSENSITIVE;
public static MyHelperClass compile(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass matcher(StringBuffer o0){ return null; }}

class Matcher {

public MyHelperClass group(){ return null; }
	public MyHelperClass find(){ return null; }}
