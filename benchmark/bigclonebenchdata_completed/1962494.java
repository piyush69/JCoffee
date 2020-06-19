


class c1962494 {
public MyHelperClass Widget;

            public void widgetSelected(SelectionEvent event) {
                try {
                    MyHelperClass PKBMain = new MyHelperClass();
                    URL url = new URL(PKBMain.PRODUCT_WEBSITE + "/latest-version.txt");
                    Properties prop = new Properties();
                    prop.load(url.openStream());
                    Package currentPackage = Package.getPackage("org.sf.pkb.gui");
                    String version = currentPackage.getImplementationVersion();
                    if (version == null) {
                        version = "";
                    }
                    String remoteVersion = prop.getProperty("version") + " b" + prop.getProperty("build");
                    if (remoteVersion.trim().compareTo(version.trim()) != 0) {
                        StringBuffer buf = new StringBuffer();
                        buf.append("<HTML><BODY>").append("<h3 style='color: #0033FF'>You do not have the latest version. <br/> ").append("The latest version is PKB ").append(prop.getProperty("version") + " b" + prop.getProperty("build")).append(".</h3><A HREF='").append(prop.getProperty("url")).append("' TARGET='_BLANK'>Please download here </a> <br/><br/>").append("<B>It is strongly suggested to backup your knowledge base before install or unzip the new package!</B>").append("</BODY></HTML>");
                        Widget.getKnowledgeContentPanel().showTextInBrowser(buf.toString());
                    } else {
                        StringBuffer buf = new StringBuffer();
                        buf.append("<HTML><BODY>").append("<h3 style='color: #0033FF'>You already had the latest version - ALEX PKB ").append(prop.getProperty("version") + " b" + prop.getProperty("build")).append(".</h3>").append("</BODY></HTML>");
                        Widget.getKnowledgeContentPanel().showTextInBrowser(buf.toString());
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                MyHelperClass shell = new MyHelperClass();
                shell.close();
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PRODUCT_WEBSITE;
public MyHelperClass getKnowledgeContentPanel(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass showTextInBrowser(String o0){ return null; }}

class SelectionEvent {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class Properties {

public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass load(MyHelperClass o0){ return null; }}
