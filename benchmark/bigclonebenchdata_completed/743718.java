


class c743718 {
public MyHelperClass readline(InputStream o0){ return null; }
public MyHelperClass playlistfile;
	public MyHelperClass playlist;
	public MyHelperClass running_as_applet;
	public MyHelperClass getCodeBase(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }

    void loadPlaylist() {
        MyHelperClass running_as_applet = new MyHelperClass();
        if ((boolean)(Object)running_as_applet) {
            String s = null;
            for (int i = 0; i < 10; i++) {
                s =(String)(Object) getParameter("jorbis.player.play." + i);
                if (s == null) break;
                playlist.addElement(s);
            }
        }
        if (playlistfile == null) {
            return;
        }
        try {
            InputStream is = null;
            try {
                URL url = null;
                if ((boolean)(Object)running_as_applet) url = new URL(getCodeBase(), playlistfile); else url = new URL(playlistfile);
                URLConnection urlc =(URLConnection)(Object) url.openConnection();
                is =(InputStream)(Object) urlc.getInputStream();
            } catch (Exception ee) {
            }
            if (is == null && !(Boolean)(Object)running_as_applet) {
                try {
                    is =(InputStream)(Object) new FileInputStream(System.getProperty("user.dir") + System.getProperty("file.separator") + playlistfile);
                } catch (Exception ee) {
                }
            }
            if (is == null) return;
            while (true) {
                String line =(String)(Object) readline(is);
                if (line == null) break;
                byte[] foo = line.getBytes();
                for (int i = 0; i < foo.length; i++) {
                    if (foo[i] == 0x0d) {
                        line = new String(foo, 0, i);
                        break;
                    }
                }
                playlist.addElement(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addElement(String o0){ return null; }}

class InputStream {

}

class URL {

URL(MyHelperClass o0, MyHelperClass o1){}
	URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
