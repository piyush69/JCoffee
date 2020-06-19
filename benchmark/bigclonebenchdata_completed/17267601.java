import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17267601 {
public MyHelperClass bckImg;
	public MyHelperClass LogHandler;
	public MyHelperClass Level;
	public MyHelperClass JOptionPane;
	public MyHelperClass drawPanel;
	public MyHelperClass isLoggingEnabled(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass setPath(String o0){ return null; }

    public void setBckImg(String newPath)  throws Throwable {
        try {
            File inputFile = new File((String)(Object)getPath());
            File outputFile = new File(newPath);
            if (!inputFile.getCanonicalPath().equals(outputFile.getCanonicalPath())) {
                FileInputStream in = new FileInputStream(inputFile);
                FileOutputStream out = null;
                try {
                    out = new FileOutputStream(outputFile);
                } catch (FileNotFoundException ex1) {
                    ex1.printStackTrace();
                    JOptionPane.showMessageDialog(null, ex1.getMessage().substring(0, Math.min(ex1.getMessage().length(),(int)(Object) drawPanel.MAX_DIALOG_MSG_SZ)) + "-" + getClass(), "Set Bck Img", JOptionPane.ERROR_MESSAGE);
                }
                int c;
                if (out != null) {
                    while ((c = in.read()) != -1) out.write(c);
                    out.close();
                }
                in.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            LogHandler.log(ex.getMessage(), Level.INFO, "LOG_MSG", isLoggingEnabled());
            JOptionPane.showMessageDialog(null, ex.getMessage().substring(0, Math.min(ex.getMessage().length(),(int)(Object) drawPanel.MAX_DIALOG_MSG_SZ)) + "-" + getClass(), "Set Bck Img", JOptionPane.ERROR_MESSAGE);
        }
        setPath(newPath);
        bckImg =(MyHelperClass)(Object) new ImageIcon(getPath());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MAX_DIALOG_MSG_SZ;
	public MyHelperClass INFO;
	public MyHelperClass ERROR_MESSAGE;
public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass log(String o0, MyHelperClass o1, String o2, MyHelperClass o3){ return null; }}

class ImageIcon {

ImageIcon(MyHelperClass o0){}
	ImageIcon(){}}
