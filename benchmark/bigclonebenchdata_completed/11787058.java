import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11787058 {
public MyHelperClass UserUtil;
	public MyHelperClass checkLockout(User o0){ return null; }
	public MyHelperClass checkPasswordExpired(User o0){ return null; }

    protected int authenticate(long companyId, String login, String password, String authType, Map headerMap, Map parameterMap) throws Throwable, PortalException, SystemException {
        login = login.trim().toLowerCase();
        MyHelperClass GetterUtil = new MyHelperClass();
        long userId =(long)(Object) GetterUtil.getLong(login);
        MyHelperClass CompanyImpl = new MyHelperClass();
        if (authType.equals(CompanyImpl.AUTH_TYPE_EA)) {
            MyHelperClass Validator = new MyHelperClass();
            if (!(Boolean)(Object)Validator.isEmailAddress(login)) {
                throw new UserEmailAddressException();
            }
//        MyHelperClass CompanyImpl = new MyHelperClass();
        } else if (authType.equals(CompanyImpl.AUTH_TYPE_SN)) {
            MyHelperClass Validator = new MyHelperClass();
            if ((boolean)(Object)Validator.isNull(login)) {
                throw new UserScreenNameException();
            }
//        MyHelperClass CompanyImpl = new MyHelperClass();
        } else if (authType.equals(CompanyImpl.AUTH_TYPE_ID)) {
            MyHelperClass Validator = new MyHelperClass();
            if ((boolean)(Object)Validator.isNull(login)) {
                throw new UserIdException();
            }
        }
        MyHelperClass Validator = new MyHelperClass();
        if ((boolean)(Object)Validator.isNull(password)) {
            MyHelperClass UserPasswordException = new MyHelperClass();
            throw new UserPasswordException((String)(Object)UserPasswordException.PASSWORD_INVALID);
        }
        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
        MyHelperClass FAILURE = new MyHelperClass();
        int authResult = Authenticator.FAILURE;
        MyHelperClass PropsUtil = new MyHelperClass();
        String[] authPipelinePre =(String[])(Object) PropsUtil.getArray(PropsUtil.AUTH_PIPELINE_PRE);
//        MyHelperClass CompanyImpl = new MyHelperClass();
        if (authType.equals(CompanyImpl.AUTH_TYPE_EA)) {
            MyHelperClass AuthPipeline = new MyHelperClass();
            authResult =(int)(Object) AuthPipeline.authenticateByEmailAddress(authPipelinePre, companyId, login, password, headerMap, parameterMap);
//        MyHelperClass CompanyImpl = new MyHelperClass();
        } else if (authType.equals(CompanyImpl.AUTH_TYPE_SN)) {
            MyHelperClass AuthPipeline = new MyHelperClass();
            authResult =(int)(Object) AuthPipeline.authenticateByScreenName(authPipelinePre, companyId, login, password, headerMap, parameterMap);
//        MyHelperClass CompanyImpl = new MyHelperClass();
        } else if (authType.equals(CompanyImpl.AUTH_TYPE_ID)) {
            MyHelperClass AuthPipeline = new MyHelperClass();
            authResult =(int)(Object) AuthPipeline.authenticateByUserId(authPipelinePre, companyId, userId, password, headerMap, parameterMap);
        }
        User user = null;
        try {
//            MyHelperClass CompanyImpl = new MyHelperClass();
            if (authType.equals(CompanyImpl.AUTH_TYPE_EA)) {
                MyHelperClass UserUtil = new MyHelperClass();
                user =(User)(Object) UserUtil.findByC_EA(companyId, login);
//            MyHelperClass CompanyImpl = new MyHelperClass();
            } else if (authType.equals(CompanyImpl.AUTH_TYPE_SN)) {
                MyHelperClass UserUtil = new MyHelperClass();
                user =(User)(Object) UserUtil.findByC_SN(companyId, login);
//            MyHelperClass CompanyImpl = new MyHelperClass();
            } else if (authType.equals(CompanyImpl.AUTH_TYPE_ID)) {
//                MyHelperClass GetterUtil = new MyHelperClass();
                user =(User)(Object) UserUtil.findByC_U(companyId, GetterUtil.getLong(login));
            }
        } catch (NoSuchUserException nsue) {
            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
            MyHelperClass DNE = new MyHelperClass();
            return Authenticator.DNE;
        }
        if ((boolean)(Object)user.isDefaultUser()) {
            MyHelperClass _log = new MyHelperClass();
            _log.error("The default user should never be allowed to authenticate");
            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
//            MyHelperClass DNE = new MyHelperClass();
            MyHelperClass DNE = new MyHelperClass();
            return Authenticator.DNE;
        }
        if (!(Boolean)(Object)user.isPasswordEncrypted()) {
            MyHelperClass PwdEncryptor = new MyHelperClass();
            user.setPassword(PwdEncryptor.encrypt(user.getPassword()));
            user.setPasswordEncrypted(true);
            MyHelperClass UserUtil = new MyHelperClass();
            UserUtil.update(user);
        }
        checkLockout(user);
        checkPasswordExpired(user);
        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
        MyHelperClass SUCCESS = new MyHelperClass();
        if (authResult == Authenticator.SUCCESS) {
//            MyHelperClass PropsUtil = new MyHelperClass();
            if ((boolean)(Object)GetterUtil.getBoolean(PropsUtil.get(PropsUtil.AUTH_PIPELINE_ENABLE_LIFERAY_CHECK))) {
                MyHelperClass PwdEncryptor = new MyHelperClass();
                String encPwd =(String)(Object) PwdEncryptor.encrypt(password, user.getPassword());
                if (user.getPassword().equals(encPwd)) {
//                    MyHelperClass SUCCESS = new MyHelperClass();
//                    MyHelperClass SUCCESS = new MyHelperClass();
//                    MyHelperClass SUCCESS = new MyHelperClass();
//                    MyHelperClass SUCCESS = new MyHelperClass();
//                    MyHelperClass SUCCESS = new MyHelperClass();
//                    MyHelperClass SUCCESS = new MyHelperClass();
//                    MyHelperClass SUCCESS = new MyHelperClass();
//                    MyHelperClass SUCCESS = new MyHelperClass();
//                    MyHelperClass SUCCESS = new MyHelperClass();
                    MyHelperClass SUCCESS = new MyHelperClass();
                    authResult = Authenticator.SUCCESS;
//                MyHelperClass PropsUtil = new MyHelperClass();
                } else if ((boolean)(Object)GetterUtil.getBoolean(PropsUtil.get(PropsUtil.AUTH_MAC_ALLOW))) {
                    try {
//                        MyHelperClass PropsUtil = new MyHelperClass();
                        MessageDigest digester = MessageDigest.getInstance((String)(Object)PropsUtil.get(PropsUtil.AUTH_MAC_ALGORITHM));
                        digester.update(login.getBytes("UTF8"));
//                        MyHelperClass PropsUtil = new MyHelperClass();
                        String shardKey =(String)(Object) PropsUtil.get(PropsUtil.AUTH_MAC_SHARED_KEY);
                        encPwd =(String)(Object) Base64.encode(digester.digest(shardKey.getBytes("UTF8")));
                        if (password.equals(encPwd)) {
//                            MyHelperClass SUCCESS = new MyHelperClass();
//                            MyHelperClass SUCCESS = new MyHelperClass();
//                            MyHelperClass SUCCESS = new MyHelperClass();
//                            MyHelperClass SUCCESS = new MyHelperClass();
//                            MyHelperClass SUCCESS = new MyHelperClass();
//                            MyHelperClass SUCCESS = new MyHelperClass();
//                            MyHelperClass SUCCESS = new MyHelperClass();
//                            MyHelperClass SUCCESS = new MyHelperClass();
//                            MyHelperClass SUCCESS = new MyHelperClass();
                            MyHelperClass SUCCESS = new MyHelperClass();
                            authResult = Authenticator.SUCCESS;
                        } else {
//                            MyHelperClass FAILURE = new MyHelperClass();
//                            MyHelperClass FAILURE = new MyHelperClass();
//                            MyHelperClass FAILURE = new MyHelperClass();
//                            MyHelperClass FAILURE = new MyHelperClass();
//                            MyHelperClass FAILURE = new MyHelperClass();
//                            MyHelperClass FAILURE = new MyHelperClass();
//                            MyHelperClass FAILURE = new MyHelperClass();
//                            MyHelperClass FAILURE = new MyHelperClass();
//                            MyHelperClass FAILURE = new MyHelperClass();
                            MyHelperClass FAILURE = new MyHelperClass();
                            authResult = Authenticator.FAILURE;
                        }
                    } catch (NoSuchAlgorithmException nsae) {
                        throw new SystemException((String)(Object)nsae);
                    } catch (UnsupportedEncodingException uee) {
                        throw new SystemException((String)(Object)uee);
                    }
                } else {
//                    MyHelperClass FAILURE = new MyHelperClass();
//                    MyHelperClass FAILURE = new MyHelperClass();
//                    MyHelperClass FAILURE = new MyHelperClass();
//                    MyHelperClass FAILURE = new MyHelperClass();
//                    MyHelperClass FAILURE = new MyHelperClass();
//                    MyHelperClass FAILURE = new MyHelperClass();
//                    MyHelperClass FAILURE = new MyHelperClass();
//                    MyHelperClass FAILURE = new MyHelperClass();
//                    MyHelperClass FAILURE = new MyHelperClass();
                    MyHelperClass FAILURE = new MyHelperClass();
                    authResult = Authenticator.FAILURE;
                }
            }
        }
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
//        MyHelperClass SUCCESS = new MyHelperClass();
        MyHelperClass SUCCESS = new MyHelperClass();
        if (authResult == Authenticator.SUCCESS) {
//            MyHelperClass PropsUtil = new MyHelperClass();
            String[] authPipelinePost =(String[])(Object) PropsUtil.getArray(PropsUtil.AUTH_PIPELINE_POST);
//            MyHelperClass CompanyImpl = new MyHelperClass();
            if (authType.equals(CompanyImpl.AUTH_TYPE_EA)) {
                MyHelperClass AuthPipeline = new MyHelperClass();
                authResult =(int)(Object) AuthPipeline.authenticateByEmailAddress(authPipelinePost, companyId, login, password, headerMap, parameterMap);
//            MyHelperClass CompanyImpl = new MyHelperClass();
            } else if (authType.equals(CompanyImpl.AUTH_TYPE_SN)) {
                MyHelperClass AuthPipeline = new MyHelperClass();
                authResult =(int)(Object) AuthPipeline.authenticateByScreenName(authPipelinePost, companyId, login, password, headerMap, parameterMap);
//            MyHelperClass CompanyImpl = new MyHelperClass();
            } else if (authType.equals(CompanyImpl.AUTH_TYPE_ID)) {
                MyHelperClass AuthPipeline = new MyHelperClass();
                authResult =(int)(Object) AuthPipeline.authenticateByUserId(authPipelinePost, companyId, userId, password, headerMap, parameterMap);
            }
        }
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
//        MyHelperClass FAILURE = new MyHelperClass();
        MyHelperClass FAILURE = new MyHelperClass();
        if (authResult == Authenticator.FAILURE) {
            try {
//                MyHelperClass PropsUtil = new MyHelperClass();
                String[] authFailure =(String[])(Object) PropsUtil.getArray(PropsUtil.AUTH_FAILURE);
//                MyHelperClass CompanyImpl = new MyHelperClass();
                if (authType.equals(CompanyImpl.AUTH_TYPE_EA)) {
                    MyHelperClass AuthPipeline = new MyHelperClass();
                    AuthPipeline.onFailureByEmailAddress(authFailure, companyId, login, headerMap, parameterMap);
//                MyHelperClass CompanyImpl = new MyHelperClass();
                } else if (authType.equals(CompanyImpl.AUTH_TYPE_SN)) {
                    MyHelperClass AuthPipeline = new MyHelperClass();
                    AuthPipeline.onFailureByScreenName(authFailure, companyId, login, headerMap, parameterMap);
//                MyHelperClass CompanyImpl = new MyHelperClass();
                } else if (authType.equals(CompanyImpl.AUTH_TYPE_ID)) {
                    MyHelperClass AuthPipeline = new MyHelperClass();
                    AuthPipeline.onFailureByUserId(authFailure, companyId, userId, headerMap, parameterMap);
                }
                MyHelperClass PortalLDAPUtil = new MyHelperClass();
                if (!(Boolean)(Object)PortalLDAPUtil.isPasswordPolicyEnabled(user.getCompanyId())) {
                    PasswordPolicy passwordPolicy =(PasswordPolicy)(Object) user.getPasswordPolicy();
                    int failedLoginAttempts =(int)(Object) user.getFailedLoginAttempts();
                    int maxFailures =(int)(Object) passwordPolicy.getMaxFailure();
                    if ((failedLoginAttempts >= maxFailures) && (maxFailures != 0)) {
//                        MyHelperClass PropsUtil = new MyHelperClass();
                        String[] authMaxFailures =(String[])(Object) PropsUtil.getArray(PropsUtil.AUTH_MAX_FAILURES);
//                        MyHelperClass CompanyImpl = new MyHelperClass();
                        if (authType.equals(CompanyImpl.AUTH_TYPE_EA)) {
                            MyHelperClass AuthPipeline = new MyHelperClass();
                            AuthPipeline.onMaxFailuresByEmailAddress(authMaxFailures, companyId, login, headerMap, parameterMap);
//                        MyHelperClass CompanyImpl = new MyHelperClass();
                        } else if (authType.equals(CompanyImpl.AUTH_TYPE_SN)) {
                            MyHelperClass AuthPipeline = new MyHelperClass();
                            AuthPipeline.onMaxFailuresByScreenName(authMaxFailures, companyId, login, headerMap, parameterMap);
//                        MyHelperClass CompanyImpl = new MyHelperClass();
                        } else if (authType.equals(CompanyImpl.AUTH_TYPE_ID)) {
                            MyHelperClass AuthPipeline = new MyHelperClass();
                            AuthPipeline.onMaxFailuresByUserId(authMaxFailures, companyId, userId, headerMap, parameterMap);
                        }
                    }
                }
            } catch (Exception e) {
                MyHelperClass _log = new MyHelperClass();
                _log.error(e, e);
            }
        }
        return authResult;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass AUTH_FAILURE;
	public MyHelperClass AUTH_PIPELINE_PRE;
	public MyHelperClass AUTH_TYPE_SN;
	public MyHelperClass PASSWORD_INVALID;
	public MyHelperClass AUTH_MAX_FAILURES;
	public MyHelperClass AUTH_TYPE_ID;
	public MyHelperClass AUTH_MAC_SHARED_KEY;
	public MyHelperClass AUTH_MAC_ALLOW;
	public MyHelperClass AUTH_TYPE_EA;
	public MyHelperClass AUTH_PIPELINE_ENABLE_LIFERAY_CHECK;
	public MyHelperClass AUTH_MAC_ALGORITHM;
	public MyHelperClass AUTH_PIPELINE_POST;
public MyHelperClass getLong(String o0){ return null; }
	public MyHelperClass authenticateByUserId(String[] o0, long o1, long o2, String o3, Map o4, Map o5){ return null; }
	public MyHelperClass isNull(String o0){ return null; }
	public MyHelperClass onMaxFailuresByUserId(String[] o0, long o1, long o2, Map o3, Map o4){ return null; }
	public MyHelperClass onFailureByUserId(String[] o0, long o1, long o2, Map o3, Map o4){ return null; }
	public MyHelperClass getArray(MyHelperClass o0){ return null; }
	public MyHelperClass isEmailAddress(String o0){ return null; }
	public MyHelperClass authenticateByScreenName(String[] o0, long o1, String o2, String o3, Map o4, Map o5){ return null; }
	public MyHelperClass onFailureByEmailAddress(String[] o0, long o1, String o2, Map o3, Map o4){ return null; }
	public MyHelperClass getBoolean(MyHelperClass o0){ return null; }
	public MyHelperClass isPasswordPolicyEnabled(MyHelperClass o0){ return null; }
	public MyHelperClass encrypt(MyHelperClass o0){ return null; }
	public MyHelperClass onFailureByScreenName(String[] o0, long o1, String o2, Map o3, Map o4){ return null; }
	public MyHelperClass findByC_EA(long o0, String o1){ return null; }
	public MyHelperClass authenticateByEmailAddress(String[] o0, long o1, String o2, String o3, Map o4, Map o5){ return null; }
	public MyHelperClass error(Exception o0, Exception o1){ return null; }
	public MyHelperClass findByC_U(long o0, MyHelperClass o1){ return null; }
	public MyHelperClass onMaxFailuresByEmailAddress(String[] o0, long o1, String o2, Map o3, Map o4){ return null; }
	public MyHelperClass encrypt(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass onMaxFailuresByScreenName(String[] o0, long o1, String o2, Map o3, Map o4){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass update(User o0){ return null; }
	public MyHelperClass findByC_SN(long o0, String o1){ return null; }}

class PortalException extends Exception{
	public PortalException(String errorMessage) { super(errorMessage); }
}

class SystemException extends Exception{
	public SystemException(String errorMessage) { super(errorMessage); }
}

class UserEmailAddressException extends Exception{
	public UserEmailAddressException(String errorMessage) { super(errorMessage); }
	UserEmailAddressException(){}
}

class UserScreenNameException extends Exception{
	public UserScreenNameException(String errorMessage) { super(errorMessage); }
	UserScreenNameException(){}
}

class UserIdException extends Exception{
	public UserIdException(String errorMessage) { super(errorMessage); }
	UserIdException(){}
}

class UserPasswordException extends Exception{
	public UserPasswordException(String errorMessage) { super(errorMessage); }
}

class User {

public MyHelperClass getFailedLoginAttempts(){ return null; }
	public MyHelperClass isDefaultUser(){ return null; }
	public MyHelperClass getPasswordPolicy(){ return null; }
	public MyHelperClass setPasswordEncrypted(boolean o0){ return null; }
	public MyHelperClass setPassword(MyHelperClass o0){ return null; }
	public MyHelperClass getCompanyId(){ return null; }
	public MyHelperClass isPasswordEncrypted(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class NoSuchUserException extends Exception{
	public NoSuchUserException(String errorMessage) { super(errorMessage); }
}

class Base64 {

public static MyHelperClass encode(byte[] o0){ return null; }}

class PasswordPolicy {

public MyHelperClass getMaxFailure(){ return null; }}
