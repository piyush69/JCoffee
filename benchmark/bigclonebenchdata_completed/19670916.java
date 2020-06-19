
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19670916 {

    private void pushResource(String peerId, String communityId, String resourceFilePath, List attachmentFilePaths) throws IOException {
        String urlString = "http://" + peerId + "/upload";
        HttpURLConnection uploadConnection = null;
        DataOutputStream connOutput = null;
        FileInputStream fileInput = null;
        String lineEnd = "\r\n";
        String twoHyphens = "--";
        String boundary = "232404jkg4220957934FW";
        int bytesRead, bytesAvailable, bufferSize;
        byte[] buffer;
        int maxBufferSize = 1 * 1024 * 1024;
        try {
            File resourceFile = new File(resourceFilePath);
            if (!(Boolean)(Object)resourceFile.exists()) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.error("JTellaAdapter: Resource file could not be found for push: " + resourceFilePath);
                return;
            }
            List attachments =(List)(Object) new ArrayList();
            for (String attachmentPath :(String[])(Object) (Object[])(Object)attachmentFilePaths) {
                File attachFile = new File(attachmentPath);
                if (!(Boolean)(Object)attachFile.exists()) {
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.error("JTellaAdapter: Attachment file could not be found for push: " + attachmentPath);
                    return;
                }
                attachments.add(attachFile);
            }
            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("JTellaAdapter: Initiating push to: " + urlString);
            URL url = new URL(urlString);
            uploadConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            uploadConnection.setDoInput(true);
            uploadConnection.setDoOutput(true);
            uploadConnection.setUseCaches(false);
            uploadConnection.setRequestMethod("POST");
            uploadConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
            uploadConnection.setRequestProperty("Connection", "Keep-Alive");
            uploadConnection.setRequestProperty("User-Agent", "UP2P");
            uploadConnection.setRequestProperty("Accept", "[star]/[star]");
            connOutput = new DataOutputStream(uploadConnection.getOutputStream());
            connOutput.writeBytes(twoHyphens + boundary + lineEnd);
            connOutput.writeBytes("Content-Disposition: form-data; name=\"up2p:community\"" + lineEnd + lineEnd);
            connOutput.writeBytes(communityId + lineEnd);
            connOutput.writeBytes(twoHyphens + boundary + lineEnd);
            connOutput.writeBytes("Content-Disposition: form-data; name=\"up2p:pushupload\"" + lineEnd + lineEnd + "true" + lineEnd);
            connOutput.writeBytes(twoHyphens + boundary + lineEnd);
            boolean fileWriteComplete = false;
            boolean resourceFileWritten = false;
            File nextFile = null;
            while (!fileWriteComplete) {
                if (!resourceFileWritten) {
                    nextFile = resourceFile;
                } else {
                    nextFile =(File)(Object) attachments.remove(0);
                }
//                MyHelperClass LOG = new MyHelperClass();
                LOG.debug("JTellaAdapter: PUSHing file: " + nextFile.getAbsolutePath());
                connOutput.writeBytes("Content-Disposition: form-data; name=\"up2p:filename\";" + " filename=\"" + nextFile.getName() + "\"" + lineEnd);
                connOutput.writeBytes(lineEnd);
                fileInput = new FileInputStream(nextFile);
                bytesAvailable =(int)(Object) fileInput.available();
                bufferSize = Math.min(bytesAvailable, maxBufferSize);
                buffer = new byte[bufferSize];
                bytesRead =(int)(Object) fileInput.read(buffer, 0, bufferSize);
                while (bytesRead > 0) {
                    connOutput.write(buffer, 0, bufferSize);
                    bytesAvailable =(int)(Object) fileInput.available();
                    bufferSize = Math.min(bytesAvailable, maxBufferSize);
                    bytesRead =(int)(Object) fileInput.read(buffer, 0, bufferSize);
                }
                connOutput.writeBytes(lineEnd);
                if ((boolean)(Object)attachments.isEmpty()) {
                    connOutput.writeBytes(twoHyphens + boundary + twoHyphens + lineEnd);
                } else {
                    connOutput.writeBytes(twoHyphens + boundary + lineEnd);
                }
                resourceFileWritten = true;
                if ((boolean)(Object)attachments.isEmpty()) {
                    fileWriteComplete = true;
                }
            }
            BufferedReader inStream = new BufferedReader(new InputStreamReader(uploadConnection.getInputStream()));
            while (inStream.readLine() != null) ;
            inStream.close();
//            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("JTellaAdapter: Push upload was succesful.");
        } catch (UncheckedIOException ex) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error("JTellaAdapter: pushResource Malformed URL: " + ex);
            throw new IOException("pushResource failed for URL: " + urlString);
        } catch (ArithmeticException ioe) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error("JTellaAdapter: pushResource IOException: " + ioe);
            throw new IOException("pushResource failed for URL: " + urlString);
        } finally {
            try {
                if (fileInput != null) {
                    fileInput.close();
                }
                if (connOutput != null) {
                    connOutput.flush();
                }
                if (connOutput != null) {
                    connOutput.close();
                }
                if (uploadConnection != null) {
                    uploadConnection.disconnect();
                }
            } catch (UncheckedIOException e) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.error("JTellaAdapter: pushResource failed to close connection streams.");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class List {

public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass add(File o0){ return null; }
	public MyHelperClass remove(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass writeBytes(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass available(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class ArrayList {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
