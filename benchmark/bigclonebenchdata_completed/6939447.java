import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6939447 {
public MyHelperClass LOG;
	public MyHelperClass lblMessage;
	public MyHelperClass btnRemind;
	public MyHelperClass Level;
	public MyHelperClass btnRegister;
	public MyHelperClass NbPreferences;
	public MyHelperClass FeaturesPanel;
	public MyHelperClass checkStockScanPRORegistration(){ return null; }
	public MyHelperClass checkMrSwingRegistration(){ return null; }

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt)  throws Throwable {
        MyHelperClass txtUsername = new MyHelperClass();
        String username = txtUsername.getText();
        MyHelperClass txtPassword = new MyHelperClass();
        String pass = new String(txtPassword.getPassword());
        String password = null;
        MyHelperClass NbPreferences = new MyHelperClass();
        Preferences p = NbPreferences.root().node("/org/chartsy/register");
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
//            MyHelperClass txtPassword = new MyHelperClass();
            md5.update(new String(txtPassword.getPassword()).getBytes());
            BigInteger hash = new BigInteger(1, md5.digest());
            password = hash.toString(16);
        } catch (NoSuchAlgorithmException ex) {
            MyHelperClass Level = new MyHelperClass();
            LOG.log(Level.SEVERE, null, ex);
        }
        try {
            MyHelperClass lblMessage = new MyHelperClass();
            lblMessage.setText("Checking registration ...");
            MyHelperClass btnRegister = new MyHelperClass();
            btnRegister.setEnabled(false);
            MyHelperClass btnRemind = new MyHelperClass();
            btnRemind.setEnabled(false);
            MyHelperClass ProxyManager = new MyHelperClass();
            HttpClient client = ProxyManager.getDefault().getHttpClient();
            MyHelperClass NbBundle = new MyHelperClass();
            GetMethod method = new GetMethod(NbBundle.getMessage(RegisterForm.class, "CheckReg_URL"));
            method.setQueryString(new NameValuePair[] { new NameValuePair("username", username), new NameValuePair("password", password) });
            client.executeMethod(method);
            BufferedReader br = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream()));
            boolean chartsyRegistred = false;
            String name = null;
            if (br != null) {
                String firstLine = br.readLine();
                if (firstLine.equals("OK")) {
                    chartsyRegistred = true;
                    name = br.readLine();
                    p.putBoolean("registred", true);
                    p.put("name", name);
                    p.put("date", String.valueOf(new Date().getTime()));
                    p.put("username", username);
                    p.put("password", pass);
                }
            }
            int userId =(int)(Object) checkStockScanPRORegistration();
            boolean stockScanPRORegistred = userId != 0;
            boolean mrSwingRegistred = stockScanPRORegistred ? true : checkMrSwingRegistration();
            p.putBoolean("mrswingregistred", mrSwingRegistred);
            Preferences prefs = NbPreferences.root().node("/org/chartsy/stockscanpro");
            prefs.putBoolean("stockscanproregistred", stockScanPRORegistred);
            prefs.putInt("stockscanprouser", userId);
            FeaturesPanel.getDefault().hideBanners();
            if (chartsyRegistred) {
                if (name != null) {
                    lblMessage.setText(name + ", thank you for the registration.");
                } else {
                    lblMessage.setText("Thank you for the registration.");
                }
                btnRegister.setVisible(false);
                btnRemind.setText("Close");
                btnRemind.setEnabled(true);
            } else {
                lblMessage.setText("Error, could not register. Check your username and password.");
                btnRegister.setEnabled(true);
                btnRemind.setEnabled(true);
            }
        } catch (IOException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass getMessage(Class<RegisterForm o0, String o1){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass root(){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class Preferences {

public MyHelperClass putInt(String o0, int o1){ return null; }
	public MyHelperClass putBoolean(String o0, boolean o1){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}

class HttpClient {

public MyHelperClass executeMethod(GetMethod o0){ return null; }}

class GetMethod {

public MyHelperClass getResponseBodyAsStream(){ return null; }
	public MyHelperClass setQueryString(NameValuePair[] o0){ return null; }}

class RegisterForm {

}

class NameValuePair {

NameValuePair(String o0, String o1){}
	NameValuePair(){}}
