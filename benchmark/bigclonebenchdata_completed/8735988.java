


class c8735988 {
public MyHelperClass log;

    public synchronized void readProject(URL url, boolean addMembers) throws IOException {
        URL _url;// = new URL();
        _url = url;
        try {
            readProject((URL)(Object)url.openStream(), addMembers);
        } catch (IOException e) {
            log.info("Couldn't open InputStream in ArgoParser.load(" + url + ") " + e);
            e.printStackTrace();
            String lastLoadMessage;// = new String();
            lastLoadMessage = e.toString();
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
