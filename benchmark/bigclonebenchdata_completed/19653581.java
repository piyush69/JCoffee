


class c19653581 {
public MyHelperClass logInfo(String o0){ return null; }
public MyHelperClass GeneralConstants;
	public MyHelperClass GeneralUtils;
	public MyHelperClass URLUtils;
	public MyHelperClass FileUtils;
	public MyHelperClass IOUtils;
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getSuspectsLoaderService(){ return null; }
	public MyHelperClass getUserName(){ return null; }
	public MyHelperClass getListName(){ return null; }
	public MyHelperClass getProxyPort(){ return null; }
	public MyHelperClass getDownloadDirectoryPath(){ return null; }
	public MyHelperClass getProxyHost(){ return null; }
	public MyHelperClass isLoggingInfo(){ return null; }
	public MyHelperClass getUseProxy(){ return null; }

    public List retrieve() throws Exception {
        BufferedOutputStream bos = null;
        try {
            String listFilePath =(String)(Object) GeneralUtils.generateAbsolutePath(getDownloadDirectoryPath(), getListName(), "/");
            listFilePath = listFilePath.concat(".xml");
            if (!(Boolean)(Object)new File(getDownloadDirectoryPath()).exists()) {
                FileUtils.forceMkdir(new File(getDownloadDirectoryPath()));
            }
            FileOutputStream listFileOutputStream = new FileOutputStream(listFilePath);
            bos = new BufferedOutputStream(listFileOutputStream);
            InputStream is = null;
            if ((boolean)(Object)getUseProxy()) {
                is =(InputStream)(Object) URLUtils.getResponse(getUrl(), getUserName(), getPassword(), URLUtils.HTTP_GET_METHOD, getProxyHost(), getProxyPort());
                IOUtils.copyLarge(is, bos);
            } else {
                URLUtils.getResponse(getUrl(), getUserName(), getPassword(), bos, null);
            }
            bos.flush();
            bos.close();
            File listFile = new File(listFilePath);
            if (!(Boolean)(Object)listFile.exists()) {
                throw new IllegalStateException("The list file did not get created");
            }
            if ((boolean)(Object)isLoggingInfo()) {
                logInfo("Downloaded list file : " + listFile);
            }
            List sfpsList =(List)(Object) new ArrayList();
            String loadType =(String)(Object) GeneralConstants.LOAD_TYPE_FULL;
            String feedType =(String)(Object) GeneralConstants.EMPTY_TOKEN;
            String listName =(String)(Object) getListName();
            String errorCode = "";
            String description = "";
            SuspectFileProcessingStatus sfps =(SuspectFileProcessingStatus)(Object) getSuspectsLoaderService().storeFileIntoListIncomingDir(listFile, loadType, feedType, listName, errorCode, description);
            sfpsList.add(sfps);
            if ((boolean)(Object)isLoggingInfo()) {
                logInfo("Retrieved list file with SuspectFileProcessingStatus: " + sfps);
            }
            return sfpsList;
        } finally {
            if (null != bos) {
                bos.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOAD_TYPE_FULL;
	public MyHelperClass EMPTY_TOKEN;
	public MyHelperClass HTTP_GET_METHOD;
public MyHelperClass copyLarge(InputStream o0, BufferedOutputStream o1){ return null; }
	public MyHelperClass getResponse(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4, MyHelperClass o5){ return null; }
	public MyHelperClass storeFileIntoListIncomingDir(File o0, String o1, String o2, String o3, String o4, String o5){ return null; }
	public MyHelperClass getResponse(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, BufferedOutputStream o3, Object o4){ return null; }
	public MyHelperClass generateAbsolutePath(MyHelperClass o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass forceMkdir(File o0){ return null; }}

class List {

public MyHelperClass add(SuspectFileProcessingStatus o0){ return null; }}

class SuspectFileProcessingStatus {

}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class InputStream {

}

class ArrayList {

}
