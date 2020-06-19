import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18121766 {
public MyHelperClass log(MyHelperClass o0, String o1){ return null; }

    private String doUploadFile(String sessionId, File file, String originalFileName) throws Throwable, UnsupportedEncodingException, IOException {
        MyHelperClass INFO = new MyHelperClass();
        log(INFO, sessionId);
//        MyHelperClass INFO = new MyHelperClass();
        log(INFO, file.getPath());
        DefaultHttpClient httpclient = new DefaultHttpClient();
        UploadFileRequest request = new UploadFileRequest();
        request.setSessionId(sessionId);
        request.setDirectory(UUID.randomUUID().toString());
        request.setFileName(originalFileName);
        URL url = file.toURI().toURL();
        URLConnection urlCon = url.openConnection();
        XStream writer = new XStream();
        MyHelperClass XStream = new MyHelperClass();
        writer.setMode(XStream.XPATH_ABSOLUTE_REFERENCES);
        writer.alias("UploadFileRequest", UploadFileRequest.class);
        XStream reader = new XStream();
//        MyHelperClass XStream = new MyHelperClass();
        reader.setMode(XStream.XPATH_ABSOLUTE_REFERENCES);
        reader.alias("UploadFileResponse", UploadFileResponse.class);
        String strRequest = URLEncoder.encode(reader.toXML(request), "UTF-8");
        MyHelperClass MewitProperties = new MyHelperClass();
        HttpPost httppost = new HttpPost(MewitProperties.getMewitUrl() + "/resources/uploadFile?REQUEST=" + strRequest);
        FileEntity fileEntity = new FileEntity(file, urlCon.getContentType());
        httppost.setEntity(fileEntity);
        HttpResponse response = httpclient.execute(httppost);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            MyHelperClass EntityUtils = new MyHelperClass();
            String result = URLDecoder.decode(EntityUtils.toString(entity), "UTF-8");
//            MyHelperClass INFO = new MyHelperClass();
            log(INFO, result);
            UploadFileResponse oResponse = (UploadFileResponse) reader.fromXML(result);
            return oResponse.getFile();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass XPATH_ABSOLUTE_REFERENCES;
public MyHelperClass getMewitUrl(){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class UploadFileRequest {

public MyHelperClass setDirectory(String o0){ return null; }
	public MyHelperClass setFileName(String o0){ return null; }
	public MyHelperClass setSessionId(String o0){ return null; }}

class XStream {

public MyHelperClass toXML(UploadFileRequest o0){ return null; }
	public MyHelperClass alias(String o0, Class<UploadFileResponse o1){ return null; }
	public MyHelperClass fromXML(String o0){ return null; }
	public MyHelperClass alias(String o0, Class<UploadFileRequest o1){ return null; }}

class UploadFileResponse {

public MyHelperClass getFile(){ return null; }}

class HttpPost {

public MyHelperClass setEntity(FileEntity o0){ return null; }}

class FileEntity {

FileEntity(File o0, String o1){}
	FileEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
