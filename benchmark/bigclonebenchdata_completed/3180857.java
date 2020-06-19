import java.io.*;
import java.lang.*;
import java.util.*;



class c3180857 {
public MyHelperClass NULL;

    void load(URL url) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
        Vector3f scale = new Vector3f(1, 1, 1);
        Group currentGroup = new Group();
        currentGroup.name =(MyHelperClass)(Object) "default";
        MyHelperClass groups = new MyHelperClass();
        groups.add(currentGroup);
        String line;
        while ((line = r.readLine()) != null) {
            String[] params = line.split(" +");
            if (params.length == 0) continue;
            String command = params[0];
            if (params[0].equals("v")) {
                Vector3f vertex = new Vector3f(Float.parseFloat(params[1]) * (float)(Object)scale.x, Float.parseFloat(params[2]) * (float)(Object)scale.y, Float.parseFloat(params[3]) * (float)(Object)scale.z);
                MyHelperClass verticies = new MyHelperClass();
                verticies.add(vertex);
                int radius =(int)(Object) NULL; //new int();
                radius = Math.max((int)(Object)radius,(int)(Object) vertex.length());
            }
            if (command.equals("center")) {
                Vector3f epicenter =(Vector3f)(Object) NULL; //new Vector3f();
                epicenter = new Vector3f(Float.parseFloat(params[1]), Float.parseFloat(params[2]), Float.parseFloat(params[3]));
            } else if (command.equals("f")) {
                Face f = new Face();
                for (int i = 1; i < params.length; i++) {
                    String parts[] = params[i].split("/");
                    MyHelperClass verticies = new MyHelperClass();
                    Vector3f v =(Vector3f)(Object) verticies.get(Integer.parseInt(parts[0]) - 1);
                    f.add(v);
                }
                currentGroup.faces.add((Group)(Object)f);
            } else if (command.equals("l")) {
                Line l = new Line();
                for (int i = 1; i < params.length; i++) {
                    MyHelperClass verticies = new MyHelperClass();
                    Vector3f v =(Vector3f)(Object) verticies.get(Integer.parseInt(params[i]) - 1);
                    l.add(v);
                }
                currentGroup.lines.add((Group)(Object)l);
            } else if (command.equals("g") && params.length > 1) {
                currentGroup = new Group();
                currentGroup.name =(MyHelperClass)(Object) params[1];
//                MyHelperClass groups = new MyHelperClass();
                groups.add(currentGroup);
            } else if (command.equals("scale")) {
                scale = new Vector3f(Float.parseFloat(params[1]), Float.parseFloat(params[2]), Float.parseFloat(params[3]));
            }
        }
        r.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(Group o0){ return null; }
	public MyHelperClass add(Vector3f o0){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Vector3f {
public MyHelperClass x;
	public MyHelperClass y;
	public MyHelperClass z;
Vector3f(int o0, int o1, int o2){}
	Vector3f(float o0, float o1, float o2){}
	Vector3f(){}
	public MyHelperClass length(){ return null; }}

class Group {
public MyHelperClass lines;
	public MyHelperClass name;
	public MyHelperClass faces;
}

class Face {

public MyHelperClass add(Vector3f o0){ return null; }}

class Line {

public MyHelperClass add(Vector3f o0){ return null; }}
