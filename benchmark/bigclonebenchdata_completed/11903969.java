


class c11903969 {

    private ShaderProgram loadShaderProgram() {
        ShaderProgram sp = null;
        String vertexProgram = null;
        String fragmentProgram = null;
        Shader[] shaders = new Shader[2];
        try {
            ClassLoader cl = this.getClass().getClassLoader();
            URL url =(URL)(Object) cl.getResource("Shaders/simple.vert");
            System.out.println("url " + url);
            InputStream inputSteam =(InputStream)(Object) cl.getResourceAsStream("Shaders/simple.vert");
            Reader reader = null;
            if (inputSteam != null) {
                reader =(Reader)(Object) new InputStreamReader(inputSteam);
            } else {
                File file = new File("lib");
                URL url2 = new URL("jar:file:" + file.getAbsolutePath() + "/j3d-vrml97-i3mainz.jar!/Shaders/simple.vert");
                InputStream inputSteam2 =(InputStream)(Object) url2.openStream();
                reader =(Reader)(Object) new InputStreamReader(inputSteam2);
            }
            char[] buffer = new char[10000];
            int len =(int)(Object) reader.read(buffer);
            vertexProgram = new String(buffer);
            vertexProgram = vertexProgram.substring(0, len);
        } catch (Exception e) {
            System.err.println("could'nt load simple.vert");
            e.printStackTrace();
        }
        try {
            ClassLoader cl = this.getClass().getClassLoader();
            URL url =(URL)(Object) cl.getResource("Shaders/simple.frag");
            System.out.println("url " + url);
            InputStream inputSteam =(InputStream)(Object) cl.getResourceAsStream("Shaders/simple.frag");
            Reader reader = null;
            if (inputSteam != null) {
                reader =(Reader)(Object) new InputStreamReader(inputSteam);
            } else {
                File file = new File("lib");
                URL url2 = new URL("jar:file:" + file.getAbsolutePath() + "/j3d-vrml97-i3mainz.jar!/Shaders/simple.frag");
                InputStream inputSteam2 =(InputStream)(Object) url2.openStream();
                reader =(Reader)(Object) new InputStreamReader(inputSteam2);
            }
            char[] buffer = new char[10000];
            int len =(int)(Object) reader.read(buffer);
            fragmentProgram = new String(buffer);
            fragmentProgram = fragmentProgram.substring(0, len);
        } catch (Exception e) {
            System.err.println("could'nt load simple.frag");
            e.printStackTrace();
        }
        if (vertexProgram != null && fragmentProgram != null) {
            MyHelperClass Shader = new MyHelperClass();
            shaders[0] =(Shader)(Object) new SourceCodeShader(Shader.SHADING_LANGUAGE_GLSL, Shader.SHADER_TYPE_VERTEX, vertexProgram);
//            MyHelperClass Shader = new MyHelperClass();
            shaders[1] =(Shader)(Object) new SourceCodeShader(Shader.SHADING_LANGUAGE_GLSL, Shader.SHADER_TYPE_FRAGMENT, fragmentProgram);
            sp =(ShaderProgram)(Object) new GLSLShaderProgram();
            sp.setShaders(shaders);
        }
        return sp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SHADER_TYPE_VERTEX;
	public MyHelperClass SHADING_LANGUAGE_GLSL;
	public MyHelperClass SHADER_TYPE_FRAGMENT;
}

class ShaderProgram {

public MyHelperClass setShaders(Shader[] o0){ return null; }}

class Shader {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class Reader {

public MyHelperClass read(char[] o0){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }}

class SourceCodeShader {

SourceCodeShader(MyHelperClass o0, MyHelperClass o1, String o2){}
	SourceCodeShader(){}}

class GLSLShaderProgram {

}
