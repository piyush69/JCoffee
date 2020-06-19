import java.io.*;
import java.lang.*;
import java.util.*;



class c3634782 {
public static MyHelperClass getKsTable(MyHelperClass o0){ return null; }
	public static MyHelperClass getHdCdf(MyHelperClass o0, MyHelperClass o1){ return null; }
	public static MyHelperClass getModelAgreedSiteCnt(GenomeInterval o0, CanonicalGFF o1, CanonicalGFF o2, CanonicalGFF o3){ return null; }
	public static MyHelperClass probabilityEvaluation(MyHelperClass o0, int o1, int o2, TreeMap o3, int o4){ return null; }
public static MyHelperClass ksTable1Filename;
	public static MyHelperClass gffFilename;
	public static MyHelperClass ksTable2Filename;
	public static MyHelperClass minimumOverlap;
	public static MyHelperClass inFilename;
	public static MyHelperClass outFilename;
	public static MyHelperClass readLength;
	public static MyHelperClass transcriptFilename;
	public static MyHelperClass modelFilename;
//	public MyHelperClass getKsTable(MyHelperClass o0){ return null; }
//	public MyHelperClass getModelAgreedSiteCnt(GenomeInterval o0, CanonicalGFF o1, CanonicalGFF o2, CanonicalGFF o3){ return null; }
	public static MyHelperClass distributionAccepter(TreeMap o0, int o1, double[] o2, TreeMap o3, TreeMap o4){ return null; }
	public static MyHelperClass getSplicingMap(String o0){ return null; }
//	public MyHelperClass getHdCdf(MyHelperClass o0, MyHelperClass o1){ return null; }
	public static MyHelperClass paraProc(String[] o0){ return null; }
//	public MyHelperClass probabilityEvaluation(MyHelperClass o0, int o1, int o2, TreeMap o3, int o4){ return null; }
//public MyHelperClass readLength;
//	public MyHelperClass transcriptFilename;
//	public MyHelperClass gffFilename;
//	public MyHelperClass ksTable2Filename;
//	public MyHelperClass outFilename;
//	public MyHelperClass modelFilename;
//	public MyHelperClass ksTable1Filename;
//	public MyHelperClass minimumOverlap;
//	public MyHelperClass inFilename;
//	public MyHelperClass getSplicingMap(String o0){ return null; }
//	public MyHelperClass paraProc(String[] o0){ return null; }
//	public MyHelperClass distributionAccepter(TreeMap o0, int o1, double[] o2, TreeMap o3, TreeMap o4){ return null; }

    public static void main(String[] args) {
        paraProc(args);
        CanonicalGFF cgff = new CanonicalGFF(gffFilename);
        CanonicalGFF geneModel = new CanonicalGFF(modelFilename);
        CanonicalGFF transcriptGff = new CanonicalGFF(transcriptFilename);
        TreeMap ksTable1 =(TreeMap)(Object) getKsTable(ksTable1Filename);
        TreeMap ksTable2 =(TreeMap)(Object) getKsTable(ksTable2Filename);
        Map intronReadCntMap = new TreeMap();
        Map intronSplicingPosMap = new TreeMap();
        try {
            BufferedReader fr = new BufferedReader(new FileReader((String)(Object)inFilename));
            while (fr.ready()) {
                String line = fr.readLine();
                if (line.startsWith("#")) continue;
                String tokens[] = line.split("\t");
                String chr = tokens[0];
                int start = Integer.parseInt(tokens[1]);
                int stop = Integer.parseInt(tokens[2]);
                GenomeInterval intron = new GenomeInterval(chr, start, stop);
                int readCnt = Integer.parseInt(tokens[3]);
                intronReadCntMap.put(intron, readCnt);
                String splicingMapStr = tokens[4];
                Map splicingMap =(Map)(Object) getSplicingMap(splicingMapStr);
                intronSplicingPosMap.put(intron, splicingMap);
            }
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        double[] hdCDF =(double[])(Object) getHdCdf(readLength, minimumOverlap);
        try {
            FileWriter fw = new FileWriter((String)(Object)outFilename);
            for (Iterator intronIterator = intronReadCntMap.keySet().iterator(); intronIterator.hasNext(); ) {
                GenomeInterval intron = (GenomeInterval) intronIterator.next();
                int readCnt = ((Integer) intronReadCntMap.get(intron)).intValue();
                TreeMap splicingMap = (TreeMap) intronSplicingPosMap.get(intron);
                Object ksInfoArray[] =(Object[])(Object) distributionAccepter((TreeMap) splicingMap.clone(), readCnt, hdCDF, ksTable1, ksTable2);
                boolean ksAccepted = (Boolean) ksInfoArray[0];
                double testK = (Double) ksInfoArray[1];
                double standardK1 = (Double) ksInfoArray[2];
                double standardK2 = (Double) ksInfoArray[3];
                int positionCnt = splicingMap.size();
                Object modelInfoArray[] =(Object[])(Object) getModelAgreedSiteCnt(intron, cgff, geneModel, transcriptGff);
                int modelAgreedSiteCnt = (Integer) modelInfoArray[0];
                int maxAgreedTransSiteCnt = (Integer) modelInfoArray[1];
                boolean containedBySomeGene = (Boolean) modelInfoArray[2];
                int numIntersectingGenes = (Integer) modelInfoArray[3];
                int distance =(int)(Object) intron.getStop() - (int)(Object)intron.getStart();
                fw.write(intron.getChr() + ":" + intron.getStart() + ".." + intron.getStop() + "\t" + distance + "\t" + readCnt + "\t" + splicingMap + "\t" + probabilityEvaluation(readLength, distance, readCnt, splicingMap, positionCnt) + "\t" + ksAccepted + "\t" + testK + "\t" + standardK1 + "\t" + standardK2 + "\t" + positionCnt + "\t" + modelAgreedSiteCnt + "\t" + maxAgreedTransSiteCnt + "\t" + containedBySomeGene + "\t" + numIntersectingGenes + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class CanonicalGFF {

CanonicalGFF(){}
	CanonicalGFF(MyHelperClass o0){}}

class GenomeInterval {

GenomeInterval(String o0, int o1, int o2){}
	GenomeInterval(){}
	public MyHelperClass getChr(){ return null; }
	public MyHelperClass getStop(){ return null; }
	public MyHelperClass getStart(){ return null; }}
