import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13653107 {
public static MyHelperClass removeDeviceEntry(DeviceEntry o0){ return null; }
	public static MyHelperClass addDeviceEntry(DeviceEntry o0){ return null; }
public static MyHelperClass urlsMRU;
	public static MyHelperClass configXml;
	public static MyHelperClass IOUtils;
	public static MyHelperClass Logger;
	public static MyHelperClass loadConfigFile(String o0){ return null; }
//	public MyHelperClass addDeviceEntry(DeviceEntry o0){ return null; }
	public static MyHelperClass initSystemProperties(){ return null; }
	public static MyHelperClass getConfigPath(){ return null; }
	public static MyHelperClass getDeviceEntries(){ return null; }
	public static MyHelperClass saveConfig(){ return null; }
	public static MyHelperClass createDefaultConfigXml(){ return null; }
//	public MyHelperClass removeDeviceEntry(DeviceEntry o0){ return null; }
//public MyHelperClass Logger;
//	public MyHelperClass configXml;
//	public MyHelperClass urlsMRU;
//	public MyHelperClass IOUtils;
//	public MyHelperClass getConfigPath(){ return null; }
//	public MyHelperClass initSystemProperties(){ return null; }
//	public MyHelperClass loadConfigFile(String o0){ return null; }
//	public MyHelperClass createDefaultConfigXml(){ return null; }
//	public MyHelperClass saveConfig(){ return null; }
//	public MyHelperClass getDeviceEntries(){ return null; }

    public static void loadConfig(DeviceEntry defaultDevice, EmulatorContext emulatorContext)  throws Throwable {
        MyHelperClass Config = new MyHelperClass();
        Config.defaultDevice = defaultDevice;
//        MyHelperClass Config = new MyHelperClass();
        Config.emulatorContext =(MyHelperClass)(Object) emulatorContext;
        File configFile = new File((String)(Object)getConfigPath(), "config2.xml");
        try {
            if (configFile.exists()) {
                loadConfigFile("config2.xml");
            } else {
                configFile = new File((String)(Object)getConfigPath(), "config.xml");
                if (configFile.exists()) {
                    loadConfigFile("config.xml");
                    for (Enumeration e =(Enumeration)(Object) getDeviceEntries().elements(); e.hasMoreElements(); ) {
                        DeviceEntry entry = (DeviceEntry) e.nextElement();
                        if (!(Boolean)(Object)entry.canRemove()) {
                            continue;
                        }
                        removeDeviceEntry(entry);
                        File src = new File((String)(Object)getConfigPath(),(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) entry.getFileName());
                        File dst = File.createTempFile("dev", ".jar",(File)(Object) getConfigPath());
                        IOUtils.copyFile(src, dst);
                        entry.setFileName(dst.getName());
                        addDeviceEntry(entry);
                    }
                } else {
                    createDefaultConfigXml();
                }
                saveConfig();
            }
        } catch (IOException ex) {
            Logger.error(ex);
            createDefaultConfigXml();
        } finally {
            if (configXml == null) {
                createDefaultConfigXml();
            }
        }
        urlsMRU.read(configXml.getChildOrNew("files").getChildOrNew("recent"));
        initSystemProperties();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass emulatorContext;
	public DeviceEntry defaultDevice;
public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass getChildOrNew(String o0){ return null; }
	public MyHelperClass read(MyHelperClass o0){ return null; }
	public MyHelperClass elements(){ return null; }
	public MyHelperClass error(IOException o0){ return null; }}

class DeviceEntry {

public MyHelperClass getFileName(){ return null; }
	public MyHelperClass setFileName(String o0){ return null; }
	public MyHelperClass canRemove(){ return null; }}

class EmulatorContext {

}
