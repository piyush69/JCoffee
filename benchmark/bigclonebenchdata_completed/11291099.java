


class c11291099 {
public MyHelperClass AddressingUtil;

    public void visit(BosMember member) throws BosException {
        MyHelperClass baseUri = new MyHelperClass();
        String relative =(String)(Object) AddressingUtil.getRelativePath(member.getDataSourceUri(), baseUri);
        URL resultUrl;
        try {
            MyHelperClass outputUrl = new MyHelperClass();
            resultUrl = new URL(outputUrl, relative);
            File resultFile = new File(resultUrl.toURI());
            resultFile.getParentFile().mkdirs();
            MyHelperClass log = new MyHelperClass();
            log.info("Creating result file \"" + resultFile.getAbsolutePath() + "\"...");
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(member.getInputStream(), new FileOutputStream(resultFile));
        } catch (Exception e) {
            throw new BosException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getRelativePath(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class BosMember {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getDataSourceUri(){ return null; }}

class BosException extends Exception{
	public BosException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass toURI(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
