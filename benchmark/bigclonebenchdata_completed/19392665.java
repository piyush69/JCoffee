
import java.io.UncheckedIOException;


class c19392665 {
public MyHelperClass LdapUtil;
public MyHelperClass getAuthenticationControls(){ return null; }

//    @Override
    protected AuthenticationHandlerResponse authenticateInternal(final Connection c, final AuthenticationCriteria criteria) throws LdapException {
        MyHelperClass DIGEST_SIZE = new MyHelperClass();
        byte[] hash = new byte[(int)(Object)DIGEST_SIZE];
        try {
            MyHelperClass passwordScheme = new MyHelperClass();
            final MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(passwordScheme);
            md.update(criteria.getCredential().getBytes());
            hash =(byte[])(Object) md.digest();
        } catch (UncheckedIOException e) {
            throw new LdapException((String)(Object)e);
        }
        MyHelperClass passwordScheme = new MyHelperClass();
        final LdapAttribute la = new LdapAttribute("userPassword", String.format("{%s}%s", passwordScheme, LdapUtil.base64Encode(hash)).getBytes());
        final CompareOperation compare = new CompareOperation(c);
        final CompareRequest request = new CompareRequest(criteria.getDn(), la);
        request.setControls(getAuthenticationControls());
        final Response compareResponse =(Response)(Object) compare.execute(request);
        return new AuthenticationHandlerResponse(compareResponse.getResult(), compareResponse.getResultCode(), c, null, compareResponse.getControls());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass base64Encode(byte[] o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class Connection {

}

class AuthenticationCriteria {

public MyHelperClass getCredential(){ return null; }
	public MyHelperClass getDn(){ return null; }}

class AuthenticationHandlerResponse {

AuthenticationHandlerResponse(MyHelperClass o0, MyHelperClass o1, Connection o2, Object o3, MyHelperClass o4){}
	AuthenticationHandlerResponse(){}}

class LdapException extends Exception{
	public LdapException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class LdapAttribute {

LdapAttribute(String o0, byte[] o1){}
	LdapAttribute(){}}

class CompareOperation {

CompareOperation(){}
	CompareOperation(Connection o0){}
	public MyHelperClass execute(CompareRequest o0){ return null; }}

class CompareRequest {

CompareRequest(){}
	CompareRequest(MyHelperClass o0, LdapAttribute o1){}
	public MyHelperClass setControls(MyHelperClass o0){ return null; }}

class Response {

public MyHelperClass getResultCode(){ return null; }
	public MyHelperClass getResult(){ return null; }
	public MyHelperClass getControls(){ return null; }}
