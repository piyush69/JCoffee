import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17409656 {
public MyHelperClass setContentPane(ChartPanel o0){ return null; }
public MyHelperClass ChartFactory;
	public MyHelperClass DatasetReader;
	public MyHelperClass Color;

    public  c17409656(final String title)  throws Throwable {
        super(title);
        PieDataset dataset = null;
        final URL url = getClass().getResource("/org/jfree/chart/demo/piedata.xml");
        try {
            final InputStream in = url.openStream();
            dataset =(PieDataset)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) DatasetReader.readPieDatasetFromXML(in);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        final JFreeChart chart =(JFreeChart)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) ChartFactory.createPieChart("Pie Chart Demo 1", dataset, true, true, false);
        chart.setBackgroundPaint(Color.yellow);
        final PiePlot plot = (PiePlot)(PiePlot)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) chart.getPlot();
        plot.setNoDataMessage("No data available");
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Dimension)(Object)new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass yellow;
public MyHelperClass createPieChart(String o0, PieDataset o1, boolean o2, boolean o3, boolean o4){ return null; }
	public MyHelperClass readPieDatasetFromXML(InputStream o0){ return null; }}

class PieDataset {

}

class JFreeChart {

public MyHelperClass setBackgroundPaint(MyHelperClass o0){ return null; }
	public MyHelperClass getPlot(){ return null; }}

class PiePlot {

public MyHelperClass setNoDataMessage(String o0){ return null; }}

class ChartPanel {

ChartPanel(JFreeChart o0){}
	ChartPanel(){}
	public MyHelperClass setPreferredSize(Dimension o0){ return null; }}

class Object {

Object(String o0){}
	Object(){}}

class Dimension {

}
