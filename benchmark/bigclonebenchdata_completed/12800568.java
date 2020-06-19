import java.io.*;
import java.lang.*;
import java.util.*;



class c12800568 {

    public void exportFile() {
        MyHelperClass PropertyHandler = new MyHelperClass();
        String expfolder =(String)(Object) PropertyHandler.getInstance().getProperty(PropertyHandler.KINDLE_EXPORT_FOLDER_KEY);
        MyHelperClass previewInfo = new MyHelperClass();
        File out = new File(expfolder + File.separator + previewInfo.getTitle() + ".prc");
        MyHelperClass absPath = new MyHelperClass();
        File f = new File((String)(Object)absPath);
        try {
            FileOutputStream fout = new FileOutputStream(out);
            FileInputStream fin = new FileInputStream(f);
            int read = 0;
            byte[] buffer = new byte[1024 * 1024];
            while ((read = fin.read(buffer)) > 0) {
                fout.write(buffer, 0, read);
            }
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass KINDLE_EXPORT_FOLDER_KEY;
public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getProperty(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}
