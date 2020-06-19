


class c19747820 {
public MyHelperClass getUrl(String o0){ return null; }

    public String parse(String term) throws OntologyAdaptorException {
        try {
            String sUrl =(String)(Object) getUrl(term);
            if (sUrl.length() > 0) {
                URL url = new URL(sUrl);
                InputStream in =(InputStream)(Object) url.openStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader r = new BufferedReader(new InputStreamReader(in));
                String line = null;
                while ((line =(String)(Object) r.readLine()) != null) {
                    if (sb.length() > 0) {
                        sb.append("\r\n");
                    }
                    sb.append(line);
                }
                return sb.toString();
            } else {
                return "";
            }
        } catch (Exception ex) {
            throw new OntologyAdaptorException("Convertion to lucene failed.", ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class OntologyAdaptorException extends Exception{
	public OntologyAdaptorException(String errorMessage) { super(errorMessage); }
	OntologyAdaptorException(String o0, Exception o1){}
	OntologyAdaptorException(){}
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
