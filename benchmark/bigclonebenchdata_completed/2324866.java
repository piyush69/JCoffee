import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2324866 {
public MyHelperClass addInternalFrameListener(<anonymous InternalFrameAdapter> o0){ return null; }
public MyHelperClass addInternalFrameListener(){ return null; }
public MyHelperClass tableModel;
	public MyHelperClass table;
	public MyHelperClass JTable;
	public MyHelperClass getJMenuBar(){ return null; }

    public  c2324866(FileManager owner, File file, Delimiter delim)  throws Throwable {
        super(owner, file.getPath());
        JPanel pane = new JPanel(new BorderLayout());
        MyHelperClass contentPane = new MyHelperClass();
//        MyHelperClass contentPane = new MyHelperClass();
        MyHelperClass contentPane = new MyHelperClass();
        super.contentPane.add(pane);
        this.tableModel = new BigTableModel(file, delim);
        this.table = new JTable(tableModel);
        this.table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        this.tableModel.setTable(this.table);
        pane.add(new JScrollPane(this.table));
        addInternalFrameListener(new InternalFrameAdapter() {

//            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                tableModel.close();
            }
        });
        JMenu menu = new JMenu("Tools");
        getJMenuBar().add(menu);
        menu.add(new AbstractAction("NCBI") {

//            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    MyHelperClass Pattern = new MyHelperClass();
                    Pattern delim = Pattern.compile("[ ]");
                    BufferedReader r = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("/home/lindenb/jeter.txt.gz"))));
                    String line = null;
                    URL url = new URL("http://eutils.ncbi.nlm.nih.gov/entrez/eutils/efetch.fcgi");
                    URLConnection conn = url.openConnection();
                    conn.setDoOutput(true);
                    OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
                    wr.write("db=snp&retmode=xml");
                    while ((line = r.readLine()) != null) {
                        String tokens[] = delim.split(line, 2);
                        if (!tokens[0].startsWith("rs")) continue;
                        wr.write("&id=" + tokens[0].substring(2).trim());
                    }
                    wr.flush();
                    r.close();
                    InputStream in = conn.getInputStream();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copyTo(in, System.err);
                    in.close();
                    wr.close();
                } catch (IOException err) {
                    err.printStackTrace();
                }
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass AUTO_RESIZE_OFF;
public MyHelperClass copyTo(InputStream o0, PrintStream o1){ return null; }
	public MyHelperClass add(JMenu o0){ return null; }
	public MyHelperClass setAutoResizeMode(MyHelperClass o0){ return null; }
	public MyHelperClass setTable(MyHelperClass o0){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileManager {

}

class Delimiter {

}

class JPanel {

JPanel(BorderLayout o0){}
	JPanel(){}
	public MyHelperClass add(JScrollPane o0){ return null; }}

class BorderLayout {

}

class JScrollPane {

JScrollPane(MyHelperClass o0){}
	JScrollPane(){}}

class InternalFrameAdapter {

}

class JMenu {

JMenu(String o0){}
	JMenu(){}
	public MyHelperClass add(){ return null; }}

class AbstractAction {

AbstractAction(String o0){}
	AbstractAction(){}}

class Object {

Object(FileManager o0, String o1){}
	Object(){}}

class BigTableModel {

BigTableModel(File o0, Delimiter o1){}
	BigTableModel(){}}

class JTable {

JTable(MyHelperClass o0){}
	JTable(){}}

class InternalFrameEvent {

}

class ActionEvent {

}

class Pattern {

public MyHelperClass split(String o0, int o1){ return null; }}

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}}
