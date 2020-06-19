


class c5318443 {
public MyHelperClass Platform;
	public MyHelperClass preferences;

    public void init(IWorkbench workbench) {
        MyHelperClass CorePlugin = new MyHelperClass();
        preferences.setFilename(CorePlugin.getDefault().getStateLocation().append("log4j.properties").toOSString());
        MyHelperClass registry = new MyHelperClass();
        registry = Platform.getExtensionRegistry();
        MyHelperClass extensionPoint = new MyHelperClass();
        extensionPoint = registry.getExtensionPoint(CorePlugin.LOGGER_PREFERENCES_EXTENSION_POINT);
//        MyHelperClass extensionPoint = new MyHelperClass();
        IConfigurationElement[] members =(IConfigurationElement[])(Object) extensionPoint.getConfigurationElements();
        for (int i = 0; i < members.length; i++) {
            IConfigurationElement element = members[i];
            if (element.getName().equals("logger")) {
                if (element.getAttribute("defaultValue") != null) {
                    String[] item =(String[])(Object) element.getAttribute("name").split(";");
                    MyHelperClass preferences = new MyHelperClass();
                    for (int x = 0; x < item.length; x++) preferences.setDefault("log4j.logger." + item[x],(String)(Object) element.getAttribute("defaultValue"));
                }
            }
        }
        try {
//            MyHelperClass CorePlugin = new MyHelperClass();
            URL url =(URL)(Object) CorePlugin.getDefault().getBundle().getResource("log4j.properties");
            Properties properties = new Properties();
            properties.load(url.openStream());
            for (Iterator iter =(Iterator)(Object) properties.keySet().iterator();(boolean)(Object) iter.hasNext(); ) {
                String key = (String)(String)(Object) iter.next();
                MyHelperClass preferences = new MyHelperClass();
                preferences.setDefault(key, (String)(String)(Object) properties.get(key));
            }
//            MyHelperClass CorePlugin = new MyHelperClass();
            File file =(File)(Object) CorePlugin.getDefault().getStateLocation().append("log4j.properties").toFile();
            MyHelperClass preferences = new MyHelperClass();
            if ((boolean)(Object)file.exists()) preferences.load(new FileInputStream(file));
        } catch (Exception e) {
//            MyHelperClass CorePlugin = new MyHelperClass();
            CorePlugin.logException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOGGER_PREFERENCES_EXTENSION_POINT;
public MyHelperClass logException(Exception o0){ return null; }
	public MyHelperClass setDefault(String o0, String o1){ return null; }
	public MyHelperClass getBundle(){ return null; }
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass load(FileInputStream o0){ return null; }
	public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass getConfigurationElements(){ return null; }
	public MyHelperClass getStateLocation(){ return null; }
	public MyHelperClass getExtensionRegistry(){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass getExtensionPoint(MyHelperClass o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass toOSString(){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass setFilename(MyHelperClass o0){ return null; }
	public MyHelperClass toFile(){ return null; }}

class IWorkbench {

}

class IConfigurationElement {

public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Properties {

public MyHelperClass load(MyHelperClass o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class File {

public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
