import java.io.*;
import java.lang.*;
import java.util.*;



class c13862028 {
public static MyHelperClass NULL;
//public MyHelperClass NULL;
public static MyHelperClass MapMode;
	public static MyHelperClass MovieIndexFileName;
	public static MyHelperClass CustIndexFileName;
	public static MyHelperClass InitializeCustomerRatingsForMovieHashMap(String o0, short o1){ return null; }
	public static MyHelperClass InitializeMovieRatingsForCustomerHashMap(String o0, MyHelperClass o1){ return null; }
	public static MyHelperClass predictRating(int o0, short o1, TIntByteHashMap o2, int o3, short[] o4, TShortByteHashMap o5){ return null; }
//public MyHelperClass MapMode;
//	public MyHelperClass CustIndexFileName;
//	public MyHelperClass MovieIndexFileName;
//	public MyHelperClass InitializeMovieRatingsForCustomerHashMap(String o0, MyHelperClass o1){ return null; }
//	public MyHelperClass predictRating(int o0, short o1, TIntByteHashMap o2, int o3, short[] o4, TShortByteHashMap o5){ return null; }
//	public MyHelperClass InitializeCustomerRatingsForMovieHashMap(String o0, short o1){ return null; }

    public static void main(String[] args) {
        try {
            String completePath = null;
            String predictionFileName = null;
            if (args.length == 2) {
                completePath = args[0];
                predictionFileName = args[1];
            } else {
                System.out.println("Please provide complete path to training_set parent folder as an argument. EXITING");
                System.exit(0);
            }
            MyHelperClass fSep = new MyHelperClass();
            File inputFile = new File(completePath + fSep + "SmartGRAPE" + fSep + MovieIndexFileName);
            FileChannel inC =(FileChannel)(Object) (new FileInputStream(inputFile).getChannel());
            int filesize = (int)(int)(Object) inC.size();
            ByteBuffer mappedfile =(ByteBuffer)(Object) inC.map(MapMode.READ_ONLY, 0, filesize);
            TShortObjectHashMap MovieLimitsTHash =(TShortObjectHashMap)(Object) NULL; //new TShortObjectHashMap();
            MovieLimitsTHash = new TShortObjectHashMap(17770, 1);
            int i = 0, totalcount = 0;
            short movie;
            int startIndex, endIndex;
            TIntArrayList a;
            while ((boolean)(Object)mappedfile.hasRemaining()) {
                movie =(short)(Object) mappedfile.getShort();
                startIndex =(int)(Object) mappedfile.getInt();
                endIndex =(int)(Object) mappedfile.getInt();
                a = new TIntArrayList(2);
                a.add(startIndex);
                a.add(endIndex);
//                MyHelperClass MovieLimitsTHash = new MyHelperClass();
                MovieLimitsTHash.put(movie, a);
            }
            inC.close();
            mappedfile = null;
            System.out.println("Loaded movie index hash");
//            MyHelperClass fSep = new MyHelperClass();
            inputFile = new File(completePath + fSep + "SmartGRAPE" + fSep + CustIndexFileName);
            inC =(FileChannel)(Object) (new FileInputStream(inputFile).getChannel());
            filesize = (int)(int)(Object) inC.size();
            mappedfile =(ByteBuffer)(Object) inC.map(MapMode.READ_ONLY, 0, filesize);
            TIntObjectHashMap CustomerLimitsTHash =(TIntObjectHashMap)(Object) NULL; //new TIntObjectHashMap();
            CustomerLimitsTHash = new TIntObjectHashMap(480189, 1);
            int custid;
            while ((boolean)(Object)mappedfile.hasRemaining()) {
                custid =(int)(Object) mappedfile.getInt();
                startIndex =(int)(Object) mappedfile.getInt();
                endIndex =(int)(Object) mappedfile.getInt();
                a = new TIntArrayList(2);
                a.add(startIndex);
                a.add(endIndex);
//                MyHelperClass CustomerLimitsTHash = new MyHelperClass();
                CustomerLimitsTHash.put(custid, a);
            }
            inC.close();
            mappedfile = null;
            System.out.println("Loaded customer index hash");
            TIntObjectHashMap MoviesAndRatingsPerCustomer =(TIntObjectHashMap)(Object) NULL; //new TIntObjectHashMap();
            MoviesAndRatingsPerCustomer =(TIntObjectHashMap)(Object) InitializeMovieRatingsForCustomerHashMap(completePath,(MyHelperClass)(Object) CustomerLimitsTHash);
            System.out.println("Populated MoviesAndRatingsPerCustomer hashmap");
//            MyHelperClass fSep = new MyHelperClass();
            File outfile = new File(completePath + fSep + "SmartGRAPE" + fSep + predictionFileName);
            FileChannel out =(FileChannel)(Object) (new FileOutputStream(outfile, true).getChannel());
//            MyHelperClass fSep = new MyHelperClass();
            inputFile = new File(completePath + fSep + "SmartGRAPE" + fSep + "formattedProbeData.txt");
            inC =(FileChannel)(Object) (new FileInputStream(inputFile).getChannel());
            filesize = (int)(int)(Object) inC.size();
            ByteBuffer probemappedfile =(ByteBuffer)(Object) inC.map(MapMode.READ_ONLY, 0, filesize);
            int custAndRatingSize = 0;
            TIntByteHashMap custsandratings = new TIntByteHashMap();
            int ignoreProcessedRows = 0;
            int movieViewershipSize = 0;
            while ((boolean)(Object)probemappedfile.hasRemaining()) {
                short testmovie =(short)(Object) probemappedfile.getShort();
                int testCustomer =(int)(Object) probemappedfile.getInt();
                MyHelperClass CustomersAndRatingsPerMovie = new MyHelperClass();
                if ((CustomersAndRatingsPerMovie != null) && (boolean)(Object)(CustomersAndRatingsPerMovie.containsKey(testmovie))) {
                } else {
//                    MyHelperClass CustomersAndRatingsPerMovie = new MyHelperClass();
                    CustomersAndRatingsPerMovie = InitializeCustomerRatingsForMovieHashMap(completePath, testmovie);
//                    MyHelperClass CustomersAndRatingsPerMovie = new MyHelperClass();
                    custsandratings = (TIntByteHashMap)(TIntByteHashMap)(Object) CustomersAndRatingsPerMovie.get(testmovie);
                    custAndRatingSize =(int)(Object) custsandratings.size();
                }
//                MyHelperClass MoviesAndRatingsPerCustomer = new MyHelperClass();
                TShortByteHashMap testCustMovieAndRatingsMap = (TShortByteHashMap)(TShortByteHashMap)(Object) MoviesAndRatingsPerCustomer.get(testCustomer);
                short[] testCustMovies =(short[])(Object) testCustMovieAndRatingsMap.keys();
                float finalPrediction = 0;
                finalPrediction =(float)(Object) predictRating(testCustomer, testmovie, custsandratings, custAndRatingSize, testCustMovies, testCustMovieAndRatingsMap);
                System.out.println("prediction for movie: " + testmovie + " for customer " + testCustomer + " is " + finalPrediction);
                MyHelperClass ByteBuffer = new MyHelperClass();
                ByteBuffer buf =(ByteBuffer)(Object) ByteBuffer.allocate(11);
                buf.putShort(testmovie);
                buf.putInt(testCustomer);
                buf.putFloat(finalPrediction);
                buf.flip();
                out.write(buf);
                buf = null;
                testCustMovieAndRatingsMap = null;
                testCustMovies = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
public MyHelperClass containsKey(short o0){ return null; }
	public MyHelperClass put(int o0, TIntArrayList o1){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass put(short o0, TIntArrayList o1){ return null; }
	public MyHelperClass allocate(int o0){ return null; }
	public MyHelperClass get(short o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, int o2){ return null; }}

class ByteBuffer {

public MyHelperClass putFloat(float o0){ return null; }
	public MyHelperClass getShort(){ return null; }
	public MyHelperClass getInt(){ return null; }
	public MyHelperClass putInt(int o0){ return null; }
	public MyHelperClass putShort(short o0){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass hasRemaining(){ return null; }}

class TIntArrayList {

TIntArrayList(){}
	TIntArrayList(int o0){}
	public MyHelperClass add(int o0){ return null; }}

class TIntByteHashMap {

public MyHelperClass size(){ return null; }}

class TShortByteHashMap {

public MyHelperClass keys(){ return null; }}

class TShortObjectHashMap {

TShortObjectHashMap(int o0, int o1){}
	TShortObjectHashMap(){}
	public MyHelperClass put(short o0, TIntArrayList o1){ return null; }}

class TIntObjectHashMap {

TIntObjectHashMap(int o0, int o1){}
	TIntObjectHashMap(){}
	public MyHelperClass put(int o0, TIntArrayList o1){ return null; }
	public MyHelperClass get(int o0){ return null; }}
