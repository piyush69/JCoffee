


class c21923044 {
public MyHelperClass getMessageDigest(MyHelperClass o0){ return null; }
public MyHelperClass FileUtils;
	public MyHelperClass isNoop(){ return null; }

    private String copy(PluginVersionDetail usePluginVersion, File runtimeRepository) {
        try {
            File tmpFile = null;
            try {
                MyHelperClass File = new MyHelperClass();
                tmpFile =(File)(Object) File.createTempFile("tmpPlugin_", ".zip");
                tmpFile.deleteOnExit();
                URL url = new URL(usePluginVersion.getUri());
                String destFilename =(String)(Object) (new File(url.getFile()).getName());
                File destFile = new File(runtimeRepository, destFilename);
                InputStream in = null;
                FileOutputStream out = null;
                int bytesDownload = 0;
                long startTime = 0;
                long endTime = 0;
                try {
                    URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
                    bytesDownload =(int)(Object) urlConnection.getContentLength();
                    in =(InputStream)(Object) urlConnection.getInputStream();
                    out = new FileOutputStream(tmpFile);
                    startTime = System.currentTimeMillis();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, out);
                    endTime = System.currentTimeMillis();
                } finally {
                    if (out != null) {
                        out.close();
                    }
                    if (in != null) {
                        in.close();
                    }
                }
                String downloadSpeedInfo = null;
                long downloadSpeed = 0;
                if ((endTime - startTime) > 0) {
                    downloadSpeed = 1000L * bytesDownload / (endTime - startTime);
                }
                if (downloadSpeed == 0) {
                    downloadSpeedInfo = "? B/s";
                } else if (downloadSpeed < 1000) {
                    downloadSpeedInfo = downloadSpeed + " B/s";
                } else if (downloadSpeed < 1000000) {
                    downloadSpeedInfo = downloadSpeed / 1000 + " KB/s";
                } else if (downloadSpeed < 1000000000) {
                    downloadSpeedInfo = downloadSpeed / 1000000 + " MB/s";
                } else {
                    downloadSpeedInfo = downloadSpeed / 1000000000 + " GB/s";
                }
                String tmpFileMessageDigest =(String)(Object) getMessageDigest(tmpFile.toURI().toURL()).getValue();
                if (!tmpFileMessageDigest.equals(usePluginVersion.getMessageDigest().getValue())) {
                    throw new RuntimeException("Downloaded file: " + usePluginVersion.getUri() + " does not have required message digest: " + usePluginVersion.getMessageDigest().getValue());
                }
                if (!(Boolean)(Object)isNoop()) {
                    FileUtils.copyFile(tmpFile, destFile);
                }
                return bytesDownload + " Bytes " + downloadSpeedInfo;
            } finally {
                if (tmpFile != null) {
                    tmpFile.delete();
                }
            }
        } catch (Exception ex) {
            throw new RuntimeException("Could not download " + usePluginVersion.getUri() + " to " + runtimeRepository, ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass toURL(){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class PluginVersionDetail {

public MyHelperClass getUri(){ return null; }
	public MyHelperClass getMessageDigest(){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	File(MyHelperClass o0){}
	public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass toURI(){ return null; }
	public MyHelperClass getName(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
