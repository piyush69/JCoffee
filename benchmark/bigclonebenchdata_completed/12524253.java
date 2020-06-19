import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12524253 {
public MyHelperClass setMinimumSize(Dimension o0){ return null; }
	public MyHelperClass getAsByte(MyHelperClass o0){ return null; }
public MyHelperClass DIFFICULTIES;
	public MyHelperClass close(){ return null; }
public MyHelperClass BorderLayout;
	public MyHelperClass Util;
	public MyHelperClass instance;
	public MyHelperClass save;
	public MyHelperClass songSelector;
	public MyHelperClass author;
	public MyHelperClass title;
	public MyHelperClass difficulty;
	public MyHelperClass configKey;
	public MyHelperClass getRootPane(){ return null; }
	public MyHelperClass getContentPane(){ return null; }

    public  c12524253(JFrame frame)  throws Throwable {
        super(frame, "Menu_SongList", "songList");
        setMinimumSize(new Dimension(400, 200));
        JPanel panel, spanel;
        Container contentPane;
        (contentPane =(Container)(Object) getContentPane()).add(songSelector =(MyHelperClass)(Object) new SongSelector(configKey, null, true));
        songSelector.setSelectionAction(new Runnable() {

            public void run() {
                MyHelperClass songSelector = new MyHelperClass();
                final Item item = songSelector.getSelectedInfo();
                if (item != null) {
                    try {
                        MyHelperClass NULL = new MyHelperClass();
                        File selection = NULL; //new File();
                        selection = new File(item.getKey().toURI());
                        MyHelperClass author = new MyHelperClass();
                        author.setEnabled(true);
                        MyHelperClass title = new MyHelperClass();
                        title.setEnabled(true);
                        MyHelperClass difficulty = new MyHelperClass();
                        difficulty.setEnabled(true);
                        MyHelperClass save = new MyHelperClass();
                        save.setEnabled(true);
                        final MidiFileInfo info = item.getValue();
//                        MyHelperClass author = new MyHelperClass();
                        author.setText(info.getAuthor());
//                        MyHelperClass title = new MyHelperClass();
                        title.setText(info.getTitle());
//                        MyHelperClass difficulty = new MyHelperClass();
                        Util.selectKey(difficulty, info.getDifficulty());
                        return;
                    } catch (Exception e) {
                    }
                }
                MyHelperClass selection = new MyHelperClass();
                selection = null;
                MyHelperClass author = new MyHelperClass();
                author.setEnabled(false);
                MyHelperClass title = new MyHelperClass();
                title.setEnabled(false);
                MyHelperClass difficulty = new MyHelperClass();
                difficulty.setEnabled(false);
                MyHelperClass save = new MyHelperClass();
                save.setEnabled(false);
            }
        });
        contentPane.add(panel = new JPanel(), BorderLayout.SOUTH);
        panel.setLayout(new BorderLayout());
        JScrollPane scrollPane;
        panel.add(scrollPane = new JScrollPane(spanel = new JPanel()), BorderLayout.NORTH);
        scrollPane.setPreferredSize(new Dimension(0, 60));
        Util.addLabeledComponent(spanel, "Lbl_Author", author =(MyHelperClass)(Object) new JTextField(10));
        Util.addLabeledComponent(spanel, "Lbl_Title", title =(MyHelperClass)(Object) new JTextField(14));
        Util.addLabeledComponent(spanel, "Lbl_Difficulty", difficulty =(MyHelperClass)(Object)(Object)(Object) new JComboBox());
        difficulty.addItem(new Item((byte) -1, ""));
        for (Map.Entry<Byte, String> entry : DIFFICULTIES.entrySet()) {
            final String value = entry.getValue();
            difficulty.addItem(new Item(entry.getKey(), Util.getMsg(value, value), value));
        }
        spanel.add(save =(MyHelperClass)(Object)(Object)(Object) new JButton());
        Util.updateButtonText(save, "Save");
        save.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                MyHelperClass selection = new MyHelperClass();
                MyHelperClass MidiSong = new MyHelperClass();
                final File selected = MidiSong.setMidiFileInfo(selection, author.getText(), title.getText(), getAsByte(difficulty));
                SongSelector.refresh();
                try {
                    songSelector.setSelected(selected == null ? null : selected.toURI().toURL());
                } catch (MalformedURLException ex) {
                }
            }
        });
        author.setEnabled(false);
        title.setEnabled(false);
        difficulty.setEnabled(false);
        save.setEnabled(false);
        JButton button;
        panel.add(spanel = new JPanel(), BorderLayout.WEST);
        spanel.add(button = new JButton());
        Util.updateButtonText(button, "Import");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                MyHelperClass KeyboardHero = new MyHelperClass();
                final File inputFile = KeyboardHero.midiFile();
                try {
                    if (inputFile == null) return;
                    MyHelperClass MidiSong = new MyHelperClass();
                    final File dir = (new File(Util.DATA_FOLDER + MidiSong.MIDI_FILES_DIR));
                    if (dir.exists()) {
                        if (!dir.isDirectory()) {
                            Util.error(Util.getMsg("Err_MidiFilesDirNotDirectory"), dir.getParent());
                            return;
                        }
                    } else if (!dir.mkdirs()) {
                        Util.error(Util.getMsg("Err_CouldntMkDir"), dir.getParent());
                        return;
                    }
                    File outputFile = new File(dir.getPath() + File.separator + inputFile.getName());
//                    MyHelperClass KeyboardHero = new MyHelperClass();
                    if (!outputFile.exists() || KeyboardHero.confirm("Que_FileExistsOverwrite")) {
                        final FileChannel inChannel = (FileChannel)(Object)new FileInputStream(inputFile).getChannel();
                        inChannel.transferTo(0, inChannel.size(), new FileOutputStream(outputFile).getChannel());
                    }
                } catch (Exception ex) {
                    Util.getMsg(Util.getMsg("Err_CouldntImportSong"), ex.toString());
                }
                SongSelector.refresh();
            }
        });
        spanel.add(button = new JButton());
        Util.updateButtonText(button, "Delete");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                MyHelperClass KeyboardHero = new MyHelperClass();
                if (KeyboardHero.confirm(Util.getMsg("Que_SureToDelete"))) {
                    try {
                        new File(songSelector.getSelectedFile().toURI()).delete();
                    } catch (Exception ex) {
                        Util.error(Util.getMsg("Err_CouldntDeleteFile"), ex.toString());
                    }
                    SongSelector.refresh();
                }
            }
        });
        panel.add(spanel = new JPanel(), BorderLayout.CENTER);
        spanel.setLayout(new FlowLayout());
        spanel.add(button = new JButton());
        Util.updateButtonText(button, "Close");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                close();
            }
        });
        spanel.add(button = new JButton());
        Util.updateButtonText(button, "Play");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                MyHelperClass Game = new MyHelperClass();
                Game.newGame(songSelector.getSelectedFile());
                close();
            }
        });
        panel.add(spanel = new JPanel(), BorderLayout.EAST);
        spanel.add(button = new JButton());
        Util.updateButtonText(button, "Refresh");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                SongSelector.refresh();
            }
        });
        getRootPane().setDefaultButton(button);
        instance =(MyHelperClass)(Object)(Object)(Object) this;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MIDI_FILES_DIR;
	public MyHelperClass CENTER;
	public MyHelperClass NORTH;
	public MyHelperClass SOUTH;
	public MyHelperClass WEST;
	public MyHelperClass DATA_FOLDER;
	public MyHelperClass EAST;
public MyHelperClass error(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getMsg(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass confirm(MyHelperClass o0){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass midiFile(){ return null; }
	public MyHelperClass updateButtonText(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass entrySet(){ return null; }
	public MyHelperClass getSelectedInfo(){ return null; }
	public MyHelperClass getMsg(String o0){ return null; }
	public MyHelperClass setText(MyHelperClass o0){ return null; }
	public MyHelperClass addActionListener(<anonymous ActionListener> o0){ return null; }
	public MyHelperClass addLabeledComponent(JPanel o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass getMsg(String o0, String o1){ return null; }
	public MyHelperClass updateButtonText(JButton o0, String o1){ return null; }
	public MyHelperClass selectKey(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass newGame(MyHelperClass o0){ return null; }
	public MyHelperClass addActionListener(){ return null; }
	public MyHelperClass toURI(){ return null; }
	public MyHelperClass setSelectionAction(){ return null; }
	public MyHelperClass setSelectionAction(<anonymous Runnable> o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass setDefaultButton(JButton o0){ return null; }
	public MyHelperClass confirm(String o0){ return null; }}

class JFrame {

}

class Dimension {

Dimension(int o0, int o1){}
	Dimension(){}}

class JPanel {

public MyHelperClass add(JButton o0){ return null; }
	public MyHelperClass setLayout(BorderLayout o0){ return null; }
	public MyHelperClass add(JScrollPane o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLayout(FlowLayout o0){ return null; }
	public MyHelperClass add(JPanel o0, MyHelperClass o1){ return null; }}

class Container {

public MyHelperClass add(JPanel o0, MyHelperClass o1){ return null; }}

class SongSelector {

SongSelector(MyHelperClass o0, Object o1, boolean o2){}
	SongSelector(){}
	public static MyHelperClass refresh(){ return null; }}

class Item {

Item(){}
	Item(byte o0, String o1){}
	public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class MidiFileInfo {

public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getAuthor(){ return null; }
	public MyHelperClass getDifficulty(){ return null; }}

class BorderLayout {

}

class JScrollPane {

JScrollPane(){}
	JScrollPane(JPanel o0){}
	public MyHelperClass setPreferredSize(Dimension o0){ return null; }}

class JTextField {

JTextField(int o0){}
	JTextField(){}}

class JComboBox {

}

class JButton {

public MyHelperClass addActionListener(){ return null; }
	public MyHelperClass addActionListener(<anonymous ActionListener> o0){ return null; }}

class ActionListener {

}

class FlowLayout {

}

class Object {

Object(JFrame o0, String o1, String o2){}
	Object(){}}

class ActionEvent {

}

class FileChannel {

public MyHelperClass size(){ return null; }}
