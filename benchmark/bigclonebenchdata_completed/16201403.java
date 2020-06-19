


class c16201403 {

    public void loadSample(String uid, URL url) throws Exception {
        MyHelperClass AudioSystem = new MyHelperClass();
        AudioInputStream input =(AudioInputStream)(Object) AudioSystem.getAudioInputStream(url.openStream());
        Clip line = null;
        Info info = new Info(Clip.class, input.getFormat());
//        MyHelperClass AudioSystem = new MyHelperClass();
        if (!(Boolean)(Object)AudioSystem.isLineSupported(info)) {
            throw new javax.sound.sampled.UnsupportedAudioFileException((String)(Object)url.toExternalForm());
        }
//        MyHelperClass AudioSystem = new MyHelperClass();
        line = (Clip)(Clip)(Object) AudioSystem.getLine(info);
        line.open(input);
        MyHelperClass samples = new MyHelperClass();
        samples.put(uid, line);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAudioInputStream(MyHelperClass o0){ return null; }
	public MyHelperClass isLineSupported(Info o0){ return null; }
	public MyHelperClass put(String o0, Clip o1){ return null; }
	public MyHelperClass getLine(Info o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class AudioInputStream {

public MyHelperClass getFormat(){ return null; }}

class Clip {

public MyHelperClass open(AudioInputStream o0){ return null; }}

class Info {

Info(Class<Clip> o0, MyHelperClass o1){}
	Info(){}}
