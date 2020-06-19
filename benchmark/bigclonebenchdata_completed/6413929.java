import java.io.*;
import java.lang.*;
import java.util.*;



class c6413929 {
public MyHelperClass setLocation(int o0, int o1){ return null; }
public MyHelperClass setDefaultCloseOperation(MyHelperClass o0){ return null; }
public MyHelperClass setContentPane(Box o0){ return null; }
public MyHelperClass JOptionPane;
	public MyHelperClass m_inverted;
	public MyHelperClass Toolkit;
	public MyHelperClass m_color;
	public MyHelperClass JFrame;
	public MyHelperClass m_filename;
	public MyHelperClass m_chooser;
	public MyHelperClass m_currenttaunts;
	public MyHelperClass HogsConstants;
	public MyHelperClass m_textfields;
	public MyHelperClass Box;
	public MyHelperClass PathFinder;
	public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass getWidth(){ return null; }
	public MyHelperClass buildMouseStylePanel(){ return null; }
	public MyHelperClass buildColorPanel(){ return null; }
	public MyHelperClass buildTauntsPanel(){ return null; }
	public MyHelperClass buildButtonsPanel(){ return null; }
	public MyHelperClass readFromFile(Reader o0){ return null; }
	public MyHelperClass pack(){ return null; }
	public MyHelperClass getHeight(){ return null; }

    public void HogsCustomizer() {
        m_filename = PathFinder.getCustsFile();
        m_currenttaunts =(MyHelperClass)(Object) new String[10];
        m_textfields =(MyHelperClass)(Object) new JTextField[10];
        m_color =(MyHelperClass)(Object) new Color(255, 255, 255);
        boolean exists = (new File((String)(Object)m_filename)).exists();
        m_inverted =(MyHelperClass)(Object) false;
        m_chooser =(MyHelperClass)(Object) new JColorChooser();
        AbstractColorChooserPanel[] panels =(AbstractColorChooserPanel[])(Object) m_chooser.getChooserPanels();
        m_chooser.removeChooserPanel(panels[0]);
        m_chooser.removeChooserPanel(panels[2]);
        m_chooser.setPreviewPanel(new JPanel());
        Reader reader = null;
        if (exists) {
            try {
                reader = new FileReader((String)(Object)m_filename);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            Object[] options = { "Yes", "No, Thanks" };
            int n =(int)(Object) JOptionPane.showOptionDialog(this, "You do not have a customization file in your home directory.\n                 " + "Would you like to create one?", "Hogs Customization", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (n == 0) {
                try {
                    FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream((String)(Object)HogsConstants.CUSTS_TEMPLATE).getChannel());
                    FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream((String)(Object)m_filename).getChannel());
                    dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                    srcChannel.close();
                    dstChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.exit(0);
                }
            } else {
                System.exit(0);
            }
            try {
                reader = new FileReader((String)(Object)m_filename);
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
                System.exit(0);
            }
        }
        try {
            readFromFile(reader);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        Box mainpanel =(Box)(Object) Box.createVerticalBox();
        mainpanel.add(buildTauntsPanel());
        mainpanel.add(buildMouseStylePanel());
        mainpanel.add(Box.createVerticalStrut(10));
        mainpanel.add(buildColorPanel());
        mainpanel.add(Box.createVerticalStrut(10));
        mainpanel.add(buildButtonsPanel());
        mainpanel.add(Box.createVerticalStrut(10));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainpanel);
        this.pack();
        Dimension dim =(Dimension)(Object) Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((int)(Object)dim.width / 2 - ((int)(Object)this.getWidth() / 2),(int)(Object) dim.height / 2 - ((int)(Object)this.getHeight() / 2));
        this.setTitle("Hogs Customizer");
        this.setVisible(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass YES_NO_OPTION;
	public MyHelperClass QUESTION_MESSAGE;
	public MyHelperClass EXIT_ON_CLOSE;
	public MyHelperClass CUSTS_TEMPLATE;
public MyHelperClass removeChooserPanel(AbstractColorChooserPanel o0){ return null; }
	public MyHelperClass setPreviewPanel(JPanel o0){ return null; }
	public MyHelperClass createVerticalBox(){ return null; }
	public MyHelperClass getScreenSize(){ return null; }
	public MyHelperClass createVerticalStrut(int o0){ return null; }
	public MyHelperClass getCustsFile(){ return null; }
	public MyHelperClass getDefaultToolkit(){ return null; }
	public MyHelperClass getChooserPanels(){ return null; }
	public MyHelperClass showOptionDialog(c6413929 o0, String o1, String o2, MyHelperClass o3, MyHelperClass o4, Object o5, Object[] o6, Object o7){ return null; }}

class JTextField {

}

class Color {

Color(int o0, int o1, int o2){}
	Color(){}}

class JColorChooser {

}

class AbstractColorChooserPanel {

}

class JPanel {

}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}

class Box {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class Dimension {
public MyHelperClass height;
	public MyHelperClass width;
}
