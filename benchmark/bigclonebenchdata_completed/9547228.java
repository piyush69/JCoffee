


class c9547228 {
public MyHelperClass ReplicationHandler;

            public void run() {
                MyHelperClass masterJetty = new MyHelperClass();
                String masterUrl = "http://localhost:" + masterJetty.getLocalPort() + "/solr/replication?command=" + ReplicationHandler.CMD_BACKUP;
                URL url;
                InputStream stream = null;
                try {
                    url = new URL(masterUrl);
                    stream =(InputStream)(Object) url.openStream();
                    stream.close();
                } catch (Exception e) {
                    String fail;// = new String();
                    fail = e.getMessage();
                } finally {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(stream);
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CMD_BACKUP;
public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass getLocalPort(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
