
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2711585 {
public static MyHelperClass SessionMessages;
	public static MyHelperClass UtilMethods;
	public static MyHelperClass Logger;
	public static MyHelperClass getUserManagerConfigPath(){ return null; }
//public MyHelperClass Logger;
//	public MyHelperClass UtilMethods;
//	public MyHelperClass SessionMessages;
//	public MyHelperClass getUserManagerConfigPath(){ return null; }

    public static void _save(PortletRequest req, PortletResponse res, PortletConfig config, ActionForm form) throws Exception {
        try {
            String filePath = getUserManagerConfigPath() + "user_manager_config.properties";
            String tmpFilePath = UtilMethods.getTemporaryDirPath() + "user_manager_config_properties.tmp";
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
            Logger.error(UserManagerPropertiesFactory.class, "Property File save Failed " + e,(IOException)(Object) e);
        }
        SessionMessages.add(req, "message", "message.usermanager.display.save");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(PortletRequest o0, String o1, String o2){ return null; }
	public MyHelperClass error(Class<UserManagerPropertiesFactory> o0, String o1, IOException o2){ return null; }
	public MyHelperClass getTemporaryDirPath(){ return null; }}

class PortletRequest {

}

class PortletResponse {

}

class PortletConfig {

}

class ActionForm {

}

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

class UserManagerPropertiesFactory {

}
