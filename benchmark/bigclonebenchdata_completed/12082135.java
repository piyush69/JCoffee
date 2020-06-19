


class c12082135 {

    public static Set getProvincias(String pURL) {
        Set result =(Set)(Object) new HashSet();
        String iniProv = "<prov>";
        String finProv = "</prov>";
        String iniNomProv = "<np>";
        String finNomProv = "</np>";
        String iniCodigo = "<cpine>";
        String finCodigo = "</cpine>";
        int ini, fin;
        try {
            URL url = new URL(pURL);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            Province provincia;
            while ((str =(String)(Object) br.readLine()) != null) {
                if (str.contains(iniProv)) {
                    provincia = new Province();
                    while ((str =(String)(Object) br.readLine()) != null && !str.contains(finProv)) {
                        if (str.contains(iniNomProv)) {
                            ini = str.indexOf(iniNomProv) + iniNomProv.length();
                            fin = str.indexOf(finNomProv);
                            provincia.setDescription(str.substring(ini, fin));
                        }
                        if (str.contains(iniCodigo)) {
                            ini = str.indexOf(iniCodigo) + iniCodigo.length();
                            fin = str.indexOf(finCodigo);
                            provincia.setCodeProvince(Integer.parseInt(str.substring(ini, fin)));
                        }
                    }
                    result.add(provincia);
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

public MyHelperClass add(Province o0){ return null; }}

class Province {

public MyHelperClass setCodeProvince(int o0){ return null; }
	public MyHelperClass setDescription(String o0){ return null; }}

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
