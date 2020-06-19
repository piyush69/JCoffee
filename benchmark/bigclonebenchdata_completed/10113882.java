import java.io.*;
import java.lang.*;
import java.util.*;



class c10113882 {
public MyHelperClass NULL;
public MyHelperClass workDir;

    private void createSaveServiceProps() throws MojoExecutionException {
        File saveServiceProps =(File)(Object) NULL; //new File();
        saveServiceProps = new File((String)(Object)workDir, "saveservice.properties");
        try {
//            MyHelperClass saveServiceProps = new MyHelperClass();
            FileWriter out = new FileWriter((String)(Object)saveServiceProps);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(Thread.currentThread().getContextClassLoader().getResourceAsStream("saveservice.properties"), out);
            out.flush();
            out.close();
            System.setProperty("saveservice_properties", File.separator + "target" + File.separator + "jmeter" + File.separator + "saveservice.properties");
        } catch (IOException e) {
            throw new MojoExecutionException("Could not create temporary saveservice.properties", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileWriter o1){ return null; }}

class MojoExecutionException extends Exception{
	public MojoExecutionException(String errorMessage) { super(errorMessage); }
	MojoExecutionException(){}
	MojoExecutionException(String o0, IOException o1){}
}
