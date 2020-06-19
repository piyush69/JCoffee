import java.io.*;
import java.lang.*;
import java.util.*;



class c17987049 {
public MyHelperClass determineTranslatedResourceName(ResourceProxy o0, LocaleProxy o1){ return null; }
	public MyHelperClass writeResourceToBundleClasspath(ResourceProxy o0, LocaleProxy o1){ return null; }

    private boolean writeResource(PluginProxy eclipseInstallPlugin, ResourceProxy translation, LocaleProxy locale) throws Exception {
        String translationResourceName =(String)(Object) determineTranslatedResourceName(translation, locale);
        MyHelperClass Messages = new MyHelperClass();
        String pluginNameInDirFormat =(String)(Object) eclipseInstallPlugin.getName().replace(Messages.getString("Characters_period"), File.separator);
        if ((boolean)(Object)translation.getRelativePath().contains(pluginNameInDirFormat)) {
            return(boolean)(Object) writeResourceToBundleClasspath(translation, locale);
        } else if (translationResourceName.contains(File.separator)) {
            String resourcePath = translationResourceName.substring(0, translationResourceName.lastIndexOf(File.separatorChar));
            MyHelperClass directory = new MyHelperClass();
            File resourcePathDirectory = new File((char)(Object)directory.getPath() + File.separatorChar + resourcePath);
            resourcePathDirectory.mkdirs();
        }
        MyHelperClass directory = new MyHelperClass();
        File fragmentResource = new File((char)(Object)directory.getPath() + File.separatorChar + translationResourceName);
        File translatedResource = new File((String)(Object)translation.getFileResource().getAbsolutePath());
        FileChannel inputChannel =(FileChannel)(Object) (new FileInputStream(translatedResource).getChannel());
        FileChannel outputChannel =(FileChannel)(Object) (new FileOutputStream(fragmentResource).getChannel());
        inputChannel.transferTo(0, inputChannel.size(), outputChannel);
        inputChannel.close();
        outputChannel.close();
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass replace(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass contains(String o0){ return null; }}

class PluginProxy {

public MyHelperClass getName(){ return null; }}

class ResourceProxy {

public MyHelperClass getFileResource(){ return null; }
	public MyHelperClass getRelativePath(){ return null; }}

class LocaleProxy {

}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }
	public MyHelperClass size(){ return null; }}
