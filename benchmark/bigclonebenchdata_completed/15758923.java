import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15758923 {
public MyHelperClass nmr_observe_frequency;
	public MyHelperClass Move_Points_To_Tableau(){ return null; }
public MyHelperClass shitty_starting_constant;
	public MyHelperClass Firstx;
	public MyHelperClass Datatype;
	public MyHelperClass Current_Error;
	public MyHelperClass y_units;
	public MyHelperClass YFactor;
	public MyHelperClass Lastx;
	public MyHelperClass TexteTitre;
	public MyHelperClass x_units;
	public MyHelperClass texte;
	public MyHelperClass StringDataUtils;
	public MyHelperClass NumericDataUtils;
	public MyHelperClass nbLignes;
	public MyHelperClass My_ZoneVisu;
	public MyHelperClass Nbpoints;
	public MyHelperClass showStatus(String o0){ return null; }
	public MyHelperClass getDocumentBase(){ return null; }

    public boolean initFile(String filename)  throws Throwable {
        showStatus("Loading the file, please wait...");
        x_units =(MyHelperClass)(Object) "?";
        y_units =(MyHelperClass)(Object) "ARBITRARY";
        Datatype =(MyHelperClass)(Object) "UNKNOWN";
        if (filename.toLowerCase().endsWith(".spc")) {
            try {
                URL url = new URL((URL)(Object)getDocumentBase(), filename);
                InputStream stream = url.openStream();
                DataInputStream fichier = new DataInputStream(stream);
                byte ftflgs = fichier.readByte();
                byte fversn = fichier.readByte();
                if (((ftflgs != 0) && (ftflgs != 0x20)) || (fversn != 0x4B)) {
                    Current_Error =(MyHelperClass)(Object) ", support only Evenly Spaced new version 4B";
                    return false;
                }
                byte fexp = fichier.readByte();
                if (fexp != 0x80) YFactor =(MyHelperClass)(Object)(double)(Object)(double)(Object)(double)(Object)(double)(Object)(double)(Object)(double)(Object)(double)(Object)(double)(Object) Math.pow(2, fexp) / Math.pow(2, 32);
                Nbpoints = NumericDataUtils.convToIntelInt(fichier.readInt());
                if (Firstx == shitty_starting_constant) {
                    Firstx = NumericDataUtils.convToIntelDouble(fichier.readLong());
                    Lastx = NumericDataUtils.convToIntelDouble(fichier.readLong());
                }
                byte fxtype = fichier.readByte();
                switch(fxtype) {
                    case 0:
                        x_units =(MyHelperClass)(Object) "Arbitrary";
                        break;
                    case 1:
                        x_units =(MyHelperClass)(Object) "Wavenumber (cm -1)";
                        break;
                    case 2:
                        x_units =(MyHelperClass)(Object) "Micrometers";
                        break;
                    case 3:
                        x_units =(MyHelperClass)(Object) "Nanometers";
                        break;
                    case 4:
                        x_units =(MyHelperClass)(Object) "Seconds";
                        break;
                    case 5:
                        x_units =(MyHelperClass)(Object) "Minuts";
                        break;
                    case 6:
                        x_units =(MyHelperClass)(Object) "Hertz";
                        break;
                    case 7:
                        x_units =(MyHelperClass)(Object) "Kilohertz";
                        break;
                    case 8:
                        x_units =(MyHelperClass)(Object) "Megahertz";
                        break;
                    case 9:
                        x_units =(MyHelperClass)(Object) "Mass (M/z)";
                        break;
                    case 10:
                        x_units =(MyHelperClass)(Object) "Parts per million";
                        break;
                    case 11:
                        x_units =(MyHelperClass)(Object) "Days";
                        break;
                    case 12:
                        x_units =(MyHelperClass)(Object) "Years";
                        break;
                    case 13:
                        x_units =(MyHelperClass)(Object) "Raman Shift (cm -1)";
                        break;
                    case 14:
                        x_units =(MyHelperClass)(Object) "Electron Volt (eV)";
                        break;
                    case 16:
                        x_units =(MyHelperClass)(Object) "Diode Number";
                        break;
                    case 17:
                        x_units =(MyHelperClass)(Object) "Channel";
                        break;
                    case 18:
                        x_units =(MyHelperClass)(Object) "Degrees";
                        break;
                    case 19:
                        x_units =(MyHelperClass)(Object) "Temperature (F)";
                        break;
                    case 20:
                        x_units =(MyHelperClass)(Object) "Temperature (C)";
                        break;
                    case 21:
                        x_units =(MyHelperClass)(Object) "Temperature (K)";
                        break;
                    case 22:
                        x_units =(MyHelperClass)(Object) "Data Points";
                        break;
                    case 23:
                        x_units =(MyHelperClass)(Object) "Milliseconds (mSec)";
                        break;
                    case 24:
                        x_units =(MyHelperClass)(Object) "Microseconds (uSec)";
                        break;
                    case 25:
                        x_units =(MyHelperClass)(Object) "Nanoseconds (nSec)";
                        break;
                    case 26:
                        x_units =(MyHelperClass)(Object) "Gigahertz (GHz)";
                        break;
                    case 27:
                        x_units =(MyHelperClass)(Object) "Centimeters (cm)";
                        break;
                    case 28:
                        x_units =(MyHelperClass)(Object) "Meters (m)";
                        break;
                    case 29:
                        x_units =(MyHelperClass)(Object) "Millimeters (mm)";
                        break;
                    case 30:
                        x_units =(MyHelperClass)(Object) "Hours";
                        break;
                    case -1:
                        x_units =(MyHelperClass)(Object) "(double interferogram)";
                        break;
                }
                byte fytype = fichier.readByte();
                switch(fytype) {
                    case 0:
                        y_units =(MyHelperClass)(Object) "Arbitrary Intensity";
                        break;
                    case 1:
                        y_units =(MyHelperClass)(Object) "Interfeogram";
                        break;
                    case 2:
                        y_units =(MyHelperClass)(Object) "Absorbance";
                        break;
                    case 3:
                        y_units =(MyHelperClass)(Object) "Kubelka-Munk";
                        break;
                    case 4:
                        y_units =(MyHelperClass)(Object) "Counts";
                        break;
                    case 5:
                        y_units =(MyHelperClass)(Object) "Volts";
                        break;
                    case 6:
                        y_units =(MyHelperClass)(Object) "Degrees";
                        break;
                    case 7:
                        y_units =(MyHelperClass)(Object) "Milliamps";
                        break;
                    case 8:
                        y_units =(MyHelperClass)(Object) "Millimeters";
                        break;
                    case 9:
                        y_units =(MyHelperClass)(Object) "Millivolts";
                        break;
                    case 10:
                        y_units =(MyHelperClass)(Object) "Log (1/R)";
                        break;
                    case 11:
                        y_units =(MyHelperClass)(Object) "Percent";
                        break;
                    case 12:
                        y_units =(MyHelperClass)(Object) "Intensity";
                        break;
                    case 13:
                        y_units =(MyHelperClass)(Object) "Relative Intensity";
                        break;
                    case 14:
                        y_units =(MyHelperClass)(Object) "Energy";
                        break;
                    case 16:
                        y_units =(MyHelperClass)(Object) "Decibel";
                        break;
                    case 19:
                        y_units =(MyHelperClass)(Object) "Temperature (F)";
                        break;
                    case 20:
                        y_units =(MyHelperClass)(Object) "Temperature (C)";
                        break;
                    case 21:
                        y_units =(MyHelperClass)(Object) "Temperature (K)";
                        break;
                    case 22:
                        y_units =(MyHelperClass)(Object) "Index of Refraction [N]";
                        break;
                    case 23:
                        y_units =(MyHelperClass)(Object) "Extinction Coeff. [K]";
                        break;
                    case 24:
                        y_units =(MyHelperClass)(Object) "Real";
                        break;
                    case 25:
                        y_units =(MyHelperClass)(Object) "Imaginary";
                        break;
                    case 26:
                        y_units =(MyHelperClass)(Object) "Complex";
                        break;
                    case -128:
                        y_units =(MyHelperClass)(Object) "Transmission";
                        break;
                    case -127:
                        y_units =(MyHelperClass)(Object) "Reflectance";
                        break;
                    case -126:
                        y_units =(MyHelperClass)(Object) "Arbitrary or Single Beam with Valley Peaks";
                        break;
                    case -125:
                        y_units =(MyHelperClass)(Object) "Emission";
                        break;
                }
                if (ftflgs == 0) {
                    fichier.skipBytes(512 - 30);
                } else {
                    fichier.skipBytes(188);
                    byte b;
                    int i = 0;
                    x_units =(MyHelperClass)(Object) "";
                    do {
                        b = fichier.readByte();
                       (char)(Object) x_units += (char) b;
                        i++;
                    } while (b != 0);
                    int j = 0;
                    y_units =(MyHelperClass)(Object) "";
                    do {
                        b = fichier.readByte();
                       (char)(Object) y_units += (char) b;
                        j++;
                    } while (b != 0);
                    fichier.skipBytes(512 - 30 - 188 - i - j);
                }
                fichier.skipBytes(32);
                My_ZoneVisu.tableau_points =(MyHelperClass[])(Object)(MyHelperClass)(Object) new double[(int)(Object)Nbpoints];
                if (fexp == 0x80) {
                    for (int i = 0; i < (int)(Object)Nbpoints; i++) {
                        My_ZoneVisu.tableau_points[i] = NumericDataUtils.convToIntelFloat(fichier.readInt());
                    }
                } else {
                    for (int i = 0; i < (int)(Object)Nbpoints; i++) {
                        My_ZoneVisu.tableau_points[i] = NumericDataUtils.convToIntelInt(fichier.readInt());
                    }
                }
            } catch (Exception e) {
                Current_Error =(MyHelperClass)(Object) "SPC file corrupted";
                return false;
            }
            Datatype =(MyHelperClass)(Object) "XYDATA";
            return true;
        }
        try {
            URL url = new URL((URL)(Object)getDocumentBase(), filename);
            InputStream stream = url.openStream();
            BufferedReader fichier = new BufferedReader(new InputStreamReader(stream));
            texte =(MyHelperClass)(Object) new Vector();
            String s;
            while ((s = fichier.readLine()) != null) {
                texte.addElement(s);
            }
            nbLignes = texte.size();
        } catch (Exception e) {
            return false;
        }
        int My_Counter = 0;
        String uneligne = "";
        while (My_Counter < (int)(Object)nbLignes) {
            try {
                StringTokenizer mon_token;
                do {
                    uneligne = (String)(String)(Object) texte.elementAt(My_Counter);
                    My_Counter++;
                    mon_token = new StringTokenizer(uneligne, " ");
                } while (My_Counter < (int)(Object)nbLignes && mon_token.hasMoreTokens() == false);
                if (mon_token.hasMoreTokens() == true) {
                    String keyword = mon_token.nextToken();
                    if ((int)(Object)StringDataUtils.compareStrings(keyword, "##TITLE=") == 0) TexteTitre =(MyHelperClass)(Object) uneligne.substring(9);
                    if ((int)(Object)StringDataUtils.compareStrings(keyword, "##FIRSTX=") == 0) Firstx =(MyHelperClass)(Object) Double.valueOf(mon_token.nextToken()).doubleValue();
                    if ((int)(Object)StringDataUtils.compareStrings(keyword, "##LASTX=") == 0) Lastx =(MyHelperClass)(Object) Double.valueOf(mon_token.nextToken()).doubleValue();
                    if ((int)(Object)StringDataUtils.compareStrings(keyword, "##YFACTOR=") == 0) YFactor =(MyHelperClass)(Object) Double.valueOf(mon_token.nextToken()).doubleValue();
                    if ((int)(Object)StringDataUtils.compareStrings(keyword, "##NPOINTS=") == 0) Nbpoints =(MyHelperClass)(Object) Integer.valueOf(mon_token.nextToken()).intValue();
                    if ((int)(Object)StringDataUtils.compareStrings(keyword, "##XUNITS=") == 0) x_units =(MyHelperClass)(Object) uneligne.substring(10);
                    if ((int)(Object)StringDataUtils.compareStrings(keyword, "##YUNITS=") == 0) y_units =(MyHelperClass)(Object) uneligne.substring(10);
                    if ((int)(Object)StringDataUtils.compareStrings(keyword, "##.OBSERVE") == 0 &&(int)(Object) StringDataUtils.compareStrings(mon_token.nextToken(), "FREQUENCY=") == 0) nmr_observe_frequency =(MyHelperClass)(Object) Double.valueOf(mon_token.nextToken()).doubleValue();
                    if ((int)(Object)StringDataUtils.compareStrings(keyword, "##XYDATA=") == 0 &&(int)(Object) StringDataUtils.compareStrings(mon_token.nextToken(), "(X++(Y..Y))") == 0) Datatype =(MyHelperClass)(Object) "XYDATA";
                    if ((int)(Object)StringDataUtils.compareStrings(keyword, "##XYDATA=(X++(Y..Y))") == 0) Datatype =(MyHelperClass)(Object) "XYDATA";
                    if ((int)(Object)StringDataUtils.compareStrings(keyword, "##PEAK") == 0 &&(int)(Object) StringDataUtils.compareStrings(mon_token.nextToken(), "TABLE=") == 0 &&(int)(Object) StringDataUtils.compareStrings(mon_token.nextToken(), "(XY..XY)") == 0) Datatype =(MyHelperClass)(Object) "PEAK TABLE";
                    if ((int)(Object)StringDataUtils.compareStrings(keyword, "##PEAK") == 0 &&(int)(Object) StringDataUtils.compareStrings(mon_token.nextToken(), "TABLE=(XY..XY)") == 0) Datatype =(MyHelperClass)(Object) "PEAK TABLE";
                }
            } catch (Exception e) {
            }
        }
        if ((int)(Object)Datatype.compareTo("UNKNOWN") == 0) return false;
        if ((int)(Object)Datatype.compareTo("PEAK TABLE") == 0 &&(int)(Object) x_units.compareTo("?") == 0) x_units =(MyHelperClass)(Object) "M/Z";
        if ((int)(Object)StringDataUtils.truncateEndBlanks(x_units).compareTo("HZ") == 0 && nmr_observe_frequency != shitty_starting_constant) {
           (int)(Object) Firstx /= (int)(Object)nmr_observe_frequency;
           (int)(Object) Lastx /= (int)(Object)nmr_observe_frequency;
            x_units =(MyHelperClass)(Object) "PPM.";
        }
        String resultat_move_points =(String)(Object) Move_Points_To_Tableau();
        if (resultat_move_points.compareTo("OK") != 0) {
            Current_Error =(MyHelperClass)(Object) resultat_move_points;
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] tableau_points;
public MyHelperClass size(){ return null; }
	public MyHelperClass addElement(String o0){ return null; }
	public MyHelperClass convToIntelDouble(long o0){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }
	public MyHelperClass compareTo(String o0){ return null; }
	public MyHelperClass convToIntelFloat(int o0){ return null; }
	public MyHelperClass compareStrings(String o0, String o1){ return null; }
	public MyHelperClass convToIntelInt(int o0){ return null; }
	public MyHelperClass truncateEndBlanks(MyHelperClass o0){ return null; }}
