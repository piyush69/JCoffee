import java.io.*;
import java.lang.*;
import java.util.*;



class c11617413 {
public MyHelperClass con;
	public MyHelperClass Funcoes;
	public MyHelperClass montaAnalises(){ return null; }

    private boolean postCorrecao() {
        boolean valido = false;
        Integer newCodCorrecao = null;
        String sqlmaxac = "SELECT MAX(SEQAC) FROM PPOPACAOCORRET WHERE CODEMP=? AND CODFILIAL=? AND CODOP=? AND SEQOP=?";
        String sqlmaxcq = "SELECT MAX(SEQOPCQ) + 1 FROM PPOPCQ WHERE CODEMP=? AND CODFILIAL=? AND CODOP=? AND SEQOP=?";
        try {
            MyHelperClass analises = new MyHelperClass();
            for (Entry ek :(Entry[])(Object) (Object[])(Object)analises.entrySet()) {
                JCheckBoxPad cb =(JCheckBoxPad)(Object) ek.getValue();
                if ("S".equals(cb.getVlrString())) {
                    valido = true;
MyHelperClass[] keysItens = new MyHelperClass[5];
                    keysItens[2] = ek.getKey();
                    break;
                }
            }
            if (!valido) {
                MyHelperClass Funcoes = new MyHelperClass();
                Funcoes.mensagemInforma(this, "Selecione as analises para aplicar a corre��o!");
                return false;
            }
            MyHelperClass txaCausa = new MyHelperClass();
            if ((int)(Object)txaCausa.getVlrString().trim().length() == 0) {
                MyHelperClass Funcoes = new MyHelperClass();
                Funcoes.mensagemInforma(this, "Informe as causas!");
                return false;
            }
            MyHelperClass txaAcao = new MyHelperClass();
            if ((int)(Object)txaAcao.getVlrString().trim().length() == 0) {
                MyHelperClass Funcoes = new MyHelperClass();
                Funcoes.mensagemInforma(this, "Detalhe a a��o corretiva!");
                return false;
            }
            MyHelperClass con = new MyHelperClass();
            PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement(sqlmaxac);
            MyHelperClass Aplicativo = new MyHelperClass();
            ps.setInt(1,(Integer)(Object) Aplicativo.iCodEmp);
            MyHelperClass ListaCampos = new MyHelperClass();
            ps.setInt(2,(Integer)(Object) ListaCampos.getMasterFilial("PPOPACAOCORRET"));
            MyHelperClass txtCodOP = new MyHelperClass();
            ps.setInt(3,(Integer)(Object) txtCodOP.getVlrInteger());
            MyHelperClass txtSeqOP = new MyHelperClass();
            ps.setInt(4,(Integer)(Object) txtSeqOP.getVlrInteger());
            ResultSet rs =(ResultSet)(Object) ps.executeQuery();
            if ((boolean)(Object)rs.next()) {
                newCodCorrecao =(int)(Object) rs.getInt(1) + 1;
MyHelperClass[] keysItens = new MyHelperClass[5];
                keysItens[3] =(MyHelperClass)(Object) newCodCorrecao;
            }
            rs.close();
            ps.close();
            if (newCodCorrecao != null) {
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO PPOPACAOCORRET ");
                sql.append("( CODEMP, CODFILIAL, CODOP, SEQOP, SEQAC, TPCAUSA, OBSCAUSA, TPACAO, OBSACAO ) ");
                sql.append("VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )");
//                MyHelperClass con = new MyHelperClass();
                ps =(PreparedStatement)(Object) con.prepareStatement(sql.toString());
//                MyHelperClass Aplicativo = new MyHelperClass();
                ps.setInt(1,(Integer)(Object) Aplicativo.iCodEmp);
//                MyHelperClass ListaCampos = new MyHelperClass();
                ps.setInt(2,(Integer)(Object) ListaCampos.getMasterFilial("PPOPACAOCORRET"));
//                MyHelperClass txtCodOP = new MyHelperClass();
                ps.setInt(3,(Integer)(Object) txtCodOP.getVlrInteger());
//                MyHelperClass txtSeqOP = new MyHelperClass();
                ps.setInt(4,(Integer)(Object) txtSeqOP.getVlrInteger());
                ps.setInt(5, newCodCorrecao);
                MyHelperClass m = new MyHelperClass();
                ps.setString(6, m.getCode());
//                MyHelperClass txaCausa = new MyHelperClass();
                ps.setString(7, txaCausa.getVlrString());
                MyHelperClass rgSolucao = new MyHelperClass();
                ps.setString(8, rgSolucao.getVlrString());
//                MyHelperClass txaAcao = new MyHelperClass();
                ps.setString(9, txaAcao.getVlrString());
                ps.execute();
                ps.close();
                String strAnalises = "";
//                MyHelperClass analises = new MyHelperClass();
                for (Entry ek :(Entry[])(Object) (Object[])(Object)analises.entrySet()) {
                    JCheckBoxPad cb =(JCheckBoxPad)(Object) ek.getValue();
                    if ("S".equals(cb.getVlrString())) {
                        if (strAnalises.trim().length() > 0) {
                            strAnalises += ",";
                        }
                        strAnalises += String.valueOf(ek.getKey());
                    }
                }
                sql = new StringBuilder();
                sql.append("UPDATE PPOPCQ SET SEQAC=? ");
                sql.append("WHERE CODEMP=? AND CODFILIAL=? AND CODOP=? AND SEQOP=? AND SEQOPCQ IN ( " + strAnalises + " )");
//                MyHelperClass con = new MyHelperClass();
                ps =(PreparedStatement)(Object) con.prepareStatement(sql.toString());
                ps.setInt(1, newCodCorrecao);
//                MyHelperClass Aplicativo = new MyHelperClass();
                ps.setInt(2,(Integer)(Object) Aplicativo.iCodEmp);
//                MyHelperClass ListaCampos = new MyHelperClass();
                ps.setInt(3,(Integer)(Object) ListaCampos.getMasterFilial("PPOPACAOCORRET"));
//                MyHelperClass txtCodOP = new MyHelperClass();
                ps.setInt(4,(Integer)(Object) txtCodOP.getVlrInteger());
//                MyHelperClass txtSeqOP = new MyHelperClass();
                ps.setInt(5,(Integer)(Object) txtSeqOP.getVlrInteger());
                ps.executeUpdate();
                ps.close();
                sql.delete(0, sql.length());
                sql.append("INSERT INTO PPOPCQ (CODEMP,CODFILIAL,CODOP,SEQOP,SEQOPCQ,");
                sql.append("CODEMPEA,CODFILIALEA,CODESTANALISE) ");
                sql.append("SELECT CODEMP,CODFILIAL,CODOP,SEQOP,(");
                sql.append(sqlmaxcq);
                sql.append("),CODEMPEA,CODFILIALEA,CODESTANALISE ");
                sql.append("FROM PPOPCQ ");
                sql.append("WHERE CODEMP=? AND CODFILIAL=? AND CODOP=? AND ");
                sql.append("SEQOP=? AND SEQOPCQ IN ( " + strAnalises + " )");
                System.out.println(sql.toString());
//                MyHelperClass con = new MyHelperClass();
                ps =(PreparedStatement)(Object) con.prepareStatement(sql.toString());
//                MyHelperClass con = new MyHelperClass();
                ps =(PreparedStatement)(Object) con.prepareStatement(sql.toString());
//                MyHelperClass Aplicativo = new MyHelperClass();
                ps.setInt(1,(Integer)(Object) Aplicativo.iCodEmp);
//                MyHelperClass ListaCampos = new MyHelperClass();
                ps.setInt(2,(Integer)(Object) ListaCampos.getMasterFilial("PPOPCQ"));
//                MyHelperClass txtCodOP = new MyHelperClass();
                ps.setInt(3,(Integer)(Object) txtCodOP.getVlrInteger());
//                MyHelperClass txtSeqOP = new MyHelperClass();
                ps.setInt(4,(Integer)(Object) txtSeqOP.getVlrInteger());
//                MyHelperClass Aplicativo = new MyHelperClass();
                ps.setInt(5,(Integer)(Object) Aplicativo.iCodEmp);
//                MyHelperClass ListaCampos = new MyHelperClass();
                ps.setInt(6,(Integer)(Object) ListaCampos.getMasterFilial("PPOPCQ"));
//                MyHelperClass txtCodOP = new MyHelperClass();
                ps.setInt(7,(Integer)(Object) txtCodOP.getVlrInteger());
//                MyHelperClass txtSeqOP = new MyHelperClass();
                ps.setInt(8,(Integer)(Object) txtSeqOP.getVlrInteger());
                ps.executeUpdate();
                ps.close();
                montaAnalises();
                Funcoes.mensagemInforma(this, "A��o corretiva aplicada com sucesso!");
            }
            con.commit();
        } catch (Exception err) {
            try {
                con.rollback();
            } catch (UncheckedIOException e) {
                System.out.println("Erro ao realizar rollback!\n" + err.getMessage());
            }
            err.printStackTrace();
            Funcoes.mensagemErro(this, "Erro ao atualizar analises!\n" + err.getMessage(), true, con, err);
            valido = false;
        }
        return valido;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] keysItens;
	public MyHelperClass iCodEmp;
public MyHelperClass trim(){ return null; }
	public MyHelperClass entrySet(){ return null; }
	public MyHelperClass mensagemInforma(c11617413 o0, String o1){ return null; }
	public MyHelperClass getVlrString(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass mensagemErro(c11617413 o0, String o1, boolean o2, MyHelperClass o3, Exception o4){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass getMasterFilial(String o0){ return null; }
	public MyHelperClass getCode(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass getVlrInteger(){ return null; }}

class JCheckBoxPad {

public MyHelperClass getVlrString(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, Integer o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass execute(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Entry {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass getKey(){ return null; }}
