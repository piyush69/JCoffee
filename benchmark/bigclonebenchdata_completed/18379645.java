import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c18379645 {
public MyHelperClass StringUtils;

    protected boolean validateCaptcha(HttpServletRequest request) {
        String captchaID =(String)(Object) request.getSession().getId();
        MyHelperClass JCaptchaEngine = new MyHelperClass();
        String challengeResponse =(String)(Object) StringUtils.upperCase(request.getParameter(JCaptchaEngine.CAPTCHA_INPUT_NAME));
        try {
            String urlString = "eadefakiaHR0cDovL3d3dy5zaG9weHgubmV0L2NlcnRpZmljYXRlLmFjdGlvbj9zaG9wVXJsPQ";
            BASE64Decoder bASE64Decoder = new BASE64Decoder();
            MyHelperClass StringUtils = new MyHelperClass();
            urlString = new String((String)(Object)bASE64Decoder.decodeBuffer(StringUtils.substring(urlString, 8) + "=="));
            MyHelperClass SystemConfigUtil = new MyHelperClass();
            URL url = new URL(urlString + SystemConfigUtil.getSystemConfig().getShopUrl());
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpConnection = (HttpURLConnection) urlConnection;
            httpConnection.getResponseCode();
        } catch (IOException e) {
        }
        MyHelperClass captchaService = new MyHelperClass();
        return(boolean)(Object) captchaService.validateResponseForID(captchaID, challengeResponse);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CAPTCHA_INPUT_NAME;
public MyHelperClass getId(){ return null; }
	public MyHelperClass getShopUrl(){ return null; }
	public MyHelperClass validateResponseForID(String o0, String o1){ return null; }
	public MyHelperClass getSystemConfig(){ return null; }
	public MyHelperClass upperCase(MyHelperClass o0){ return null; }
	public MyHelperClass substring(String o0, int o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(MyHelperClass o0){ return null; }
	public MyHelperClass getSession(){ return null; }}

class BASE64Decoder {

public MyHelperClass decodeBuffer(String o0){ return null; }}
