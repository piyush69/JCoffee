import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1292366 {
public MyHelperClass label;

    public void command()  throws Throwable {
        JFileChooser chooser = new JFileChooser();
        MyHelperClass dir = new MyHelperClass();
        chooser.setCurrentDirectory(new File((String)(Object)dir));
        int returnVal =(int)(Object) chooser.showOpenDialog(null);
        MyHelperClass JFileChooser = new MyHelperClass();
        if (returnVal == (int)(Object)JFileChooser.APPROVE_OPTION) {
            MyHelperClass filename = new MyHelperClass();
            filename = chooser.getSelectedFile().getAbsolutePath();
            String f2 = "";
//            MyHelperClass filename = new MyHelperClass();
            for (int i = 0; i < (int)(Object)filename.length(); ++i) {
//                MyHelperClass filename = new MyHelperClass();
                if ((char)(Object)filename.charAt(i) != '\\') {
//                    MyHelperClass filename = new MyHelperClass();
                    f2 = f2 + filename.charAt(i);
                } else f2 = f2 + '/';
            }
//            MyHelperClass filename = new MyHelperClass();
            filename =(MyHelperClass)(Object) f2;
//            MyHelperClass dir = new MyHelperClass();
            if ((boolean)(Object)filename.contains(dir)) {
//                MyHelperClass filename = new MyHelperClass();
                filename = filename.substring(dir.length());
            } else {
                try {
//                    MyHelperClass filename = new MyHelperClass();
                    FileChannel srcFile = (FileChannel)(Object)new FileInputStream((String)(Object)filename).getChannel();
                    FileChannel dstFile;
//                    MyHelperClass filename = new MyHelperClass();
                    filename = "ueditor_files/"(MyHelperClass)(Object) + chooser.getSelectedFile().getName();
                    File newFile;
//                    MyHelperClass dir = new MyHelperClass();
                    if (!(newFile = new File((String)(Object)(int)(Object)dir + (int)(Object)filename)).createNewFile()) {
//                        MyHelperClass dir = new MyHelperClass();
                        dstFile = new FileInputStream((String)(Object)(int)(Object)dir + (int)(Object)filename).getChannel();
                        newFile = null;
                    } else {
                        dstFile = (FileChannel)(Object)new FileOutputStream(newFile).getChannel();
                    }
                    dstFile.transferFrom(srcFile, 0, srcFile.size());
                    srcFile.close();
                    dstFile.close();
//                    MyHelperClass dir = new MyHelperClass();
                    System.out.println("file copyed to: " + dir + filename);
                } catch (Exception e) {
                    e.printStackTrace();
                    MyHelperClass InputText = new MyHelperClass();
                    label.setIcon(InputText.iconX);
//                    MyHelperClass filename = new MyHelperClass();
                    filename = null;
                    MyHelperClass groups = new MyHelperClass();
                    for (Group g :(Group[])(Object) (Object[])(Object)groups) {
                        g.updateValidity(true);
                    }
                    return;
                }
            }
            MyHelperClass InputText = new MyHelperClass();
            label.setIcon(InputText.iconV);
            MyHelperClass groups = new MyHelperClass();
            for (Group g :(Group[])(Object) (Object[])(Object)groups) {
                g.updateValidity(true);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass iconX;
	public MyHelperClass iconV;
	public MyHelperClass APPROVE_OPTION;
public MyHelperClass substring(MyHelperClass o0){ return null; }
	public MyHelperClass charAt(int o0){ return null; }
	public MyHelperClass setIcon(MyHelperClass o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass contains(MyHelperClass o0){ return null; }
	public MyHelperClass length(){ return null; }}

class JFileChooser {

public MyHelperClass setCurrentDirectory(File o0){ return null; }
	public MyHelperClass showOpenDialog(Object o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(){ return null; }}

class Group {

public MyHelperClass updateValidity(boolean o0){ return null; }}
