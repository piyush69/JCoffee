import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6102140 {

    public static void main(String[] args)  throws Throwable {
        try {
            MyHelperClass Utils = new MyHelperClass();
            boolean readExp =(boolean)(Object) Utils.getFlag('l', args);
//            MyHelperClass Utils = new MyHelperClass();
            final boolean writeExp =(boolean)(Object) Utils.getFlag('s', args);
//            MyHelperClass Utils = new MyHelperClass();
            final String expFile =(String)(Object) Utils.getOption('f', args);
            if ((readExp || writeExp) && (expFile.length() == 0)) {
                throw new Exception("A filename must be given with the -f option");
            }
            Experiment exp = null;
            if (readExp) {
                FileInputStream fi = new FileInputStream(expFile);
                ObjectInputStream oi = new ObjectInputStream(new BufferedInputStream(fi));
                exp = (Experiment) oi.readObject();
                oi.close();
            } else {
                exp = new Experiment();
            }
            System.err.println("Initial Experiment:\n" + exp.toString());
            final JFrame jf = new JFrame("Weka Experiment Setup");
            jf.getContentPane().setLayout(new BorderLayout());
            final SetupPanel sp = new SetupPanel();
            MyHelperClass BorderLayout = new MyHelperClass();
            jf.getContentPane().add(sp, BorderLayout.CENTER);
            jf.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent e) {
                    System.err.println("\nFinal Experiment:\n" + sp.m_Exp.toString());
                    if (writeExp) {
                        try {
                            FileOutputStream fo = new FileOutputStream(expFile);
                            ObjectOutputStream oo = new ObjectOutputStream(new BufferedOutputStream(fo));
                            oo.writeObject(sp.m_Exp);
                            oo.close();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                            System.err.println("Couldn't write experiment to: " + expFile + '\n' + ex.getMessage());
                        }
                    }
                    jf.dispose();
                    System.exit(0);
                }
            });
            jf.pack();
            jf.setVisible(true);
            System.err.println("Short nap");
            Thread.currentThread().sleep(3000);
            System.err.println("Done");
            sp.setExperiment(exp);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println(ex.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CENTER;
public MyHelperClass add(SetupPanel o0, MyHelperClass o1){ return null; }
	public MyHelperClass getFlag(char o0, String[] o1){ return null; }
	public MyHelperClass getOption(char o0, String[] o1){ return null; }
	public MyHelperClass setLayout(BorderLayout o0){ return null; }}

class Experiment {

}

class JFrame {

JFrame(){}
	JFrame(String o0){}
	public MyHelperClass getContentPane(){ return null; }
	public MyHelperClass addWindowListener( WindowAdapter o0){ return null; }
	public MyHelperClass dispose(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass pack(){ return null; }
	public MyHelperClass addWindowListener(){ return null; }}

class BorderLayout {

}

class SetupPanel {
public MyHelperClass m_Exp;
public MyHelperClass setExperiment(Experiment o0){ return null; }}

class WindowAdapter {

}

class WindowEvent {

}
