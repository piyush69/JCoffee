
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c37044 {

    public static void main(String[] args) {
        String fe = null, fk = null, f1 = null, f2 = null;
        DecimalFormat df = new DecimalFormat("000");
        int key = 0;
        int i = 1;
        for (; ; ) {
            System.out.println("===================================================");
            System.out.println("\n2009 BME\tTeam ESC's Compare\n");
            System.out.println("===================================================\n");
            System.out.println("	*** Menu ***\n");
            System.out.println("1. Fajlok osszehasonlitasa");
            System.out.println("2. Hasznalati utasitas");
            System.out.println("3. Kilepes");
            System.out.print("\nKivalasztott menu szama: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)System.in));
            try {
                key =(int)(Object) reader.read();
                switch(key) {
                    case '3':
                        System.exit(0);
                        break;
                    case '2':
                        System.out.println("\n @author Bedo Zotlan - F3VFDE");
                        System.out.println("Team ESC's Compare");
                        System.out.println("2009.");
                        System.out.println();
                        System.out.println("(1) A program ket fajl osszahesonlitasat vegzi. A fajloknak a program gyokerkonyvtaraban kell lenniuk!");
                        System.out.println("(2) A menubol ertelem szeruen valasztunk az opciok kozul, majd a program keresere megadjuk a ket osszehasonlitando " + "fajl nevet kiterjesztessel egyutt, kulonben hibat kapunk!");
                        System.out.println("(3) Miutan elvegeztuk az osszehasonlitasokat a program mindegyiket kimenti a compare_xxx.txt fajlba, azonban ha kilepunk a programbol, " + "majd utana ismet elinditjuk es elkezdunk osszehasonlitasokat vegezni, akkor felulirhatja " + "az elozo futtatasbol kapott fajlainkat, erre kulonosen figyelni kell!");
                        System.out.println("(4) A kimeneti compare_xxx.txt fajlon kivul minden egyes osszehasonlitott fajlrol csinal egy <fajl neve>.<fajl kiterjesztese>.numbered " + "nevu fajlt, ami annyiban ter el az eredeti fajloktol, hogy soronkent sorszamozva vannak!");
                        System.out.println("(5) Egy nem ures es egy ures fajl osszehasonlitasa utan azt az eredmenyt kapjuk, hogy \"OK, megyezenek!\". Ez termeszetesen hibas" + " es a kimeneti fajlunk is ures lesz. Ezt szinten keruljuk el, ne hasonlitsunk ures fajlokhoz mas fajlokat!");
                        System.out.println("(6) A fajlok megtekintesehez Notepad++ 5.0.0 verzioja ajanlott legalabb!\n");
                        break;
                    case '1':
                        {
                            System.out.print("\nAz etalon adatokat tartalmazo fajl neve: ");
                            try {
                                int lnNo = 1;
                                BufferedReader br = new BufferedReader(new InputStreamReader((InputStream)(Object)System.in));
                                String inFileName =(String)(Object) br.readLine();
                                BufferedReader bin = new BufferedReader(new FileReader(inFileName));
                                BufferedWriter bout = new BufferedWriter(new FileWriter(inFileName + ".numbered"));
                                fe = (inFileName + ".numbered");
                                f1 = inFileName;
                                String aLine;
                                while ((aLine =(String)(Object) bin.readLine()) != null) bout.write("Line " + df.format(lnNo++) + ": " + aLine + "\n");
                                bin.close();
                                bout.close();
                            } catch (UncheckedIOException e) {
                                System.out.println("Hibas fajlnev");
                            }
                            System.out.print("A kapott adatokat tartalmazo fajl neve: ");
                            try {
                                int lnNo = 1;
                                BufferedReader br = new BufferedReader(new InputStreamReader((InputStream)(Object)System.in));
                                String inFileName =(String)(Object) br.readLine();
                                BufferedReader bin = new BufferedReader(new FileReader(inFileName));
                                BufferedWriter bout = new BufferedWriter(new FileWriter(inFileName + ".numbered"));
                                fk = (inFileName + ".numbered");
                                f2 = inFileName;
                                String aLine_k;
                                while ((aLine_k =(String)(Object) bin.readLine()) != null) bout.write("Line " + df.format(lnNo++) + ": " + aLine_k + "\n");
                                bin.close();
                                bout.close();
                            } catch (UncheckedIOException e) {
                                System.out.println("Hibas fajlnev");
                            }
                            try {
                                int lnNo_c = 1;
                                int mstk = 0;
                                BufferedReader bin_e = new BufferedReader(new FileReader(fe));
                                BufferedReader bin_k = new BufferedReader(new FileReader(fk));
                                BufferedWriter bout = new BufferedWriter(new FileWriter("compare_" + i++ + ".txt"));
                                MyHelperClass Calendar = new MyHelperClass();
                                Calendar actDate =(Calendar)(Object) Calendar.getInstance();
                                bout.write("==================================================\n");
                                bout.write("\n2009 BME\tTeam ESC's Compare");
//                                MyHelperClass Calendar = new MyHelperClass();
                                bout.write("\n" + actDate.get(Calendar.YEAR) + "." + ((int)(Object)actDate.get(Calendar.MONTH) + 1) + "." + actDate.get(Calendar.DATE) + ".\n" + actDate.get(Calendar.HOUR) + ":" + actDate.get(Calendar.MINUTE) + "\n\n");
                                bout.write("==================================================\n");
                                bout.write("Az etalon ertekekkel teli fajl neve: " + f1 + "\n");
                                bout.write("A kapott ertekekkel teli fajl neve: " + f2 + "\n\n");
                                System.out.println("==================================================\n");
                                System.out.println("\n2009 BME\tTeam ESC's Compare");
//                                MyHelperClass Calendar = new MyHelperClass();
                                System.out.println(actDate.get(Calendar.YEAR) + "." + ((int)(Object)actDate.get(Calendar.MONTH) + 1) + "." + actDate.get(Calendar.DATE) + ".\n" + actDate.get(Calendar.HOUR) + ":" + actDate.get(Calendar.MINUTE) + "\n");
                                System.out.println("==================================================\n");
                                System.out.println("\nAz etalon ertekekkel teli fajl neve: " + f1);
                                System.out.println("A kapott ertekekkel teli fajl neve: " + f2 + "\n");
                                String aLine_c1 = null, aLine_c2 = null;
                                File fa = new File(fe);
                                File fb = new File(fk);
                                if (fa.length() != fb.length()) {
                                    bout.write("\nOsszehasonlitas eredmenye: HIBA, nincs egyezes!\n Kulonbozo meretu fajlok: " + fa.length() + " byte illetve " + fb.length() + " byte!\n");
                                    System.out.println("\nOsszehasonlitas eredmenye: HIBA, nincs egyezes!\n Kulonbozo meretu fajlok: " + fa.length() + " byte illetve " + fb.length() + " byte!\n");
                                } else {
                                    while (((aLine_c1 =(String)(Object) bin_e.readLine()) != null) && ((aLine_c2 =(String)(Object) bin_k.readLine()) != null)) if (aLine_c1.equals(aLine_c2)) {
                                    } else {
                                        mstk++;
                                        bout.write("#" + df.format(lnNo_c) + ": HIBA  --> \t" + f1 + " : " + aLine_c1 + " \n\t\t\t\t\t" + f2 + " : " + aLine_c2 + "\n");
                                        System.out.println("#" + df.format(lnNo_c) + ": HIBA  -->\t " + f1 + " : " + aLine_c1 + " \n\t\t\t" + f2 + " : " + aLine_c2 + "\n");
                                        lnNo_c++;
                                    }
                                    if (mstk != 0) {
                                        bout.write("\nOsszehasonlitas eredmenye: HIBA, nincs egyezes!");
                                        bout.write("\nHibas sorok szama: " + mstk);
                                        System.out.println("\nOsszehasonlitas eredmenye: HIBA, nincs egyezes!");
                                        System.out.println("Hibas sorok szama: " + mstk);
                                    } else {
                                        bout.write("\nOsszehasonlitas eredmenye: OK, megegyeznek!");
                                        System.out.println("\nOsszehasonlitas eredm�nye: OK, megegyeznek!\n");
                                    }
                                }
                                bin_e.close();
                                bin_k.close();
                                fa.delete();
                                fb.delete();
                                bout.close();
                            } catch (UncheckedIOException e) {
                                System.out.println("Hibas fajl");
                            }
                            break;
                        }
                }
            } catch (Exception e) {
                System.out.println("A fut�s sor�n hiba t�rt�nt!");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MINUTE;
	public MyHelperClass YEAR;
	public MyHelperClass MONTH;
	public MyHelperClass DATE;
	public MyHelperClass HOUR;
public MyHelperClass getInstance(){ return null; }}

class DecimalFormat {

DecimalFormat(String o0){}
	DecimalFormat(){}
	public MyHelperClass format(int o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	BufferedReader(FileReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Calendar {

public MyHelperClass get(MyHelperClass o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass length(){ return null; }}

class InputStream {

}
