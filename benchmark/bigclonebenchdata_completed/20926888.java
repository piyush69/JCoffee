import java.io.*;
import java.lang.*;
import java.util.*;



class c20926888 {
public MyHelperClass ftp;
	public MyHelperClass tmpDir;
	public MyHelperClass remoteTmpDir;
	public MyHelperClass ftpFileSep;
	public MyHelperClass connectionSucceeded;
	public MyHelperClass myFTPTask;
	public MyHelperClass loginSuceeded;
	public MyHelperClass configureProject(String o0){ return null; }
	public MyHelperClass getProject(){ return null; }

    public void setUp() {
        configureProject("src/etc/testcases/taskdefs/optional/net/ftp.xml");
        getProject().executeTarget("setup");
        tmpDir = getProject().getProperty("tmp.dir");
        ftp =(MyHelperClass)(Object) new FTPClient();
        ftpFileSep = getProject().getProperty("ftp.filesep");
        myFTPTask.setSeparator(ftpFileSep);
        myFTPTask.setProject(getProject());
        remoteTmpDir = myFTPTask.resolveFile(tmpDir);
        String remoteHost =(String)(Object) getProject().getProperty("ftp.host");
        int port = Integer.parseInt((String)(Object)getProject().getProperty("ftp.port"));
        String remoteUser =(String)(Object) getProject().getProperty("ftp.user");
        String password =(String)(Object) getProject().getProperty("ftp.password");
        try {
            ftp.connect(remoteHost, port);
        } catch (Exception ex) {
            connectionSucceeded =(MyHelperClass)(Object) false;
            loginSuceeded =(MyHelperClass)(Object) false;
            System.out.println("could not connect to host " + remoteHost + " on port " + port);
        }
        if ((boolean)(Object)connectionSucceeded) {
            try {
                ftp.login(remoteUser, password);
            } catch (UncheckedIOException ioe) {
                loginSuceeded =(MyHelperClass)(Object) false;
                System.out.println("could not log on to " + remoteHost + " as user " + remoteUser);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setProject(MyHelperClass o0){ return null; }
	public MyHelperClass resolveFile(MyHelperClass o0){ return null; }
	public MyHelperClass executeTarget(String o0){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass setSeparator(MyHelperClass o0){ return null; }}

class FTPClient {

}
