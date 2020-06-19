


class c23169676 {
public MyHelperClass logger;

    ArrayList remoteSampling(IntersectionFile[] intersectionFiles, double[][] points) {
        MyHelperClass intersectConfig = new MyHelperClass();
        logger.info("begin REMOTE sampling, number of threads " + intersectConfig.getThreadCount() + ", number of layers=" + intersectionFiles.length + ", number of coordinates=" + points.length);
        ArrayList output = null;
        try {
            long start = System.currentTimeMillis();
//            MyHelperClass intersectConfig = new MyHelperClass();
            URL url = new URL(intersectConfig.getLayerIndexUrl() + "/intersect/batch");
            URLConnection c =(URLConnection)(Object) url.openConnection();
            c.setDoOutput(true);
            OutputStreamWriter out = new OutputStreamWriter(c.getOutputStream());
            out.write("fids=");
            for (int i = 0; i < intersectionFiles.length; i++) {
                if (i > 0) {
                    out.write(",");
                }
                out.write((String)(Object)intersectionFiles[i].getFieldId());
            }
            out.write("&points=");
            for (int i = 0; i < points.length; i++) {
                if (i > 0) {
                    out.write(",");
                }
                out.write(String.valueOf(points[i][0]));
                out.write(",");
                out.write(String.valueOf(points[i][1]));
            }
            out.close();
            CSVReader csv = new CSVReader(new InputStreamReader(new GZIPInputStream(c.getInputStream())));
            long mid = System.currentTimeMillis();
            ArrayList tmpOutput = new ArrayList();
            for (int i = 0; i < intersectionFiles.length; i++) {
                tmpOutput.add(new StringBuilder());
            }
            String[] line;
            int row = 0;
            csv.readNext();
            while ((line =(String[])(Object) csv.readNext()) != null) {
                for (int i = 2; i < line.length && i - 2 < (int)(Object)tmpOutput.size(); i++) {
                    if (row > 0) {
                        tmpOutput.get(i - 2).append("\n");
                    }
                    tmpOutput.get(i - 2).append(line[i]);
                }
                row++;
            }
            csv.close();
            output = new ArrayList();
            for (int i = 0; i < (int)(Object)tmpOutput.size(); i++) {
                output.add((StringBuilder)(Object)tmpOutput.get(i).toString());
                tmpOutput.set(i, null);
            }
            long end = System.currentTimeMillis();
            MyHelperClass logger = new MyHelperClass();
            logger.info("sample time for " + 5 + " layers and " + 3 + " coordinates: get response=" + (mid - start) + "ms, write response=" + (end - mid) + "ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass getThreadCount(){ return null; }
	public MyHelperClass getLayerIndexUrl(){ return null; }}

class IntersectionFile {

public MyHelperClass getFieldId(){ return null; }}

class ArrayList {

public MyHelperClass add(StringBuilder o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass set(int o0, Object o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(MyHelperClass o0){}
	OutputStreamWriter(){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class CSVReader {

CSVReader(){}
	CSVReader(InputStreamReader o0){}
	public MyHelperClass readNext(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(GZIPInputStream o0){}}

class GZIPInputStream {

GZIPInputStream(MyHelperClass o0){}
	GZIPInputStream(){}}
