import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22939296 {
public MyHelperClass saveChanges(){ return null; }
public MyHelperClass addWebDAVSSL;
	public MyHelperClass jWebDAVSSL;
	public MyHelperClass jWebDAVHttps;
	public MyHelperClass NULL;
	public MyHelperClass jProviderLogin;
	public MyHelperClass jProviderPassword;
	public MyHelperClass jCHEntrust;
	public MyHelperClass jWebDAVHost;
	public MyHelperClass jWebDAVP12Password;
	public MyHelperClass jWebDAVSelectP12;
	public MyHelperClass EnvironmentalVariables;
	public MyHelperClass jWebDAVPort;
	public MyHelperClass jWebDAVP12Filename;
public MyHelperClass jHolderName;
	public MyHelperClass jProviderURL;
	public MyHelperClass jACType;
	public MyHelperClass jValidityPeriod;
	public MyHelperClass jDefaultProfile;
	public MyHelperClass vars;
	public MyHelperClass serialNumber;
	public MyHelperClass jDISAddress;

    private void modifyDialog(boolean fileExists)  throws Throwable {
        if (fileExists) {
            MyHelperClass EnvironmentalVariables = new MyHelperClass();
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.WEBDAV_REVOCATION_LOCATION)) {
                String RevLocation =(String)(Object) NULL; //new String();
                RevLocation = ((String)(String)(Object) vars.get((String)(Object)EnvironmentalVariables.WEBDAV_REVOCATION_LOCATION));
            }
//            MyHelperClass EnvironmentalVariables = new MyHelperClass();
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.WEBDAV_CERTIFICATE_LOCATION)) {
                String CertLocation =(String)(Object) NULL; //new String();
                CertLocation = ((String)(String)(Object) vars.get((String)(Object)EnvironmentalVariables.WEBDAV_CERTIFICATE_LOCATION));
            }
//            MyHelperClass EnvironmentalVariables = new MyHelperClass();
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.HOLDER_NAME_STRING)) {
//                MyHelperClass EnvironmentalVariables = new MyHelperClass();
                jHolderName.setText((String)(String)(Object) vars.get((String)(Object)EnvironmentalVariables.HOLDER_NAME_STRING));
            MyHelperClass jHolderName = new MyHelperClass();
            } else jHolderName.setText("<EMPTY>");
//            MyHelperClass EnvironmentalVariables = new MyHelperClass();
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.LDAP_HOLDER_EDITOR_UTILITY)) {
//                MyHelperClass EnvironmentalVariables = new MyHelperClass();
                if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.HOLDER_EDITOR_UTILITY_SERVER)) {
//                    MyHelperClass EnvironmentalVariables = new MyHelperClass();
                    jProviderURL.setText((String)(String)(Object) vars.get((String)(Object)EnvironmentalVariables.HOLDER_EDITOR_UTILITY_SERVER));
                }
            }
//            MyHelperClass EnvironmentalVariables = new MyHelperClass();
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.SERIAL_NUMBER_STRING)) {
                String serialNumber =(String)(Object) NULL; //new String();
                serialNumber = (String)(String)(Object) vars.get((String)(Object)EnvironmentalVariables.SERIAL_NUMBER_STRING);
//            MyHelperClass serialNumber = new MyHelperClass();
            } else serialNumber =(MyHelperClass)(Object) "<EMPTY>";
//            MyHelperClass EnvironmentalVariables = new MyHelperClass();
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.VALIDITY_PERIOD_STRING)) {
//                MyHelperClass EnvironmentalVariables = new MyHelperClass();
                jValidityPeriod.setText((String)(String)(Object) vars.get((String)(Object)EnvironmentalVariables.VALIDITY_PERIOD_STRING));
            MyHelperClass jValidityPeriod = new MyHelperClass();
            } else jValidityPeriod.setText("<EMPTY>");
            MyHelperClass LDAPSavingUtility = new MyHelperClass();
            if ((boolean)(Object)vars.containsKey((String)(Object)LDAPSavingUtility.LDAP_SAVING_UTILITY_AC_TYPE)) {
//                MyHelperClass LDAPSavingUtility = new MyHelperClass();
                String acType = (String)(String)(Object) vars.get((String)(Object)LDAPSavingUtility.LDAP_SAVING_UTILITY_AC_TYPE);
//                MyHelperClass LDAPSavingUtility = new MyHelperClass();
                if ((!acType.equals("")) && (!acType.equals("<EMPTY>"))) jACType.setText((String)(String)(Object) vars.get((String)(Object)LDAPSavingUtility.LDAP_SAVING_UTILITY_AC_TYPE)); else jACType.setText("attributeCertificateAttribute");
            }
            MyHelperClass utils = new MyHelperClass();
            if ((boolean)(Object)utils.containsKey("issrg.acm.extensions.SimpleSigningUtility")) {
                MyHelperClass DefaultSecurity = new MyHelperClass();
                if ((boolean)(Object)vars.containsKey((String)(Object)DefaultSecurity.DEFAULT_FILE_STRING)) {
//                    MyHelperClass DefaultSecurity = new MyHelperClass();
                    jDefaultProfile.setText((String)(String)(Object) vars.get((String)(Object)DefaultSecurity.DEFAULT_FILE_STRING));
                MyHelperClass jDefaultProfile = new MyHelperClass();
                } else jDefaultProfile.setText("<EMPTY>");
                MyHelperClass jCHEntrust = new MyHelperClass();
                jCHEntrust.setSelected(true);
            } else {
                MyHelperClass jCHEntrust = new MyHelperClass();
                jCHEntrust.setSelected(false);
                MyHelperClass jDefaultProfile = new MyHelperClass();
                jDefaultProfile.setEnabled(false);
            }
//            MyHelperClass utils = new MyHelperClass();
            if ((boolean)(Object)utils.containsKey("issrg.acm.extensions.ACMDISSigningUtility")) {
                MyHelperClass vars = new MyHelperClass();
                if ((boolean)(Object)vars.containsKey("DefaultDIS")) {
//                    MyHelperClass vars = new MyHelperClass();
                    jDISAddress.setText((String)(String)(Object) vars.get("DefaultDIS"));
                MyHelperClass jDISAddress = new MyHelperClass();
                } else jDISAddress.setText("<EMPTY>");
                MyHelperClass jDIS = new MyHelperClass();
                jDIS.setSelected(true);
                MyHelperClass jCHEntrust = new MyHelperClass();
                jCHEntrust.setSelected(true);
                MyHelperClass jDefaultProfile = new MyHelperClass();
                jDefaultProfile.setEnabled(true);
                MyHelperClass DefaultSecurity = new MyHelperClass();
                if ((boolean)(Object)vars.containsKey((String)(Object)DefaultSecurity.DEFAULT_FILE_STRING)) {
//                    MyHelperClass DefaultSecurity = new MyHelperClass();
                    jDefaultProfile.setText((String)(String)(Object) vars.get((String)(Object)DefaultSecurity.DEFAULT_FILE_STRING));
//                MyHelperClass jDefaultProfile = new MyHelperClass();
                } else jDefaultProfile.setText("permis.p12");
            } else {
                MyHelperClass jDIS = new MyHelperClass();
                jDIS.setSelected(false);
                MyHelperClass jDISAddress = new MyHelperClass();
                jDISAddress.setEnabled(false);
            }
//            MyHelperClass EnvironmentalVariables = new MyHelperClass();
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.AAIA_LOCATION)) {
MyHelperClass[] jaaia = new MyHelperClass[5];
                jaaia[0].setSelected(true);
            }
//            MyHelperClass EnvironmentalVariables = new MyHelperClass();
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.NOREV_LOCATION)) {
MyHelperClass[] jnorev = new MyHelperClass[5];
                jnorev[0].setSelected(true);
MyHelperClass[] jdavrev = new MyHelperClass[5];
                jdavrev[0].setEnabled(false);
//                MyHelperClass jdavrev = new MyHelperClass();
                jdavrev[1].setEnabled(false);
//                MyHelperClass jdavrev = new MyHelperClass();
                jdavrev[1].setSelected(false);
            }
//            MyHelperClass EnvironmentalVariables = new MyHelperClass();
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.DAVREV_LOCATION)) {
MyHelperClass[] jdavrev = new MyHelperClass[5];
                jdavrev[0].setSelected(true);
MyHelperClass[] jnorev = new MyHelperClass[5];
                jnorev[0].setEnabled(false);
//                MyHelperClass jnorev = new MyHelperClass();
                jnorev[1].setEnabled(false);
//                MyHelperClass jnorev = new MyHelperClass();
                jnorev[1].setSelected(true);
            }
            MyHelperClass vars = new MyHelperClass();
            if ((boolean)(Object)vars.containsKey("LDAPSavingUtility.ProviderURI")) {
//                MyHelperClass vars = new MyHelperClass();
                jProviderURL.setText((String)(String)(Object) vars.get("LDAPSavingUtility.ProviderURI"));
            MyHelperClass jProviderURL = new MyHelperClass();
            } else jProviderURL.setText("<EMPTY>");
//            MyHelperClass vars = new MyHelperClass();
            if ((boolean)(Object)vars.containsKey("LDAPSavingUtility.Login")) {
//                MyHelperClass vars = new MyHelperClass();
                jProviderLogin.setText((String)(String)(Object) vars.get("LDAPSavingUtility.Login"));
            MyHelperClass jProviderLogin = new MyHelperClass();
            } else jProviderLogin.setText("<EMPTY>");
//            MyHelperClass vars = new MyHelperClass();
            if ((boolean)(Object)vars.containsKey("LDAPSavingUtility.Password")) {
//                MyHelperClass vars = new MyHelperClass();
                jProviderPassword.setText((String)(String)(Object) vars.get("LDAPSavingUtility.Password"));
            MyHelperClass jProviderPassword = new MyHelperClass();
            } else jProviderPassword.setText("<EMPTY>");
//            MyHelperClass EnvironmentalVariables = new MyHelperClass();
            if ((!(Boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.TRUSTSTORE)) || (((String)(String)(Object) vars.get((String)(Object)EnvironmentalVariables.TRUSTSTORE)).equals(""))) {
                vars.put(EnvironmentalVariables.TRUSTSTORE, "truststorefile");
            }
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.WEBDAV_HOST)) {
                jWebDAVHost.setText((String)(String)(Object) vars.get((String)(Object)EnvironmentalVariables.WEBDAV_HOST));
            } else {
                jWebDAVHost.setText("<EMPTY>");
            }
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.WEBDAV_PORT)) {
                jWebDAVPort.setText((String)(String)(Object) vars.get((String)(Object)EnvironmentalVariables.WEBDAV_PORT));
            } else {
                jWebDAVPort.setText("<EMPTY>");
            }
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.WEBDAV_PROTOCOL)) {
                if (vars.get((String)(Object)EnvironmentalVariables.WEBDAV_PROTOCOL).equals("HTTPS")) {
                    jWebDAVHttps.setSelected(true);
                    jWebDAVSelectP12.setEnabled(true);
                    jWebDAVP12Filename.setEnabled(true);
                    jWebDAVP12Password.setEnabled(true);
                    jWebDAVSSL.setEnabled(true);
                    addWebDAVSSL.setEnabled(true);
                } else {
                    jWebDAVHttps.setSelected(false);
                    jWebDAVSelectP12.setEnabled(false);
                    jWebDAVP12Filename.setEnabled(false);
                    jWebDAVP12Password.setEnabled(false);
                    jWebDAVSSL.setEnabled(false);
                    addWebDAVSSL.setEnabled(false);
                }
            } else {
                jWebDAVHttps.setSelected(false);
            }
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.WEBDAV_P12FILENAME)) {
                jWebDAVP12Filename.setText((String)(String)(Object) vars.get((String)(Object)EnvironmentalVariables.WEBDAV_P12FILENAME));
            } else {
                jWebDAVP12Filename.setText("<EMPTY>");
            }
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.WEBDAV_P12PASSWORD)) {
                jWebDAVP12Password.setText((String)(String)(Object) vars.get((String)(Object)EnvironmentalVariables.WEBDAV_P12PASSWORD));
            } else {
                jWebDAVP12Password.setText("<EMPTY>");
            }
            if ((boolean)(Object)vars.containsKey((String)(Object)EnvironmentalVariables.WEBDAV_SSLCERTIFICATE)) {
                jWebDAVSSL.setText((String)(String)(Object) vars.get((String)(Object)EnvironmentalVariables.WEBDAV_SSLCERTIFICATE));
            } else {
                jWebDAVSSL.setText("<EMPTY>");
            }
        } else {
            jHolderName.setText("cn=A Permis Test User, o=PERMIS, c=gb");
            try {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(new Date().toString().getBytes());
                byte[] result = md.digest();
                BigInteger bi = new BigInteger(result);
                bi = bi.abs();
                serialNumber =(MyHelperClass)(Object) bi.toString(16);
            } catch (Exception e) {
                serialNumber =(MyHelperClass)(Object) "<EMPTY>";
            }
            jValidityPeriod.setText("<EMPTY>");
            jDefaultProfile.setText("permis.p12");
            jCHEntrust.setSelected(true);
            jProviderURL.setText("ldap://sec.cs.kent.ac.uk/c=gb");
            jProviderLogin.setText("");
            jProviderPassword.setText("");
            jWebDAVHost.setText("");
            jWebDAVPort.setText("443");
            jWebDAVP12Filename.setText("");
            jACType.setText("attributeCertificateAttribute");
            vars.put(EnvironmentalVariables.TRUSTSTORE, "truststorefile");
            saveChanges();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WEBDAV_CERTIFICATE_LOCATION;
	public MyHelperClass DAVREV_LOCATION;
	public MyHelperClass WEBDAV_P12PASSWORD;
	public MyHelperClass SERIAL_NUMBER_STRING;
	public MyHelperClass TRUSTSTORE;
	public MyHelperClass AAIA_LOCATION;
	public MyHelperClass HOLDER_EDITOR_UTILITY_SERVER;
	public MyHelperClass WEBDAV_HOST;
	public MyHelperClass WEBDAV_PROTOCOL;
	public MyHelperClass WEBDAV_REVOCATION_LOCATION;
	public MyHelperClass LDAP_SAVING_UTILITY_AC_TYPE;
	public MyHelperClass[] jaaia;
	public MyHelperClass VALIDITY_PERIOD_STRING;
	public MyHelperClass DEFAULT_FILE_STRING;
	public MyHelperClass WEBDAV_P12FILENAME;
	public MyHelperClass[] jnorev;
	public MyHelperClass WEBDAV_SSLCERTIFICATE;
	public MyHelperClass WEBDAV_PORT;
	public MyHelperClass[] jdavrev;
	public MyHelperClass NOREV_LOCATION;
	public MyHelperClass LDAP_HOLDER_EDITOR_UTILITY;
	public MyHelperClass HOLDER_NAME_STRING;
public MyHelperClass put(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass setSelected(boolean o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }}
