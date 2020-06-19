import java.io.*;
import java.lang.*;
import java.util.*;



class c16658637 {
public MyHelperClass NULL;
public MyHelperClass FileUtils;

    private void initUserExtensions(SeleniumConfiguration seleniumConfiguration) throws IOException {
        StringBuilder contents = new StringBuilder();
        StringOutputStream s = new StringOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(SeleniumConfiguration.class.getResourceAsStream("default-user-extensions.js"), s);
        contents.append(s.toString());
        MyHelperClass ConfigurationPropertyKeys = new MyHelperClass();
        File providedUserExtensions =(File)(Object) seleniumConfiguration.getFile(ConfigurationPropertyKeys.SELENIUM_USER_EXTENSIONS, seleniumConfiguration.getDirectoryConfiguration().getInput(), false);
        if (providedUserExtensions != null) {
            MyHelperClass FileUtils = new MyHelperClass();
            contents.append(FileUtils.readFileToString(providedUserExtensions, null));
        }
        File seleniumUserExtensions =(File)(Object) NULL; //new File();
        seleniumUserExtensions = new File((String)(Object)seleniumConfiguration.getDirectoryConfiguration().getInput(), "user-extensions.js");
//        MyHelperClass seleniumUserExtensions = new MyHelperClass();
        FileUtils.forceMkdir(seleniumUserExtensions.getParentFile());
//        MyHelperClass seleniumUserExtensions = new MyHelperClass();
        FileUtils.writeStringToFile(seleniumUserExtensions, contents.toString(), null);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SELENIUM_USER_EXTENSIONS;
public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getInput(){ return null; }
	public MyHelperClass readFileToString(File o0, Object o1){ return null; }
	public MyHelperClass copy(InputStream o0, StringOutputStream o1){ return null; }
	public MyHelperClass forceMkdir(File o0){ return null; }
	public MyHelperClass writeStringToFile(File o0, String o1, Object o2){ return null; }}

class SeleniumConfiguration {

public MyHelperClass getFile(MyHelperClass o0, MyHelperClass o1, boolean o2){ return null; }
	public MyHelperClass getDirectoryConfiguration(){ return null; }}

class StringOutputStream {

}
