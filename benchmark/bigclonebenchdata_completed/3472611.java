import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3472611 {
public MyHelperClass getString(MyHelperClass o0){ return null; }
public MyHelperClass string;
public MyHelperClass Toast;
	public MyHelperClass ProgressDialog;
	public MyHelperClass TAG;
	public MyHelperClass Log;
	public MyHelperClass FTPReply;
	public MyHelperClass getFtpUsername(){ return null; }
	public MyHelperClass getFtpPassword(){ return null; }
	public MyHelperClass getFtpPort(){ return null; }
	public MyHelperClass getApplicationContext(){ return null; }
	public MyHelperClass getFtpHostname(){ return null; }

//    @Override
    public void onClick(View view)  throws Throwable {
        String ftpHostname =(String)(Object) getFtpHostname();
        String ftpUsername =(String)(Object) getFtpUsername();
        String ftpPassword =(String)(Object) getFtpPassword();
        int ftpPort =(int)(Object) getFtpPort();
        String dialogText = getString(string.testingFTPConnectionDialogHeaderText) + " " + ftpHostname;
        ProgressDialog dialog =(ProgressDialog)(Object) ProgressDialog.show(this, "", dialogText, true);
        String result = "NOTHING??";
        Log.i(TAG, "Test attempt login to " + ftpHostname + " as " + ftpUsername);
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(ftpHostname, ftpPort);
            ftpClient.login(ftpUsername, ftpPassword);
            int reply =(int)(Object) ftpClient.getReplyCode();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                result =(String)(Object) getString(string.testFTPConnectionDeniedString);
                Log.w(TAG, result);
            } else {
                result =(String)(Object) getString(string.testFTPSuccessString);
                Log.i(TAG, result);
            }
        } catch (Exception ex) {
            result =(Exception)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) getString(string.testFTPFailString) + (int)(Object)ex;
            Log.w(TAG, result);
        } finally {
            try {
                dialog.dismiss();
                ftpClient.disconnect();
            } catch (Exception e) {
            }
        }
        Context context =(Context)(Object) getApplicationContext();
        CharSequence text = result;
        int duration =(int)(Object) Toast.LENGTH_LONG;
        Toast toast =(Toast)(Object) Toast.makeText(context, text, duration);
        toast.show();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass testFTPFailString;
	public MyHelperClass LENGTH_LONG;
	public MyHelperClass testFTPConnectionDeniedString;
	public MyHelperClass testingFTPConnectionDialogHeaderText;
	public MyHelperClass testFTPSuccessString;
public MyHelperClass show(c3472611 o0, String o1, String o2, boolean o3){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass w(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass i(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass makeText(Context o0, CharSequence o1, int o2){ return null; }}

class View {

}

class ProgressDialog {

public MyHelperClass dismiss(){ return null; }}

class FTPClient {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class Context {

}

class Toast {

public MyHelperClass show(){ return null; }}
