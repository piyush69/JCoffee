import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12194196 {
public MyHelperClass AppletServiceServlet;
public MyHelperClass LOG;
	public MyHelperClass SignatureTestService;
	public MyHelperClass testedInstance;
	public MyHelperClass AuditTestService;
	public MyHelperClass EasyMock;
	public MyHelperClass fail(){ return null; }

//    @Test
    public void testHandleMessageInvalidSignature() throws Throwable, Exception {
        MyHelperClass MiscTestUtils = new MyHelperClass();
        KeyPair keyPair = MiscTestUtils.generateKeyPair();
        DateTime notBefore = new DateTime();
        DateTime notAfter = notBefore.plusYears(1);
//        MyHelperClass MiscTestUtils = new MyHelperClass();
        X509Certificate certificate = MiscTestUtils.generateCertificate(keyPair.getPublic(), "CN=Test", notBefore, notAfter, null, keyPair.getPrivate(), true, 0, null, null);
        MyHelperClass EasyMock = new MyHelperClass();
        ServletConfig mockServletConfig = EasyMock.createMock(ServletConfig.class);
        Map<String, String> httpHeaders = new HashMap<String, String>();
//        MyHelperClass EasyMock = new MyHelperClass();
        HttpSession mockHttpSession = EasyMock.createMock(HttpSession.class);
//        MyHelperClass EasyMock = new MyHelperClass();
        HttpServletRequest mockServletRequest = EasyMock.createMock(HttpServletRequest.class);
//        MyHelperClass EasyMock = new MyHelperClass();
        EasyMock.expect(mockServletConfig.getInitParameter("AuditService")).andStubReturn(null);
//        MyHelperClass EasyMock = new MyHelperClass();
        EasyMock.expect(mockServletConfig.getInitParameter("AuditServiceClass")).andStubReturn(AuditTestService.class.getName());
//        MyHelperClass EasyMock = new MyHelperClass();
        EasyMock.expect(mockServletConfig.getInitParameter("SignatureService")).andStubReturn(null);
//        MyHelperClass EasyMock = new MyHelperClass();
        EasyMock.expect(mockServletConfig.getInitParameter("SignatureServiceClass")).andStubReturn(SignatureTestService.class.getName());
//        MyHelperClass EasyMock = new MyHelperClass();
        EasyMock.expect(mockServletRequest.getRemoteAddr()).andStubReturn("remote-address");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        byte[] document = "hello world".getBytes();
        byte[] digestValue = messageDigest.digest(document);
        MyHelperClass SignatureDataMessageHandler = new MyHelperClass();
        EasyMock.expect(mockHttpSession.getAttribute(SignatureDataMessageHandler.DIGEST_VALUE_SESSION_ATTRIBUTE)).andStubReturn(digestValue);
//        MyHelperClass SignatureDataMessageHandler = new MyHelperClass();
        EasyMock.expect(mockHttpSession.getAttribute(SignatureDataMessageHandler.DIGEST_ALGO_SESSION_ATTRIBUTE)).andStubReturn("SHA-1");
        SignatureDataMessage message = new SignatureDataMessage();
        message.certificateChain = new LinkedList<X509Certificate>();
        message.certificateChain.add(certificate);
        Signature signature = Signature.getInstance("SHA1withRSA");
        signature.initSign(keyPair.getPrivate());
        signature.update("foobar-document".getBytes());
        byte[] signatureValue = signature.sign();
        message.signatureValue = signatureValue;
//        MyHelperClass EasyMock = new MyHelperClass();
        EasyMock.replay(mockServletConfig, mockHttpSession, mockServletRequest);
        AppletServiceServlet.injectInitParams(mockServletConfig, this.testedInstance);
        this.testedInstance.init(mockServletConfig);
        try {
            this.testedInstance.handleMessage(message, httpHeaders, mockServletRequest, mockHttpSession);
            fail();
        } catch (ServletException e) {
            LOG.debug("expected exception: " + e.getMessage());
            EasyMock.verify(mockServletConfig, mockHttpSession, mockServletRequest);
            assertNull(SignatureTestService.getSignatureValue());
            assertEquals("remote-address", AuditTestService.getAuditSignatureRemoteAddress());
            assertEquals(certificate, AuditTestService.getAuditSignatureClientCertificate());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DIGEST_ALGO_SESSION_ATTRIBUTE;
	public MyHelperClass DIGEST_VALUE_SESSION_ATTRIBUTE;
public MyHelperClass getAuditSignatureClientCertificate(){ return null; }
	public MyHelperClass createMock(Class<HttpSession o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getAuditSignatureRemoteAddress(){ return null; }
	public MyHelperClass verify(ServletConfig o0, HttpSession o1, HttpServletRequest o2){ return null; }
	public MyHelperClass handleMessage(SignatureDataMessage o0, Map<String o1, String o2, HttpServletRequest o3, HttpSession o4){ return null; }
	public MyHelperClass generateKeyPair(){ return null; }
	public MyHelperClass createMock(Class<HttpServletRequest o0){ return null; }
	public MyHelperClass generateCertificate(PublicKey o0, String o1, DateTime o2, DateTime o3, Object o4, PrivateKey o5, boolean o6, int o7, Object o8, Object o9){ return null; }
	public MyHelperClass replay(ServletConfig o0, HttpSession o1, HttpServletRequest o2){ return null; }
	public MyHelperClass getSignatureValue(){ return null; }
	public MyHelperClass init(ServletConfig o0){ return null; }
	public MyHelperClass createMock(Class<ServletConfig o0){ return null; }}

class Test {

}

class DateTime {

public MyHelperClass plusYears(int o0){ return null; }}

class X509Certificate {

}

class ServletConfig {

public MyHelperClass getInitParameter(String o0){ return null; }}

class HttpSession {

}

class HttpServletRequest {

public MyHelperClass getRemoteAddr(){ return null; }}

class AuditTestService {

}

class SignatureTestService {

}

class SignatureDataMessage {
public MyHelperClass certificateChain;
	public MyHelperClass signatureValue;
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}
