import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3375715 {
public MyHelperClass TIPO_DA_ACAO;
	public MyHelperClass VALOR_DO_PROVENTO;
	public MyHelperClass ULTIMO_DIA_COM;
	public MyHelperClass NOME_DE_PREGAO;
	public MyHelperClass DATA_DA_APROVACAO;
	public MyHelperClass DATA_DO_ULTIMO_PRECO_COM;
	public MyHelperClass ULTIMO_PRECO_COM;
	public MyHelperClass PROVENTO_POR_PRECO;
	public MyHelperClass PRECO_POR_1_OU_1000_ACOES;
	public MyHelperClass PROVENTO_POR_1_OU_1000_ACOES;
	public MyHelperClass TIPO_DO_PROVENTO;

    public void importarHistoricoDeProventos(File pArquivoXLS, boolean pFiltrarPelaDataDeCorteDoCabecalho, Andamento pAndamento) throws Throwable, IOException, SQLException, InvalidFormatException {
        int iLinha = -1;
        String nomeDaColuna = "";
        Statement stmtLimpezaInicialDestino = null;
        OraclePreparedStatement stmtDestino = null;
        try {
            MyHelperClass WorkbookFactory = new MyHelperClass();
            Workbook arquivo =(Workbook)(Object) WorkbookFactory.create(new FileInputStream(pArquivoXLS));
            Sheet plan1 =(Sheet)(Object) arquivo.getSheetAt(0);
            int QUANTIDADE_DE_REGISTROS_DE_METADADOS = 2;
            int quantidadeDeRegistrosEstimada =(int)(Object) plan1.getPhysicalNumberOfRows() - QUANTIDADE_DE_REGISTROS_DE_METADADOS;
            String vNomeDePregao, vTipoDaAcao, vDataDaAprovacao, vTipoDoProvento, vDataDoUltimoPrecoCom;
            BigDecimal vValorDoProvento, vUltimoPrecoCom, vProventoPorPreco;
            int vProventoPor1Ou1000Acoes, vPrecoPor1Ou1000Acoes;
            java.sql.Date vUltimoDiaCom;
            DateFormat formatadorData =(DateFormat)(Object) new SimpleDateFormat("yyyyMMdd");
            MyHelperClass DateFormat = new MyHelperClass();
            DateFormat formatadorPadraoData =(DateFormat)(Object) DateFormat.getDateInstance();
            Row registro;
            Cell celula;
            java.util.Date dataLimite =(Date)(Object) plan1.getRow(0).getCell(NOME_DE_PREGAO.ordinal()).getDateCellValue();
            Cell celulaUltimoDiaCom;
            java.util.Date tmpUltimoDiaCom;
            MyHelperClass conDestino = new MyHelperClass();
            stmtLimpezaInicialDestino =(Statement)(Object) conDestino.createStatement();
            String sql = "TRUNCATE TABLE TMP_TB_PROVENTO_EM_DINHEIRO";
            stmtLimpezaInicialDestino.executeUpdate(sql);
            sql = "INSERT INTO TMP_TB_PROVENTO_EM_DINHEIRO(NOME_DE_PREGAO, TIPO_DA_ACAO, DATA_DA_APROVACAO, VALOR_DO_PROVENTO, PROVENTO_POR_1_OU_1000_ACOES, TIPO_DO_PROVENTO, ULTIMO_DIA_COM, DATA_DO_ULTIMO_PRECO_COM, ULTIMO_PRECO_COM, PRECO_POR_1_OU_1000_ACOES, PERC_PROVENTO_POR_PRECO) VALUES(:NOME_DE_PREGAO, :TIPO_DA_ACAO, :DATA_DA_APROVACAO, :VALOR_DO_PROVENTO, :PROVENTO_POR_1_OU_1000_ACOES, :TIPO_DO_PROVENTO, :ULTIMO_DIA_COM, :DATA_DO_ULTIMO_PRECO_COM, :ULTIMO_PRECO_COM, :PRECO_POR_1_OU_1000_ACOES, :PERC_PROVENTO_POR_PRECO)";
//            MyHelperClass conDestino = new MyHelperClass();
            stmtDestino = (OraclePreparedStatement)(OraclePreparedStatement)(Object) conDestino.prepareStatement(sql);
            MyHelperClass COMANDOS_POR_LOTE = new MyHelperClass();
            stmtDestino.setExecuteBatch(COMANDOS_POR_LOTE);
            int quantidadeDeRegistrosImportados = 0;
            final int NUMERO_DA_LINHA_INICIAL = 1;
            for (iLinha = NUMERO_DA_LINHA_INICIAL; true; iLinha++) {
                registro =(Row)(Object) plan1.getRow(iLinha);
                if (registro != null) {
                    nomeDaColuna = ULTIMO_DIA_COM.toString();
                    celulaUltimoDiaCom =(Cell)(Object) registro.getCell(ULTIMO_DIA_COM.ordinal());
                    if (celulaUltimoDiaCom != null) {
                        MyHelperClass Cell = new MyHelperClass();
                        if (celulaUltimoDiaCom.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                            tmpUltimoDiaCom =(Date)(Object) celulaUltimoDiaCom.getDateCellValue();
                            if (tmpUltimoDiaCom.compareTo(dataLimite) <= 0 || !pFiltrarPelaDataDeCorteDoCabecalho) {
                                vUltimoDiaCom = new java.sql.Date((long)(Object)celulaUltimoDiaCom.getDateCellValue().getTime());
                                nomeDaColuna = NOME_DE_PREGAO.toString();
                                vNomeDePregao =(String)(Object) registro.getCell(NOME_DE_PREGAO.ordinal()).getStringCellValue().trim();
                                nomeDaColuna = TIPO_DA_ACAO.toString();
                                vTipoDaAcao =(String)(Object) registro.getCell(TIPO_DA_ACAO.ordinal()).getStringCellValue().trim();
                                nomeDaColuna = DATA_DA_APROVACAO.toString();
                                celula =(Cell)(Object) registro.getCell(DATA_DA_APROVACAO.ordinal());
                                try {
                                    java.util.Date tmpDataDaAprovacao;
//                                    MyHelperClass Cell = new MyHelperClass();
                                    if (celula.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                                        tmpDataDaAprovacao =(Date)(Object) celula.getDateCellValue();
                                    } else {
                                        tmpDataDaAprovacao =(Date)(Object) formatadorPadraoData.parse(celula.getStringCellValue());
                                    }
                                    vDataDaAprovacao =(String)(Object) formatadorData.format(tmpDataDaAprovacao);
                                } catch (ParseException ex) {
                                    vDataDaAprovacao =(String)(Object) celula.getStringCellValue();
                                }
                                nomeDaColuna = VALOR_DO_PROVENTO.toString();
                                vValorDoProvento = new BigDecimal(String.valueOf(registro.getCell(VALOR_DO_PROVENTO.ordinal()).getNumericCellValue()));
                                nomeDaColuna = PROVENTO_POR_1_OU_1000_ACOES.toString();
                                vProventoPor1Ou1000Acoes = (int)(int)(Object) registro.getCell(PROVENTO_POR_1_OU_1000_ACOES.ordinal()).getNumericCellValue();
                                nomeDaColuna = TIPO_DO_PROVENTO.toString();
                                vTipoDoProvento =(String)(Object) registro.getCell(TIPO_DO_PROVENTO.ordinal()).getStringCellValue().trim();
                                nomeDaColuna = DATA_DO_ULTIMO_PRECO_COM.toString();
                                celula =(Cell)(Object) registro.getCell(DATA_DO_ULTIMO_PRECO_COM.ordinal());
                                if (celula != null) {
                                    try {
                                        java.util.Date tmpDataDoUltimoPrecoCom;
//                                        MyHelperClass Cell = new MyHelperClass();
                                        if (celula.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                                            tmpDataDoUltimoPrecoCom =(Date)(Object) celula.getDateCellValue();
                                        } else {
                                            tmpDataDoUltimoPrecoCom =(Date)(Object) formatadorPadraoData.parse(celula.getStringCellValue());
                                        }
                                        vDataDoUltimoPrecoCom =(String)(Object) formatadorData.format(tmpDataDoUltimoPrecoCom);
                                    } catch (ParseException ex) {
                                        vDataDoUltimoPrecoCom =(String)(Object) celula.getStringCellValue().trim();
                                    }
                                } else {
                                    vDataDoUltimoPrecoCom = "";
                                }
                                nomeDaColuna = ULTIMO_PRECO_COM.toString();
                                vUltimoPrecoCom = new BigDecimal(String.valueOf(registro.getCell(ULTIMO_PRECO_COM.ordinal()).getNumericCellValue()));
                                nomeDaColuna = PRECO_POR_1_OU_1000_ACOES.toString();
                                vPrecoPor1Ou1000Acoes = (int)(int)(Object) registro.getCell(PRECO_POR_1_OU_1000_ACOES.ordinal()).getNumericCellValue();
                                nomeDaColuna = PROVENTO_POR_PRECO.toString();
                                celula =(Cell)(Object) registro.getCell(PROVENTO_POR_PRECO.ordinal());
//                                MyHelperClass Cell = new MyHelperClass();
                                if (celula != null && celula.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                                    vProventoPorPreco = new BigDecimal(String.valueOf(celula.getNumericCellValue()));
                                } else {
                                    vProventoPorPreco = null;
                                }
                                stmtDestino.clearParameters();
                                stmtDestino.setStringAtName("NOME_DE_PREGAO", vNomeDePregao);
                                stmtDestino.setStringAtName("TIPO_DA_ACAO", vTipoDaAcao);
                                stmtDestino.setStringAtName("DATA_DA_APROVACAO", vDataDaAprovacao);
                                stmtDestino.setBigDecimalAtName("VALOR_DO_PROVENTO", vValorDoProvento);
                                stmtDestino.setIntAtName("PROVENTO_POR_1_OU_1000_ACOES", vProventoPor1Ou1000Acoes);
                                stmtDestino.setStringAtName("TIPO_DO_PROVENTO", vTipoDoProvento);
                                stmtDestino.setDateAtName("ULTIMO_DIA_COM", vUltimoDiaCom);
                                stmtDestino.setStringAtName("DATA_DO_ULTIMO_PRECO_COM", vDataDoUltimoPrecoCom);
                                stmtDestino.setBigDecimalAtName("ULTIMO_PRECO_COM", vUltimoPrecoCom);
                                stmtDestino.setIntAtName("PRECO_POR_1_OU_1000_ACOES", vPrecoPor1Ou1000Acoes);
                                stmtDestino.setBigDecimalAtName("PERC_PROVENTO_POR_PRECO", vProventoPorPreco);
                                int contagemDasInsercoes =(int)(Object) stmtDestino.executeUpdate();
                                quantidadeDeRegistrosImportados++;
                            }
                        }
                    } else {
                        break;
                    }
                    double percentualCompleto = (double) quantidadeDeRegistrosImportados / quantidadeDeRegistrosEstimada * 100;
                    pAndamento.setPercentualCompleto((int) percentualCompleto);
                } else {
                    break;
                }
            }
//            MyHelperClass conDestino = new MyHelperClass();
            conDestino.commit();
        } catch (Exception ex) {
            MyHelperClass conDestino = new MyHelperClass();
            conDestino.rollback();
            ProblemaNaImportacaoDeArquivo problemaDetalhado = new ProblemaNaImportacaoDeArquivo();
            problemaDetalhado.nomeDoArquivo =(MyHelperClass)(Object) pArquivoXLS.getName();
            problemaDetalhado.linhaProblematicaDoArquivo =(MyHelperClass)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) iLinha + 1;
            problemaDetalhado.colunaProblematicaDoArquivo =(MyHelperClass)(Object) nomeDaColuna;
            problemaDetalhado.detalhesSobreOProblema =(MyHelperClass)(Object) ex;
            throw(Throwable)(Object) problemaDetalhado;
        } finally {
            pAndamento.setPercentualCompleto(100);
            if (stmtLimpezaInicialDestino != null && (!(Boolean)(Object)stmtLimpezaInicialDestino.isClosed())) {
                stmtLimpezaInicialDestino.close();
            }
            if (stmtDestino != null && (!(Boolean)(Object)stmtDestino.isClosed())) {
                stmtDestino.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CELL_TYPE_NUMERIC;
public MyHelperClass ordinal(){ return null; }
	public MyHelperClass getStringCellValue(){ return null; }
	public MyHelperClass getDateCellValue(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass getCell(MyHelperClass o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass getNumericCellValue(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass create(FileInputStream o0){ return null; }
	public MyHelperClass getDateInstance(){ return null; }}

class Andamento {

public MyHelperClass setPercentualCompleto(int o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class InvalidFormatException extends Exception{
	public InvalidFormatException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass isClosed(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class OraclePreparedStatement {

public MyHelperClass clearParameters(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setBigDecimalAtName(String o0, BigDecimal o1){ return null; }
	public MyHelperClass setStringAtName(String o0, String o1){ return null; }
	public MyHelperClass setDateAtName(String o0, Date o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setIntAtName(String o0, int o1){ return null; }
	public MyHelperClass isClosed(){ return null; }
	public MyHelperClass setExecuteBatch(MyHelperClass o0){ return null; }}

class Workbook {

public MyHelperClass getSheetAt(int o0){ return null; }}

class Sheet {

public MyHelperClass getPhysicalNumberOfRows(){ return null; }
	public MyHelperClass getRow(int o0){ return null; }}

class DateFormat {

public MyHelperClass format(Date o0){ return null; }
	public MyHelperClass parse(MyHelperClass o0){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}}

class Row {

public MyHelperClass getCell(MyHelperClass o0){ return null; }}

class Cell {

public MyHelperClass getNumericCellValue(){ return null; }
	public MyHelperClass getCellType(){ return null; }
	public MyHelperClass getDateCellValue(){ return null; }
	public MyHelperClass getStringCellValue(){ return null; }}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class ProblemaNaImportacaoDeArquivo {
public MyHelperClass detalhesSobreOProblema;
	public MyHelperClass nomeDoArquivo;
	public MyHelperClass linhaProblematicaDoArquivo;
	public MyHelperClass colunaProblematicaDoArquivo;
}
