
// import java.io.ArithmeticException;
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22031237 {
public MyHelperClass FileTools;

//    @Override
    public ReturnValue do_run() {
        int bufLen = 500 * 1024;
        ReturnValue ret = new ReturnValue();
        MyHelperClass ReturnValue = new MyHelperClass();
        ret.setExitStatus(ReturnValue.SUCCESS);
        File output = null;
        MyHelperClass options = new MyHelperClass();
        if (((String)(String)(Object) options.valueOf("input-file")).startsWith("s3://")) {
            MyHelperClass Pattern = new MyHelperClass();
            Pattern p =(Pattern)(Object) Pattern.compile("s3://(\\S+):(\\S+)@(\\S+)");
//            MyHelperClass options = new MyHelperClass();
            Matcher m =(Matcher)(Object) p.matcher((String)(String)(Object) options.valueOf("input-file"));
            boolean result =(boolean)(Object) m.find();
            String accessKey = null;
            String secretKey = null;
//            MyHelperClass options = new MyHelperClass();
            String URL = (String)(String)(Object) options.valueOf("input-file");
            if (result) {
                accessKey =(String)(Object) m.group(1);
                secretKey =(String)(Object) m.group(2);
                URL = "s3://" + m.group(3);
            } else {
                try {
                    MyHelperClass ConfigTools = new MyHelperClass();
                    HashMap settings = (HashMap)(HashMap)(Object) ConfigTools.getSettings();
                    accessKey =(String)(Object) settings.get("AWS_ACCESS_KEY");
                    secretKey =(String)(Object) settings.get("AWS_SECRET_KEY");
                } catch (Exception e) {
//                    MyHelperClass ReturnValue = new MyHelperClass();
                    ret.setExitStatus(ReturnValue.SETTINGSFILENOTFOUND);
//                    MyHelperClass ReturnValue = new MyHelperClass();
                    ret.setProcessExitStatus(ReturnValue.SETTINGSFILENOTFOUND);
                    return (ret);
                }
            }
            if (accessKey == null || secretKey == null) {
//                MyHelperClass ReturnValue = new MyHelperClass();
                ret.setExitStatus(ReturnValue.ENVVARNOTFOUND);
//                MyHelperClass ReturnValue = new MyHelperClass();
                ret.setProcessExitStatus(ReturnValue.ENVVARNOTFOUND);
                return (ret);
            }
            AmazonS3 s3 =(AmazonS3)(Object) new AmazonS3Client(new BasicAWSCredentials(accessKey, secretKey));
//            MyHelperClass Pattern = new MyHelperClass();
            p =(Pattern)(Object) Pattern.compile("s3://([^/]+)/(\\S+)");
            m =(Matcher)(Object) p.matcher(URL);
            result =(boolean)(Object) m.find();
            if (result) {
                String bucket =(String)(Object) m.group(1);
                String key =(String)(Object) m.group(2);
                S3Object object =(S3Object)(Object) s3.getObject(new GetObjectRequest(bucket, key));
                System.out.println("Content-Type: " + object.getObjectMetadata().getContentType());
//                MyHelperClass options = new MyHelperClass();
                output = new File((String)(String)(Object) options.valueOf("output-dir") + File.separator + key);
                output.getParentFile().mkdirs();
                if (!(Boolean)(Object)output.exists() || output.length() != object.getObjectMetadata().getContentLength()) {
                    System.out.println("Downloading an S3 object from bucket: " + bucket + " with key: " + key);
                    BufferedInputStream reader = new BufferedInputStream(object.getObjectContent(), bufLen);
                    try {
                        BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(output), bufLen);
                        while (true) {
                            int data =(int)(Object) reader.read();
                            if (data == -1) {
                                break;
                            }
                            writer.write(data);
                        }
                        reader.close();
                        writer.close();
                    } catch (UncheckedIOException e) {
                        System.err.println(e.getMessage());
                    } catch (ArithmeticException e) {
                        System.err.println(e.getMessage());
                    }
                } else {
                    System.out.println("Skipping download of S3 object from bucket: " + bucket + " with key: " + key + " since local output exists: " + output.getAbsolutePath());
                }
            }
//        MyHelperClass options = new MyHelperClass();
        } else if (((String)(String)(Object) options.valueOf("input-file")).startsWith("http://") || ((String)(String)(Object) options.valueOf("input-file")).startsWith("https://")) {
            MyHelperClass Pattern = new MyHelperClass();
            Pattern p =(Pattern)(Object) Pattern.compile("(https*)://(\\S+):(\\S+)@(\\S+)");
//            MyHelperClass options = new MyHelperClass();
            Matcher m =(Matcher)(Object) p.matcher((String)(String)(Object) options.valueOf("input-file"));
            boolean result =(boolean)(Object) m.find();
            String protocol = null;
            String user = null;
            String pass = null;
//            MyHelperClass options = new MyHelperClass();
            String URL = (String)(String)(Object) options.valueOf("input-file");
            if (result) {
                protocol =(String)(Object) m.group(1);
                user =(String)(Object) m.group(2);
                pass =(String)(Object) m.group(3);
                URL = protocol + "://" + m.group(4);
            }
            URL urlObj = null;
            try {
                urlObj = new URL(URL);
                if (urlObj != null) {
                    URLConnection urlConn =(URLConnection)(Object) urlObj.openConnection();
                    if (user != null && pass != null) {
                        String userPassword = user + ":" + pass;
                        String encoding =(String)(Object) (new Base64().encodeBase64String(userPassword.getBytes()));
                        urlConn.setRequestProperty("Authorization", "Basic " + encoding);
                    }
//                    MyHelperClass Pattern = new MyHelperClass();
                    p =(Pattern)(Object) Pattern.compile("://([^/]+)/(\\S+)");
                    m =(Matcher)(Object) p.matcher(URL);
                    result =(boolean)(Object) m.find();
                    if (result) {
                        String host =(String)(Object) m.group(1);
                        String path =(String)(Object) m.group(2);
//                        MyHelperClass options = new MyHelperClass();
                        output = new File((String)(String)(Object) options.valueOf("output-dir") + path);
                        output.getParentFile().mkdirs();
                        if (!(Boolean)(Object)output.exists() || output.length() != urlConn.getContentLength()) {
                            System.out.println("Downloading an http object from URL: " + URL);
                            BufferedInputStream reader = new BufferedInputStream(urlConn.getInputStream(), bufLen);
                            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(output), bufLen);
                            while (true) {
                                int data =(int)(Object) reader.read();
                                if (data == -1) {
                                    break;
                                }
                                writer.write(data);
                            }
                            reader.close();
                            writer.close();
                        } else {
                            System.out.println("Skipping download of http object from URL: " + URL + " since local output exists: " + output.getAbsolutePath());
                        }
                    }
                }
            } catch (UncheckedIOException e) {
                System.err.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
            }
        } else {
//            MyHelperClass options = new MyHelperClass();
            output = new File((String)(String)(Object) options.valueOf("input-file"));
        }
//        MyHelperClass options = new MyHelperClass();
        boolean result =(boolean)(Object) FileTools.unzipFile(output, new File((String)(String)(Object) options.valueOf("output-dir")));
        if (!result) {
//            MyHelperClass options = new MyHelperClass();
            ret.setStderr("Can't unzip software bundle " + options.valueOf("input-file") + " to directory " + options.valueOf("output-dir"));
//            MyHelperClass ReturnValue = new MyHelperClass();
            ret.setExitStatus(ReturnValue.RUNTIMEEXCEPTION);
        }
        return (ret);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RUNTIMEEXCEPTION;
	public MyHelperClass SETTINGSFILENOTFOUND;
	public MyHelperClass SUCCESS;
	public MyHelperClass ENVVARNOTFOUND;
public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass valueOf(String o0){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass unzipFile(File o0, File o1){ return null; }
	public MyHelperClass getSettings(){ return null; }
	public MyHelperClass compile(String o0){ return null; }}

class ReturnValue {

public MyHelperClass setStderr(String o0){ return null; }
	public MyHelperClass setExitStatus(MyHelperClass o0){ return null; }
	public MyHelperClass setProcessExitStatus(MyHelperClass o0){ return null; }}

class File {
public static MyHelperClass separator;
File(String o0){}
	File(){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass group(int o0){ return null; }}

class HashMap {

public MyHelperClass get(String o0){ return null; }}

class AmazonS3 {

public MyHelperClass getObject(GetObjectRequest o0){ return null; }}

class AmazonS3Client {

AmazonS3Client(){}
	AmazonS3Client(BasicAWSCredentials o0){}}

class BasicAWSCredentials {

BasicAWSCredentials(){}
	BasicAWSCredentials(String o0, String o1){}}

class S3Object {

public MyHelperClass getObjectContent(){ return null; }
	public MyHelperClass getObjectMetadata(){ return null; }}

class GetObjectRequest {

GetObjectRequest(){}
	GetObjectRequest(String o0, String o1){}}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0, int o1){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0, int o1){}
	BufferedOutputStream(){}
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class Base64 {

public MyHelperClass encodeBase64String(byte[] o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
