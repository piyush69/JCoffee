import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20081424 {
public MyHelperClass NULL;
public MyHelperClass maxReturns;
	public MyHelperClass searchURL;
	public MyHelperClass VueResources;
public MyHelperClass googleResultsPanel;
	public MyHelperClass FlowLayout;
	public MyHelperClass Color;
	public MyHelperClass googlePane;
	public MyHelperClass jsp;
	public MyHelperClass BorderLayout;
	public MyHelperClass prevButton;
	public MyHelperClass nextButton;
	public MyHelperClass searchButton;
	public MyHelperClass loadGSP(String o0){ return null; }

    public void performSearch(int searchStartIndex)  throws Throwable {
        int index = 0;
        MyHelperClass keywords = new MyHelperClass();
        String searchString =(String)(Object) keywords.getText();
        MyHelperClass searchButton = new MyHelperClass();
        searchButton.setEnabled(false);
        if (!searchString.equals("")) {
            try {
                URL url =(URL)(Object) NULL; //new URL();
                url = new URL(searchURL + "&num=" + maxReturns.getSelectedItem().toString() + "&start=" + searchStartIndex + "&q=" + searchString);
//                MyHelperClass url = new MyHelperClass();
                System.out.println("Google search = " + url);
//                MyHelperClass url = new MyHelperClass();
                InputStream input = url.openStream();
                int c;
                while ((c = input.read()) != -1) {
                    int result =(int)(Object) NULL; //new int();
                    result =(char)(Object) result + (char) c;
                }
                MyHelperClass VueUtil = new MyHelperClass();
                String googleResultsFile =(char)(Object) VueUtil.getDefaultUserFolder().getAbsolutePath() +(String)(Object) File.separatorChar + (int)(Object)VueResources.getString("save.google.results");
                FileWriter fileWriter = new FileWriter(googleResultsFile);
                MyHelperClass result = new MyHelperClass();
                fileWriter.write((int)(Object)result);
                fileWriter.close();
//                MyHelperClass result = new MyHelperClass();
                result =(MyHelperClass)(Object) "";
                GSP gsp =(GSP)(Object) loadGSP(googleResultsFile);
                Iterator i =(Iterator)(Object) gsp.getRES().getResultList().iterator();
                Vector resultVector = new Vector();
                while (i.hasNext()) {
                    Result r = (Result) i.next();
                    URLResource urlResource = new URLResource(r.getUrl());
                    if (r.getTitle() != null) urlResource.setTitle((String)(Object)r.getTitle().replaceAll("</*[a-zA-Z]>", "")); else urlResource.setTitle(r.getUrl().toString());
                    resultVector.add(urlResource);
                    System.out.println(r.getTitle() + " " + r.getUrl());
                }
                VueDragTree tree = new VueDragTree(resultVector.iterator(), "GoogleSearchResults");
                tree.setEditable(true);
                tree.setRootVisible(false);
                googleResultsPanel.remove(jsp);
                jsp =(MyHelperClass)(Object) new JScrollPane(tree);
                JPanel bottomPanel = new JPanel((BorderLayout)(Object)new FlowLayout(FlowLayout.RIGHT, 2, 0));
                bottomPanel.add(prevButton);
                bottomPanel.add(nextButton);
                googleResultsPanel.add(bottomPanel, BorderLayout.SOUTH);
                googleResultsPanel.add(jsp, BorderLayout.CENTER);
                googleResultsPanel.validate();
                googlePane.setSelectedComponent(googleResultsPanel);
            } catch (Exception ex) {
                System.out.println("cannot connect google");
                googleResultsPanel.remove(jsp);
                JPanel jp = new JPanel(new BorderLayout());
                jp.setBackground(Color.WHITE);
                JLabel jl = new JLabel("No Match Found");
                jp.add(jl, BorderLayout.NORTH);
                JPanel bottomPanel = new JPanel((BorderLayout)(Object)new FlowLayout(FlowLayout.RIGHT, 2, 0));
                googleResultsPanel.add(jp, BorderLayout.CENTER);
                googleResultsPanel.validate();
                googlePane.setSelectedComponent(googleResultsPanel);
            }
        }
        searchButton.setEnabled(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CENTER;
	public MyHelperClass NORTH;
	public MyHelperClass SOUTH;
	public MyHelperClass RIGHT;
	public MyHelperClass WHITE;
public MyHelperClass openStream(){ return null; }
	public MyHelperClass add(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass add(JPanel o0, MyHelperClass o1){ return null; }
	public MyHelperClass validate(){ return null; }
	public MyHelperClass getSelectedItem(){ return null; }
	public MyHelperClass setSelectedComponent(MyHelperClass o0){ return null; }
	public MyHelperClass getDefaultUserFolder(){ return null; }
	public MyHelperClass remove(MyHelperClass o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getResultList(){ return null; }}

class GSP {

public MyHelperClass getRES(){ return null; }}

class Result {

public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getTitle(){ return null; }}

class URLResource {

URLResource(MyHelperClass o0){}
	URLResource(){}
	public MyHelperClass setTitle(String o0){ return null; }}

class VueDragTree {

VueDragTree(Iterator o0, String o1){}
	VueDragTree(){}
	public MyHelperClass setRootVisible(boolean o0){ return null; }
	public MyHelperClass setEditable(boolean o0){ return null; }}

class JScrollPane {

JScrollPane(VueDragTree o0){}
	JScrollPane(){}}

class JPanel {

JPanel(BorderLayout o0){}
	JPanel(){}
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass add(JLabel o0, MyHelperClass o1){ return null; }
	public MyHelperClass setBackground(MyHelperClass o0){ return null; }}

class FlowLayout {

FlowLayout(MyHelperClass o0, int o1, int o2){}
	FlowLayout(){}}

class BorderLayout {

}

class JLabel {

JLabel(String o0){}
	JLabel(){}}
