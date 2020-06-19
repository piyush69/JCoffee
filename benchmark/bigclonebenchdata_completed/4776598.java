import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4776598 {
public MyHelperClass NULL;
public MyHelperClass dp;
	public MyHelperClass name;
	public MyHelperClass top;
public MyHelperClass nullItem;
	public MyHelperClass SwingUtilities;
	public MyHelperClass select(){ return null; }
	public MyHelperClass setNullTH(){ return null; }
	public MyHelperClass incr(){ return null; }

        private void init(URL url)  throws Throwable {
            JInternalFrame frame =(JInternalFrame)(Object) NULL; //new JInternalFrame();
            frame = new JInternalFrame(name);
//            MyHelperClass frame = new MyHelperClass();
            frame.addInternalFrameListener(this);
            MyHelperClass listModel = new MyHelperClass();
            listModel.add(listModel.size(), this);
            JTextArea area =(JTextArea)(Object) NULL; //new JTextArea();
            area = new JTextArea();
//            MyHelperClass area = new MyHelperClass();
            area.setMargin(new Insets(5, 5, 5, 5));
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                String in;
                while ((in = reader.readLine()) != null) {
//                    MyHelperClass area = new MyHelperClass();
                    area.append(in);
//                    MyHelperClass area = new MyHelperClass();
                    area.append("\n");
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
            MyHelperClass th = new MyHelperClass();
            th = area.getTransferHandler();
            MyHelperClass Font = new MyHelperClass();
            area.setFont(new Font("monospaced", Font.PLAIN, 12));
//            MyHelperClass area = new MyHelperClass();
            area.setCaretPosition(0);
//            MyHelperClass area = new MyHelperClass();
            area.setDragEnabled(true);
            MyHelperClass DropMode = new MyHelperClass();
            area.setDropMode(DropMode.INSERT);
//            MyHelperClass area = new MyHelperClass();
            frame.getContentPane().add(new JScrollPane((MyHelperClass)(Object)area));
//            MyHelperClass frame = new MyHelperClass();
            dp.add((JScrollPane)(Object)frame);
//            MyHelperClass frame = new MyHelperClass();
            frame.show();
            MyHelperClass DEMO = new MyHelperClass();
            if ((boolean)(Object)DEMO) {
//                MyHelperClass frame = new MyHelperClass();
                frame.setSize(300, 200);
            } else {
//                MyHelperClass frame = new MyHelperClass();
                frame.setSize(400, 300);
            }
//            MyHelperClass frame = new MyHelperClass();
            frame.setResizable(true);
//            MyHelperClass frame = new MyHelperClass();
            frame.setClosable(true);
//            MyHelperClass frame = new MyHelperClass();
            frame.setIconifiable(true);
//            MyHelperClass frame = new MyHelperClass();
            frame.setMaximizable(true);
            MyHelperClass left = new MyHelperClass();
            frame.setLocation(left, top);
            incr();
            SwingUtilities.invokeLater(new Runnable() {

                public void run() {
                    select();
                }
            });
            nullItem.addActionListener(this);
            setNullTH();
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PLAIN;
	public MyHelperClass INSERT;
public MyHelperClass invokeLater( Runnable o0){ return null; }
	public MyHelperClass add(MyHelperClass o0, c4776598 o1){ return null; }
	public MyHelperClass setLocation(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setClosable(boolean o0){ return null; }
	public MyHelperClass setDragEnabled(boolean o0){ return null; }
	public MyHelperClass setIconifiable(boolean o0){ return null; }
	public MyHelperClass add(JScrollPane o0){ return null; }
	public MyHelperClass setMargin(Insets o0){ return null; }
	public MyHelperClass addInternalFrameListener(c4776598 o0){ return null; }
	public MyHelperClass addActionListener(c4776598 o0){ return null; }
	public MyHelperClass getContentPane(){ return null; }
	public MyHelperClass setCaretPosition(int o0){ return null; }
	public MyHelperClass setDropMode(MyHelperClass o0){ return null; }
	public MyHelperClass getTransferHandler(){ return null; }
	public MyHelperClass show(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass setResizable(boolean o0){ return null; }
	public MyHelperClass setMaximizable(boolean o0){ return null; }
	public MyHelperClass invokeLater(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass setSize(int o0, int o1){ return null; }}

class Insets {

Insets(){}
	Insets(int o0, int o1, int o2, int o3){}}

class Font {

Font(String o0, MyHelperClass o1, int o2){}
	Font(){}}

class JScrollPane {

JScrollPane(){}
	JScrollPane(MyHelperClass o0){}}

class JInternalFrame {

JInternalFrame(){}
	JInternalFrame(MyHelperClass o0){}
	public MyHelperClass getContentPane(){ return null; }
	public MyHelperClass setResizable(boolean o0){ return null; }
	public MyHelperClass setIconifiable(boolean o0){ return null; }
	public MyHelperClass setMaximizable(boolean o0){ return null; }
	public MyHelperClass setLocation(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setClosable(boolean o0){ return null; }
	public MyHelperClass show(){ return null; }
	public MyHelperClass setSize(int o0, int o1){ return null; }
	public MyHelperClass addInternalFrameListener(c4776598 o0){ return null; }}

class JTextArea {

public MyHelperClass setCaretPosition(int o0){ return null; }
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass setDropMode(MyHelperClass o0){ return null; }
	public MyHelperClass setDragEnabled(boolean o0){ return null; }
	public MyHelperClass getTransferHandler(){ return null; }
	public MyHelperClass setFont(Font o0){ return null; }
	public MyHelperClass setMargin(Insets o0){ return null; }}
