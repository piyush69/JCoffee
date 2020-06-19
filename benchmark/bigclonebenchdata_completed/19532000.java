import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19532000 {
public static MyHelperClass openURLAction(String o0){ return null; }
//public MyHelperClass openURLAction(String o0){ return null; }

    static MenuListener openRecentHandler() {
        MenuListener handler = new MenuListener() {

            public void menuSelected(final MenuEvent event)  throws Throwable {
                final JMenu menu = (JMenu)(JMenu)(Object) event.getSource();
                menu.removeAll();
                MyHelperClass Application = new MyHelperClass();
                String[] recentURLSpecs =(String[])(Object) Application.getApp().getRecentURLSpecs();
                for (int index = 0; index < recentURLSpecs.length; index++) {
                    String urlSpec = recentURLSpecs[index];
                    JMenuItem menuItem = new JMenuItem(urlSpec);
                    menu.add(menuItem);
                    menuItem.setAction(openURLAction(urlSpec));
                    menuItem.setText(urlSpec);
                    try {
                        new java.net.URL(urlSpec).openStream();
                    } catch (java.io.IOException exception) {
                        menuItem.setEnabled(false);
                    }
                }
                menu.addSeparator();
                final JMenuItem clearItem = new JMenuItem("Clear");
                clearItem.setAction((MyHelperClass)(Object)new AbstractAction() {

                    public void actionPerformed(final ActionEvent event) {
                        Application.getApp().clearRecentItems();
                    }
                });
                clearItem.setText("Clear");
                menu.add(clearItem);
            }

            public void menuCanceled(final MenuEvent event) {
            }

            public void menuDeselected(final MenuEvent event) {
            }
        };
        return handler;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getApp(){ return null; }
	public MyHelperClass getRecentURLSpecs(){ return null; }
	public MyHelperClass clearRecentItems(){ return null; }}

class MenuListener {

}

class MenuEvent {

public MyHelperClass getSource(){ return null; }}

class JMenu {

public MyHelperClass removeAll(){ return null; }
	public MyHelperClass addSeparator(){ return null; }
	public MyHelperClass add(JMenuItem o0){ return null; }}

class JMenuItem {

JMenuItem(){}
	JMenuItem(String o0){}
	public MyHelperClass setAction(MyHelperClass o0){ return null; }
	public MyHelperClass setAction(){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class AbstractAction {

}

class ActionEvent {

}
