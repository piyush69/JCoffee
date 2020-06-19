import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15503077 {

private ArrayList execAtParentServer(ArrayList paramList) throws Throwable, Exception {
        ArrayList outputList = null;
        String message = "";
        try {
            MyHelperClass InitXml = new MyHelperClass();
            HashMap serverUrlMap = InitXml.getInstance().getServerMap();
            Iterator it = serverUrlMap.keySet().iterator();
            while (it.hasNext()) {
                String server = (String) it.next();
                String serverUrl = (String) serverUrlMap.get(server);
                MyHelperClass Primer3Manager = new MyHelperClass();
                serverUrl = serverUrl + Primer3Manager.servletName;
                URL url = new URL(serverUrl);
                URLConnection uc = url.openConnection();
                uc.setDoOutput(true);
                OutputStream os = uc.getOutputStream();
                StringBuffer buf = new StringBuffer();
                buf.append("actionType=designparent");
                for (int i = 0; i < paramList.size(); i++) {
                    Primer3Param param = (Primer3Param) paramList.get(i);
                    if (i == 0) {
                        buf.append("&sequence=" + param.getSequence());
                        MyHelperClass upstreamSize = new MyHelperClass();
                        buf.append("&upstream_size" + upstreamSize);
                        MyHelperClass downstreamSize = new MyHelperClass();
                        buf.append("&downstreamSize" + downstreamSize);
                        MyHelperClass marginLength = new MyHelperClass();
                        buf.append("&MARGIN_LENGTH=" + marginLength);
                        MyHelperClass overlapLength = new MyHelperClass();
                        buf.append("&OVERLAP_LENGTH=" + overlapLength);
                        buf.append("&MUST_XLATE_PRODUCT_MIN_SIZE=" + param.getPrimerProductMinSize());
                        buf.append("&MUST_XLATE_PRODUCT_MAX_SIZE=" + param.getPrimerProductMaxSize());
                        buf.append("&PRIMER_PRODUCT_OPT_SIZE=" + param.getPrimerProductOptSize());
                        buf.append("&PRIMER_MAX_END_STABILITY=" + param.getPrimerMaxEndStability());
                        buf.append("&PRIMER_MAX_MISPRIMING=" + param.getPrimerMaxMispriming());
                        buf.append("&PRIMER_PAIR_MAX_MISPRIMING=" + param.getPrimerPairMaxMispriming());
                        buf.append("&PRIMER_MIN_SIZE=" + param.getPrimerMinSize());
                        buf.append("&PRIMER_OPT_SIZE=" + param.getPrimerOptSize());
                        buf.append("&PRIMER_MAX_SIZE=" + param.getPrimerMaxSize());
                        buf.append("&PRIMER_MIN_TM=" + param.getPrimerMinTm());
                        buf.append("&PRIMER_OPT_TM=" + param.getPrimerOptTm());
                        buf.append("&PRIMER_MAX_TM=" + param.getPrimerMaxTm());
                        buf.append("&PRIMER_MAX_DIFF_TM=" + param.getPrimerMaxDiffTm());
                        buf.append("&PRIMER_MIN_GC=" + param.getPrimerMinGc());
                        buf.append("&PRIMER_OPT_GC_PERCENT=" + param.getPrimerOptGcPercent());
                        buf.append("&PRIMER_MAX_GC=" + param.getPrimerMaxGc());
                        buf.append("&PRIMER_SELF_ANY=" + param.getPrimerSelfAny());
                        buf.append("&PRIMER_SELF_END=" + param.getPrimerSelfEnd());
                        buf.append("&PRIMER_NUM_NS_ACCEPTED=" + param.getPrimerNumNsAccepted());
                        buf.append("&PRIMER_MAX_POLY_X=" + param.getPrimerMaxPolyX());
                        buf.append("&PRIMER_GC_CLAMP=" + param.getPrimerGcClamp());
                    }
                    buf.append("&target=" + param.getPrimerSequenceId() + "," + (param.getTarget())[0] + "," + (param.getTarget())[1]);
                }
                PrintStream ps = new PrintStream(os);
                ps.print(buf.toString());
                ps.close();
                ObjectInputStream ois = new ObjectInputStream(uc.getInputStream());
                outputList = (ArrayList) ois.readObject();
                ois.close();
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        if ((outputList == null || outputList.size() == 0) && message != null && message.length() > 0) {
            throw new Exception(message);
        }
        return outputList;
    }
}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass servletName;
public MyHelperClass getInstance(){ return null; }}

class Primer3Param {

public MyHelperClass getPrimerMinSize(){ return null; }
	public MyHelperClass getPrimerMinTm(){ return null; }
	public MyHelperClass getPrimerGcClamp(){ return null; }
	public MyHelperClass getPrimerProductMaxSize(){ return null; }
	public MyHelperClass getPrimerMaxMispriming(){ return null; }
	public MyHelperClass getPrimerMinGc(){ return null; }
	public MyHelperClass getPrimerMaxTm(){ return null; }
	public MyHelperClass getPrimerSequenceId(){ return null; }
	public MyHelperClass getPrimerMaxSize(){ return null; }
	public MyHelperClass getPrimerOptGcPercent(){ return null; }
	public MyHelperClass getPrimerMaxEndStability(){ return null; }
	public MyHelperClass getPrimerProductMinSize(){ return null; }
	public MyHelperClass getPrimerSelfAny(){ return null; }
	public MyHelperClass getPrimerMaxDiffTm(){ return null; }
	public MyHelperClass getPrimerOptTm(){ return null; }
	public MyHelperClass getPrimerMaxGc(){ return null; }
	public MyHelperClass getTarget(){ return null; }
	public MyHelperClass getPrimerMaxPolyX(){ return null; }
	public MyHelperClass getSequence(){ return null; }
	public MyHelperClass getPrimerPairMaxMispriming(){ return null; }
	public MyHelperClass getPrimerOptSize(){ return null; }
	public MyHelperClass getPrimerProductOptSize(){ return null; }
	public MyHelperClass getPrimerSelfEnd(){ return null; }
	public MyHelperClass getPrimerNumNsAccepted(){ return null; }}
