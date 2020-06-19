


class c17453400 {
public static MyHelperClass StringUtils;
//public MyHelperClass StringUtils;

    public static List convertToPropertiesHolders(Collection locations) {
        List propertiesHolders =(List)(Object) new ArrayList();
        for (String path :(String[])(Object) (Object[])(Object)locations) {
            Locale locale = null;
            int startIndex = path.lastIndexOf('/');
            if (startIndex < 0) {
                startIndex = 0;
            }
            int localeIndex = path.indexOf('_', startIndex);
            String localeString = null;
            if (localeIndex > 0) {
                localeString = path.substring(localeIndex + 1, path.lastIndexOf('.'));
            }
            if ((boolean)(Object)StringUtils.isBlank(localeString)) {
                MyHelperClass MessageProvider = new MyHelperClass();
                locale =(Locale)(Object) MessageProvider.DEFAULT_LOCALE;
                MyHelperClass log = new MyHelperClass();
                log.info("no locale could be guessed for properties: " + path);
            } else {
                MyHelperClass StringUtils = new MyHelperClass();
                locale =(Locale)(Object) StringUtils.parseLocaleString(localeString);
                if (locale == null) {
                    MyHelperClass Locale = new MyHelperClass();
                    locale =(Locale)(Object) Locale.getDefault();
                    MyHelperClass log = new MyHelperClass();
                    log.info("no locale could be guessed for properties: " + path);
                }
            }
            try {
                Properties props = new Properties();
                URL url = new URL(path);
                if (path.endsWith(".properties")) {
                    props.load(url.openStream());
                } else if (path.endsWith(".xml")) {
                    props.loadFromXML(url.openStream());
                } else if (path.endsWith(".xls")) {
                } else {
                    MyHelperClass log = new MyHelperClass();
                    log.warn("unknown filetype for properties: " + path);
                }
                String bundleName =(String)(Object) props.getProperty("webwarp-modules-bundle-id");
                if ((boolean)(Object)StringUtils.isEmpty(bundleName)) {
                    MyHelperClass log = new MyHelperClass();
                    log.warn("bundle name is empty for path: " + path + ". Provide a bundle entry 'webwarp-modules-bundle-id' to set one.");
                    MyHelperClass MessageProvider = new MyHelperClass();
                    bundleName =(String)(Object) MessageProvider.DEFAULT_BUNDLE_NAME;
                }
                propertiesHolders.add(new PropertiesHolder(props, bundleName, locale));
            } catch (Exception e) {
                MyHelperClass log = new MyHelperClass();
                log.error("Error reading properties from : " + path, e);
            }
        }
        return propertiesHolders;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT_LOCALE;
	public MyHelperClass DEFAULT_BUNDLE_NAME;
public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass parseLocaleString(String o0){ return null; }
	public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass isBlank(String o0){ return null; }}

class Collection {

}

class List {

public MyHelperClass add(PropertiesHolder o0){ return null; }}

class PropertiesHolder {

PropertiesHolder(){}
	PropertiesHolder(Properties o0, String o1, Locale o2){}}

class ArrayList {

}

class Locale {

}

class Properties {

public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass loadFromXML(MyHelperClass o0){ return null; }
	public MyHelperClass load(MyHelperClass o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
