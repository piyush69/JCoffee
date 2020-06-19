


class c1005107 {
public MyHelperClass artist;

    public void googleImageSearch() {
        MyHelperClass previousArtist = new MyHelperClass();
        if ((int)(Object)artist.compareToIgnoreCase(previousArtist) != 0) {
            MyHelperClass MusicBoxView = new MyHelperClass();
            MusicBoxView.googleImageLocation = 0;
            try {
                MyHelperClass currentTrack = new MyHelperClass();
                String u = "http://images.google.com/images?q=" + currentTrack.getArtist() + " - " + currentTrack.getAlbum() + "&sa=N&start=0&ndsp=21";
                if (u.contains(" ")) {
                    u = u.replace(" ", "+");
                }
                URL url = new URL(u);
                HttpURLConnection httpcon = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                httpcon.addRequestProperty("User-Agent", "Mozilla/4.76");
                BufferedReader readIn = new BufferedReader(new InputStreamReader(httpcon.getInputStream()));
                String text = "";
                String lin = "";
                while ((lin =(String)(Object) readIn.readLine()) != null) {
                    text += lin;
                }
                readIn.close();
                if (text.contains("\n")) {
                    text = text.replace("\n", "");
                }
                String[] array = text.split("\\Qhref=\"/imgres?imgurl=\\E");
                for (String s : array) {
                    if (s.startsWith("http://") || s.startsWith("https://") && s.contains("&amp;")) {
                        String s1 = s.substring(0, s.indexOf("&amp;"));
                        MyHelperClass googleImages = new MyHelperClass();
                        googleImages.add(s1);
                    }
                }
            } catch (Exception ex4) {
//                MyHelperClass MusicBoxView = new MyHelperClass();
                MusicBoxView.showErrorDialog(ex4);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int googleImageLocation;
public MyHelperClass getAlbum(){ return null; }
	public MyHelperClass showErrorDialog(Exception o0){ return null; }
	public MyHelperClass getArtist(){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass compareToIgnoreCase(MyHelperClass o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass addRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
