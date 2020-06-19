


class c22382481 {
public MyHelperClass SetFee(double[] o0, MyHelperClass o1, String o2, double o3){ return null; }
	public MyHelperClass WriteTerm(String o0, String o1, double[] o2, PreparedStatement o3){ return null; }
public MyHelperClass CARD_THEM;
	public MyHelperClass CARD_BA;
	public MyHelperClass CARD_US;
	public MyHelperClass cnProd;
	public MyHelperClass Log;
	public MyHelperClass FeeZero(double[] o0){ return null; }

    public boolean ReadFile() {
        boolean ret = false;
        FilenameFilter FileFilter = null;
        MyHelperClass fDir = new MyHelperClass();
        File dir = new File(fDir);
        String[] FeeFiles;
        int Lines = 0;
        BufferedReader FeeFile = null;
        PreparedStatement DelSt = null, InsSt = null;
        String Line = null, Term = null, CurTerm = null, TermType = null, Code = null;
        MyHelperClass US_D = new MyHelperClass();
        double[] Fee = new double[(int)(Object)US_D + 1];
        double FeeAm = 0;
        String UpdateSt = "INSERT INTO reporter.term_fee (TERM, TERM_TYPE, THEM_VC,	THEM_VE, THEM_EC, THEM_EE, THEM_D," + "BA_VC, BA_VE, BA_EC, BA_EE, BA_D," + "US_VC, US_VE, US_EC, US_EE, US_D)" + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            FileFilter = new FilenameFilter() {

                public boolean accept(File dir, String name) {
                    MyHelperClass fFileMask = new MyHelperClass();
                    if ((boolean)(Object)(new File(dir, name)).isDirectory()) return false; else return (name.matches((String)(Object)fFileMask));
                }
            };
            FeeFiles =(String[])(Object) dir.list(FileFilter);
            java.util.Arrays.sort(FeeFiles);
            System.out.println(FeeFiles[FeeFiles.length - 1] + " " + (new SimpleDateFormat("dd.MM.yy HH:mm:ss")).format(new Date()));
//            MyHelperClass fDir = new MyHelperClass();
            Log.info(String.format("Load = %1s", fDir + FeeFiles[FeeFiles.length - 1]));
//            MyHelperClass fDir = new MyHelperClass();
            FeeFile = new BufferedReader(new FileReader(fDir + FeeFiles[FeeFiles.length - 1]));
            FeeZero(Fee);
            DelSt =(PreparedStatement)(Object) cnProd.prepareStatement("delete from reporter.term_fee");
            DelSt.executeUpdate();
            InsSt =(PreparedStatement)(Object) cnProd.prepareStatement(UpdateSt);
            WriteTerm(FeeFiles[FeeFiles.length - 1] + " " + (new SimpleDateFormat("dd.MM.yy HH:mm:ss")).format(new Date()), "XXX", Fee, InsSt);
            while ((Line =(String)(Object) FeeFile.readLine()) != null) {
                Lines++;
                if (!Line.matches("\\d{15}\\s+��������.+")) continue;
                Term = Line.substring(7, 15);
                if ((CurTerm == null) || !Term.equals(CurTerm)) {
                    if (CurTerm != null) {
                        WriteTerm(CurTerm, TermType, Fee, InsSt);
                    }
                    CurTerm = Term;
                    if (Line.indexOf("���") > 0) TermType = "���"; else TermType = "���";
                    FeeZero(Fee);
                }
                Code = Line.substring(64, 68).trim().toUpperCase();
                if (Code.equals("ST") || Code.equals("AC") || Code.equals("8110") || Code.equals("8160")) continue;
                FeeAm = new Double(Line.substring(140, 160)).doubleValue();
                if (Line.indexOf("�� ����� ������") > 0) SetFee(Fee, CARD_THEM, Code, FeeAm); else if (Line.indexOf("�� ������ �����") > 0) SetFee(Fee, CARD_BA, Code, FeeAm); else if (Line.indexOf("�� ������ ��") > 0) SetFee(Fee, CARD_US, Code, FeeAm); else throw new Exception("������ ���� ����.:" + Line);
            }
            WriteTerm(CurTerm, TermType, Fee, InsSt);
            cnProd.commit();
            ret = true;
        } catch (Exception e) {
            System.out.printf("Err = %1s\r\n", e.getMessage());
            Log.error(String.format("Err = %1s", e.getMessage()));
            Log.error(String.format("Line = %1s", Line));
            try {
                cnProd.rollback();
            } catch (Exception ee) {
            }
            ;
        } finally {
            try {
                if (FeeFile != null) FeeFile.close();
            } catch (Exception ee) {
            }
        }
        try {
            if (DelSt != null) DelSt.close();
            if (InsSt != null) InsSt.close();
            cnProd.setAutoCommit(true);
        } catch (Exception ee) {
        }
        Log.info(String.format("Lines = %1d", Lines));
        return (ret);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class FilenameFilter {

}

class File {

File(){}
	File(MyHelperClass o0){}
	File(File o0, String o1){}
	public MyHelperClass list(FilenameFilter o0){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Date {

}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass format(Date o0){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}
