import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14511387 {
public MyHelperClass LdapConfig;
	public MyHelperClass LdapUtil;
public MyHelperClass passwordScheme;
	public MyHelperClass config;

    public void authenticate(final ConnectionHandler ch, final AuthenticationCriteria ac) throws Throwable, NamingException {
        MyHelperClass DIGEST_SIZE = new MyHelperClass();
        byte[] hash = new byte[(int)(Object)DIGEST_SIZE];
        try {
            final MessageDigest md = MessageDigest.getInstance((String)(Object)this.passwordScheme);
            md.update(((String)(String)(Object) ac.getCredential()).getBytes());
            hash = md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new NamingException(e.getMessage());
        }
        ch.connect(this.config.getBindDn(), this.config.getBindCredential());
        NamingEnumeration en = null;
        try {
            en =(NamingEnumeration)(Object) ch.getLdapContext().search(ac.getDn(), "userPassword={0}", new Object[] { String.format("{%s}%s", this.passwordScheme, LdapUtil.base64Encode(hash)).getBytes() }, LdapConfig.getCompareSearchControls());
            if (!(Boolean)(Object)en.hasMore()) {
                throw new AuthenticationException("Compare authentication failed.");
            }
        } finally {
            if (en != null) {
                en.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCompareSearchControls(){ return null; }
	public MyHelperClass getBindDn(){ return null; }
	public MyHelperClass getBindCredential(){ return null; }
	public MyHelperClass search(MyHelperClass o0, String o1, Object[] o2, MyHelperClass o3){ return null; }
	public MyHelperClass base64Encode(byte[] o0){ return null; }}

class ConnectionHandler {

public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getLdapContext(){ return null; }}

class AuthenticationCriteria {

public MyHelperClass getDn(){ return null; }
	public MyHelperClass getCredential(){ return null; }}

class NamingException extends Exception{
	public NamingException(String errorMessage) { super(errorMessage); }
}

class NamingEnumeration {

public MyHelperClass close(){ return null; }
	public MyHelperClass hasMore(){ return null; }}

class SearchResult {

}

class AuthenticationException extends Exception{
	public AuthenticationException(String errorMessage) { super(errorMessage); }
}
