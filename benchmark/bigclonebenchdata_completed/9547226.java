
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9547226 {
public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
public MyHelperClass index(MyHelperClass o0, String o1, int o2, String o3, String o4){ return null; }
	public MyHelperClass query(String o0, MyHelperClass o1){ return null; }

    public void testReplicateAfterWrite2Slave() throws Exception {
        int nDocs = 50;
        for (int i = 0; i < nDocs; i++) {
            MyHelperClass masterClient = new MyHelperClass();
            index(masterClient, "id", i, "name", "name = " + i);
        }
        MyHelperClass masterJetty = new MyHelperClass();
        String masterUrl = "http://localhost:" + masterJetty.getLocalPort() + "/solr/replication?command=disableReplication";
        URL url = new URL(masterUrl);
        InputStream stream =(InputStream)(Object) url.openStream();
        try {
            stream.close();
        } catch (UncheckedIOException e) {
        }
        MyHelperClass masterClient = new MyHelperClass();
        masterClient.commit();
//        MyHelperClass masterClient = new MyHelperClass();
        NamedList masterQueryRsp =(NamedList)(Object) query("*:*", masterClient);
        SolrDocumentList masterQueryResult = (SolrDocumentList)(SolrDocumentList)(Object) masterQueryRsp.get("response");
        assertEquals(nDocs, masterQueryResult.getNumFound());
        Thread.sleep(100);
        MyHelperClass slaveClient = new MyHelperClass();
        index(slaveClient, "id", 551, "name", "name = " + 551);
//        MyHelperClass slaveClient = new MyHelperClass();
        slaveClient.commit(true, true);
//        MyHelperClass slaveClient = new MyHelperClass();
        index(slaveClient, "id", 552, "name", "name = " + 552);
//        MyHelperClass slaveClient = new MyHelperClass();
        slaveClient.commit(true, true);
//        MyHelperClass slaveClient = new MyHelperClass();
        index(slaveClient, "id", 553, "name", "name = " + 553);
//        MyHelperClass slaveClient = new MyHelperClass();
        slaveClient.commit(true, true);
//        MyHelperClass slaveClient = new MyHelperClass();
        index(slaveClient, "id", 554, "name", "name = " + 554);
//        MyHelperClass slaveClient = new MyHelperClass();
        slaveClient.commit(true, true);
//        MyHelperClass slaveClient = new MyHelperClass();
        index(slaveClient, "id", 555, "name", "name = " + 555);
//        MyHelperClass slaveClient = new MyHelperClass();
        slaveClient.commit(true, true);
//        MyHelperClass slaveClient = new MyHelperClass();
        NamedList slaveQueryRsp =(NamedList)(Object) query("id:555", slaveClient);
        SolrDocumentList slaveQueryResult = (SolrDocumentList)(SolrDocumentList)(Object) slaveQueryRsp.get("response");
        assertEquals(1, slaveQueryResult.getNumFound());
//        MyHelperClass masterJetty = new MyHelperClass();
        masterUrl = "http://localhost:" + masterJetty.getLocalPort() + "/solr/replication?command=enableReplication";
        url = new URL(masterUrl);
        stream =(InputStream)(Object) url.openStream();
        try {
            stream.close();
        } catch (UncheckedIOException e) {
        }
        Thread.sleep(3000);
//        MyHelperClass slaveClient = new MyHelperClass();
        slaveQueryRsp =(NamedList)(Object) query("id:555", slaveClient);
        slaveQueryResult = (SolrDocumentList)(SolrDocumentList)(Object) slaveQueryRsp.get("response");
        assertEquals(0, slaveQueryResult.getNumFound());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLocalPort(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass commit(boolean o0, boolean o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class NamedList {

public MyHelperClass get(String o0){ return null; }}

class SolrDocumentList {

public MyHelperClass getNumFound(){ return null; }}
