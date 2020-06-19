


class c22222259 {
public MyHelperClass refreshButton;
	public MyHelperClass chrField;

    void extractEnsemblCoords(String geneviewLink) {
        try {
            URL connectURL = new URL(geneviewLink);
            InputStream urlStream =(InputStream)(Object) connectURL.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlStream));
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                if (line.indexOf("View gene in genomic location") != -1) {
                    line = line.substring(line.indexOf("contigview?"));
                    String chr, start, stop;
                    chr = line.substring(line.indexOf("chr=") + 4);
                    chr = chr.substring(0, chr.indexOf("&"));
                    start = line.substring(line.indexOf("vc_start=") + 9);
                    start = start.substring(0, start.indexOf("&"));
                    stop = line.substring(line.indexOf("vc_end=") + 7);
                    stop = stop.substring(0, stop.indexOf("\""));
                    String selString;
                    for (int s = 0; s < (int)(Object)chrField.getModel().getSize(); s++) {
                        if (chr.equals(chrField.getModel().getElementAt(s))) {
                            chrField.setSelectedIndex(s);
                            break;
                        }
                    }
                    MyHelperClass selPanel = new MyHelperClass();
                    selPanel.setStart(Integer.parseInt(start));
//                    MyHelperClass selPanel = new MyHelperClass();
                    selPanel.setStop(Integer.parseInt(stop));
                    refreshButton.doClick();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Problems retrieving Geneview from Ensembl");
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setSelectedIndex(int o0){ return null; }
	public MyHelperClass doClick(){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getModel(){ return null; }
	public MyHelperClass setStart(int o0){ return null; }
	public MyHelperClass setStop(int o0){ return null; }
	public MyHelperClass getElementAt(int o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
