import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10053153 {
public MyHelperClass IOUtils;
public MyHelperClass pb;
	public MyHelperClass StringUtils;
	public MyHelperClass info;
	public MyHelperClass process;
	public MyHelperClass log;
	public MyHelperClass infoNotifiers(String o0){ return null; }
	public MyHelperClass startNotifiers(){ return null; }
	public MyHelperClass endNotifiers(){ return null; }
	public MyHelperClass logEnvironment(){ return null; }

//        @Override
        public void run()  throws Throwable {
            MyHelperClass log = new MyHelperClass();
            log.debug("Now running....");
//            MyHelperClass log = new MyHelperClass();
            log.debug("Current env. variables:");
            try {
                this.infoNotifiers("Environment parameters after modifications:");
                this.logEnvironment();
                this.infoNotifiers("Dump thread will now run...");
                this.endNotifiers();
                this.process = this.pb.start();
                this.process.waitFor();
                if (this.process.exitValue() != 0) {
                    this.startNotifiers();
                    this.infoNotifiers("Dump Failed. Return status: " + this.process.exitValue());
                    this.endNotifiers();
                    return;
                }
                List<String> cmd = new LinkedList<String>();
                cmd.add("gzip");
                cmd.add(info.getDumpFileName());
                File basePath = this.pb.directory();
                this.pb =(MyHelperClass)(Object) new ProcessBuilder(cmd);
                this.pb.directory(basePath);
                log.debug("Executing: " + StringUtils.join(cmd.iterator(), ' '));
                this.process = this.pb.start();
                this.process.waitFor();
                if (this.process.exitValue() != 0) {
                    this.startNotifiers();
                    this.infoNotifiers("Dump GZip Failed. Return status: " + this.process.exitValue());
                    this.endNotifiers();
                    return;
                }
                info.setDumpFileName(info.getDumpFileName() + ".gz");
                info.setMD5SumFileName(info.getDumpFileName() + ".md5sum");
                cmd = new LinkedList<String>();
                cmd.add("md5sum");
                cmd.add("-b");
                cmd.add(info.getDumpFileName());
                log.debug("Executing: " + StringUtils.join(cmd.iterator(), ' '));
                this.pb =(MyHelperClass)(Object) new ProcessBuilder(cmd);
                this.pb.directory(basePath);
                this.process = this.pb.start();
                BufferedOutputStream md5sumFileOut = new BufferedOutputStream(new FileOutputStream(basePath.getAbsolutePath() + File.separatorChar + info.getMD5SumFileName()));
                IOUtils.copy(this.process.getInputStream(), md5sumFileOut);
                this.process.waitFor();
                md5sumFileOut.flush();
                md5sumFileOut.close();
                if (this.process.exitValue() != 0) {
                    this.startNotifiers();
                    this.infoNotifiers("Dump GZip MD5Sum Failed. Return status: " + this.process.exitValue());
                    this.endNotifiers();
                    return;
                } else {
                    this.startNotifiers();
                    this.infoNotifiers("Dump, gzip and md5sum sucessfuly completed.");
                    this.endNotifiers();
                }
            } catch (IOException e) {
                String message = "IOException launching command: " + e.getMessage();
                log.error(message, e);
                throw new IllegalStateException(message, e);
            } catch (InterruptedException e) {
                String message = "InterruptedException launching command: " + e.getMessage();
                log.error(message, e);
                throw new IllegalStateException(message, e);
            } catch (IntegrationException e) {
                String message = "IntegrationException launching command: " + e.getMessage();
                log.error(message, e);
                throw new IllegalStateException(message, e);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMD5SumFileName(){ return null; }
	public MyHelperClass waitFor(){ return null; }
	public MyHelperClass error(String o0, InterruptedException o1){ return null; }
	public MyHelperClass getDumpFileName(){ return null; }
	public MyHelperClass error(String o0, IntegrationException o1){ return null; }
	public MyHelperClass directory(File o0){ return null; }
	public MyHelperClass start(){ return null; }
	public MyHelperClass directory(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass join(Iterator<String o0, char o1){ return null; }
	public MyHelperClass exitValue(){ return null; }}

class IntegrationException extends Exception{
	public IntegrationException(String errorMessage) { super(errorMessage); }
}
