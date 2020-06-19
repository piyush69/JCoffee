


class c6310593 {
public MyHelperClass LOGIN;
	public MyHelperClass ServletActionContext;
	public MyHelperClass LicenceUtils;
	public MyHelperClass upload;
	public MyHelperClass getSystemContext(){ return null; }

//    @Override
    public String execute() throws Exception {
        SystemContext sc =(SystemContext)(Object) getSystemContext();
        if ((int)(Object)sc.getExpireTime() == -1) {
            return (String)(Object)LOGIN;
        } else if (upload != null) {
            try {
                Enterprise e =(Enterprise)(Object) LicenceUtils.get(upload);
                sc.setEnterpriseName(e.getEnterpriseName());
                sc.setExpireTime(e.getExpireTime());
                String webPath =(String)(Object) ServletActionContext.getServletContext().getRealPath("/");
                File desFile = new File(webPath, LicenceUtils.LICENCE_FILE_NAME);
                FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(upload).getChannel());
                FileChannel destinationChannel =(FileChannel)(Object) (new FileOutputStream(desFile).getChannel());
                sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
                sourceChannel.close();
                destinationChannel.close();
                return (String)(Object)LOGIN;
            } catch (Exception e) {
            }
        }
        return "license";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LICENCE_FILE_NAME;
public MyHelperClass getRealPath(String o0){ return null; }
	public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }}

class SystemContext {

public MyHelperClass getExpireTime(){ return null; }
	public MyHelperClass setExpireTime(MyHelperClass o0){ return null; }
	public MyHelperClass setEnterpriseName(MyHelperClass o0){ return null; }}

class Enterprise {

public MyHelperClass getExpireTime(){ return null; }
	public MyHelperClass getEnterpriseName(){ return null; }}

class File {

File(){}
	File(String o0, MyHelperClass o1){}}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
