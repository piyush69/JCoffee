import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2177544 {

    public static boolean makeBackup(File dir, String sourcedir, String destinationdir, String destinationDirEnding, boolean autoInitialized)  throws Throwable {
        boolean success = false;
        String[] files;
        files = dir.list();
        File checkdir = new File(destinationdir + System.getProperty("file.separator") + destinationDirEnding);
        if (!checkdir.isDirectory()) {
            checkdir.mkdir();
        }
        ;
        Date date = new Date();
        long msec = date.getTime();
        checkdir.setLastModified(msec);
        try {
            for (int i = 0; i < files.length; i++) {
                File f = new File(dir, files[i]);
                File g = new File(files[i]);
                if (f.isDirectory()) {
                } else if (f.getName().endsWith("saving")) {
                } else {
                    if (f.canRead()) {
                        String destinationFile = checkdir + System.getProperty("file.separator") + g;
                        String sourceFile = sourcedir + System.getProperty("file.separator") + g;
                        FileInputStream infile = new FileInputStream(sourceFile);
                        FileOutputStream outfile = new FileOutputStream(destinationFile);
                        int c;
                        while ((c = infile.read()) != -1) outfile.write(c);
                        infile.close();
                        outfile.close();
                    } else {
                        System.out.println(f.getName() + " is LOCKED!");
                        while (!f.canRead()) {
                        }
                        String destinationFile = checkdir + System.getProperty("file.separator") + g;
                        String sourceFile = sourcedir + System.getProperty("file.separator") + g;
                        FileInputStream infile = new FileInputStream(sourceFile);
                        FileOutputStream outfile = new FileOutputStream(destinationFile);
                        int c;
                        while ((c = infile.read()) != -1) outfile.write(c);
                        infile.close();
                        outfile.close();
                    }
                }
            }
            success = true;
        } catch (Exception e) {
            success = false;
            e.printStackTrace();
        }
        if (autoInitialized) {
            MyHelperClass View = new MyHelperClass();
            Display display =(Display)(Object) View.getDisplay();
            if (display != null || !(Boolean)(Object)display.isDisposed()) {
//                MyHelperClass View = new MyHelperClass();
                View.getDisplay().syncExec(new Runnable() {

                    public void run() {
                        MyHelperClass Tab4 = new MyHelperClass();
                        Tab4.redrawBackupTable();
                    }
                });
            }
            return success;
        } else {
            MyHelperClass View = new MyHelperClass();
            View.getDisplay().syncExec(new Runnable() {

                public void run() {
                    MyHelperClass StatusBoxUtils = new MyHelperClass();
                    StatusBoxUtils.mainStatusAdd(" Backup Complete", 1);
                    MyHelperClass View = new MyHelperClass();
                    MyHelperClass Time = new MyHelperClass();
                    View.getPluginInterface().getPluginconfig().setPluginParameter("Azcvsupdater_last_backup", Time.getCurrentTime(View.getPluginInterface().getPluginconfig().getPluginBooleanParameter("MilitaryTime")));
                    MyHelperClass Tab4 = new MyHelperClass();
                    Tab4.lastBackupTime = View.getPluginInterface().getPluginconfig().getPluginStringParameter("Azcvsupdater_last_backup");
//                    MyHelperClass Tab4 = new MyHelperClass();
                    if (Tab4.lastbackupValue != null || !(Boolean)(Object)Tab4.lastbackupValue.isDisposed()) {
//                        MyHelperClass Tab4 = new MyHelperClass();
                        Tab4.lastbackupValue.setText("Last backup: " + Tab4.lastBackupTime);
                    }
//                    MyHelperClass Tab4 = new MyHelperClass();
                    Tab4.redrawBackupTable();
                    MyHelperClass Tab6Utils = new MyHelperClass();
                    Tab6Utils.refreshLists();
                }
            });
            return success;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass lastBackupTime;
	public MyHelperClass lastbackupValue;
public MyHelperClass refreshLists(){ return null; }
	public MyHelperClass isDisposed(){ return null; }
	public MyHelperClass getCurrentTime(MyHelperClass o0){ return null; }
	public MyHelperClass setPluginParameter(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass syncExec( Runnable o0){ return null; }
	public MyHelperClass getPluginStringParameter(String o0){ return null; }
	public MyHelperClass syncExec(){ return null; }
	public MyHelperClass redrawBackupTable(){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass getPluginBooleanParameter(String o0){ return null; }
	public MyHelperClass getPluginconfig(){ return null; }
	public MyHelperClass getDisplay(){ return null; }
	public MyHelperClass getPluginInterface(){ return null; }
	public MyHelperClass mainStatusAdd(String o0, int o1){ return null; }}

class Display {

public MyHelperClass isDisposed(){ return null; }}
