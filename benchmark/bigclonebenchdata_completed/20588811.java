
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20588811 {
public MyHelperClass timexfrmk;
	public MyHelperClass version;
	public MyHelperClass adminfeedkey;
	public MyHelperClass Authenticator;
	public MyHelperClass user;
	public MyHelperClass URLEncoder;
	public MyHelperClass logger;
	public MyHelperClass password;
	public MyHelperClass getTimeDifferent(long o0){ return null; }
	public MyHelperClass isAdminFeedKeySet(){ return null; }

    public void run() {
        long time = System.currentTimeMillis();
        MyHelperClass version = new MyHelperClass();
        logger.info("Version: " + version);
        MyHelperClass properties = new MyHelperClass();
        String hostname =(String)(Object) properties.getProperty("mercuriushost");
//        MyHelperClass properties = new MyHelperClass();
        String protocol =(String)(Object) properties.getProperty("mercuriusprotocol");
//        MyHelperClass properties = new MyHelperClass();
        String port =(String)(Object) properties.getProperty("mercuriusport");
//        MyHelperClass properties = new MyHelperClass();
        String path =(String)(Object) properties.getProperty("mercuriuspath");
//        MyHelperClass properties = new MyHelperClass();
        String action =(String)(Object) properties.getProperty("mercuriusaction");
        logger.info("Getting Timex Data --- " + getTimeDifferent(time));
        String xml =(String)(Object) timexfrmk.getUnsynchedSessionsXMLFormat();
        logger.info("Done getting Timex Data --- " + getTimeDifferent(time));
        if ((int)(Object)timexfrmk.getSessionCount() > 0) {
            try {
                logger.info("Sending Timex Data to Mercurius --- " + getTimeDifferent(time));
                String data = URLEncoder.encode("action", "UTF-8") + "=" + URLEncoder.encode(action, "UTF-8");
                data += "&" + URLEncoder.encode("data", "UTF-8") + "=" + URLEncoder.encode(xml, "UTF-8");
                if ((boolean)(Object)isAdminFeedKeySet()) {
                    data += "&" + URLEncoder.encode("adminfeedkey", "UTF-8") + "=" + URLEncoder.encode(adminfeedkey, "UTF-8");
                    logger.debug("Using adminfeedkey to authenticate");
                } else {
                    Authenticator.setDefault(new CustomAuthenticator(user, password));
                    logger.debug("Using user/pwd to authenticate");
                }
                String u = protocol + "://" + hostname + ":" + port + path;
                logger.debug("Posting xml data to: " + u);
                URL url = new URL(u);
                URLConnection conn =(URLConnection)(Object) url.openConnection();
                conn.setRequestProperty("User-Agent", "TimexMercurius/" + version);
                conn.setDoOutput(true);
                OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
                wr.write(data);
                wr.flush();
                BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                StringBuffer s = new StringBuffer();
                while ((line =(String)(Object) rd.readLine()) != null) {
                    s.append(line);
                }
                if (s.length() > 0) {
                    logger.debug(s.toString());
                    if (s.toString().indexOf("Result:") != -1) {
                        logger.info(s.toString().substring(s.toString().indexOf("Result:")));
                        if (s.toString().indexOf("Result: Successful") != -1) {
                            timexfrmk.updateSessionsStatus();
                        }
                    } else {
                        logger.error(s.toString());
                    }
                } else {
                    logger.info("No data returned");
                }
                wr.close();
                rd.close();
            } catch (UncheckedIOException e) {
                logger.error(e);
                logger.trace(e, e);
            } catch (ArithmeticException e) {
                logger.error(e);
                logger.trace(e, e);
            } catch (Exception e) {
                logger.error(e);
                logger.trace(e, e);
            }
        } else {
            logger.info("There is nothing to send.  Everything has already been synchronized");
        }
        timexfrmk.close();
        logger.info("Done!!! Total Time: " + getTimeDifferent(time));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDefault(CustomAuthenticator o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass error(MalformedURLException o0){ return null; }
	public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getUnsynchedSessionsXMLFormat(){ return null; }
	public MyHelperClass encode(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass trace(IOException o0, IOException o1){ return null; }
	public MyHelperClass getSessionCount(){ return null; }
	public MyHelperClass trace(MalformedURLException o0, MalformedURLException o1){ return null; }
	public MyHelperClass trace(Exception o0, Exception o1){ return null; }
	public MyHelperClass updateSessionsStatus(){ return null; }
	public MyHelperClass error(Exception o0){ return null; }}

class CustomAuthenticator {

CustomAuthenticator(){}
	CustomAuthenticator(MyHelperClass o0, MyHelperClass o1){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
