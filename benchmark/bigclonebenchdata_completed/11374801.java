import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11374801 {
public MyHelperClass NULL;
	public MyHelperClass add(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass spalten;
	public MyHelperClass setLayout(BorderLayout o0){ return null; }
public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setResizable(boolean o0){ return null; }
	public MyHelperClass pack(){ return null; }

    public void init(VerwaltungClient verClient)  throws Throwable {
        this.setLayout(new BorderLayout());
        JPanel pnl1 = NULL; //new JPanel();
        pnl1 = new JPanel();
//        MyHelperClass pnl1 = new MyHelperClass();
        pnl1.setLayout(new FlowLayout());
        MyHelperClass Localization = new MyHelperClass();
        pnl1.add(new JLabel(Localization.getInstance().getString("GameOver")));
//        MyHelperClass pnl1 = new MyHelperClass();
        pnl1.setBounds(10, 10, 200, 10);
        JPanel pnl2 = NULL; //new JPanel();
        pnl2 = new JPanel();
        int a_punkte[];
        int punkte = 0;
        String name;
        String[] a_namen;
        a_punkte =(int[])(Object) verClient.getA_spielEndpunkte();
        a_namen =(String[])(Object) verClient.getA_Spielernamen();
        Object[][] zeilen = NULL; //new Object[][]();
        zeilen = new Object[a_punkte.length][2];
        for (int i = 0; i < a_punkte.length; i++) {
            for (int j = 0; j < a_punkte.length - 1 - i; j++) {
                if (a_punkte[j] < a_punkte[j + 1]) {
                    punkte = a_punkte[j];
                    a_punkte[j] = a_punkte[j + 1];
                    a_punkte[j + 1] = punkte;
                    name = a_namen[j];
                    a_namen[j] = a_namen[j + 1];
                    a_namen[j + 1] = name;
                }
            }
        }
        for (int i = 0; i < a_punkte.length; i++) {
//            MyHelperClass zeilen = new MyHelperClass();
            zeilen[i][0] = a_namen[i];
//            MyHelperClass zeilen = new MyHelperClass();
            zeilen[i][1] = new String("" + a_punkte[i]);
        }
        MyHelperClass tabelle = new MyHelperClass();
        tabelle = new JTable(zeilen, spalten);
//        MyHelperClass tabelle = new MyHelperClass();
        tabelle.setEnabled(false);
        MyHelperClass pane = new MyHelperClass();
        pane = new JScrollPane(tabelle);
//        MyHelperClass pane = new MyHelperClass();
        pnl2.add(pane);
        JPanel pnl3 = NULL; //new JPanel();
        pnl3 = new JPanel();
//        MyHelperClass Localization = new MyHelperClass();
        JButton btn = new JButton(Localization.getInstance().getString("OK"));
        btn.addActionListener(this);
//        MyHelperClass pnl3 = new MyHelperClass();
        pnl3.add(btn);
        MyHelperClass BorderLayout = new MyHelperClass();
        this.add(BorderLayout.CENTER, pnl2);
//        MyHelperClass BorderLayout = new MyHelperClass();
        this.add(BorderLayout.NORTH, pnl1);
//        MyHelperClass BorderLayout = new MyHelperClass();
        this.add(BorderLayout.SOUTH, pnl3);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NORTH;
	public MyHelperClass[] zeilen;
	public MyHelperClass SOUTH;
	public MyHelperClass CENTER;
public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass add(JButton o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass setBounds(int o0, int o1, int o2, int o3){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass setLayout(FlowLayout o0){ return null; }}

class VerwaltungClient {

public MyHelperClass getA_Spielernamen(){ return null; }
	public MyHelperClass getA_spielEndpunkte(){ return null; }}

class BorderLayout {

}

class FlowLayout {

}

class JLabel {

}

class JButton {

public MyHelperClass addActionListener(c11374801 o0){ return null; }}

class JPanel {

}

class JTable {

JTable(Object[][] o0, MyHelperClass o1){}
	JTable(){}}

class JScrollPane {

JScrollPane(MyHelperClass o0){}
	JScrollPane(){}}
