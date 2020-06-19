import java.io.*;
import java.lang.*;
import java.util.*;



class c19340788 {
public MyHelperClass JOptionPane;

    public void setInput(String input, Component caller, FFMpegProgressReceiver recv) throws IOException {
        MyHelperClass inputMedium = new MyHelperClass();
        inputMedium = null;
        if (input.contains("youtube")) {
            URL url = new URL(input);
            InputStreamReader read = new InputStreamReader((InputStream)(Object)url.openStream());
            BufferedReader in = new BufferedReader(read);
            String inputLine;
            String line = null;
            String vid = input.substring(input.indexOf("?v=") + 3);
            if (vid.indexOf("&") != -1) vid = vid.substring(0, vid.indexOf("&"));
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.contains("\"t\": \"")) {
                    line = inputLine.substring(inputLine.indexOf("\"t\": \"") + 6);
                    line = line.substring(0, line.indexOf("\""));
                    break;
                }
            }
            in.close();
            if (line == null) throw new IOException("Could not find flv-Video");
            MyHelperClass lang = new MyHelperClass();
            Downloader dl = new Downloader("http://www.youtube.com/get_video?video_id=" + vid + "&t=" + line, recv, lang);
            dl.start();
            return;
        }
        Runtime rt = Runtime.getRuntime();
        MyHelperClass path = new MyHelperClass();
        Process p = rt.exec(new String[] {(String)(Object) path, "-i", input });
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        String line;
        Codec videoCodec = null;
        Codec audioCodec = null;
        double duration = -1;
        String aspectRatio = null;
        String scala = null;
        String colorSpace = null;
        String rate = null;
        String mrate = null;
        String aRate = null;
        String aFreq = null;
        String aChannel = null;
        try {
            while ((line = br.readLine()) != null) {
                MyHelperClass Constants = new MyHelperClass();
                if ((boolean)(Object)Constants.debug) System.out.println(line);
                if (line.contains("Duration:")) {
                    int hours = Integer.parseInt(line.substring(12, 14));
                    int mins = Integer.parseInt(line.substring(15, 17));
                    double secs = Double.parseDouble(line.substring(18, line.indexOf(',')));
                    duration = secs + 60 * mins + hours * 60 * 60;
                    MyHelperClass Pattern = new MyHelperClass();
                    Pattern pat =(Pattern)(Object) Pattern.compile("[0-9]+ kb/s");
                    Matcher m =(Matcher)(Object) pat.matcher(line);
                    if ((boolean)(Object)m.find()) mrate = line.substring((int)(Object)m.start(),(int)(Object) m.end());
                }
                if (line.contains("Video:")) {
                    String info = line.substring(24);
                    String parts[] = info.split(", ");
                    MyHelperClass Pattern = new MyHelperClass();
                    Pattern pat =(Pattern)(Object) Pattern.compile("Video: [a-zA-Z0-9]+,");
                    Matcher m =(Matcher)(Object) pat.matcher(line);
                    String codec = "";
                    if ((boolean)(Object)m.find()) codec = line.substring((int)(Object)m.start(),(int)(Object) m.end());
                    MyHelperClass supportedCodecs = new MyHelperClass();
                    videoCodec =(Codec)(Object) supportedCodecs.getCodecByName(codec.replace("Video: ", "").replace(",", ""));
                    colorSpace = parts[1];
//                    MyHelperClass Pattern = new MyHelperClass();
                    pat =(Pattern)(Object) Pattern.compile("[0-9]+x[0-9]+");
                    m =(Matcher)(Object) pat.matcher(info);
                    if ((boolean)(Object)m.find()) scala = info.substring((int)(Object)m.start(),(int)(Object) m.end());
//                    MyHelperClass Pattern = new MyHelperClass();
                    pat =(Pattern)(Object) Pattern.compile("DAR [0-9]+:[0-9]+");
                    m =(Matcher)(Object) pat.matcher(info);
                    MyHelperClass ConvertUtils = new MyHelperClass();
                    if ((boolean)(Object)m.find()) aspectRatio = info.substring((int)(Object)m.start(),(int)(Object) m.end()).replace("DAR ", ""); else if (scala != null) aspectRatio = String.valueOf((double) (Math.round(((double)(double)(Object) ConvertUtils.getWidthFromScala(scala) / (double)(double)(Object) ConvertUtils.getHeightFromScala(scala)) * 100)) / 100);
//                    MyHelperClass Pattern = new MyHelperClass();
                    pat =(Pattern)(Object) Pattern.compile("[0-9]+ kb/s");
                    m =(Matcher)(Object) pat.matcher(info);
                    if ((boolean)(Object)m.find()) rate = info.substring((int)(Object)m.start(),(int)(Object) m.end());
                } else if (line.contains("Audio:")) {
                    String info = line.substring(24);
                    MyHelperClass Pattern = new MyHelperClass();
                    Pattern pat =(Pattern)(Object) Pattern.compile("Audio: [a-zA-Z0-9]+,");
                    Matcher m =(Matcher)(Object) pat.matcher(line);
                    String codec = "";
                    if ((boolean)(Object)m.find()) codec = line.substring((int)(Object)m.start(),(int)(Object) m.end()).replace("Audio: ", "").replace(",", "");
                    if (codec.equals("mp3")) codec = "libmp3lame";
                    MyHelperClass supportedCodecs = new MyHelperClass();
                    audioCodec =(Codec)(Object) supportedCodecs.getCodecByName(codec);
//                    MyHelperClass Pattern = new MyHelperClass();
                    pat =(Pattern)(Object) Pattern.compile("[0-9]+ kb/s");
                    m =(Matcher)(Object) pat.matcher(info);
                    if ((boolean)(Object)m.find()) aRate = info.substring((int)(Object)m.start(),(int)(Object) m.end());
//                    MyHelperClass Pattern = new MyHelperClass();
                    pat =(Pattern)(Object) Pattern.compile("[0-9]+ Hz");
                    m =(Matcher)(Object) pat.matcher(info);
                    if ((boolean)(Object)m.find()) aFreq = info.substring((int)(Object)m.start(),(int)(Object) m.end());
                    if (line.contains("5.1")) aChannel = "5.1"; else if (line.contains("2.1")) aChannel = "2.1"; else if (line.contains("stereo")) aChannel = "Stereo"; else if (line.contains("mono")) aChannel = "Mono";
                }
                if (videoCodec != null && audioCodec != null && duration != -1) {
                    MyHelperClass ConvertUtils = new MyHelperClass();
                    if (rate == null && mrate != null && aRate != null) rate = String.valueOf((int)(Object)ConvertUtils.getRateFromRateString(mrate) - (int)(Object)ConvertUtils.getRateFromRateString(aRate)) + " kb/s";
//                    MyHelperClass inputMedium = new MyHelperClass();
                    inputMedium =(MyHelperClass)(Object) new InputMedium(audioCodec, videoCodec, input, duration, colorSpace, aspectRatio, scala, rate, mrate, aRate, aFreq, aChannel);
                    break;
                }
            }
//            MyHelperClass inputMedium = new MyHelperClass();
            if ((videoCodec != null || audioCodec != null) && duration != -1) inputMedium =(MyHelperClass)(Object) new InputMedium(audioCodec, videoCodec, input, duration, colorSpace, aspectRatio, scala, rate, mrate, aRate, aFreq, aChannel);
        } catch (Exception exc) {
            MyHelperClass lang = new MyHelperClass();
            if (caller != null) JOptionPane.showMessageDialog(caller, lang.inputerror + " Audiocodec? " + (audioCodec != null) + " Videocodec? " + (videoCodec != null), lang.error, JOptionPane.ERROR_MESSAGE);
            MyHelperClass Constants = new MyHelperClass();
            if ((boolean)(Object)Constants.debug) System.out.println("Audiocodec: " + audioCodec + "\nVideocodec: " + videoCodec);
//            MyHelperClass Constants = new MyHelperClass();
            if ((boolean)(Object)Constants.debug) exc.printStackTrace();
            throw new IOException("Input file error");
        }
//        MyHelperClass inputMedium = new MyHelperClass();
        if (inputMedium == null) {
            MyHelperClass lang = new MyHelperClass();
            if (caller != null) JOptionPane.showMessageDialog(caller, lang.inputerror + " Audiocodec? " + (audioCodec != null) + " Videocodec? " + (videoCodec != null), lang.error, JOptionPane.ERROR_MESSAGE);
            MyHelperClass Constants = new MyHelperClass();
            if ((boolean)(Object)Constants.debug) System.out.println("Audiocodec: " + audioCodec + "\nVideocodec: " + videoCodec);
            throw new IOException("Input file error");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass debug;
	public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass inputerror;
	public MyHelperClass error;
public MyHelperClass getRateFromRateString(String o0){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass getCodecByName(String o0){ return null; }
	public MyHelperClass getWidthFromScala(String o0){ return null; }
	public MyHelperClass showMessageDialog(Component o0, String o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass getHeightFromScala(String o0){ return null; }}

class Component {

}

class FFMpegProgressReceiver {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class Downloader {

Downloader(String o0, FFMpegProgressReceiver o1, MyHelperClass o2){}
	Downloader(){}
	public MyHelperClass start(){ return null; }}

class Codec {

}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass end(){ return null; }
	public MyHelperClass start(){ return null; }}

class InputMedium {

InputMedium(){}
	InputMedium(Codec o0, Codec o1, String o2, double o3, String o4, String o5, String o6, String o7, String o8, String o9, String o10, String o11){}}
