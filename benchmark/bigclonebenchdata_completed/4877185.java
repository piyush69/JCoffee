


class c4877185 {
public MyHelperClass generateOCSPRequest(X509Certificate o0, MyHelperClass o1){ return null; }
public MyHelperClass LOGGER;

    public byte[] getEncoded(X509Certificate checkCert, X509Certificate rootCert, String url) {
        try {
            if (checkCert == null || rootCert == null) return null;
            if (url == null) {
                MyHelperClass PdfPKCS7 = new MyHelperClass();
                url =(String)(Object) PdfPKCS7.getOCSPURL(checkCert);
            }
            if (url == null) return null;
            OCSPReq request =(OCSPReq)(Object) generateOCSPRequest(rootCert, checkCert.getSerialNumber());
            byte[] array =(byte[])(Object) request.getEncoded();
            URL urlt = new URL(url);
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) urlt.openConnection();
            con.setRequestProperty("Content-Type", "application/ocsp-request");
            con.setRequestProperty("Accept", "application/ocsp-response");
            con.setDoOutput(true);
            OutputStream out =(OutputStream)(Object) con.getOutputStream();
            DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream(out));
            dataOut.write(array);
            dataOut.flush();
            dataOut.close();
            if ((int)(Object)con.getResponseCode() / 100 != 2) {
                MyHelperClass MessageLocalization = new MyHelperClass();
                throw new IOException((String)(Object)MessageLocalization.getComposedMessage("invalid.http.response.1", con.getResponseCode()));
            }
            InputStream in = (InputStream)(InputStream)(Object) con.getContent();
            MyHelperClass RandomAccessFileOrArray = new MyHelperClass();
            OCSPResp ocspResponse = new OCSPResp(RandomAccessFileOrArray.InputStreamToArray(in));
            MyHelperClass MessageLocalization = new MyHelperClass();
            if ((int)(Object)ocspResponse.getStatus() != 0) throw new IOException((String)(Object)MessageLocalization.getComposedMessage("invalid.status.1", ocspResponse.getStatus()));
            BasicOCSPResp basicResponse = (BasicOCSPResp)(BasicOCSPResp)(Object) ocspResponse.getResponseObject();
            if (basicResponse != null) {
                SingleResp[] responses =(SingleResp[])(Object) basicResponse.getResponses();
                if (responses.length == 1) {
                    SingleResp resp = responses[0];
                    Object status = resp.getCertStatus();
                    MyHelperClass CertificateStatus = new MyHelperClass();
                    if (status == CertificateStatus.GOOD) {
                        return(byte[])(Object) basicResponse.getEncoded();
                    } else if (status instanceof RevokedStatus) {
//                        MyHelperClass MessageLocalization = new MyHelperClass();
                        throw new IOException((String)(Object)MessageLocalization.getComposedMessage("ocsp.status.is.revoked"));
                    } else {
//                        MyHelperClass MessageLocalization = new MyHelperClass();
                        throw new IOException((String)(Object)MessageLocalization.getComposedMessage("ocsp.status.is.unknown"));
                    }
                }
            }
        } catch (Exception ex) {
            MyHelperClass Level = new MyHelperClass();
            if ((boolean)(Object)LOGGER.isLogging(Level.ERROR)) LOGGER.error("OcspClientBouncyCastle", ex);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GOOD;
	public MyHelperClass ERROR;
public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getOCSPURL(X509Certificate o0){ return null; }
	public MyHelperClass isLogging(MyHelperClass o0){ return null; }
	public MyHelperClass getComposedMessage(String o0){ return null; }
	public MyHelperClass InputStreamToArray(InputStream o0){ return null; }
	public MyHelperClass getComposedMessage(String o0, MyHelperClass o1){ return null; }}

class X509Certificate {

public MyHelperClass getSerialNumber(){ return null; }}

class OCSPReq {

public MyHelperClass getEncoded(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class OutputStream {

}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(BufferedOutputStream o0){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(OutputStream o0){}
	BufferedOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class OCSPResp {

OCSPResp(MyHelperClass o0){}
	OCSPResp(){}
	public MyHelperClass getResponseObject(){ return null; }
	public MyHelperClass getStatus(){ return null; }}

class BasicOCSPResp {

public MyHelperClass getResponses(){ return null; }
	public MyHelperClass getEncoded(){ return null; }}

class SingleResp {

public MyHelperClass getCertStatus(){ return null; }}

class RevokedStatus {

}
