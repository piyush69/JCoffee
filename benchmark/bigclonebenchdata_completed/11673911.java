
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11673911 {
public MyHelperClass Logger;
	public MyHelperClass SessionMessages;
	public MyHelperClass getTemporyDirPath(){ return null; }
	public MyHelperClass getGlobalVariablesPath(){ return null; }

    private void _save(ActionRequest req, ActionResponse res, PortletConfig config, ActionForm form) throws Exception {
        MyHelperClass WebKeys = new MyHelperClass();
        List list = (List)(List)(Object) req.getAttribute(WebKeys.LANGUAGE_MANAGER_LIST);
        for (int i = 0; i < (int)(Object)list.size(); i++) {
            long langId =(long)(Object) ((Language)(Language)(Object) list.get(i)).getId();
            try {
                String filePath = getGlobalVariablesPath() + "cms_language_" + langId + ".properties";
                String tmpFilePath = getTemporyDirPath() + "cms_language_" + langId + "_properties.tmp";
                File from =(File)(Object) new java.io.File(tmpFilePath);
                from.createNewFile();
                File to =(File)(Object) new java.io.File(filePath);
                to.createNewFile();
                FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(from).getChannel());
                FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(to).getChannel());
                dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                srcChannel.close();
                dstChannel.close();
            } catch (UncheckedIOException we) {
            } catch (ArithmeticException e) {
                Logger.error(this, "Property File save Failed " + e,(IOException)(Object) e);
            }
        }
        SessionMessages.add(req, "message", "message.languagemanager.save");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LANGUAGE_MANAGER_LIST;
public MyHelperClass add(ActionRequest o0, String o1, String o2){ return null; }
	public MyHelperClass error(c11673911 o0, String o1, IOException o2){ return null; }}

class ActionRequest {

public MyHelperClass getAttribute(MyHelperClass o0){ return null; }}

class ActionResponse {

}

class PortletConfig {

}

class ActionForm {

}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class Language {

public MyHelperClass getId(){ return null; }}

class File {

public MyHelperClass createNewFile(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class NonWritableChannelException extends Exception{
	public NonWritableChannelException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
