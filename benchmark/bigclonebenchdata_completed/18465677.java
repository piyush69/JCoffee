import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18465677 {
public MyHelperClass mime_types;
	public MyHelperClass FILES;

    public void download(RequestContext ctx) throws Throwable, IOException {
        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)ctx.isRobot()) {
            ctx.forbidden();
            return;
        }
        long id =(long)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) ctx.id();
        MyHelperClass INSTANCE = new MyHelperClass();
        File bean =(File)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) File.INSTANCE.Get(id);
        if (bean == null) {
            ctx.not_found();
            return;
        }
        String f_ident =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) ctx.param("fn", "");
        MyHelperClass StringUtils = new MyHelperClass();
        if (id >= 100 && !StringUtils.equals(f_ident, bean.getIdent())) {
            ctx.not_found();
            return;
        }
        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)bean.IsLoginRequired() && ctx.user() == null) {
            MyHelperClass LinkTool = new MyHelperClass();
            StringBuilder login = new StringBuilder((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)LinkTool.home("home/login?goto_page="));
            ctx.redirect(login.toString());
            return;
        }
        FileInputStream fis = null;
        try {
            java.io.File file =(File)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FILES.readFile(bean.getPath());
            fis = new FileInputStream(file);
            ctx.response().setContentLength((int) file.length());
            MyHelperClass FilenameUtils = new MyHelperClass();
            String ext =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FilenameUtils.getExtension(bean.getPath());
            String mine_type =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) mime_types.get(ext);
            if (mine_type != null) ctx.response().setContentType(mine_type);
            String ua =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) ctx.header("user-agent");
            MyHelperClass LinkTool = new MyHelperClass();
            if (ua != null && ua.indexOf("Firefox") >= 0) ctx.header("Content-Disposition", "attachment; filename*=\"utf8''" + LinkTool.encode_url(bean.getName()) + "." + ext + "\""); else ctx.header("Content-Disposition", "attachment; filename=" + LinkTool.encode_url(bean.getName() + "." + ext));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(fis, ctx.response().getOutputStream());
            bean.IncDownloadCount(1);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(fis);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass Get(long o0){ return null; }
	public MyHelperClass getExtension(MyHelperClass o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass encode_url(MyHelperClass o0){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass home(String o0){ return null; }
	public MyHelperClass encode_url(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }
	public MyHelperClass readFile(MyHelperClass o0){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class RequestContext {

public MyHelperClass redirect(String o0){ return null; }
	public MyHelperClass isRobot(){ return null; }
	public MyHelperClass response(){ return null; }
	public MyHelperClass param(String o0, String o1){ return null; }
	public MyHelperClass header(String o0){ return null; }
	public MyHelperClass forbidden(){ return null; }
	public MyHelperClass user(){ return null; }
	public MyHelperClass not_found(){ return null; }
	public MyHelperClass id(){ return null; }
	public MyHelperClass header(String o0, String o1){ return null; }}

class File {
public static MyHelperClass INSTANCE;
public MyHelperClass IsLoginRequired(){ return null; }
	public MyHelperClass getIdent(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass IncDownloadCount(int o0){ return null; }}

class Object {

public MyHelperClass equals(String o0, MyHelperClass o1){ return null; }}
