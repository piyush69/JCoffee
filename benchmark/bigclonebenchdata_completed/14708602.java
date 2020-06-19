
import java.io.UncheckedIOException;


class c14708602 {
public MyHelperClass VLRFATURADO;
	public MyHelperClass QDTPENDENTE;
	public MyHelperClass VLRCOMIS;
	public MyHelperClass PERCCOMIS;
	public MyHelperClass ITEM;
	public MyHelperClass QTDFATURADA;

    private void gerarFaturamento() {
        MyHelperClass Funcoes = new MyHelperClass();
        int opt =(int)(Object) Funcoes.mensagemConfirma(null, "Confirma o faturamento?");
        MyHelperClass JOptionPane = new MyHelperClass();
        if (opt == (int)(Object)JOptionPane.OK_OPTION) {
            StringBuilder insert = new StringBuilder();
            insert.append("INSERT INTO RPFATURAMENTO ");
            insert.append("(CODEMP, CODFILIAL, CODPED, CODITPED, ");
            insert.append("QTDFATURADO, VLRFATURADO, QTDPENDENTE, ");
            insert.append("PERCCOMISFAT, VLRCOMISFAT, DTFATURADO ) ");
            insert.append("VALUES");
            insert.append("(?,?,?,?,?,?,?,?,?,?)");
            PreparedStatement ps;
            int parameterIndex;
            try {
                MyHelperClass tab = new MyHelperClass();
                for (int i = 0; i < (int)(Object)tab.getNumLinhas(); i++) {
                    parameterIndex = 1;
                    MyHelperClass con = new MyHelperClass();
                    ps =(PreparedStatement)(Object) con.prepareStatement(insert.toString());
                    MyHelperClass AplicativoRep = new MyHelperClass();
                    ps.setInt(parameterIndex++,(Integer)(Object) AplicativoRep.iCodEmp);
                    MyHelperClass ListaCampos = new MyHelperClass();
                    ps.setInt(parameterIndex++,(Integer)(Object) ListaCampos.getMasterFilial("RPFATURAMENTO"));
                    MyHelperClass txtCodPed = new MyHelperClass();
                    ps.setInt(parameterIndex++,(Integer)(Object) txtCodPed.getVlrInteger());
                    ps.setInt(parameterIndex++, (Integer)(Integer)(Object) tab.getValor(i, ITEM.ordinal()));
                    ps.setBigDecimal(parameterIndex++, (BigDecimal)(BigDecimal)(Object) tab.getValor(i, QTDFATURADA.ordinal()));
                    ps.setBigDecimal(parameterIndex++, (BigDecimal)(BigDecimal)(Object) tab.getValor(i, VLRFATURADO.ordinal()));
                    ps.setBigDecimal(parameterIndex++, (BigDecimal)(BigDecimal)(Object) tab.getValor(i, QDTPENDENTE.ordinal()));
                    ps.setBigDecimal(parameterIndex++, (BigDecimal)(BigDecimal)(Object) tab.getValor(i, PERCCOMIS.ordinal()));
                    ps.setBigDecimal(parameterIndex++, (BigDecimal)(BigDecimal)(Object) tab.getValor(i, VLRCOMIS.ordinal()));
                    MyHelperClass Calendar = new MyHelperClass();
                    ps.setDate(parameterIndex++, Funcoes.dateToSQLDate(Calendar.getInstance().getTime()));
                    ps.executeUpdate();
                }
                MyHelperClass gerarFaturamento = new MyHelperClass();
                gerarFaturamento.setEnabled(false);
                MyHelperClass gerarComissao = new MyHelperClass();
                gerarComissao.setEnabled(true);
                MyHelperClass txtCodPed = new MyHelperClass();
                Funcoes.mensagemInforma(null, "Faturamento criado para pedido " + txtCodPed.getVlrInteger());
                MyHelperClass con = new MyHelperClass();
                con.commit();
            } catch (Exception e) {
                e.printStackTrace();
//                MyHelperClass Funcoes = new MyHelperClass();
                Funcoes.mensagemErro(this, "Erro ao gerar faturamento!\n" + e.getMessage());
                try {
                    MyHelperClass con = new MyHelperClass();
                    con.rollback();
                } catch (UncheckedIOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OK_OPTION;
	public MyHelperClass iCodEmp;
public MyHelperClass mensagemConfirma(Object o0, String o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass getMasterFilial(String o0){ return null; }
	public MyHelperClass getVlrInteger(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass mensagemErro(c14708602 o0, String o1){ return null; }
	public MyHelperClass getNumLinhas(){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass mensagemInforma(Object o0, String o1){ return null; }
	public MyHelperClass dateToSQLDate(MyHelperClass o0){ return null; }
	public MyHelperClass getValor(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass ordinal(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class PreparedStatement {

public MyHelperClass setDate(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, Integer o1){ return null; }
	public MyHelperClass setBigDecimal(int o0, BigDecimal o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class BigDecimal {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
