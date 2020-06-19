import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1966311 {
public MyHelperClass newPlot(){ return null; }
public MyHelperClass PlotBox;
	public MyHelperClass setBackground(Color o0){ return null; }
	public MyHelperClass getDocumentBase(){ return null; }
	public MyHelperClass showStatus(String o0){ return null; }
	public MyHelperClass _read(InputStream o0){ return null; }
	public MyHelperClass getContentPane(){ return null; }
	public MyHelperClass _setPlotSize(int o0, int o1){ return null; }
	public MyHelperClass setForeground(Color o0){ return null; }
	public MyHelperClass plot(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }

            public void run() {
                MyHelperClass _plot = new MyHelperClass();
                if (_plot == null) {
//                    MyHelperClass _plot = new MyHelperClass();
                    _plot = newPlot();
                }
                getContentPane().add(plot(), BorderLayout.NORTH);
                int width;
                int height;
                String widthspec =(String)(Object) getParameter("width");
                if (widthspec != null) {
                    width = Integer.parseInt(widthspec);
                } else {
                    width = 400;
                }
                String heightspec =(String)(Object) getParameter("height");
                if (heightspec != null) {
                    height = Integer.parseInt(heightspec);
                } else {
                    height = 400;
                }
                _setPlotSize(width, height);
                plot().setButtons(true);
                Color background = Color.white;
                String colorspec =(String)(Object) getParameter("background");
                if (colorspec != null) {
                    background =(Color)(Object) PlotBox.getColorByName(colorspec);
                }
                setBackground(background);
                plot().setBackground(background);
                getContentPane().setBackground(background);
                Color foreground = Color.black;
                colorspec =(String)(Object) getParameter("foreground");
                if (colorspec != null) {
                    foreground =(Color)(Object) PlotBox.getColorByName(colorspec);
                }
                setForeground(foreground);
                plot().setForeground(foreground);
                plot().setVisible(true);
                String dataurlspec =(String)(Object) getParameter("dataurl");
                if (dataurlspec != null) {
                    try {
                        showStatus("Reading data");
                        URL dataurl = new URL((URL)(Object)getDocumentBase(), dataurlspec);
                        InputStream in = dataurl.openStream();
                        _read(in);
                        showStatus("Done");
                    } catch (MalformedURLException e) {
                        System.err.println(e.toString());
                    } catch (FileNotFoundException e) {
                        System.err.println("PlotApplet: file not found: " + e);
                    } catch (IOException e) {
                        System.err.println("PlotApplet: error reading input file: " + e);
                    }
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setBackground(Color o0){ return null; }
	public MyHelperClass setButtons(boolean o0){ return null; }
	public MyHelperClass getColorByName(String o0){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setForeground(Color o0){ return null; }
	public MyHelperClass add(MyHelperClass o0, String o1){ return null; }}
