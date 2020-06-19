import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8135072 {
public MyHelperClass getFatherFrame(){ return null; }
public MyHelperClass bckImg;
	public MyHelperClass Level;
	public MyHelperClass JOptionPane;
	public MyHelperClass LogHandler;
	public MyHelperClass getFatherPanel(){ return null; }
	public MyHelperClass isLoggingEnabled(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass setPath(String o0){ return null; }

    public void setImg()  throws Throwable {
        JFileChooser jFileChooser1 = new JFileChooser();
        String separator = "";
        MyHelperClass JFileChooser = new MyHelperClass();
        if (JFileChooser.APPROVE_OPTION == jFileChooser1.showOpenDialog(this.getFatherFrame())) {
            setPath((String)(Object)jFileChooser1.getSelectedFile().getPath());
            separator =(String)(Object) jFileChooser1.getSelectedFile().separator;
            File dirImg = new File("." + separator + "images");
            if (!dirImg.exists()) {
                dirImg.mkdir();
            }
            int index =(int)(Object) getPath().lastIndexOf(separator);
            String imgName =(String)(Object) getPath().substring(index);
            String newPath = dirImg + imgName;
            try {
                File inputFile = new File((String)(Object)getPath());
                File outputFile = new File(newPath);
                if (!inputFile.getCanonicalPath().equals(outputFile.getCanonicalPath())) {
                    FileInputStream in = new FileInputStream(inputFile);
                    FileOutputStream out = new FileOutputStream(outputFile);
                    int c;
                    while ((c = in.read()) != -1) out.write(c);
                    in.close();
                    out.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                LogHandler.log(ex.getMessage(), Level.INFO, "LOG_MSG", isLoggingEnabled());
                JOptionPane.showMessageDialog(null, ex.getMessage().substring(0, Math.min(ex.getMessage().length(),(int)(Object) getFatherPanel().MAX_DIALOG_MSG_SZ)) + "-" + getClass(), "Set image", JOptionPane.ERROR_MESSAGE);
            }
            setPath(newPath);
            bckImg =(MyHelperClass)(Object) new ImageIcon(getPath());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MAX_DIALOG_MSG_SZ;
	public MyHelperClass INFO;
	public MyHelperClass APPROVE_OPTION;
	public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass separator;
public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass log(String o0, MyHelperClass o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }}

class JFileChooser {

public MyHelperClass showOpenDialog(MyHelperClass o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }}

class ImageIcon {

ImageIcon(MyHelperClass o0){}
	ImageIcon(){}}
