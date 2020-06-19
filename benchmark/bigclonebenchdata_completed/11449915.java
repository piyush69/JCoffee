import java.io.*;
import java.lang.*;
import java.util.*;



class c11449915 {
public MyHelperClass NULL;
public MyHelperClass isReady;
	public MyHelperClass voiceCache;
	public MyHelperClass frameSize;
	public MyHelperClass voice;
	public MyHelperClass format;
	public MyHelperClass period;

    public void TtsTrackImpl(URL url, String voiceName, VoicesCache vc) throws IOException {
        VoicesCache voiceCache =(VoicesCache)(Object) NULL; //new VoicesCache();
        this.voiceCache =(MyHelperClass)(Object) vc;
        isReady =(MyHelperClass)(Object) false;
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        frameSize =(MyHelperClass)(Object) (int) ((int)(Object)period * (int)(Object)format.getChannels() * (int)(Object)format.getSampleSizeInBits() * (int)(Object)format.getSampleRate() / 8000);
        voice = voiceCache.allocateVoice(voiceName);
        TTSAudioBuffer audioBuffer = new TTSAudioBuffer();
        MyHelperClass voice = new MyHelperClass();
        this.voice.setAudioPlayer(audioBuffer);
//        MyHelperClass voice = new MyHelperClass();
        this.voice.speak(connection.getInputStream());
        audioBuffer.flip();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSampleSizeInBits(){ return null; }
	public MyHelperClass getChannels(){ return null; }
	public MyHelperClass allocateVoice(String o0){ return null; }
	public MyHelperClass setAudioPlayer(TTSAudioBuffer o0){ return null; }
	public MyHelperClass getSampleRate(){ return null; }
	public MyHelperClass speak(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class VoicesCache {

public MyHelperClass allocateVoice(String o0){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class TTSAudioBuffer {

public MyHelperClass flip(){ return null; }}
