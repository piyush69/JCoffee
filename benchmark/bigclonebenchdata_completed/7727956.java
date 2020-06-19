import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7727956 {
public static MyHelperClass JAVA_STRUTS_DIR;
	public static MyHelperClass JAVA_HIBERNATE2_DIR;
	public static MyHelperClass JAVA_HIBERNATE3_DIR;
	public static MyHelperClass CONF_TAPESTRY4_DIR;
	public static MyHelperClass CONF_GENERAL_DIR;
	public static MyHelperClass JAVA_EJB3_DIR;
	public static MyHelperClass JAVA_WEB_TAPESTRY4_DIR;
	public static MyHelperClass CONF_STRUTS_DIR;
	public static MyHelperClass JAVA_TAPESTRY4_DIR;
	public static MyHelperClass JAVA_EJB2_DIR;
	public static MyHelperClass JAVA_MOCK_DIR;
	public static MyHelperClass JAVA_SERVICE_DIR;
	public static MyHelperClass JAVA_TEST_DIR;
	public static MyHelperClass JAVA_SWING_DIR;
	public static MyHelperClass JAVA_WEB_STRUTS_DIR;
	public static MyHelperClass CONF_SWING_DIR;
//public MyHelperClass CONF_STRUTS_DIR;
//	public MyHelperClass JAVA_EJB2_DIR;
//	public MyHelperClass JAVA_MOCK_DIR;
//	public MyHelperClass JAVA_SERVICE_DIR;
//	public MyHelperClass JAVA_WEB_STRUTS_DIR;
//	public MyHelperClass JAVA_SWING_DIR;
//	public MyHelperClass JAVA_STRUTS_DIR;
//	public MyHelperClass JAVA_HIBERNATE2_DIR;
	public static MyHelperClass log;
//	public MyHelperClass JAVA_TAPESTRY4_DIR;
//	public MyHelperClass JAVA_HIBERNATE3_DIR;
//	public MyHelperClass CONF_SWING_DIR;
//	public MyHelperClass CONF_GENERAL_DIR;
//	public MyHelperClass JAVA_EJB3_DIR;
//	public MyHelperClass JAVA_WEB_TAPESTRY4_DIR;
//	public MyHelperClass JAVA_TEST_DIR;
//	public MyHelperClass CONF_TAPESTRY4_DIR;
	public static MyHelperClass log(String o0){ return null; }
//public MyHelperClass log;
//	public MyHelperClass log(String o0){ return null; }

    public static void createOutputStructure(String templatePath) throws Throwable, InterruptedException {
        try {
            templatePath = new File(templatePath).getCanonicalPath();
            templatePath = templatePath.replace('\\', '/');
            File file = null;
            MyHelperClass GragGenerator = new MyHelperClass();
            Paths paths = (Paths)(Paths)(Object) GragGenerator.getObjectsFromTree((Paths)(Object)Paths.class).get(0);
//            MyHelperClass GragGenerator = new MyHelperClass();
            Config config = (Config)(Config)(Object) GragGenerator.getObjectsFromTree((Paths)(Object)Config.class).get(0);
            DirectoryIterator iterator = new DirectoryIterator(templatePath, true, true);
            while ((file =(File)(Object) iterator.getNext()) != null) {
                boolean copyFile = false;
                String fullFilename = file.getCanonicalPath();
                int lastDirPos = fullFilename.lastIndexOf(System.getProperty("file.separator"));
                MyHelperClass CVS_DIR = new MyHelperClass();
                if (CVS_DIR.equals(file.getCanonicalPath().substring(fullFilename.length() - (int)(Object)CVS_DIR.length(), fullFilename.length())) || CVS_DIR.equals(fullFilename.substring(lastDirPos - (int)(Object)CVS_DIR.length(), lastDirPos))) {
                    continue;
                }
                if ("readme.txt".equals(file.getName())) {
                    continue;
                }
                MyHelperClass outputDir = new MyHelperClass();
                String fileOut =(String)(Object) outputDir.replace('\\', '/');
                String path = file.getCanonicalPath().replace('\\', '/');
                if (path.indexOf(templatePath) == 0) {
                    path = path.substring(templatePath.length());
                    MyHelperClass Paths = new MyHelperClass();
                    if (path.startsWith((String)(Object)Paths.CONF_GENERAL_DIR)) {
                        path = paths.getConfigOutput() + path.substring((int)(Object)CONF_GENERAL_DIR.length());
                        copyFile = true;
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.CONF_STRUTS_DIR)) {
                        path = paths.getConfigOutput() + path.substring((int)(Object)CONF_STRUTS_DIR.length());
                        copyFile = true;
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.CONF_TAPESTRY4_DIR)) {
                        path = paths.getConfigOutput() + path.substring((int)(Object)CONF_TAPESTRY4_DIR.length());
                        copyFile = true;
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.CONF_SWING_DIR)) {
                        path = paths.getConfigOutput() + path.substring((int)(Object)CONF_SWING_DIR.length());
                        copyFile = true;
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.JAVA_WEB_STRUTS_DIR)) {
                        path = paths.getJspOutput() + path.substring((int)(Object)JAVA_WEB_STRUTS_DIR.length());
                        if ((boolean)(Object)config.matchWebTier("struts").booleanValue()) {
                            copyFile = true;
                        }
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.JAVA_WEB_TAPESTRY4_DIR)) {
                        path = paths.getJspOutput() + path.substring((int)(Object)JAVA_WEB_TAPESTRY4_DIR.length());
                        if ((boolean)(Object)config.matchWebTier("tapestry").booleanValue()) {
                            copyFile = true;
                        }
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.JAVA_SWING_DIR)) {
                        path = paths.getSwingOutput() + path.substring((int)(Object)JAVA_SWING_DIR.length());
                        if ((boolean)(Object)config.matchWebTier("swing").booleanValue()) {
                            copyFile = true;
                        }
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.JAVA_STRUTS_DIR)) {
                        path = paths.getWebOutput() + path.substring((int)(Object)JAVA_STRUTS_DIR.length());
                        if ((boolean)(Object)config.matchWebTier("struts").booleanValue()) {
                            copyFile = true;
                        }
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.JAVA_TAPESTRY4_DIR)) {
                        path = paths.getWebOutput() + path.substring((int)(Object)JAVA_TAPESTRY4_DIR.length());
                        if ((boolean)(Object)config.matchWebTier("tapestry").booleanValue()) {
                            copyFile = true;
                        }
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.JAVA_EJB2_DIR)) {
                        path = paths.getEjbOutput() + path.substring((int)(Object)JAVA_EJB2_DIR.length());
                        if ((boolean)(Object)config.matchBusinessTier("ejb 2").booleanValue()) {
                            copyFile = true;
                        }
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.JAVA_EJB3_DIR)) {
                        path = paths.getEjbOutput() + path.substring((int)(Object)JAVA_EJB3_DIR.length());
                        if ((boolean)(Object)config.matchBusinessTier("ejb 3").booleanValue()) {
                            copyFile = true;
                        }
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.JAVA_HIBERNATE2_DIR)) {
                        path = paths.getHibernateOutput() + path.substring((int)(Object)JAVA_HIBERNATE2_DIR.length());
                        if ((boolean)(Object)config.matchBusinessTier("hibernate 2").booleanValue()) {
                            copyFile = true;
                        }
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.JAVA_HIBERNATE3_DIR)) {
                        path = paths.getHibernateOutput() + path.substring((int)(Object)JAVA_HIBERNATE3_DIR.length());
                        if ((boolean)(Object)config.matchBusinessTier("hibernate 3").booleanValue()) {
                            copyFile = true;
                        }
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.JAVA_MOCK_DIR)) {
                        path = paths.getMockOutput() + path.substring((int)(Object)JAVA_MOCK_DIR.length());
                        if ((boolean)(Object)config.useMock().booleanValue()) {
                            copyFile = true;
                        }
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.JAVA_SERVICE_DIR)) {
                        path = paths.getServiceOutput() + path.substring((int)(Object)JAVA_SERVICE_DIR.length());
                        copyFile = true;
//                    MyHelperClass Paths = new MyHelperClass();
                    } else if (path.startsWith((String)(Object)Paths.JAVA_TEST_DIR)) {
                        path = paths.getTestOutput() + path.substring((int)(Object)JAVA_TEST_DIR.length());
                        copyFile = true;
                    } else if ((path.indexOf("build.bat") != -1) || ((path.indexOf("deploy.bat") != -1))) {
                        copyFile = true;
                    }
                }
                if (!path.startsWith("/")) {
                    path = "/" + path;
                }
                if (copyFile) {
                    fileOut += path;
//                    MyHelperClass outputDir = new MyHelperClass();
                    path = outputDir + path;
                    if (!file.isDirectory()) {
                        String name = file.getName();
                        path = path.substring(0, (path.length() - name.length()));
                    }
                    new File(path).mkdirs();
                    if (!file.isDirectory()) {
                        byte array[] = new byte[1024];
                        int size = 0;
                        try {
                            BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
                            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileOut));
                            while ((size = in.read(array)) != -1) out.write(array, 0, size);
                            in.close();
                            out.flush();
                            out.close();
                        } catch (Exception exc) {
                            log("[Error] Copy output file failed : " + fileOut);
                            log(exc.getMessage());
                        }
                    }
                }
            }
        } catch (Exception exc) {
            log.error("Error while copying files: ", exc);
            log(exc.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONF_STRUTS_DIR;
	public MyHelperClass JAVA_SERVICE_DIR;
	public MyHelperClass JAVA_SWING_DIR;
	public MyHelperClass JAVA_TAPESTRY4_DIR;
	public MyHelperClass JAVA_HIBERNATE3_DIR;
	public MyHelperClass CONF_GENERAL_DIR;
	public MyHelperClass JAVA_WEB_TAPESTRY4_DIR;
	public MyHelperClass JAVA_MOCK_DIR;
	public MyHelperClass JAVA_WEB_STRUTS_DIR;
	public MyHelperClass JAVA_TEST_DIR;
	public MyHelperClass JAVA_STRUTS_DIR;
	public MyHelperClass CONF_SWING_DIR;
	public MyHelperClass JAVA_EJB2_DIR;
	public MyHelperClass JAVA_HIBERNATE2_DIR;
	public MyHelperClass JAVA_EJB3_DIR;
	public MyHelperClass CONF_TAPESTRY4_DIR;
public MyHelperClass replace(char o0, char o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getObjectsFromTree(Paths o0){ return null; }
	public MyHelperClass getObjectsFromTree(Config o0){ return null; }
	public MyHelperClass booleanValue(){ return null; }}

class Paths {

public MyHelperClass getHibernateOutput(){ return null; }
	public MyHelperClass getServiceOutput(){ return null; }
	public MyHelperClass getMockOutput(){ return null; }
	public MyHelperClass getJspOutput(){ return null; }
	public MyHelperClass getSwingOutput(){ return null; }
	public MyHelperClass getEjbOutput(){ return null; }
	public MyHelperClass getWebOutput(){ return null; }
	public MyHelperClass getConfigOutput(){ return null; }
	public MyHelperClass getTestOutput(){ return null; }}

class Config {

public MyHelperClass useMock(){ return null; }
	public MyHelperClass matchWebTier(String o0){ return null; }
	public MyHelperClass matchBusinessTier(String o0){ return null; }}

class DirectoryIterator {

DirectoryIterator(){}
	DirectoryIterator(String o0, boolean o1, boolean o2){}
	public MyHelperClass getNext(){ return null; }}
