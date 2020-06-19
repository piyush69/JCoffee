import java.io.*;
import java.lang.*;
import java.util.*;



class c2638907 {
public MyHelperClass createCmdArray(MyHelperClass o0){ return null; }
public MyHelperClass LOG;
	public MyHelperClass IOUtils;
	public MyHelperClass StringUtils;
	public MyHelperClass getCommand(){ return null; }
	public MyHelperClass isBlocking(){ return null; }

    public void run() {
        MyHelperClass LOG = new MyHelperClass();
        LOG.debug(this);
        String[] parts =(String[])(Object) createCmdArray(getCommand());
        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec(parts);
            if ((boolean)(Object)isBlocking()) {
                process.waitFor();
                StringWriter out = new StringWriter();
                IOUtils.copy(process.getInputStream(), out);
                String stdout = out.toString().replaceFirst("\\s+$", "");
                if ((boolean)(Object)StringUtils.isNotBlank(stdout)) {
                    LOG.info("Process stdout:\n" + stdout);
                }
                StringWriter err = new StringWriter();
                IOUtils.copy(process.getErrorStream(), err);
                String stderr = err.toString().replaceFirst("\\s+$", "");
                if ((boolean)(Object)StringUtils.isNotBlank(stderr)) {
                    LOG.error("Process stderr:\n" + stderr);
                }
            }
        } catch (IOException ioe) {
            LOG.error(String.format("Could not exec [%s]", getCommand()), ioe);
        } catch (InterruptedException ie) {
            LOG.error(String.format("Interrupted [%s]", getCommand()), ie);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isNotBlank(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0, InterruptedException o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass debug(c2638907 o0){ return null; }}
