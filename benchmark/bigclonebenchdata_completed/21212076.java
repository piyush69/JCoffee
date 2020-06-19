import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21212076 {
public MyHelperClass setParameter(GribPDSParameter o0){ return null; }
public MyHelperClass NPARAMETERS;
	public MyHelperClass filename;
	public MyHelperClass SmartStringArray;
	public MyHelperClass url;
	public MyHelperClass parameters;
	public MyHelperClass fileTabMap;

    private void readParameterTable()  throws Throwable {
        if (this.parameters != null) return;
        parameters =(MyHelperClass)(Object) new GribPDSParameter[(int)(Object)NPARAMETERS];
        int center;
        int subcenter;
        int number;
        try {
            BufferedReader br;
            if (filename != null &&(int)(Object) filename.length() > 0) {
                GribPDSParamTable tab = (GribPDSParamTable)(GribPDSParamTable)(Object) fileTabMap.get(filename);
                if (tab != null) {
                    this.parameters = tab.parameters;
                    return;
                }
            }
            if (url != null) {
                InputStream is =(InputStream)(Object) url.openStream();
                InputStreamReader isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
            } else {
                br = new BufferedReader(new FileReader("tables\\" + filename));
            }
            String line = br.readLine();
            String[] tableDefArr =(String[])(Object) SmartStringArray.split(":", line);
            center = Integer.parseInt(tableDefArr[1].trim());
            subcenter = Integer.parseInt(tableDefArr[2].trim());
            number = Integer.parseInt(tableDefArr[3].trim());
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.length() == 0 || line.startsWith("//")) continue;
                GribPDSParameter parameter = new GribPDSParameter();
                tableDefArr =(String[])(Object) SmartStringArray.split(":", line);
                parameter.number =(MyHelperClass)(Object) Integer.parseInt(tableDefArr[0].trim());
                parameter.name =(MyHelperClass)(Object) tableDefArr[1].trim();
                if (tableDefArr[2].indexOf('[') == -1) {
                    parameter.description = parameter.unit =(MyHelperClass)(Object) tableDefArr[2].trim();
                } else {
                    String[] arr2 =(String[])(Object) SmartStringArray.split("[", tableDefArr[2]);
                    parameter.description =(MyHelperClass)(Object) arr2[0].trim();
                    parameter.unit = arr2[1].substring(0, arr2[1].lastIndexOf(']')).trim();
                }
                if (!(Boolean)(Object)this.setParameter(parameter)) {
                    System.err.println("Warning, bad parameter ignored (" + filename + "): " + parameter.toString());
                }
            }
            if (filename != null &&(int)(Object) filename.length() > 0) {
                GribPDSParamTable loadedTable = new GribPDSParamTable(filename, center, subcenter, number, this.parameters);
                fileTabMap.put(filename, loadedTable);
            }
        } catch (IOException ioError) {
            System.err.println("An error occurred in GribPDSParamTable while " + "trying to open the parameter table " + filename + " : " + ioError);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass put(MyHelperClass o0, GribPDSParamTable o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass split(String o0, String o1){ return null; }}

class GribPDSParameter {
public MyHelperClass number;
	public MyHelperClass unit;
	public MyHelperClass name;
	public MyHelperClass description;
}

class GribPDSParamTable {
public MyHelperClass parameters;
GribPDSParamTable(){}
	GribPDSParamTable(MyHelperClass o0, int o1, int o2, int o3, MyHelperClass o4){}}
