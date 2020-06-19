import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15758921 {
public MyHelperClass My_ZoneVisu;
	public MyHelperClass texte;
	public MyHelperClass getDocumentBase(){ return null; }

    public boolean Load_Clickable_Peaks_Source_File(String tam)  throws Throwable {
        if (tam == null) return false;
        try {
            URL url = new URL((URL)(Object)getDocumentBase(), tam);
            InputStream stream = url.openStream();
            DataInputStream fichier = new DataInputStream(stream);
            texte =(MyHelperClass)(Object) new Vector();
            String s;
            while ((s = fichier.readLine()) != null) {
                texte.addElement(s);
            }
            My_ZoneVisu.Nb_Clickable_Peaks = texte.size();
        } catch (Exception e) {
            return false;
        }
        My_ZoneVisu.Peak_Start =(MyHelperClass[])(Object) new double[(int)(Object)My_ZoneVisu.Nb_Clickable_Peaks];
        My_ZoneVisu.Peak_Stop =(MyHelperClass[])(Object) new double[(int)(Object)My_ZoneVisu.Nb_Clickable_Peaks];
        My_ZoneVisu.Peak_Html =(MyHelperClass[])(Object) new String[(int)(Object)My_ZoneVisu.Nb_Clickable_Peaks];
        int cpt_tokens = 0;
        int i = 0;
        StringTokenizer mon_token;
        while (cpt_tokens < (int)(Object)My_ZoneVisu.Nb_Clickable_Peaks) {
            do {
                String mysub = (String)(String)(Object) texte.elementAt(cpt_tokens);
                mon_token = new StringTokenizer(mysub, " ");
                cpt_tokens++;
            } while (cpt_tokens < (int)(Object)My_ZoneVisu.Nb_Clickable_Peaks && mon_token.hasMoreTokens() == false);
            if (mon_token.hasMoreTokens() == true) {
                My_ZoneVisu.Peak_Start[i] =(MyHelperClass)(Object) Double.valueOf(mon_token.nextToken()).doubleValue();
                My_ZoneVisu.Peak_Stop[i] =(MyHelperClass)(Object) Double.valueOf(mon_token.nextToken()).doubleValue();
                if ((int)(Object)My_ZoneVisu.Peak_Start[i] > (int)(Object)My_ZoneVisu.Peak_Stop[i]) {
                    double temp =(double)(Object) My_ZoneVisu.Peak_Start[i];
                    My_ZoneVisu.Peak_Start[i] = My_ZoneVisu.Peak_Stop[i];
                    My_ZoneVisu.Peak_Stop[i] =(MyHelperClass)(Object) temp;
                }
                My_ZoneVisu.Peak_Html[i] =(MyHelperClass)(Object) (String) mon_token.nextToken();
            }
            i++;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] Peak_Html;
	public MyHelperClass Nb_Clickable_Peaks;
	public MyHelperClass[] Peak_Stop;
	public MyHelperClass[] Peak_Start;
public MyHelperClass size(){ return null; }
	public MyHelperClass addElement(String o0){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }}
