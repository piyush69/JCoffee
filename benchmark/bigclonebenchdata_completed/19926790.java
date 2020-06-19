import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19926790 {
public MyHelperClass NODE_LINE;
	public MyHelperClass log;
	public MyHelperClass LogService;
	public MyHelperClass FormatUtil;
	public MyHelperClass annotatedNWBGraph;

    public void generateReport(AllTestsResult atr, AllConvsResult acr, File nwbConvGraph) {
        ConvResult[] convs =(ConvResult[])(Object) acr.getConvResults();
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(nwbConvGraph));
            writer = new BufferedWriter(new FileWriter((String)(Object)this.annotatedNWBGraph));
            String line = null;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("id*int")) {
                    writer.write(line + " isTrusted*int chanceCorrect*float isConverter*int \r\n");
                } else if (line.matches((String)(Object)NODE_LINE)) {
                    String[] parts = line.split(" ");
                    String rawConvName = parts[1];
                    String convName = rawConvName.replaceAll("\"", "");
                    boolean wroteAttributes = false;
                    for (int ii = 0; ii < convs.length; ii++) {
                        ConvResult cr = convs[ii];
                        if (cr.getShortName().equals(convName)) {
                            int trusted;
                            if ((boolean)(Object)cr.isTrusted()) {
                                trusted = 1;
                            } else {
                                trusted = 0;
                            }
                            writer.write(line + " " + trusted + " " + FormatUtil.formatToPercent(cr.getChanceCorrect()) + " 1 " + "\r\n");
                            wroteAttributes = true;
                            break;
                        }
                    }
                    if (!wroteAttributes) {
                        writer.write(line + " 1 100.0 0" + "\r\n");
                    }
                } else {
                    writer.write(line + "\r\n");
                }
            }
        } catch (IOException e) {
            this.log.log(LogService.LOG_ERROR, "Unable to generate Graph Report.", e);
            try {
                if (reader != null) reader.close();
            } catch (IOException e2) {
                this.log.log(LogService.LOG_ERROR, "Unable to close graph report stream", e);
            }
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                this.log.log(LogService.LOG_ERROR, "Unable to close either graph report reader or " + "writer.", e);
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOG_ERROR;
public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass formatToPercent(MyHelperClass o0){ return null; }}

class AllTestsResult {

}

class AllConvsResult {

public MyHelperClass getConvResults(){ return null; }}

class ConvResult {

public MyHelperClass getChanceCorrect(){ return null; }
	public MyHelperClass getShortName(){ return null; }
	public MyHelperClass isTrusted(){ return null; }}
