import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14390569 {
public MyHelperClass warn(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setCentral(MyHelperClass o0){ return null; }
public MyHelperClass jd;
	public MyHelperClass JDialog;
	public MyHelperClass BoxLayout;
	public MyHelperClass getSaveImageChooser(){ return null; }
	public MyHelperClass getMessage(String o0){ return null; }

    private  void DialogHelper(String title, final URL imageURL)  throws Throwable {
        jd =(MyHelperClass)(Object) new JDialog();
        jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jd.setAlwaysOnTop(true);
        jd.setLayout(new BoxLayout(jd.getContentPane(), BoxLayout.Y_AXIS));
        jd.setTitle(title);
        JLabel jl = new JLabel();
        ImageIcon icon = new ImageIcon(imageURL);
        jl.setIcon(icon);
        jd.add((JPanel)(Object)new JScrollPane(jl));
        final JFileChooser chooser =(JFileChooser)(Object) getSaveImageChooser();
        JPanel jp = new JPanel();
        JButton jb = new JButton(getMessage("btn_save_as"));
        jb.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int returnVal =(int)(Object) chooser.showSaveDialog(jd);
                if (returnVal == (int)(Object)JFileChooser.APPROVE_OPTION) {
                    File file =(File)(Object) chooser.getSelectedFile();
                    String fileName = file.getPath();
                    MyHelperClass StringUtil = new MyHelperClass();
                    String ext = StringUtil.getLowerExtension(fileName);
                    if (!"png".equals(ext)) {
                        fileName += ".png";
                        file = new File(fileName);
                    }
                    boolean doIt = true;
                    if (file.exists()) {
                        MyHelperClass JOptionPane = new MyHelperClass();
                        int i = JOptionPane.showConfirmDialog(jd, getMessage("warn_file_exist"));
//                        MyHelperClass JOptionPane = new MyHelperClass();
                        if (i != JOptionPane.YES_OPTION) doIt = false;
                    } else if (!file.getParentFile().exists()) {
                        doIt = file.getParentFile().mkdirs();
                    }
                    if (doIt) {
                        FileChannel src = null;
                        FileChannel dest = null;
                        try {
                            src = (FileChannel)(Object)new FileInputStream(imageURL.getPath()).getChannel();
                            dest = (FileChannel)(Object)new FileOutputStream(fileName).getChannel();
                            src.transferTo(0, src.size(), dest);
                        } catch (FileNotFoundException e1) {
                            warn(jd, getMessage("err_no_source_file"));
                        } catch (IOException e2) {
                            warn(jd, getMessage("err_output_target"));
                        } finally {
                            try {
                                if (src != null) src.close();
                            } catch (IOException e1) {
                            }
                            try {
                                if (dest != null) dest.close();
                            } catch (IOException e1) {
                            }
                            src = null;
                            dest = null;
                        }
                    }
                }
            }
        });
        jp.add(jb);
        jb = new JButton(getMessage("btn_close"));
        jb.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                jd.dispose();
            }
        });
        jp.add(jb);
        jd.add(jp);
        jd.pack();
        setCentral(jd);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass Y_AXIS;
	public MyHelperClass YES_OPTION;
	public MyHelperClass DISPOSE_ON_CLOSE;
public MyHelperClass dispose(){ return null; }
	public MyHelperClass pack(){ return null; }
	public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass showConfirmDialog(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass add(JPanel o0){ return null; }
	public MyHelperClass getLowerExtension(String o0){ return null; }
	public MyHelperClass setDefaultCloseOperation(MyHelperClass o0){ return null; }
	public MyHelperClass setAlwaysOnTop(boolean o0){ return null; }
	public MyHelperClass getContentPane(){ return null; }}

class JDialog {

}

class BoxLayout {

BoxLayout(MyHelperClass o0, MyHelperClass o1){}
	BoxLayout(){}}

class JLabel {

public MyHelperClass setIcon(ImageIcon o0){ return null; }}

class ImageIcon {

ImageIcon(URL o0){}
	ImageIcon(){}}

class JScrollPane {

JScrollPane(JLabel o0){}
	JScrollPane(){}}

class JFileChooser {
public static MyHelperClass APPROVE_OPTION;
public MyHelperClass showSaveDialog(MyHelperClass o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }}

class JPanel {

public MyHelperClass add(JButton o0){ return null; }}

class JButton {

JButton(MyHelperClass o0){}
	JButton(){}
	public MyHelperClass addActionListener(){ return null; }
	public MyHelperClass addActionListener(<anonymous ActionListener> o0){ return null; }}

class ActionListener {

}

class ActionEvent {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}
