


class c9686721 {
public static MyHelperClass compositeXMLRoot(List o0){ return null; }
//public MyHelperClass compositeXMLRoot(List o0){ return null; }

    public static void parseConfigV2(List rootList, InputStream is, ServletContext context, List configFileList) throws Exception {
        URL configUrl =(URL)(Object) CompositePageUtil.class.getResource("/cuttleConfigurationV2.xml");
        if (configUrl == null) configUrl =(URL)(Object) CompositePageUtil.class.getClassLoader().getResource("/cuttleConfigurationV2.xml");
        URL dtdUrl =(URL)(Object) CompositePageUtil.class.getResource("/dtd/cuttleConfiguration.dtd");
        if (dtdUrl == null) dtdUrl =(URL)(Object) CompositePageUtil.class.getClassLoader().getResource("/dtd/cuttleConfiguration.dtd");
        MyHelperClass DigesterLoader = new MyHelperClass();
        Digester digester =(Digester)(Object) DigesterLoader.createDigester(configUrl);
        digester.setValidating(false);
        digester.register("-//Cuttle MVC Framework//DTD Cuttle Configuration 1.0//EN", dtdUrl.toString());
        XMLCuttleConfiguration cuttleConfiguration = (XMLCuttleConfiguration)(XMLCuttleConfiguration)(Object) digester.parse(is);
        MyHelperClass ConfigureDigester = new MyHelperClass();
        ConfigureDigester.setXmlCuttleConfiguration(cuttleConfiguration);
        if (configFileList != null) {
            for (int i = 0; i < (int)(Object)configFileList.size(); i++) {
                String file = (String)(String)(Object) configFileList.get(i);
                URL url2 =(URL)(Object) CompositePageUtil.class.getResource(file);
                if (url2 == null) url2 =(URL)(Object) CompositePageUtil.class.getClassLoader().getResource(file);
                if (url2 == null) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.error("file path:" + file + " not found!");
                }
//                MyHelperClass ConfigureDigester = new MyHelperClass();
                XMLRoot root = (XMLRoot)(XMLRoot)(Object) ConfigureDigester.parseXMLToObject(url2.openStream());
                rootList.add(root);
            }
        } else {
            for (int i = 0; i < (int)(Object)cuttleConfiguration.getActionConfigs().size(); i++) {
                XMLActionConfig config = (XMLActionConfig)(XMLActionConfig)(Object) cuttleConfiguration.getActionConfigs().get(i);
                URL url2 =(URL)(Object) context.getResource(config.getResource());
                if (url2 == null) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.error("file path:" + config.getResource() + " not found!");
                }
//                MyHelperClass ConfigureDigester = new MyHelperClass();
                XMLRoot root = (XMLRoot)(XMLRoot)(Object) ConfigureDigester.parseXMLToObject(url2.openStream());
                rootList.add(root);
            }
        }
        compositeXMLRoot(rootList);
//        MyHelperClass ConfigureDigester = new MyHelperClass();
        XMLCuttleConfiguration config =(XMLCuttleConfiguration)(Object) ConfigureDigester.getXmlCuttleConfiguration();
        if (config != null) {
            List processUnits =(List)(Object) config.getProcessUnits();
            if (processUnits != null) {
                for (int i = 0; i < (int)(Object)processUnits.size(); i++) {
                    XMLProcessUnit processUnit = (XMLProcessUnit)(XMLProcessUnit)(Object) processUnits.get(i);
                    if (processUnit.getSpringMapping() == null || processUnit.getSpringMapping().equals("")) {
                        Class businessClass = Class.forName((String)(Object)processUnit.getClazz());
                        Object business = businessClass.newInstance();
//                        MyHelperClass ConfigureDigester = new MyHelperClass();
                        ConfigureDigester.addObjectToPool(business);
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass getXmlCuttleConfiguration(){ return null; }
	public MyHelperClass parseXMLToObject(MyHelperClass o0){ return null; }
	public MyHelperClass createDigester(URL o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass addObjectToPool(Object o0){ return null; }
	public MyHelperClass setXmlCuttleConfiguration(XMLCuttleConfiguration o0){ return null; }}

class List {

public MyHelperClass add(XMLRoot o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class CompositePageUtil {

}

class Digester {

public MyHelperClass parse(InputStream o0){ return null; }
	public MyHelperClass setValidating(boolean o0){ return null; }
	public MyHelperClass register(String o0, String o1){ return null; }}

class XMLCuttleConfiguration {

public MyHelperClass getProcessUnits(){ return null; }
	public MyHelperClass getActionConfigs(){ return null; }}

class XMLRoot {

}

class XMLActionConfig {

public MyHelperClass getResource(){ return null; }}

class XMLProcessUnit {

public MyHelperClass getSpringMapping(){ return null; }
	public MyHelperClass getClazz(){ return null; }}

class ServletContext {

public MyHelperClass getResource(MyHelperClass o0){ return null; }}
