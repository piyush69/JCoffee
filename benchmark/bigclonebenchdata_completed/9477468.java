


class c9477468 {
public MyHelperClass assertEquals(String o0, String o1){ return null; }

    public void test() throws Exception {
        StringDocument doc = new StringDocument("Test", "UTF-8");
        doc.open();
        try {
            assertEquals("UTF-8",(String)(Object) doc.getCharacterEncoding());
            assertEquals("Test",(String)(Object) doc.getText());
            InputStream input =(InputStream)(Object) doc.getInputStream();
            StringWriter writer = new StringWriter();
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(input, writer, "UTF-8");
            } finally {
                writer.close();
            }
            assertEquals("Test", writer.toString());
        } finally {
            doc.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, StringWriter o1, String o2){ return null; }}

class StringDocument {

StringDocument(){}
	StringDocument(String o0, String o1){}
	public MyHelperClass getCharacterEncoding(){ return null; }
	public MyHelperClass open(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getText(){ return null; }}

class InputStream {

}

class StringWriter {

public MyHelperClass close(){ return null; }}
