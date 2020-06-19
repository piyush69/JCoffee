import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13216961 {
public MyHelperClass JFileChooser;
	public MyHelperClass IOUtils;
	public MyHelperClass Message;
	public MyHelperClass DeviceImpl;

        public void actionPerformed(ActionEvent ev)  throws Throwable {
            MyHelperClass fileChooser = new MyHelperClass();
            if (fileChooser == null) {
//                MyHelperClass fileChooser = new MyHelperClass();
                fileChooser =(MyHelperClass)(Object) new JFileChooser();
                ExtensionFileFilter fileFilter = new ExtensionFileFilter("Device profile (*.jar, *.zip)");
                fileFilter.addExtension("jar");
                fileFilter.addExtension("zip");
//                MyHelperClass fileChooser = new MyHelperClass();
                fileChooser.setFileFilter(fileFilter);
            }
//            MyHelperClass fileChooser = new MyHelperClass();
            if (fileChooser.showOpenDialog(SwingSelectDevicePanel.this) == JFileChooser.APPROVE_OPTION) {
                String manifestDeviceName = null;
                URL[] urls = new URL[1];
                ArrayList descriptorEntries = new ArrayList();
                JarFile jar = null;
                try {
//                    MyHelperClass fileChooser = new MyHelperClass();
                    jar = new JarFile(fileChooser.getSelectedFile());
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
//                    MyHelperClass fileChooser = new MyHelperClass();
                    urls[0] = fileChooser.getSelectedFile().toURL();
                } catch (IOException e) {
//                    MyHelperClass fileChooser = new MyHelperClass();
                    Message.error("Error reading file: " + fileChooser.getSelectedFile().getName() + ", " + Message.getCauseMessage(e), e);
                    return;
                } finally {
                    if (jar != null) {
                        try {
                            jar.close();
                        } catch (IOException ignore) {
                        }
                    }
                }
                if (descriptorEntries.size() == 0) {
//                    MyHelperClass fileChooser = new MyHelperClass();
                    Message.error("Cannot find any device profile in file: " + fileChooser.getSelectedFile().getName());
                    return;
                }
                if (descriptorEntries.size() > 1) {
                    manifestDeviceName = null;
                }
                MyHelperClass Common = new MyHelperClass();
                ClassLoader classLoader =(ClassLoader)(Object) Common.createExtensionsClassLoader(urls);
                HashMap devices = new HashMap();
                for (Iterator it = descriptorEntries.iterator(); it.hasNext(); ) {
                    String entryName = (String) it.next();
                    try {
                        MyHelperClass emulatorContext = new MyHelperClass();
                        devices.put(entryName, DeviceImpl.create(emulatorContext, classLoader, entryName, J2SEDevice.class));
                    } catch (IOException e) {
                        MyHelperClass Message = new MyHelperClass();
                        Message.error("Error parsing device profile, " + Message.getCauseMessage(e), e);
                        return;
                    }
                }
                MyHelperClass lsDevicesModel = new MyHelperClass();
                for (Enumeration en =(Enumeration)(Object) lsDevicesModel.elements(); en.hasMoreElements(); ) {
                    DeviceEntry entry = (DeviceEntry) en.nextElement();
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
                    File deviceFile = new File(Config.getConfigPath(), fileChooser.getSelectedFile().getName());
                    if (deviceFile.exists()) {
//                        MyHelperClass Config = new MyHelperClass();
                        deviceFile = File.createTempFile("device", ".jar",(File)(Object) Config.getConfigPath());
                    }
//                    MyHelperClass fileChooser = new MyHelperClass();
                    IOUtils.copyFile(fileChooser.getSelectedFile(), deviceFile);
                    DeviceEntry entry = null;
                    for (Iterator it = devices.keySet().iterator(); it.hasNext(); ) {
                        String descriptorLocation = (String) it.next();
                        Device device = (Device) devices.get(descriptorLocation);
                        if (manifestDeviceName != null) {
                            entry = new DeviceEntry(manifestDeviceName, deviceFile.getName(), descriptorLocation, false);
                        } else {
                            entry = new DeviceEntry((String)(Object)device.getName(), deviceFile.getName(), descriptorLocation, false);
                        }
//                        MyHelperClass lsDevicesModel = new MyHelperClass();
                        lsDevicesModel.addElement(entry);
//                        MyHelperClass Config = new MyHelperClass();
                        Config.addDeviceEntry(entry);
                    }
                    MyHelperClass lsDevices = new MyHelperClass();
                    lsDevices.setSelectedValue(entry, true);
                } catch (IOException e) {
                    MyHelperClass Message = new MyHelperClass();
                    Message.error("Error adding device profile, " + Message.getCauseMessage(e), e);
                    return;
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass APPROVE_OPTION;
public MyHelperClass getConfigPath(){ return null; }
	public MyHelperClass create(MyHelperClass o0, ClassLoader o1, String o2, Class<J2SEDevice o3){ return null; }
	public MyHelperClass addDeviceEntry(DeviceEntry o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass createExtensionsClassLoader(URL[] o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass copyFile(MyHelperClass o0, File o1){ return null; }
	public MyHelperClass setSelectedValue(DeviceEntry o0, boolean o1){ return null; }
	public MyHelperClass elements(){ return null; }
	public MyHelperClass setFileFilter(ExtensionFileFilter o0){ return null; }
	public MyHelperClass getCauseMessage(IOException o0){ return null; }
	public MyHelperClass addElement(DeviceEntry o0){ return null; }
	public MyHelperClass toURL(){ return null; }}

class ActionEvent {

}

class ExtensionFileFilter {

ExtensionFileFilter(String o0){}
	ExtensionFileFilter(){}
	public MyHelperClass addExtension(String o0){ return null; }}

class SwingSelectDevicePanel {

}

class JarFile {

JarFile(MyHelperClass o0){}
	JarFile(){}
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
	public MyHelperClass getDescriptorLocation(){ return null; }}

class Device {

public MyHelperClass getName(){ return null; }}

class JFileChooser {

}

class J2SEDevice {

}
