import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16975480 {
public MyHelperClass UI;
	public MyHelperClass MessageDialog;
	public MyHelperClass NLS;
	public MyHelperClass Messages;

            public void run()  throws Throwable {
                String baseUrl;
                MyHelperClass _rdoSRTM3FtpUrl = new MyHelperClass();
                if ((boolean)(Object)_rdoSRTM3FtpUrl.getSelection()) {
                } else {
                    MyHelperClass _txtSRTM3HttpUrl = new MyHelperClass();
                    baseUrl =(String)(Object) _txtSRTM3HttpUrl.getText().trim();
                    try {
                        final URL url = new URL(baseUrl);
                        final HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
                        urlConn.connect();
                        final int response = urlConn.getResponseCode();
                        final String responseMessage = urlConn.getResponseMessage();
                        MyHelperClass Messages = new MyHelperClass();
                        final String message = response == HttpURLConnection.HTTP_OK ? NLS.bind(Messages.prefPage_srtm_checkHTTPConnectionOK_message, baseUrl) : NLS.bind(Messages.prefPage_srtm_checkHTTPConnectionFAILED_message, new Object[] { baseUrl, Integer.toString(response), responseMessage == null ? UI.EMPTY_STRING : responseMessage });
                        MyHelperClass Display = new MyHelperClass();
                        MessageDialog.openInformation(Display.getCurrent().getActiveShell(), Messages.prefPage_srtm_checkHTTPConnection_title, message);
                    } catch (final IOException e) {
                        MyHelperClass Display = new MyHelperClass();
                        MessageDialog.openInformation(Display.getCurrent().getActiveShell(), Messages.prefPage_srtm_checkHTTPConnection_title, NLS.bind(Messages.prefPage_srtm_checkHTTPConnection_message, baseUrl));
                        e.printStackTrace();
                    }
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass prefPage_srtm_checkHTTPConnection_title;
	public MyHelperClass prefPage_srtm_checkHTTPConnectionOK_message;
	public MyHelperClass prefPage_srtm_checkHTTPConnection_message;
	public MyHelperClass prefPage_srtm_checkHTTPConnectionFAILED_message;
	public MyHelperClass EMPTY_STRING;
public MyHelperClass bind(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getActiveShell(){ return null; }
	public MyHelperClass getCurrent(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass openInformation(MyHelperClass o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass getSelection(){ return null; }
	public MyHelperClass openInformation(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass bind(MyHelperClass o0, Object[] o1){ return null; }}
