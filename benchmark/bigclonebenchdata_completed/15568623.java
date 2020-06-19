import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15568623 {
public int pasos;
public int pasos;
//public int pasos;
//public int pasos;
//public int pasos;
//public int pasos;
//public int pasos;
//public int pasos;
//public MyHelperClass pasos;

    public Resultado procesar()  throws Throwable {
        MyHelperClass resultado = new MyHelperClass();
        if (resultado != null) return(Resultado)(Object) resultado;
        MyHelperClass elems = new MyHelperClass();
        int[] a = new int[(int)(Object)elems.size()];
//        MyHelperClass elems = new MyHelperClass();
        Iterator iter =(Iterator)(Object) elems.iterator();
        int w = 0;
        while (iter.hasNext()) {
            a[w] = ((Integer) iter.next()).intValue();
            w++;
        }
        int n = a.length;
        long startTime = System.currentTimeMillis();
        int i, j, temp;
        for (i = 0; i < n - 1; i++) {
            for (j = i; j < n - 1; j++) {
                if (a[i] > a[j + 1]) {
                    temp = a[i];
                    a[i] = a[j + 1];
                    a[j + 1] = temp;
                    MyHelperClass pasos = new MyHelperClass();
                    pasos++;
                }
            }
        }
        long endTime = System.currentTimeMillis();
//        MyHelperClass resultado = new MyHelperClass();
        resultado =(MyHelperClass)(Object) new Resultado((int) (endTime - startTime),(MyHelperClass)(Object) pasos, a.length);
//        MyHelperClass resultado = new MyHelperClass();
        System.out.println("Resultado BB: " + resultado);
//        MyHelperClass resultado = new MyHelperClass();
        return(Resultado)(Object) resultado;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int pasos;
public MyHelperClass size(){ return null; }
	public MyHelperClass iterator(){ return null; }}

class Resultado {

Resultado(){}
	Resultado(int o0, MyHelperClass o1, int o2){}}
