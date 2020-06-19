import java.io.*;
import java.lang.*;
import java.util.*;



class c21822159 {

    private void loadMtlFile(URL url) throws IOException {
        InputStream is =(InputStream)(Object) url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        int linecounter = 0;
        String[] params = null;
        try {
            String line;
            Material mtl = null;
            while (((line = br.readLine()) != null)) {
                linecounter++;
                line = line.trim();
                if ((line.length() == 0) || (line.startsWith("#"))) continue;
                params = line.split("\\s+");
                if (params[0].equals("newmtl")) {
                    mtl = new Material();
                    mtl.name =(MyHelperClass)(Object) params[1];
                    MyHelperClass materials = new MyHelperClass();
                    materials.put(mtl.name, mtl);
                } else if (params[0].equals("map_Kd")) {
                    mtl.map_Kd =(MyHelperClass)(Object) params[1];
                } else if (params[0].equals("Ka")) {
                    Arrays.fill((long[])(Object)mtl.Ka,(long)(Object) 0.0f);
                    for (int i = 1; i < params.length; i++) {
                        mtl.Ka[i - 1] =(MyHelperClass)(Object) Float.valueOf(params[i]).floatValue();
                    }
                } else if (params[0].equals("Kd")) {
                    Arrays.fill((long[])(Object)mtl.Kd,(long)(Object) 0.0f);
                    for (int i = 1; i < params.length; i++) {
                        mtl.Kd[i - 1] =(MyHelperClass)(Object) Float.valueOf(params[i]).floatValue();
                    }
                } else if (params[0].equals("Ks")) {
                    Arrays.fill((long[])(Object)mtl.Ks,(long)(Object) 0.0f);
                    for (int i = 1; i < params.length; i++) {
                        mtl.Ks[i - 1] =(MyHelperClass)(Object) Float.valueOf(params[i]).floatValue();
                    }
                } else if (params[0].equals("d")) {
                    mtl.d =(MyHelperClass)(Object) Float.valueOf(params[1]).floatValue();
                } else if (params[0].equals("Ns")) {
                    mtl.Ns =(MyHelperClass)(Object) Float.valueOf(params[1]).floatValue();
                } else if (params[0].equals("illum")) {
                    mtl.illum =(MyHelperClass)(Object) Integer.valueOf(params[1]).intValue();
                }
            }
        } catch (IOException e) {
            System.out.println("Failed to read file: " + br.toString());
        } catch (NumberFormatException e) {
            System.out.println("Malformed MTL (on line " + linecounter + "): " + br.toString() + "\r \r" + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(MyHelperClass o0, Material o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Material {
public MyHelperClass d;
	public MyHelperClass[] Kd;
	public MyHelperClass illum;
	public MyHelperClass map_Kd;
	public MyHelperClass name;
	public MyHelperClass Ns;
	public MyHelperClass[] Ka;
	public MyHelperClass[] Ks;
}
