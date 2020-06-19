import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4114529 {
public MyHelperClass instance;
	public MyHelperClass log;
public MyHelperClass EsomMapper;
	public MyHelperClass EsomIO;
	public MyHelperClass outputRetina;
	public MyHelperClass actInstance;
	public MyHelperClass inputVectors;

//    @Override
    public void save(File folder)  throws Throwable {
        MyHelperClass actInstance = new MyHelperClass();
        actInstance = instance;
        MyHelperClass EsomMapper = new MyHelperClass();
        this.setProperty(EsomMapper.PROPERTY_INSTANCE, String.valueOf(actInstance));
//        MyHelperClass EsomMapper = new MyHelperClass();
        log.debug("instance: " + this.getProperty(EsomMapper.PROPERTY_INSTANCE));
//        MyHelperClass EsomMapper = new MyHelperClass();
        if (this.getProperty(EsomMapper.PROPERTY_LRN_RADIO_SELECTED) == EsomMapper.RADIO_LOAD_SELECTED) {
//            MyHelperClass EsomMapper = new MyHelperClass();
            File src = new File(this.getProperty(EsomMapper.PROPERTY_LRN_FILE));
            if (src.getParent() != folder.getPath()) {
                MyHelperClass log = new MyHelperClass();
                log.debug("saving lrn file in save folder " + folder.getPath());
//                MyHelperClass actInstance = new MyHelperClass();
                File dst = new File(folder.getAbsolutePath() + File.separator + src.getName() + String.valueOf(actInstance));
                try {
                    FileReader fr = new FileReader(src);
                    BufferedReader br = new BufferedReader(fr);
                    dst.createNewFile();
                    FileWriter fw = new FileWriter(dst);
                    BufferedWriter bw = new BufferedWriter(fw);
                    int i = 0;
                    while ((i = br.read()) != -1) bw.write(i);
                    bw.flush();
                    bw.close();
                    br.close();
                    fr.close();
                } catch (FileNotFoundException e) {
//                    MyHelperClass log = new MyHelperClass();
                    log.error("Error while opening lrn sourcefile! Saving wasn't possible!!!");
                    e.printStackTrace();
                } catch (IOException e) {
//                    MyHelperClass log = new MyHelperClass();
                    log.error("Error while creating lrn destfile! Creating wasn't possible!!!");
                    e.printStackTrace();
                }
//                MyHelperClass EsomMapper = new MyHelperClass();
                this.setProperty(EsomMapper.PROPERTY_LRN_FILE, dst.getName());
//                MyHelperClass log = new MyHelperClass();
                log.debug("done saving lrn file");
            }
        }
//        MyHelperClass EsomMapper = new MyHelperClass();
        if (this.getProperty(EsomMapper.PROPERTY_WTS_RADIO_SELECTED) == EsomMapper.RADIO_LOAD_SELECTED) {
//            MyHelperClass EsomMapper = new MyHelperClass();
            File src = new File(this.getProperty(EsomMapper.PROPERTY_WTS_FILE));
            if (src.getParent() != folder.getPath()) {
                MyHelperClass log = new MyHelperClass();
                log.debug("saving wts file in save folder " + folder.getPath());
//                MyHelperClass actInstance = new MyHelperClass();
                File dst = new File(folder.getAbsolutePath() + File.separator + src.getName() + String.valueOf(actInstance));
                try {
                    FileReader fr = new FileReader(src);
                    BufferedReader br = new BufferedReader(fr);
                    dst.createNewFile();
                    FileWriter fw = new FileWriter(dst);
                    BufferedWriter bw = new BufferedWriter(fw);
                    int i = 0;
                    while ((i = br.read()) != -1) bw.write(i);
                    bw.flush();
                    bw.close();
                    br.close();
                    fr.close();
                } catch (FileNotFoundException e) {
//                    MyHelperClass log = new MyHelperClass();
                    log.error("Error while opening wts sourcefile! Saving wasn't possible!!!");
                    e.printStackTrace();
                } catch (IOException e) {
//                    MyHelperClass log = new MyHelperClass();
                    log.error("Error while creating wts destfile! Creating wasn't possible!!!");
                    e.printStackTrace();
                }
//                MyHelperClass EsomMapper = new MyHelperClass();
                this.setProperty(EsomMapper.PROPERTY_WTS_FILE, dst.getName());
//                MyHelperClass log = new MyHelperClass();
                log.debug("done saving wts file");
            }
        }
//        MyHelperClass EsomMapper = new MyHelperClass();
        if (this.getProperty(EsomMapper.PROPERTY_LRN_RADIO_SELECTED) == EsomMapper.RADIO_SELECT_FROM_DATANAV_SELECTED) {
//            MyHelperClass EsomMapper = new MyHelperClass();
            this.setProperty(EsomMapper.PROPERTY_LRN_FILE, "EsomMapper" + this.actInstance + ".lrn");
//            MyHelperClass EsomMapper = new MyHelperClass();
            File dst = new File(folder + File.separator + this.getProperty(EsomMapper.PROPERTY_LRN_FILE));
            try {
                FileWriter fw = new FileWriter(dst);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("# EsomMapper LRN save file\n");
                bw.write("% " + this.inputVectors.getNumRows() + "\n");
                bw.write("% " + this.inputVectors.getNumCols() + "\n");
                bw.write("% 9");
                for (IColumn col : this.inputVectors.getColumns()) {
                    if (col.getType() == IClusterNumber.class) bw.write("\t2"); else if (col.getType() == String.class) bw.write("\t8"); else bw.write("\t1");
                }
                bw.write("\n% Key");
                for (IColumn col : this.inputVectors.getColumns()) {
                    bw.write("\t" + col.getLabel());
                }
                bw.write("\n");
                int keyIterator = 0;
                for (Vector<Object> row : this.inputVectors.getGrid()) {
                    bw.write(this.inputVectors.getKey(keyIterator++).toString());
                    for (Object point : row) bw.write("\t" + point.toString());
                    bw.write("\n");
                }
                bw.flush();
                fw.flush();
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.setProperty(EsomMapper.PROPERTY_LRN_RADIO_SELECTED, EsomMapper.RADIO_LOAD_SELECTED);
        }
        if (this.getProperty(EsomMapper.PROPERTY_WTS_RADIO_SELECTED) == EsomMapper.RADIO_SELECT_FROM_DATANAV_SELECTED) {
            this.setProperty(EsomMapper.PROPERTY_WTS_FILE, "EsomMapper" + this.actInstance + ".wts");
            MyRetina tempRetina = new MyRetina(this.outputRetina.getNumRows(), this.outputRetina.getNumCols(), this.outputRetina.getDim(), this.outputRetina.getDistanceFunction(), this.outputRetina.isToroid());
            for (int row = 0; row < this.outputRetina.getNumRows(); row++) {
                for (int col = 0; col < this.outputRetina.getNumCols(); col++) {
                    for (int dim = 0; dim < this.outputRetina.getDim(); dim++) {
                        tempRetina.setNeuron(row, col, dim, this.outputRetina.getPointasDoubleArray(row, col)[dim]);
                    }
                }
            }
            EsomIO.writeWTSFile(folder + File.separator + this.getProperty(EsomMapper.PROPERTY_WTS_FILE), tempRetina);
            this.setProperty(EsomMapper.PROPERTY_WTS_RADIO_SELECTED, EsomMapper.RADIO_LOAD_SELECTED);
        }
        EsomMapper.instance++;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RADIO_SELECT_FROM_DATANAV_SELECTED;
	public MyHelperClass PROPERTY_LRN_RADIO_SELECTED;
	public MyHelperClass PROPERTY_INSTANCE;
	public MyHelperClass PROPERTY_LRN_FILE;
	public MyHelperClass instance;
	public MyHelperClass RADIO_LOAD_SELECTED;
	public MyHelperClass PROPERTY_WTS_FILE;
	public MyHelperClass PROPERTY_WTS_RADIO_SELECTED;
public MyHelperClass getColumns(){ return null; }
	public MyHelperClass getPointasDoubleArray(int o0, int o1){ return null; }
	public MyHelperClass getNumCols(){ return null; }
	public MyHelperClass isToroid(){ return null; }
	public MyHelperClass getKey(int o0){ return null; }
	public MyHelperClass getNumRows(){ return null; }
	public MyHelperClass getDim(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getDistanceFunction(){ return null; }
	public MyHelperClass getGrid(){ return null; }}

class IClusterNumber {

}

class MyRetina {

}

class IColumn {

}
