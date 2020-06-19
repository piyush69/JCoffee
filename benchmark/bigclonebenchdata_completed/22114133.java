import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22114133 {
public MyHelperClass lafInfo;
	public MyHelperClass[] locas;
	public MyHelperClass mToolsAuxGraphviz;
	public MyHelperClass ccodes;
	public MyHelperClass Suku;
	public MyHelperClass[] dateCodes;
	public MyHelperClass originLanguage;
	public MyHelperClass lookAndFeel;
	public MyHelperClass dbFontSize;
	public MyHelperClass JOptionPane;
	public MyHelperClass lfNames;
	public MyHelperClass checkForMissingNames(String o0){ return null; }

//    @Override
    public void actionPerformed(ActionEvent e)  throws Throwable {
        String cmd = e.getActionCommand();
        boolean askRestart = false;
        if (cmd == null) return;
        if (cmd.equals("GRAPHVIZ")) {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new SettingFilter("exe"));
            chooser.setDialogTitle("Open exe file");
            MyHelperClass owner = new MyHelperClass();
            if (chooser.showOpenDialog(owner) != JFileChooser.APPROVE_OPTION) {
//                MyHelperClass owner = new MyHelperClass();
                kontroller.putPref(owner, "GRAPHVIZ", "");
                MyHelperClass graphVizPath = new MyHelperClass();
                graphVizPath.setText("");
                mToolsAuxGraphviz.setEnabled(false);
                return;
            }
            File f = chooser.getSelectedFile();
            if (f == null) {
                return;
            }
            String filename = f.getAbsolutePath();
            if (filename == null || filename.isEmpty()) {
//                MyHelperClass owner = new MyHelperClass();
                kontroller.putPref(owner, "GRAPHVIZ", "");
                MyHelperClass graphVizPath = new MyHelperClass();
                graphVizPath.setText("");
                mToolsAuxGraphviz.setEnabled(false);
                return;
            }
//            MyHelperClass owner = new MyHelperClass();
            kontroller.putPref(owner, "GRAPHVIZ", filename);
            MyHelperClass graphVizPath = new MyHelperClass();
            graphVizPath.setText(filename);
            mToolsAuxGraphviz.setEnabled(true);
        }
        if (cmd.equals("IMAGEMAGICK")) {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new SettingFilter("exe"));
            chooser.setDialogTitle("Open exe file");
            MyHelperClass owner = new MyHelperClass();
            if (chooser.showOpenDialog(owner) != JFileChooser.APPROVE_OPTION) {
//                MyHelperClass owner = new MyHelperClass();
                kontroller.putPref(owner, "IMAGEMAGICK", "");
                MyHelperClass imageMagickPath = new MyHelperClass();
                imageMagickPath.setText("");
                return;
            }
            File f = chooser.getSelectedFile();
            if (f == null) {
                return;
            }
            String filename = f.getAbsolutePath();
            if (filename == null || filename.isEmpty()) {
//                MyHelperClass owner = new MyHelperClass();
                kontroller.putPref(owner, "IMAGEMAGICK", "");
                MyHelperClass imageMagickPath = new MyHelperClass();
                imageMagickPath.setText("");
                return;
            }
//            MyHelperClass owner = new MyHelperClass();
            kontroller.putPref(owner, "IMAGEMAGICK", filename);
            MyHelperClass imageMagickPath = new MyHelperClass();
            imageMagickPath.setText(filename);
        }
        if (cmd.equals("FINFAMILY.XLS")) {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new SettingFilter("xls"));
            chooser.setDialogTitle("Open xls file");
            MyHelperClass owner = new MyHelperClass();
            if (chooser.showOpenDialog(owner) != JFileChooser.APPROVE_OPTION) {
//                MyHelperClass owner = new MyHelperClass();
                kontroller.putPref(owner, "FINFAMILY.XLS", "");
                MyHelperClass excelPath = new MyHelperClass();
                excelPath.setText("");
                return;
            }
            File f = chooser.getSelectedFile();
            if (f == null) {
                return;
            }
            String filename = f.getAbsolutePath();
            if (filename == null || filename.isEmpty()) {
//                MyHelperClass owner = new MyHelperClass();
                kontroller.putPref(owner, "FINFAMILY.XLS", "");
                MyHelperClass excelPath = new MyHelperClass();
                excelPath.setText("");
                return;
            }
//            MyHelperClass owner = new MyHelperClass();
            kontroller.putPref(owner, "FINFAMILY.XLS", filename);
            MyHelperClass excelPath = new MyHelperClass();
            excelPath.setText(filename);
            MyHelperClass missingKeys = new MyHelperClass();
            missingKeys = checkForMissingNames(filename);
        }
        MyHelperClass Resurses = new MyHelperClass();
        if (cmd.equals(Resurses.OK)) {
            MyHelperClass owner = new MyHelperClass();
            String newPath = kontroller.getPref(owner, "FINFAMILY.XLS", "");
            MyHelperClass exPath = new MyHelperClass();
            if (!newPath.equals(exPath)) {
                askRestart = true;
                MyHelperClass Suku = new MyHelperClass();
                Suku.setFinFamilyXls(newPath);
            }
            MyHelperClass serverUrl = new MyHelperClass();
            String input = (String) serverUrl.getSelectedItem();
            if (input == null) {
                input = "";
            }
            if (input.isEmpty()) {
//                MyHelperClass owner = new MyHelperClass();
                kontroller.putPref(owner, "SERVERURL", "");
                MyHelperClass originUrl = new MyHelperClass();
                if (!originUrl.isEmpty()) {
                    askRestart = true;
                }
            } else {
                URL url;
                String resp = null;
                try {
                    url = new URL(input + "SukuServlet");
                    HttpURLConnection uc = (HttpURLConnection) url.openConnection();
                    int resu = uc.getResponseCode();
                    if (resu == 200) {
                        byte buff[] = new byte[1024];
                        InputStream in = uc.getInputStream();
                        int len = in.read(buff);
                        resp = new String(buff, 0, len);
                        uc.disconnect();
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                if (resp != null && resp.toLowerCase().startsWith("finfamily")) {
//                    MyHelperClass owner = new MyHelperClass();
                    kontroller.putPref(owner, "SERVERURL", input);
                    MyHelperClass originUrl = new MyHelperClass();
                    if (!input.equals(originUrl)) {
                        askRestart = true;
                    }
                } else {
//                    MyHelperClass Resurses = new MyHelperClass();
                    JOptionPane.showMessageDialog(this, Resurses.getString("SERVER_ERROR"), Resurses.getString(Resurses.SUKU), JOptionPane.ERROR_MESSAGE);
                }
            }
            MyHelperClass loca = new MyHelperClass();
            int newLoca = loca.getSelectedIndex();
//            MyHelperClass owner = new MyHelperClass();
            kontroller.putPref(owner, Resurses.LOCALE, locas[newLoca]);
MyHelperClass[] locas = new MyHelperClass[5];
            if (!originLanguage.equals(locas[newLoca])) {
                askRestart = true;
            }
            MyHelperClass repolang = new MyHelperClass();
            int newLang = repolang.getSelectedIndex();
            if (newLang >= 0) {
//                MyHelperClass owner = new MyHelperClass();
                kontroller.putPref(owner, Resurses.REPOLANG, getRepoLanguage(newLang, true));
                MyHelperClass Suku = new MyHelperClass();
                Resurses.setLanguage(Suku.getRepoLanguage(newLang, true));
            }
            MyHelperClass imageScaling = new MyHelperClass();
            int imageScaler = imageScaling.getSelectedIndex();
//            MyHelperClass owner = new MyHelperClass();
            kontroller.putPref(owner, "SCALE_IMAGE", "" + imageScaler);
//            MyHelperClass owner = new MyHelperClass();
            owner.setImageScalerIndex(imageScaler);
            MyHelperClass defaultCountryCode = new MyHelperClass();
            int seleId = defaultCountryCode.getSelectedIndex();
            if (seleId >= 0) {
                MyHelperClass selectedCc = new MyHelperClass();
                selectedCc = ccodes[seleId];
            }
            try {
                MyHelperClass selectedCc = new MyHelperClass();
                Resurses.setDefaultCountry(selectedCc);
            } catch (SukuException e1) {
//                MyHelperClass owner = new MyHelperClass();
                owner.setStatus(e1.getMessage());
            }
            MyHelperClass dateFormat = new MyHelperClass();
            int newDateIndex = dateFormat.getSelectedIndex();
//            MyHelperClass owner = new MyHelperClass();
            kontroller.putPref(owner, Resurses.DATEFORMAT, dateCodes[newDateIndex]);
MyHelperClass[] dateCodes = new MyHelperClass[5];
            Resurses.setDateFormat(dateCodes[newDateIndex]);
            MyHelperClass Utils = new MyHelperClass();
            Utils.resetSukuModel();
            MyHelperClass useOpenStreetMap = new MyHelperClass();
            boolean openStreetMap = useOpenStreetMap.isSelected();
            kontroller.putPref(owner, "USE_OPEN_STREETMAP", "" + openStreetMap);
            String fntSize = dbFontSize.getText();
            kontroller.putPref(owner, "DB_VIEW_FONTSIZE", fntSize);
            String lf = lfNames[lookAndFeel.getSelectedIndex()];
            kontroller.putPref(owner, "LOOK_AND_FEEL", lf);
            int lfIdx = -1;
            for (int i = 0; i < lafInfo.length; i++) {
                if (lafInfo[i].getName().equalsIgnoreCase(lf)) {
                    lfIdx = i;
                    break;
                }
            }
            try {
                if (lfIdx < 0) {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } else {
                    UIManager.setLookAndFeel(lafInfo[lfIdx].getClassName());
                }
                SwingUtilities.updateComponentTreeUI(owner);
            } catch (Exception e1) {
                logger.log(Level.WARNING, "look_and_feel", e1);
            }
            setVisible(false);
            if (askRestart) {
                if (missingKeys != null && !missingKeys.isEmpty()) {
                    SukuPad pad = new SukuPad(this, missingKeys);
                    pad.setVisible(true);
                }
                JOptionPane.showMessageDialog(this, Resurses.getString("RESTART_FINFAMILY"), Resurses.getString(Resurses.SUKU), JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOCALE;
	public MyHelperClass OK;
	public MyHelperClass SUKU;
	public MyHelperClass DATEFORMAT;
	public MyHelperClass REPOLANG;
public MyHelperClass getRepoLanguage(int o0, boolean o1){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass getSelectedItem(){ return null; }
	public MyHelperClass isSelected(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getSelectedIndex(){ return null; }
	public MyHelperClass resetSukuModel(){ return null; }
	public MyHelperClass setImageScalerIndex(int o0){ return null; }
	public MyHelperClass setStatus(String o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setDefaultCountry(MyHelperClass o0){ return null; }
	public MyHelperClass setFinFamilyXls(String o0){ return null; }}

class ActionEvent {

public MyHelperClass getActionCommand(){ return null; }}

class JFileChooser {
public MyHelperClass APPROVE_OPTION;
public MyHelperClass setDialogTitle(String o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass showOpenDialog(MyHelperClass o0){ return null; }}

class SukuException extends Exception{
	public SukuException(String errorMessage) { super(errorMessage); }
}

class SettingFilter {

}
