
import java.io.UncheckedIOException;


class c17786231 {
public MyHelperClass handleUpdate(MyHelperClass o0, int o1){ return null; }
public MyHelperClass copyStreams(InputStream o0, FileOutputStream o1, CopyStreamStatusCallback o2){ return null; }
	public MyHelperClass createParentDirectories(File o0){ return null; }
public MyHelperClass DictionaryForMIDs;
	public MyHelperClass Log;
	public MyHelperClass isInterrupted(){ return null; }

        private void downloadFile(final String downloadUrl, final String destinationFile) throws IOException {
            HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(downloadUrl);
            final File outputFile = new File(destinationFile);
            createParentDirectories(outputFile);
            FileOutputStream outputStream;
            outputStream = new FileOutputStream(outputFile);
            final HttpResponse response =(HttpResponse)(Object) client.execute(httpGet);
            if ((boolean)(Object)isInterrupted()) {
                outputStream.close();
                return;
            }
            final HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            InputStream inputStream = null;
            try {
                if (entity != null) {
                    inputStream =(InputStream)(Object) entity.getContent();
                    CopyStreamStatusCallback callback = new CopyStreamStatusCallback() {

//                        @Override
                        public long getSkipBetweenUpdates() {
                            MyHelperClass PERCENTAGE_BASE = new MyHelperClass();
                            return(int)(Object) entity.getContentLength() * 2 / (int)(Object)PERCENTAGE_BASE;
                        }

//                        @Override
                        public void onUpdate(final long copiedLength) {
                            MyHelperClass PERCENTAGE_BASE = new MyHelperClass();
                            int percentage = (int) (copiedLength * (long)(Object)PERCENTAGE_BASE / (long)(Object)entity.getContentLength());
                            MyHelperClass STATUS_DOWNLOADING = new MyHelperClass();
                            handleUpdate(STATUS_DOWNLOADING, percentage);
                        }
                    };
                    copyStreams(inputStream, outputStream, callback);
                }
            } finally {
                try {
                    outputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (UncheckedIOException e) {
                    Log.v(DictionaryForMIDs.LOG_TAG, "Exception while closing stream: " + e);
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOG_TAG;
public MyHelperClass v(MyHelperClass o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class File {

File(String o0){}
	File(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass getContentLength(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class CopyStreamStatusCallback {

}
