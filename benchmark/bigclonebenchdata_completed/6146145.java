


class c6146145 {
public MyHelperClass LOG;
	public MyHelperClass IOUtils;
	public MyHelperClass FileUtils;
	public MyHelperClass assertEquals(String o0, String o1){ return null; }
	public MyHelperClass assertNull(String o0){ return null; }
	public MyHelperClass assertNull(Object o0){ return null; }
	public MyHelperClass assertNull(byte[] o0){ return null; }
	public MyHelperClass assertNotNull(String o0){ return null; }
	public MyHelperClass assertNotNull(byte[] o0){ return null; }

    public void testSystemPropertyConnector() throws Exception {
        final String rootFolderPath = "test/ConnectorTest/fs/".toLowerCase();
        final Connector connector =(Connector)(Object) new SystemPropertyConnector();
        final ContentResolver contentResolver =(ContentResolver)(Object) new UnionContentResolver();
        final FSContentResolver fsContentResolver = new FSContentResolver();
        fsContentResolver.setRootFolderPath(rootFolderPath);
        contentResolver.addContentResolver(fsContentResolver);
        contentResolver.addContentResolver(new ClasspathContentResolver());
        connector.setContentResolver(contentResolver);
        String resultString;
        byte[] resultContent;
        Object resultObject;
        resultString =(String)(Object) connector.getString("helloWorldPath");
        assertNull(resultString);
        resultContent =(byte[])(Object) connector.getContent("helloWorldPath");
        assertNull(resultContent);
        resultObject = connector.getObject("helloWorldPath");
        assertNull(resultObject);
        System.setProperty("helloWorldPath", "org/settings4j/connector/HelloWorld2.txt");
        resultString =(String)(Object) connector.getString("helloWorldPath");
        assertNotNull(resultString);
        assertEquals("org/settings4j/connector/HelloWorld2.txt", resultString);
        resultContent =(byte[])(Object) connector.getContent("helloWorldPath");
        assertNotNull(resultContent);
        assertEquals("Hello World 2", new String(resultContent, "UTF-8"));
        resultObject = connector.getObject("helloWorldPath");
        assertNull(resultObject);
        System.setProperty("helloWorldPath", "file:org/settings4j/connector/HelloWorld2.txt");
        resultString =(String)(Object) connector.getString("helloWorldPath");
        assertNotNull(resultString);
        assertEquals("file:org/settings4j/connector/HelloWorld2.txt", resultString);
        resultContent =(byte[])(Object) connector.getContent("helloWorldPath");
        assertNull(resultObject);
        resultObject = connector.getObject("helloWorldPath");
        assertNull(resultObject);
        System.setProperty("helloWorldPath", "classpath:org/settings4j/connector/HelloWorld2.txt");
        resultString =(String)(Object) connector.getString("helloWorldPath");
        assertNotNull(resultString);
        assertEquals("classpath:org/settings4j/connector/HelloWorld2.txt", resultString);
        resultContent =(byte[])(Object) connector.getContent("helloWorldPath");
        assertNotNull(resultContent);
        assertEquals("Hello World 2", new String(resultContent, "UTF-8"));
        resultObject = connector.getObject("helloWorldPath");
        assertNull(resultObject);
        final InputStream helloWorldIS =(InputStream)(Object) new ByteArrayInputStream("Hello World 2 - Test".getBytes("UTF-8"));
        FileUtils.forceMkdir(new File(rootFolderPath + "/org/settings4j/connector"));
        final String helloWorldPath = rootFolderPath + "/org/settings4j/connector/HelloWorld2.txt";
        final FileOutputStream fileOutputStream = new FileOutputStream(new File(helloWorldPath));
        IOUtils.copy(helloWorldIS, fileOutputStream);
        IOUtils.closeQuietly(helloWorldIS);
        IOUtils.closeQuietly(fileOutputStream);
        LOG.info("helloWorld2Path: " + helloWorldPath);
        System.setProperty("helloWorldPath", "file:org/settings4j/connector/HelloWorld2.txt");
        resultString =(String)(Object) connector.getString("helloWorldPath");
        assertNotNull(resultString);
        assertEquals("file:org/settings4j/connector/HelloWorld2.txt", resultString);
        resultContent =(byte[])(Object) connector.getContent("helloWorldPath");
        assertNotNull(resultContent);
        assertEquals("Hello World 2 - Test", new String(resultContent, "UTF-8"));
        resultObject = connector.getObject("helloWorldPath");
        assertNull(resultObject);
        System.setProperty("helloWorldPath", "org/settings4j/connector/HelloWorld2.txt");
        resultString =(String)(Object) connector.getString("helloWorldPath");
        assertNotNull(resultString);
        assertEquals("org/settings4j/connector/HelloWorld2.txt", resultString);
        resultContent =(byte[])(Object) connector.getContent("helloWorldPath");
        resultContent =(byte[])(Object) connector.getContent("helloWorldPath");
        assertNotNull(resultContent);
        assertEquals("Hello World 2 - Test", new String(resultContent, "UTF-8"));
        resultObject = connector.getObject("helloWorldPath");
        assertNull(resultObject);
        System.setProperty("helloWorldPath", "classpath:org/settings4j/connector/HelloWorld2.txt");
        resultString =(String)(Object) connector.getString("helloWorldPath");
        assertNotNull(resultString);
        assertEquals("classpath:org/settings4j/connector/HelloWorld2.txt", resultString);
        resultContent =(byte[])(Object) connector.getContent("helloWorldPath");
        assertNotNull(resultContent);
        assertEquals("Hello World 2", new String(resultContent, "UTF-8"));
        resultObject = connector.getObject("helloWorldPath");
        assertNull(resultObject);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass forceMkdir(File o0){ return null; }}

class Connector {

public MyHelperClass getContent(String o0){ return null; }
	public MyHelperClass getObject(String o0){ return null; }
	public MyHelperClass setContentResolver(ContentResolver o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class SystemPropertyConnector {

}

class ContentResolver {

public MyHelperClass addContentResolver(ClasspathContentResolver o0){ return null; }
	public MyHelperClass addContentResolver(FSContentResolver o0){ return null; }}

class UnionContentResolver {

}

class FSContentResolver {

public MyHelperClass setRootFolderPath(String o0){ return null; }}

class ClasspathContentResolver {

}

class InputStream {

}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class File {

File(String o0){}
	File(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
