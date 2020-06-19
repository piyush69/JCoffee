import java.io.*;
import java.lang.*;
import java.util.*;



class c8335944 {
public static MyHelperClass EncryptUtil;
//public MyHelperClass EncryptUtil;

    public static byte[] sendRequestV1(String url, Map<String, Object> params, String secretCode, String method, Map<String, String> files, String encoding, String signMethod, Map<String, String> headers, String contentType) {
        HttpClient client = new HttpClient();
        byte[] result = null;
        if (method.equalsIgnoreCase("get")) {
            GetMethod getMethod = new GetMethod(url);
            if (contentType == null || contentType.equals("")) getMethod.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8"); else getMethod.setRequestHeader("Content-Type", contentType);
            if (headers != null && headers.size() > 0) {
                Iterator<String> keys = headers.keySet().iterator();
                while (keys.hasNext()) {
                    String key = keys.next();
                    getMethod.setRequestHeader(key, headers.get(key));
                }
            }
            try {
                NameValuePair[] getData;
                if (params != null) {
                    if (secretCode == null) getData = new NameValuePair[params.size()]; else getData = new NameValuePair[params.size() + 1];
                    Iterator<?> iters = params.keySet().iterator();
                    int i = 0;
                    while (iters.hasNext()) {
                        String key = (String) iters.next();
                        getData[i] = new NameValuePair(key, params.get(key).toString());
                        i++;
                    }
                    if (secretCode != null) {
                        boolean isHMac = false;
                        if (signMethod != null && signMethod.equalsIgnoreCase("hmac")) isHMac = true;
                        MyHelperClass PARAMETER_SIGN = new MyHelperClass();
                        String sign =(String)(Object) EncryptUtil.signature2(params, secretCode, "md5".equalsIgnoreCase(signMethod), isHMac, PARAMETER_SIGN);
//                        MyHelperClass PARAMETER_SIGN = new MyHelperClass();
                        getData[i] = new NameValuePair(PARAMETER_SIGN, sign);
                    }
                    getMethod.setQueryString(getData);
                }
                client.executeMethod(getMethod);
                ByteArrayOutputStream bout = new ByteArrayOutputStream();
                try {
                    InputStream in =(InputStream)(Object) getMethod.getResponseBodyAsStream();
                    byte[] buf = new byte[500];
                    int count = 0;
                    while ((count = in.read(buf)) > 0) {
                        bout.write(buf, 0, count);
                    }
                    result = bout.toByteArray();
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    if (bout != null) bout.close();
                }
            } catch (Exception ex) {
                MyHelperClass logger = new MyHelperClass();
                logger.error(ex, ex);
            } finally {
                if (getMethod != null) getMethod.releaseConnection();
            }
        }
        if (method.equalsIgnoreCase("post")) {
            PostMethod postMethod = new PostMethod(url);
            if (headers != null && headers.size() > 0) {
                Iterator<String> keys = headers.keySet().iterator();
                while (keys.hasNext()) {
                    String key = keys.next();
                    postMethod.setRequestHeader(key, headers.get(key));
                }
            }
            try {
                if (contentType == null) {
                    if (files != null && files.size() > 0) {
                        Part[] parts;
                        if (secretCode == null) parts = new Part[params.size() + files.size()]; else parts = new Part[params.size() + 1 + files.size()];
                        Iterator<?> iters = params.keySet().iterator();
                        int i = 0;
                        while (iters.hasNext()) {
                            String key = (String) iters.next();
                            parts[i] =(Part)(Object) new StringPart(key, params.get(key).toString(), "UTF-8");
                            i++;
                        }
                        if (secretCode != null) {
                            boolean isHMac = false;
                            if (signMethod != null && signMethod.equalsIgnoreCase("hmac")) isHMac = true;
                            MyHelperClass PARAMETER_SIGN = new MyHelperClass();
                            String sign =(String)(Object) EncryptUtil.signature(params, secretCode, isHMac, PARAMETER_SIGN);
//                            MyHelperClass PARAMETER_SIGN = new MyHelperClass();
                            parts[i] =(Part)(Object) new StringPart(PARAMETER_SIGN, sign);
                            i++;
                        }
                        iters = files.keySet().iterator();
                        while (iters.hasNext()) {
                            String key = (String) iters.next();
                            if (files.get(key).toString().startsWith("http://")) {
                                InputStream bin = null;
                                ByteArrayOutputStream bout = new ByteArrayOutputStream();
                                try {
                                    URL fileurl = new URL(files.get(key).toString());
                                    bin =(InputStream)(Object) fileurl.openStream();
                                    byte[] buf = new byte[500];
                                    int count = 0;
                                    while ((count = bin.read(buf)) > 0) {
                                        bout.write(buf, 0, count);
                                    }
                                    parts[i] =(Part)(Object) new FilePart(key,(File)(Object) new ByteArrayPartSource(fileurl.getFile().substring((int)(Object)fileurl.getFile().lastIndexOf("/") + 1), bout.toByteArray()));
                                } catch (Exception ex) {
                                    MyHelperClass logger = new MyHelperClass();
                                    logger.error(ex, ex);
                                } finally {
                                    if (bin != null) bin.close();
                                    if (bout != null) bout.close();
                                }
                            } else parts[i] =(Part)(Object) new FilePart(key, new File(files.get(key).toString()));
                            i++;
                        }
                        postMethod.setRequestEntity((RequestEntity)(Object)new MultipartRequestEntity(parts, postMethod.getParams()));
                    } else {
                        NameValuePair[] postData;
                        if (params != null) {
                            if (secretCode == null) postData = new NameValuePair[params.size()]; else postData = new NameValuePair[params.size() + 1];
                            Iterator<?> iters = params.keySet().iterator();
                            int i = 0;
                            while (iters.hasNext()) {
                                String key = (String) iters.next();
                                postData[i] = new NameValuePair(key, params.get(key).toString());
                                i++;
                            }
                            if (secretCode != null) {
                                boolean isHMac = false;
                                if (signMethod != null && signMethod.equalsIgnoreCase("hmac")) isHMac = true;
                                MyHelperClass PARAMETER_SIGN = new MyHelperClass();
                                String sign =(String)(Object) EncryptUtil.signature(params, secretCode, isHMac, PARAMETER_SIGN);
//                                MyHelperClass PARAMETER_SIGN = new MyHelperClass();
                                postData[i] = new NameValuePair(PARAMETER_SIGN, sign);
                            }
                            postMethod.setRequestBody(postData);
                        }
                        if (contentType == null || contentType.equals("")) postMethod.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                    }
                } else {
                    String content = (String) params.get(params.keySet().iterator().next());
                    RequestEntity entiry =(RequestEntity)(Object) new StringRequestEntity(content, contentType, "UTF-8");
                    postMethod.setRequestEntity(entiry);
                }
                client.executeMethod(postMethod);
                ByteArrayOutputStream bout = new ByteArrayOutputStream();
                try {
                    InputStream in =(InputStream)(Object) postMethod.getResponseBodyAsStream();
                    byte[] buf = new byte[500];
                    int count = 0;
                    while ((count = in.read(buf)) > 0) {
                        bout.write(buf, 0, count);
                    }
                    result = bout.toByteArray();
                } catch (Exception ex) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.error(ex, ex);
                } finally {
                    if (bout != null) bout.close();
                }
            } catch (Exception e) {
                MyHelperClass logger = new MyHelperClass();
                logger.error(e, e);
            } finally {
                if (postMethod != null) postMethod.releaseConnection();
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass signature2(Map<String,Object> o0, String o1, boolean o2, boolean o3, MyHelperClass o4){ return null; }
	public MyHelperClass error(Exception o0, Exception o1){ return null; }
	public MyHelperClass signature(Map<String,Object> o0, String o1, boolean o2, MyHelperClass o3){ return null; }}

class HttpClient {

public MyHelperClass executeMethod(PostMethod o0){ return null; }
	public MyHelperClass executeMethod(GetMethod o0){ return null; }}

class GetMethod {

GetMethod(String o0){}
	GetMethod(){}
	public MyHelperClass releaseConnection(){ return null; }
	public MyHelperClass setRequestHeader(String o0, String o1){ return null; }
	public MyHelperClass setQueryString(NameValuePair[] o0){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }}

class NameValuePair {

NameValuePair(String o0, String o1){}
	NameValuePair(MyHelperClass o0, String o1){}
	NameValuePair(){}}

class PostMethod {

PostMethod(String o0){}
	PostMethod(){}
	public MyHelperClass setRequestBody(NameValuePair[] o0){ return null; }
	public MyHelperClass setRequestEntity(RequestEntity o0){ return null; }
	public MyHelperClass releaseConnection(){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass setRequestHeader(String o0, String o1){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }}

class Part {

}

class StringPart {

StringPart(MyHelperClass o0, String o1){}
	StringPart(){}
	StringPart(String o0, String o1, String o2){}}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class FilePart {

FilePart(String o0, File o1){}
	FilePart(){}}

class ByteArrayPartSource {

ByteArrayPartSource(){}
	ByteArrayPartSource(MyHelperClass o0, byte[] o1){}}

class MultipartRequestEntity {

MultipartRequestEntity(Part[] o0, MyHelperClass o1){}
	MultipartRequestEntity(){}}

class RequestEntity {

}

class StringRequestEntity {

StringRequestEntity(){}
	StringRequestEntity(String o0, String o1, String o2){}}
