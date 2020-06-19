


class c3493863 {
public MyHelperClass GoogleDownloadLinkGenerator;
	public MyHelperClass uploadedKbDocumentID;
	public MyHelperClass fail(String o0){ return null; }

//    @Test
    public void testDocumentDownloadKnowledgeBase() throws IOException {
        MyHelperClass uploadedKbDocumentID = new MyHelperClass();
        if (uploadedKbDocumentID == null) {
            fail("Document Upload Test should run first");
        }
        String downloadLink =(String)(Object) GoogleDownloadLinkGenerator.generateTextDownloadLink(uploadedKbDocumentID);
        URL url = new URL(downloadLink);
        URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
        urlConnection.connect();
        InputStream input =(InputStream)(Object) url.openStream();
        FileWriter fw = new FileWriter("tmpOutput.kb");
        Reader reader =(Reader)(Object) new InputStreamReader(input);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String strLine = "";
        int count = 0;
        while (count < 10000) {
            strLine =(String)(Object) bufferedReader.readLine();
            if (strLine != null && strLine != "") {
                fw.write(strLine);
            }
            count++;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass generateTextDownloadLink(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Test {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class URLConnection {

public MyHelperClass connect(){ return null; }}

class InputStream {

}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}
	public MyHelperClass write(String o0){ return null; }}

class Reader {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(Reader o0){}
	public MyHelperClass readLine(){ return null; }}
