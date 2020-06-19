import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2226036 {
public MyHelperClass toInputStream(Path o0){ return null; }
public MyHelperClass Logger;
	public MyHelperClass IOUtils;
	public MyHelperClass tabControls;
	public MyHelperClass isEnabledJCLCopy(){ return null; }
	public MyHelperClass saveWLHome(){ return null; }
	public MyHelperClass isEnabledJSTLCopy(){ return null; }

            public void run()  throws Throwable {
                saveWLHome();
                for (final TabControl control :(TabControl[])(Object) (Object[])(Object)tabControls) {
                    control.performOk(WLPropertyPage.this.getProject(), WLPropertyPage.this);
                }
                if ((boolean)(Object)isEnabledJCLCopy()) {
                    final File url = new File(WLPropertyPage.this.domainDirectory.getText());
                    File lib = new File(url, "lib");
                    File log4jLibrary = new File(lib, "log4j-1.2.13.jar");
                    if (!log4jLibrary.exists()) {
                        InputStream srcFile = null;
                        FileOutputStream fos = null;
                        try {
                            srcFile =(InputStream)(Object) toInputStream(new Path("jcl/log4j-1.2.13.jar"));
                            fos = new FileOutputStream(log4jLibrary);
                            IOUtils.copy(srcFile, fos);
                            srcFile.close();
                            fos.flush();
                            fos.close();
                            srcFile =(InputStream)(Object) toInputStream(new Path("/jcl/commons-logging-1.0.4.jar"));
                            File jcl = new File(lib, "commons-logging-1.0.4.jar");
                            fos = new FileOutputStream(jcl);
                            IOUtils.copy(srcFile, fos);
                        } catch (IOException e) {
                            Logger.log(Logger.ERROR, "Could not copy JCL jars file to Bea WL", e);
                        } finally {
                            try {
                                if (srcFile != null) {
                                    srcFile.close();
                                    srcFile = null;
                                }
                                if (fos != null) {
                                    fos.flush();
                                    fos.close();
                                    fos = null;
                                }
                            } catch (IOException e) {
                            }
                        }
                    }
                }
                if ((boolean)(Object)isEnabledJSTLCopy()) {
                    File url = new File(WLPropertyPage.this.domainDirectory.getText());
                    File lib = new File(url, "lib");
                    File jstlLibrary = new File(lib, "jstl.jar");
                    if (!jstlLibrary.exists()) {
                        InputStream srcFile = null;
                        FileOutputStream fos = null;
                        try {
                            srcFile =(InputStream)(Object) toInputStream(new Path("jstl/jstl.jar"));
                            fos = new FileOutputStream(jstlLibrary);
                            IOUtils.copy(srcFile, fos);
                        } catch (IOException e) {
                            Logger.log(Logger.ERROR, "Could not copy the JSTL 1.1 jar file to Bea WL", e);
                        } finally {
                            try {
                                if (srcFile != null) {
                                    srcFile.close();
                                    srcFile = null;
                                }
                                if (fos != null) {
                                    fos.flush();
                                    fos.close();
                                    fos = null;
                                }
                            } catch (final IOException e) {
                                Logger.getLog().debug("I/O exception closing resources", e);
                            }
                        }
                    }
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass debug(String o0, IOException o1){ return null; }
	public MyHelperClass getLog(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }}

class TabControl {

}

class WLPropertyPage {

}

class Path {

Path(String o0){}
	Path(){}}
