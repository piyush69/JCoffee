import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4254750 {
public MyHelperClass handleHttpConnectionException(SocketException o0, String o1){ return null; }
	public MyHelperClass handleHttpConnectionException(Exception o0, String o1){ return null; }
	public MyHelperClass handleHttpConnectionException(URISyntaxException o0, String o1){ return null; }
	public MyHelperClass handleHttpConnectionException(IllegalStateException o0, String o1){ return null; }
	public MyHelperClass handleHttpConnectionException(IllegalArgumentException o0, String o1){ return null; }

    protected static byte[] httpConnection(Context context, long token, String url, byte[] pdu, int method, boolean isProxySet, String proxyHost, int proxyPort) throws Throwable, IOException {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null.");
        }
        MyHelperClass LOCAL_LOGV = new MyHelperClass();
        if (LOCAL_LOGV) {
            MyHelperClass TAG = new MyHelperClass();
            Log.v(TAG, "httpConnection: params list");
            MyHelperClass TAG = new MyHelperClass();
            Log.v(TAG, "\ttoken\t\t= " + token);
            MyHelperClass TAG = new MyHelperClass();
            Log.v(TAG, "\turl\t\t= " + url);
            MyHelperClass TAG = new MyHelperClass();
            Log.v(TAG, "\tUser-Agent\t\t=" + mUserAgent);
            MyHelperClass TAG = new MyHelperClass();
            Log.v(TAG, "\tmethod\t\t= " + ((method == HTTP_POST_METHOD) ? "POST" : ((method == HTTP_GET_METHOD) ? "GET" : "UNKNOWN")));
            MyHelperClass TAG = new MyHelperClass();
            Log.v(TAG, "\tisProxySet\t= " + isProxySet);
            MyHelperClass TAG = new MyHelperClass();
            Log.v(TAG, "\tproxyHost\t= " + proxyHost);
            MyHelperClass TAG = new MyHelperClass();
            Log.v(TAG, "\tproxyPort\t= " + proxyPort);
        }
        AndroidHttpClient client = null;
        try {
            URI hostUrl = new URI(url);
            MyHelperClass HttpHost = new MyHelperClass();
            HttpHost target = new HttpHost(hostUrl.getHost(), hostUrl.getPort(), HttpHost.DEFAULT_SCHEME_NAME);
            client = createHttpClient(context);
            HttpRequest req = null;
            switch(method) {
                MyHelperClass HTTP_POST_METHOD = new MyHelperClass();
                case HTTP_POST_METHOD:
                    ProgressCallbackEntity entity = new ProgressCallbackEntity(context, token, pdu);
                    entity.setContentType("application/vnd.wap.mms-message");
                    HttpPost post = new HttpPost(url);
                    post.setEntity(entity);
                    req = post;
                    break;
                MyHelperClass HTTP_GET_METHOD = new MyHelperClass();
                case HTTP_GET_METHOD:
                    req = new HttpGet(url);
                    break;
                default:
                    MyHelperClass TAG = new MyHelperClass();
                    Log.e(TAG, "Unknown HTTP method: " + method + ". Must be one of POST[" + HTTP_POST_METHOD + "] or GET[" + HTTP_GET_METHOD + "].");
                    return null;
            }
            HttpParams params = client.getParams();
            if (isProxySet) {
                MyHelperClass ConnRouteParams = new MyHelperClass();
                ConnRouteParams.setDefaultProxy(params, new HttpHost(proxyHost, proxyPort));
            }
            req.setParams(params);
            MyHelperClass HDR_KEY_ACCEPT = new MyHelperClass();
            req.addHeader(HDR_KEY_ACCEPT, HDR_VALUE_ACCEPT);
            {
                MyHelperClass MmsConfig = new MyHelperClass();
                String xWapProfileTagName = MmsConfig.getUaProfTagName();
                MyHelperClass MmsConfig = new MyHelperClass();
                String xWapProfileUrl = MmsConfig.getUaProfUrl();
                if (xWapProfileUrl != null) {
                    MyHelperClass LogTag = new MyHelperClass();
                    if (Log.isLoggable(LogTag.TRANSACTION, Log.VERBOSE)) {
                        MyHelperClass LogTag = new MyHelperClass();
                        Log.d(LogTag.TRANSACTION, "[HttpUtils] httpConn: xWapProfUrl=" + xWapProfileUrl);
                    }
                    req.addHeader(xWapProfileTagName, xWapProfileUrl);
                }
            }
            MyHelperClass MmsConfig = new MyHelperClass();
            String extraHttpParams = MmsConfig.getHttpParams();
            if (extraHttpParams != null) {
                MyHelperClass Context = new MyHelperClass();
                String line1Number = ((TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE)).getLine1Number();
                MyHelperClass MmsConfig = new MyHelperClass();
                String line1Key = MmsConfig.getHttpParamsLine1Key();
                String paramList[] = extraHttpParams.split("\\|");
                for (String paramPair : paramList) {
                    String splitPair[] = paramPair.split(":", 2);
                    if (splitPair.length == 2) {
                        String name = splitPair[0].trim();
                        String value = splitPair[1].trim();
                        if (line1Key != null) {
                            value = value.replace(line1Key, line1Number);
                        }
                        MyHelperClass TextUtils = new MyHelperClass();
                        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(value)) {
                            req.addHeader(name, value);
                        }
                    }
                }
            }
            MyHelperClass HDR_KEY_ACCEPT_LANGUAGE = new MyHelperClass();
            req.addHeader(HDR_KEY_ACCEPT_LANGUAGE, HDR_VALUE_ACCEPT_LANGUAGE);
            HttpResponse response = client.execute(target, req);
            StatusLine status = response.getStatusLine();
            if (status.getStatusCode() != 200) {
                throw new IOException("HTTP error: " + status.getReasonPhrase());
            }
            HttpEntity entity = response.getEntity();
            byte[] body = null;
            if (entity != null) {
                try {
                    if (entity.getContentLength() > 0) {
                        body = new byte[(int) entity.getContentLength()];
                        DataInputStream dis = new DataInputStream(entity.getContent());
                        try {
                            dis.readFully(body);
                        } finally {
                            try {
                                dis.close();
                            } catch (IOException e) {
                                MyHelperClass TAG = new MyHelperClass();
                                Log.e(TAG, "Error closing input stream: " + e.getMessage());
                            }
                        }
                    }
                } finally {
                    if (entity != null) {
                        entity.consumeContent();
                    }
                }
            }
            return body;
        } catch (URISyntaxException e) {
            handleHttpConnectionException(e, url);
        } catch (IllegalStateException e) {
            handleHttpConnectionException(e, url);
        } catch (IllegalArgumentException e) {
            handleHttpConnectionException(e, url);
        } catch (SocketException e) {
            handleHttpConnectionException(e, url);
        } catch (Exception e) {
            handleHttpConnectionException(e, url);
        } finally {
            if (client != null) {
                client.close();
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Context {

}

class AndroidHttpClient {

}

class HttpHost {

}

class HttpRequest {

}

class ProgressCallbackEntity {

}

class HttpPost {

}

class HttpGet {

}

class HttpParams {

}

class TelephonyManager {

}

class HttpResponse {

}

class StatusLine {

}

class HttpEntity {

}
