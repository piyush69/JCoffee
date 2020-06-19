


class c20681843 {
public MyHelperClass assertNotNull(MyHelperClass o0){ return null; }
public MyHelperClass BASE_URL;
	public MyHelperClass IOUtils;
	public MyHelperClass CONTENT_FILE;
	public MyHelperClass resolveSource(String o0){ return null; }
	public MyHelperClass loadTestSource(){ return null; }

    public void testRevcounter() throws ServiceException, IOException {
        JCRNodeSource emptySource =(JCRNodeSource)(Object) loadTestSource();
        for (int i = 0; i < 3; i++) {
            OutputStream sourceOut =(OutputStream)(Object) emptySource.getOutputStream();
            InputStream contentIn =(InputStream)(Object) getClass().getResourceAsStream((String)(Object)CONTENT_FILE);
            try {
                IOUtils.copy(contentIn, sourceOut);
                sourceOut.flush();
            } finally {
                sourceOut.close();
                contentIn.close();
            }
            System.out.println(emptySource.getLatestSourceRevision());
        }
        String testSourceUri = BASE_URL + "users/lars.trieloff?revision=1.1";
        JCRNodeSource secondSource = (JCRNodeSource)(JCRNodeSource)(Object) resolveSource(testSourceUri);
        System.out.println("Created at: " + secondSource.getSourceRevision());
        for (int i = 0; i < 3; i++) {
            OutputStream sourceOut =(OutputStream)(Object) emptySource.getOutputStream();
            InputStream contentIn =(InputStream)(Object) getClass().getResourceAsStream((String)(Object)CONTENT_FILE);
            try {
                IOUtils.copy(contentIn, sourceOut);
                sourceOut.flush();
            } finally {
                sourceOut.close();
                contentIn.close();
            }
            System.out.println(emptySource.getLatestSourceRevision());
        }
        System.out.println("Read again at:" + secondSource.getSourceRevision());
        assertNotNull(emptySource.getSourceRevision());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class ServiceException extends Exception{
	public ServiceException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JCRNodeSource {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getSourceRevision(){ return null; }
	public MyHelperClass getLatestSourceRevision(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
