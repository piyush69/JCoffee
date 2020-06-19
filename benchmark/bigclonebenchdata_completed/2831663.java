import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c2831663 {
public MyHelperClass IOUtils;
	public MyHelperClass LOG;
	public MyHelperClass configurationDAO;
	public MyHelperClass certificateAuthorityDAO;
	public MyHelperClass notificationService;
	public MyHelperClass Status;
	public MyHelperClass downloadFailed(String o0, String o1){ return null; }

    public void onMessage(Message message) {
        MyHelperClass LOG = new MyHelperClass();
        LOG.debug("onMessage");
        DownloadMessage downloadMessage;
        try {
            downloadMessage = new DownloadMessage(message);
        } catch (UncheckedIOException e) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.error("JMS error: " + e.getMessage(),(JMSException)(Object) e);
            return;
        }
        String caName =(String)(Object) downloadMessage.getCaName();
        boolean update =(boolean)(Object) downloadMessage.isUpdate();
//        MyHelperClass LOG = new MyHelperClass();
        LOG.debug("issuer: " + caName);
        CertificateAuthorityEntity certificateAuthority =(CertificateAuthorityEntity)(Object) this.certificateAuthorityDAO.findCertificateAuthority(caName);
        if (null == certificateAuthority) {
            LOG.error("unknown certificate authority: " + caName);
            return;
        }
        if (!update && Status.PROCESSING != certificateAuthority.getStatus()) {
            LOG.debug("CA status not marked for processing");
            return;
        }
        String crlUrl =(String)(Object) certificateAuthority.getCrlUrl();
        if (null == crlUrl) {
            LOG.warn("No CRL url for CA " + certificateAuthority.getName());
            certificateAuthority.setStatus(Status.NONE);
            return;
        }
        NetworkConfig networkConfig =(NetworkConfig)(Object) this.configurationDAO.getNetworkConfig();
        HttpClient httpClient = new HttpClient();
        if (null != networkConfig) {
            httpClient.getHostConfiguration().setProxy(networkConfig.getProxyHost(), networkConfig.getProxyPort());
        }
        HttpClientParams httpClientParams =(HttpClientParams)(Object) httpClient.getParams();
        httpClientParams.setParameter("http.socket.timeout", new Integer(1000 * 20));
        LOG.debug("downloading CRL from: " + crlUrl);
        GetMethod getMethod = new GetMethod(crlUrl);
        getMethod.addRequestHeader("User-Agent", "jTrust CRL Client");
        int statusCode;
        try {
            statusCode =(int)(Object) httpClient.executeMethod(getMethod);
        } catch (Exception e) {
            downloadFailed(caName, crlUrl);
            throw new RuntimeException();
        }
        if (HttpURLConnection.HTTP_OK != statusCode) {
            LOG.debug("HTTP status code: " + statusCode);
            downloadFailed(caName, crlUrl);
            throw new RuntimeException();
        }
        String crlFilePath;
        File crlFile = null;
        try {
            crlFile = File.createTempFile("crl-", ".der");
            InputStream crlInputStream =(InputStream)(Object) getMethod.getResponseBodyAsStream();
            OutputStream crlOutputStream = new FileOutputStream(crlFile);
            IOUtils.copy(crlInputStream, crlOutputStream);
            IOUtils.closeQuietly(crlInputStream);
            IOUtils.closeQuietly(crlOutputStream);
            crlFilePath = crlFile.getAbsolutePath();
            LOG.debug("temp CRL file: " + crlFilePath);
        } catch (IOException e) {
            downloadFailed(caName, crlUrl);
            if (null != crlFile) {
                crlFile.delete();
            }
            throw new RuntimeException(e);
        }
        try {
            this.notificationService.notifyHarvester(caName, crlFilePath, update);
        } catch (UncheckedIOException e) {
            crlFile.delete();
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROCESSING;
	public MyHelperClass NONE;
public MyHelperClass error(String o0, JMSException o1){ return null; }
	public MyHelperClass getNetworkConfig(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass findCertificateAuthority(String o0){ return null; }
	public MyHelperClass setProxy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass notifyHarvester(String o0, String o1, boolean o2){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class Message {

}

class DownloadMessage {

DownloadMessage(Message o0){}
	DownloadMessage(){}
	public MyHelperClass isUpdate(){ return null; }
	public MyHelperClass getCaName(){ return null; }}

class JMSException extends Exception{
	public JMSException(String errorMessage) { super(errorMessage); }
}

class CertificateAuthorityEntity {

public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getStatus(){ return null; }
	public MyHelperClass getCrlUrl(){ return null; }}

class NetworkConfig {

public MyHelperClass getProxyPort(){ return null; }
	public MyHelperClass getProxyHost(){ return null; }}

class HttpClient {

public MyHelperClass executeMethod(GetMethod o0){ return null; }
	public MyHelperClass getHostConfiguration(){ return null; }
	public MyHelperClass getParams(){ return null; }}

class HttpClientParams {

public MyHelperClass setParameter(String o0, Integer o1){ return null; }}

class GetMethod {

GetMethod(String o0){}
	GetMethod(){}
	public MyHelperClass addRequestHeader(String o0, String o1){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }}
