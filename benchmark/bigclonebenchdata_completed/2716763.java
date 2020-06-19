


class c2716763 {
public MyHelperClass ImgUtil;

    public void saveUploadFile(String toFileName, UploadFile uploadFile, SysConfig sysConfig) throws IOException {
        OutputStream bos =(OutputStream)(Object) new FileOutputStream(toFileName);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(uploadFile.getInputStream(), bos);
        if ((boolean)(Object)sysConfig.isAttachImg(uploadFile.getFileName()) &&(int)(Object) sysConfig.getReduceAttachImg() == 1) {
            MyHelperClass Constant = new MyHelperClass();
            ImgUtil.reduceImg(toFileName, toFileName + Constant.IMG_SMALL_FILEPREFIX, sysConfig.getReduceAttachImgSize(), sysConfig.getReduceAttachImgSize(), 1);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IMG_SMALL_FILEPREFIX;
public MyHelperClass reduceImg(String o0, String o1, MyHelperClass o2, MyHelperClass o3, int o4){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }}

class UploadFile {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getFileName(){ return null; }}

class SysConfig {

public MyHelperClass isAttachImg(MyHelperClass o0){ return null; }
	public MyHelperClass getReduceAttachImgSize(){ return null; }
	public MyHelperClass getReduceAttachImg(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
