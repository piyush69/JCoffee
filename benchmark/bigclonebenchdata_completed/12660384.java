import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12660384 {

    public static void main(String[] args)  throws Throwable {
        final String filePath1 = "e:\\mysite\\data\\up\\itsite";
        final String filePath2 = "d:\\works\\itsite\\itsite";
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.listAllFilesNoRs(new File(filePath2), new FileFilter() {

//            @Override
            public boolean accept(File file) {
                if (file.getName().equals(".svn")) {
                    return false;
                }
                final long modify = file.lastModified();
                MyHelperClass DateUtils = new MyHelperClass();
                final long time =(long)(Object) DateUtils.toDate("2012-03-21 17:43", "yyyy-MM-dd HH:mm").getTime();
                if (modify >= time) {
                    if (file.isFile()) {
                        MyHelperClass StringsUtils = new MyHelperClass();
                        File f = new File((String)(Object)StringsUtils.replace(file.getAbsolutePath(), filePath2, filePath1));
                        f.getParentFile().mkdirs();
                        try {
                            MyHelperClass IOUtils = new MyHelperClass();
                            IOUtils.copyFile(file, f);
                        } catch (UncheckedIOException e) {
                            e.printStackTrace();
                        }
                        System.out.println(f.getName());
                    }
                }
                return true;
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass listAllFilesNoRs(File o0){ return null; }
	public MyHelperClass toDate(String o0, String o1){ return null; }
	public MyHelperClass replace(String o0, String o1, String o2){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass listAllFilesNoRs(File o0,  FileFilter o1){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }}
