


class c10540679 {

    private static void downloadFile(String downloadFileName) throws Exception {
        URL getFileUrl = new URL("http://www.tegsoft.com/Tobe/getFile" + "?tegsoftFileName=" + downloadFileName);
        URLConnection getFileUrlConnection =(URLConnection)(Object) getFileUrl.openConnection();
        InputStream is =(InputStream)(Object) getFileUrlConnection.getInputStream();
        MyHelperClass UiUtil = new MyHelperClass();
        String tobeHome =(String)(Object) UiUtil.getParameter("RealPath.Context");
        OutputStream out =(OutputStream)(Object) new FileOutputStream(tobeHome + "/setup/" + downloadFileName);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(is, out);
        is.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
