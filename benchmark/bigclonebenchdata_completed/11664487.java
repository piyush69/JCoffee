import java.io.*;
import java.lang.*;
import java.util.*;



class c11664487 {
public static MyHelperClass correctTimeToNextSyncSample(Track o0, double o1){ return null; }
//public MyHelperClass correctTimeToNextSyncSample(Track o0, double o1){ return null; }

    public static void main(String[] args) throws IOException {
        MyHelperClass Channels = new MyHelperClass();
        ReadableByteChannel in =(ReadableByteChannel)(Object) Channels.newChannel((new FileInputStream("/home/sannies/suckerpunch-distantplanet_h1080p/suckerpunch-distantplanet_h1080p.mov")));
        MyHelperClass MovieCreator = new MyHelperClass();
        Movie movie =(Movie)(Object) MovieCreator.build(in);
        in.close();
        List<Track> tracks =(List<Track>)(Object) movie.getTracks();
        movie.setTracks(new LinkedList<Track>());
        double startTime = 35.000;
        double endTime = 145.000;
        boolean timeCorrected = false;
        for (Track track : tracks) {
            if (track.getSyncSamples() != null &&(int)(Object) track.getSyncSamples().length > 0) {
                if (timeCorrected) {
                    throw new RuntimeException("The startTime has already been corrected by another track with SyncSample. Not Supported.");
                }
                startTime =(double)(Object) correctTimeToNextSyncSample(track, startTime);
                endTime =(double)(Object) correctTimeToNextSyncSample(track, endTime);
                timeCorrected = true;
            }
        }
        for (Track track : tracks) {
            long currentSample = 0;
            double currentTime = 0;
            long startSample = -1;
            long endSample = -1;
            for (int i = 0; i < (int)(Object)track.getDecodingTimeEntries().size(); i++) {
                Entry entry =(Entry)(Object) track.getDecodingTimeEntries().get(i);
                for (int j = 0; j < (int)(Object)entry.getCount(); j++) {
                    if (currentTime <= startTime) {
                        startSample = currentSample;
                    }
                    if (currentTime <= endTime) {
                        endSample = currentSample;
                    } else {
                        break;
                    }
                    currentTime += (double)(double)(Object) entry.getDelta() / (double)(double)(Object) track.getTrackMetaData().getTimescale();
                    currentSample++;
                }
            }
            movie.addTrack(new CroppedTrack(track, startSample, endSample));
        }
        long start1 = System.currentTimeMillis();
        IsoFile out =(IsoFile)(Object) (new DefaultMp4Builder().build(movie));
        long start2 = System.currentTimeMillis();
        FileOutputStream fos = new FileOutputStream(String.format("output-%f-%f.mp4", startTime, endTime));
        FileChannel fc =(FileChannel)(Object) fos.getChannel();
        out.getBox(fc);
        fc.close();
        fos.close();
        long start3 = System.currentTimeMillis();
        System.err.println("Building IsoFile took : " + (start2 - start1) + "ms");
        System.err.println("Writing IsoFile took  : " + (start3 - start2) + "ms");
        System.err.println("Writing IsoFile speed : " + (new File(String.format("output-%f-%f.mp4", startTime, endTime)).length() / (start3 - start2) / 1000) + "MB/s");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass length;
public MyHelperClass size(){ return null; }
	public MyHelperClass newChannel(FileInputStream o0){ return null; }
	public MyHelperClass getTimescale(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass build(ReadableByteChannel o0){ return null; }}

class ReadableByteChannel {

public MyHelperClass close(){ return null; }}

class Movie {

public MyHelperClass addTrack(CroppedTrack o0){ return null; }
	public MyHelperClass getTracks(){ return null; }
	public MyHelperClass setTracks(LinkedList<Track> o0){ return null; }}

class Track {

public MyHelperClass getTrackMetaData(){ return null; }
	public MyHelperClass getDecodingTimeEntries(){ return null; }
	public MyHelperClass getSyncSamples(){ return null; }}

class CroppedTrack {

CroppedTrack(Track o0, long o1, long o2){}
	CroppedTrack(){}}

class IsoFile {

public MyHelperClass getBox(FileChannel o0){ return null; }}

class DefaultMp4Builder {

public MyHelperClass build(Movie o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }}

class Entry {

public MyHelperClass getCount(){ return null; }
	public MyHelperClass getDelta(){ return null; }}
