


class c18778239 {
public MyHelperClass PropertiesHolder;
	public MyHelperClass PropertiesConfigurationLoader;
public MyHelperClass initDefaultSettings(){ return null; }

    public void init() {
        MyHelperClass XPontusConstantsIF = new MyHelperClass();
        File[] configsDirectories = {(File)(Object) XPontusConstantsIF.XPONTUS_PLUGINS_DATA_DIR,(File)(Object) XPontusConstantsIF.XPONTUS_PREFERENCES_DIR,(File)(Object) XPontusConstantsIF.XPONTUS_DATABASE_CONFIG_DIR,(File)(Object) XPontusConstantsIF.XPONTUS_PLUGINS_DIR,(File)(Object) XPontusConstantsIF.XPONTUS_CACHE_DIR };
        for (int i = 0; i < configsDirectories.length; i++) {
            if (!(Boolean)(Object)configsDirectories[i].exists()) {
                configsDirectories[i].mkdirs();
            }
        }
        String[] locations = { "/net/sf/xpontus/configuration/editorPanel.properties", "/net/sf/xpontus/configuration/general.properties", "/net/sf/xpontus/configuration/mimetypes.properties" };
        try {
            for (String loc : locations) {
                MyHelperClass FilenameUtils = new MyHelperClass();
                String outName =(String)(Object) FilenameUtils.getName(loc);
//                MyHelperClass XPontusConstantsIF = new MyHelperClass();
                File output = new File(XPontusConstantsIF.XPONTUS_PREFERENCES_DIR, outName);
                if (!(Boolean)(Object)output.exists()) {
                    if (loc.equals(locations[0])) {
                        Properties hackProps = new Properties();
                        InputStream is =(InputStream)(Object) getClass().getResourceAsStream(loc);
                        hackProps.load(is);
                        MyHelperClass UIManager = new MyHelperClass();
                        Font hackFont =(Font)(Object) UIManager.getFont("EditorPane.font");
                        StrBuilder strFont = new StrBuilder();
                        strFont.append(hackFont.getFamily() + "," + hackFont.getStyle() + "," + hackFont.getSize());
                        hackProps.put("EditorPane.Font", strFont.toString());
                        OutputStream out =(OutputStream)(Object) new FileOutputStream(output);
                        hackProps.store(out, null);
                        out.close();
                        is.close();
                    } else {
                        InputStream is =(InputStream)(Object) getClass().getResourceAsStream(loc);
                        OutputStream out =(OutputStream)(Object) new FileOutputStream(output);
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(is, out);
                        out.close();
                        is.close();
                    }
                }
                if (!outName.equals("mimetypes.properties")) {
                    MyHelperClass PropertiesConfigurationLoader = new MyHelperClass();
                    Properties m_properties =(Properties)(Object) PropertiesConfigurationLoader.load(output);
                    Iterator it =(Iterator)(Object) m_properties.keySet().iterator();
                    while ((boolean)(Object)it.hasNext()) {
                        Object m_key = it.next();
                        Object m_value = m_properties.get(m_key);
                        MyHelperClass XPontusConfig = new MyHelperClass();
                        XPontusConfig.put(m_key, m_value);
                    }
                }
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
        MyHelperClass XPontusConfigurationConstantsIF = new MyHelperClass();
        Properties m_props =(Properties)(Object) PropertiesConfigurationLoader.load((File)(Object)XPontusConfigurationConstantsIF.EDITOR_PREFERENCES_FILE);
        String[] f = m_props.get("EditorPane.Font").toString().split(",");
        String family = f[0].trim();
        String style1 = f[1].trim();
        int style = Integer.parseInt(style1);
        int size = Integer.parseInt(f[2].trim());
        Font m_font = new Font(family, style, size);
        MyHelperClass XPontusConfig = new MyHelperClass();
        XPontusConfig.put("EditorPane.Font", m_font);
        Map map =(Map)(Object) new HashMap();
        MyHelperClass ROLE = new MyHelperClass();
        map.put(ROLE, this);
        MyHelperClass XPontusSettings = new MyHelperClass();
        PropertiesHolder.registerProperty(XPontusSettings.KEY, map);
        MyHelperClass DockableContainerFactory = new MyHelperClass();
        DockableContainerFactory.setFactory(new XPontusDockableContainerFactory());
        MyHelperClass FileHistoryList = new MyHelperClass();
        FileHistoryList.init();
        initDefaultSettings();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass KEY;
	public MyHelperClass XPONTUS_PLUGINS_DATA_DIR;
	public MyHelperClass XPONTUS_PREFERENCES_DIR;
	public MyHelperClass XPONTUS_DATABASE_CONFIG_DIR;
	public MyHelperClass EDITOR_PREFERENCES_FILE;
	public MyHelperClass XPONTUS_PLUGINS_DIR;
	public MyHelperClass XPONTUS_CACHE_DIR;
public MyHelperClass put(String o0, Font o1){ return null; }
	public MyHelperClass getName(String o0){ return null; }
	public MyHelperClass getFont(String o0){ return null; }
	public MyHelperClass load(File o0){ return null; }
	public MyHelperClass setFactory(XPontusDockableContainerFactory o0){ return null; }
	public MyHelperClass registerProperty(MyHelperClass o0, Map o1){ return null; }
	public MyHelperClass init(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass put(Object o0, Object o1){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class Properties {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass store(OutputStream o0, Object o1){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass keySet(){ return null; }
	public MyHelperClass get(Object o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class Font {

Font(){}
	Font(String o0, int o1, int o2){}
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getStyle(){ return null; }
	public MyHelperClass getFamily(){ return null; }}

class StrBuilder {

public MyHelperClass append(String o0){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class Map {

public MyHelperClass put(MyHelperClass o0, c18778239 o1){ return null; }}

class HashMap {

}

class XPontusDockableContainerFactory {

}
