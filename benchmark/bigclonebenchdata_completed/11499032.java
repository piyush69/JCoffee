


class c11499032 {
public MyHelperClass ODFUtil;
	public MyHelperClass IOUtils;
	public MyHelperClass getSignedOpenDocumentOutputStream(){ return null; }
	public MyHelperClass getOpenDocumentURL(){ return null; }

    private void outputSignedOpenDocument(byte[] signatureData) throws IOException {
        MyHelperClass LOG = new MyHelperClass();
        LOG.debug("output signed open document");
        OutputStream signedOdfOutputStream =(OutputStream)(Object) getSignedOpenDocumentOutputStream();
        if (null == signedOdfOutputStream) {
            throw new NullPointerException("signedOpenDocumentOutputStream is null");
        }
        ZipOutputStream zipOutputStream = new ZipOutputStream(signedOdfOutputStream);
        ZipInputStream zipInputStream = new ZipInputStream(this.getOpenDocumentURL().openStream());
        ZipEntry zipEntry;
        while (null != (zipEntry =(ZipEntry)(Object) zipInputStream.getNextEntry())) {
            if (!zipEntry.getName().equals(ODFUtil.SIGNATURE_FILE)) {
                zipOutputStream.putNextEntry(zipEntry);
                IOUtils.copy(zipInputStream, zipOutputStream);
            }
        }
        zipInputStream.close();
        zipEntry = new ZipEntry(ODFUtil.SIGNATURE_FILE);
        zipOutputStream.putNextEntry(zipEntry);
        IOUtils.write(signatureData, zipOutputStream);
        zipOutputStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SIGNATURE_FILE;
public MyHelperClass write(byte[] o0, ZipOutputStream o1){ return null; }
	public MyHelperClass copy(ZipInputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

}

class ZipOutputStream {

ZipOutputStream(OutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class ZipInputStream {

ZipInputStream(MyHelperClass o0){}
	ZipInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}
	public MyHelperClass getName(){ return null; }}
