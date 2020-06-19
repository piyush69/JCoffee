


class c19180786 {
public MyHelperClass Assert;
	public MyHelperClass destFolderName;
	public MyHelperClass IOUtils;

    public void testCopyFolderContents() throws IOException {
        MyHelperClass log = new MyHelperClass();
        log.info("Running: testCopyFolderContents()");
        MyHelperClass srcFolderName = new MyHelperClass();
        IOUtils.copyFolderContents(srcFolderName, destFolderName);
        MyHelperClass destFile1 = new MyHelperClass();
        Assert.assertTrue((Boolean)(Object)destFile1.exists() && (Boolean)(Object)destFile1.isFile());
        MyHelperClass destFile2 = new MyHelperClass();
        Assert.assertTrue((Boolean)(Object)destFile2.exists() && (Boolean)(Object)destFile2.isFile());
        MyHelperClass destFile3 = new MyHelperClass();
        Assert.assertTrue((Boolean)(Object)destFile3.exists() && (Boolean)(Object)destFile3.isFile());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass assertTrue(boolean o0){ return null; }
	public MyHelperClass copyFolderContents(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
