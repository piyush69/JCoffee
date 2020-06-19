import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5145801 {
public MyHelperClass fireVetoableChange(MyHelperClass o0, Object o1, MyHelperClass o2){ return null; }

    public void actionPerformed(ActionEvent e)  throws Throwable {
        JFileChooser fc = new JFileChooser("");
        fc.setMultiSelectionEnabled(false);
        MyHelperClass JFileChooser = new MyHelperClass();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int option = 0;
        MyHelperClass m_data = new MyHelperClass();
        boolean save = m_data != null;
        if (save) option =(int)(Object) fc.showSaveDialog(this); else option =(int)(Object) fc.showOpenDialog(this);
//        MyHelperClass JFileChooser = new MyHelperClass();
        if (option != (int)(Object)JFileChooser.APPROVE_OPTION) return;
        File file =(File)(Object) fc.getSelectedFile();
        if (file == null) return;
        MyHelperClass log = new MyHelperClass();
        log.info(file.toString());
        try {
            if (save) {
                FileOutputStream os = new FileOutputStream(file);
//                MyHelperClass m_data = new MyHelperClass();
                byte[] buffer = (byte[])(byte[])(Object) m_data;
                os.write(buffer);
                os.flush();
                os.close();
//                MyHelperClass log = new MyHelperClass();
                log.config("Save to " + file + " #" + buffer.length);
            } else {
                FileInputStream is = new FileInputStream(file);
                ByteArrayOutputStream os = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024 * 8];
                int length = -1;
                while ((length = is.read(buffer)) != -1) os.write(buffer, 0, length);
                is.close();
                byte[] data = os.toByteArray();
//                MyHelperClass m_data = new MyHelperClass();
                m_data =(MyHelperClass)(Object) data;
//                MyHelperClass log = new MyHelperClass();
                log.config("Load from " + file + " #" + data.length);
                os.close();
            }
        } catch (Exception ex) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.WARNING, "Save=" + save, ex);
        }
        try {
            MyHelperClass m_columnName = new MyHelperClass();
            fireVetoableChange(m_columnName, null, m_data);
        } catch (UncheckedIOException pve) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass APPROVE_OPTION;
	public MyHelperClass FILES_ONLY;
	public MyHelperClass WARNING;
public MyHelperClass config(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }}

class ActionEvent {

}

class JFileChooser {

JFileChooser(){}
	JFileChooser(String o0){}
	public MyHelperClass setFileSelectionMode(MyHelperClass o0){ return null; }
	public MyHelperClass showSaveDialog(c5145801 o0){ return null; }
	public MyHelperClass setMultiSelectionEnabled(boolean o0){ return null; }
	public MyHelperClass showOpenDialog(c5145801 o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }}

class PropertyVetoException extends Exception{
	public PropertyVetoException(String errorMessage) { super(errorMessage); }
}
