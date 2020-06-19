


class c12082137 {

    public static Set getMunicipios(String pURL) {
        Set result =(Set)(Object) new HashSet();
        String iniCuerr = "<cuerr>";
        String finCuerr = "</cuerr>";
        String iniDesErr = "<des>";
        String finDesErr = "</des>";
        String iniMun = "<muni>";
        String finMun = "</muni>";
        String iniNomMun = "<nm>";
        String finNomMun = "</nm>";
        String iniCarto = "<carto>";
        String iniCodDelMEH = "<cd>";
        String finCodDelMEH = "</cd>";
        String iniCodMunMEH = "<cmc>";
        String finCodMunMEH = "</cmc>";
        String iniCodProvINE = "<cp>";
        String finCodProvINE = "</cp>";
        String iniCodMunINE = "<cm>";
        String finCodMunINE = "</cm>";
        boolean error = false;
        int ini, fin;
        try {
            URL url = new URL(pURL);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            Municipality municipio;
            while ((str =(String)(Object) br.readLine()) != null) {
                if (str.contains(iniCuerr)) {
                    ini = str.indexOf(iniCuerr) + iniCuerr.length();
                    fin = str.indexOf(finCuerr);
                    if (Integer.parseInt(str.substring(ini, fin)) > 0) error = true;
                }
                if (error) {
                    if (str.contains(iniDesErr)) {
                        ini = str.indexOf(iniDesErr) + iniDesErr.length();
                        fin = str.indexOf(finDesErr);
                        throw (new Exception(str.substring(ini, fin)));
                    }
                } else {
                    if (str.contains(iniMun)) {
                        municipio = new Municipality();
                        municipio.setCodemunicipalityine(0);
                        municipio.setCodemunicipalitydgc(0);
                        while ((str =(String)(Object) br.readLine()) != null && !str.contains(finMun)) {
                            if (str.contains(iniNomMun)) {
                                ini = str.indexOf(iniNomMun) + iniNomMun.length();
                                fin = str.indexOf(finNomMun);
                                municipio.setMuniName(str.substring(ini, fin).trim());
                            }
                            if (str.contains(iniCarto)) {
                                if (str.contains("URBANA")) municipio.setIsurban(true);
                                if (str.contains("RUSTICA")) municipio.setIsrustic(true);
                            }
                            if (str.contains(iniCodDelMEH)) {
                                ini = str.indexOf(iniCodDelMEH) + iniCodDelMEH.length();
                                fin = str.indexOf(finCodDelMEH);
                                municipio.setCodemunicipalitydgc((int)(Object)municipio.getCodemunicipalitydgc() + Integer.parseInt(str.substring(ini, fin)) * 1000);
                            }
                            if (str.contains(iniCodMunMEH)) {
                                ini = str.indexOf(iniCodMunMEH) + iniCodMunMEH.length();
                                fin = str.indexOf(finCodMunMEH);
                                municipio.setCodemunicipalitydgc((int)(Object)municipio.getCodemunicipalitydgc() + Integer.parseInt(str.substring(ini, fin)));
                            }
                            if (str.contains(iniCodProvINE)) {
                                ini = str.indexOf(iniCodProvINE) + iniCodProvINE.length();
                                fin = str.indexOf(finCodProvINE);
                                municipio.setCodemunicipalityine((int)(Object)municipio.getCodemunicipalityine() + Integer.parseInt(str.substring(ini, fin)) * 1000);
                            }
                            if (str.contains(iniCodMunINE)) {
                                ini = str.indexOf(iniCodMunINE) + iniCodMunINE.length();
                                fin = str.indexOf(finCodMunINE);
                                municipio.setCodemunicipalityine((int)(Object)municipio.getCodemunicipalityine() + Integer.parseInt(str.substring(ini, fin)));
                            }
                            municipio.setDescription();
                        }
                        result.add(municipio);
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Set {

public MyHelperClass add(Municipality o0){ return null; }}

class Municipality {

public MyHelperClass setIsrustic(boolean o0){ return null; }
	public MyHelperClass getCodemunicipalitydgc(){ return null; }
	public MyHelperClass getCodemunicipalityine(){ return null; }
	public MyHelperClass setIsurban(boolean o0){ return null; }
	public MyHelperClass setDescription(){ return null; }
	public MyHelperClass setMuniName(String o0){ return null; }
	public MyHelperClass setCodemunicipalitydgc(int o0){ return null; }
	public MyHelperClass setCodemunicipalityine(int o0){ return null; }}

class HashSet {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
