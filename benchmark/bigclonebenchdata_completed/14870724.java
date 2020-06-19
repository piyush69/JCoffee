


class c14870724 {

    private void readURL(URL url) throws IOException {
        MyHelperClass statusLine = new MyHelperClass();
        statusLine.setText("Opening " + url.toExternalForm());
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        StringBuffer buffer = new StringBuffer();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line =(String)(Object) in.readLine()) != null) {
                buffer.append(line).append('\n');
//                MyHelperClass statusLine = new MyHelperClass();
                statusLine.setText("Read " + buffer.length() + " bytes...");
            }
        } finally {
            if (in != null) in.close();
        }
        String type =(String)(Object) connection.getContentType();
        if (type == null) type = "text/plain";
//        MyHelperClass statusLine = new MyHelperClass();
        statusLine.setText("Content type " + type);
        MyHelperClass content = new MyHelperClass();
        content.setContentType(type);
//        MyHelperClass content = new MyHelperClass();
        content.setText(buffer.toString());
//        MyHelperClass statusLine = new MyHelperClass();
        statusLine.setText("Done");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
