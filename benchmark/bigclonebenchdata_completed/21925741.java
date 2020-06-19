


class c21925741 {
public static MyHelperClass MapMode;
	public static MyHelperClass predictSlopeOneRating(int o0, TShortObjectHashMap o1){ return null; }
public static MyHelperClass fSep;
	public static MyHelperClass ByteBuffer;
	public static MyHelperClass Arrays;
//	public MyHelperClass MapMode;
	public static MyHelperClass GetAveragePrediction(short o0){ return null; }
//	public MyHelperClass predictSlopeOneRating(int o0, TShortObjectHashMap o1){ return null; }
	public static MyHelperClass loadMovieDiffStats(String o0, short o1, String o2){ return null; }
//public MyHelperClass ByteBuffer;
//	public MyHelperClass fSep;
//	public MyHelperClass Arrays;
//	public MyHelperClass GetAveragePrediction(short o0){ return null; }
//	public MyHelperClass loadMovieDiffStats(String o0, short o1, String o2){ return null; }

    public static boolean predictDataSet(String completePath, String Type, String predictionOutputFileName, String slopeOneDataFolderName) {
        try {
            if (Type.equalsIgnoreCase("Qualifying")) {
                MyHelperClass fSep = new MyHelperClass();
                File inputFile = new File(completePath + fSep + "SmartGRAPE" + fSep + "CompleteQualifyingDataInByteFormat.txt");
                FileChannel inC =(FileChannel)(Object) (new FileInputStream(inputFile).getChannel());
                int filesize = (int)(int)(Object) inC.size();
                TShortObjectHashMap qualMap = new TShortObjectHashMap(17770, 1);
                ByteBuffer qualmappedfile =(ByteBuffer)(Object) inC.map(MapMode.READ_ONLY, 0, filesize);
                while ((boolean)(Object)qualmappedfile.hasRemaining()) {
                    short movie =(short)(Object) qualmappedfile.getShort();
                    int customer =(int)(Object) qualmappedfile.getInt();
                    if ((boolean)(Object)qualMap.containsKey(movie)) {
                        TIntArrayList arr = (TIntArrayList)(TIntArrayList)(Object) qualMap.get(movie);
                        arr.add(customer);
                        qualMap.put(movie, arr);
                    } else {
                        TIntArrayList arr = new TIntArrayList();
                        arr.add(customer);
                        qualMap.put(movie, arr);
                    }
                }
                System.out.println("Populated qualifying hashmap");
//                MyHelperClass fSep = new MyHelperClass();
                File outFile = new File(completePath + fSep + "SmartGRAPE" + fSep + predictionOutputFileName);
                FileChannel outC =(FileChannel)(Object) (new FileOutputStream(outFile).getChannel());
                ByteBuffer buf;
                TShortObjectHashMap movieDiffStats;
                double finalPrediction;
                short[] movies =(short[])(Object) qualMap.keys();
                MyHelperClass Arrays = new MyHelperClass();
                Arrays.sort(movies);
                for (int i = 0; i < movies.length; i++) {
                    short movieToProcess = movies[i];
                    movieDiffStats =(TShortObjectHashMap)(Object) loadMovieDiffStats(completePath, movieToProcess, slopeOneDataFolderName);
                    System.out.println(movieDiffStats.size());
                    TIntArrayList customersToProcess = (TIntArrayList)(TIntArrayList)(Object) qualMap.get(movieToProcess);
                    for (int j = 0; j < (int)(Object)customersToProcess.size(); j++) {
                        int customerToProcess =(int)(Object) customersToProcess.getQuick(j);
                        finalPrediction =(double)(Object) predictSlopeOneRating(customerToProcess, movieDiffStats);
                        if (finalPrediction == finalPrediction) {
                            if (finalPrediction < 1.0) finalPrediction = 1.0; else if (finalPrediction > 5.0) finalPrediction = 5.0;
                        } else finalPrediction =(double)(Object) GetAveragePrediction(movieToProcess);
                        buf =(ByteBuffer)(Object) ByteBuffer.allocate(10);
                        buf.putShort(movieToProcess);
                        buf.putInt(customerToProcess);
                        buf.putFloat(new Double(finalPrediction).floatValue());
                        buf.flip();
                        outC.write(buf);
                    }
                }
                outC.close();
                return true;
            } else if (Type.equalsIgnoreCase("Probe")) {
                File inputFile = new File(completePath + fSep + "SmartGRAPE" + fSep + "CompleteProbeDataInByteFormat.txt");
                FileChannel inC =(FileChannel)(Object) (new FileInputStream(inputFile).getChannel());
                int filesize = (int)(int)(Object) inC.size();
                TShortObjectHashMap probeMap = new TShortObjectHashMap(17770, 1);
                ByteBuffer probemappedfile =(ByteBuffer)(Object) inC.map(MapMode.READ_ONLY, 0, filesize);
                while ((boolean)(Object)probemappedfile.hasRemaining()) {
                    short movie =(short)(Object) probemappedfile.getShort();
                    int customer =(int)(Object) probemappedfile.getInt();
                    byte rating =(byte)(Object) probemappedfile.get();
                    if ((boolean)(Object)probeMap.containsKey(movie)) {
                        TIntByteHashMap actualRatings = (TIntByteHashMap)(TIntByteHashMap)(Object) probeMap.get(movie);
                        actualRatings.put(customer, rating);
                        probeMap.put(movie, actualRatings);
                    } else {
                        TIntByteHashMap actualRatings = new TIntByteHashMap();
                        actualRatings.put(customer, rating);
                        probeMap.put(movie, actualRatings);
                    }
                }
                System.out.println("Populated probe hashmap");
                File outFile = new File(completePath + fSep + "SmartGRAPE" + fSep + predictionOutputFileName);
                FileChannel outC =(FileChannel)(Object) (new FileOutputStream(outFile).getChannel());
                ByteBuffer buf;
                double finalPrediction;
                TShortObjectHashMap movieDiffStats;
                short[] movies =(short[])(Object) probeMap.keys();
                Arrays.sort(movies);
                for (int i = 0; i < movies.length; i++) {
                    short movieToProcess = movies[i];
                    movieDiffStats =(TShortObjectHashMap)(Object) loadMovieDiffStats(completePath, movieToProcess, slopeOneDataFolderName);
                    TIntByteHashMap custRatingsToProcess = (TIntByteHashMap)(TIntByteHashMap)(Object) probeMap.get(movieToProcess);
                    TIntArrayList customersToProcess = new TIntArrayList(custRatingsToProcess.keys());
                    for (int j = 0; j < (int)(Object)customersToProcess.size(); j++) {
                        int customerToProcess =(int)(Object) customersToProcess.getQuick(j);
                        byte rating =(byte)(Object) custRatingsToProcess.get(customerToProcess);
                        finalPrediction =(double)(Object) predictSlopeOneRating(customerToProcess, movieDiffStats);
                        if (finalPrediction == finalPrediction) {
                            if (finalPrediction < 1.0) finalPrediction = 1.0; else if (finalPrediction > 5.0) finalPrediction = 5.0;
                        } else finalPrediction =(double)(Object) GetAveragePrediction(movieToProcess);
                        buf =(ByteBuffer)(Object) ByteBuffer.allocate(11);
                        buf.putShort(movieToProcess);
                        buf.putInt(customerToProcess);
                        buf.put(rating);
                        buf.putFloat(new Double(finalPrediction).floatValue());
                        buf.flip();
                        outC.write(buf);
                    }
                }
                outC.close();
                return true;
            } else return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
public MyHelperClass sort(short[] o0){ return null; }
	public MyHelperClass allocate(int o0){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileChannel {

public MyHelperClass map(MyHelperClass o0, int o1, int o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class TShortObjectHashMap {

TShortObjectHashMap(){}
	TShortObjectHashMap(int o0, int o1){}
	public MyHelperClass put(short o0, TIntArrayList o1){ return null; }
	public MyHelperClass keys(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass get(short o0){ return null; }
	public MyHelperClass containsKey(short o0){ return null; }
	public MyHelperClass put(short o0, TIntByteHashMap o1){ return null; }}

class ByteBuffer {

public MyHelperClass getInt(){ return null; }
	public MyHelperClass putShort(short o0){ return null; }
	public MyHelperClass getShort(){ return null; }
	public MyHelperClass hasRemaining(){ return null; }
	public MyHelperClass putFloat(float o0){ return null; }
	public MyHelperClass putInt(int o0){ return null; }
	public MyHelperClass put(byte o0){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass get(){ return null; }}

class TIntArrayList {

TIntArrayList(){}
	TIntArrayList(MyHelperClass o0){}
	public MyHelperClass getQuick(int o0){ return null; }
	public MyHelperClass add(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class TIntByteHashMap {

public MyHelperClass put(int o0, byte o1){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass keys(){ return null; }}
