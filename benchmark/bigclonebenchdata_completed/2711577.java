
import java.io.UncheckedIOException;


class c2711577 {
public static MyHelperClass Config;
	public static MyHelperClass Logger;
	public static MyHelperClass PublicCompanyFactory;
	public static MyHelperClass LanguageUtil;
	public static MyHelperClass UtilMethods;
	public static MyHelperClass getUserManagerConfigPath(){ return null; }
//public MyHelperClass Logger;
//	public MyHelperClass LanguageUtil;
//	public MyHelperClass Config;
//	public MyHelperClass PublicCompanyFactory;
//	public MyHelperClass UtilMethods;
//	public MyHelperClass getUserManagerConfigPath(){ return null; }

    private static void _checkConfigFile() throws Exception {
        try {
            String filePath = getUserManagerConfigPath() + "user_manager_config.properties";
            boolean copy = false;
            File from =(File)(Object) new java.io.File(filePath);
            if (!(Boolean)(Object)from.exists()) {
                Properties properties = new Properties();
                properties.put(Config.getStringProperty("ADDITIONAL_INFO_MIDDLE_NAME_PROPNAME"), Config.getStringProperty("ADDITIONAL_INFO_MIDDLE_NAME_VISIBILITY"));
                properties.put(Config.getStringProperty("ADDITIONAL_INFO_DATE_OF_BIRTH_PROPNAME"), Config.getStringProperty("ADDITIONAL_INFO_DATE_OF_BIRTH_VISIBILITY"));
                properties.put(Config.getStringProperty("ADDITIONAL_INFO_CELL_PROPNAME"), Config.getStringProperty("ADDITIONAL_INFO_CELL_VISIBILITY"));
                properties.put(Config.getStringProperty("ADDITIONAL_INFO_CATEGORIES_PROPNAME"), Config.getStringProperty("ADDITIONAL_INFO_CATEGORIES_VISIBILITY"));
                Company comp =(Company)(Object) PublicCompanyFactory.getDefaultCompany();
                int numberGenericVariables =(int)(Object) Config.getIntProperty("MAX_NUMBER_VARIABLES_TO_SHOW");
                for (int i = 1; i <= numberGenericVariables; i++) {
                    properties.put(LanguageUtil.get(comp.getCompanyId(), comp.getLocale(), "user.profile.var" + i).replace(" ", "_"), Config.getStringProperty("ADDITIONAL_INFO_DEFAULT_VISIBILITY"));
                }
                try {
                    properties.store((FileOutputStream)(Object)new java.io.FileOutputStream(filePath), null);
                } catch (Exception e) {
                    Logger.error(UserManagerPropertiesFactory.class, e.getMessage(), e);
                }
                from =(File)(Object) new java.io.File(filePath);
                copy = true;
            }
            String tmpFilePath = UtilMethods.getTemporaryDirPath() + "user_manager_config_properties.tmp";
            File to =(File)(Object) new java.io.File(tmpFilePath);
            if (!(Boolean)(Object)to.exists()) {
                to.createNewFile();
                copy = true;
            }
            if (copy) {
                FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(from).getChannel());
                FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(to).getChannel());
                dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                srcChannel.close();
                dstChannel.close();
            }
        } catch (UncheckedIOException e) {
            Logger.error(UserManagerPropertiesFactory.class, "_checkLanguagesFiles:Property File Copy Failed " + e, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass getDefaultCompany(){ return null; }
	public MyHelperClass get(MyHelperClass o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass getTemporaryDirPath(){ return null; }
	public MyHelperClass getStringProperty(String o0){ return null; }
	public MyHelperClass error(Class<UserManagerPropertiesFactory> o0, String o1, Exception o2){ return null; }
	public MyHelperClass getIntProperty(String o0){ return null; }
	public MyHelperClass error(Class<UserManagerPropertiesFactory> o0, String o1, IOException o2){ return null; }}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class Properties {

public MyHelperClass store(FileOutputStream o0, Object o1){ return null; }
	public MyHelperClass put(MyHelperClass o0, MyHelperClass o1){ return null; }}

class Company {

public MyHelperClass getCompanyId(){ return null; }
	public MyHelperClass getLocale(){ return null; }}

class UserManagerPropertiesFactory {

}

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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
