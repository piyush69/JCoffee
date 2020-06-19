


class c8868054 {

    private String getCurrentUniprotAccession(String accession) throws Exception {
        MyHelperClass UNIPROT_ENTRY_QUERY_STRING = new MyHelperClass();
        URL url = new URL(String.format((String)(Object)UNIPROT_ENTRY_QUERY_STRING, accession));
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        MyHelperClass HttpURLConnection = new MyHelperClass();
        HttpURLConnection.setFollowRedirects(true);
        connection.setRequestMethod("HEAD");
        connection.connect();
        if ((int)(Object)connection.getResponseCode() != 200) {
            MyHelperClass logger = new MyHelperClass();
            logger.debug("{} seems to be no UniProt accession", accession);
            throw new Exception("Missing UniProt entry for " + accession);
        }
        String effectiveUrl = connection.getURL().toString();
        String confirmedAccession = effectiveUrl.substring(effectiveUrl.lastIndexOf('/') + 1);
        MyHelperClass logger = new MyHelperClass();
        logger.debug("getCurrentUniprotAccession: {} -> {}", new Object[] { accession, confirmedAccession });
        return confirmedAccession;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0, String o1){ return null; }
	public MyHelperClass setFollowRedirects(boolean o0){ return null; }
	public MyHelperClass debug(String o0, Object[] o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getURL(){ return null; }}
