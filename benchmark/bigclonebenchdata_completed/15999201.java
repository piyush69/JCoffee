


class c15999201 {
public MyHelperClass prepareResponse(HttpServletRequest o0, HttpServletResponse o1, File o2){ return null; }

//    @Override
    public void downloadByUUID(final UUID uuid, final HttpServletRequest request, final HttpServletResponse response) throws IOException {
        MyHelperClass exportsInProgress = new MyHelperClass();
        if (!(Boolean)(Object)exportsInProgress.containsKey(uuid)) {
            throw new IllegalStateException("No download with UUID: " + uuid);
        }
//        MyHelperClass exportsInProgress = new MyHelperClass();
        final File compressedFile =(File)(Object) exportsInProgress.get(uuid).file;
        MyHelperClass logger = new MyHelperClass();
        logger.debug("File size: " + compressedFile.length());
        OutputStream output = null;
        InputStream fileInputStream = null;
        try {
            output =(OutputStream)(Object) response.getOutputStream();
            prepareResponse(request, response, compressedFile);
            fileInputStream =(InputStream)(Object) new FileInputStream(compressedFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(fileInputStream, output);
            output.flush();
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(fileInputStream);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(output);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass file;
public MyHelperClass get(UUID o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass containsKey(UUID o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class UUID {

}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

public MyHelperClass length(){ return null; }}

class OutputStream {

public MyHelperClass flush(){ return null; }}

class InputStream {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
