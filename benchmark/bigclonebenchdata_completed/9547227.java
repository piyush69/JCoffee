import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9547227 {
public MyHelperClass createJetty(MyHelperClass o0){ return null; }
	public MyHelperClass createNewSolrServer(MyHelperClass o0){ return null; }
public MyHelperClass master;
	public MyHelperClass index(MyHelperClass o0, String o1, int o2, String o3, String o4){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }
public MyHelperClass fail(String o0){ return null; }
	public MyHelperClass assertEquals(int o0, int o1){ return null; }

    public void testBackup() throws Throwable, Exception {
        MyHelperClass masterJetty = new MyHelperClass();
        masterJetty.stop();
        MyHelperClass CONF_DIR = new MyHelperClass();
        copyFile(new File(CONF_DIR + "solrconfig-master1.xml"), new File((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)master.getConfDir(), "solrconfig.xml"));
//        MyHelperClass masterJetty = new MyHelperClass();
        masterJetty = createJetty(master);
        MyHelperClass masterClient = new MyHelperClass();
        masterClient = createNewSolrServer(masterJetty.getLocalPort());
//        MyHelperClass masterClient = new MyHelperClass();
        for (int i = 0; i < 500; i++) index(masterClient, "id", i, "name", "name = " + i);
//        MyHelperClass masterClient = new MyHelperClass();
        masterClient.commit();
        class BackupThread extends Thread {

            volatile String fail = null;

            public void run() {
                MyHelperClass masterJetty = new MyHelperClass();
                MyHelperClass ReplicationHandler = new MyHelperClass();
                String masterUrl = "http://localhost:" + masterJetty.getLocalPort() + "/solr/replication?command=" + ReplicationHandler.CMD_BACKUP;
                URL url;
                InputStream stream = null;
                try {
                    url = new URL(masterUrl);
                    stream = url.openStream();
                    stream.close();
                } catch (Exception e) {
                    fail = e.getMessage();
                } finally {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(stream);
                }
            }

            ;
        }
        ;
        BackupThread backupThread = new BackupThread();
        backupThread.start();
        MyHelperClass master = new MyHelperClass();
        File dataDir = new File((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)master.getDataDir());
        class CheckStatus extends Thread {

            volatile String fail = null;

            volatile String response = null;

            volatile boolean success = false;

            public void run() {
                MyHelperClass masterJetty = new MyHelperClass();
                MyHelperClass ReplicationHandler = new MyHelperClass();
                String masterUrl = "http://localhost:" + masterJetty.getLocalPort() + "/solr/replication?command=" + ReplicationHandler.CMD_DETAILS;
                URL url;
                InputStream stream = null;
                try {
                    url = new URL(masterUrl);
                    stream = url.openStream();
                    MyHelperClass IOUtils = new MyHelperClass();
                    response = IOUtils.toString(stream);
                    if (response.contains("<str name=\"status\">success</str>")) {
                        success = true;
                    }
                    stream.close();
                } catch (Exception e) {
                    fail = e.getMessage();
                } finally {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(stream);
                }
            }

            ;
        }
        ;
        int waitCnt = 0;
        CheckStatus checkStatus = new CheckStatus();
        while (true) {
            checkStatus.run();
            if (checkStatus.fail != null) {
                fail(checkStatus.fail);
            }
            if (checkStatus.success) {
                break;
            }
            Thread.sleep(200);
            if (waitCnt == 10) {
                fail("Backup success not detected:" + checkStatus.response);
            }
            waitCnt++;
        }
        if (backupThread.fail != null) {
            fail(backupThread.fail);
        }
        File[] files = dataDir.listFiles(new FilenameFilter() {

            public boolean accept(File dir, String name) {
                if (name.startsWith("snapshot")) {
                    return true;
                }
                return false;
            }
        });
        assertEquals(1, files.length);
        File snapDir = files[0];
        IndexSearcher searcher = new IndexSearcher(new SimpleFSDirectory(snapDir.getAbsoluteFile(), null), true);
        TopDocs hits =(TopDocs)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) searcher.search(new MatchAllDocsQuery(), 1);
        assertEquals(500,(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) hits.totalHits);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CMD_DETAILS;
	public MyHelperClass CMD_BACKUP;
public MyHelperClass getLocalPort(){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass stop(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass getDataDir(){ return null; }
	public MyHelperClass getConfDir(){ return null; }}

class IndexSearcher {

IndexSearcher(SimpleFSDirectory o0, boolean o1){}
	IndexSearcher(){}
	public MyHelperClass search(MatchAllDocsQuery o0, int o1){ return null; }}

class SimpleFSDirectory {

SimpleFSDirectory(File o0, Object o1){}
	SimpleFSDirectory(){}}

class TopDocs {
public MyHelperClass totalHits;
}

class MatchAllDocsQuery {

}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
