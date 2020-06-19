import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1896923 {
public static MyHelperClass ResizeBehavior;
//public MyHelperClass ResizeBehavior;

    protected static JXStatusBar getStatusBar(final JXPanel jxPanel, final JTabbedPane mainTabbedPane)  throws Throwable {
        JXStatusBar statusBar = new JXStatusBar();
        try {
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            Enumeration<URL> urls = cl.getResources("META-INF/MANIFEST.MF");
            String substanceVer = null;
            String substanceBuildStamp = null;
            while (urls.hasMoreElements()) {
                InputStream is = urls.nextElement().openStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                while (true) {
                    String line = br.readLine();
                    if (line == null) break;
                    int firstColonIndex = line.indexOf(":");
                    if (firstColonIndex < 0) continue;
                    String name = line.substring(0, firstColonIndex).trim();
                    String val = line.substring(firstColonIndex + 1).trim();
                    if (name.compareTo("Substance-Version") == 0) substanceVer = val;
                    if (name.compareTo("Substance-BuildStamp") == 0) substanceBuildStamp = val;
                }
                try {
                    br.close();
                } catch (IOException ioe) {
                }
            }
            if (substanceVer != null) {
                JLabel statusLabel = new JLabel(substanceVer + " [built on " + substanceBuildStamp + "]");
                Constraint cStatusLabel = new Constraint();
                cStatusLabel.setFixedWidth(300);
                statusBar.add(statusLabel, cStatusLabel);
            }
        } catch (IOException ioe) {
        }
        Constraint c2 = new Constraint(ResizeBehavior.FILL);
        final JLabel tabLabel = new JLabel("");
        statusBar.add(tabLabel, c2);
        mainTabbedPane.getModel().addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent e) {
                int selectedIndex =(int)(Object) mainTabbedPane.getSelectedIndex();
                if (selectedIndex < 0) tabLabel.setText("No selected tab"); else tabLabel.setText("Tab " + mainTabbedPane.getTitleAt(selectedIndex) + " selected");
            }
        });
        MyHelperClass FontSizePanel = new MyHelperClass();
        JPanel fontSizePanel =(JPanel)(Object) FontSizePanel.getPanel();
        Constraint fontSizePanelConstraints = new Constraint();
        fontSizePanelConstraints.setFixedWidth(270);
        statusBar.add(fontSizePanel, fontSizePanelConstraints);
        MyHelperClass FlowLayout = new MyHelperClass();
        JPanel alphaPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 0, 0));
        final JLabel alphaLabel = new JLabel("100%");
        final JSlider alphaSlider = new JSlider(0, 100, 100);
        alphaSlider.setFocusable(false);
        alphaSlider.addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent e) {
                int currValue =(int)(Object) alphaSlider.getValue();
                alphaLabel.setText(currValue + "%");
                jxPanel.setAlpha(currValue / 100.0f);
            }
        });
        alphaSlider.setToolTipText("Changes the global opacity. Is not Substance-specific");
        alphaSlider.setPreferredSize(new Dimension(120, alphaSlider.getPreferredSize().height));
        alphaPanel.add(alphaLabel);
        alphaPanel.add(alphaSlider);
        Constraint alphaPanelConstraints = new Constraint();
        alphaPanelConstraints.setFixedWidth(160);
        statusBar.add(alphaPanel, alphaPanelConstraints);
        return statusBar;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass height;
	public MyHelperClass LEADING;
	public MyHelperClass FILL;
public MyHelperClass getPanel(){ return null; }
	public MyHelperClass addChangeListener(){ return null; }
	public MyHelperClass addChangeListener( ChangeListener o0){ return null; }}

class JXPanel {

public MyHelperClass setAlpha(float o0){ return null; }}

class JTabbedPane {

public MyHelperClass getSelectedIndex(){ return null; }
	public MyHelperClass getTitleAt(int o0){ return null; }
	public MyHelperClass getModel(){ return null; }}

class JXStatusBar {

public MyHelperClass add(JPanel o0, Constraint o1){ return null; }
	public MyHelperClass add(JLabel o0, Constraint o1){ return null; }}

class JLabel {

JLabel(String o0){}
	JLabel(){}
	public MyHelperClass setText(String o0){ return null; }}

class ChangeListener {

}

class JPanel {

JPanel(){}
	JPanel(FlowLayout o0){}
	public MyHelperClass add(JLabel o0){ return null; }
	public MyHelperClass add(JSlider o0){ return null; }}

class FlowLayout {

FlowLayout(MyHelperClass o0, int o1, int o2){}
	FlowLayout(){}}

class JSlider {

JSlider(){}
	JSlider(int o0, int o1, int o2){}
	public MyHelperClass getPreferredSize(){ return null; }
	public MyHelperClass setToolTipText(String o0){ return null; }
	public MyHelperClass setFocusable(boolean o0){ return null; }
	public MyHelperClass addChangeListener(){ return null; }
	public MyHelperClass addChangeListener( ChangeListener o0){ return null; }
	public MyHelperClass setPreferredSize(Dimension o0){ return null; }
	public MyHelperClass getValue(){ return null; }}

class Dimension {

Dimension(){}
	Dimension(int o0, MyHelperClass o1){}}

class Constraint {

Constraint(){}
	Constraint(MyHelperClass o0){}
	public MyHelperClass setFixedWidth(int o0){ return null; }}

class ChangeEvent {

}
