
import java.io.UncheckedIOException;


class c12660385 {
public MyHelperClass StringsUtils;
	public MyHelperClass filePath1;

//            @Override
            public boolean accept(File file) {
                if (file.getName().equals(".svn")) {
                    return false;
                }
                final long modify =(long)(Object) file.lastModified();
                MyHelperClass DateUtils = new MyHelperClass();
                final long time =(long)(Object) DateUtils.toDate("2012-03-21 17:43", "yyyy-MM-dd HH:mm").getTime();
                if (modify >= time) {
                    if ((boolean)(Object)file.isFile()) {
                        MyHelperClass filePath2 = new MyHelperClass();
                        File f = new File(StringsUtils.replace(file.getAbsolutePath(), filePath2, filePath1));
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

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTime(){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass replace(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass toDate(String o0, String o1){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
