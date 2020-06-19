


class c1849897 {

    public String parseInOneLine() throws Exception {
        BufferedReader br = null;
        InputStream httpStream = null;
        MyHelperClass url = new MyHelperClass();
        if ((boolean)(Object)url.startsWith("http")) {
//            MyHelperClass url = new MyHelperClass();
            URL fileURL = new URL(url);
            URLConnection urlConnection =(URLConnection)(Object) fileURL.openConnection();
            httpStream =(InputStream)(Object) urlConnection.getInputStream();
            br = new BufferedReader(new InputStreamReader(httpStream, "ISO-8859-1"));
        } else {
//            MyHelperClass url = new MyHelperClass();
            br = new BufferedReader(new FileReader(url));
        }
        StringBuffer sb = new StringBuffer();
        StringBuffer sbAllDoc = new StringBuffer();
        String ligne = null;
        boolean get = false;
        while ((ligne =(String)(Object) br.readLine()) != null) {
            MyHelperClass log = new MyHelperClass();
            log.debug(ligne);
            sbAllDoc.append(ligne + " ");
            if (ligne.indexOf("<table") != -1) {
                get = true;
            }
            if (get) {
                sb.append(ligne + " ");
            }
            if (ligne.indexOf("</table") != -1 || ligne.indexOf("</tr></font><center><a href='affichaire.php") != -1 || ligne.indexOf("</font><center><a href='afficheregion.php") != -1) {
                get = false;
                break;
            }
        }
        String oneLine;// = new String();
        oneLine = sb.toString();
        String allDocInOneLine;// = new String();
        allDocInOneLine = sbAllDoc.toString();
//        MyHelperClass oneLine = new MyHelperClass();
        if (oneLine.indexOf("</table") != -1) {
            TableTag tableTab;// = new TableTag();
            tableTab = new TableTag(oneLine.substring(oneLine.indexOf(">") + 1, oneLine.indexOf("</table")));
//        MyHelperClass oneLine = new MyHelperClass();
        } else if (oneLine.indexOf("</font><center><a href='affichaire") != -1) {
            TableTag tableTab;// = new TableTag();
            tableTab = new TableTag(oneLine.substring(oneLine.indexOf(">") + 1, oneLine.indexOf("</font><center><a href='affichaire")));
//        MyHelperClass oneLine = new MyHelperClass();
        } else if (oneLine.indexOf("</font><center><a href='afficheregion.php") != -1) {
            TableTag tableTab;// = new TableTag();
            tableTab = new TableTag(oneLine.substring(oneLine.indexOf(">") + 1, oneLine.indexOf("</font><center><a href='afficheregion.php")));
        } else {
            MyHelperClass log = new MyHelperClass();
            log.error("La fin du fichier HTML n'a pas ete trouvee, ca va merder...");
        }
        br.close();
        if (httpStream != null) {
            httpStream.close();
        }
//        MyHelperClass allDocInOneLine = new MyHelperClass();
        return (String)(Object)allDocInOneLine;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	BufferedReader(FileReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class FileReader {

FileReader(){}
	FileReader(MyHelperClass o0){}}

class TableTag {

TableTag(String o0){}
	TableTag(){}}
