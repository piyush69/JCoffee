


class c9398635 {

    public byte[] downloadAttachmentContent(Attachment issueAttachment) throws IOException {
        byte[] result = null;
        URL url = new URL(issueAttachment.getContentURL());
        BufferedReader inputReader = null;
        try {
            inputReader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder contentBuilder = new StringBuilder();
            String line;
            while ((line =(String)(Object) inputReader.readLine()) != null) {
                contentBuilder.append(line);
            }
            result = contentBuilder.toString().getBytes();
        } finally {
            if (inputReader != null) {
                inputReader.close();
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Attachment {

public MyHelperClass getContentURL(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
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
