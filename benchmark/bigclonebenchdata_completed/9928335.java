import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9928335 {
public MyHelperClass Logger;

    void search(String query, String display) {
        try {
            String safeUrl;
            try {
                MyHelperClass baseUrl = new MyHelperClass();
                safeUrl = baseUrl + URLEncoder.encode(query, "UTF-8");
            } catch (UnsupportedEncodingException ex) {
                MyHelperClass baseUrl = new MyHelperClass();
                safeUrl = baseUrl + query;
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            URL url_connection = new URL(safeUrl);
            url_connection.openConnection();
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(url_connection.openStream());
            Vector<SoundEntry> entries = new Vector<SoundEntry>();
            Vector<String> path = new Vector<String>();
            path.add("Results");
            MyHelperClass DocumentManager = new MyHelperClass();
            for (Hashtable<String, String> field : DocumentManager.getSubTable(document, path, "Entry")) {
                entries.add(new SoundEntry(field));
            }
            int index;
            MyHelperClass tpnResults = new MyHelperClass();
            ButtonTabComponent btc = new ButtonTabComponent(tpnResults);
            btc.setInheritsPopupMenu(true);
            if (entries.isEmpty()) {
                JLabel msg = new JLabel("No results found");
//                MyHelperClass tpnResults = new MyHelperClass();
                tpnResults.add(display, msg);
//                MyHelperClass tpnResults = new MyHelperClass();
                index = tpnResults.indexOfComponent(msg);
            } else {
                Enumeration<String> iter = entries.firstElement().fields.keys();
                while (iter.hasMoreElements()) {
                    String field = iter.nextElement();
                    MyHelperClass header = new MyHelperClass();
                    if (!header.contains(field)) {
//                        MyHelperClass header = new MyHelperClass();
                        header.addDefaultField(field);
                    }
                }
                JTable result = new JTable();
                MyHelperClass header = new MyHelperClass();
                Vector<String> fieldNames = header.getShownNames();
                DefaultTableModel model = new DefaultTableModel(fieldNames, 0);
                for (SoundEntry entry : entries) {
//                    MyHelperClass header = new MyHelperClass();
                    model.addRow(entry.getShownFields(header.getShownNames()));
                }
                result.setModel(model);
                result.setColumnSelectionAllowed(false);
                result.setSelectionMode(0);
                result.addMouseListener(new MouseAdapter() {

//                    @Override
                    public void mouseClicked(MouseEvent e)  throws Throwable {
                        ((JTable) e.getSource()).getComponentAt(e.getPoint());
                        int row = ((JTable) e.getSource()).rowAtPoint(e.getPoint());
                        SoundEntry entry = ((ButtonTabComponent) tpnResults.getTabComponentAt(tpnResults.getSelectedIndex())).records.get(row);
                        String file = entry.fields.get("FileName");
                        String title = entry.fields.get("Title");
                        if (file != null && !file.isEmpty()) {
                            try {
                                AudioSource src = new AudioSource(new URL(file), title);
                                src.attachAudioStateListener(new AudioStateListener() {

                                    public void AudioStateReceived(AudioStateEvent event) {
                                        if (event.getAudioState() != AudioStateEvent.AudioState.CLOSED && event.getAudioState() != AudioStateEvent.AudioState.CLOSING) {
                                            llblStatus.setText(event.getAudioState() + ": " + ((AudioSource) event.getSource()).getTitle().toString());
                                        }
                                    }
                                });
                                MyHelperClass audioPlayer = new MyHelperClass();
                                audioPlayer.open(src);
                            } catch (Exception j) {
                            }
                        }
                    }
                });
                JScrollPane scrollPane = new JScrollPane(result);
//                MyHelperClass tpnResults = new MyHelperClass();
                tpnResults.add(display, scrollPane);
//                MyHelperClass tpnResults = new MyHelperClass();
                index = tpnResults.indexOfComponent(scrollPane);
                btc.records = entries;
            }
//            MyHelperClass tpnResults = new MyHelperClass();
            tpnResults.setTabComponentAt(index, btc);
//            MyHelperClass tpnResults = new MyHelperClass();
            tpnResults.setSelectedIndex(index);
        } catch (SAXException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass getSubTable(Document o0, Vector<String o1, String o2){ return null; }
	public MyHelperClass getSelectedIndex(){ return null; }
	public MyHelperClass addDefaultField(String o0){ return null; }
	public MyHelperClass indexOfComponent(JScrollPane o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getShownNames(){ return null; }
	public MyHelperClass setTabComponentAt(int o0, ButtonTabComponent o1){ return null; }
	public MyHelperClass setSelectedIndex(int o0){ return null; }
	public MyHelperClass indexOfComponent(JLabel o0){ return null; }
	public MyHelperClass add(String o0, JScrollPane o1){ return null; }
	public MyHelperClass add(String o0, JLabel o1){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

}

class SoundEntry {
public MyHelperClass fields;
SoundEntry(){}
	SoundEntry(Hashtable<String,String> o0){}}

class ButtonTabComponent {
public MyHelperClass records;
ButtonTabComponent(MyHelperClass o0){}
	ButtonTabComponent(){}
	public MyHelperClass setInheritsPopupMenu(boolean o0){ return null; }}

class JLabel {

JLabel(String o0){}
	JLabel(){}}

class JTable {

public MyHelperClass setSelectionMode(int o0){ return null; }
	public MyHelperClass setColumnSelectionAllowed(boolean o0){ return null; }
	public MyHelperClass setModel(DefaultTableModel o0){ return null; }
	public MyHelperClass addMouseListener(){ return null; }}

class DefaultTableModel {

DefaultTableModel(){}
	DefaultTableModel(Vector<String> o0, int o1){}}

class MouseAdapter {

}

class JScrollPane {

JScrollPane(JTable o0){}
	JScrollPane(){}}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class Client {

}

class MouseEvent {

}

class AudioSource {

}

class AudioStateListener {

}
