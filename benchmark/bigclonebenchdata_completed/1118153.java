import java.io.*;
import java.lang.*;
import java.util.*;



class c1118153 {
public MyHelperClass LICENSE_FILE_SHA_KEY;
	public MyHelperClass LICENSE_FILE_OFFSET_KEY;
	public MyHelperClass LICENSE_KEY_KEY;
	public MyHelperClass LICENSE_FILE_STATUS_KEY;
	public MyHelperClass LICENSE_FILE_MAC_KEY;
	public MyHelperClass LICENSE_FILE_EXP_DATE_KEY;
	public MyHelperClass Settings;
	public MyHelperClass logger;
	public MyHelperClass LICENSE_FILE_HOST_NAME_KEY;
	public MyHelperClass MessageDigest;
	public MyHelperClass LICENSE_FILE_USERS_KEY;
	public MyHelperClass LICENSE_EXPIRES_KEY;
	public MyHelperClass getMACAddress(){ return null; }
	public MyHelperClass getLicenseFile(){ return null; }
	public MyHelperClass isSetup(){ return null; }

    public final synchronized boolean isValidLicenseFile() throws LicenseNotSetupException {
        if (!(Boolean)(Object)isSetup()) {
            throw new LicenseNotSetupException();
        }
        boolean returnValue = false;
        Properties properties =(Properties)(Object) getLicenseFile();
        logger.debug("isValidLicenseFile: License to validate:");
        logger.debug(properties);
        StringBuffer validationStringBuffer = new StringBuffer();
        validationStringBuffer.append(LICENSE_KEY_KEY + ":" + properties.getProperty((String)(Object)LICENSE_KEY_KEY) + ",");
        validationStringBuffer.append(LICENSE_FILE_STATUS_KEY + ":" + properties.getProperty((String)(Object)LICENSE_FILE_STATUS_KEY) + ",");
        validationStringBuffer.append(LICENSE_FILE_USERS_KEY + ":" + properties.getProperty((String)(Object)LICENSE_FILE_USERS_KEY) + ",");
        validationStringBuffer.append(LICENSE_FILE_MAC_KEY + ":" + properties.getProperty((String)(Object)LICENSE_FILE_MAC_KEY) + ",");
        validationStringBuffer.append(LICENSE_FILE_HOST_NAME_KEY + ":" + properties.getProperty((String)(Object)LICENSE_FILE_HOST_NAME_KEY) + ",");
        validationStringBuffer.append(LICENSE_FILE_OFFSET_KEY + ":" + properties.getProperty((String)(Object)LICENSE_FILE_OFFSET_KEY) + ",");
        validationStringBuffer.append(LICENSE_FILE_EXP_DATE_KEY + ":" + properties.getProperty((String)(Object)LICENSE_FILE_EXP_DATE_KEY) + ",");
        validationStringBuffer.append(LICENSE_EXPIRES_KEY + ":" + properties.getProperty((String)(Object)LICENSE_EXPIRES_KEY));
        logger.debug("isValidLicenseFile: Validation String Buffer: " + validationStringBuffer.toString());
        String validationKey = (String) properties.getProperty((String)(Object)LICENSE_FILE_SHA_KEY);
        try {
            MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            messageDigest.update(validationStringBuffer.toString().getBytes());
            String newValidation =(String)(Object) Base64.encode(messageDigest.digest());
            if (newValidation.equals(validationKey)) {
                if (getMACAddress().equals(Settings.getInstance().getMACAddress())) {
                    returnValue = true;
                }
            }
        } catch (Exception exception) {
            System.out.println("Exception in LicenseInstanceVO.isValidLicenseFile");
        }
        return returnValue;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMACAddress(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass debug(Properties o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class LicenseNotSetupException extends Exception{
	public LicenseNotSetupException(String errorMessage) { super(errorMessage); }
	LicenseNotSetupException(){}
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class Base64 {

public static MyHelperClass encode(MyHelperClass o0){ return null; }}
