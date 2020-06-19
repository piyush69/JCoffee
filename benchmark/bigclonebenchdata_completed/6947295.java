


class c6947295 {
public MyHelperClass logException(Exception o0){ return null; }

    public void configureLogging() {
        try {
            PreferenceStore preferences = new PreferenceStore();
            MyHelperClass Platform = new MyHelperClass();
            IExtensionRegistry registry =(IExtensionRegistry)(Object) Platform.getExtensionRegistry();
            MyHelperClass CorePlugin = new MyHelperClass();
            IExtensionPoint extensionPoint =(IExtensionPoint)(Object) registry.getExtensionPoint(CorePlugin.LOGGER_PREFERENCES_EXTENSION_POINT);
            IConfigurationElement[] members =(IConfigurationElement[])(Object) extensionPoint.getConfigurationElements();
            for (int i = 0; i < members.length; i++) {
                IConfigurationElement element = members[i];
                if (element.getName().equals("logger")) {
                    if (element.getAttribute("defaultValue") != null) {
                        String[] item =(String[])(Object) element.getAttribute("name").split(";");
                        for (int x = 0; x < item.length; x++) preferences.setDefault("log4j.logger." + item[x],(String)(Object) element.getAttribute("defaultValue"));
                    }
                }
            }
            try {
//                MyHelperClass CorePlugin = new MyHelperClass();
                URL url =(URL)(Object) CorePlugin.getDefault().getBundle().getResource("log4j.properties");
                Properties properties = new Properties();
                properties.load(url.openStream());
                for (Iterator iter =(Iterator)(Object) properties.keySet().iterator();(boolean)(Object) iter.hasNext(); ) {
                    String key = (String)(String)(Object) iter.next();
                    preferences.setDefault(key, (String)(String)(Object) properties.get(key));
                }
//                MyHelperClass CorePlugin = new MyHelperClass();
                File file =(File)(Object) CorePlugin.getDefault().getStateLocation().append("log4j.properties").toFile();
                if ((boolean)(Object)file.exists()) preferences.load(new FileInputStream(file));
            } catch (Exception e) {
//                MyHelperClass CorePlugin = new MyHelperClass();
                CorePlugin.logException(e);
            }
            Properties properties = new Properties();
            String[] names =(String[])(Object) preferences.preferenceNames();
            for (int i = 0; i < names.length; i++) properties.put(names[i], preferences.getString(names[i]));
            MyHelperClass PropertyConfigurator = new MyHelperClass();
            PropertyConfigurator.configure(properties);
        } catch (Exception e) {
            MyHelperClass BasicConfigurator = new MyHelperClass();
            BasicConfigurator.configure();
            logException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOGGER_PREFERENCES_EXTENSION_POINT;
public MyHelperClass logException(Exception o0){ return null; }
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass getBundle(){ return null; }
	public MyHelperClass configure(){ return null; }
	public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass getExtensionRegistry(){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass getStateLocation(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass configure(Properties o0){ return null; }
	public MyHelperClass toFile(){ return null; }}

class PreferenceStore {

public MyHelperClass load(FileInputStream o0){ return null; }
	public MyHelperClass setDefault(String o0, String o1){ return null; }
	public MyHelperClass preferenceNames(){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class IExtensionRegistry {

public MyHelperClass getExtensionPoint(MyHelperClass o0){ return null; }}

class IExtensionPoint {

public MyHelperClass getConfigurationElements(){ return null; }}

class IConfigurationElement {

public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Properties {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }
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
