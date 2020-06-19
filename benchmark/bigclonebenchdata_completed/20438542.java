import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20438542 {
public static MyHelperClass loadShaderFromSource(String o0, String o1, int o2, boolean o3, boolean o4){ return null; }
//public MyHelperClass loadShaderFromSource(String o0, String o1, int o2, boolean o3, boolean o4){ return null; }

    public static Shader loadShader(String vspath, String fspath, int textureUnits, boolean separateCam, boolean fog) throws Throwable, ShaderProgramProcessException {
        if (vspath == "" || fspath == "") return null;
        BufferedReader in;
        String vert = "", frag = "";
        try {
            URL v_url = Graphics.class.getClass().getResource("/eu/cherrytree/paj/graphics/shaders/" + vspath);
            MyHelperClass AppDefinition = new MyHelperClass();
            String v_path = AppDefinition.getDefaultDataPackagePath() + "/shaders/" + vspath;
            if (v_url != null) in = new BufferedReader(new InputStreamReader(v_url.openStream())); else in = new BufferedReader(new InputStreamReader((InputStream)(Object)new FileReader(v_path).getInputStream()));
            boolean run = true;
            String str;
            while (run) {
                str = in.readLine();
                if (str != null) vert += str + "\n"; else run = false;
            }
            in.close();
        } catch (Exception e) {
            System.err.println("Couldn't read in vertex shader \"" + vspath + "\".");
            throw new ShaderNotLoadedException(vspath, fspath);
        }
        try {
            URL f_url = Graphics.class.getClass().getResource("/eu/cherrytree/paj/graphics/shaders/" + fspath);
            MyHelperClass AppDefinition = new MyHelperClass();
            String f_path = AppDefinition.getDefaultDataPackagePath() + "/shaders/" + fspath;
            if (f_url != null) in = new BufferedReader(new InputStreamReader(f_url.openStream())); else in = new BufferedReader(new InputStreamReader((InputStream)(Object)new FileReader(f_path).getInputStream()));
            boolean run = true;
            String str;
            while (run) {
                str = in.readLine();
                if (str != null) frag += str + "\n"; else run = false;
            }
            in.close();
        } catch (Exception e) {
            System.err.println("Couldn't read in fragment shader \"" + fspath + "\".");
            throw new ShaderNotLoadedException(vspath, fspath);
        }
        return(Shader)(Object) loadShaderFromSource(vert, frag, textureUnits, separateCam, fog);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDefaultDataPackagePath(){ return null; }}

class Shader {

}

class ShaderProgramProcessException extends Exception{
	public ShaderProgramProcessException(String errorMessage) { super(errorMessage); }
}

class Graphics {

}

class FileReader {

FileReader(String o0){}
	FileReader(){}
	public MyHelperClass getInputStream(){ return null; }}

class ShaderNotLoadedException extends Exception{
	public ShaderNotLoadedException(String errorMessage) { super(errorMessage); }
	ShaderNotLoadedException(){}
	ShaderNotLoadedException(String o0, String o1){}
}
