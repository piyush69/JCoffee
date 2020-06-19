


class c22884065 {
public MyHelperClass assertEquals(String o0, int o1, int o2){ return null; }
	public MyHelperClass fail(String o0){ return null; }

    public void testFidelity() throws ParserException, IOException {
        Lexer lexer;
        Node node;
        int position;
        StringBuffer buffer;
        String string;
        char[] ref;
        char[] test;
        URL url = new URL("http://sourceforge.net");
        lexer = new Lexer(url.openConnection());
        position = 0;
        buffer = new StringBuffer(80000);
        while (null != (node =(Node)(Object) lexer.nextNode())) {
            string =(String)(Object) node.toHtml();
            if (position != (int)(Object)node.getStartPosition()) fail("non-contiguous" + string);
            buffer.append(string);
            position =(int)(Object) node.getEndPosition();
            if (buffer.length() != position) fail("text length differed after encountering node " + string);
        }
        ref =(char[])(Object) lexer.getPage().getText().toCharArray();
        test = new char[buffer.length()];
        buffer.getChars(0, buffer.length(), test, 0);
        assertEquals("different amounts of text", ref.length, test.length);
        for (int i = 0; i < ref.length; i++) if (ref[i] != test[i]) fail("character differs at position " + i + ", expected <" + ref[i] + "> but was <" + test[i] + ">");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getText(){ return null; }
	public MyHelperClass toCharArray(){ return null; }}

class ParserException extends Exception{
	public ParserException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Lexer {

Lexer(MyHelperClass o0){}
	Lexer(){}
	public MyHelperClass getPage(){ return null; }
	public MyHelperClass nextNode(){ return null; }}

class Node {

public MyHelperClass toHtml(){ return null; }
	public MyHelperClass getEndPosition(){ return null; }
	public MyHelperClass getStartPosition(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
