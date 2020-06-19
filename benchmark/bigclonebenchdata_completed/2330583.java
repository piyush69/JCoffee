import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2330583 {

    private CExtractHelper getData(String p_url)  throws Throwable {
        CExtractHelper l_extractHelper = new CExtractHelper();
        URL l_url;
        HttpURLConnection l_connection;
        try {
            System.out.println("Getting [" + p_url + "]");
            l_url = new URL(p_url);
            try {
                URLConnection l_uconn = l_url.openConnection();
                l_connection = (HttpURLConnection) l_uconn;
                l_connection.setConnectTimeout(2000);
                l_connection.setReadTimeout(2000);
                l_connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.8.1.1) Gecko/20061204 Firefox/2.0.0.1");
                l_connection.connect();
                int l_responseCode = l_connection.getResponseCode();
                String response = l_connection.getResponseMessage();
                System.out.println("HTTP/1.x " + l_responseCode + " " + response);
                for (int j = 1; ; j++) {
                    String l_header = l_connection.getHeaderField(j);
                    String l_key = l_connection.getHeaderFieldKey(j);
                    if (l_header == null || l_key == null) {
                        break;
                    }
                }
                InputStream l_inputStream = new BufferedInputStream(l_connection.getInputStream());
                CRemoteXML l_parser = new CRemoteXML();
                try {
                    Document l_document =(Document)(Object) l_parser.parse(l_inputStream);
                    MyHelperClass charsetName = new MyHelperClass();
                    PrintWriter l_writerOut = new PrintWriter(new OutputStreamWriter((OutputStream)(Object)System.out,(String)(Object) charsetName), true);
                    MyHelperClass OutputFormat = new MyHelperClass();
                    OutputFormat l_format =(OutputFormat)(Object) OutputFormat.createPrettyPrint();
                    XMLWriter l_xmlWriter = new XMLWriter(l_writerOut, l_format);
                    l_xmlWriter.write(l_document);
                    l_xmlWriter.flush();
                    l_connection.disconnect();
                    l_extractHelper.m_document =(MyHelperClass)(Object) l_document;
                    return l_extractHelper;
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                    l_connection.disconnect();
                    System.out.println("XML parsing issue");
                    l_extractHelper.m_generalFailure =(MyHelperClass)(Object) true;
                }
            } catch (SocketTimeoutException e) {
                l_extractHelper.m_timeoutFailure =(MyHelperClass)(Object) true;
                System.out.println("Timed out");
            } catch (IOException e) {
                e.printStackTrace();
                l_extractHelper.m_generalFailure =(MyHelperClass)(Object) true;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            l_extractHelper.m_generalFailure =(MyHelperClass)(Object) true;
        }
        return l_extractHelper;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createPrettyPrint(){ return null; }}

class CExtractHelper {
public MyHelperClass m_generalFailure;
	public MyHelperClass m_document;
	public MyHelperClass m_timeoutFailure;
}

class CRemoteXML {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

}

class OutputFormat {

}

class XMLWriter {

XMLWriter(PrintWriter o0, OutputFormat o1){}
	XMLWriter(){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(Document o0){ return null; }}

class DocumentException extends Exception{
	public DocumentException(String errorMessage) { super(errorMessage); }
}
