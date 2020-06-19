


class c9686722 {
public static MyHelperClass parseConfigV2(List o0, InputStream o1, ServletContext o2, List o3){ return null; }
//public MyHelperClass parseConfigV2(List o0, InputStream o1, ServletContext o2, List o3){ return null; }

    public static void initConfigurationV2(String cuttleConfiguration, ServletContext context, List configFileList) throws Exception {
        MyHelperClass ConfigureDigester = new MyHelperClass();
        ConfigureDigester.clearMap();
        List rootList =(List)(Object) new ArrayList();
        InputStream is = null;
        if (cuttleConfiguration == null) {
            URL url =(URL)(Object) CompositePageUtil.class.getResource("/cuttle.xml");
            if (url == null) url =(URL)(Object) CompositePageUtil.class.getClassLoader().getResource("/cuttle.xml");
            is =(InputStream)(Object) url.openStream();
        } else {
            is =(InputStream)(Object) context.getResourceAsStream(cuttleConfiguration);
        }
        parseConfigV2(rootList, is, context, configFileList);
//        MyHelperClass ConfigureDigester = new MyHelperClass();
        if (ConfigureDigester.getXmlCuttleConfiguration() != null && ConfigureDigester.getXmlCuttleConfiguration().getPlugins() != null) {
//            MyHelperClass ConfigureDigester = new MyHelperClass();
            for (int i = 0; i < (int)(Object)ConfigureDigester.getXmlCuttleConfiguration().getPlugins().size(); i++) {
//                MyHelperClass ConfigureDigester = new MyHelperClass();
                XMLPlugin plugin = (XMLPlugin)(XMLPlugin)(Object) ConfigureDigester.getXmlCuttleConfiguration().getPlugins().get(i);
                if (plugin.getConfigurePlugable() != null && !plugin.getConfigurePlugable().equals("")) {
                    Class pluginable = Class.forName((String)(Object)plugin.getConfigurePlugable());
                    ConfigurePlugable pluginableObj = (ConfigurePlugable) pluginable.newInstance();
                    pluginableObj.initConfiguration(plugin.getConfigurationPath(), context);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass getXmlCuttleConfiguration(){ return null; }
	public MyHelperClass clearMap(){ return null; }
	public MyHelperClass getPlugins(){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class List {

}

class ArrayList {

}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class CompositePageUtil {

}

class XMLPlugin {

public MyHelperClass getConfigurePlugable(){ return null; }
	public MyHelperClass getConfigurationPath(){ return null; }}

class ConfigurePlugable {

public MyHelperClass initConfiguration(MyHelperClass o0, ServletContext o1){ return null; }}

class ServletContext {

public MyHelperClass getResourceAsStream(String o0){ return null; }}
