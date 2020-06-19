import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4796776 {
public MyHelperClass mLogger;
	public MyHelperClass HttpVerb;
	public MyHelperClass Level;
	public MyHelperClass TYPE;
	public MyHelperClass killHostVerifier(){ return null; }

    public HttpURLConnection execute(S3Bucket pBucket, S3Object pObject, S3OperationParameters pOpParams) throws Throwable, S3Exception {
        S3OperationParameters opParams = pOpParams;
        if (opParams == null) opParams = new S3OperationParameters();
        HttpURLConnection result = null;
        URL url = getURL(pBucket, pObject, opParams.getQueryParameters());
        MyHelperClass Level = new MyHelperClass();
        mLogger.log(Level.FINEST, "URL: " + url.toString());
        opParams.addDateHeader();
        MyHelperClass mStyle = new MyHelperClass();
        switch(mStyle) {
            MyHelperClass Path = new MyHelperClass();
            case Path:
                MyHelperClass BASE_DOMAIN = new MyHelperClass();
                opParams.addHostHeader(BASE_DOMAIN);
                break;
            MyHelperClass Subdomain = new MyHelperClass();
            case Subdomain:
                MyHelperClass BASE_DOMAIN = new MyHelperClass();
                if (pBucket == null) opParams.addHostHeader(BASE_DOMAIN); else opParams.addHostHeader(pBucket.getName() + "." + BASE_DOMAIN);
                break;
            MyHelperClass VirtualHost = new MyHelperClass();
            case VirtualHost:
                MyHelperClass BASE_DOMAIN = new MyHelperClass();
                if (pBucket == null) opParams.addHostHeader(BASE_DOMAIN); else opParams.addHostHeader(pBucket.getName());
                break;
        }
        if (opParams.isSign()) {
            StringBuilder sb = new StringBuilder();
            sb.append(opParams.getVerb().toString());
            MyHelperClass NEWLINE = new MyHelperClass();
            sb.append(NEWLINE);
            MyHelperClass MD5 = new MyHelperClass();
            sb.append(posHeader(MD5, opParams.getRequestHeaders()));
            MyHelperClass TYPE = new MyHelperClass();
            sb.append(posHeader(TYPE, opParams.getRequestHeaders()));
            MyHelperClass EXPIRES = new MyHelperClass();
            if (opParams.getQueryParameters().has(EXPIRES)) {
                MyHelperClass EXPIRES = new MyHelperClass();
                sb.append(opParams.getQueryParameters().get(EXPIRES).getValue());
                MyHelperClass NEWLINE = new MyHelperClass();
                sb.append(NEWLINE);
            } else {
                MyHelperClass DATE = new MyHelperClass();
                sb.append(posHeader(DATE, opParams.getRequestHeaders()));
            }
            sb.append(canonicalizeAmazonHeaders(opParams.getRequestHeaders()));
            try {
                sb.append("/");
                if (pBucket != null) {
                    MyHelperClass URL_ENCODING = new MyHelperClass();
                    sb.append(URLEncoder.encode(pBucket.getName(), URL_ENCODING));
                    sb.append("/");
                    if (pObject != null) {
                        MyHelperClass URL_ENCODING = new MyHelperClass();
                        sb.append(URLEncoder.encode(pObject.getKey(), URL_ENCODING));
                    }
                }
                sb.append(opParams.getQueryParameters().getAmazonSubresources().toQueryString());
                String signThis = sb.toString();
                MyHelperClass Level = new MyHelperClass();
                mLogger.log(Level.FINEST, "String being signed: " + signThis);
                MyHelperClass mCredential = new MyHelperClass();
                String sig = encode(mCredential.getMSecretAccessKey(), signThis, false);
                sb = new StringBuilder();
                sb.append("AWS ");
                MyHelperClass mCredential = new MyHelperClass();
                sb.append(mCredential.getMAccessKeyID());
                sb.append(":");
                sb.append(sig);
                opParams.addAuthorizationHeader(sb.toString());
            } catch (UnsupportedEncodingException e) {
                MyHelperClass URL_ENCODING = new MyHelperClass();
                throw new S3Exception("URL encoding not supported: " + URL_ENCODING, e);
            }
        }
        try {
            killHostVerifier();
            URLConnection urlConn = url.openConnection();
            if (!(urlConn instanceof HttpURLConnection)) throw new S3Exception("URLConnection is not instance of HttpURLConnection!");
            result = (HttpURLConnection) urlConn;
            result.setRequestMethod(opParams.getVerb().toString());
            mLogger.log(Level.FINEST, "HTTP Operation: " + opParams.getVerb().toString());
            if (opParams.getVerb() == HttpVerb.PUT) {
                result.setDoOutput(true);
            }
            result.setRequestProperty(TYPE, "");
            for (AWSParameter param : opParams.getRequestHeaders()) {
                result.setRequestProperty(param.getName(), param.getValue());
                mLogger.log(Level.FINEST, "Header " + param.getName() + ": " + param.getValue());
            }
        } catch (IOException e) {
            throw new S3Exception("Problem opening connection to URL: " + url.toString(), e);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class S3Bucket {

}

class S3Object {

}

class S3OperationParameters {

}

class S3Exception extends Exception{
	public S3Exception(String errorMessage) { super(errorMessage); }
}

class AWSParameter {

}
