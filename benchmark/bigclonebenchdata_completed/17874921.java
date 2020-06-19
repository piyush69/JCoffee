


class c17874921 {
public static MyHelperClass MapMode;
	public static MyHelperClass fSep;
//public MyHelperClass fSep;
	public static MyHelperClass ByteBuffer;
//	public MyHelperClass MapMode;
	public static MyHelperClass CustOverLapForTwoMoviesCustom(int[] o0, int[] o1){ return null; }
//public MyHelperClass ByteBuffer;
//	public MyHelperClass CustOverLapForTwoMoviesCustom(int[] o0, int[] o1){ return null; }

    public static boolean buildCFItem2ItemStats(String outFileName, String movieAvgFileName, String custAvgFileName) {
        try {
            MyHelperClass completePath = new MyHelperClass();
            File infile = new File((int)(Object)completePath + (int)(Object)fSep + "SmartGRAPE" + fSep + movieAvgFileName);
            FileChannel inC =(FileChannel)(Object) (new FileInputStream(infile).getChannel());
            int size = (int)(int)(Object) inC.size();
            ByteBuffer map =(ByteBuffer)(Object) inC.map(MapMode.READ_ONLY, 0, size);
            TShortFloatHashMap movieAverages = new TShortFloatHashMap(17770, 1);
            inC.close();
            while ((boolean)(Object)map.hasRemaining()) {
                movieAverages.put(map.getShort(), map.getFloat());
            }
            map = null;
//            MyHelperClass completePath = new MyHelperClass();
            infile = new File((int)(Object)completePath + (int)(Object)fSep + "SmartGRAPE" + fSep + custAvgFileName);
            inC =(FileChannel)(Object) (new FileInputStream(infile).getChannel());
            size = (int)(int)(Object) inC.size();
            map =(ByteBuffer)(Object) inC.map(MapMode.READ_ONLY, 0, size);
            TIntFloatHashMap custAverages = new TIntFloatHashMap(480189, 1);
            inC.close();
            while ((boolean)(Object)map.hasRemaining()) {
                custAverages.put(map.getInt(), map.getFloat());
            }
//            MyHelperClass completePath = new MyHelperClass();
            File outfile = new File((int)(Object)completePath + (int)(Object)fSep + "SmartGRAPE" + fSep + outFileName);
            FileChannel outC =(FileChannel)(Object) (new FileOutputStream(outfile, true).getChannel());
            MyHelperClass CustomersAndRatingsPerMovie = new MyHelperClass();
            short[] movies =(short[])(Object) CustomersAndRatingsPerMovie.keys();
            MyHelperClass Arrays = new MyHelperClass();
            Arrays.sort(movies);
            int noMovies = movies.length;
            for (int i = 0; i < noMovies - 1; i++) {
                short movie1 = movies[i];
//                MyHelperClass CustomersAndRatingsPerMovie = new MyHelperClass();
                TIntByteHashMap testMovieCustAndRatingsMap = (TIntByteHashMap)(TIntByteHashMap)(Object) CustomersAndRatingsPerMovie.get(movie1);
                int[] customers1 =(int[])(Object) testMovieCustAndRatingsMap.keys();
//                MyHelperClass Arrays = new MyHelperClass();
                Arrays.sort(customers1);
                System.out.println("Processing movie: " + movie1);
                for (int j = i + 1; j < noMovies; j++) {
                    short movie2 = movies[j];
//                    MyHelperClass CustomersAndRatingsPerMovie = new MyHelperClass();
                    TIntByteHashMap otherMovieCustAndRatingsMap = (TIntByteHashMap)(TIntByteHashMap)(Object) CustomersAndRatingsPerMovie.get(movie2);
                    int[] customers2 =(int[])(Object) otherMovieCustAndRatingsMap.keys();
                    TIntArrayList intersectSet =(TIntArrayList)(Object) CustOverLapForTwoMoviesCustom(customers1, customers2);
                    int count = 0;
                    float diffRating = 0;
                    float pearsonCorr = 0;
                    float cosineCorr = 0;
                    float adjustedCosineCorr = 0;
                    float sumX = 0;
                    float sumY = 0;
                    float sumXY = 0;
                    float sumX2 = 0;
                    float sumY2 = 0;
                    float sumXYPearson = 0;
                    float sumX2Pearson = 0;
                    float sumY2Pearson = 0;
                    float sumXYACos = 0;
                    float sumX2ACos = 0;
                    float sumY2ACos = 0;
                    if (((int)(Object)intersectSet.size() == 0) || (intersectSet == null)) {
                        count = 0;
                        diffRating = 0;
                    } else {
                        count =(int)(Object) intersectSet.size();
                        for (int l = 0; l < count; l++) {
                            int commonCust =(int)(Object) intersectSet.getQuick(l);
                            byte ratingX =(byte)(Object) testMovieCustAndRatingsMap.get(commonCust);
                            sumX += ratingX;
                            byte ratingY =(byte)(Object) otherMovieCustAndRatingsMap.get(commonCust);
                            sumY += ratingY;
                            sumX2 += ratingX * ratingX;
                            sumY2 += ratingY * ratingY;
                            sumXY += ratingX * ratingY;
                            diffRating += ratingX - ratingY;
                            sumXYPearson += (ratingX - (byte)(Object)movieAverages.get(movie1)) * (ratingY - (byte)(Object)movieAverages.get(movie2));
                            sumX2Pearson += Math.pow((ratingX - (byte)(Object)movieAverages.get(movie1)), 2);
                            sumY2Pearson += Math.pow((ratingY - (byte)(Object)movieAverages.get(movie2)), 2);
                            float custAverage =(float)(Object) custAverages.get(commonCust);
                            sumXYACos += (ratingX - custAverage) * (ratingY - custAverage);
                            sumX2ACos += Math.pow((ratingX - custAverage), 2);
                            sumY2ACos += Math.pow((ratingY - custAverage), 2);
                        }
                    }
                    double pearsonDenominator = Math.sqrt(sumX2Pearson) * Math.sqrt(sumY2Pearson);
                    if (pearsonDenominator == 0.0) {
                        pearsonCorr = 0;
                    } else {
                        pearsonCorr = new Double(sumXYPearson / pearsonDenominator).floatValue();
                    }
                    double adjCosineDenominator = Math.sqrt(sumX2ACos) * Math.sqrt(sumY2ACos);
                    if (adjCosineDenominator == 0.0) {
                        adjustedCosineCorr = 0;
                    } else {
                        adjustedCosineCorr = new Double(sumXYACos / adjCosineDenominator).floatValue();
                    }
                    double cosineDenominator = Math.sqrt(sumX2) * Math.sqrt(sumY2);
                    if (cosineDenominator == 0.0) {
                        cosineCorr = 0;
                    } else {
                        cosineCorr = new Double(sumXY / cosineDenominator).floatValue();
                    }
                    ByteBuffer buf =(ByteBuffer)(Object) ByteBuffer.allocate(44);
                    buf.putShort(movie1);
                    buf.putShort(movie2);
                    buf.putInt(count);
                    buf.putFloat(diffRating);
                    buf.putFloat(sumXY);
                    buf.putFloat(sumX);
                    buf.putFloat(sumY);
                    buf.putFloat(sumX2);
                    buf.putFloat(sumY2);
                    buf.putFloat(pearsonCorr);
                    buf.putFloat(adjustedCosineCorr);
                    buf.putFloat(cosineCorr);
                    buf.flip();
                    outC.write(buf);
                    buf.clear();
                }
            }
            outC.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
public MyHelperClass get(short o0){ return null; }
	public MyHelperClass keys(){ return null; }
	public MyHelperClass sort(int[] o0){ return null; }
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

class ByteBuffer {

public MyHelperClass getInt(){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass putShort(short o0){ return null; }
	public MyHelperClass getShort(){ return null; }
	public MyHelperClass hasRemaining(){ return null; }
	public MyHelperClass putFloat(float o0){ return null; }
	public MyHelperClass putInt(int o0){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass getFloat(){ return null; }}

class TShortFloatHashMap {

TShortFloatHashMap(){}
	TShortFloatHashMap(int o0, int o1){}
	public MyHelperClass get(short o0){ return null; }
	public MyHelperClass put(MyHelperClass o0, MyHelperClass o1){ return null; }}

class TIntFloatHashMap {

TIntFloatHashMap(){}
	TIntFloatHashMap(int o0, int o1){}
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass put(MyHelperClass o0, MyHelperClass o1){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0, boolean o1){}
	public MyHelperClass getChannel(){ return null; }}

class TIntByteHashMap {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass keys(){ return null; }}

class TIntArrayList {

public MyHelperClass size(){ return null; }
	public MyHelperClass getQuick(int o0){ return null; }}
