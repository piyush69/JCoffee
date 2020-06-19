import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15964688 {
public MyHelperClass _log;
	public MyHelperClass _changed;
	public MyHelperClass JFileChooser;
	public MyHelperClass GuiStrings;
	public MyHelperClass JOptionPane;
	public MyHelperClass _data;
	public MyHelperClass removeImage(){ return null; }
	public MyHelperClass getTopLevelAncestor(){ return null; }
	public MyHelperClass setImage(byte[] o0){ return null; }

    public void actionPerformed(ActionEvent e)  throws Throwable {
        if (e.getActionCommand().equals("LOAD")) {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new JPEGFilter());
            chooser.setMultiSelectionEnabled(false);
            if (chooser.showOpenDialog(getTopLevelAncestor()) == JFileChooser.APPROVE_OPTION) {
                try {
                    File file =(File)(Object) chooser.getSelectedFile();
                    BufferedInputStream is = new BufferedInputStream(new FileInputStream(file));
                    ByteArrayOutputStream bos = new ByteArrayOutputStream((int) file.length());
                    int read = is.read();
                    while (read != -1) {
                        bos.write(read);
                        read = is.read();
                    }
                    is.close();
                    _changed =(MyHelperClass)(Object) true;
                    setImage(bos.toByteArray());
                } catch (Exception e1) {
                    _log.error("actionPerformed(ActionEvent)", e1);
                }
            }
        } else if (e.getActionCommand().equals("SAVE")) {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new JPEGFilter());
            chooser.setMultiSelectionEnabled(false);
            if (_data != null && chooser.showSaveDialog(getTopLevelAncestor()) == JFileChooser.APPROVE_OPTION) {
                try {
                    File file =(File)(Object) chooser.getSelectedFile();
                    BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(file));
                    os.write((int)(Object)_data);
                    os.flush();
                    os.close();
                } catch (Exception e1) {
                    _log.error("actionPerformed(ActionEvent)", e1);
                }
            }
        } else if (e.getActionCommand().equals("DELETE")) {
            if (_data != null) {
                int result =(int)(Object) JOptionPane.showConfirmDialog(getTopLevelAncestor(), GuiStrings.getString("message.removeimg"), GuiStrings.getString("title.confirm"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == (int)(Object)JOptionPane.YES_OPTION) {
                    removeImage();
                    _changed =(MyHelperClass)(Object) true;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass QUESTION_MESSAGE;
	public MyHelperClass YES_NO_OPTION;
	public MyHelperClass APPROVE_OPTION;
	public MyHelperClass YES_OPTION;
public MyHelperClass showConfirmDialog(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class ActionEvent {

public MyHelperClass getActionCommand(){ return null; }}

class JFileChooser {

public MyHelperClass showSaveDialog(MyHelperClass o0){ return null; }
	public MyHelperClass showOpenDialog(MyHelperClass o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass setFileFilter(JPEGFilter o0){ return null; }
	public MyHelperClass setMultiSelectionEnabled(boolean o0){ return null; }}

class JPEGFilter {

}
