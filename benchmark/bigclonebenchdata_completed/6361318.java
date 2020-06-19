


class c6361318 {
public MyHelperClass bo;
	public MyHelperClass size;
	public MyHelperClass DateUtil;

    public void run() {
        MyHelperClass date = new MyHelperClass();
        date = DateUtil.addMonth(-1);
//        MyHelperClass date = new MyHelperClass();
        List list =(List)(Object) bo.getDao().getHibernateTemplate().find("from MailAffixPojo where upload_time <'" + date + "' and to_number(sized) >" + size);
        if (null != list &&(int)(Object) list.size() > 0) {
            try {
                FTPClient ftp = new FTPClient();
                MyHelperClass config = new MyHelperClass();
                ftp.connect(config.getHostUrl(), config.getFtpPort());
//                MyHelperClass config = new MyHelperClass();
                ftp.login(config.getUname(), config.getUpass());
                int replyCode =(int)(Object) ftp.getReplyCode();
                MyHelperClass FTPReply = new MyHelperClass();
                if (!(Boolean)(Object)FTPReply.isPositiveCompletion(replyCode)) {
                    ftp.disconnect();
                    return;
                }
                for (int i = 0; i < (int)(Object)list.size(); i++) {
                    MailAffixPojo pojo = (MailAffixPojo)(MailAffixPojo)(Object) list.get(i);
                    ftp.changeWorkingDirectory(pojo.getUploadTime().substring(0, 7));
                    ftp.deleteFile(pojo.getAffixSaveName());
                    ftp.changeToParentDirectory();
                    MyHelperClass bo = new MyHelperClass();
                    bo.delete(MailAffixPojo.class, new Long((long)(Object)pojo.getId()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass getDao(){ return null; }
	public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass getUname(){ return null; }
	public MyHelperClass delete(Class<MailAffixPojo> o0, Long o1){ return null; }
	public MyHelperClass getFtpPort(){ return null; }
	public MyHelperClass getHostUrl(){ return null; }
	public MyHelperClass addMonth(int o0){ return null; }
	public MyHelperClass getHibernateTemplate(){ return null; }
	public MyHelperClass find(String o0){ return null; }
	public MyHelperClass getUpass(){ return null; }}

class List {

public MyHelperClass size(){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class FTPClient {

public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass changeToParentDirectory(){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass deleteFile(MyHelperClass o0){ return null; }}

class MailAffixPojo {

public MyHelperClass getUploadTime(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getAffixSaveName(){ return null; }}
