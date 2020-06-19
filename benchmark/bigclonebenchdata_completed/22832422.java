


class c22832422 {

    private void backupOriginalFile(String myFile) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd_S");
        String datePortion =(String)(Object) format.format(date);
        try {
            FileInputStream fis = new FileInputStream(myFile);
            FileOutputStream fos = new FileOutputStream(myFile + "-" + datePortion + "_UserID" + ".html");
            FileChannel fcin =(FileChannel)(Object) fis.getChannel();
            FileChannel fcout =(FileChannel)(Object) fos.getChannel();
            fcin.transferTo(0, fcin.size(), fcout);
            fcin.close();
            fcout.close();
            fis.close();
            fos.close();
            System.out.println("**** Backup of file made.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Date {

}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass format(Date o0){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}
