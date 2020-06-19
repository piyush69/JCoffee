import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12352751 {
public int rowNumber;
	public int columnNumber;
//public MyHelperClass columnNumber;
	public MyHelperClass headerWidths;
	public MyHelperClass model;
	public MyHelperClass treeview_root;
	public MyHelperClass treeview;
	public MyHelperClass table;
//	public MyHelperClass rowNumber;
public MyHelperClass combo_text;
public MyHelperClass combo;
	public MyHelperClass NULL;
	public MyHelperClass listdata;
	public MyHelperClass toolbar;
	public MyHelperClass layout;
	public MyHelperClass list;
	public MyHelperClass menubar;
public MyHelperClass WABSheet;
	public MyHelperClass sheet;

    public void startElement(String uri, String tag, String qName, org.xml.sax.Attributes attributes) throws Throwable, SAXException {
        Attributes prop = new Attributes(attributes);
        try {
            if (tag.equals("window")) {
                if (prop == null) {
                    System.err.println("window without properties");
                    return;
                }
                int x =(int)(Object) prop.getValue("x", 0);
                int y =(int)(Object) prop.getValue("y", 0);
                int width =(int)(Object) prop.getValue("width", 0);
                int height =(int)(Object) prop.getValue("height", 0);
                MyHelperClass Color = new MyHelperClass();
                Color bgcolor =(Color)(Object) prop.getValue("bgcolor", Color.white);
                String caption =(String)(Object) prop.getValue("caption", "");
                MyHelperClass layout = new MyHelperClass();
                layout = prop.getValue("layout", 0);
                boolean statusbar =(boolean)(Object) prop.getValue("statusbar", false);
                MyHelperClass sheet = new MyHelperClass();
                if (sheet.opentype == WABSheet.LAYERED) {
                    MyHelperClass frame = new MyHelperClass();
                    Point pos =(Point)(Object) frame.getNextMDIPos();
//                    MyHelperClass sheet = new MyHelperClass();
                    sheet.setBounds((int)(Object)pos.x,(int)(Object) pos.y, 400, 200);
//                    MyHelperClass sheet = new MyHelperClass();
                    sheet.setNormalBounds(new Rectangle((int)(Object)pos.x,(int)(Object) pos.y, 400, 200));
                } else {
//                    MyHelperClass sheet = new MyHelperClass();
                    sheet.setBounds(x, y, width, height);
//                    MyHelperClass sheet = new MyHelperClass();
                    sheet.setNormalBounds(new Rectangle(x, y, width, height));
                }
//                MyHelperClass sheet = new MyHelperClass();
                if (sheet.opentype == WABSheet.MAXIMIZED) sheet.setMaximum(true); else sheet.setMaximum(false);
//                MyHelperClass sheet = new MyHelperClass();
                sheet.setTitle(caption);
                MyHelperClass frame = new MyHelperClass();
                frame.addSheetToMenu(caption);
//                MyHelperClass sheet = new MyHelperClass();
                sheet.setBackground(bgcolor);
//                MyHelperClass layout = new MyHelperClass();
                if ((int)(Object)layout == 1) sheet.getContentPane().setLayout(new FlowLayout()); else if ((int)(Object)layout == 2) sheet.getContentPane().setLayout(new BorderLayout()); else sheet.getContentPane().setLayout(null);
            } else if (tag.equals("menu")) {
                if (prop == null) {
                    System.err.println("menu without properties");
                    return;
                }
                String id =(String)(Object) prop.getValue("id", "");
                String label =(String)(Object) prop.getValue("label", "");
                if ((id != null && id.equals("WINDOW_MENU") || label.equalsIgnoreCase("window"))) {
                    JMenu windowMenu =(JMenu)(Object) NULL; //new JMenu();
                    windowMenu = new JMenu();
                    JMenu menu =(JMenu)(Object) NULL; //new JMenu();
                    menu = windowMenu;
//                    MyHelperClass menu = new MyHelperClass();
                    sheet.setWindowMenu((MyHelperClass)(Object)menu);
                } else {
                    JMenu menu =(JMenu)(Object) NULL; //new JMenu();
                    menu = new JMenu();
                }
                MyHelperClass menu = new MyHelperClass();
                menu.setText(label);
//                MyHelperClass menu = new MyHelperClass();
                menubar.add((JMenuItem)(Object)menu);
            } else if (tag.equals("menuitem")) {
                if (prop == null) {
                    System.err.println("menuitem without properties");
                    return;
                }
                JMenuItem item;
                String action =(String)(Object) prop.getValue("action", "");
                String label =(String)(Object) prop.getValue("label", "");
                boolean visible =(boolean)(Object) prop.getValue("visible", true);
                String icon =(String)(Object) prop.getValue("icon", "");
                if (action.equals("WINDOW_OVERLAPPED")) {
                    JMenuItem windowMenuOverlapped =(JMenuItem)(Object) NULL; //new JMenuItem();
                    item = windowMenuOverlapped = new JMenuItem();
                    item.setActionCommand("10001");
                    MyHelperClass frame = new MyHelperClass();
                    item.addActionListener(frame);
                } else if (action.equals("WINDOW_TILE_HORIZONTALLY")) {
                    JMenuItem windowMenuTile =(JMenuItem)(Object) NULL; //new JMenuItem();
                    item = windowMenuTile = new JMenuItem();
                    item.setActionCommand("10002");
                    MyHelperClass frame = new MyHelperClass();
                    item.addActionListener(frame);
                } else if (action.equals("WINDOW_TILE_VERTICALLY")) {
                    JMenuItem windowMenuArrange =(JMenuItem)(Object) NULL; //new JMenuItem();
                    item = windowMenuArrange = new JMenuItem();
                    item.setActionCommand("10003");
                    MyHelperClass frame = new MyHelperClass();
                    item.addActionListener(frame);
                } else {
                    item = new JMenuItem();
                    item.setActionCommand(action);
                    WABClient global =(WABClient)(Object) NULL; //new WABClient();
                    item.addActionListener((MyHelperClass)(Object)(WABClient)(WABClient)(Object) global);
                }
                item.setText(label);
                MyHelperClass menu = new MyHelperClass();
                if (!visible) menu.setVisible(false);
//                MyHelperClass menu = new MyHelperClass();
                menu.add(item);
                MyHelperClass frame = new MyHelperClass();
                if (frame.getToolBar() != null) {
                    if (icon.length() > 0) {
                        try {
                            ImageIcon img = new ImageIcon(new URL(icon));
                            MyHelperClass BufferedImage = new MyHelperClass();
                            BufferedImage image = new BufferedImage(25, 25, BufferedImage.TYPE_4BYTE_ABGR);
                            Graphics g =(Graphics)(Object) image.createGraphics();
                            g.setColor(new Color(0, 0, 0, 0));
                            g.fillRect(0, 0, 25, 25);
                            g.drawImage(img.getImage(), 4, 4, 16, 16, (ImageObserver) null);
//                            MyHelperClass BufferedImage = new MyHelperClass();
                            BufferedImage pressed = new BufferedImage(25, 25, BufferedImage.TYPE_4BYTE_ABGR);
                            g =(Graphics)(Object) pressed.createGraphics();
                            g.setColor(new Color(0, 0, 0, 0));
                            g.fillRect(0, 0, 25, 25);
                            g.drawImage(img.getImage(), 5, 5, 16, 16, (ImageObserver) null);
                            g.setColor(new Color(132, 132, 132));
                            g.drawLine(0, 0, 24, 0);
                            g.drawLine(0, 0, 0, 24);
                            g.setColor(new Color(255, 255, 255));
                            g.drawLine(24, 24, 24, 0);
                            g.drawLine(24, 24, 0, 24);
//                            MyHelperClass BufferedImage = new MyHelperClass();
                            BufferedImage over = new BufferedImage(25, 25, BufferedImage.TYPE_4BYTE_ABGR);
                            g =(Graphics)(Object) over.createGraphics();
                            g.setColor(new Color(0, 0, 0, 0));
                            g.fillRect(0, 0, 25, 25);
                            g.drawImage(img.getImage(), 4, 4, 16, 16, (ImageObserver) null);
                            g.setColor(new Color(255, 255, 255));
                            g.drawLine(0, 0, 24, 0);
                            g.drawLine(0, 0, 0, 24);
                            g.setColor(new Color(132, 132, 132));
                            g.drawLine(24, 24, 24, 0);
                            g.drawLine(24, 24, 0, 24);
                            JButton b = new JButton(new ImageIcon(image));
                            b.setRolloverEnabled(true);
                            b.setPressedIcon(new ImageIcon(pressed));
                            b.setRolloverIcon(new ImageIcon(over));
                            b.setToolTipText(label);
                            b.setActionCommand(action);
                            b.setFocusPainted(false);
                            b.setBorderPainted(false);
                            b.setContentAreaFilled(false);
                            b.setMargin(new Insets(0, 0, 0, 0));
                            MyHelperClass sheet = new MyHelperClass();
                            b.addActionListener(sheet);
                            toolbar.add((JMenuItem)(Object)b);
                        } catch (Exception e) {
                        }
                    }
                }
            } else if (tag.equals("separator")) {
                MyHelperClass menu = new MyHelperClass();
                menu.addSeparator();
            } else if (tag.equals("choice")) {
                if (prop == null) {
                    System.err.println("choice without properties");
                    return;
                }
                JComboBox combo =(JComboBox)(Object) NULL; //new JComboBox();
                combo = new JComboBox();
                MyHelperClass list = new MyHelperClass();
                list = null;
                int x =(int)(Object) prop.getValue("x", 0);
                int y =(int)(Object) prop.getValue("y", 0);
                int width =(int)(Object) prop.getValue("width", 0);
                int height =(int)(Object) prop.getValue("height", 0);
                String id =(String)(Object) prop.getValue("id", "");
                Object constraints = prop.getValue("constraints");
                boolean editable =(boolean)(Object) prop.getValue("editable", false);
                boolean visible =(boolean)(Object) prop.getValue("visible", true);
                boolean enabled =(boolean)(Object) prop.getValue("enabled", true);
                MyHelperClass combo_text = new MyHelperClass();
                combo_text = prop.getValue("text", "");
//                MyHelperClass combo = new MyHelperClass();
                combo.setBounds(x, y, width, height);
//                MyHelperClass combo = new MyHelperClass();
                combo.setName((String) id);
                if (editable) {
//                    MyHelperClass combo = new MyHelperClass();
                    combo.setEditable(editable);
//                    MyHelperClass combo_text = new MyHelperClass();
                    combo.setSelectedItem(combo_text);
                }
//                MyHelperClass combo = new MyHelperClass();
                if (!visible) combo.setVisible(false);
//                MyHelperClass combo = new MyHelperClass();
                if (!enabled) combo.setEnabled(false);
                MyHelperClass layout = new MyHelperClass();
                if ((int)(Object)layout == 0) sheet.getContentPane().add((JMenuItem)(Object)combo); else sheet.getContentPane().add(combo, constraints);
            } else if (tag.equals("list")) {
                if (prop == null) {
                    System.err.println("list without properties");
                    return;
                }
                list =(MyHelperClass)(Object) new JList();
                combo = null;
                listdata =(MyHelperClass)(Object) new Vector();
                int x =(int)(Object) prop.getValue("x", 0);
                int y =(int)(Object) prop.getValue("y", 0);
                int width =(int)(Object) prop.getValue("width", 0);
                int height =(int)(Object) prop.getValue("height", 0);
                String id =(String)(Object) prop.getValue("id", "");
                Object constraints = prop.getValue("constraints");
                list.setName((String) id);
                list.setListData(listdata);
                JScrollPane sp = new JScrollPane(list);
                sp.setBounds(x, y, width, height);
                if ((int)(Object)layout == 0) sheet.getContentPane().add((JMenuItem)(Object)sp); else sheet.getContentPane().add(sp, constraints);
            } else if (tag.equals("option")) {
                if (prop == null) {
                    System.err.println("choice.option without properties");
                    return;
                }
                String value =(String)(Object) prop.getValue("value", "");
                String text =(String)(Object) prop.getValue("text", "");
                if (list != null) listdata.addElement(new ComboOption(text, value));
                if (combo != null) {
                    ComboOption co = new ComboOption(text, value);
                    combo.addItem(co);
                    if (combo_text.equals(text.trim())) combo.setSelectedItem((MyHelperClass)(Object)co);
                }
            } else if (tag.equals("label")) {
                if (prop == null) {
                    System.err.println("label without properties");
                    return;
                }
                JLabel label = new JLabel();
                int x =(int)(Object) prop.getValue("x", 0);
                int y =(int)(Object) prop.getValue("y", 0);
                int width =(int)(Object) prop.getValue("width", 0);
                int height =(int)(Object) prop.getValue("height", 0);
                String text =(String)(Object) prop.getValue("text", "");
                Object constraints = prop.getValue("constraints");
                boolean visible =(boolean)(Object) prop.getValue("visible", true);
                label.setBounds(x, y, width, height);
                label.setText(text);
                if (!visible) label.setVisible(false);
                if ((int)(Object)layout == 0) sheet.getContentPane().add((JMenuItem)(Object)label); else sheet.getContentPane().add((JScrollPane)(Object)label, constraints);
            } else if (tag.equals("button")) {
                if (prop == null) {
                    System.err.println("button without properties");
                    return;
                }
                JButton btn = new JButton();
                int x =(int)(Object) prop.getValue("x", 0);
                int y =(int)(Object) prop.getValue("y", 0);
                int width =(int)(Object) prop.getValue("width", 0);
                int height =(int)(Object) prop.getValue("height", 0);
                String id =(String)(Object) prop.getValue("id", "");
                String text =(String)(Object) prop.getValue("text", "");
                String onmouseup =(String)(Object) prop.getValue("onmouseup", "");
                Object constraints = prop.getValue("constraints");
                btn.setBounds(x, y, width, height);
                btn.setText(text);
                btn.addActionListener(sheet);
                btn.setActionCommand(onmouseup);
                if ((int)(Object)layout == 0) sheet.getContentPane().add((JMenuItem)(Object)btn); else sheet.getContentPane().add((JScrollPane)(Object)btn, constraints);
            } else if (tag.equals("radiobutton")) {
                if (prop == null) {
                    System.err.println("radiobutton without properties");
                    return;
                }
                JRadioButton rb = new JRadioButton();
                int x =(int)(Object) prop.getValue("x", 0);
                int y =(int)(Object) prop.getValue("y", 0);
                int width =(int)(Object) prop.getValue("width", 0);
                int height =(int)(Object) prop.getValue("height", 0);
                String id =(String)(Object) prop.getValue("id", "");
                String text =(String)(Object) prop.getValue("text", "");
                Object constraints = prop.getValue("constraints");
                String checked =(String)(Object) prop.getValue("checked", "false");
                rb.setBounds(x, y, width, height);
                rb.setText(text);
                rb.setName((String) id);
                rb.addActionListener(sheet);
                rb.setSelected(checked.equalsIgnoreCase("true"));
                if ((int)(Object)layout == 0) sheet.getContentPane().add((JMenuItem)(Object)rb); else sheet.getContentPane().add((JScrollPane)(Object)rb, constraints);
            } else if (tag.equals("checkbox")) {
                if (prop == null) {
                    System.err.println("checkbox without properties");
                    return;
                }
                JCheckBox cb = new JCheckBox();
                int x =(int)(Object) prop.getValue("x", 0);
                int y =(int)(Object) prop.getValue("y", 0);
                int width =(int)(Object) prop.getValue("width", 0);
                int height =(int)(Object) prop.getValue("height", 0);
                String id =(String)(Object) prop.getValue("id", "");
                String text =(String)(Object) prop.getValue("text", "");
                String onmouseup =(String)(Object) prop.getValue("onmouseup", "");
                Object constraints = prop.getValue("constraints");
                String checked =(String)(Object) prop.getValue("checked", "false");
                cb.setBounds(x, y, width, height);
                cb.setText(text);
                cb.setName((String) id);
                cb.setSelected(checked.equalsIgnoreCase("true"));
                if ((int)(Object)layout == 0) sheet.getContentPane().add((JMenuItem)(Object)cb); else sheet.getContentPane().add((JScrollPane)(Object)cb, constraints);
            } else if (tag.equals("image")) {
                if (prop == null) {
                    System.err.println("image without properties");
                    return;
                }
                JLabel label = new JLabel();
                int x =(int)(Object) prop.getValue("x", 0);
                int y =(int)(Object) prop.getValue("y", 0);
                int width =(int)(Object) prop.getValue("width", 0);
                int height =(int)(Object) prop.getValue("height", 0);
                String src =(String)(Object) prop.getValue("src", "");
                Object constraints = prop.getValue("constraints");
                label.setIcon(new ImageIcon(new URL(src)));
                label.setBounds(x, y, width, height);
                if ((int)(Object)layout == 0) sheet.getContentPane().add((JMenuItem)(Object)label); else sheet.getContentPane().add((JScrollPane)(Object)label, constraints);
            } else if (tag.equals("singlelineedit")) {
                if (prop == null) {
                    System.err.println("singlelineedit without properties");
                    return;
                }
                String pwd =(String)(Object) prop.getValue("password", "");
                JTextField sle;
                if (pwd.equalsIgnoreCase("true")) sle =(JTextField)(Object) new JPasswordField(); else sle = new JTextField();
                int x =(int)(Object) prop.getValue("x", 0);
                int y =(int)(Object) prop.getValue("y", 0);
                int width =(int)(Object) prop.getValue("width", 0);
                int height =(int)(Object) prop.getValue("height", 0);
                Object id = prop.getValue("id");
                String text =(String)(Object) prop.getValue("text", "");
                Object constraints = prop.getValue("constraints");
                sle.setBounds(x, y, width, height);
                sle.setText(text);
                sle.setName((String) id);
                if ((int)(Object)layout == 0) sheet.getContentPane().add((JMenuItem)(Object)sle); else sheet.getContentPane().add((JScrollPane)(Object)sle, constraints);
            } else if (tag.equals("treeview")) {
                if (prop == null) {
                    System.err.println("treeview without properties");
                    return;
                }
                treeview_root =(MyHelperClass)(Object) new DefaultMutableTreeNode("root");
                treeview =(MyHelperClass)(Object) new JTree(treeview_root);
                Object constraints = prop.getValue("constraints");
                sheet.getContentPane().add(new JScrollPane(treeview), constraints);
            } else if (tag.equals("treeitem")) {
                if (prop == null) {
                    System.err.println("treeview.treeitem without properties");
                    return;
                }
                String text =(String)(Object) prop.getValue("text", "");
                String value =(String)(Object) prop.getValue("value", "");
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(text);
                treeview_root.add((JMenuItem)(Object)node);
            } else if (tag.equals("table")) {
                if (prop == null) {
                    System.err.println("table without properties");
                    return;
                }
                String id =(String)(Object) prop.getValue("id", "");
                table =(MyHelperClass)(Object) new JTable();
                model =(MyHelperClass)(Object) new DefaultTableModel() {

                    public boolean isCellEditable(int row, int col) {
                        return false;
                    }
                };
                table.setModel(model);
                table.setName((String) id);
                Object constraints = prop.getValue("constraints");
                sheet.getContentPane().add(new JScrollPane(table), constraints);
                rowNumber =(int)(Object)(MyHelperClass)(Object) 0;
                columnNumber =(int)(Object)(MyHelperClass)(Object) 0;
                headerWidths =(MyHelperClass)(Object) new Vector();
            } else if (tag.equals("header")) {
                if (prop == null) {
                    System.err.println("table.header without properties");
                    return;
                }
                String text =(String)(Object) prop.getValue("text", "");
                int width =(int)(Object) prop.getValue("width", 0);
                headerWidths.addElement(new Integer(width));
                model.addColumn(text);
            } else if (tag.equals("row")) {
                rowNumber++;
                columnNumber =(int)(Object)(MyHelperClass)(Object) 0;
                model.setRowCount((MyHelperClass)(Object)rowNumber);
            } else if (tag.equals("column")) {
                columnNumber++;
                if (prop == null) {
                    System.err.println("table.column without properties");
                    return;
                }
                String value =(String)(Object) prop.getValue("value", "");
                model.setValueAt(value,(int)(Object) rowNumber - 1, columnNumber - 1);
            } else if (tag.equals("script")) {
                sheet.beginScript();
                String url =(String)(Object) prop.getValue("src");
                if (url.length() > 0) {
                    try {
                        BufferedReader r = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
                        String buffer;
                        while (true) {
                            buffer = r.readLine();
                            if (buffer == null) break;
                            sheet.script +=(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) buffer + "\n";
                        }
                        r.close();
                        sheet.endScript();
                    } catch (IOException ioe) {
                        System.err.println("[IOError] " + ioe.getMessage());
                        System.exit(0);
                    }
                }
            } else System.err.println("[sheet] unparsed tag: " + tag);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass white;
	public MyHelperClass script;
	public MyHelperClass LAYERED;
	public MyHelperClass opentype;
	public MyHelperClass MAXIMIZED;
	public MyHelperClass TYPE_4BYTE_ABGR;
public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass beginScript(){ return null; }
	public MyHelperClass endScript(){ return null; }
	public MyHelperClass addColumn(String o0){ return null; }
	public MyHelperClass setSelectedItem(MyHelperClass o0){ return null; }
	public MyHelperClass addSeparator(){ return null; }
	public MyHelperClass setWindowMenu(MyHelperClass o0){ return null; }
	public MyHelperClass setEditable(boolean o0){ return null; }
	public MyHelperClass setBounds(int o0, int o1, int o2, int o3){ return null; }
	public MyHelperClass setMaximum(boolean o0){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass getContentPane(){ return null; }
	public MyHelperClass setNormalBounds(Rectangle o0){ return null; }
	public MyHelperClass add(JMenuItem o0){ return null; }
	public MyHelperClass add(JScrollPane o0, Object o1){ return null; }
	public MyHelperClass setRowCount(MyHelperClass o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass addElement(ComboOption o0){ return null; }
	public MyHelperClass setModel(MyHelperClass o0){ return null; }
	public MyHelperClass setValueAt(String o0, int o1, int o2){ return null; }
	public MyHelperClass add(JComboBox o0, Object o1){ return null; }
	public MyHelperClass addElement(Integer o0){ return null; }
	public MyHelperClass getToolBar(){ return null; }
	public MyHelperClass setLayout(Object o0){ return null; }
	public MyHelperClass setLayout(FlowLayout o0){ return null; }
	public MyHelperClass getNextMDIPos(){ return null; }
	public MyHelperClass addSheetToMenu(String o0){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setListData(MyHelperClass o0){ return null; }
	public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass addItem(ComboOption o0){ return null; }
	public MyHelperClass setBackground(Color o0){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class Color {

Color(){}
	Color(int o0, int o1, int o2, int o3){}
	Color(int o0, int o1, int o2){}}

class Point {
public MyHelperClass y;
	public MyHelperClass x;
}

class Rectangle {

Rectangle(){}
	Rectangle(int o0, int o1, int o2, int o3){}}

class JMenuItem {

public MyHelperClass addActionListener(MyHelperClass o0){ return null; }
	public MyHelperClass setActionCommand(String o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class WABClient {

}

class ImageIcon {

ImageIcon(URL o0){}
	ImageIcon(){}
	ImageIcon(BufferedImage o0){}
	public MyHelperClass getImage(){ return null; }}

class BufferedImage {

BufferedImage(int o0, int o1, MyHelperClass o2){}
	BufferedImage(){}
	public MyHelperClass createGraphics(){ return null; }}

class Graphics {

public MyHelperClass fillRect(int o0, int o1, int o2, int o3){ return null; }
	public MyHelperClass setColor(Color o0){ return null; }
	public MyHelperClass drawImage(MyHelperClass o0, int o1, int o2, int o3, int o4, ImageObserver o5){ return null; }
	public MyHelperClass drawLine(int o0, int o1, int o2, int o3){ return null; }}

class ImageObserver {

}

class JButton {

JButton(){}
	JButton(ImageIcon o0){}
	public MyHelperClass addActionListener(MyHelperClass o0){ return null; }
	public MyHelperClass setRolloverIcon(ImageIcon o0){ return null; }
	public MyHelperClass setActionCommand(String o0){ return null; }
	public MyHelperClass setMargin(Insets o0){ return null; }
	public MyHelperClass setRolloverEnabled(boolean o0){ return null; }
	public MyHelperClass setPressedIcon(ImageIcon o0){ return null; }
	public MyHelperClass setBorderPainted(boolean o0){ return null; }
	public MyHelperClass setContentAreaFilled(boolean o0){ return null; }
	public MyHelperClass setToolTipText(String o0){ return null; }
	public MyHelperClass setBounds(int o0, int o1, int o2, int o3){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setFocusPainted(boolean o0){ return null; }}

class Insets {

Insets(){}
	Insets(int o0, int o1, int o2, int o3){}}

class Attributes {

Attributes(){}
	Attributes(org.xml.sax.Attributes o0){}
	public MyHelperClass getValue(String o0, String o1){ return null; }
	public MyHelperClass getValue(String o0){ return null; }
	public MyHelperClass getValue(String o0, int o1){ return null; }
	public MyHelperClass getValue(String o0, boolean o1){ return null; }
	public MyHelperClass getValue(String o0, MyHelperClass o1){ return null; }}

class JMenu {

}

class FlowLayout {

}

class JComboBox {

public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setSelectedItem(MyHelperClass o0){ return null; }
	public MyHelperClass setEditable(boolean o0){ return null; }
	public MyHelperClass setBounds(int o0, int o1, int o2, int o3){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }}

class JList {

}

class JScrollPane {

JScrollPane(MyHelperClass o0){}
	JScrollPane(){}
	public MyHelperClass setBounds(int o0, int o1, int o2, int o3){ return null; }}

class BorderLayout {

}

class ComboOption {

ComboOption(String o0, String o1){}
	ComboOption(){}}

class JLabel {

public MyHelperClass setIcon(ImageIcon o0){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setBounds(int o0, int o1, int o2, int o3){ return null; }}

class JRadioButton {

public MyHelperClass addActionListener(MyHelperClass o0){ return null; }
	public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setSelected(boolean o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setBounds(int o0, int o1, int o2, int o3){ return null; }}

class JCheckBox {

public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setSelected(boolean o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setBounds(int o0, int o1, int o2, int o3){ return null; }}

class JTextField {

public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setBounds(int o0, int o1, int o2, int o3){ return null; }}

class JPasswordField {

}

class DefaultMutableTreeNode {

DefaultMutableTreeNode(String o0){}
	DefaultMutableTreeNode(){}}

class JTree {

JTree(MyHelperClass o0){}
	JTree(){}}

class JTable {

}

class DefaultTableModel {

}
