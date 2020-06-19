import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11930427 {

    private static String getServiceResponse(final String requestName, final Template template, final Map variables)  throws Throwable {
        OutputStreamWriter outputWriter = null;
        try {
            final StringWriter writer = new StringWriter();
            final VelocityContext context = new VelocityContext(variables);
            template.merge(context, writer);
            final String request = writer.toString();
            MyHelperClass SERVICE_URL = new MyHelperClass();
            final URLConnection urlConnection = new URL((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)SERVICE_URL).openConnection();
            urlConnection.setUseCaches(false);
            urlConnection.setDoOutput(true);
            urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.2b4) Gecko/20091124 Firefox/3.6b4");
            urlConnection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
            urlConnection.setRequestProperty("Accept-Language", "en-us,en;q=0.5");
            urlConnection.setRequestProperty("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*;q=0.7");
            urlConnection.setRequestProperty("Accept-Encoding", "gzip,deflate");
            urlConnection.setRequestProperty("Keep-Alive", "115");
            urlConnection.setRequestProperty("Connection", "keep-alive");
            urlConnection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            urlConnection.setRequestProperty("Content-Length", "" + request.length());
            urlConnection.setRequestProperty("SOAPAction", requestName);
            outputWriter = new OutputStreamWriter(urlConnection.getOutputStream(), "UTF-8");
            outputWriter.write(request);
            outputWriter.flush();
            final InputStream result = urlConnection.getInputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            return IOUtils.toString(result);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            if (outputWriter != null) {
                try {
                    outputWriter.close();
                } catch (IOException logOrIgnore) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Template {

public MyHelperClass merge(VelocityContext o0, StringWriter o1){ return null; }}

class VelocityContext {

VelocityContext(){}
	VelocityContext(Map o0){}}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
