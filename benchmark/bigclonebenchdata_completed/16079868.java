import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16079868 {

    private void readIntoList(URL url, Map<String, JMenuItem> list)  throws Throwable {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                int commandNameBegin = inputLine.indexOf(">") + 1;
                int commandNameEnd = inputLine.indexOf("</a>");
                JMenuItem item = new JMenuItem("<html>" + inputLine + "</html>");
                MyHelperClass allRooms = new MyHelperClass();
                if (list == allRooms) {
                    item.setActionCommand("/room " + inputLine.substring(commandNameBegin, commandNameEnd));
                } else {
                    item.setActionCommand("/" + inputLine.substring(commandNameBegin, commandNameEnd) + " ");
                }
                item.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        MyHelperClass jTextField1 = new MyHelperClass();
                        jTextField1.setText(e.getActionCommand());
                        MyHelperClass popup = new MyHelperClass();
                        popup.setVisible(false);
                    }
                });
                list.put(inputLine.substring(commandNameBegin, commandNameEnd), item);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setText(MyHelperClass o0){ return null; }}

class JMenuItem {

JMenuItem(){}
	JMenuItem(String o0){}
	public MyHelperClass addActionListener(){ return null; }
	public MyHelperClass addActionListener( ActionListener o0){ return null; }
	public MyHelperClass setActionCommand(String o0){ return null; }}

class ActionListener {

}

class ActionEvent {

public MyHelperClass getActionCommand(){ return null; }}
