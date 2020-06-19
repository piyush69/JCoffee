


class c10836108 {
public static MyHelperClass DOCSERVICE_URL_PARAMETER_NAME;
	public static MyHelperClass SITE_CONFIG_URL_PARAMETER_NAME;
	public static MyHelperClass Main;
	public static MyHelperClass LOAD_PLUGINS_PARAMETER_NAME;
public static MyHelperClass CORPUS_ID_PARAMETER_NAME;
//	public MyHelperClass LOAD_PLUGINS_PARAMETER_NAME;
	public static MyHelperClass ActionConnectToAnnicGUI;
	public static MyHelperClass AUTOCONNECT_PARAMETER_NAME;
	public static MyHelperClass properties;
	public static MyHelperClass ActionShowAnnicConnectDialog;
	public static MyHelperClass AUTOCONNECT_TRUE;
//	public MyHelperClass DOCSERVICE_URL_PARAMETER_NAME;
//	public MyHelperClass SITE_CONFIG_URL_PARAMETER_NAME;
	public static MyHelperClass JOptionPane;
	public static MyHelperClass MainFrame;
//	public MyHelperClass Main;
	public static MyHelperClass loadPlugins(String o0, boolean o1){ return null; }
//public MyHelperClass MainFrame;
//	public MyHelperClass AUTOCONNECT_TRUE;
//	public MyHelperClass CORPUS_ID_PARAMETER_NAME;
//	public MyHelperClass properties;
//	public MyHelperClass AUTOCONNECT_PARAMETER_NAME;
//	public MyHelperClass ActionShowAnnicConnectDialog;
//	public MyHelperClass JOptionPane;
//	public MyHelperClass ActionConnectToAnnicGUI;
//	public MyHelperClass loadPlugins(String o0, boolean o1){ return null; }

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
            MyHelperClass DOCSERVICE_URL_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(DOCSERVICE_URL_PARAMETER_NAME + "=")) {
                MyHelperClass DOCSERVICE_URL_PARAMETER_NAME = new MyHelperClass();
                properties.put(DOCSERVICE_URL_PARAMETER_NAME, arg.trim().substring((int)(Object)DOCSERVICE_URL_PARAMETER_NAME.length() + 1).trim());
            MyHelperClass CORPUS_ID_PARAMETER_NAME = new MyHelperClass();
            } else if (arg.trim().startsWith(CORPUS_ID_PARAMETER_NAME + "=")) {
                MyHelperClass CORPUS_ID_PARAMETER_NAME = new MyHelperClass();
                properties.put(CORPUS_ID_PARAMETER_NAME, arg.trim().substring((int)(Object)CORPUS_ID_PARAMETER_NAME.length() + 1).trim());
            } else {
                System.out.println("WARNING! Unknown or undefined parameter: '" + arg.trim() + "'");
            }
        }
        System.out.println("Annic GUI startup parameters:");
        System.out.println("------------------------------");
        MyHelperClass properties = new MyHelperClass();
        for (Object propName : (Object[])(Object)properties.keySet()) {
//            MyHelperClass properties = new MyHelperClass();
            System.out.println(propName.toString() + "=" + properties.getProperty((String) propName));
        }
        System.out.println("------------------------------");
        MyHelperClass SITE_CONFIG_URL_PARAMETER_NAME = new MyHelperClass();
        if (properties.getProperty(SITE_CONFIG_URL_PARAMETER_NAME) == null ||(int)(Object) properties.getProperty(SITE_CONFIG_URL_PARAMETER_NAME).length() == 0) {
//            MyHelperClass SITE_CONFIG_URL_PARAMETER_NAME = new MyHelperClass();
            String err = "Mandatory parameter '" + SITE_CONFIG_URL_PARAMETER_NAME + "' is missing.\n\nApplication will exit.";
            System.out.println(err);
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(new JFrame(), err, "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(-1);
        }
        try {
            MyHelperClass CONTEXT = new MyHelperClass();
            String context = System.getProperty((String)(Object)CONTEXT);
            if (context == null || "".equals(context)) {
                MyHelperClass DEFAULT_CONTEXT = new MyHelperClass();
                context =(String)(Object) DEFAULT_CONTEXT;
            }
            MyHelperClass GateConstants = new MyHelperClass();
            String s = System.getProperty((String)(Object)GateConstants.GATE_HOME_PROPERTY_NAME);
            if (s == null || s.length() == 0) {
                MyHelperClass File = new MyHelperClass();
                File f =(File)(Object) File.createTempFile("foo", "");
                String gateHome = f.getParent().toString() + context;
                f.delete();
//                MyHelperClass GateConstants = new MyHelperClass();
                System.setProperty((String)(Object)GateConstants.GATE_HOME_PROPERTY_NAME, gateHome);
//                MyHelperClass GateConstants = new MyHelperClass();
                f = new File(System.getProperty((String)(Object)GateConstants.GATE_HOME_PROPERTY_NAME));
                if (!(Boolean)(Object)f.exists()) {
                    f.mkdirs();
                }
            }
//            MyHelperClass GateConstants = new MyHelperClass();
            s = System.getProperty((String)(Object)GateConstants.PLUGINS_HOME_PROPERTY_NAME);
            if (s == null || s.length() == 0) {
//                MyHelperClass GateConstants = new MyHelperClass();
                System.setProperty((String)(Object)GateConstants.PLUGINS_HOME_PROPERTY_NAME, System.getProperty((String)(Object)GateConstants.GATE_HOME_PROPERTY_NAME) + "/plugins");
//                MyHelperClass GateConstants = new MyHelperClass();
                File f = new File(System.getProperty((String)(Object)GateConstants.PLUGINS_HOME_PROPERTY_NAME));
                if (!(Boolean)(Object)f.exists()) {
                    f.mkdirs();
                }
            }
//            MyHelperClass GateConstants = new MyHelperClass();
            s = System.getProperty((String)(Object)GateConstants.GATE_SITE_CONFIG_PROPERTY_NAME);
            if (s == null || s.length() == 0) {
//                MyHelperClass GateConstants = new MyHelperClass();
                System.setProperty((String)(Object)GateConstants.GATE_SITE_CONFIG_PROPERTY_NAME, System.getProperty((String)(Object)GateConstants.GATE_HOME_PROPERTY_NAME) + "/gate.xml");
            }
//            MyHelperClass SITE_CONFIG_URL_PARAMETER_NAME = new MyHelperClass();
            if (properties.getProperty(SITE_CONFIG_URL_PARAMETER_NAME) != null &&(int)(Object) properties.getProperty(SITE_CONFIG_URL_PARAMETER_NAME).length() > 0) {
//                MyHelperClass GateConstants = new MyHelperClass();
                File f = new File(System.getProperty((String)(Object)GateConstants.GATE_SITE_CONFIG_PROPERTY_NAME));
                if ((boolean)(Object)f.exists()) {
                    f.delete();
                }
                f.getParentFile().mkdirs();
                f.createNewFile();
//                MyHelperClass SITE_CONFIG_URL_PARAMETER_NAME = new MyHelperClass();
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
                MyHelperClass Gate = new MyHelperClass();
                Gate.init();
                Main.applyUserPreferences();
            } catch (Exception e) {
                e.printStackTrace();
            }
            MyHelperClass BASE_PLUGIN_NAME = new MyHelperClass();
            s = BASE_PLUGIN_NAME + "," + properties.getProperty(LOAD_PLUGINS_PARAMETER_NAME);
            System.out.println("Loading plugins: " + s);
            loadPlugins(s, true);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        MainFrame.getInstance().setVisible(true);
        MainFrame.getInstance().pack();
        if (properties.getProperty(AUTOCONNECT_PARAMETER_NAME, "").toLowerCase().equals(AUTOCONNECT_TRUE)) {
            if (properties.getProperty(CORPUS_ID_PARAMETER_NAME) == null ||(int)(Object) properties.getProperty(CORPUS_ID_PARAMETER_NAME).length() == 0) {
                String err = "Can't autoconnect. A parameter '" + CORPUS_ID_PARAMETER_NAME + "' is missing.";
                System.out.println(err);
                JOptionPane.showMessageDialog(MainFrame.getInstance(), err, "Error!", JOptionPane.ERROR_MESSAGE);
                ActionShowAnnicConnectDialog.getInstance().actionPerformed(null);
            } else {
                ActionConnectToAnnicGUI.getInstance().actionPerformed(null);
            }
        } else {
            ActionShowAnnicConnectDialog.getInstance().actionPerformed(null);
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
	public MyHelperClass keySet(){ return null; }
	public MyHelperClass pack(){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass actionPerformed(Object o0){ return null; }
	public MyHelperClass showMessageDialog(JFrame o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getProperty(MyHelperClass o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass applyUserPreferences(){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
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
