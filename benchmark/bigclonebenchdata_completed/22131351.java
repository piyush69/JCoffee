import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22131351 {
public MyHelperClass UTF8;
public MyHelperClass server;
	public MyHelperClass Pattern;
	public MyHelperClass collection;
	public MyHelperClass logger;
	public MyHelperClass resultNum;

    private IMolecule readMolecule() throws Throwable, Exception {
        String xpath = "";
        MyHelperClass index = new MyHelperClass();
        if (index.equals("ichi")) {
            MyHelperClass query = new MyHelperClass();
            xpath = URLEncoder.encode("//molecule[./identifier/basic='" + query + "']",(String)(Object) UTF8);
//        MyHelperClass index = new MyHelperClass();
        } else if (index.equals("kegg")) {
            MyHelperClass query = new MyHelperClass();
            xpath = URLEncoder.encode("//molecule[./@name='" + query + "' and ./@dictRef='KEGG']",(String)(Object) UTF8);
//        MyHelperClass index = new MyHelperClass();
        } else if (index.equals("nist")) {
            MyHelperClass query = new MyHelperClass();
            xpath = URLEncoder.encode("//molecule[../@id='" + query + "']",(String)(Object) UTF8);
        } else {
//            MyHelperClass index = new MyHelperClass();
            logger.error("Did not recognize index type: " + index);
            return null;
        }
        String colname = URLEncoder.encode("/" + this.collection,(String)(Object) UTF8);
        logger.info("Doing query: " + xpath + " in collection " + colname);
        URL url = new URL("http://" + server + "/Bob/QueryXindice");
        logger.info("Connection to server: " + url.toString());
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        PrintWriter out = new PrintWriter(connection.getOutputStream());
        out.print("detailed=on");
        out.print("&");
        out.print("xmlOnly=on");
        out.print("&");
        out.print("colName=" + colname);
        out.print("&");
        out.print("xpathString=" + xpath);
        out.print("&");
        out.println("query=Query");
        out.close();
        InputStream stream = connection.getInputStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(stream));
        in.mark(1000000);
        in.readLine();
        String comment = in.readLine();
        logger.debug("The comment is: " + comment);
        Pattern p =(Pattern)(Object) Pattern.compile("<!-- There are (\\d{1,6}) results! -->");
        Matcher match =(Matcher)(Object) p.matcher(comment);
        if ((boolean)(Object)match.find()) {
            resultNum = match.group(1);
        } else {
            resultNum =(MyHelperClass)(Object) "0";
        }
        logger.debug("The number of result is " + resultNum);
        in.reset();
        CMLReader reader = new CMLReader(stream);
        ChemFile cf = (ChemFile)(ChemFile)(Object) reader.read((ChemObject)(ChemObject)(Object) new ChemFile());
        logger.debug("#sequences: " + cf.getChemSequenceCount());
        IMolecule m = null;
        if ((int)(Object)cf.getChemSequenceCount() > 0) {
            IChemSequence chemSequence =(IChemSequence)(Object) cf.getChemSequence(0);
            logger.debug("#models in sequence: " + chemSequence.getChemModelCount());
            if ((int)(Object)chemSequence.getChemModelCount() > 0) {
                IChemModel chemModel =(IChemModel)(Object) chemSequence.getChemModel(0);
                IMoleculeSet setOfMolecules =(IMoleculeSet)(Object) chemModel.getMoleculeSet();
                logger.debug("#mols in model: " + setOfMolecules.getMoleculeCount());
                if ((int)(Object)setOfMolecules.getMoleculeCount() > 0) {
                    m =(IMolecule)(Object) setOfMolecules.getMolecule(0);
                } else {
                    logger.warn("No molecules in the model");
                }
            } else {
                logger.warn("No models in the sequence");
            }
        } else {
            logger.warn("No sequences in the file");
        }
        in.close();
        return m;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }}

class IMolecule {

}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass group(int o0){ return null; }}

class CMLReader {

CMLReader(InputStream o0){}
	CMLReader(){}
	public MyHelperClass read(ChemObject o0){ return null; }}

class ChemFile {

public MyHelperClass getChemSequenceCount(){ return null; }
	public MyHelperClass getChemSequence(int o0){ return null; }}

class ChemObject {

}

class IChemSequence {

public MyHelperClass getChemModel(int o0){ return null; }
	public MyHelperClass getChemModelCount(){ return null; }}

class IChemModel {

public MyHelperClass getMoleculeSet(){ return null; }}

class IMoleculeSet {

public MyHelperClass getMolecule(int o0){ return null; }
	public MyHelperClass getMoleculeCount(){ return null; }}
