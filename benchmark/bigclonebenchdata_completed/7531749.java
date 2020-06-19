


class c7531749 {

    public void getLyricsFromMAWebSite(TrackMABean tb) throws Exception {
        URL fileURL = new URL("http://www.metal-archives.com/viewlyrics.php?id=" + tb.getMaid());
        URLConnection urlConnection =(URLConnection)(Object) fileURL.openConnection();
        InputStream httpStream =(InputStream)(Object) urlConnection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(httpStream, "ISO-8859-1"));
        String ligne;
        boolean chargerLyrics = false;
        StringBuffer sb = new StringBuffer("");
        String lyrics = null;
        while ((ligne =(String)(Object) br.readLine()) != null) {
            MyHelperClass log = new MyHelperClass();
            log.debug("==> " + ligne);
            if (chargerLyrics && ligne.indexOf("<center>") != -1) {
                break;
            }
            if (chargerLyrics) {
                sb.append(ligne.trim());
            }
            if (!chargerLyrics && ligne.indexOf("<center>") != -1) {
                chargerLyrics = true;
            }
        }
        lyrics = sb.toString();
        lyrics = lyrics.replaceAll("<br>", "\n").trim();
        MyHelperClass log = new MyHelperClass();
        log.debug("Parole : " + lyrics);
        tb.setLyrics(lyrics);
        br.close();
        httpStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class TrackMABean {

public MyHelperClass setLyrics(String o0){ return null; }
	public MyHelperClass getMaid(){ return null; }}

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
