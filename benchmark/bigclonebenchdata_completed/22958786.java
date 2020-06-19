import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22958786 {
public MyHelperClass treeModel;
	public MyHelperClass parent;
	public MyHelperClass topTreeNode;
	public MyHelperClass customSecondaryNode;
	public MyHelperClass groundStationCustomDB;
	public MyHelperClass groundStationDB;
	public MyHelperClass gsHash;
	public MyHelperClass groundStationTree;
	public MyHelperClass statusTextField;
	public MyHelperClass JOptionPane;
	public MyHelperClass TreeSelectionModel;
	public MyHelperClass initComponents(){ return null; }

    public  void JGroundStationBrowser(Frame parent)  throws Throwable {
        this.parent =(MyHelperClass)(Object) parent;
        initComponents();
        topTreeNode =(MyHelperClass)(Object) new DefaultMutableTreeNode("Ground Stations");
        treeModel =(MyHelperClass)(Object) new DefaultTreeModel(topTreeNode);
        groundStationTree.setModel(treeModel);
        String currentSecondaryNodeName = null;
        DefaultMutableTreeNode currentSecondaryNode = null;
        try {
            BufferedReader gsReader = null;
            if (new File((String)(Object)groundStationDB).exists()) {
                File gsFile = new File((String)(Object)groundStationDB);
                FileReader gsFileReader = new FileReader(gsFile);
                gsReader = new BufferedReader(gsFileReader);
            } else {
                URL url = new URL("http://www.gano.name/shawn/JSatTrak/" + groundStationDB);
                URLConnection c = url.openConnection();
                InputStreamReader isr = new InputStreamReader(c.getInputStream());
                gsReader = new BufferedReader(isr);
            }
            String nextLine = null;
            int gsCount = 0;
            while ((nextLine = gsReader.readLine()) != null) {
                String[] elements = nextLine.split(",");
                if (elements.length == 5) {
                    String network = elements[0];
                    String stationName = elements[1];
                    double stationLat = Double.parseDouble(elements[2]);
                    double stationLon = Double.parseDouble(elements[3]);
                    double stationAlt = Double.parseDouble(elements[4]);
                    gsHash.put(stationName, new double[] { stationLat, stationLon, stationAlt });
                    if (!network.equalsIgnoreCase(currentSecondaryNodeName)) {
                        currentSecondaryNode = new DefaultMutableTreeNode(network);
                        topTreeNode.add(currentSecondaryNode);
                        currentSecondaryNodeName = network;
                    }
                    currentSecondaryNode.add(new DefaultMutableTreeNode(stationName));
                    gsCount++;
                }
            }
            gsReader.close();
            if (new File((String)(Object)groundStationCustomDB).exists()) {
                File gsFile = new File((String)(Object)groundStationCustomDB);
                FileReader gsFileReader = new FileReader(gsFile);
                gsReader = new BufferedReader(gsFileReader);
                customSecondaryNode =(MyHelperClass)(Object) new DefaultMutableTreeNode("Custom");
                topTreeNode.add(customSecondaryNode);
                while ((nextLine = gsReader.readLine()) != null) {
                    String[] elements = nextLine.split(",");
                    if (elements.length == 5) {
                        String network = elements[0];
                        String stationName = elements[1];
                        double stationLat = Double.parseDouble(elements[2]);
                        double stationLon = Double.parseDouble(elements[3]);
                        double stationAlt = Double.parseDouble(elements[4]);
                        gsHash.put(stationName, new double[] { stationLat, stationLon, stationAlt });
                        customSecondaryNode.add(new DefaultMutableTreeNode(stationName));
                        gsCount++;
                    }
                }
                gsReader.close();
            } else {
                customSecondaryNode =(MyHelperClass)(Object) new DefaultMutableTreeNode("Custom");
                topTreeNode.add(customSecondaryNode);
            }
            statusTextField.setText("Total Ground Stations loaded: " + gsCount);
            groundStationTree.expandRow(0);
        } catch (Exception e) {
            System.out.println("ERROR IN GROUND STATION READING POSSIBLE FILE FORMAT OR MISSING FILES:");
            e.printStackTrace();
            JOptionPane.showMessageDialog(parent, "Error Loading Ground Station Data. Check data.\n" + e.toString(), "Data LOADING ERROR", JOptionPane.ERROR_MESSAGE);
        }
        groundStationTree.setTransferHandler(new TreeGroundStationTransferHandler(gsHash));
        groundStationTree.getSelectionModel().setSelectionMode(TreeSelectionModel.DISCONTIGUOUS_TREE_SELECTION);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass DISCONTIGUOUS_TREE_SELECTION;
public MyHelperClass setSelectionMode(MyHelperClass o0){ return null; }
	public MyHelperClass setModel(MyHelperClass o0){ return null; }
	public MyHelperClass put(String o0, double[] o1){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass add(DefaultMutableTreeNode o0){ return null; }
	public MyHelperClass setTransferHandler(TreeGroundStationTransferHandler o0){ return null; }
	public MyHelperClass getSelectionModel(){ return null; }
	public MyHelperClass expandRow(int o0){ return null; }
	public MyHelperClass showMessageDialog(Frame o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class Frame {

}

class DefaultMutableTreeNode {

DefaultMutableTreeNode(String o0){}
	DefaultMutableTreeNode(){}
	public MyHelperClass add(DefaultMutableTreeNode o0){ return null; }}

class DefaultTreeModel {

DefaultTreeModel(MyHelperClass o0){}
	DefaultTreeModel(){}}

class TreeGroundStationTransferHandler {

TreeGroundStationTransferHandler(MyHelperClass o0){}
	TreeGroundStationTransferHandler(){}}
