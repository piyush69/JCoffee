import java.io.*;
import java.lang.*;
import java.util.*;



class c1812522 {
public MyHelperClass searchGerman;
	public MyHelperClass NULL;
public MyHelperClass germanList;

    public void readPage(String search) {
        InputStream is = null;
        try {
            URL url = new URL("http://www.english-german-dictionary.com/index.php?search=" + search.trim());
            is =(InputStream)(Object) url.openStream();
            InputStreamReader isr = new InputStreamReader(is, "ISO-8859-15");
            Scanner scan = new Scanner(isr);
            String str = new String();
            String translate = new String();
            String temp;
            while (scan.hasNextLine()) {
                temp = (scan.nextLine());
                if (temp.contains("<td style='padding-top:4px;' class='ergebnisse_res'>")) {
                    int anfang = temp.indexOf("-->") + 3;
                    temp = temp.substring(anfang);
                    temp = temp.substring(0, temp.indexOf("<!--"));
                    translate = temp.trim();
                } else if (temp.contains("<td style='' class='ergebnisse_art'>") || temp.contains("<td style='' class='ergebnisse_art_dif'>") || temp.contains("<td style='padding-top:4px;' class='ergebnisse_art'>")) {
                    MyHelperClass searchEnglish = new MyHelperClass();
                    if ((boolean)(Object)searchEnglish == false &&(boolean)(Object) searchGerman == false) {
//                        MyHelperClass searchEnglish = new MyHelperClass();
                        searchEnglish =(MyHelperClass)(Object) temp.contains("<td style='' class='ergebnisse_art'>");
                        boolean searchGerman =(boolean)(Object) NULL; //new boolean();
                        searchGerman = temp.contains("<td style='' class='ergebnisse_art_dif'>");
                    }
                    int anfang1 = temp.lastIndexOf("'>") + 2;
                    temp = temp.substring(anfang1, temp.lastIndexOf("</td>"));
                    String to = temp.trim() + " ";
                    temp = scan.nextLine();
                    int anfang2 = temp.lastIndexOf("\">") + 2;
                    temp = (to != null ? to : "") + temp.substring(anfang2, temp.lastIndexOf("</a>"));
                    str += translate + " - " + temp + "\n";
                    MyHelperClass germanList = new MyHelperClass();
                    germanList.add(translate);
                    MyHelperClass englishList = new MyHelperClass();
                    englishList.add(temp.trim());
                }
            }
            MyHelperClass searchEnglish = new MyHelperClass();
            if ((boolean)(Object)searchEnglish) {
                MyHelperClass englishList = new MyHelperClass();
                List<String> temp2 =(List<String>)(Object) englishList;
//                MyHelperClass englishList = new MyHelperClass();
                englishList = germanList;
                List<String> germanList =(List<String>)(Object) NULL; //new List<String>();
                germanList = temp2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) try {
                is.close();
            } catch (IOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(String o0){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}
