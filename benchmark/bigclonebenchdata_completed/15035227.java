import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15035227 {
public MyHelperClass setDefaultCloseOperation(MyHelperClass o0){ return null; }
	public MyHelperClass dispose(){ return null; }
public MyHelperClass GridBagConstraints;
	public MyHelperClass DISPOSE_ON_CLOSE;
	public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass getContentPane(){ return null; }
	public MyHelperClass setSize(int o0, int o1){ return null; }

    private void initialize()  throws Throwable {
        StringBuffer license = new StringBuffer();
        URL url;
        InputStreamReader in;
        BufferedReader reader;
        String str;
        JTextArea textArea;
        JButton button;
        GridBagConstraints c;
        setTitle("mibible License");
        setSize(600, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new GridBagLayout());
        url = getClass().getClassLoader().getResource("LICENSE.txt");
        if (url == null) {
            license.append("Couldn't locate license file (LICENSE.txt).");
        } else {
            try {
                in = new InputStreamReader(url.openStream());
                reader = new BufferedReader(in);
                while ((str = reader.readLine()) != null) {
                    if (!str.equals("")) {
                        license.append(str);
                    }
                    license.append("\n");
                }
                reader.close();
            } catch (IOException e) {
                license.append("Error reading license file ");
                license.append("(LICENSE.txt):\n\n");
                license.append(e.getMessage());
            }
        }
        textArea = new JTextArea(license.toString());
        textArea.setEditable(false);
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx =(MyHelperClass)(Object) 1.0d;
        c.weighty =(MyHelperClass)(Object) 1.0d;
        c.insets =(MyHelperClass)(Object) new Insets(4, 5, 4, 5);
        getContentPane().add((JButton)(Object)new JScrollPane(textArea), c);
        button = new JButton("Close");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        c = new GridBagConstraints();
        c.gridy =(MyHelperClass)(Object) 1;
        c.anchor = GridBagConstraints.CENTER;
        c.insets =(MyHelperClass)(Object) new Insets(10, 10, 10, 10);
        getContentPane().add(button, c);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CENTER;
	public MyHelperClass BOTH;
public MyHelperClass setLayout(GridBagLayout o0){ return null; }
	public MyHelperClass add(JButton o0, GridBagConstraints o1){ return null; }}

class JTextArea {

JTextArea(String o0){}
	JTextArea(){}
	public MyHelperClass setEditable(boolean o0){ return null; }}

class JButton {

JButton(String o0){}
	JButton(){}
	public MyHelperClass addActionListener( ActionListener o0){ return null; }
	public MyHelperClass addActionListener(){ return null; }}

class GridBagConstraints {
public MyHelperClass weightx;
	public MyHelperClass gridy;
	public MyHelperClass insets;
	public MyHelperClass anchor;
	public MyHelperClass weighty;
	public MyHelperClass fill;
}

class GridBagLayout {

}

class Insets {

Insets(){}
	Insets(int o0, int o1, int o2, int o3){}}

class JScrollPane {

JScrollPane(JTextArea o0){}
	JScrollPane(){}}

class ActionListener {

}

class ActionEvent {

}
