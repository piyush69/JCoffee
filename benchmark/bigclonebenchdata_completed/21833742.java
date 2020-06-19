import java.io.*;
import java.lang.*;
import java.util.*;



class c21833742 {

    public void bspMain(BSP bsp, Serializable arg) throws AbortedException {
        if (!(arg instanceof String[])) {
            bsp.abort(new RuntimeException("String[] as arguments expected"));
        }
        String[] args = (String[]) arg;
        long t1 = 0L, t2;
        try {
            MyHelperClass InetAddress = new MyHelperClass();
            if (bsp != null) bsp.printStdOut((String)(Object)bsp.getHostname()); else System.out.println(InetAddress.getLocalHost().getCanonicalHostName());
        } catch (Exception e) {
            if (bsp != null) bsp.printStdOut("exception: " + e); else System.out.println("exception: " + e);
        }
        Formula formula = null;
        if (bsp == null ||(int)(Object) bsp.getProcessId() == 0) {
            try {
                InputStream src;
                String input;
                if (args.length > 0) input = args[0]; else input = "sat/uuf175-03.cnf";
                if (bsp != null) bsp.printStdOut("using formula definition: " + input); else System.out.println("using formula definition: " + input);
                if (bsp != null) {
                    bsp.printStdOut("trying to read formula from class file server of the job owner's peer");
                    src =(InputStream)(Object) bsp.getResourceAsStream(input);
                } else {
                    System.out.println("trying to read formula from http://www.upb.de/fachbereich/AG/agmadh/WWW/bono/" + input);
                    URL url = new URL("http", "www.upb.de", -1, "/fachbereich/AG/agmadh/WWW/bono/" + input, null);
                    src =(InputStream)(Object) url.openStream();
                }
                formula = new Formula(src, bsp);
            } catch (Exception e) {
                if (bsp != null) {
                    bsp.printStdOut("cannot load formula: " + e);
                    bsp.abort(e);
                } else {
                    System.out.println("cannot load formula: " + e);
                    System.exit(1);
                }
            }
            formula.print(bsp);
        }
        if (bsp != null) {
            bsp.sync();
            if ((int)(Object)bsp.getProcessId() == 0) t1 =(long)(Object) bsp.getTime();
            MyHelperClass Formula = new MyHelperClass();
            Formula.parallelSolve(formula, bsp);
            bsp.sync();
            if ((int)(Object)bsp.getProcessId() == 0) {
                t2 =(long)(Object) bsp.getTime();
                bsp.printStdOut("consumed time: " + ((t2 - t1) / 1000) + "s");
            }
        } else formula.solve(bsp);
        if (bsp == null ||(int)(Object) bsp.getProcessId() == 0) {
            if ((boolean)(Object)formula.isSatisfiable()) {
                if (bsp != null) bsp.printStdOut("satisfiable"); else System.out.println("satisfiable");
            } else {
                if (bsp != null) bsp.printStdOut("not satisfiable"); else System.out.println("not satisfiable");
            }
            formula.printVariables(bsp);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parallelSolve(Formula o0, BSP o1){ return null; }
	public MyHelperClass getCanonicalHostName(){ return null; }
	public MyHelperClass getLocalHost(){ return null; }}

class BSP {

public MyHelperClass abort(RuntimeException o0){ return null; }
	public MyHelperClass getResourceAsStream(String o0){ return null; }
	public MyHelperClass getHostname(){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass abort(Exception o0){ return null; }
	public MyHelperClass getProcessId(){ return null; }
	public MyHelperClass sync(){ return null; }
	public MyHelperClass printStdOut(String o0){ return null; }}

class AbortedException extends Exception{
	public AbortedException(String errorMessage) { super(errorMessage); }
}

class Formula {

Formula(InputStream o0, BSP o1){}
	Formula(){}
	public MyHelperClass print(BSP o0){ return null; }
	public MyHelperClass solve(BSP o0){ return null; }
	public MyHelperClass printVariables(BSP o0){ return null; }
	public MyHelperClass isSatisfiable(){ return null; }}

class URL {

URL(String o0, String o1, int o2, String o3, Object o4){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
