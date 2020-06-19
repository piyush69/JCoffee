import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c153271 {
public MyHelperClass[] data;
	public MyHelperClass[] fit;
public MyHelperClass average;
//	public MyHelperClass fit;
	public MyHelperClass haveFit;
	public MyHelperClass decYear;
//	public MyHelperClass data;
	public MyHelperClass sitename;
	public MyHelperClass plottype;
	public MyHelperClass haveDate;
	public MyHelperClass length(){ return null; }

    public  void DataSet(String name, String type, URL docBase, String plotDir)  throws Throwable {
        sitename =(MyHelperClass)(Object) name.toUpperCase();
        data =(MyHelperClass[])(Object)(MyHelperClass)(Object) new Vector[3];
        data[0] =(MyHelperClass)(Object) new Vector();
        data[1] =(MyHelperClass)(Object) new Vector();
        data[2] =(MyHelperClass)(Object) new Vector();
        if (type == null) return;
        plottype =(MyHelperClass)(Object) type.toLowerCase();
        String filename;
        filename = plotDir + sitename + "_" + plottype + ".plt.gz";
        try {
            double total = 0;
            URL dataurl = new URL(docBase, filename);
            BufferedReader readme = new BufferedReader(new InputStreamReader((InputStream)(Object)new GZIPInputStream(dataurl.openStream())));
            while (true) {
                String myline = readme.readLine();
                if (myline == null) break;
                myline = myline.toLowerCase();
                if (myline.startsWith("fit:")) {
                    if ((boolean)(Object)haveFit) {
                        continue;
                    }
                    StringTokenizer st = new StringTokenizer(myline.replace('\n', ' '));
                    fit =(MyHelperClass[])(Object)(MyHelperClass)(Object) new Double[5];
                    String bye = (String) st.nextToken();
                    fit[0] =(MyHelperClass)(Object) new Double((String) st.nextToken());
                    fit[1] =(MyHelperClass)(Object) new Double((String) st.nextToken());
                    fit[2] =(MyHelperClass)(Object) new Double((String) st.nextToken());
                    fit[3] =(MyHelperClass)(Object) new Double((String) st.nextToken());
                    fit[4] =(MyHelperClass)(Object) new Double((String) st.nextToken());
                    haveFit =(MyHelperClass)(Object) true;
                    continue;
                }
                if (myline.startsWith("decyear:")) {
                    StringTokenizer st = new StringTokenizer(myline.replace('\n', ' '));
                    String bye = (String) st.nextToken();
                    decYear =(MyHelperClass)(Object) new Double((String) st.nextToken());
                    haveDate =(MyHelperClass)(Object) true;
                    continue;
                }
                StringTokenizer st = new StringTokenizer(myline.replace('\n', ' '));
                boolean ok = true;
                String tmp;
                Double[] mydbl = new Double[3];
                for (int i = 0; i < 3 && ok; i++) {
                    if (st.hasMoreTokens()) {
                        tmp = (String) st.nextToken();
                        if (tmp.startsWith("X") || tmp.startsWith("x")) {
                            ok = false;
                            break;
                        } else {
                            mydbl[i] = new Double(tmp);
                        }
                    } else {
                        mydbl[i] = new Double(0.0);
                    }
                }
                if (ok) {
                    if (mydbl[2].doubleValue() > 100) continue;
                    total = mydbl[1].doubleValue() + total;
                    for (int i = 0; i < 3; i++) {
                        data[i].addElement(mydbl[i]);
                    }
                }
            }
            average =(MyHelperClass)(Object)(double)(Object)(double)(Object)(double)(Object)(double)(Object)(double)(Object)(double)(Object) total / (double)(Object)length();
        } catch (FileNotFoundException e) {
            System.err.println("PlotApplet: file not found: " + e);
        } catch (IOException e) {
            System.err.println("PlotApplet: error reading input file: " + e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addElement(Double o0){ return null; }}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}
