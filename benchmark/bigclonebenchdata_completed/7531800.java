


class c7531800 {

    public List getArtistToLoadFromWiki() throws Exception {
        URL fileURL = new URL("http://beastchild.free.fr/wiki/doku.php?id=music");
        URLConnection urlConnection =(URLConnection)(Object) fileURL.openConnection();
        InputStream httpStream =(InputStream)(Object) urlConnection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(httpStream, "ISO-8859-1"));
        String ligne;
        List dem =(List)(Object) new ArrayList();
        while ((ligne =(String)(Object) br.readLine()) != null) {
            if (ligne.indexOf("&lt;@@@&gt;") != -1) {
                String maidS = ligne.substring(ligne.indexOf("&lt;@@@&gt;") + 11, ligne.indexOf("&lt;/@@@&gt;")).trim();
                try {
                    long maid = Long.parseLong(maidS);
                    MyHelperClass log = new MyHelperClass();
                    log.info("MAID to load : " + maid);
                    dem.add(new DemandeChargement(maid));
                } catch (Exception e) {
                    MyHelperClass log = new MyHelperClass();
                    log.error("Impossible de recuperer le MAID : " + maidS);
                }
            }
        }
        br.close();
        httpStream.close();
        return dem;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class List {

public MyHelperClass add(DemandeChargement o0){ return null; }}

class DemandeChargement {

DemandeChargement(){}
	DemandeChargement(long o0){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class ArrayList {

}
