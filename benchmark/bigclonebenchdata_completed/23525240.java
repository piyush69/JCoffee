
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23525240 {
public MyHelperClass ListaCampos;
	public MyHelperClass txtSeqOP;
	public MyHelperClass Funcoes;
	public MyHelperClass Aplicativo;
	public MyHelperClass con;
	public MyHelperClass txtCodOP;
	public MyHelperClass geraRMA(int o0){ return null; }
	public MyHelperClass buscaTipoMov(){ return null; }

    private void gravaOp(Vector op) {
        PreparedStatement ps = null;
        String sql = null;
        ResultSet rs = null;
        int seqop = 0;
        Date dtFabrOP = null;
        try {
            sql = "SELECT MAX(SEQOP) FROM PPOP WHERE CODEMP=? AND CODFILIAL=? AND CODOP=?";
            MyHelperClass con = new MyHelperClass();
            ps =(PreparedStatement)(Object) con.prepareStatement(sql);
            MyHelperClass Aplicativo = new MyHelperClass();
            ps.setInt(1, Aplicativo.iCodEmp);
            MyHelperClass ListaCampos = new MyHelperClass();
            ps.setInt(2, ListaCampos.getMasterFilial("PPOP"));
            MyHelperClass txtCodOP = new MyHelperClass();
            ps.setInt(3, txtCodOP.getVlrInteger().intValue());
            rs =(ResultSet)(Object) ps.executeQuery();
            if ((boolean)(Object)rs.next()) {
                seqop =(int)(Object) rs.getInt(1) + 1;
            }
            rs.close();
            ps.close();
//            MyHelperClass con = new MyHelperClass();
            con.commit();
            sql = "SELECT DTFABROP FROM PPOP WHERE CODEMP=? AND CODFILIAL=? AND CODOP=? AND SEQOP=?";
//            MyHelperClass con = new MyHelperClass();
            ps =(PreparedStatement)(Object) con.prepareStatement(sql);
//            MyHelperClass Aplicativo = new MyHelperClass();
            ps.setInt(1, Aplicativo.iCodEmp);
//            MyHelperClass ListaCampos = new MyHelperClass();
            ps.setInt(2, ListaCampos.getMasterFilial("PPOP"));
//            MyHelperClass txtCodOP = new MyHelperClass();
            ps.setInt(3, txtCodOP.getVlrInteger().intValue());
            MyHelperClass txtSeqOP = new MyHelperClass();
            ps.setInt(4, txtSeqOP.getVlrInteger().intValue());
            rs =(ResultSet)(Object) ps.executeQuery();
            if ((boolean)(Object)rs.next()) {
                dtFabrOP =(Date)(Object) rs.getDate(1);
            }
            rs.close();
            ps.close();
//            MyHelperClass con = new MyHelperClass();
            con.commit();
            sql = "INSERT INTO PPOP (CODEMP,CODFILIAL,CODOP,SEQOP,CODEMPPD,CODFILIALPD,CODPROD,SEQEST,DTFABROP," + "QTDPREVPRODOP,QTDFINALPRODOP,DTVALIDPDOP,CODEMPLE,CODFILIALLE,CODLOTE,CODEMPTM,CODFILIALTM,CODTIPOMOV," + "CODEMPAX,CODFILIALAX,CODALMOX,CODEMPOPM,CODFILIALOPM,CODOPM,SEQOPM,QTDDISTIOP,QTDSUGPRODOP)" + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//            MyHelperClass con = new MyHelperClass();
            ps =(PreparedStatement)(Object) con.prepareStatement(sql);
//            MyHelperClass Aplicativo = new MyHelperClass();
            ps.setInt(1, Aplicativo.iCodEmp);
//            MyHelperClass ListaCampos = new MyHelperClass();
            ps.setInt(2, ListaCampos.getMasterFilial("PPOP"));
//            MyHelperClass txtCodOP = new MyHelperClass();
            ps.setInt(3, txtCodOP.getVlrInteger().intValue());
            ps.setInt(4, seqop);
//            MyHelperClass Aplicativo = new MyHelperClass();
            ps.setInt(5, Aplicativo.iCodEmp);
//            MyHelperClass ListaCampos = new MyHelperClass();
            ps.setInt(6, ListaCampos.getMasterFilial("PPESTRUTURA"));
            ps.setInt(7, ((Integer)(Integer)(Object) op.elementAt(4)).intValue());
            ps.setInt(8, ((Integer)(Integer)(Object) op.elementAt(6)).intValue());
            ps.setDate(9, dtFabrOP);
            ps.setFloat(10,(int)(Object) ((BigDecimal)(BigDecimal)(Object) op.elementAt(7)).floatValue());
            ps.setFloat(11, 0);
            MyHelperClass Funcoes = new MyHelperClass();
            ps.setDate(12,(Date)(Object) (Funcoes.strDateToSqlDate((String)(String)(Object) op.elementAt(11))));
//            MyHelperClass Aplicativo = new MyHelperClass();
            ps.setInt(13, Aplicativo.iCodEmp);
//            MyHelperClass ListaCampos = new MyHelperClass();
            ps.setInt(14, ListaCampos.getMasterFilial("EQLOTE"));
            ps.setString(15, ((String)(String)(Object) op.elementAt(10)));
//            MyHelperClass Aplicativo = new MyHelperClass();
            ps.setInt(16, Aplicativo.iCodEmp);
//            MyHelperClass ListaCampos = new MyHelperClass();
            ps.setInt(17, ListaCampos.getMasterFilial("EQTIPOMOV"));
            ps.setInt(18, buscaTipoMov());
            ps.setInt(19, ((Integer)(Integer)(Object) op.elementAt(13)).intValue());
            ps.setInt(20, ((Integer)(Integer)(Object) op.elementAt(14)).intValue());
            ps.setInt(21, ((Integer)(Integer)(Object) op.elementAt(12)).intValue());
            ps.setInt(22, Aplicativo.iCodEmp);
            ps.setInt(23, ListaCampos.getMasterFilial("PPOP"));
            ps.setInt(24, txtCodOP.getVlrInteger().intValue());
            ps.setInt(25, txtSeqOP.getVlrInteger().intValue());
            ps.setFloat(26,(int)(Object) ((BigDecimal)(BigDecimal)(Object) op.elementAt(9)).floatValue());
            ps.setFloat(27,(int)(Object) ((BigDecimal)(BigDecimal)(Object) op.elementAt(7)).floatValue());
            ps.executeUpdate();
            ps.close();
            con.commit();
            geraRMA(seqop);
        } catch (UncheckedIOException e) {
            Funcoes.mensagemErro(null, "Erro ao gerar OP's de distribui��o!\n" + e.getMessage());
            try {
                con.rollback();
            } catch (UncheckedIOException eb) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass iCodEmp;
public MyHelperClass mensagemErro(Object o0, String o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass getVlrInteger(){ return null; }
	public MyHelperClass getMasterFilial(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass intValue(){ return null; }
	public MyHelperClass strDateToSqlDate(String o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class Vector {

public MyHelperClass elementAt(int o0){ return null; }}

class PreparedStatement {

public MyHelperClass setFloat(int o0, int o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setDate(int o0, Date o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getDate(int o0){ return null; }}

class Date {

}

class BigDecimal {

public MyHelperClass floatValue(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
