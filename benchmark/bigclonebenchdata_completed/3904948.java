import java.io.*;
import java.lang.*;
import java.util.*;



class c3904948 {
public MyHelperClass logger;
	public MyHelperClass JOptionPane;
	public MyHelperClass Menu;
	public MyHelperClass dataFile;

    public void ManageUsers() {
        if (System.getProperty("user.home") != null) {
            dataFile =(MyHelperClass)(Object) new File(System.getProperty("user.home") + File.separator + "MyRx" + File.separator + "MyRx.dat");
            File dataFileDir = new File(System.getProperty("user.home") + File.separator + "MyRx");
            dataFileDir.mkdirs();
        } else {
            dataFile =(MyHelperClass)(Object) new File("MyRx.dat");
        }
        try {
            dataFile.createNewFile();
        } catch (UncheckedIOException e1) {
            logger.error((FileNotFoundException)(Object)e1);
            JOptionPane.showMessageDialog(Menu.getMainMenu(), e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        File oldDataFile = new File("MyRx.dat");
        if (oldDataFile.exists()) {
            FileChannel src = null, dst = null;
            try {
                src =(FileChannel)(Object) (new FileInputStream(oldDataFile.getAbsolutePath()).getChannel());
                dst =(FileChannel)(Object) (new FileOutputStream((String)(Object)dataFile.getAbsolutePath()).getChannel());
                dst.transferFrom(src, 0, src.size());
                if (!oldDataFile.delete()) {
                    oldDataFile.deleteOnExit();
                }
            } catch (FileNotFoundException e) {
                logger.error(e);
                JOptionPane.showMessageDialog(Menu.getMainMenu(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                logger.error(e);
                JOptionPane.showMessageDialog(Menu.getMainMenu(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    src.close();
                    dst.close();
                } catch (UncheckedIOException e) {
                    logger.error((FileNotFoundException)(Object)e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass getMainMenu(){ return null; }
	public MyHelperClass error(FileNotFoundException o0){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass error(IOException o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
