


class c6013590 {
public MyHelperClass Constant;
public MyHelperClass ImgUtil;
	public MyHelperClass getSysConfig(){ return null; }

    public void saveUserUpFile(UserInfo userInfo, String distFileName, InputStream instream) throws IOException {
        MyHelperClass BBSCSUtil = new MyHelperClass();
        String fullPicFile = BBSCSUtil.getUserWebFilePath(userInfo.getId()) + distFileName;
//        MyHelperClass BBSCSUtil = new MyHelperClass();
        String fullPicFileSmall = BBSCSUtil.getUserWebFilePath(userInfo.getId()) + distFileName + Constant.IMG_SMALL_FILEPREFIX;
        OutputStream bos =(OutputStream)(Object) new FileOutputStream(fullPicFile);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(instream, bos);
        ImgUtil.reduceImg(fullPicFile, fullPicFileSmall, this.getSysConfig().getFaceWidth(), this.getSysConfig().getFaceHigh(), 0);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IMG_SMALL_FILEPREFIX;
public MyHelperClass getUserWebFilePath(MyHelperClass o0){ return null; }
	public MyHelperClass reduceImg(String o0, String o1, MyHelperClass o2, MyHelperClass o3, int o4){ return null; }
	public MyHelperClass getFaceHigh(){ return null; }
	public MyHelperClass getFaceWidth(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class UserInfo {

public MyHelperClass getId(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
