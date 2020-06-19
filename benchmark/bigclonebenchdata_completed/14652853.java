import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14652853 {
public static MyHelperClass createHtml(File o0, DeviceImpl o1, String o2, File o3, File o4, File o5){ return null; }
public static MyHelperClass DeviceImpl;
	public static MyHelperClass IOUtils;
	public static MyHelperClass usage(){ return null; }
//	public MyHelperClass createHtml(File o0, DeviceImpl o1, String o2, File o3, File o4, File o5){ return null; }
	public static MyHelperClass createMidlet(URL o0, File o1){ return null; }
//public MyHelperClass DeviceImpl;
//	public MyHelperClass IOUtils;
//	public MyHelperClass createMidlet(URL o0, File o1){ return null; }
//	public MyHelperClass usage(){ return null; }

    public static void main(String args[])  throws Throwable {
        String midletClass = null;
        ;
        File appletInputFile = null;
        File deviceInputFile = null;
        File midletInputFile = null;
        File htmlOutputFile = null;
        File appletOutputFile = null;
        File deviceOutputFile = null;
        File midletOutputFile = null;
        List params = new ArrayList();
        for (int i = 0; i < args.length; i++) {
            params.add(args[i]);
        }
        Iterator argsIterator = params.iterator();
        while (argsIterator.hasNext()) {
            String arg = (String) argsIterator.next();
            argsIterator.remove();
            if ((arg.equals("--help")) || (arg.equals("-help"))) {
                System.out.println(usage());
                System.exit(0);
            } else if (arg.equals("--midletClass")) {
                midletClass = (String) argsIterator.next();
                argsIterator.remove();
            } else if (arg.equals("--appletInput")) {
                appletInputFile = new File((String) argsIterator.next());
                argsIterator.remove();
            } else if (arg.equals("--deviceInput")) {
                deviceInputFile = new File((String) argsIterator.next());
                argsIterator.remove();
            } else if (arg.equals("--midletInput")) {
                midletInputFile = new File((String) argsIterator.next());
                argsIterator.remove();
            } else if (arg.equals("--htmlOutput")) {
                htmlOutputFile = new File((String) argsIterator.next());
                argsIterator.remove();
            } else if (arg.equals("--appletOutput")) {
                appletOutputFile = new File((String) argsIterator.next());
                argsIterator.remove();
            } else if (arg.equals("--deviceOutput")) {
                deviceOutputFile = new File((String) argsIterator.next());
                argsIterator.remove();
            } else if (arg.equals("--midletOutput")) {
                midletOutputFile = new File((String) argsIterator.next());
                argsIterator.remove();
            }
        }
        if (midletClass == null || appletInputFile == null || deviceInputFile == null || midletInputFile == null || htmlOutputFile == null || appletOutputFile == null || deviceOutputFile == null || midletOutputFile == null) {
            System.out.println(usage());
            System.exit(0);
        }
        try {
            DeviceImpl device = null;
            String descriptorLocation = null;
            JarFile jar = new JarFile(deviceInputFile);
            for (Enumeration en =(Enumeration)(Object) jar.entries(); en.hasMoreElements(); ) {
                String entry =(String)(Object) ((JarEntry) en.nextElement()).getName();
                if ((entry.toLowerCase().endsWith(".xml") || entry.toLowerCase().endsWith("device.txt")) && !entry.toLowerCase().startsWith("meta-inf")) {
                    descriptorLocation = entry;
                    break;
                }
            }
            if (descriptorLocation != null) {
                EmulatorContext context = new EmulatorContext() {

                    private DisplayComponent displayComponent =(DisplayComponent)(Object) new NoUiDisplayComponent();

                    private InputMethod inputMethod =(InputMethod)(Object) new J2SEInputMethod();

                    private DeviceDisplay deviceDisplay =(DeviceDisplay)(Object) new J2SEDeviceDisplay(this);

                    private FontManager fontManager =(FontManager)(Object) new J2SEFontManager();

                    private DeviceComponent deviceComponent =(DeviceComponent)(Object) new SwingDeviceComponent(true);

                    public DisplayComponent getDisplayComponent() {
                        return displayComponent;
                    }

                    public InputMethod getDeviceInputMethod() {
                        return inputMethod;
                    }

                    public DeviceDisplay getDeviceDisplay() {
                        return deviceDisplay;
                    }

                    public FontManager getDeviceFontManager() {
                        return fontManager;
                    }

                    public InputStream getResourceAsStream(String name) {
                        MyHelperClass MIDletBridge = new MyHelperClass();
                        return MIDletBridge.getCurrentMIDlet().getClass().getResourceAsStream(name);
                    }

                    public DeviceComponent getDeviceComponent() {
                        return deviceComponent;
                    }
                };
                URL[] urls = new URL[1];
                urls[0] = deviceInputFile.toURI().toURL();
                ClassLoader classLoader =(ClassLoader)(Object) new ExtensionsClassLoader(urls, urls.getClass().getClassLoader());
                device =(DeviceImpl)(Object) DeviceImpl.create(context, classLoader, descriptorLocation,(J2SEDevice)(Object) J2SEDevice.class);
            }
            if (device == null) {
                System.out.println("Error parsing device package: " + descriptorLocation);
                System.exit(0);
            }
            createHtml(htmlOutputFile, device, midletClass, midletOutputFile, appletOutputFile, deviceOutputFile);
            createMidlet(midletInputFile.toURI().toURL(), midletOutputFile);
            IOUtils.copyFile(appletInputFile, appletOutputFile);
            IOUtils.copyFile(deviceInputFile, deviceOutputFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.exit(0);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass getCurrentMIDlet(){ return null; }
	public MyHelperClass create(EmulatorContext o0, ClassLoader o1, String o2, J2SEDevice o3){ return null; }}

class DeviceImpl {

}

class JarFile {

JarFile(){}
	JarFile(File o0){}
	public MyHelperClass entries(){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }}

class EmulatorContext {

}

class ExtensionsClassLoader {

ExtensionsClassLoader(URL[] o0, ClassLoader o1){}
	ExtensionsClassLoader(){}}

class J2SEDevice {

}

class DisplayComponent {

}

class InputMethod {

}

class DeviceDisplay {

}

class FontManager {

}

class DeviceComponent {

}

class NoUiDisplayComponent {

}

class J2SEInputMethod {

}

class J2SEDeviceDisplay {

J2SEDeviceDisplay(){}
	J2SEDeviceDisplay( EmulatorContext o0){}}

class J2SEFontManager {

}

class SwingDeviceComponent {

SwingDeviceComponent(boolean o0){}
	SwingDeviceComponent(){}}
