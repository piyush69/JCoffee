


class c21295022 {

    public static Vector webService(String siteUrl, String login, String password, String table, String station, String element, String dayFrom, String dayTo, String filePath) throws Exception {
        Service service = new Service();
        Call call = (Call)(Call)(Object) service.createCall();
        if (login != null) {
            call.setUsername(login);
            if (password != null) {
                call.setPassword(password);
            }
            System.err.println("Info: authentication user=" + login + " passwd=" + password + " at " + siteUrl);
        }
        call.setTargetEndpointAddress(new URL(siteUrl));
        call.setOperationName("syncData");
        Vector exportList = (Vector)(Vector)(Object) call.invoke(new Object[] { table, station, element, dayFrom, dayTo });
        if (exportList != null) {
            for (int k = 0; k < (int)(Object)exportList.size(); k++) {
                HashMap exportDescr = (HashMap)(HashMap)(Object) exportList.get(k);
                String url = (String)(String)(Object) exportDescr.get("fileName");
                MyHelperClass log = new MyHelperClass();
                log.debug("result URL is " + url);
                String fileName = null;
                URL dataurl = new URL(url);
                String filePart =(String)(Object) dataurl.getFile();
                if (filePart == null) {
                    throw new Exception("Error: file part in the data URL is null");
                } else {
                    fileName = filePart.substring(filePart.lastIndexOf("/") < 0 ? 0 : filePart.lastIndexOf("/") + 1);
                    if (filePath != null) {
                        fileName = filePath + fileName;
                    }
//                    MyHelperClass log = new MyHelperClass();
                    log.debug("local file name is " + fileName);
                }
                FileOutputStream fos = new FileOutputStream(fileName);
                if (fos == null) {
                    throw new Exception("Error: file output stream is null");
                }
                InputStream strm =(InputStream)(Object) dataurl.openStream();
                if (strm == null) {
                    throw new Exception("Error: data input stream is null");
                } else {
                    int c;
                    while ((c =(int)(Object) strm.read()) != -1) {
                        fos.write(c);
                    }
                }
                strm.close();
                fos.close();
                File file = new File(fileName);
                exportDescr.put("fileName", file.getCanonicalPath());
            }
        }
        return exportList;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class Vector {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class Service {

public MyHelperClass createCall(){ return null; }}

class Call {

public MyHelperClass setTargetEndpointAddress(URL o0){ return null; }
	public MyHelperClass setPassword(String o0){ return null; }
	public MyHelperClass setOperationName(String o0){ return null; }
	public MyHelperClass setUsername(String o0){ return null; }
	public MyHelperClass invoke(Object[] o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class HashMap {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getCanonicalPath(){ return null; }}
