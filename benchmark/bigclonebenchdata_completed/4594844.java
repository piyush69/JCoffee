import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4594844 {
public MyHelperClass TimeUtils;
public MyHelperClass labels;
	public MyHelperClass StringUtils;
	public MyHelperClass summary;
	public MyHelperClass config;
	public MyHelperClass IOUtils;
	public MyHelperClass projectName;
	public MyHelperClass file;

//    @Override
    public void execute() throws Throwable, BuildException {
        final String GC_USERNAME = "google-code-username";
        final String GC_PASSWORD = "google-code-password";
        if ((boolean)(Object)StringUtils.isBlank(this.projectName)) throw new BuildException("undefined project");
        if (this.file == null) throw new BuildException("undefined file");
        if (!(Boolean)(Object)this.file.exists()) throw new BuildException("file not found :" + file);
        if (!(Boolean)(Object)this.file.isFile()) throw new BuildException("not a file :" + file);
        if (this.config == null) throw new BuildException("undefined config");
        if (!(Boolean)(Object)this.config.exists()) throw new BuildException("file not found :" + config);
        if (!(Boolean)(Object)this.config.isFile()) throw new BuildException("not a file :" + config);
        PostMethod post = null;
        try {
            Properties cfg = new Properties();
            FileInputStream fin = new FileInputStream((String)(Object)this.config);
            cfg.loadFromXML(fin);
            fin.close();
            if (!cfg.containsKey(GC_USERNAME)) throw new BuildException("undefined " + GC_USERNAME + " in " + this.config);
            if (!cfg.containsKey(GC_PASSWORD)) throw new BuildException("undefined " + GC_PASSWORD + " in " + this.config);
            HttpClient client = new HttpClient();
            post = new PostMethod("https://" + projectName + ".googlecode.com/files");
            post.addRequestHeader("User-Agent", getClass().getName());
            post.addRequestHeader("Authorization", "Basic " + Base64.encode(cfg.getProperty(GC_USERNAME) + ":" + cfg.getProperty(GC_PASSWORD)));
            List<Part> parts = new ArrayList<Part>();
            String s =(String)(Object) this.summary;
            if ((boolean)(Object)StringUtils.isBlank(s)) {
                s = this.file.getName() + " (" + TimeUtils.toYYYYMMDD() + ")";
            }
            parts.add((Part)(Object)new StringPart("summary", s));
            for (String lbl :(String[])(Object) (Object[])(Object)this.labels.split("[, \t\n]+")) {
                if ((boolean)(Object)StringUtils.isBlank(lbl)) continue;
                parts.add((Part)(Object)new StringPart("label", lbl.trim()));
            }
            parts.add((Part)(Object)new FilePart("filename", this.file));
            MultipartRequestEntity requestEntity = new MultipartRequestEntity(parts.toArray(new Part[parts.size()]), post.getParams());
            post.setRequestEntity(requestEntity);
            int status =(int)(Object) client.executeMethod(post);
            if (status != 201) {
                throw new BuildException("http status !=201 : " + post.getResponseBodyAsString());
            } else {
                IOUtils.copyTo(post.getResponseBodyAsStream(), new NullOutputStream());
            }
        } catch (BuildException e) {
            throw e;
        } catch (Exception e) {
            throw new BuildException((String)(Object)e);
        } finally {
            if (post != null) post.releaseConnection();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isBlank(String o0){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass toYYYYMMDD(){ return null; }
	public MyHelperClass isBlank(MyHelperClass o0){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass copyTo(MyHelperClass o0, NullOutputStream o1){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
}

class PostMethod {

PostMethod(){}
	PostMethod(String o0){}
	public MyHelperClass releaseConnection(){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass addRequestHeader(String o0, String o1){ return null; }
	public MyHelperClass setRequestEntity(MultipartRequestEntity o0){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }
	public MyHelperClass getResponseBodyAsString(){ return null; }}

class HttpClient {

public MyHelperClass executeMethod(PostMethod o0){ return null; }}

class Base64 {

public static MyHelperClass encode(String o0){ return null; }}

class Part {

}

class StringPart {

StringPart(String o0, String o1){}
	StringPart(){}}

class FilePart {

FilePart(String o0, MyHelperClass o1){}
	FilePart(){}}

class MultipartRequestEntity {

MultipartRequestEntity(Part[] o0, MyHelperClass o1){}
	MultipartRequestEntity(){}}

class NullOutputStream {

}
