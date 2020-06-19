import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22222255 {
public MyHelperClass extractEnsemblCoords(String o0){ return null; }
public MyHelperClass scrollPane;
	public MyHelperClass commentText;
	public MyHelperClass BorderLayout;
	public MyHelperClass JOptionPane;
	public MyHelperClass keyword;
	public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass show(){ return null; }
	public MyHelperClass getContentPane(){ return null; }

    public void doQuery(String keyword, final int page)  throws Throwable {
        this.keyword =(MyHelperClass)(Object) keyword;
        keyword = keyword.replace(' ', '+');
        commentText =(MyHelperClass)(Object) new JTextArea(10, 80);
        final Vector commentVector = new Vector();
        int matchingDocCount = 0;
        int hitCount = 0;
        getContentPane().removeAll();
        Vector linkVector = new Vector();
        try {
            String featureid = keyword;
            URL connectURL = new URL("http://www.ensembl.org/Homo_sapiens/textview?idx=External&q=" + keyword + "&page=" + page);
            InputStream urlStream = connectURL.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlStream));
            String line, link, content, label, head = null;
            Box tabBox = null;
            String linkstr;
            String comment = "";
            int EnsExtCount;
            int EnsGeneCount;
            while ((line = reader.readLine()) != null) {
                if (line.indexOf("documents match your query") != -1) {
                    matchingDocCount = Integer.parseInt(line.substring(line.indexOf("<B>") + 3, line.indexOf("</B>")));
                    continue;
                }
                if (line.indexOf("matches in the Ensembl External index") != -1) {
                }
                if (line.indexOf("matches in the Ensembl Gene index:") != -1) {
                }
                if (line.indexOf("Homo_sapiens/geneview?gene") != -1) {
                    if (line.indexOf("www.ensembl.org") != -1) {
                        line = line.substring(line.indexOf("www.ensembl.org"));
                        line = line.substring(line.indexOf("</A>") + 4);
                    }
                    int linkStart = line.indexOf("Homo_sapiens/geneview?gene");
                    if (linkStart == -1) break;
                    linkstr = "http://www.ensembl.org/" + line.substring(linkStart, line.indexOf("\">"));
                    line = line.substring(line.indexOf("</A>") + 4);
                    StringBuffer chars = new StringBuffer(line.length());
                    boolean inTag = false;
                    boolean inEntity = false;
                    boolean firstBRTossed = false;
                    line = line.substring(line.indexOf("<"));
                    for (int ch = 0; ch < line.length(); ch++) {
                        if (line.charAt(ch) == '<') {
                            inTag = true;
                            if ((line.charAt(ch + 1) == 'b' || line.charAt(ch + 1) == 'B') && (line.charAt(ch + 2) == 'r' || line.charAt(ch + 2) == 'R')) {
                                if (firstBRTossed) {
                                    chars.append("\n");
                                } else {
                                    firstBRTossed = true;
                                }
                            }
                        }
                        if (line.charAt(ch) == '&') inEntity = true;
                        if (!inTag && !inEntity) chars.append(line.charAt(ch));
                        if (line.charAt(ch) == ';') inEntity = false;
                        if (line.charAt(ch) == '>') inTag = false;
                    }
                    comment = chars.toString();
                    commentVector.add(comment);
                    linkVector.add(linkstr);
                    hitCount++;
                }
            }
            if (hitCount == 0) commentText.setText("No Matches Found for " + keyword);
            commentText.setLineWrap(true);
            commentText.setWrapStyleWord(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "No Matches Found for " + keyword);
            return;
        }
        final JList lst = new JList(linkVector);
        lst.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                int ind =(int)(Object) lst.getSelectedIndex();
                commentText.setText((String) commentVector.elementAt(ind));
                commentText.select(0, 0);
            }
        });
        MouseListener mouseListener =(MouseListener)(Object) new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int index = lst.locationToIndex(e.getPoint());
                    extractEnsemblCoords((String) lst.getModel().getElementAt(index));
                }
            }
        };
        lst.addMouseListener(mouseListener);
        lst.setSelectedIndex(0);
        scrollPane =(MyHelperClass)(Object) new JScrollPane(commentText);
        JPanel pagePanel = new JPanel();
        final JButton prevBttn = new JButton("<=");
        final JButton nextBttn = new JButton("=>");
        prevBttn.setEnabled(page > 1);
        nextBttn.setEnabled(page + hitCount < matchingDocCount);
        ActionListener pageHandler = new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == prevBttn) {
                    doQuery(EnsemblLookup.this.keyword, page - 20);
                } else {
                    doQuery(EnsemblLookup.this.keyword, page + 20);
                }
            }
        };
        pagePanel.add(prevBttn);
        prevBttn.addActionListener(pageHandler);
        pagePanel.add(nextBttn);
        nextBttn.addActionListener(pageHandler);
        JPanel hitsAndTextPanel = new JPanel();
        hitsAndTextPanel.setLayout(new GridLayout(2, 1));
        hitsAndTextPanel.add((MyHelperClass)(Object)new JScrollPane(lst));
        hitsAndTextPanel.add(scrollPane);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(hitsAndTextPanel, BorderLayout.CENTER);
        getContentPane().add(pagePanel, BorderLayout.SOUTH);
        setTitle("Results for " + keyword + "  Displaying " + (page + 1) + ((hitCount > 1) ? (" - " + (page + hitCount)) : "") + " of " + matchingDocCount);
        show();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SOUTH;
	public MyHelperClass CENTER;
public MyHelperClass removeAll(){ return null; }
	public MyHelperClass add(JPanel o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLayout(BorderLayout o0){ return null; }
	public MyHelperClass setWrapStyleWord(boolean o0){ return null; }
	public MyHelperClass setLineWrap(boolean o0){ return null; }
	public MyHelperClass select(int o0, int o1){ return null; }
	public MyHelperClass showMessageDialog(c22222255 o0, String o1){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass getElementAt(int o0){ return null; }}

class JTextArea {

JTextArea(int o0, int o1){}
	JTextArea(){}}

class Box {

}

class JList {

JList(Vector o0){}
	JList(){}
	public MyHelperClass addListSelectionListener(){ return null; }
	public MyHelperClass getModel(){ return null; }
	public MyHelperClass addListSelectionListener(<anonymous ListSelectionListener> o0){ return null; }
	public MyHelperClass getSelectedIndex(){ return null; }
	public MyHelperClass addMouseListener(MouseListener o0){ return null; }
	public MyHelperClass setSelectedIndex(int o0){ return null; }}

class ListSelectionListener {

}

class MouseListener {

}

class MouseAdapter {

}

class JScrollPane {

JScrollPane(JList o0){}
	JScrollPane(MyHelperClass o0){}
	JScrollPane(){}}

class JPanel {

public MyHelperClass setLayout(GridLayout o0){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass add(JButton o0){ return null; }}

class JButton {

JButton(String o0){}
	JButton(){}
	public MyHelperClass addActionListener(ActionListener o0){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }}

class ActionListener {

}

class GridLayout {

GridLayout(int o0, int o1){}
	GridLayout(){}}

class BorderLayout {

}

class ListSelectionEvent {

}

class MouseEvent {

public MyHelperClass getClickCount(){ return null; }
	public MyHelperClass getPoint(){ return null; }}

class ActionEvent {

public MyHelperClass getSource(){ return null; }}

class EnsemblLookup {

}
