import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4314597 {
public MyHelperClass JOptionPane;
	public MyHelperClass ErrorJDialog;
	public MyHelperClass printStackTrace(MyHelperClass o0, StringBuffer o1){ return null; }

    public void run()  throws Throwable {
        StringBuffer messageStringBuffer = new StringBuffer();
        MyHelperClass UpdateChannel = new MyHelperClass();
        messageStringBuffer.append("Program: \t" + UpdateChannel.getCurrentChannel().getApplicationTitle() + "\n");
        MyHelperClass Lister = new MyHelperClass();
        messageStringBuffer.append("Version: \t" + Lister.version + "\n");
//        MyHelperClass Lister = new MyHelperClass();
        messageStringBuffer.append("Revision: \t" + Lister.revision + "\n");
//        MyHelperClass UpdateChannel = new MyHelperClass();
        messageStringBuffer.append("Channel: \t" + UpdateChannel.getCurrentChannel().getName() + "\n");
//        MyHelperClass Lister = new MyHelperClass();
        messageStringBuffer.append("Date: \t\t" + Lister.date + "\n\n");
        messageStringBuffer.append("OS: \t\t" + System.getProperty("os.name") + " (" + System.getProperty("os.version") + ")\n");
        messageStringBuffer.append("JAVA: \t\t" + System.getProperty("java.version") + " (" + System.getProperty("java.specification.vendor") + ")\n");
        messageStringBuffer.append("Desktop: \t" + System.getProperty("sun.desktop") + "\n");
        MyHelperClass Language = new MyHelperClass();
        messageStringBuffer.append("Language: \t" + Language.getCurrentInstance() + "\n\n");
        messageStringBuffer.append("------------------------------------------\n");
        MyHelperClass summary = new MyHelperClass();
        if (summary != null) {
//            MyHelperClass summary = new MyHelperClass();
            messageStringBuffer.append(summary + "\n\n");
        }
        messageStringBuffer.append("Details:\n");
        MyHelperClass description = new MyHelperClass();
        if (description != null) {
//            MyHelperClass description = new MyHelperClass();
            messageStringBuffer.append(description);
        }
        MyHelperClass exception = new MyHelperClass();
        if (exception != null) {
            messageStringBuffer.append("\n\nStacktrace:\n");
//            MyHelperClass exception = new MyHelperClass();
            printStackTrace(exception, messageStringBuffer);
        }
        try {
            MyHelperClass dialog = new MyHelperClass();
            if (dialog != null) {
//                MyHelperClass dialog = new MyHelperClass();
                setComponentsEnabled(dialog.getContentPane(), false);
            }
//            MyHelperClass UpdateChannel = new MyHelperClass();
            URL url = UpdateChannel.getCurrentChannel().getErrorReportURL();
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(urlConnection.getOutputStream());
            MyHelperClass sender = new MyHelperClass();
            if (sender != null) {
//                MyHelperClass sender = new MyHelperClass();
                outputStreamWriter.write(URLEncoder.encode("sender", "UTF-8") + "=" + URLEncoder.encode((String)(Object)sender, "UTF-8"));
                outputStreamWriter.write("&");
            }
            outputStreamWriter.write(URLEncoder.encode("report", "UTF-8") + "=" + URLEncoder.encode(messageStringBuffer.toString(), "UTF-8"));
            MyHelperClass attachErrorLog = new MyHelperClass();
            if ((boolean)(Object)attachErrorLog) {
                outputStreamWriter.write("&");
                MyHelperClass Logger = new MyHelperClass();
                outputStreamWriter.write(URLEncoder.encode("error.log", "UTF-8") + "=" + URLEncoder.encode(Logger.getErrorLogContent(), "UTF-8"));
            }
            outputStreamWriter.flush();
            urlConnection.getInputStream().close();
            outputStreamWriter.close();
//            MyHelperClass dialog = new MyHelperClass();
            if (dialog != null) {
//                MyHelperClass dialog = new MyHelperClass();
                dialog.dispose();
            }
//            MyHelperClass Lister = new MyHelperClass();
            JOptionPane.showMessageDialog(Lister.getCurrentInstance(), Language.translateStatic("MESSAGE_ERRORREPORTSENT"));
//        } catch (Exception exception) {
            MyHelperClass dialog = new MyHelperClass();
            ErrorJDialog.showErrorDialog(dialog, exception);
//            MyHelperClass dialog = new MyHelperClass();
            if (dialog != null) {
//                MyHelperClass dialog = new MyHelperClass();
                setComponentsEnabled(dialog.getContentPane(), true);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass date;
	public MyHelperClass revision;
	public MyHelperClass version;
public MyHelperClass getCurrentInstance(){ return null; }
	public MyHelperClass dispose(){ return null; }
	public MyHelperClass getCurrentChannel(){ return null; }
	public MyHelperClass getErrorLogContent(){ return null; }
	public MyHelperClass translateStatic(String o0){ return null; }
	public MyHelperClass getContentPane(){ return null; }}
