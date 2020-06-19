import java.io.*;
import java.lang.*;
import java.util.*;



class c20336463 {
public static MyHelperClass startupUtil;
	public static MyHelperClass REPOSITORY_HOME;
	public static MyHelperClass IOUtils;
	public static MyHelperClass deleteHome(){ return null; }
//public MyHelperClass REPOSITORY_HOME;
//	public MyHelperClass IOUtils;
//	public MyHelperClass startupUtil;
//	public MyHelperClass deleteHome(){ return null; }

    private static void prepare() {
        System.err.println("PREPARING-----------------------------------------");
        deleteHome();
        InputStream configStream = null;
        FileOutputStream tempStream = null;
        try {
            configStream = AllTests.class.getClassLoader().getResourceAsStream("net/sf/archimede/test/resources/repository.xml");
            new File("temp").mkdir();
            tempStream = new FileOutputStream(new File("temp/repository.xml"));
            IOUtils.copy(configStream, tempStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (configStream != null) {
                    configStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (tempStream != null) {
                    try {
                        tempStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        String repositoryName = "jackrabbit.repository";
        Properties jndiProperties = new Properties();
        jndiProperties.put("java.naming.provider.url", "http://sf.net/projects/archimede#1");
        jndiProperties.put("java.naming.factory.initial", "org.apache.jackrabbit.core.jndi.provider.DummyInitialContextFactory");
        startupUtil =(MyHelperClass)(Object) new StartupJcrUtil(REPOSITORY_HOME, "temp/repository.xml", repositoryName, jndiProperties);
        startupUtil.init();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass init(){ return null; }}

class AllTests {

}

class StartupJcrUtil {

StartupJcrUtil(MyHelperClass o0, String o1, String o2, Properties o3){}
	StartupJcrUtil(){}}
