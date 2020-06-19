
import java.io.UncheckedIOException;


class c21642215 {
public MyHelperClass KEGG;
	public MyHelperClass CAS2;
	public MyHelperClass ChEBI;
	public MyHelperClass MOLWEIGHT;
	public MyHelperClass PUBCHEM;
	public MyHelperClass SYNONYM;
public MyHelperClass Logger;
	public MyHelperClass Level;
	public MyHelperClass searchMetabolite(String o0){ return null; }

    private int addIDs(PeakListRow row, String name) {
        {
            BufferedReader in = null;
            try {
                String urlName = "http://gmd.mpimp-golm.mpg.de/search.aspx?query=" + name;
                URL url = new URL(urlName);
                in = new BufferedReader(new InputStreamReader(url.openStream()));
                String inputLine, score = "0";
                while ((inputLine =(String)(Object) in.readLine()) != null) {
                    String metaboliteID = "";
                    if (inputLine.contains("href=\"Metabolites/")) {
                        String[] dataScore = inputLine.split("</td><td>");
                        score = dataScore[0].substring(dataScore[0].indexOf("<td>") + 4);
                        metaboliteID = inputLine.substring(inputLine.indexOf("href=\"Metabolites/") + 18, inputLine.indexOf("aspx\">") + 4);
                        urlName = "http://gmd.mpimp-golm.mpg.de/Metabolites/" + metaboliteID;
                        inputLine =(String)(Object) in.readLine();
                        inputLine =(String)(Object) in.readLine();
                        String[] data = inputLine.split("</td><td>");
                        String molecularWeight = data[data.length - 1].replaceAll("&nbsp;", "");
                        row.setVar(MOLWEIGHT.getSetFunctionName(), molecularWeight);
                        break;
                    } else if (inputLine.contains("href=\"Analytes/")) {
                        String[] dataScore = inputLine.split("</td><td>");
                        score = dataScore[0].substring(dataScore[0].indexOf("<td>") + 4);
                        metaboliteID = inputLine.substring(inputLine.indexOf("href=\"Analytes/") + 15, inputLine.indexOf("aspx\">") + 4);
                        urlName = "http://gmd.mpimp-golm.mpg.de/Analytes/" + metaboliteID;
                        inputLine =(String)(Object) in.readLine();
                        inputLine =(String)(Object) in.readLine();
                        String[] data = inputLine.split("</td><td>");
                        String molecularWeight = data[data.length - 1].replaceAll("&nbsp;", "");
                        row.setVar(MOLWEIGHT.getSetFunctionName(), molecularWeight);
                        break;
                    } else if (inputLine.contains("href=\"ReferenceSubstances/")) {
                        String[] dataScore = inputLine.split("</td><td>");
                        score = dataScore[0].substring(dataScore[0].indexOf("<td>") + 4);
                        metaboliteID = inputLine.substring(inputLine.indexOf("href=\"ReferenceSubstances/") + 26, inputLine.indexOf("aspx\">") + 4);
                        urlName = "http://gmd.mpimp-golm.mpg.de/ReferenceSubstances/" + metaboliteID;
                        inputLine =(String)(Object) in.readLine();
                        inputLine =(String)(Object) in.readLine();
                        String[] data = inputLine.split("</td><td>");
                        String molecularWeight = data[data.length - 1].replaceAll("&nbsp;", "");
                        row.setVar(MOLWEIGHT.getSetFunctionName(), molecularWeight);
                        break;
                    }
                }
                in.close();
                urlName =(String)(Object) searchMetabolite(urlName);
                if (urlName != null && urlName.contains(".aspx")) {
                    url = new URL(urlName);
                    in = new BufferedReader(new InputStreamReader(url.openStream()));
                    while ((inputLine =(String)(Object) in.readLine()) != null) {
                        if (inputLine.contains("<meta http-equiv=\"keywords\" content=")) {
                            String line = inputLine.substring(inputLine.indexOf("<meta http-equiv=\"keywords\" content=") + 37, inputLine.indexOf("\" /></head>"));
                            String[] names = line.split(", ");
                            for (String id : names) {
                                if (id.contains("PubChem")) {
                                    id = id.substring(id.indexOf("PubChem") + 8);
                                    String pubChem = (String)(String)(Object) row.getVar(PUBCHEM.getGetFunctionName());
                                    if (pubChem.length() == 0) {
                                        pubChem += id;
                                    } else {
                                        pubChem += ", " + id;
                                    }
                                    row.setVar(PUBCHEM.getSetFunctionName(), pubChem);
                                } else if (id.contains("ChEBI")) {
                                    id = id.substring(id.indexOf("ChEBI:") + 6);
                                    row.setVar(ChEBI.getSetFunctionName(), id);
                                } else if (id.contains("KEGG")) {
                                    id = id.substring(id.indexOf("KEGG:") + 6);
                                    row.setVar(KEGG.getSetFunctionName(), id);
                                } else if (id.contains("CAS")) {
                                    id = id.substring(id.indexOf("CAS:") + 5);
                                    row.setVar(CAS2.getSetFunctionName(), id);
                                } else if (id.contains("ChemSpider") || id.contains("MAPMAN") || id.contains("Beilstein:")) {
                                } else {
                                    String synonym = (String)(String)(Object) row.getVar(SYNONYM.getGetFunctionName());
                                    if (synonym.length() == 0) {
                                        synonym += id;
                                    } else {
                                        synonym += " // " + id;
                                    }
                                    synonym = synonym.replaceAll("&amp;#39;", "'");
                                    row.setVar(SYNONYM.getSetFunctionName(), synonym);
                                }
                            }
                            break;
                        }
                    }
                    in.close();
                }
                return Integer.parseInt(score);
            } catch (UncheckedIOException ex) {
                Logger.getLogger(GetGolmIDsTask.class.getName()).log(Level.SEVERE, null,(IOException)(Object) ex);
                return 0;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getGetFunctionName(){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass getSetFunctionName(){ return null; }}

class PeakListRow {

public MyHelperClass setVar(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getVar(MyHelperClass o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class GetGolmIDsTask {

}
