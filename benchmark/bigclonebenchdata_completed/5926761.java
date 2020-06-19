import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5926761 {
public MyHelperClass NULL;
public MyHelperClass MetadataHelper;
public MyHelperClass feedback;
	public MyHelperClass feedbackView;
	public MyHelperClass HIRuntime;
	public MyHelperClass addLine(String o0){ return null; }

//    @Override
    public void actionPerformed(ActionEvent e)  throws Throwable {
        MyHelperClass feedbackView = new MyHelperClass();
        if ((int)(Object)feedbackView.getText().length() <= 0) return;
        try {
            TrustManager[] trustAllCerts = new TrustManager[] {(TrustManager)(Object) new X509TrustManager() {

                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                }
            } };
            try {
                MyHelperClass SSLContext = new MyHelperClass();
                SSLContext sc =(SSLContext)(Object) SSLContext.getInstance("SSL");
                sc.init(null, trustAllCerts, new java.security.SecureRandom());
                MyHelperClass HttpsURLConnection = new MyHelperClass();
                HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            String feedback =(String)(Object) NULL; //new String();
            feedback = "";
//            MyHelperClass feedbackView = new MyHelperClass();
            addLine("Type            : " + feedbackView.getType());
            MyHelperClass HIRuntime = new MyHelperClass();
            addLine("User            : " + HIRuntime.getManager().getCurrentUser().getLastName() + ", " + HIRuntime.getManager().getCurrentUser().getFirstName() + " (" + HIRuntime.getManager().getCurrentUser().getUserName() + ") " + HIRuntime.getManager().getCurrentUser().getEmail());
//            MyHelperClass HIRuntime = new MyHelperClass();
            addLine("Project         : P" + HIRuntime.getManager().getProject().getId() + " - " + MetadataHelper.findValue(HIRuntime.getManager().getProject(), HIRuntime.getManager().getProject().getDefaultLanguage().getLanguageId()));
//            MyHelperClass HIRuntime = new MyHelperClass();
            addLine("Client Version  : " + HIRuntime.getClientVersion());
//            MyHelperClass HIRuntime = new MyHelperClass();
            addLine("Service URL     : " + HIRuntime.getManager().getServerURL());
            try {
//                MyHelperClass HIRuntime = new MyHelperClass();
                addLine("Service Version : " + HIRuntime.getManager().getVersionID());
            } catch (HIWebServiceException e1) {
            }
            addLine("Client OS       : " + System.getProperty("os.name") + " " + System.getProperty("os.version") + " (" + System.getProperty("os.arch") + ")");
            addLine("Java Version    : " + System.getProperty("java.version") + " (" + System.getProperty("java.vendor") + ")");
            if (HIRuntime.getGui().getLastWSError() == null) addLine("Last WS Error   : -none-"); else {
                HIWebServiceException lastWSError =(HIWebServiceException)(Object) HIRuntime.getGui().getLastWSError();
                addLine("Last WS Error   : " + lastWSError.getCause().getMessage() + " (" + lastWSError.getErrorType() + ")");
                addLine("");
                addLine("Stack Trace");
                addLine("-----------");
                ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
                PrintWriter writer = new PrintWriter(byteStream);
                lastWSError.getCause().printStackTrace(writer);
                writer.close();
                addLine(new String(byteStream.toByteArray()));
            }
            addLine("");
            addLine("Message");
            addLine("-------");
            feedback = feedback + feedbackView.getText();
            feedback =(MyHelperClass)(Object) feedback + "\n\n";
            feedback = URLEncoder.encode((String)(Object)feedback, "UTF-8");
            URL url = new URL("https://hyperimage.cms.hu-berlin.de/2.0/wstart/provideFeedback.php");
            HttpsURLConnection connection = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setDoOutput(true);
            PrintWriter writer = new PrintWriter((Writer)(Object)connection.getOutputStream());
            writer.write("raw_fb=" + feedback);
            writer.close();
            connection.connect();
            String response =(String)(Object) connection.getResponseMessage();
            if (response.compareTo("OK") == 0) {
                HIRuntime.getGui().clearLastWSError();
                HIRuntime.getGui().displayInfoDialog("Feedback gesendet", "Vielen Dank für Ihr Feedback!\n\nIhre Nachricht wurde an die HyperImage Entwickler gesendet.");
            } else HIRuntime.getGui().displayInfoDialog("Feedback Fehlgeschlagen", "Leider konnte Ihr Feedback aufgrund eines Systemfehlers nicht gesendet werden.\n" + "Bitte versuchen Sie es später erneut.\n\n" + "Sollte das Problem bestehen bleiben wenden Sie sich bitte per mail an die Entwickler.\n\nVielen Dank!");
            connection.disconnect();
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
            HIRuntime.getGui().displayInfoDialog("Feedback Fehlgeschlagen", "Leider konnte Ihr Feedback aufgrund eines Systemfehlers nicht gesendet werden.\n" + "Bitte versuchen Sie es später erneut.\n\n" + "Sollte das Problem bestehen bleiben wenden Sie sich bitte per mail an die Entwickler.\n\nVielen Dank!");
        } catch (IOException e2) {
            e2.printStackTrace();
            HIRuntime.getGui().displayInfoDialog("Feedback Fehlgeschlagen", "Leider konnte Ihr Feedback aufgrund eines Systemfehlers nicht gesendet werden.\n" + "Bitte versuchen Sie es später erneut.\n\n" + "Sollte das Problem bestehen bleiben wenden Sie sich bitte per mail an die Entwickler.\n\nVielen Dank!");
        }
        HIRuntime.getGui().deregisterComponent(this, false);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass displayInfoDialog(String o0, String o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass getGui(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getFirstName(){ return null; }
	public MyHelperClass getCurrentUser(){ return null; }
	public MyHelperClass deregisterComponent(c5926761 o0, boolean o1){ return null; }
	public MyHelperClass getVersionID(){ return null; }
	public MyHelperClass clearLastWSError(){ return null; }
	public MyHelperClass getClientVersion(){ return null; }
	public MyHelperClass getLastWSError(){ return null; }
	public MyHelperClass setDefaultSSLSocketFactory(MyHelperClass o0){ return null; }
	public MyHelperClass getLanguageId(){ return null; }
	public MyHelperClass getServerURL(){ return null; }
	public MyHelperClass getLastName(){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass getProject(){ return null; }
	public MyHelperClass findValue(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getManager(){ return null; }
	public MyHelperClass getUserName(){ return null; }
	public MyHelperClass getDefaultLanguage(){ return null; }}

class ActionEvent {

}

class TrustManager {

}

class X509TrustManager {

}

class SSLContext {

public MyHelperClass init(Object o0, TrustManager[] o1, SecureRandom o2){ return null; }
	public MyHelperClass getSocketFactory(){ return null; }}

class HIWebServiceException extends Exception{
	public HIWebServiceException(String errorMessage) { super(errorMessage); }
}

class HttpsURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}
