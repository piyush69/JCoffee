import java.io.*;
import java.lang.*;
import java.util.*;



class c9951727 {

    public String addShare2(String appid, String appkey, String oauth_token, String oauth_token_secret, String openid, String format, Webpage webpage) throws Exception {
        String shareUrl = "http://openapi.qzone.qq.com/share/add_share";
        String oauth_signature = "";
        long oauth_timestamp = new Date().getTime() / 1000;
        String oauth_nonce = (Math.random() + "").replaceFirst("^0.", "");
        List<NameValuePair> shareParameters = new ArrayList<NameValuePair>();
        shareParameters.add((NameValuePair)(Object)new BasicNameValuePair("format", format));
        shareParameters.add((NameValuePair)(Object)new BasicNameValuePair("images",(String)(Object) webpage.images));
        shareParameters.add((NameValuePair)(Object)new BasicNameValuePair("oauth_consumer_key", appid));
        shareParameters.add((NameValuePair)(Object)new BasicNameValuePair("oauth_nonce", oauth_nonce));
        shareParameters.add((NameValuePair)(Object)new BasicNameValuePair("oauth_signature_method", "HMAC-SHA1"));
        shareParameters.add((NameValuePair)(Object)new BasicNameValuePair("oauth_timestamp", oauth_timestamp + ""));
        shareParameters.add((NameValuePair)(Object)new BasicNameValuePair("oauth_token", oauth_token));
        shareParameters.add((NameValuePair)(Object)new BasicNameValuePair("oauth_version", "1.0"));
        shareParameters.add((NameValuePair)(Object)new BasicNameValuePair("openid", openid));
        shareParameters.add((NameValuePair)(Object)new BasicNameValuePair("title",(String)(Object) webpage.title));
        shareParameters.add((NameValuePair)(Object)new BasicNameValuePair("url",(String)(Object) webpage.url));
        String stepA1 = "POST";
        MyHelperClass URLEncoder = new MyHelperClass();
        String stepA2 =(String)(Object) URLEncoder.encode(shareUrl, "UTF-8");
        String stepA3 = "";
        for (int i = 0; i < shareParameters.size(); i++) {
            NameValuePair item = shareParameters.get(i);
            stepA3 += item.getName() + "=" + item.getValue();
            if (i < shareParameters.size() - 1) {
                stepA3 += "&";
            }
        }
//        MyHelperClass URLEncoder = new MyHelperClass();
        stepA3 =(String)(Object) URLEncoder.encode(stepA3, "UTF-8");
        String stepA = stepA1 + "&" + stepA2 + "&" + stepA3;
        String stepB = appkey + "&" + oauth_token_secret;
        MyHelperClass Mac = new MyHelperClass();
        Mac mac =(Mac)(Object) Mac.getInstance("HmacSHA1");
        SecretKeySpec spec = new SecretKeySpec(stepB.getBytes("US-ASCII"), "HmacSHA1");
        mac.init(spec);
        byte[] oauthSignature =(byte[])(Object) mac.doFinal(stepA.getBytes("US-ASCII"));
        MyHelperClass Base64Encoder = new MyHelperClass();
        oauth_signature =(String)(Object) Base64Encoder.encode(oauthSignature);
        shareParameters.add((NameValuePair)(Object)new BasicNameValuePair("oauth_signature", oauth_signature));
        HttpPost sharePost = new HttpPost(shareUrl);
        sharePost.setHeader("Referer", "http://openapi.qzone.qq.com");
        sharePost.setHeader("Host", "openapi.qzone.qq.com");
        sharePost.setHeader("Accept-Language", "zh-cn");
        sharePost.setHeader("Content-Type", "application/x-www-form-urlencoded");
        sharePost.setEntity(new UrlEncodedFormEntity(shareParameters, "UTF-8"));
        MyHelperClass HttpClientUtils = new MyHelperClass();
        DefaultHttpClient httpclient =(DefaultHttpClient)(Object) HttpClientUtils.getHttpClient();
        HttpResponse loginPostRes =(HttpResponse)(Object) httpclient.execute(sharePost);
//        MyHelperClass HttpClientUtils = new MyHelperClass();
        String shareHtml =(String)(Object) HttpClientUtils.getHtml(loginPostRes, "UTF-8", false);
        return shareHtml;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encode(byte[] o0){ return null; }
	public MyHelperClass getHttpClient(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass getHtml(HttpResponse o0, String o1, boolean o2){ return null; }}

class Webpage {
public MyHelperClass images;
	public MyHelperClass url;
	public MyHelperClass title;
}

class NameValuePair {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(){}}

class Mac {

public MyHelperClass doFinal(byte[] o0){ return null; }
	public MyHelperClass init(SecretKeySpec o0){ return null; }}

class SecretKeySpec {

SecretKeySpec(byte[] o0, String o1){}
	SecretKeySpec(){}}

class HttpPost {

HttpPost(){}
	HttpPost(String o0){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0, String o1){}
	UrlEncodedFormEntity(){}}

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpResponse {

}
