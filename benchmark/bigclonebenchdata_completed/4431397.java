import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4431397 {
public MyHelperClass insereSaldo(int o0, int o1, MyHelperClass o2, MyHelperClass o3, double o4){ return null; }
public MyHelperClass con;
	public MyHelperClass bRunProcesso;
	public MyHelperClass btProcessar;
	public MyHelperClass Funcoes;
	public MyHelperClass Aplicativo;
	public MyHelperClass ListaCampos;
	public MyHelperClass state(String o0){ return null; }

    private void processar()  throws Throwable {
        boolean bOK = false;
        String sSQL = "DELETE FROM FNSALDOLANCA WHERE CODEMP=? AND CODFILIAL=?";
        try {
            state("Excluindo base atual de saldos...");
            PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement(sSQL);
            ps.setInt(1, Aplicativo.iCodEmp);
            ps.setInt(2, ListaCampos.getMasterFilial("FNSALDOLANCA"));
            ps.executeUpdate();
            ps.close();
            state("Base excluida...");
            bOK = true;
        } catch (ArithmeticException err) {
            Funcoes.mensagemErro(this, "Erro ao excluir os saldos!\n" + err.getMessage(), true, con,(SQLException)(Object) err);
            err.printStackTrace();
        }
        if (bOK) {
            bOK = false;
            sSQL = "SELECT CODPLAN,DATASUBLANCA,SUM(VLRSUBLANCA) VLRSUBLANCA FROM " + "FNSUBLANCA WHERE CODEMP=? AND CODFILIAL=? GROUP BY CODPLAN,DATASUBLANCA " + "ORDER BY CODPLAN,DATASUBLANCA";
            try {
                state("Iniciando reconstru��o...");
                PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement(sSQL);
                ps.setInt(1, Aplicativo.iCodEmp);
                ps.setInt(2, ListaCampos.getMasterFilial("FNLANCA"));
                ResultSet rs =(ResultSet)(Object) ps.executeQuery();
                String sPlanAnt = "";
                double dSaldo = 0;
                bOK = true;
                int iFilialPlan =(int)(Object) ListaCampos.getMasterFilial("FNPLANEJAMENTO");
                int iFilialSaldo =(int)(Object) ListaCampos.getMasterFilial("FNSALDOLANCA");
                while ((boolean)(Object)rs.next() && bOK) {
                    if ("1010100000004".equals(rs.getString("CodPlan"))) {
                        System.out.println("Debug");
                    }
                    if (sPlanAnt.equals(rs.getString("CodPlan"))) {
                        dSaldo += (double)(Object)rs.getDouble("VLRSUBLANCA");
                    } else dSaldo =(double)(Object) rs.getDouble("VLRSUBLANCA");
                    bOK =(boolean)(Object) insereSaldo(iFilialSaldo, iFilialPlan, rs.getString("CodPlan"), rs.getDate("DataSubLanca"), dSaldo);
                    sPlanAnt =(String)(Object) rs.getString("CodPlan");
                    if ("1010100000004".equals(sPlanAnt)) {
                        System.out.println("Debug");
                    }
                }
                ps.close();
                state("Aguardando grava��o final...");
            } catch (ArrayIndexOutOfBoundsException err) {
                bOK = false;
                Funcoes.mensagemErro(this, "Erro ao excluir os lan�amentos!\n" + err.getMessage(), true, con,(SQLException)(Object) err);
                err.printStackTrace();
            }
        }
        try {
            if (bOK) {
                con.commit();
                state("Registros processados com sucesso!");
            } else {
                state("Registros antigos restaurados!");
                con.rollback();
            }
        } catch (ArrayStoreException err) {
            Funcoes.mensagemErro(this, "Erro ao relizar precedimento!\n" + err.getMessage(), true, con,(SQLException)(Object) err);
            err.printStackTrace();
        }
        bRunProcesso =(MyHelperClass)(Object) false;
        btProcessar.setEnabled(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass iCodEmp;
public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass getMasterFilial(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass mensagemErro(c4431397 o0, String o1, boolean o2, MyHelperClass o3, SQLException o4){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ResultSet {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getDouble(String o0){ return null; }
	public MyHelperClass getDate(String o0){ return null; }
	public MyHelperClass next(){ return null; }}
