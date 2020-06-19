


class c5433055 {

    public static Coordinate getCoordenadas(String RCoURL) {
        Coordinate coord = new Coordinate();
        String pURL;
        String iniPC1 = "<pc1>";
        String iniPC2 = "<pc2>";
        String finPC1 = "</pc1>";
        String finPC2 = "</pc2>";
        String iniX = "<xcen>";
        String iniY = "<ycen>";
        String finX = "</xcen>";
        String finY = "</ycen>";
        String iniCuerr = "<cuerr>";
        String finCuerr = "</cuerr>";
        String iniDesErr = "<des>";
        String finDesErr = "</des>";
        boolean error = false;
        int ini, fin;
        if (RCoURL.contains("/") || RCoURL.contains("\\") || RCoURL.contains(".")) pURL = RCoURL; else {
MyHelperClass[] baseURL = new MyHelperClass[5];
            if (RCoURL.length() > 14) pURL =(String)(Object) baseURL[1].replace("<RC>", RCoURL.substring(0, 14)); else pURL =(String)(Object) baseURL[1].replace("<RC>", RCoURL);
        }
        try {
            URL url = new URL(pURL);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            while ((str =(String)(Object) in.readLine()) != null) {
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
                    if (str.contains(iniPC1)) {
                        ini = str.indexOf(iniPC1) + iniPC1.length();
                        fin = str.indexOf(finPC1);
                        coord.setDescription(str.substring(ini, fin));
                    }
                    if (str.contains(iniPC2)) {
                        ini = str.indexOf(iniPC2) + iniPC2.length();
                        fin = str.indexOf(finPC2);
                        coord.setDescription((String)(Object)coord.getDescription().concat(str.substring(ini, fin)));
                    }
                    if (str.contains(iniX)) {
                        ini = str.indexOf(iniX) + iniX.length();
                        fin = str.indexOf(finX);
                        coord.setLongitude(Double.parseDouble(str.substring(ini, fin)));
                    }
                    if (str.contains(iniY)) {
                        ini = str.indexOf(iniY) + iniY.length();
                        fin = str.indexOf(finY);
                        coord.setLatitude(Double.parseDouble(str.substring(ini, fin)));
                    }
                }
            }
            in.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        return coord;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] baseURL;
public MyHelperClass concat(String o0){ return null; }
	public MyHelperClass replace(String o0, String o1){ return null; }}

class Coordinate {

public MyHelperClass setLongitude(double o0){ return null; }
	public MyHelperClass setLatitude(double o0){ return null; }
	public MyHelperClass setDescription(String o0){ return null; }
	public MyHelperClass getDescription(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(InputStreamReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
