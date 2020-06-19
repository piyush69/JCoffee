


class c3375718 {
public MyHelperClass obterCotacoesPendentesDoDolar(Andamento o0){ return null; }

    public void importarHistoricoDeCotacoesDoDolar(Andamento pAndamento) throws FileNotFoundException, SQLException, Exception {
        pAndamento.delimitarIntervaloDeVariacao(0, 49);
        WSValorSerieVO[] cotacoesPendentesDoDolar =(WSValorSerieVO[])(Object) obterCotacoesPendentesDoDolar(pAndamento);
        pAndamento.delimitarIntervaloDeVariacao(50, 100);
        if (cotacoesPendentesDoDolar != null && cotacoesPendentesDoDolar.length > 0) {
            String sql = "INSERT INTO tmp_TB_COTACAO_DOLAR(DATA, PRECO) VALUES(:DATA, :PRECO)";
            MyHelperClass conDestino = new MyHelperClass();
            OraclePreparedStatement stmtDestino = (OraclePreparedStatement)(OraclePreparedStatement)(Object) conDestino.prepareStatement(sql);
            MyHelperClass COMANDOS_POR_LOTE = new MyHelperClass();
            stmtDestino.setExecuteBatch(COMANDOS_POR_LOTE);
            int quantidadeDeRegistrosASeremImportados = cotacoesPendentesDoDolar.length;
            try {
                int quantidadeDeRegistrosImportados = 0;
                int numeroDoRegistro = 0;
                for (WSValorSerieVO cotacaoPendenteDoDolar : cotacoesPendentesDoDolar) {
                    ++numeroDoRegistro;
                    stmtDestino.clearParameters();
                    int ano =(int)(Object) cotacaoPendenteDoDolar.getAno(), mes =(int)(Object) cotacaoPendenteDoDolar.getMes() - 1, dia =(int)(Object) cotacaoPendenteDoDolar.getDia();
                    MyHelperClass Calendar = new MyHelperClass();
                    Calendar calendario =(Calendar)(Object) Calendar.getInstance();
                    calendario.clear();
                    calendario.set(ano, mes, dia);
                    java.sql.Date vDATA = new java.sql.Date((long)(Object)calendario.getTimeInMillis());
                    BigDecimal vPRECO =(BigDecimal)(Object) cotacaoPendenteDoDolar.getValor();
                    stmtDestino.setDateAtName("DATA",(Date)(Object) vDATA);
                    stmtDestino.setBigDecimalAtName("PRECO", vPRECO);
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

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Andamento {

public MyHelperClass delimitarIntervaloDeVariacao(int o0, int o1){ return null; }
	public MyHelperClass setPercentualCompleto(int o0){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class WSValorSerieVO {

public MyHelperClass getValor(){ return null; }
	public MyHelperClass getAno(){ return null; }
	public MyHelperClass getMes(){ return null; }
	public MyHelperClass getDia(){ return null; }}

class OraclePreparedStatement {

public MyHelperClass isClosed(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setExecuteBatch(MyHelperClass o0){ return null; }
	public MyHelperClass setDateAtName(String o0, Date o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass clearParameters(){ return null; }
	public MyHelperClass setBigDecimalAtName(String o0, BigDecimal o1){ return null; }}

class Calendar {

public MyHelperClass getTimeInMillis(){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass set(int o0, int o1, int o2){ return null; }}

class BigDecimal {

}

class Date {

}
