


class c21868018 {
public MyHelperClass FileUtils;
	public MyHelperClass IOUtils;
	public MyHelperClass URLUtils;
	public MyHelperClass getServerUserPassword(){ return null; }
	public MyHelperClass getSearchBaseURL(){ return null; }
	public MyHelperClass getSearchRequestRelativeFilePath(){ return null; }
	public MyHelperClass getServerUserName(){ return null; }
	public MyHelperClass getSearchResponseRelativeFilePath(){ return null; }
	public MyHelperClass getProxyPort(){ return null; }
	public MyHelperClass getProxyHost(){ return null; }
	public MyHelperClass getUseProxy(){ return null; }

    public void process() throws Exception {
        String searchXML =(String)(Object) FileUtils.readFileToString(new File(getSearchRequestRelativeFilePath()));
        Map parametersMap =(Map)(Object) new HashMap();
        parametersMap.put("searchXML", searchXML);
        String proxyHost = null;
        int proxyPort = -1;
        String serverUserName = null;
        String serverUserPassword = null;
        FileOutputStream fos = null;
        if ((boolean)(Object)getUseProxy()) {
            serverUserName =(String)(Object) getServerUserName();
            serverUserPassword =(String)(Object) getServerUserPassword();
        }
        if ((boolean)(Object)getUseProxy()) {
            proxyHost =(String)(Object) getProxyHost();
            proxyPort =(int)(Object) getProxyPort();
        }
        try {
            InputStream responseInputStream =(InputStream)(Object) URLUtils.getHttpResponse(getSearchBaseURL(), serverUserName, serverUserPassword, URLUtils.HTTP_POST_METHOD, proxyHost, proxyPort, parametersMap, -1);
            fos = new FileOutputStream(getSearchResponseRelativeFilePath());
            IOUtils.copyLarge(responseInputStream, fos);
        } finally {
            if (null != fos) {
                fos.flush();
                fos.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_POST_METHOD;
public MyHelperClass getHttpResponse(MyHelperClass o0, String o1, String o2, MyHelperClass o3, String o4, int o5, Map o6, int o7){ return null; }
	public MyHelperClass readFileToString(File o0){ return null; }
	public MyHelperClass copyLarge(InputStream o0, FileOutputStream o1){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}}

class Map {

public MyHelperClass put(String o0, String o1){ return null; }}

class HashMap {

}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

}
