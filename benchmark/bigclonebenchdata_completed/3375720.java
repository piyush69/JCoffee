


class c3375720 {
public MyHelperClass obterUltimoDiaDoMes(MyHelperClass o0){ return null; }
public MyHelperClass obterValoresPendentesDoPIB(Andamento o0){ return null; }

    public void importarHistoricoDoPIB(Andamento pAndamento) throws FileNotFoundException, SQLException, Exception {
        pAndamento.delimitarIntervaloDeVariacao(0, 49);
        PIB[] valoresPendentesDoPIB =(PIB[])(Object) obterValoresPendentesDoPIB(pAndamento);
        pAndamento.delimitarIntervaloDeVariacao(50, 100);
        if (valoresPendentesDoPIB != null && valoresPendentesDoPIB.length > 0) {
            String sql = "INSERT INTO tmp_TB_PIB(ULTIMO_DIA_DO_MES, PIB_ACUM_12MESES_REAL, PIB_ACUM_12MESES_DOLAR) VALUES(:ULTIMO_DIA_DO_MES, :PIB_ACUM_12MESES_REAL, :PIB_ACUM_12MESES_DOLAR)";
            MyHelperClass conDestino = new MyHelperClass();
            OraclePreparedStatement stmtDestino = (OraclePreparedStatement)(OraclePreparedStatement)(Object) conDestino.prepareStatement(sql);
            MyHelperClass COMANDOS_POR_LOTE = new MyHelperClass();
            stmtDestino.setExecuteBatch(COMANDOS_POR_LOTE);
            int quantidadeDeRegistrosASeremImportados = valoresPendentesDoPIB.length;
            try {
                int quantidadeDeRegistrosImportados = 0;
                int numeroDoRegistro = 0;
                final BigDecimal MILHAO = new BigDecimal("1000000");
                for (PIB valorPendenteDoPIB : valoresPendentesDoPIB) {
                    ++numeroDoRegistro;
                    stmtDestino.clearParameters();
                    java.sql.Date vULTIMO_DIA_DO_MES = new java.sql.Date((long)(Object)obterUltimoDiaDoMes(valorPendenteDoPIB.mesEAno).getTime());
                    MyHelperClass RoundingMode = new MyHelperClass();
                    BigDecimal vPIB_ACUM_12MESES_REAL =(BigDecimal)(Object) valorPendenteDoPIB.valorDoPIBEmReais.multiply(MILHAO).setScale(0, RoundingMode.DOWN);
//                    MyHelperClass RoundingMode = new MyHelperClass();
                    BigDecimal vPIB_ACUM_12MESES_DOLAR =(BigDecimal)(Object) valorPendenteDoPIB.valorDoPIBEmDolares.multiply(MILHAO).setScale(0, RoundingMode.DOWN);
                    stmtDestino.setDateAtName("ULTIMO_DIA_DO_MES",(Date)(Object) vULTIMO_DIA_DO_MES);
                    stmtDestino.setBigDecimalAtName("PIB_ACUM_12MESES_REAL", vPIB_ACUM_12MESES_REAL);
                    stmtDestino.setBigDecimalAtName("PIB_ACUM_12MESES_DOLAR", vPIB_ACUM_12MESES_DOLAR);
                    int contagemDasInsercoes =(int)(Object) stmtDestino.executeUpdate();
                    quantidadeDeRegistrosImportados++;
                    double percentualCompleto = (double) quantidadeDeRegistrosImportados / quantidadeDeRegistrosASeremImportados * 100;
                    pAndamento.setPercentualCompleto((int) percentualCompleto);
                }
//                MyHelperClass conDestino = new MyHelperClass();
                conDestino.commit();
            } catch (Exception ex) {
//                MyHelperClass conDestino = new MyHelperClass();
                conDestino.rollback();
                throw ex;
            } finally {
                if (stmtDestino != null && (!(Boolean)(Object)stmtDestino.isClosed())) {
                    stmtDestino.close();
                }
            }
        }
        pAndamento.setPercentualCompleto(100);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DOWN;
public MyHelperClass commit(){ return null; }
	public MyHelperClass multiply(BigDecimal o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass setScale(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class Andamento {

public MyHelperClass delimitarIntervaloDeVariacao(int o0, int o1){ return null; }
	public MyHelperClass setPercentualCompleto(int o0){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PIB {
public MyHelperClass valorDoPIBEmReais;
	public MyHelperClass valorDoPIBEmDolares;
	public MyHelperClass mesEAno;
}

class OraclePreparedStatement {

public MyHelperClass isClosed(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setExecuteBatch(MyHelperClass o0){ return null; }
	public MyHelperClass setDateAtName(String o0, Date o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass clearParameters(){ return null; }
	public MyHelperClass setBigDecimalAtName(String o0, BigDecimal o1){ return null; }}

class BigDecimal {

BigDecimal(String o0){}
	BigDecimal(){}}

class Date {

}
