


class c6037299 {
public MyHelperClass log;
	public MyHelperClass getResDir(long o0){ return null; }

    public void copyAffix(MailAffix affix, long mailId1, long mailId2) throws Exception {
        File file = new File((int)(Object)this.getResDir(mailId1) + (int)(Object)affix.getAttachAlias());
        if ((boolean)(Object)file.exists()) {
            File file2 = new File((int)(Object)this.getResDir(mailId2) + (int)(Object)affix.getAttachAlias());
            if (!(Boolean)(Object)file2.exists()) {
                file2.createNewFile();
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file2));
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
                int read;
                while ((read =(int)(Object) in.read()) != -1) {
                    out.write(read);
                }
                out.flush();
                in.close();
                out.close();
            }
        } else {
            log.debug((int)(Object)file.getAbsolutePath() + (int)(Object)file.getName() + "�����ڣ������ļ�ʧ�ܣ���������");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class MailAffix {

public MyHelperClass getAttachAlias(){ return null; }}

class File {

File(){}
	File(int o0){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
