


class c18238468 {

//    @Test
    public void testLoadSource() throws IOException {
        ArticleMetadata metadata = new ArticleMetadata();
        metadata.setId("http://arxiv.org/abs/math/0205003v1");
        MyHelperClass arxivDAOFacade = new MyHelperClass();
        InputStream inputStream =(InputStream)(Object) arxivDAOFacade.loadSource(metadata);
        MyHelperClass Assert = new MyHelperClass();
        Assert.assertNotNull(inputStream);
        StringWriter writer = new StringWriter();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(inputStream, writer, "utf8");
        String contents = writer.toString();
//        MyHelperClass Assert = new MyHelperClass();
        Assert.assertTrue(contents.contains("A strengthening of the Nyman"));
        inputStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass assertTrue(boolean o0){ return null; }
	public MyHelperClass loadSource(ArticleMetadata o0){ return null; }
	public MyHelperClass assertNotNull(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1, String o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Test {

}

class ArticleMetadata {

public MyHelperClass setId(String o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class StringWriter {

}
