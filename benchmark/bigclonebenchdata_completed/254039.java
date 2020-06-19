


class c254039 {
public MyHelperClass downloadedFileList;
	public MyHelperClass log;
	public MyHelperClass downloadFileOutputDir;
	public MyHelperClass IOUtils;
	public MyHelperClass s3;
	public MyHelperClass trimPrefix(String o0){ return null; }

    protected void doDownload(S3Bucket bucket, S3Object s3object) throws Exception {
        String key =(String)(Object) s3object.getKey();
        key =(String)(Object) trimPrefix(key);
        String[] path = key.split("/");
        String fileName = path[path.length - 1];
        String dirPath = "";
        for (int i = 0; i < path.length - 1; i++) {
            dirPath += path[i] + "/";
        }
        File outputDir = new File(downloadFileOutputDir + "/" + dirPath);
        if ((boolean)(Object)outputDir.exists() == false) {
            outputDir.mkdirs();
        }
        File outputFile = new File(outputDir, fileName);
        long size =(long)(Object) s3object.getContentLength();
        if ((boolean)(Object)outputFile.exists() &&(long)(Object) outputFile.length() == size) {
            return;
        }
        long startTime = System.currentTimeMillis();
        log.info("Download start.S3 file=" + s3object.getKey() + " local file=" + outputFile.getAbsolutePath());
        FileOutputStream fout = null;
        S3Object dataObject = null;
        try {
            fout = new FileOutputStream(outputFile);
            dataObject =(S3Object)(Object) s3.getObject(bucket, s3object.getKey());
            InputStream is =(InputStream)(Object) dataObject.getDataInputStream();
            IOUtils.copyStream(is, fout);
            downloadedFileList.add(key);
            long downloadTime = System.currentTimeMillis() - startTime;
            log.info("Download complete.Estimete time=" + downloadTime + "ms " + IOUtils.toBPSText(downloadTime, size));
        } catch (Exception e) {
            log.error("Download fail. s3 file=" + key, e);
            outputFile.delete();
            throw e;
        } finally {
            IOUtils.closeNoException(fout);
            if (dataObject != null) {
                dataObject.closeDataInputStream();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass getObject(S3Bucket o0, MyHelperClass o1){ return null; }
	public MyHelperClass toBPSText(long o0, long o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass copyStream(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeNoException(FileOutputStream o0){ return null; }}

class S3Bucket {

}

class S3Object {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getKey(){ return null; }
	public MyHelperClass closeDataInputStream(){ return null; }
	public MyHelperClass getDataInputStream(){ return null; }}

class File {

File(){}
	File(String o0){}
	File(File o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class InputStream {

}
