import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4617216 {
public MyHelperClass parentWorkflow;

    public Object downloadObject() throws CommunicationException, FileNotFoundException, InvalidClassException, ClassNotFoundException {
        Object returnObject = null;
        String requestStr = new String();
        HttpURLConnection connection = null;
        try {
            MyHelperClass urlString = new MyHelperClass();
            URL url = new URL((String)(Object)urlString);
            MyHelperClass parameters = new MyHelperClass();
            for (java.util.Iterator i =(Iterator)(Object) parameters.entrySet().iterator(); i.hasNext(); ) {
                java.util.Map.Entry e = (java.util.Map.Entry) i.next();
                requestStr += URLEncoder.encode((String) e.getKey(), "UTF-8") + "=" + URLEncoder.encode((String) e.getValue(), "UTF-8") + "&";
            }
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.connect();
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            out.println(requestStr);
            out.close();
            System.out.println("HTTPCommunication.downloadObject() - Response:" + connection.getResponseCode() + " : " + connection.getResponseMessage());
            if (connection.getResponseCode() == connection.HTTP_OK) {
                GZIPInputStream gzipIn = new GZIPInputStream(connection.getInputStream());
                ObjectInputStream objectIn = new ObjectInputStream((InputStream)(Object)gzipIn);
                returnObject = objectIn.readObject();
                objectIn.close();
            } else if (connection.getResponseCode() == connection.HTTP_NOT_FOUND) {
                throw new FileNotFoundException(connection.getResponseMessage());
            } else {
                throw new CommunicationException(connection.getResponseMessage(), connection.getResponseCode());
            }
        } catch (java.net.ConnectException ce) {
            MyHelperClass urlString = new MyHelperClass();
            throw new CommunicationException("Cannot connect to " + urlString + ".\n" + "Server is not responding!", ce);
        } catch (java.net.MalformedURLException mfue) {
            MyHelperClass urlString = new MyHelperClass();
            throw new CommunicationException("Cannot connect to " + urlString + ".\n" + "Bad url string!", mfue);
        } catch (ClassNotFoundException cnfe) {
            throw cnfe;
        } catch (InvalidClassException ice) {
            throw ice;
        } catch (java.io.FileNotFoundException fnfe) {
            throw fnfe;
        } catch (java.io.InterruptedIOException iioe) {
            this.parentWorkflow.getMenuButtonEventHandler().stopAutomaticRefresh();
            throw new CommunicationException("Communication is timeouted", iioe);
        } catch (java.io.IOException ioe) {
            throw new CommunicationException("Error while trying to communicate the server: \n" + ioe.getMessage(), ioe);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return returnObject;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass stopAutomaticRefresh(){ return null; }
	public MyHelperClass getMenuButtonEventHandler(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass entrySet(){ return null; }}

class CommunicationException extends Exception{
	public CommunicationException(String errorMessage) { super(errorMessage); }
	CommunicationException(String o0, ConnectException o1){}
	CommunicationException(String o0, int o1){}
	CommunicationException(String o0, IOException o1){}
	CommunicationException(){}
	CommunicationException(String o0, InterruptedIOException o1){}
	CommunicationException(String o0, MalformedURLException o1){}
}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}
