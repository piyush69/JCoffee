


class c21680551 {

    private static File createTempWebXml(Class portletClass, File portletDir, String appName, String portletName) throws IOException, FileNotFoundException {
        File pathToWebInf = new File(portletDir, "WEB-INF");
        MyHelperClass File = new MyHelperClass();
        File tempWebXml =(File)(Object) File.createTempFile("web", ".xml", pathToWebInf);
        tempWebXml.deleteOnExit();
        OutputStream webOutputStream =(OutputStream)(Object) new FileOutputStream(tempWebXml);
        MyHelperClass WEB_XML_STREAM_FACTORY = new MyHelperClass();
        PortletUnitWebXmlStream streamSource =(PortletUnitWebXmlStream)(Object) WEB_XML_STREAM_FACTORY;
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(streamSource.createStream(portletClass, appName, portletName), webOutputStream);
        webOutputStream.close();
        return tempWebXml;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, String o1, File o2){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass deleteOnExit(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class PortletUnitWebXmlStream {

public MyHelperClass createStream(Class o0, String o1, String o2){ return null; }}
