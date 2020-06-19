


class c22259089 {

    private ChangeCapsule fetchServer(OWLOntology ontologyURI, Long sequenceNumber) throws IOException {
        MyHelperClass InetAddress = new MyHelperClass();
        String requestString = "http://" + InetAddress.getLocalHost().getHostName() + ":8080/ChangeServer";
        MyHelperClass URLEncoder = new MyHelperClass();
        requestString += "?fetch=" + URLEncoder.encode(ontologyURI.getURI().toString(), "UTF-8");
        requestString += "&number" + sequenceNumber;
        URL url = new URL(requestString);
        BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuffer returned = new StringBuffer();
        String str;
        while (null != ((str =(String)(Object) input.readLine()))) {
            returned.append(str);
        }
        input.close();
        ChangeCapsule cp = new ChangeCapsule(returned.toString());
        return cp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getHostName(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass getLocalHost(){ return null; }}

class OWLOntology {

public MyHelperClass getURI(){ return null; }}

class ChangeCapsule {

ChangeCapsule(String o0){}
	ChangeCapsule(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
