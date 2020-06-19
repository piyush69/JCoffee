


class c10088166 {
public MyHelperClass assertEquals(String o0, String o1){ return null; }

//    @Test
    public void testTrim() throws Exception {
        MyHelperClass TestUtil = new MyHelperClass();
        TreeNode ast =(TreeNode)(Object) TestUtil.readFileInAST("resources/SimpleTestFile.java");
        DecoratorSelection ds = new DecoratorSelection();
        XmlFileSystemRepository rep = new XmlFileSystemRepository();
        XmlToFormatContentConverter converter = new XmlToFormatContentConverter(rep);
        URI url =(URI)(Object) (new File("resources/javaDefaultFormats.xml").toURI());
        InputStream is =(InputStream)(Object) url.toURL().openStream();
        converter.convert(is);
        File f =(File)(Object) (new File("resources/javaDefaultFormats.xml").getAbsoluteFile());
        converter.convert(f);
        String string =(String)(Object) (new File("resources/query.xml").getAbsolutePath());
        MyHelperClass XmlUtil = new MyHelperClass();
        Document qDoc =(Document)(Object) XmlUtil.loadXmlFromFile(string);
        Query query = new Query(qDoc);
        MyHelperClass XfsrFormatManager = new MyHelperClass();
        Format format =(Format)(Object) XfsrFormatManager.getInstance().getFormats("java", "signature only");
        MyHelperClass TokenAutoTrimmer = new MyHelperClass();
        TokenAutoTrimmer.create("Java", "resources/java.autotrim");
        Document doc =(Document)(Object) rep.getXmlContentTree(ast, query, format, ds).getOwnerDocument();
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><sourcecode>main(String[])</sourcecode>";
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
//        MyHelperClass XmlUtil = new MyHelperClass();
        XmlUtil.outputXml(doc, bout);
        String actual = bout.toString();
        assertEquals(expected, actual);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getFormats(String o0, String o1){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass outputXml(Document o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass loadXmlFromFile(String o0){ return null; }
	public MyHelperClass readFileInAST(String o0){ return null; }
	public MyHelperClass getOwnerDocument(){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass create(String o0, String o1){ return null; }}

class Test {

}

class TreeNode {

}

class DecoratorSelection {

}

class XmlFileSystemRepository {

public MyHelperClass getXmlContentTree(TreeNode o0, Query o1, Format o2, DecoratorSelection o3){ return null; }}

class XmlToFormatContentConverter {

XmlToFormatContentConverter(){}
	XmlToFormatContentConverter(XmlFileSystemRepository o0){}
	public MyHelperClass convert(File o0){ return null; }
	public MyHelperClass convert(InputStream o0){ return null; }}

class URI {

public MyHelperClass toURL(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getAbsoluteFile(){ return null; }
	public MyHelperClass toURI(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class InputStream {

}

class Document {

}

class Query {

Query(){}
	Query(Document o0){}}

class Format {

}

class ByteArrayOutputStream {

}
