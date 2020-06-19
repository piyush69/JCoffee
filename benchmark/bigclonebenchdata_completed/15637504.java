import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15637504 {
public MyHelperClass ConsoleLogger;
public MyHelperClass IOUtils;
	public MyHelperClass MQ_JCR_XML_NODETYPES_FILE;
	public MyHelperClass REMOTE_REPO_NAME;
	public MyHelperClass PWD;
	public MyHelperClass REPO_CONFIG_FILE;
	public MyHelperClass LOGIN;
	public MyHelperClass reg;
	public MyHelperClass WORKSPACE;
	public MyHelperClass Registry;
	public MyHelperClass LocateRegistry;
	public MyHelperClass JackrabbitInitializerHelper;
	public MyHelperClass logger;
	public MyHelperClass session;
	public MyHelperClass removeRepository(File o0){ return null; }

//    @Override
    protected void setUp() throws Exception {
        this.logger =(MyHelperClass)(Object) new ConsoleLogger(ConsoleLogger.LEVEL_WARN);
        File repoFolder = new File("target/repository");
        removeRepository(repoFolder);
        InputStream repoConfigIn = getClass().getResourceAsStream((String)(Object)REPO_CONFIG_FILE);
        File tempRepoConfigFile = File.createTempFile("repository", "xml");
        tempRepoConfigFile.deleteOnExit();
        OutputStream tempRepoConfigOut = new FileOutputStream(tempRepoConfigFile);
        try {
            IOUtils.copy(repoConfigIn, tempRepoConfigOut);
        } finally {
            repoConfigIn.close();
            tempRepoConfigOut.close();
        }
        Repository repo =(Repository)(Object) new TransientRepository(tempRepoConfigFile.getAbsolutePath(), "target/repository");
        ServerAdapterFactory factory = new ServerAdapterFactory();
        RemoteRepository remoteRepo =(RemoteRepository)(Object) factory.getRemoteRepository(repo);
        reg = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        reg.rebind(REMOTE_REPO_NAME, remoteRepo);
        session = repo.login(new SimpleCredentials(LOGIN, PWD.toCharArray()), WORKSPACE);
        InputStream nodeTypeDefIn = getClass().getResourceAsStream((String)(Object)MQ_JCR_XML_NODETYPES_FILE);
        JackrabbitInitializerHelper.setupRepository(session, new InputStreamReader(nodeTypeDefIn), "");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LEVEL_WARN;
	public MyHelperClass REGISTRY_PORT;
public MyHelperClass setupRepository(MyHelperClass o0, InputStreamReader o1, String o2){ return null; }
	public MyHelperClass createRegistry(MyHelperClass o0){ return null; }
	public MyHelperClass toCharArray(){ return null; }
	public MyHelperClass rebind(MyHelperClass o0, RemoteRepository o1){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class Repository {

public MyHelperClass login(SimpleCredentials o0, MyHelperClass o1){ return null; }}

class TransientRepository {

TransientRepository(String o0, String o1){}
	TransientRepository(){}}

class ServerAdapterFactory {

public MyHelperClass getRemoteRepository(Repository o0){ return null; }}

class RemoteRepository {

}

class SimpleCredentials {

SimpleCredentials(){}
	SimpleCredentials(MyHelperClass o0, MyHelperClass o1){}}

class ConsoleLogger {

ConsoleLogger(MyHelperClass o0){}
	ConsoleLogger(){}}
