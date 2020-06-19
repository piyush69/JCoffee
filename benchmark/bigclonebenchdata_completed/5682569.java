import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5682569 {
public MyHelperClass[] tabla;
//public MyHelperClass tabla;
	public MyHelperClass tamanoTabla;

    public void metodo1() {
        int temp;
        boolean flagDesordenado = true;
        while (flagDesordenado) {
            flagDesordenado = false;
            for (int i = 0; i <(int)(Object) this.tamanoTabla - 1; i++) {
                if ((int)(Object)tabla[i] > (int)(Object)tabla[i + 1]) {
                    flagDesordenado = true;
                    temp =(int)(Object) tabla[i];
                    tabla[i] = tabla[i + 1];
                    tabla[i + 1] =(MyHelperClass)(Object) temp;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
