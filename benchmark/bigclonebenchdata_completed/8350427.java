import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8350427 {
public MyHelperClass Message;
	public MyHelperClass DeviceImpl;
	public MyHelperClass SWT;
	public MyHelperClass getShell(){ return null; }

        public void handleEvent(Event event)  throws Throwable {
            MyHelperClass fileDialog = new MyHelperClass();
            if (fileDialog == null) {
//                MyHelperClass fileDialog = new MyHelperClass();
                fileDialog = new FileDialog(getShell(), SWT.OPEN);
//                MyHelperClass fileDialog = new MyHelperClass();
                fileDialog.setText("Open device profile file...");
//                MyHelperClass fileDialog = new MyHelperClass();
                fileDialog.setFilterNames(new String[] { "Device profile (*.jar)" });
//                MyHelperClass fileDialog = new MyHelperClass();
                fileDialog.setFilterExtensions(new String[] { "*.jar" });
            }
//            MyHelperClass fileDialog = new MyHelperClass();
            fileDialog.open();
//            MyHelperClass fileDialog = new MyHelperClass();
            if (fileDialog.getFileName() != null) {
                File file;
                String manifestDeviceName = null;
                URL[] urls = new URL[1];
                ArrayList descriptorEntries = new ArrayList();
                try {
//                    MyHelperClass fileDialog = new MyHelperClass();
                    file = new File((String)(Object)fileDialog.getFilterPath(), fileDialog.getFileName());
                    JarFile jar = new JarFile(file);
                    Manifest manifest =(Manifest)(Object) jar.getManifest();
                    if (manifest != null) {
                        Attributes attrs =(Attributes)(Object) manifest.getMainAttributes();
                        manifestDeviceName =(String)(Object) attrs.getValue("Device-Name");
                    }
                    for (Enumeration en =(Enumeration)(Object) jar.entries(); en.hasMoreElements(); ) {
                        String entry =(String)(Object) ((JarEntry) en.nextElement()).getName();
                        if ((entry.toLowerCase().endsWith(".xml") || entry.toLowerCase().endsWith("device.txt")) && !entry.toLowerCase().startsWith("meta-inf")) {
                            descriptorEntries.add(entry);
                        }
                    }
                    jar.close();
                    urls[0] = file.toURL();
                } catch (IOException ex) {
//                    MyHelperClass fileDialog = new MyHelperClass();
                    Message.error("Error reading file: " + fileDialog.getFileName() + ", " + Message.getCauseMessage(ex), ex);
                    return;
                }
                if (descriptorEntries.size() == 0) {
//                    MyHelperClass fileDialog = new MyHelperClass();
                    Message.error("Cannot find any device profile in file: " + fileDialog.getFileName());
                    return;
                }
                if (descriptorEntries.size() > 1) {
                    manifestDeviceName = null;
                }
                MyHelperClass Common = new MyHelperClass();
                ClassLoader classLoader =(ClassLoader)(Object) Common.createExtensionsClassLoader(urls);
                HashMap devices = new HashMap();
                for (Iterator it = descriptorEntries.iterator(); it.hasNext(); ) {
                    JarEntry entry = (JarEntry) it.next();
                    try {
                        MyHelperClass emulatorContext = new MyHelperClass();
                        devices.put(entry.getName(), DeviceImpl.create(emulatorContext, classLoader, entry.getName(), SwtDevice.class));
                    } catch (IOException ex) {
                        MyHelperClass Message = new MyHelperClass();
                        Message.error("Error parsing device profile, " + Message.getCauseMessage(ex), ex);
                        return;
                    }
                }
                MyHelperClass deviceModel = new MyHelperClass();
                for (int i = 0; i < (int)(Object)deviceModel.size(); i++) {
//                    MyHelperClass deviceModel = new MyHelperClass();
                    DeviceEntry entry = (DeviceEntry)(DeviceEntry)(Object) deviceModel.elementAt(i);
                    if (devices.containsKey(entry.getDescriptorLocation())) {
                        devices.remove(entry.getDescriptorLocation());
                    }
                }
                if (devices.size() == 0) {
                    MyHelperClass Message = new MyHelperClass();
                    Message.info("Device profile already added");
                    return;
                }
                try {
                    MyHelperClass Config = new MyHelperClass();
                    File deviceFile = new File((String)(Object)Config.getConfigPath(), file.getName());
                    if (deviceFile.exists()) {
//                        MyHelperClass Config = new MyHelperClass();
                        deviceFile = File.createTempFile("device", ".jar",(File)(Object) Config.getConfigPath());
                    }
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copyFile(file, deviceFile);
                    DeviceEntry entry = null;
                    for (Iterator it = devices.keySet().iterator(); it.hasNext(); ) {
                        String descriptorLocation = (String) it.next();
                        Device device = (Device) devices.get(descriptorLocation);
                        if (manifestDeviceName != null) {
                            entry = new DeviceEntry(manifestDeviceName, deviceFile.getName(), descriptorLocation, false);
                        } else {
                            entry = new DeviceEntry((String)(Object)device.getName(), deviceFile.getName(), descriptorLocation, false);
                        }
//                        MyHelperClass deviceModel = new MyHelperClass();
                        deviceModel.addElement(entry);
//                        MyHelperClass deviceModel = new MyHelperClass();
                        for (int i = 0; i < (int)(Object)deviceModel.size(); i++) {
//                            MyHelperClass deviceModel = new MyHelperClass();
                            if ((DeviceEntry)(Object)deviceModel.elementAt(i) == entry) {
                                MyHelperClass lsDevices = new MyHelperClass();
                                lsDevices.add(entry.getName());
//                                MyHelperClass lsDevices = new MyHelperClass();
                                lsDevices.select(i);
                            }
                        }
//                        MyHelperClass Config = new MyHelperClass();
                        Config.addDeviceEntry(entry);
                    }
                    MyHelperClass lsDevicesListener = new MyHelperClass();
                    lsDevicesListener.widgetSelected(null);
                } catch (IOException ex) {
                    MyHelperClass Message = new MyHelperClass();
                    Message.error("Error adding device profile, " + Message.getCauseMessage(ex), ex);
                    return;
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OPEN;
public MyHelperClass create(MyHelperClass o0, ClassLoader o1, MyHelperClass o2, Class<SwtDevice o3){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getFileName(){ return null; }
	public MyHelperClass addElement(DeviceEntry o0){ return null; }
	public MyHelperClass open(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass getFilterPath(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass createExtensionsClassLoader(URL[] o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass widgetSelected(Object o0){ return null; }
	public MyHelperClass addDeviceEntry(DeviceEntry o0){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }
	public MyHelperClass select(int o0){ return null; }
	public MyHelperClass setFilterNames(String[] o0){ return null; }
	public MyHelperClass getConfigPath(){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass setFilterExtensions(String[] o0){ return null; }
	public MyHelperClass getCauseMessage(IOException o0){ return null; }}

class Event {

}

class JarFile {

JarFile(){}
	JarFile(File o0){}
	public MyHelperClass entries(){ return null; }
	public MyHelperClass getManifest(){ return null; }
	public MyHelperClass close(){ return null; }}

class Manifest {

public MyHelperClass getMainAttributes(){ return null; }}

class Attributes {

public MyHelperClass getValue(String o0){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }}

class DeviceEntry {

DeviceEntry(String o0, String o1, String o2, boolean o3){}
	DeviceEntry(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getDescriptorLocation(){ return null; }}

class Device {

public MyHelperClass getName(){ return null; }}

class FileDialog {

}

class SwtDevice {

}
