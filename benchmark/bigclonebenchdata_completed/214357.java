


class c214357 {
public MyHelperClass getString(String o0){ return null; }

    public void loadSourceCode() {
        MyHelperClass MAX_SOURCE_LENGTH = new MyHelperClass();
        int length =(int)(Object) MAX_SOURCE_LENGTH;
        try {
            MyHelperClass filename = new MyHelperClass();
            File file = new File(filename);
            length = (int)(int)(Object) file.length();
        } catch (SecurityException ex) {
        }
        char[] buff = new char[length];
        InputStream is;
        InputStreamReader isr;
        CodeViewer cv = new CodeViewer();
        URL url;
        try {
            MyHelperClass filename = new MyHelperClass();
            url =(URL)(Object) getClass().getResource((String)(Object)filename);
            is =(InputStream)(Object) url.openStream();
            isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            String sourceCode;// = new String();
            sourceCode = new String("<html><pre>");
            String line =(String)(Object) reader.readLine();
            while (line != null) {
//                MyHelperClass sourceCode = new MyHelperClass();
                sourceCode += cv.syntaxHighlight(line) + " \n ";
                line =(String)(Object) reader.readLine();
            }
//            MyHelperClass sourceCode = new MyHelperClass();
            sourceCode += "</pre></html>";
        } catch (Exception ex) {
            MyHelperClass sourceCode = new MyHelperClass();
            sourceCode = getString("SourceCode.error");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass length(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class CodeViewer {

public MyHelperClass syntaxHighlight(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}
