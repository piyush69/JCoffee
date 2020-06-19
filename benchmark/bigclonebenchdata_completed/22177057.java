import java.io.*;
import java.lang.*;
import java.util.*;



class c22177057 {
public MyHelperClass source;
	public MyHelperClass getContentResolver(){ return null; }
public MyHelperClass Toast;
	public MyHelperClass string;

    private void saveFile(File destination) {
        InputStream in = null;
        OutputStream out = null;
        try {
            MyHelperClass fileScheme = new MyHelperClass();
            if ((boolean)(Object)fileScheme) in = new BufferedInputStream(new FileInputStream((String)(Object)source.getPath())); else in = new BufferedInputStream((InputStream)(Object)getContentResolver().openInputStream(source));
            out = new BufferedOutputStream(new FileOutputStream(destination));
            byte[] buffer = new byte[1024];
            while (in.read(buffer) != -1) out.write(buffer);
            Toast.makeText(this, string.saveas_file_saved, Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            Toast.makeText(this, string.saveas_error, Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Toast.makeText(this, string.saveas_error, Toast.LENGTH_SHORT).show();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass saveas_file_saved;
	public MyHelperClass LENGTH_SHORT;
	public MyHelperClass saveas_error;
public MyHelperClass openInputStream(MyHelperClass o0){ return null; }
	public MyHelperClass makeText(c22177057 o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass show(){ return null; }
	public MyHelperClass getPath(){ return null; }}
