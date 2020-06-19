import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16236980 {
public MyHelperClass assertNotNull(MyHelperClass o0){ return null; }
public MyHelperClass srbGsiPortMax;
	public MyHelperClass irodsEncryptZone;
	public MyHelperClass irodsGsiZone;
	public MyHelperClass srbEncryptMcatZone;
	public MyHelperClass useIrodsEncryptCopyTest;
	public MyHelperClass irodsEncryptPassword;
	public MyHelperClass srbGsiDefaultResource;
	public MyHelperClass srbGsiPort;
	public MyHelperClass assertContentInWriteTests;
	public MyHelperClass irodsEncryptPort;
	public MyHelperClass Level;
	public MyHelperClass httpProxy;
	public MyHelperClass srbEncryptDefaultResource;
	public MyHelperClass srbEncryptPassword;
	public MyHelperClass srbEncryptPort;
	public MyHelperClass irodsEncryptHomeDirectory;
	public MyHelperClass useSrbEncryptInFsCopyTest;
	public MyHelperClass irodsEncryptUsername;
	public MyHelperClass srbEncryptMdasDomainName;
	public MyHelperClass gridftpHost1;
	public MyHelperClass srbEncryptPortMin;
	public MyHelperClass sftpPath;
	public MyHelperClass srbEncryptHost;
	public MyHelperClass srbEncryptPortMax;
	public MyHelperClass fileUri;
	public MyHelperClass srbQueryTimeout;
	public MyHelperClass irodsEncryptResource;
	public MyHelperClass Logger;
	public MyHelperClass httpUri;
	public MyHelperClass useGridftpHost2InFsCopyTest;
	public MyHelperClass useIrodsGsiCopyTest;
	public MyHelperClass srbEncryptUsername;
	public MyHelperClass proxyCertificatePath;
	public MyHelperClass irodsGsiHost;
	public MyHelperClass gridftpTimeoutMilliSecs;
	public MyHelperClass idleTimeTestDelay;
	public MyHelperClass srbEncryptHomeDirectory;
	public MyHelperClass sftpPort;
	public MyHelperClass dummyFileDirName;
	public MyHelperClass useLocalFileInFsCopyTest;
	public MyHelperClass gridftpHost2;
	public MyHelperClass sftpTimeoutMilliSecs;
	public MyHelperClass gridftpPort2;
	public MyHelperClass ftpUri;
	public MyHelperClass useGridftpHost1InFsCopyTest;
	public MyHelperClass sftpHost;
	public MyHelperClass httpPort;
	public MyHelperClass useSrbGsiInFsCopyTest;
	public MyHelperClass gridftpPort1;
	public MyHelperClass useSftpInFsCopyTest;
	public MyHelperClass sftpPassword;
	public MyHelperClass irodsGsiPort;
	public MyHelperClass sftpUsername;
	public MyHelperClass srbGsiPortMin;
	public MyHelperClass srbGsiHost;
	public MyHelperClass irodsEncryptHost;
	public MyHelperClass fail(String o0){ return null; }

    public void loadProperties()  throws Throwable {
        try {
            java.util.Properties props = new java.util.Properties();
            java.net.URL url = ClassLoader.getSystemResource("env.properties");
            props.load(url.openStream());
            this.proxyCertificatePath =(MyHelperClass)(Object) props.getProperty("proxy.certificate.path");
            this.dummyFileDirName =(MyHelperClass)(Object) props.getProperty("delete.dummyFileDirName");
            this.idleTimeTestDelay =(MyHelperClass)(Object) new Integer(props.getProperty("idleTimeTestDelaySeconds"));
            if (props.getProperty("gridftp.timeoutMilliSecs") != null) {
                this.gridftpTimeoutMilliSecs =(MyHelperClass)(Object) new Integer(props.getProperty("gridftp.timeoutMilliSecs").trim());
            }
            this.assertContentInWriteTests =(MyHelperClass)(Object) new Boolean(props.getProperty("assertContentInWriteTests"));
            this.gridftpHost1 =(MyHelperClass)(Object) props.getProperty("gridftp.host1");
            this.gridftpPort1 =(MyHelperClass)(Object) new Integer(props.getProperty("gridftp.port1"));
            this.gridftpHost2 =(MyHelperClass)(Object) props.getProperty("gridftp.host2");
            this.gridftpPort2 =(MyHelperClass)(Object) new Integer(props.getProperty("gridftp.port2"));
            this.srbGsiHost =(MyHelperClass)(Object) props.getProperty("srb.gsi.host");
            this.srbGsiPort =(MyHelperClass)(Object) new Integer(props.getProperty("srb.gsi.port"));
            this.srbGsiPortMin =(MyHelperClass)(Object) new Integer(props.getProperty("srb.gsi.port.min"));
            this.srbGsiPortMax =(MyHelperClass)(Object) new Integer(props.getProperty("srb.gsi.port.max"));
            this.srbGsiDefaultResource =(MyHelperClass)(Object) props.getProperty("srb.gsi.defaultResource");
            this.srbEncryptHost =(MyHelperClass)(Object) props.getProperty("srb.encrypt.host");
            this.srbEncryptPort =(MyHelperClass)(Object) new Integer(props.getProperty("srb.encrypt.port"));
            this.srbEncryptPortMin =(MyHelperClass)(Object) new Integer(props.getProperty("srb.encrypt.port.min"));
            this.srbEncryptPortMax =(MyHelperClass)(Object) new Integer(props.getProperty("srb.encrypt.port.max"));
            this.srbEncryptDefaultResource =(MyHelperClass)(Object) props.getProperty("srb.encrypt.defaultResource");
            this.srbEncryptHomeDirectory =(MyHelperClass)(Object) props.getProperty("srb.encrypt.homeDirectory");
            this.srbEncryptMcatZone =(MyHelperClass)(Object) props.getProperty("srb.encrypt.mcatZone");
            this.srbEncryptMdasDomainName =(MyHelperClass)(Object) props.getProperty("srb.encrypt.mdasDomainName");
            this.srbEncryptUsername =(MyHelperClass)(Object) props.getProperty("srb.encrypt.username");
            this.srbEncryptPassword =(MyHelperClass)(Object) props.getProperty("srb.encrypt.password");
            this.sftpHost =(MyHelperClass)(Object) props.getProperty("sftp.host");
            this.sftpPort =(MyHelperClass)(Object) new Integer(props.getProperty("sftp.port"));
            this.sftpPath =(MyHelperClass)(Object) props.getProperty("sftp.path");
            this.sftpUsername =(MyHelperClass)(Object) props.getProperty("sftp.username");
            this.sftpPassword =(MyHelperClass)(Object) props.getProperty("sftp.password");
            if (props.getProperty("sftp.timeoutMilliSecs") != null) {
                this.sftpTimeoutMilliSecs =(MyHelperClass)(Object) new Integer(props.getProperty("sftp.timeoutMilliSecs").trim());
            }
            irodsEncryptHost =(MyHelperClass)(Object) props.getProperty("irods.encrypt.host");
            irodsEncryptPort =(MyHelperClass)(Object) new Integer(props.getProperty("irods.encrypt.port"));
            irodsEncryptResource =(MyHelperClass)(Object) props.getProperty("irods.encrypt.defaultResource");
            irodsEncryptHomeDirectory =(MyHelperClass)(Object) props.getProperty("irods.encrypt.homeDirectory");
            irodsEncryptZone =(MyHelperClass)(Object) props.getProperty("irods.encrypt.zone");
            irodsEncryptUsername =(MyHelperClass)(Object) props.getProperty("irods.encrypt.username");
            irodsEncryptPassword =(MyHelperClass)(Object) props.getProperty("irods.encrypt.password");
            irodsGsiHost =(MyHelperClass)(Object) props.getProperty("irods.gsi.host");
            irodsGsiPort =(MyHelperClass)(Object) new Integer(props.getProperty("irods.gsi.port"));
            irodsGsiZone =(MyHelperClass)(Object) props.getProperty("irods.gsi.zone");
            srbQueryTimeout =(MyHelperClass)(Object) new Integer(props.getProperty("srb.query.timeout"));
            this.ftpUri =(MyHelperClass)(Object) props.getProperty("ftp.uri");
            this.httpUri =(MyHelperClass)(Object) props.getProperty("http.uri");
            this.httpProxy =(MyHelperClass)(Object) props.getProperty("http.proxy");
            this.httpPort =(MyHelperClass)(Object) new Integer(props.getProperty("http.port"));
            this.fileUri =(MyHelperClass)(Object) props.getProperty("file.uri");
            java.net.URI tempUri = new java.net.URI((String)(Object)this.fileUri);
            File f = new File(tempUri);
            if (!f.exists()) {
                String temp = System.getProperty("java.io.tmpdir");
                System.out.println("Cannot list [" + fileUri + "] listing java.io.tmpdir instead [" + temp + "]");
                this.fileUri =(MyHelperClass)(Object) temp;
            }
            useSrbGsiInFsCopyTest =(MyHelperClass)(Object) new Boolean(props.getProperty("srb.gsi.use.in.fs.copy.test"));
            useSrbEncryptInFsCopyTest =(MyHelperClass)(Object) new Boolean(props.getProperty("srb.encrypt.use.in.fs.copy.test"));
            useGridftpHost1InFsCopyTest =(MyHelperClass)(Object) new Boolean(props.getProperty("gridftp.host1.use.in.fs.copy.test"));
            useGridftpHost2InFsCopyTest =(MyHelperClass)(Object) new Boolean(props.getProperty("gridftp.host2.use.in.fs.copy.test"));
            useSftpInFsCopyTest =(MyHelperClass)(Object) new Boolean(props.getProperty("sftp.use.in.fs.copy.test"));
            useLocalFileInFsCopyTest =(MyHelperClass)(Object) new Boolean(props.getProperty("file.use.in.fs.copy.test"));
            useIrodsGsiCopyTest =(MyHelperClass)(Object) new Boolean(props.getProperty("irods.gsi.use.in.fs.copy.test"));
            useIrodsEncryptCopyTest =(MyHelperClass)(Object) new Boolean(props.getProperty("irods.encrypt.use.in.fs.copy.test"));
            assertNotNull(this.proxyCertificatePath);
            assertNotNull(this.dummyFileDirName);
            assertNotNull(this.idleTimeTestDelay);
            assertNotNull(this.ftpUri);
            assertNotNull(this.httpUri);
        } catch (Exception ex) {
            Logger.getLogger(AbstractTestClass.class.getName()).log(Level.SEVERE, null, ex);
            fail("Unable to locate and load 'testsettings.properties' file in source " + ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, Exception o2){ return null; }}

class AbstractTestClass {

}
