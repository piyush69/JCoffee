


class c1527633 {

    public String getWebcontent(final String link, final String postdata) {
        final StringBuffer response = new StringBuffer();
        try {
            MyHelperClass DisableSSLCertificateCheckUtil = new MyHelperClass();
            DisableSSLCertificateCheckUtil.disableChecks();
            final URL url = new URL(link);
            final URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            final OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(postdata);
            wr.flush();
            final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String content = "";
            while ((content =(String)(Object) rd.readLine()) != null) {
                response.append(content);
                response.append('\n');
            }
            wr.close();
            rd.close();
        } catch (final Exception e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error("getWebcontent(String link, String postdata): " + e.toString() + "\012" + link + "\012" + postdata);
        }
        return response.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass disableChecks(){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
