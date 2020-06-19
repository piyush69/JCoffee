


class c10000832 {
public static MyHelperClass ActionShowDocserviceConnectDialog;
	public static MyHelperClass ActionConnectToDocservice;
	public static MyHelperClass AUTOCONNECT_TRUE;
	public static MyHelperClass ActionShowExecutiveConnectDialog;
	public static MyHelperClass ActionConnectToExecutive;
	public static MyHelperClass Main;
//public MyHelperClass ActionConnectToDocservice;
	public static MyHelperClass DEFAULT_CONTEXT;
//	public MyHelperClass ActionConnectToExecutive;
	public static MyHelperClass CONTEXT;
	public static MyHelperClass File;
//	public MyHelperClass AUTOCONNECT_TRUE;
	public static MyHelperClass BASE_PLUGIN_NAME;
//	public MyHelperClass ActionShowDocserviceConnectDialog;
	public static MyHelperClass GateConstants;
	public static MyHelperClass JOptionPane;
	public static MyHelperClass MainFrame;
//	public MyHelperClass ActionShowExecutiveConnectDialog;
//	public MyHelperClass Main;
	public static MyHelperClass Gate;
	public static MyHelperClass loadAnnotationSchemas(MyHelperClass o0, boolean o1){ return null; }
	public static MyHelperClass loadPlugins(String o0, boolean o1){ return null; }
//public MyHelperClass DEFAULT_CONTEXT;
//	public MyHelperClass BASE_PLUGIN_NAME;
//	public MyHelperClass MainFrame;
//	public MyHelperClass Gate;
//	public MyHelperClass CONTEXT;
//	public MyHelperClass File;
//	public MyHelperClass GateConstants;
//	public MyHelperClass JOptionPane;
	public static MyHelperClass POOL_MODE;
	public static MyHelperClass DIRECT_MODE;
//	public MyHelperClass loadAnnotationSchemas(MyHelperClass o0, boolean o1){ return null; }
//	public MyHelperClass loadPlugins(String o0, boolean o1){ return null; }
public static MyHelperClass RichUIUtils;
	public static MyHelperClass OWLIMSERVICE_URL_PARAMETER_NAME;
	public static MyHelperClass ENABLE_APPLICATION_LOG_PARAMETER_NAME;
	public static MyHelperClass ONTOLOGY_URL_PARAMETER_NAME;
	public static MyHelperClass MODE_PARAMETER_NAME;
	public static MyHelperClass SELECT_ANN_TYPES_PARAMETER_NAME;
	public static MyHelperClass SELECT_AS_PARAMETER_NAME;
	public static MyHelperClass USER_ID_PARAMETER_NAME;
	public static MyHelperClass properties;
	public static MyHelperClass DOC_ID_PARAMETER_NAME;
	public static MyHelperClass USER_PASSWORD_PARAMETER_NAME;
	public static MyHelperClass ENABLE_ONTOLOGY_EDITOR_PARAMETER_NAME;
	public static MyHelperClass ONTOLOGY_TYPE_NTRIPPLES;
	public static MyHelperClass EXECUTIVE_PROXY_FACTORY_PARAMETER_NAME;
	public static MyHelperClass REPOSITORY_PARAMETER_NAME;
	public static MyHelperClass DOCSERVICE_URL_PARAMETER_NAME;
	public static MyHelperClass AUTOCONNECT_PARAMETER_NAME;
	public static MyHelperClass LOAD_PLUGINS_PARAMETER_NAME;
	public static MyHelperClass ONTOLOGY_TYPE_TURTLE;
	public static MyHelperClass EXECUTIVE_SERVICE_URL_PARAMETER_NAME;
	public static MyHelperClass LOAD_ANN_SCHEMAS_NAME;
	public static MyHelperClass CLASSES_TO_SHOW_PARAMETER_NAME;
	public static MyHelperClass DOCSERVICE_PROXY_FACTORY_PARAMETER_NAME;
	public static MyHelperClass SITE_CONFIG_URL_PARAMETER_NAME;
	public static MyHelperClass ANNSET_NAME_PARAMETER_NAME;
	public static MyHelperClass CLASSES_TO_HIDE_PARAMETER_NAME;
	public static MyHelperClass ONTOLOGY_TYPE_PARAMETER_NAME;
	public static MyHelperClass startupParamsToString(){ return null; }
//public MyHelperClass EXECUTIVE_PROXY_FACTORY_PARAMETER_NAME;
//	public MyHelperClass USER_PASSWORD_PARAMETER_NAME;
//	public MyHelperClass SELECT_AS_PARAMETER_NAME;
//	public MyHelperClass USER_ID_PARAMETER_NAME;
//	public MyHelperClass CLASSES_TO_SHOW_PARAMETER_NAME;
//	public MyHelperClass EXECUTIVE_SERVICE_URL_PARAMETER_NAME;
//	public MyHelperClass LOAD_ANN_SCHEMAS_NAME;
//	public MyHelperClass SELECT_ANN_TYPES_PARAMETER_NAME;
//	public MyHelperClass ENABLE_APPLICATION_LOG_PARAMETER_NAME;
//	public MyHelperClass CLASSES_TO_HIDE_PARAMETER_NAME;
//	public MyHelperClass POOL_MODE;
//	public MyHelperClass OWLIMSERVICE_URL_PARAMETER_NAME;
//	public MyHelperClass ANNSET_NAME_PARAMETER_NAME;
//	public MyHelperClass MODE_PARAMETER_NAME;
//	public MyHelperClass ONTOLOGY_TYPE_NTRIPPLES;
//	public MyHelperClass DIRECT_MODE;
//	public MyHelperClass RichUIUtils;
//	public MyHelperClass SITE_CONFIG_URL_PARAMETER_NAME;
//	public MyHelperClass ONTOLOGY_URL_PARAMETER_NAME;
//	public MyHelperClass DOCSERVICE_PROXY_FACTORY_PARAMETER_NAME;
//	public MyHelperClass LOAD_PLUGINS_PARAMETER_NAME;
//	public MyHelperClass ONTOLOGY_TYPE_TURTLE;
//	public MyHelperClass REPOSITORY_PARAMETER_NAME;
//	public MyHelperClass properties;
//	public MyHelperClass AUTOCONNECT_PARAMETER_NAME;
//	public MyHelperClass DOCSERVICE_URL_PARAMETER_NAME;
//	public MyHelperClass DOC_ID_PARAMETER_NAME;
//	public MyHelperClass ENABLE_ONTOLOGY_EDITOR_PARAMETER_NAME;
//	public MyHelperClass ONTOLOGY_TYPE_PARAMETER_NAME;
//	public MyHelperClass startupParamsToString(){ return null; }

 public static void main(String[] args) {
        MyHelperClass LogFrame = new MyHelperClass();
        LogFrame.getInstance();
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            MyHelperClass DEBUG_PARAMETER_NAME = new MyHelperClass();
            if (arg.trim().startsWith(DEBUG_PARAMETER_NAME + "=")) {
//                MyHelperClass DEBUG_PARAMETER_NAME = new MyHelperClass();
                properties.put(DEBUG_PARAMETER_NAME, arg.trim().substring((int)(Object)DEBUG_PARAMETER_NAME.length() + 1).trim());
                MyHelperClass DEBUG_TRUE = new MyHelperClass();
                if (properties.getProperty(DEBUG_PARAMETER_NAME).toLowerCase().equals(DEBUG_TRUE)) {
                    boolean DEBUG;// = new boolean();
                    DEBUG = true;
                }
            MyHelperClass MODE_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(MODE_PARAMETER_NAME + "=")) {
                MyHelperClass MODE_PARAMETER_NAME = new MyHelperClass();
                properties.put(MODE_PARAMETER_NAME, arg.trim().substring((int)(Object)MODE_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass AUTOCONNECT_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(AUTOCONNECT_PARAMETER_NAME + "=")) {
                MyHelperClass AUTOCONNECT_PARAMETER_NAME = new MyHelperClass();
                properties.put(AUTOCONNECT_PARAMETER_NAME, arg.trim().substring((int)(Object)AUTOCONNECT_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass SITE_CONFIG_URL_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(SITE_CONFIG_URL_PARAMETER_NAME + "=")) {
                MyHelperClass SITE_CONFIG_URL_PARAMETER_NAME = new MyHelperClass();
                properties.put(SITE_CONFIG_URL_PARAMETER_NAME, arg.trim().substring((int)(Object)SITE_CONFIG_URL_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass LOAD_PLUGINS_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(LOAD_PLUGINS_PARAMETER_NAME + "=")) {
                MyHelperClass LOAD_PLUGINS_PARAMETER_NAME = new MyHelperClass();
                properties.put(LOAD_PLUGINS_PARAMETER_NAME, arg.trim().substring((int)(Object)LOAD_PLUGINS_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass ONTOLOGY_URL_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(ONTOLOGY_URL_PARAMETER_NAME + "=")) {
                MyHelperClass ONTOLOGY_URL_PARAMETER_NAME = new MyHelperClass();
                properties.put(ONTOLOGY_URL_PARAMETER_NAME, arg.trim().substring((int)(Object)ONTOLOGY_URL_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass REPOSITORY_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(REPOSITORY_PARAMETER_NAME + "=")) {
                MyHelperClass REPOSITORY_PARAMETER_NAME = new MyHelperClass();
                properties.put(REPOSITORY_PARAMETER_NAME, arg.trim().substring((int)(Object)REPOSITORY_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass ONTOLOGY_TYPE_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(ONTOLOGY_TYPE_PARAMETER_NAME + "=")) {
                MyHelperClass ONTOLOGY_TYPE_PARAMETER_NAME = new MyHelperClass();
                properties.put(ONTOLOGY_TYPE_PARAMETER_NAME, arg.trim().substring((int)(Object)ONTOLOGY_TYPE_PARAMETER_NAME.length() + 1).trim());
                MyHelperClass ONTOLOGY_TYPE_RDFXML = new MyHelperClass();
                if (!(properties.getProperty(ONTOLOGY_TYPE_PARAMETER_NAME).equals(ONTOLOGY_TYPE_RDFXML) || properties.getProperty(ONTOLOGY_TYPE_PARAMETER_NAME).equals(ONTOLOGY_TYPE_TURTLE) || properties.getProperty(ONTOLOGY_TYPE_PARAMETER_NAME).equals(ONTOLOGY_TYPE_NTRIPPLES))) System.out.println("WARNING! Unknown ontology type: '" + properties.getProperty(ONTOLOGY_TYPE_PARAMETER_NAME) + "' (Known types are: '" + ONTOLOGY_TYPE_RDFXML + "', '" + ONTOLOGY_TYPE_TURTLE + "', '" + ONTOLOGY_TYPE_NTRIPPLES + "')");
            MyHelperClass OWLIMSERVICE_URL_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(OWLIMSERVICE_URL_PARAMETER_NAME + "=")) {
                MyHelperClass OWLIMSERVICE_URL_PARAMETER_NAME = new MyHelperClass();
                properties.put(OWLIMSERVICE_URL_PARAMETER_NAME, arg.trim().substring((int)(Object)OWLIMSERVICE_URL_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass DOCSERVICE_URL_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(DOCSERVICE_URL_PARAMETER_NAME + "=")) {
                MyHelperClass DOCSERVICE_URL_PARAMETER_NAME = new MyHelperClass();
                properties.put(DOCSERVICE_URL_PARAMETER_NAME, arg.trim().substring((int)(Object)DOCSERVICE_URL_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass DOC_ID_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(DOC_ID_PARAMETER_NAME + "=")) {
                MyHelperClass DOC_ID_PARAMETER_NAME = new MyHelperClass();
                properties.put(DOC_ID_PARAMETER_NAME, arg.trim().substring((int)(Object)DOC_ID_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass ANNSET_NAME_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(ANNSET_NAME_PARAMETER_NAME + "=")) {
                MyHelperClass ANNSET_NAME_PARAMETER_NAME = new MyHelperClass();
                properties.put(ANNSET_NAME_PARAMETER_NAME, arg.trim().substring((int)(Object)ANNSET_NAME_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass EXECUTIVE_SERVICE_URL_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(EXECUTIVE_SERVICE_URL_PARAMETER_NAME + "=")) {
                MyHelperClass EXECUTIVE_SERVICE_URL_PARAMETER_NAME = new MyHelperClass();
                properties.put(EXECUTIVE_SERVICE_URL_PARAMETER_NAME, arg.trim().substring((int)(Object)EXECUTIVE_SERVICE_URL_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass USER_ID_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(USER_ID_PARAMETER_NAME + "=")) {
                MyHelperClass USER_ID_PARAMETER_NAME = new MyHelperClass();
                properties.put(USER_ID_PARAMETER_NAME, arg.trim().substring((int)(Object)USER_ID_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass USER_PASSWORD_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(USER_PASSWORD_PARAMETER_NAME + "=")) {
                MyHelperClass USER_PASSWORD_PARAMETER_NAME = new MyHelperClass();
                properties.put(USER_PASSWORD_PARAMETER_NAME, arg.trim().substring((int)(Object)USER_PASSWORD_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass EXECUTIVE_PROXY_FACTORY_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(EXECUTIVE_PROXY_FACTORY_PARAMETER_NAME + "=")) {
                MyHelperClass EXECUTIVE_PROXY_FACTORY_PARAMETER_NAME = new MyHelperClass();
                properties.put(EXECUTIVE_PROXY_FACTORY_PARAMETER_NAME, arg.trim().substring((int)(Object)EXECUTIVE_PROXY_FACTORY_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass DOCSERVICE_PROXY_FACTORY_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(DOCSERVICE_PROXY_FACTORY_PARAMETER_NAME + "=")) {
                MyHelperClass DOCSERVICE_PROXY_FACTORY_PARAMETER_NAME = new MyHelperClass();
                properties.put(DOCSERVICE_PROXY_FACTORY_PARAMETER_NAME, arg.trim().substring((int)(Object)DOCSERVICE_PROXY_FACTORY_PARAMETER_NAME.length() + 1).trim());
//                MyHelperClass DOCSERVICE_PROXY_FACTORY_PARAMETER_NAME = new MyHelperClass();
                RichUIUtils.setDocServiceProxyFactoryClassname(properties.getProperty(DOCSERVICE_PROXY_FACTORY_PARAMETER_NAME));
            MyHelperClass LOAD_ANN_SCHEMAS_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(LOAD_ANN_SCHEMAS_NAME + "=")) {
                MyHelperClass LOAD_ANN_SCHEMAS_NAME = new MyHelperClass();
                properties.put(LOAD_ANN_SCHEMAS_NAME, arg.trim().substring((int)(Object)LOAD_ANN_SCHEMAS_NAME.length() + 1).trim());
            MyHelperClass SELECT_AS_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(SELECT_AS_PARAMETER_NAME + "=")) {
                MyHelperClass SELECT_AS_PARAMETER_NAME = new MyHelperClass();
                properties.put(SELECT_AS_PARAMETER_NAME, arg.trim().substring((int)(Object)SELECT_AS_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass SELECT_ANN_TYPES_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(SELECT_ANN_TYPES_PARAMETER_NAME + "=")) {
                MyHelperClass SELECT_ANN_TYPES_PARAMETER_NAME = new MyHelperClass();
                properties.put(SELECT_ANN_TYPES_PARAMETER_NAME, arg.trim().substring((int)(Object)SELECT_ANN_TYPES_PARAMETER_NAME.length() + 1).trim());
            } else if (arg.trim().startsWith(ENABLE_ONTOLOGY_EDITOR_PARAMETER_NAME + "=")) {
                properties.put(ENABLE_ONTOLOGY_EDITOR_PARAMETER_NAME, arg.trim().substring((int)(Object)ENABLE_ONTOLOGY_EDITOR_PARAMETER_NAME.length() + 1).trim());
            } else if (arg.trim().startsWith(CLASSES_TO_HIDE_PARAMETER_NAME + "=")) {
                properties.put(CLASSES_TO_HIDE_PARAMETER_NAME, arg.trim().substring((int)(Object)CLASSES_TO_HIDE_PARAMETER_NAME.length() + 1).trim());
            } else if (arg.trim().startsWith(CLASSES_TO_SHOW_PARAMETER_NAME + "=")) {
                properties.put(CLASSES_TO_SHOW_PARAMETER_NAME, arg.trim().substring((int)(Object)CLASSES_TO_SHOW_PARAMETER_NAME.length() + 1).trim());
            } else if (arg.trim().startsWith(ENABLE_APPLICATION_LOG_PARAMETER_NAME + "=")) {
                properties.put(ENABLE_APPLICATION_LOG_PARAMETER_NAME, arg.trim().substring((int)(Object)ENABLE_APPLICATION_LOG_PARAMETER_NAME.length() + 1).trim());
            } else {
                System.out.println("WARNING! Unknown or undefined parameter: '" + arg.trim() + "'");
            }
        }
        System.out.println(startupParamsToString());
        if (properties.getProperty(MODE_PARAMETER_NAME) == null || (!(properties.getProperty(MODE_PARAMETER_NAME).toLowerCase().equals(POOL_MODE)) && !(properties.getProperty(MODE_PARAMETER_NAME).toLowerCase().equals(DIRECT_MODE)))) {
            String err = "Mandatory parameter '" + MODE_PARAMETER_NAME + "' must be defined and must have a value either '" + POOL_MODE + "' or '" + DIRECT_MODE + "'.\n\nApplication will exit.";
            System.out.println(err);
            JOptionPane.showMessageDialog(new JFrame(), err, "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(-1);
        }
        if (properties.getProperty(SITE_CONFIG_URL_PARAMETER_NAME) == null ||(int)(Object) properties.getProperty(SITE_CONFIG_URL_PARAMETER_NAME).length() == 0) {
            String err = "Mandatory parameter '" + SITE_CONFIG_URL_PARAMETER_NAME + "' is missing.\n\nApplication will exit.";
            System.out.println(err);
            JOptionPane.showMessageDialog(new JFrame(), err, "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(-1);
        }
        try {
            String context = System.getProperty((String)(Object)CONTEXT);
            if (context == null || "".equals(context)) {
                context =(String)(Object) DEFAULT_CONTEXT;
            }
            String s = System.getProperty((String)(Object)GateConstants.GATE_HOME_PROPERTY_NAME);
            if (s == null || s.length() == 0) {
                File f =(File)(Object) File.createTempFile("foo", "");
                String gateHome = f.getParent().toString() + context;
                f.delete();
                System.setProperty((String)(Object)GateConstants.GATE_HOME_PROPERTY_NAME, gateHome);
                f = new File(System.getProperty((String)(Object)GateConstants.GATE_HOME_PROPERTY_NAME));
                if (!(Boolean)(Object)f.exists()) {
                    f.mkdirs();
                }
            }
            s = System.getProperty((String)(Object)GateConstants.PLUGINS_HOME_PROPERTY_NAME);
            if (s == null || s.length() == 0) {
                System.setProperty((String)(Object)GateConstants.PLUGINS_HOME_PROPERTY_NAME, System.getProperty((String)(Object)GateConstants.GATE_HOME_PROPERTY_NAME) + "/plugins");
                File f = new File(System.getProperty((String)(Object)GateConstants.PLUGINS_HOME_PROPERTY_NAME));
                if (!(Boolean)(Object)f.exists()) {
                    f.mkdirs();
                }
            }
            s = System.getProperty((String)(Object)GateConstants.GATE_SITE_CONFIG_PROPERTY_NAME);
            if (s == null || s.length() == 0) {
                System.setProperty((String)(Object)GateConstants.GATE_SITE_CONFIG_PROPERTY_NAME, System.getProperty((String)(Object)GateConstants.GATE_HOME_PROPERTY_NAME) + "/gate.xml");
            }
            if (properties.getProperty(SITE_CONFIG_URL_PARAMETER_NAME) != null &&(int)(Object) properties.getProperty(SITE_CONFIG_URL_PARAMETER_NAME).length() > 0) {
                File f = new File(System.getProperty((String)(Object)GateConstants.GATE_SITE_CONFIG_PROPERTY_NAME));
                if ((boolean)(Object)f.exists()) {
                    f.delete();
                }
                f.getParentFile().mkdirs();
                f.createNewFile();
                URL url = new URL(properties.getProperty(SITE_CONFIG_URL_PARAMETER_NAME));
                InputStream is =(InputStream)(Object) url.openStream();
                FileOutputStream fos = new FileOutputStream(f);
                int i =(int)(Object) is.read();
                while (i != -1) {
                    fos.write(i);
                    i =(int)(Object) is.read();
                }
                fos.close();
                is.close();
            }
            try {
                Gate.init();
                Main.applyUserPreferences();
            } catch (Exception e) {
                e.printStackTrace();
            }
            s = BASE_PLUGIN_NAME + "," + properties.getProperty(LOAD_PLUGINS_PARAMETER_NAME);
            System.out.println("Loading plugins: " + s);
            loadPlugins(s, true);
            loadAnnotationSchemas(properties.getProperty(LOAD_ANN_SCHEMAS_NAME), true);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        MainFrame.getInstance().setVisible(true);
        MainFrame.getInstance().pack();
        if (properties.getProperty(MODE_PARAMETER_NAME).toLowerCase().equals(DIRECT_MODE)) {
            if (properties.getProperty(AUTOCONNECT_PARAMETER_NAME, "").toLowerCase().equals(AUTOCONNECT_TRUE)) {
                if (properties.getProperty(DOC_ID_PARAMETER_NAME) == null ||(int)(Object) properties.getProperty(DOC_ID_PARAMETER_NAME).length() == 0) {
                    String err = "Can't autoconnect. A parameter '" + DOC_ID_PARAMETER_NAME + "' is missing.";
                    System.out.println(err);
                    JOptionPane.showMessageDialog(MainFrame.getInstance(), err, "Error!", JOptionPane.ERROR_MESSAGE);
                    ActionShowDocserviceConnectDialog.getInstance().actionPerformed(null);
                } else {
                    ActionConnectToDocservice.getInstance().actionPerformed(null);
                }
            } else {
                ActionShowDocserviceConnectDialog.getInstance().actionPerformed(null);
            }
        } else {
            if (properties.getProperty(AUTOCONNECT_PARAMETER_NAME, "").toLowerCase().equals(AUTOCONNECT_TRUE)) {
                if (properties.getProperty(USER_ID_PARAMETER_NAME) == null ||(int)(Object) properties.getProperty(USER_ID_PARAMETER_NAME).length() == 0) {
                    String err = "Can't autoconnect. A parameter '" + USER_ID_PARAMETER_NAME + "' is missing.";
                    System.out.println(err);
                    JOptionPane.showMessageDialog(MainFrame.getInstance(), err, "Error!", JOptionPane.ERROR_MESSAGE);
                    ActionShowExecutiveConnectDialog.getInstance().actionPerformed(null);
                } else {
                    ActionConnectToExecutive.getInstance().actionPerformed(null);
                }
            } else {
                ActionShowExecutiveConnectDialog.getInstance().actionPerformed(null);
            }
        }
    }
}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass PLUGINS_HOME_PROPERTY_NAME;
	public MyHelperClass GATE_HOME_PROPERTY_NAME;
	public MyHelperClass GATE_SITE_CONFIG_PROPERTY_NAME;
public MyHelperClass init(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass pack(){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass actionPerformed(Object o0){ return null; }
	public MyHelperClass showMessageDialog(JFrame o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getProperty(MyHelperClass o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass applyUserPreferences(){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass setDocServiceProxyFactoryClassname(MyHelperClass o0){ return null; }
	public MyHelperClass getProperty(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass put(MyHelperClass o0, String o1){ return null; }}

class JFrame {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
