import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2092752 {

    public void save()  throws Throwable {
        final JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileFilter() {

            public String getDescription() {
                return "PDF File";
            }

            public boolean accept(File f) {
                return f.isDirectory() || f.getName().toLowerCase().endsWith(".pdf");
            }
        });
        MyHelperClass JFileChooser = new MyHelperClass();
        if (fc.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File targetFile =(File)(Object) fc.getSelectedFile();
        if (!targetFile.getName().toLowerCase().endsWith(".pdf")) {
            targetFile = new File(targetFile.getParentFile(), targetFile.getName() + ".pdf");
        }
        if (targetFile.exists()) {
            MyHelperClass JOptionPane = new MyHelperClass();
            if (JOptionPane.showConfirmDialog(this, "Do you want to overwrite the file?") != JOptionPane.YES_OPTION) {
                return;
            }
        }
        try {
            MyHelperClass filename = new MyHelperClass();
            final InputStream is = new FileInputStream((String)(Object)filename);
            try {
                final OutputStream os = new FileOutputStream(targetFile);
                try {
                    final byte[] buffer = new byte[32768];
                    for (int read; (read = is.read(buffer)) != -1; ) {
                        os.write(buffer, 0, read);
                    }
                } finally {
                    os.close();
                }
            } finally {
                is.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass YES_OPTION;
	public MyHelperClass APPROVE_OPTION;
public MyHelperClass showConfirmDialog(c2092752 o0, String o1){ return null; }}

class JFileChooser {

public MyHelperClass setFileFilter( FileFilter o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass setFileFilter(){ return null; }
	public MyHelperClass showSaveDialog(c2092752 o0){ return null; }}
