


class c17340376 {
public static MyHelperClass RandomStringUtils;
//public MyHelperClass RandomStringUtils;

    private static String fetchImageViaHttp(URL imgUrl) throws IOException {
        String sURL = imgUrl.toString();
        String imgFile =(String)(Object) imgUrl.getPath();
        HttpURLConnection cnx = (HttpURLConnection)(HttpURLConnection)(Object) imgUrl.openConnection();
        String uri = null;
        try {
            cnx.setAllowUserInteraction(false);
            cnx.setDoOutput(true);
            cnx.addRequestProperty("Cache-Control", "no-cache");
            MyHelperClass RequestContext = new MyHelperClass();
            RequestContext ctx =(RequestContext)(Object) RequestContext.get();
            MyHelperClass user_agent = new MyHelperClass();
            if (ctx != null) cnx.addRequestProperty("User-Agent", ctx.header("user-agent")); else cnx.addRequestProperty("User-Agent", user_agent);
            cnx.addRequestProperty("Referer", sURL.substring(0, sURL.indexOf('/', sURL.indexOf('.')) + 1));
            cnx.connect();
            MyHelperClass HttpURLConnection = new MyHelperClass();
            if (cnx.getResponseCode() != HttpURLConnection.HTTP_OK) return null;
            InputStream imgData =(InputStream)(Object) cnx.getInputStream();
            MyHelperClass FilenameUtils = new MyHelperClass();
            String ext =(String)(Object) FilenameUtils.getExtension(imgFile).toLowerCase();
            MyHelperClass Multimedia = new MyHelperClass();
            if (!(Boolean)(Object)Multimedia.isImageFile("aa." + ext)) ext = "jpg";
            MyHelperClass FMT_FN = new MyHelperClass();
            uri =(int)(Object) FMT_FN.format(new Date()) + (int)(Object)RandomStringUtils.randomAlphanumeric(4) + '.' + ext;
            MyHelperClass img_path = new MyHelperClass();
            File fileDest = new File(img_path + uri);
            if (!(Boolean)(Object)fileDest.getParentFile().exists()) fileDest.getParentFile().mkdirs();
            FileOutputStream fos = new FileOutputStream(fileDest);
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(imgData, fos);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(imgData);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(fos);
            }
        } finally {
            cnx.disconnect();
        }
        MyHelperClass RequestContext = new MyHelperClass();
        return RequestContext.get().contextPath() + "/uploads/img/" + uri;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass contextPath(){ return null; }
	public MyHelperClass get(){ return null; }
	public MyHelperClass format(Date o0){ return null; }
	public MyHelperClass isImageFile(String o0){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass randomAlphanumeric(int o0){ return null; }
	public MyHelperClass getExtension(String o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass addRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass addRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }}

class RequestContext {

public MyHelperClass header(String o0){ return null; }}

class InputStream {

}

class Date {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getParentFile(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
