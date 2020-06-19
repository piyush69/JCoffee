
import java.io.UncheckedIOException;


class c14708603 {
public MyHelperClass VLRCOMIS;
	public MyHelperClass ITEM;
public MyHelperClass con;
	public MyHelperClass Funcoes;
	public MyHelperClass carregaTabela(){ return null; }

    private void gerarComissao() {
        MyHelperClass txtNomeVend = new MyHelperClass();
        int opt =(int)(Object) Funcoes.mensagemConfirma(null, "Confirma gerar comiss�es para o vendedor " + txtNomeVend.getVlrString().trim() + "?");
        MyHelperClass JOptionPane = new MyHelperClass();
        if (opt == (int)(Object)JOptionPane.OK_OPTION) {
            StringBuilder insert = new StringBuilder();
            insert.append("INSERT INTO RPCOMISSAO ");
            insert.append("(CODEMP, CODFILIAL, CODPED, CODITPED, ");
            insert.append("CODEMPVD, CODFILIALVD, CODVEND, VLRCOMISS ) ");
            insert.append("VALUES ");
            insert.append("(?,?,?,?,?,?,?,?)");
            PreparedStatement ps;
            int parameterIndex;
            boolean gerou = false;
            try {
                MyHelperClass tab = new MyHelperClass();
                for (int i = 0; i < (int)(Object)tab.getNumLinhas(); i++) {
//                    MyHelperClass tab = new MyHelperClass();
                    if ((int)(Object)((BigDecimal)(BigDecimal)(Object) tab.getValor(i, 8)).floatValue() > 0) {
                        parameterIndex = 1;
                        MyHelperClass con = new MyHelperClass();
                        ps =(PreparedStatement)(Object) con.prepareStatement(insert.toString());
                        MyHelperClass AplicativoRep = new MyHelperClass();
                        ps.setInt(parameterIndex++,(Integer)(Object) AplicativoRep.iCodEmp);
                        MyHelperClass ListaCampos = new MyHelperClass();
                        ps.setInt(parameterIndex++,(Integer)(Object) ListaCampos.getMasterFilial("RPCOMISSAO"));
                        MyHelperClass txtCodPed = new MyHelperClass();
                        ps.setInt(parameterIndex++,(Integer)(Object) txtCodPed.getVlrInteger());
                        ps.setInt(parameterIndex++, (Integer)(Integer)(Object) tab.getValor(i,(int)(Object) ITEM.ordinal()));
//                        MyHelperClass AplicativoRep = new MyHelperClass();
                        ps.setInt(parameterIndex++,(Integer)(Object) AplicativoRep.iCodEmp);
//                        MyHelperClass ListaCampos = new MyHelperClass();
                        ps.setInt(parameterIndex++,(Integer)(Object) ListaCampos.getMasterFilial("RPVENDEDOR"));
                        MyHelperClass txtCodVend = new MyHelperClass();
                        ps.setInt(parameterIndex++,(Integer)(Object) txtCodVend.getVlrInteger());
                        ps.setBigDecimal(parameterIndex++, (BigDecimal)(BigDecimal)(Object) tab.getValor(i,(int)(Object) VLRCOMIS.ordinal()));
                        ps.executeUpdate();
                        gerou = true;
                    }
                }
                if (gerou) {
//                    MyHelperClass txtNomeVend = new MyHelperClass();
                    Funcoes.mensagemInforma(null, "Comiss�o gerada para " + txtNomeVend.getVlrString().trim());
                    MyHelperClass txtCodPed = new MyHelperClass();
                    txtCodPed.setText("0");
                    MyHelperClass lcPedido = new MyHelperClass();
                    lcPedido.carregaDados();
                    carregaTabela();
                    con.commit();
                } else {
                    Funcoes.mensagemInforma(null, "N�o foi possiv�l gerar comiss�o!\nVerifique os valores das comiss�es dos itens.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                Funcoes.mensagemErro(this, "Erro ao gerar comiss�o!\n" + e.getMessage());
                try {
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
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass getNumLinhas(){ return null; }
	public MyHelperClass getValor(int o0, int o1){ return null; }
	public MyHelperClass mensagemInforma(Object o0, String o1){ return null; }
	public MyHelperClass getVlrString(){ return null; }
	public MyHelperClass carregaDados(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass ordinal(){ return null; }
	public MyHelperClass mensagemErro(c14708603 o0, String o1){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, Integer o1){ return null; }
	public MyHelperClass setBigDecimal(int o0, BigDecimal o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class BigDecimal {

public MyHelperClass floatValue(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
