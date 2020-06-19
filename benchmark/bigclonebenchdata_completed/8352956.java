


class c8352956 {
public MyHelperClass Level;
	public MyHelperClass JOptionPane;
	public MyHelperClass JFileChooser;
	public MyHelperClass LogHandler;
	public MyHelperClass createImage(){ return null; }
	public MyHelperClass setDefaultPath(String o0){ return null; }
	public MyHelperClass getDefaultPath(){ return null; }
	public MyHelperClass setPath(String o0){ return null; }
	public MyHelperClass getFatherPanel(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass createDefaultImage(){ return null; }
	public MyHelperClass getFatherFrame(){ return null; }
	public MyHelperClass isLoggingEnabled(){ return null; }

    void IconmenuItem5_actionPerformed(ActionEvent e) {
        JFileChooser jFileChooser1 = new JFileChooser();
        String separator = "";
        if (getPath() != null && !getPath().equals("")) {
            jFileChooser1.setCurrentDirectory(new File(getPath()));
            jFileChooser1.setSelectedFile(new File(getPath()));
        }
        if (JFileChooser.APPROVE_OPTION == jFileChooser1.showOpenDialog(this.getFatherFrame())) {
            setPath((String)(Object)jFileChooser1.getSelectedFile().getPath());
            separator =(String)(Object) jFileChooser1.getSelectedFile().separator;
            File dirImg = new File("." + separator + "images");
            if (!(Boolean)(Object)dirImg.exists()) {
                dirImg.mkdir();
            }
            int index =(int)(Object) getPath().lastIndexOf(separator);
            String imgName =(String)(Object) getPath().substring(index);
            String newPath = dirImg + imgName;
            try {
                File inputFile = new File(getPath());
                File outputFile = new File(newPath);
                if (!inputFile.getCanonicalPath().equals(outputFile.getCanonicalPath())) {
                    FileInputStream in = new FileInputStream(inputFile);
                    FileOutputStream out = new FileOutputStream(outputFile);
                    int c;
                    while ((c =(int)(Object) in.read()) != -1) out.write(c);
                    in.close();
                    out.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                LogHandler.log(ex.getMessage(), Level.INFO, "LOG_MSG", isLoggingEnabled());
                JOptionPane.showMessageDialog(null, ex.getMessage().substring(0, Math.min(ex.getMessage().length(),(int)(Object) getFatherPanel().MAX_DIALOG_MSG_SZ)) + "-" + getClass(), "", JOptionPane.ERROR_MESSAGE);
            }
            setPath(newPath);
            if (getDefaultPath() == null || getDefaultPath().equals("")) {
                String msgString = "E' stata selezionata un'immagine da associare all'IconShape, ma non e' " + "stata selezionata ancora nessun'immagine di default. Imposto quella scelta anche come " + "immagine di default?";
                if (JOptionPane.showConfirmDialog(null, msgString.substring(0, Math.min(msgString.length(),(int)(Object) getFatherPanel().MAX_DIALOG_MSG_SZ)), "choose one", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    setDefaultPath(newPath);
                    createDefaultImage();
                }
            }
            createImage();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
	public MyHelperClass YES_OPTION;
	public MyHelperClass APPROVE_OPTION;
	public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass YES_NO_OPTION;
	public MyHelperClass MAX_DIALOG_MSG_SZ;
	public MyHelperClass separator;
public MyHelperClass showConfirmDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass log(String o0, MyHelperClass o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass substring(int o0){ return null; }}

class ActionEvent {

}

class JFileChooser {

public MyHelperClass showOpenDialog(MyHelperClass o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass setSelectedFile(File o0){ return null; }
	public MyHelperClass setCurrentDirectory(File o0){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	File(String o0){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass mkdir(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass close(){ return null; }}
