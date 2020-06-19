import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13574318 {
public MyHelperClass jad;
public MyHelperClass Logger;
	public MyHelperClass DeviceFactory;
	public MyHelperClass AppletProducer;
	public MyHelperClass IOUtils;
	public MyHelperClass Config;
	public MyHelperClass allowOverride(File o0){ return null; }

        public void actionPerformed(ActionEvent e)  throws Throwable {
            MyHelperClass saveForWebChooser = new MyHelperClass();
            if (saveForWebChooser == null) {
                ExtensionFileFilter fileFilter = new ExtensionFileFilter("HTML files");
                fileFilter.addExtension("html");
//                MyHelperClass saveForWebChooser = new MyHelperClass();
                saveForWebChooser =(MyHelperClass)(Object) new JFileChooser();
//                MyHelperClass saveForWebChooser = new MyHelperClass();
                saveForWebChooser.setFileFilter(fileFilter);
//                MyHelperClass saveForWebChooser = new MyHelperClass();
                saveForWebChooser.setDialogTitle("Save for Web...");
                MyHelperClass Config = new MyHelperClass();
                saveForWebChooser.setCurrentDirectory(new File((String)(Object)Config.getRecentDirectory("recentSaveForWebDirectory")));
            }
//            MyHelperClass saveForWebChooser = new MyHelperClass();
            if (saveForWebChooser.showSaveDialog(Main.this) == JFileChooser.APPROVE_OPTION) {
//                MyHelperClass saveForWebChooser = new MyHelperClass();
                Config.setRecentDirectory("recentSaveForWebDirectory", saveForWebChooser.getCurrentDirectory().getAbsolutePath());
//                MyHelperClass saveForWebChooser = new MyHelperClass();
                File pathFile =(File)(Object) saveForWebChooser.getSelectedFile().getParentFile();
//                MyHelperClass saveForWebChooser = new MyHelperClass();
                String name =(String)(Object) saveForWebChooser.getSelectedFile().getName();
                if (!name.toLowerCase().endsWith(".html") && name.indexOf('.') == -1) {
                    name = name + ".html";
                }
                MyHelperClass MIDletClassLoader = new MyHelperClass();
                String resource =(String)(Object) MIDletClassLoader.getClassResourceName(this.getClass().getName());
                URL url = this.getClass().getClassLoader().getResource(resource);
                String path = url.getPath();
                int prefix = path.indexOf(':');
                String mainJarFileName = path.substring(prefix + 1, path.length() - resource.length());
                File appletJarDir = new File(new File(mainJarFileName).getParent(), "lib");
                File appletJarFile = new File(appletJarDir, "microemu-javase-applet.jar");
                if (!appletJarFile.exists()) {
                    appletJarFile = null;
                }
                if (appletJarFile == null) {
                }
                if (appletJarFile == null) {
                    ExtensionFileFilter fileFilter = new ExtensionFileFilter("JAR packages");
                    fileFilter.addExtension("jar");
                    JFileChooser appletChooser = new JFileChooser();
                    appletChooser.setFileFilter(fileFilter);
                    appletChooser.setDialogTitle("Select MicroEmulator applet jar package...");
                    MyHelperClass Config = new MyHelperClass();
                    appletChooser.setCurrentDirectory(new File((String)(Object)Config.getRecentDirectory("recentAppletJarDirectory")));
                    MyHelperClass JFileChooser = new MyHelperClass();
                    if (appletChooser.showOpenDialog(Main.this) == JFileChooser.APPROVE_OPTION) {
//                        MyHelperClass Config = new MyHelperClass();
                        Config.setRecentDirectory("recentAppletJarDirectory", appletChooser.getCurrentDirectory().getAbsolutePath());
                        appletJarFile =(File)(Object) appletChooser.getSelectedFile();
                    } else {
                        return;
                    }
                }
                JadMidletEntry jadMidletEntry;
                Iterator it =(Iterator)(Object) jad.getMidletEntries().iterator();
                if (it.hasNext()) {
                    jadMidletEntry = (JadMidletEntry) it.next();
                } else {
                    MyHelperClass Message = new MyHelperClass();
                    Message.error("MIDlet Suite has no entries");
                    return;
                }
                String midletInput =(String)(Object) jad.getJarURL();
                MyHelperClass selectDevicePanel = new MyHelperClass();
                DeviceEntry deviceInput =(DeviceEntry)(Object) selectDevicePanel.getSelectedDeviceEntry();
                MyHelperClass DeviceImpl = new MyHelperClass();
                if (deviceInput != null && deviceInput.getDescriptorLocation().equals(DeviceImpl.DEFAULT_LOCATION)) {
                    deviceInput = null;
                }
                File htmlOutputFile = new File(pathFile, name);
                if (!(Boolean)(Object)allowOverride(htmlOutputFile)) {
                    return;
                }
                File appletPackageOutputFile = new File(pathFile, "microemu-javase-applet.jar");
                if (!(Boolean)(Object)allowOverride(appletPackageOutputFile)) {
                    return;
                }
                File midletOutputFile = new File(pathFile, midletInput.substring(midletInput.lastIndexOf("/") + 1));
                if (!(Boolean)(Object)allowOverride(midletOutputFile)) {
                    return;
                }
                File deviceOutputFile = null;
                String deviceDescriptorLocation = null;
                if (deviceInput != null) {
                    deviceOutputFile = new File((String)(Object)pathFile,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) deviceInput.getFileName());
                    if (!(Boolean)(Object)allowOverride(deviceOutputFile)) {
                        return;
                    }
                    deviceDescriptorLocation =(String)(Object) deviceInput.getDescriptorLocation();
                }
                try {
                    AppletProducer.createHtml(htmlOutputFile, (DeviceImpl)(DeviceImpl)(Object) DeviceFactory.getDevice(), jadMidletEntry.getClassName(), midletOutputFile, appletPackageOutputFile, deviceOutputFile);
                    AppletProducer.createMidlet(new URL(midletInput), midletOutputFile);
                    IOUtils.copyFile(appletJarFile, appletPackageOutputFile);
                    if (deviceInput != null) {
                        IOUtils.copyFile(new File((String)(Object)Config.getConfigPath(),(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) deviceInput.getFileName()), deviceOutputFile);
                    }
                } catch (IOException ex) {
                    Logger.error(ex);
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT_LOCATION;
	public static MyHelperClass APPROVE_OPTION;
public MyHelperClass getCurrentDirectory(){ return null; }
	public MyHelperClass setDialogTitle(String o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass createHtml(File o0, DeviceImpl o1, MyHelperClass o2, File o3, File o4, File o5){ return null; }
	public MyHelperClass setCurrentDirectory(File o0){ return null; }
	public MyHelperClass getDevice(){ return null; }
	public MyHelperClass setFileFilter(ExtensionFileFilter o0){ return null; }
	public MyHelperClass getRecentDirectory(String o0){ return null; }
	public MyHelperClass setRecentDirectory(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getConfigPath(){ return null; }
	public MyHelperClass getClassResourceName(String o0){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass createMidlet(URL o0, File o1){ return null; }
	public MyHelperClass getJarURL(){ return null; }
	public MyHelperClass getSelectedDeviceEntry(){ return null; }
	public MyHelperClass getMidletEntries(){ return null; }}

class ActionEvent {

}

class ExtensionFileFilter {

ExtensionFileFilter(String o0){}
	ExtensionFileFilter(){}
	public MyHelperClass addExtension(String o0){ return null; }}

class Main {

}

class JFileChooser {
public MyHelperClass APPROVE_OPTION;
public MyHelperClass getCurrentDirectory(){ return null; }
	public MyHelperClass setCurrentDirectory(File o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass setDialogTitle(String o0){ return null; }
	public MyHelperClass setFileFilter(ExtensionFileFilter o0){ return null; }}

class JadMidletEntry {

public MyHelperClass getClassName(){ return null; }}

class DeviceEntry {

public MyHelperClass getDescriptorLocation(){ return null; }
	public MyHelperClass getFileName(){ return null; }}

class DeviceImpl {

}
