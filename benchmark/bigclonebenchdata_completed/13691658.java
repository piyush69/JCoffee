import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13691658 {
public MyHelperClass filter;
public MyHelperClass IOUtils;
	public MyHelperClass mockRequest;
	public MyHelperClass mockConfig;
	public MyHelperClass ArrayUtils;
	public MyHelperClass Assert;

//    @Test
    public void testOther() throws Exception {
        filter.init(this.mockConfig);
        ByteArrayOutputStream jpg = new ByteArrayOutputStream();
        IOUtils.copy(this.getClass().getResourceAsStream("Buffalo-Theory.jpg"), jpg);
        MockFilterChain mockChain = new MockFilterChain();
        mockChain.setContentType("image/jpg");
        mockChain.setOutputData(jpg.toByteArray());
        MockResponse mockResponse = new MockResponse();
        filter.doFilter(this.mockRequest, mockResponse, mockChain);
        Assert.assertTrue("Time stamp content type", "image/jpg".equals(mockResponse.getContentType()));
        Assert.assertTrue("OutputStream as original",(boolean)(Object) ArrayUtils.isEquals(jpg.toByteArray(), mockResponse.getMockServletOutputStream().getBytes()));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass init(MyHelperClass o0){ return null; }
	public MyHelperClass isEquals(byte[] o0, MyHelperClass o1){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass doFilter(MyHelperClass o0, MockResponse o1, MockFilterChain o2){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass assertTrue(String o0, boolean o1){ return null; }}

class Test {

}

class MockFilterChain {

public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setOutputData(byte[] o0){ return null; }}

class MockResponse {

public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getMockServletOutputStream(){ return null; }}
