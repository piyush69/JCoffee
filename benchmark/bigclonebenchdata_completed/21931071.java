import java.io.*;
import java.lang.*;
import java.util.*;



class c21931071 {
public static MyHelperClass replaceBadSymbols(MyHelperClass o0){ return null; }
//public MyHelperClass replaceBadSymbols(MyHelperClass o0){ return null; }

    public static void writeToPetrify(TransitionSystem ts, Writer bw) throws IOException {
        File temp = new File("_temp");
        BufferedWriter tw = new BufferedWriter(new FileWriter(temp));
        BufferedReader tr = new BufferedReader(new FileReader(temp));
        HashSet<ModelGraphVertex> sources = new HashSet<ModelGraphVertex>();
        HashSet<ModelGraphVertex> dests = new HashSet<ModelGraphVertex>();
        ArrayList transitions =(ArrayList)(Object) ts.getEdges();
        HashSet<String> events = new HashSet<String>();
        for (int i = 0; i < transitions.size(); i++) {
            TransitionSystemEdge transition = (TransitionSystemEdge) transitions.get(i);
            events.add((String)(Object)replaceBadSymbols(transition.getIdentifier()));
            sources.add((ModelGraphVertex)(Object)transition.getSource());
            dests.add((ModelGraphVertex)(Object)transition.getDest());
            MyHelperClass TransitionSystem = new MyHelperClass();
            if (ts.getStateNameFlag() == TransitionSystem.ID) {
                tw.write("s" + transition.getSource().getId() + " ");
                tw.write(replaceBadSymbols(transition.getIdentifier()) + " ");
                tw.write("s" + transition.getDest().getId() + "\n");
            } else {
                tw.write(replaceBadSymbols(transition.getSource().getIdentifier()) + " ");
                tw.write(replaceBadSymbols(transition.getIdentifier()) + " ");
                tw.write(replaceBadSymbols(transition.getDest().getIdentifier()) + "\n");
            }
        }
        tw.close();
        bw.write(".model " + ts.getName().replaceAll(" ", "_") + "\n");
        bw.write(".dummy ");
        Iterator it = events.iterator();
        while (it.hasNext()) bw.write(it.next() + " ");
        bw.write("\n");
        bw.write(".state graph" + "\n");
        int c;
        while ((c = tr.read()) != -1) bw.write(c);
        tr.close();
        temp.delete();
        for (ModelGraphVertex dest : dests) {
            if (sources.contains(dest)) {
                sources.remove(dest);
            }
        }
        ModelGraphVertex source = sources.isEmpty() ? null : sources.iterator().next();
        MyHelperClass TransitionSystem = new MyHelperClass();
        if (ts.getStateNameFlag() == TransitionSystem.ID) {
            if (!(Boolean)(Object)ts.hasExplicitEnd()) bw.write(".marking {s0}" + "\n"); else bw.write(".marking {s" + source.getId() + "}\n");
        } else if (source != null) {
            bw.write(".marking {" + replaceBadSymbols(source.getIdentifier()) + "}\n");
        }
        bw.write(".end");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ID;
public MyHelperClass getIdentifier(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }}

class TransitionSystem {

public MyHelperClass hasExplicitEnd(){ return null; }
	public MyHelperClass getEdges(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getStateNameFlag(){ return null; }}

class ModelGraphVertex {

public MyHelperClass getIdentifier(){ return null; }
	public MyHelperClass getId(){ return null; }}

class TransitionSystemEdge {

public MyHelperClass getSource(){ return null; }
	public MyHelperClass getDest(){ return null; }
	public MyHelperClass getIdentifier(){ return null; }}
