
import java.io.UncheckedIOException;


class c9547223 {
public MyHelperClass index(MyHelperClass o0, String o1, int o2, String o3, String o4){ return null; }
	public MyHelperClass query(String o0, MyHelperClass o1){ return null; }
public MyHelperClass slaveJetty;
	public MyHelperClass slaveClient;
	public MyHelperClass masterClient;
	public MyHelperClass assertEquals(Object o0, String o1){ return null; }

    public void testStopPoll() throws Exception {
        MyHelperClass masterClient = new MyHelperClass();
        for (int i = 0; i < 500; i++) index(masterClient, "id", i, "name", "name = " + i);
//        MyHelperClass masterClient = new MyHelperClass();
        masterClient.commit();
//        MyHelperClass masterClient = new MyHelperClass();
        NamedList masterQueryRsp =(NamedList)(Object) query("*:*", masterClient);
        SolrDocumentList masterQueryResult = (SolrDocumentList)(SolrDocumentList)(Object) masterQueryRsp.get("response");
        assertEquals(500,(String)(Object) masterQueryResult.getNumFound());
        Thread.sleep(3000);
        MyHelperClass slaveClient = new MyHelperClass();
        NamedList slaveQueryRsp =(NamedList)(Object) query("*:*", slaveClient);
        SolrDocumentList slaveQueryResult = (SolrDocumentList)(SolrDocumentList)(Object) slaveQueryRsp.get("response");
        assertEquals(500,(String)(Object) slaveQueryResult.getNumFound());
        MyHelperClass TestDistributedSearch = new MyHelperClass();
        String cmp =(String)(Object) TestDistributedSearch.compare(masterQueryResult, slaveQueryResult, 0, null);
        assertEquals(null, cmp);
        String masterUrl = "http://localhost:" + slaveJetty.getLocalPort() + "/solr/replication?command=disablepoll";
        URL url = new URL(masterUrl);
        InputStream stream =(InputStream)(Object) url.openStream();
        try {
            stream.close();
        } catch (UncheckedIOException e) {
        }
        index(masterClient, "id", 501, "name", "name = " + 501);
        masterClient.commit();
        Thread.sleep(3000);
        slaveQueryRsp =(NamedList)(Object) query("*:*", slaveClient);
        slaveQueryResult = (SolrDocumentList)(SolrDocumentList)(Object) slaveQueryRsp.get("response");
        assertEquals(500,(String)(Object) slaveQueryResult.getNumFound());
        slaveQueryRsp =(NamedList)(Object) query("*:*", masterClient);
        slaveQueryResult = (SolrDocumentList)(SolrDocumentList)(Object) slaveQueryRsp.get("response");
        assertEquals(501,(String)(Object) slaveQueryResult.getNumFound());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLocalPort(){ return null; }
	public MyHelperClass compare(SolrDocumentList o0, SolrDocumentList o1, int o2, Object o3){ return null; }
	public MyHelperClass commit(){ return null; }}

class NamedList {

public MyHelperClass get(String o0){ return null; }}

class SolrDocumentList {

public MyHelperClass getNumFound(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
