


class c17187738 {
public MyHelperClass Log;
	public MyHelperClass SoundStore;
	public MyHelperClass sound;

    public void Music(URL url, boolean streamingHint) throws SlickException {
        SoundStore.get().init();
        String ref =(String)(Object) url.getFile();
        try {
            if (ref.toLowerCase().endsWith(".ogg")) {
                if (streamingHint) {
                    sound = SoundStore.get().getOggStream(url);
                } else {
                    sound = SoundStore.get().getOgg(url.openStream());
                }
            } else if (ref.toLowerCase().endsWith(".wav")) {
                sound = SoundStore.get().getWAV(url.openStream());
            } else if (ref.toLowerCase().endsWith(".xm") || ref.toLowerCase().endsWith(".mod")) {
                sound = SoundStore.get().getMOD(url.openStream());
            } else if (ref.toLowerCase().endsWith(".aif") || ref.toLowerCase().endsWith(".aiff")) {
                sound = SoundStore.get().getAIF(url.openStream());
            } else {
                throw new SlickException("Only .xm, .mod, .ogg, and .aif/f are currently supported.");
            }
        } catch (Exception e) {
            Log.error(e);
            throw new SlickException("Failed to load sound: " + url);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass init(){ return null; }
	public MyHelperClass getOgg(MyHelperClass o0){ return null; }
	public MyHelperClass getAIF(MyHelperClass o0){ return null; }
	public MyHelperClass get(){ return null; }
	public MyHelperClass getOggStream(URL o0){ return null; }
	public MyHelperClass getWAV(MyHelperClass o0){ return null; }
	public MyHelperClass getMOD(MyHelperClass o0){ return null; }
	public MyHelperClass error(Exception o0){ return null; }}

class URL {

public MyHelperClass getFile(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class SlickException extends Exception{
	public SlickException(String errorMessage) { super(errorMessage); }
}
