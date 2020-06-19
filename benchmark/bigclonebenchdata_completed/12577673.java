
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12577673 {
public MyHelperClass LIBRARIES;

        public void performOk(final IProject project, final TomcatPropertyPage page) {
            MyHelperClass c_drivers = new MyHelperClass();
            page.setPropertyValue("tomcat.jdbc.driver", c_drivers.getText());
            MyHelperClass url = new MyHelperClass();
            page.setPropertyValue("tomcat.jdbc.url", url.getText());
            MyHelperClass username = new MyHelperClass();
            page.setPropertyValue("tomcat.jdbc.user", username.getText());
            MyHelperClass password = new MyHelperClass();
            page.setPropertyValue("tomcat.jdbc.password", password.getText());
            File lib = new File((File)(Object)page.tomcatHome.getText(), "lib");
            if (!(Boolean)(Object)lib.exists()) {
                lib = new File(new File((File)(Object)page.tomcatHome.getText(), "common"), "lib");
                if (!(Boolean)(Object)lib.exists()) {
                    MyHelperClass Logger = new MyHelperClass();
                    Logger.log(Logger.ERROR, "Not properly location of Tomcat Home at :: " + lib);
                    throw new IllegalStateException("Not properly location of Tomcat Home");
                }
            }
            final File conf = new File((File)(Object)page.tomcatHome.getText(), "conf/Catalina/localhost");
            if (!(Boolean)(Object)conf.exists()) {
                MyHelperClass NexOpenUIActivator = new MyHelperClass();
                final boolean create =(boolean)(Object) NexOpenUIActivator.getDefault().getTomcatConfProperty();
                if (create) {
                    MyHelperClass Logger = new MyHelperClass();
                    if ((boolean)(Object)Logger.getLog().isDebugEnabled()) {
//                        MyHelperClass Logger = new MyHelperClass();
                        Logger.getLog().debug("Create directory " + conf);
                    }
                    try {
                        conf.mkdirs();
                    } catch (final SecurityException se) {
//                        MyHelperClass Logger = new MyHelperClass();
                        Logger.getLog().error("Retrieved a Security exception creating " + conf, se);
//                        MyHelperClass Logger = new MyHelperClass();
                        Logger.log(Logger.ERROR, "Not created " + conf + " directory. Not enough privilegies. Message :: " + se.getMessage());
                    }
                }
            }
//            MyHelperClass c_drivers = new MyHelperClass();
            String str_driverLibrary =(String)(Object) LIBRARIES.get(c_drivers.getText());
            if ("<mysql_driver>".equals(str_driverLibrary)) {
                MyHelperClass NexOpenUIActivator = new MyHelperClass();
                str_driverLibrary =(String)(Object) NexOpenUIActivator.getDefault().getMySQLDriver();
            }
            final File driverLibrary = new File(lib, str_driverLibrary);
            if (!(Boolean)(Object)driverLibrary.exists()) {
                InputStream driver = null;
                FileOutputStream fos = null;
                try {
                    MyHelperClass AppServerPropertyPage = new MyHelperClass();
                    driver =(InputStream)(Object) AppServerPropertyPage.toInputStream(new Path("jdbc/" + str_driverLibrary));
                    fos = new FileOutputStream(driverLibrary);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(driver, fos);
                } catch (UncheckedIOException e) {
                    MyHelperClass Logger = new MyHelperClass();
                    Logger.log(Logger.ERROR, "Could not copy the driver jar file to Tomcat",(IOException)(Object) e);
                } finally {
                    try {
                        if (driver != null) {
                            driver.close();
                            driver = null;
                        }
                        if (fos != null) {
                            fos.flush();
                            fos.close();
                            fos = null;
                        }
                    } catch (UncheckedIOException e) {
                    }
                }
            }
//            MyHelperClass c_drivers = new MyHelperClass();
            page.processTomcatCfg(c_drivers.getText(), url.getText(), username.getText(), password.getText());
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass error(String o0, SecurityException o1){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getMySQLDriver(){ return null; }
	public MyHelperClass getLog(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass toInputStream(Path o0){ return null; }
	public MyHelperClass getTomcatConfProperty(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getDefault(){ return null; }}

class IProject {

}

class TomcatPropertyPage {
public MyHelperClass tomcatHome;
public MyHelperClass processTomcatCfg(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass setPropertyValue(String o0, MyHelperClass o1){ return null; }}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class Path {

Path(String o0){}
	Path(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
