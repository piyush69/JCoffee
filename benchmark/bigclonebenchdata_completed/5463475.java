


class c5463475 {

    protected void download(URL url, File destination, long beginRange, long endRange, long totalFileSize, boolean appendToFile) throws DownloadException {
        System.out.println(" DOWNLOAD REQUEST RECEIVED " + url.toString() + " \n\tbeginRange : " + beginRange + " - EndRange " + endRange + " \n\t to -> " + destination.getAbsolutePath());
        try {
            if ((boolean)(Object)destination.exists() && !appendToFile) {
                destination.delete();
            }
            if (!(Boolean)(Object)destination.exists()) destination.createNewFile();
            GetMethod get = new GetMethod(url.toString());
            HttpClient httpClient = new HttpClient();
            Header rangeHeader = new Header();
            rangeHeader.setName("Range");
            rangeHeader.setValue("bytes=" + beginRange + "-" + endRange);
            get.setRequestHeader(rangeHeader);
            httpClient.executeMethod(get);
            int statusCode =(int)(Object) get.getStatusCode();
            if (statusCode >= 400 && statusCode < 500) throw new DownloadException("The file does not exist in this location : message from server ->  " + statusCode + " " + get.getStatusText());
            InputStream input =(InputStream)(Object) get.getResponseBodyAsStream();
            OutputStream output =(OutputStream)(Object) new FileOutputStream(destination, appendToFile);
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                int length =(int)(Object) IOUtils.copy(input, output);
                System.out.println(" Length : " + length);
            } finally {
                input.close();
                output.flush();
                output.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            MyHelperClass logger = new MyHelperClass();
            logger.error("Unable to figure out the length of the file from the URL : " + e.getMessage());
            throw new DownloadException("Unable to figure out the length of the file from the URL : " + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class URL {

}

class File {

public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }}

class DownloadException extends Exception{
	public DownloadException(String errorMessage) { super(errorMessage); }
}

class GetMethod {

GetMethod(){}
	GetMethod(String o0){}
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }
	public MyHelperClass setRequestHeader(Header o0){ return null; }
	public MyHelperClass getStatusText(){ return null; }}

class HttpClient {

public MyHelperClass executeMethod(GetMethod o0){ return null; }}

class Header {

public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setValue(String o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0, boolean o1){}
	FileOutputStream(){}}
