import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3375716 {

    public void importarBancoDeDadosDARI(File pArquivoXLS, Andamento pAndamento) throws Throwable, IOException, SQLException, InvalidFormatException {
        final String ABA_VALOR_DE_MERCADO = "Valor de Mercado";
        final int COLUNA_DATA = 1, COLUNA_ANO = 6, COLUNA_VALOR_DE_MERCADO_DIARIO_EM_BILHOES_DE_REAIS = 2, COLUNA_VALOR_DE_MERCADO_DIARIO_EM_BILHOES_DE_DOLARES = 3, COLUNA_VALOR_DE_MERCADO_ANUAL_EM_BILHOES_DE_REAIS = 7, COLUNA_VALOR_DE_MERCADO_ANUAL_EM_BILHOES_DE_DOLARES = 8;
        final BigDecimal BILHAO = new BigDecimal("1000000000");
        int iLinha = -1;
        Statement stmtLimpezaInicialDestino = null;
        OraclePreparedStatement stmtDestino = null;
        try {
            MyHelperClass WorkbookFactory = new MyHelperClass();
            Workbook arquivo =(Workbook)(Object) WorkbookFactory.create(new FileInputStream(pArquivoXLS));
            Sheet planilhaValorDeMercado =(Sheet)(Object) arquivo.getSheet(ABA_VALOR_DE_MERCADO);
            int QUANTIDADE_DE_REGISTROS_DE_METADADOS = 7;
            final Calendar DATA_INICIAL = Calendar.getInstance();
            DATA_INICIAL.setTime((Date)(Object)planilhaValorDeMercado.getRow(QUANTIDADE_DE_REGISTROS_DE_METADADOS).getCell(COLUNA_DATA).getDateCellValue());
            final int ANO_DA_DATA_INICIAL = DATA_INICIAL.get(Calendar.YEAR);
            final int ANO_INICIAL = Integer.parseInt((String)(Object)planilhaValorDeMercado.getRow(QUANTIDADE_DE_REGISTROS_DE_METADADOS).getCell(COLUNA_ANO).getStringCellValue());
            final int ANO_FINAL = Calendar.getInstance().get(Calendar.YEAR);
            Row registro;
            int quantidadeDeRegistrosAnuaisEstimada = (ANO_FINAL - ANO_INICIAL + 1), quantidadeDeRegistrosDiariosEstimada = ((int)(Object)planilhaValorDeMercado.getPhysicalNumberOfRows() - QUANTIDADE_DE_REGISTROS_DE_METADADOS);
            final int quantidadeDeRegistrosEstimada = quantidadeDeRegistrosAnuaisEstimada + quantidadeDeRegistrosDiariosEstimada;
            int vAno;
            BigDecimal vValorDeMercadoEmReais, vValorDeMercadoEmDolares;
            Cell celulaDoAno, celulaDoValorDeMercadoEmReais, celulaDoValorDeMercadoEmDolares;
            MyHelperClass conDestino = new MyHelperClass();
            stmtLimpezaInicialDestino =(Statement)(Object) conDestino.createStatement();
            String sql = "TRUNCATE TABLE TMP_TB_VALOR_MERCADO_BOLSA";
            stmtLimpezaInicialDestino.executeUpdate(sql);
            sql = "INSERT INTO TMP_TB_VALOR_MERCADO_BOLSA(DATA, VALOR_DE_MERCADO_REAL, VALOR_DE_MERCADO_DOLAR) VALUES(:DATA, :VALOR_DE_MERCADO_REAL, :VALOR_DE_MERCADO_DOLAR)";
//            MyHelperClass conDestino = new MyHelperClass();
            stmtDestino = (OraclePreparedStatement)(OraclePreparedStatement)(Object) conDestino.prepareStatement(sql);
            MyHelperClass COMANDOS_POR_LOTE = new MyHelperClass();
            stmtDestino.setExecuteBatch(COMANDOS_POR_LOTE);
            int quantidadeDeRegistrosImportados = 0;
            Calendar calendario = Calendar.getInstance();
            calendario.clear();
            calendario.set(Calendar.MONTH, Calendar.DECEMBER);
            calendario.set(Calendar.DAY_OF_MONTH, 31);
            for (iLinha = QUANTIDADE_DE_REGISTROS_DE_METADADOS; true; iLinha++) {
                registro =(Row)(Object) planilhaValorDeMercado.getRow(iLinha);
                celulaDoAno =(Cell)(Object) registro.getCell(COLUNA_ANO);
                String anoTmp =(String)(Object) celulaDoAno.getStringCellValue();
                if (anoTmp != null && anoTmp.length() > 0) {
                    vAno = Integer.parseInt(anoTmp);
                    if (vAno < ANO_DA_DATA_INICIAL) {
                        celulaDoValorDeMercadoEmReais =(Cell)(Object) registro.getCell(COLUNA_VALOR_DE_MERCADO_ANUAL_EM_BILHOES_DE_REAIS);
                        celulaDoValorDeMercadoEmDolares =(Cell)(Object) registro.getCell(COLUNA_VALOR_DE_MERCADO_ANUAL_EM_BILHOES_DE_DOLARES);
                    } else {
                        break;
                    }
                    calendario.set(Calendar.YEAR, vAno);
                    java.sql.Date vUltimoDiaDoAno = new java.sql.Date(calendario.getTimeInMillis());
                    vValorDeMercadoEmReais = new BigDecimal((char[])(Object)celulaDoValorDeMercadoEmReais.getNumericCellValue()).multiply(BILHAO).setScale(0, RoundingMode.DOWN);
                    vValorDeMercadoEmDolares = new BigDecimal((char[])(Object)celulaDoValorDeMercadoEmDolares.getNumericCellValue()).multiply(BILHAO).setScale(0, RoundingMode.DOWN);
                    stmtDestino.clearParameters();
                    stmtDestino.setDateAtName("DATA", vUltimoDiaDoAno);
                    stmtDestino.setBigDecimalAtName("VALOR_DE_MERCADO_REAL", vValorDeMercadoEmReais);
                    stmtDestino.setBigDecimalAtName("VALOR_DE_MERCADO_DOLAR", vValorDeMercadoEmDolares);
                    int contagemDasInsercoes =(int)(Object) stmtDestino.executeUpdate();
                    quantidadeDeRegistrosImportados++;
                } else {
                    break;
                }
                double percentualCompleto = (double) quantidadeDeRegistrosImportados / quantidadeDeRegistrosEstimada * 100;
                pAndamento.setPercentualCompleto((int) percentualCompleto);
            }
            java.util.Date dataAnterior = null;
            String dataTmp;
            MyHelperClass Constantes = new MyHelperClass();
            final DateFormat formatadorDeData_ddMMyyyy =(DateFormat)(Object) new SimpleDateFormat("dd/MM/yyyy", Constantes.IDIOMA_PORTUGUES_BRASILEIRO);
//            MyHelperClass Constantes = new MyHelperClass();
            final DateFormat formatadorDeData_ddMMMyyyy =(DateFormat)(Object) new SimpleDateFormat("dd/MMM/yyyy", Constantes.IDIOMA_PORTUGUES_BRASILEIRO);
            Cell celulaDaData;
            for (iLinha = QUANTIDADE_DE_REGISTROS_DE_METADADOS; true; iLinha++) {
                registro =(Row)(Object) planilhaValorDeMercado.getRow(iLinha);
                if (registro != null) {
                    celulaDaData =(Cell)(Object) registro.getCell(COLUNA_DATA);
                    java.util.Date data;
                    MyHelperClass Cell = new MyHelperClass();
                    if (celulaDaData.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                        data =(Date)(Object) celulaDaData.getDateCellValue();
                    } else {
                        dataTmp =(String)(Object) celulaDaData.getStringCellValue();
                        try {
                            data =(Date)(Object) formatadorDeData_ddMMyyyy.parse(dataTmp);
                        } catch (ArithmeticException ex) {
                            data =(Date)(Object) formatadorDeData_ddMMMyyyy.parse(dataTmp);
                        }
                    }
                    if (dataAnterior == null || data.after(dataAnterior)) {
                        celulaDoValorDeMercadoEmReais =(Cell)(Object) registro.getCell(COLUNA_VALOR_DE_MERCADO_DIARIO_EM_BILHOES_DE_REAIS);
                        celulaDoValorDeMercadoEmDolares =(Cell)(Object) registro.getCell(COLUNA_VALOR_DE_MERCADO_DIARIO_EM_BILHOES_DE_DOLARES);
                        java.sql.Date vData = new java.sql.Date(data.getTime());
                        vValorDeMercadoEmReais = new BigDecimal((char[])(Object)celulaDoValorDeMercadoEmReais.getNumericCellValue()).multiply(BILHAO).setScale(0, RoundingMode.DOWN);
                        vValorDeMercadoEmDolares = new BigDecimal((char[])(Object)celulaDoValorDeMercadoEmDolares.getNumericCellValue()).multiply(BILHAO).setScale(0, RoundingMode.DOWN);
                        stmtDestino.clearParameters();
                        stmtDestino.setDateAtName("DATA", vData);
                        stmtDestino.setBigDecimalAtName("VALOR_DE_MERCADO_REAL", vValorDeMercadoEmReais);
                        stmtDestino.setBigDecimalAtName("VALOR_DE_MERCADO_DOLAR", vValorDeMercadoEmDolares);
                        int contagemDasInsercoes =(int)(Object) stmtDestino.executeUpdate();
                        quantidadeDeRegistrosImportados++;
                        double percentualCompleto = (double) quantidadeDeRegistrosImportados / quantidadeDeRegistrosEstimada * 100;
                        pAndamento.setPercentualCompleto((int) percentualCompleto);
                    }
                    dataAnterior = data;
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
            problemaDetalhado.linhaProblematicaDoArquivo =(MyHelperClass)(Object) iLinha;
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
	public MyHelperClass IDIOMA_PORTUGUES_BRASILEIRO;
public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass create(FileInputStream o0){ return null; }
	public MyHelperClass getDateCellValue(){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getStringCellValue(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass getCell(int o0){ return null; }}

class Andamento {

public MyHelperClass setPercentualCompleto(int o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class InvalidFormatException extends Exception{
	public InvalidFormatException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass isClosed(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class OraclePreparedStatement {

public MyHelperClass setBigDecimalAtName(String o0, BigDecimal o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setExecuteBatch(MyHelperClass o0){ return null; }
	public MyHelperClass clearParameters(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass isClosed(){ return null; }
	public MyHelperClass setDateAtName(String o0, Date o1){ return null; }}

class Workbook {

public MyHelperClass getSheet(String o0){ return null; }}

class Sheet {

public MyHelperClass getPhysicalNumberOfRows(){ return null; }
	public MyHelperClass getRow(int o0){ return null; }}

class Row {

public MyHelperClass getCell(int o0){ return null; }}

class Cell {

public MyHelperClass getDateCellValue(){ return null; }
	public MyHelperClass getCellType(){ return null; }
	public MyHelperClass getNumericCellValue(){ return null; }
	public MyHelperClass getStringCellValue(){ return null; }}

class DateFormat {

public MyHelperClass parse(String o0){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0, MyHelperClass o1){}
	SimpleDateFormat(){}}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class ProblemaNaImportacaoDeArquivo {
public MyHelperClass detalhesSobreOProblema;
	public MyHelperClass nomeDoArquivo;
	public MyHelperClass linhaProblematicaDoArquivo;
}
