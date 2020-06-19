import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3375722 {

    public void importarSetor(File pArquivoXLS, String pCabecalhoSetor, Andamento pAndamento) throws Throwable, FileNotFoundException, IOException, SQLException, InvalidFormatException {
        int iLinha = -1;
        Statement stmtLimpezaInicialDestino = null;
        OraclePreparedStatement stmtDestino = null;
        try {
            MyHelperClass WorkbookFactory = new MyHelperClass();
            Workbook arquivo =(Workbook)(Object) WorkbookFactory.create(new FileInputStream(pArquivoXLS));
            Sheet plan1 =(Sheet)(Object) arquivo.getSheetAt(0);
            int QUANTIDADE_DE_REGISTROS_DE_CABECALHO = 7;
            int QUANTIDADE_DE_REGISTROS_DE_RODAPE = 14;
            int QUANTIDADE_DE_REGISTROS_DE_METADADOS = QUANTIDADE_DE_REGISTROS_DE_CABECALHO + QUANTIDADE_DE_REGISTROS_DE_RODAPE;
            int quantidadeDeRegistrosEstimada =(int)(Object) plan1.getPhysicalNumberOfRows() - QUANTIDADE_DE_REGISTROS_DE_METADADOS;
            String vSetor = "", vSubsetor = "", vSegmento = "";
            LinhaDaPlanilhaDosSetores registroAtual;
            int vPapeisPorSegmento = 0;
            MyHelperClass conDestino = new MyHelperClass();
            stmtLimpezaInicialDestino =(Statement)(Object) conDestino.createStatement();
            String sql = "TRUNCATE TABLE TMP_TB_SETOR_SUBSETOR_SEGMENTO";
            stmtLimpezaInicialDestino.executeUpdate(sql);
            sql = "INSERT INTO TMP_TB_SETOR_SUBSETOR_SEGMENTO(SIGLA_EMPRESA, NOME_SETOR, NOME_SUBSETOR, NOME_SEGMENTO) VALUES(:SIGLA_EMPRESA, :NOME_SETOR, :NOME_SUBSETOR, :NOME_SEGMENTO)";
//            MyHelperClass conDestino = new MyHelperClass();
            stmtDestino = (OraclePreparedStatement)(OraclePreparedStatement)(Object) conDestino.prepareStatement(sql);
            MyHelperClass COMANDOS_POR_LOTE = new MyHelperClass();
            stmtDestino.setExecuteBatch(COMANDOS_POR_LOTE);
            int quantidadeDeRegistrosImportados = 0;
            iLinha = 8;
            while (true) {
                registroAtual = new LinhaDaPlanilhaDosSetores(plan1.getRow(iLinha));
                if ((int)(Object)registroAtual.nomeDoSetor.length() > 0 && !(Boolean)(Object)registroAtual.nomeDoSetor.equalsIgnoreCase(pCabecalhoSetor)) {
                    if ((boolean)(Object)registroAtual.nomeDoSubsetor.equalsIgnoreCase("")) {
                        break;
                    } else {
                        vSetor =(String)(Object) registroAtual.nomeDoSetor;
                        vSubsetor = null;
                        vSegmento = null;
                    }
                }
                if ((int)(Object)registroAtual.nomeDoSubsetor.length() > 0 && !(Boolean)(Object)registroAtual.nomeDoSetor.equalsIgnoreCase(pCabecalhoSetor)) {
                    vSubsetor =(String)(Object) registroAtual.nomeDoSubsetor;
                    vSegmento = null;
                }
                String nomeDoSegmento =(String)(Object) registroAtual.nomeDoSegmentoOuDaEmpresa;
                if (nomeDoSegmento.length() > 0 && !(Boolean)(Object)registroAtual.nomeDoSetor.equalsIgnoreCase(pCabecalhoSetor) && registroAtual.siglaDaEmpresa.equals("")) {
                    if (vSegmento != null && vPapeisPorSegmento == 0) {
                        vSegmento = vSegmento + " " + nomeDoSegmento;
                    } else {
                        vSegmento = nomeDoSegmento;
                    }
                    vPapeisPorSegmento = 0;
                }
                String nomeDaEmpresa =(String)(Object) registroAtual.nomeDoSegmentoOuDaEmpresa;
                if ((int)(Object)registroAtual.siglaDaEmpresa.length() == 4 && !(Boolean)(Object)registroAtual.nomeDoSetor.equalsIgnoreCase(pCabecalhoSetor) && !nomeDaEmpresa.equals("")) {
                    String vCodneg =(String)(Object) registroAtual.siglaDaEmpresa;
                    stmtDestino.clearParameters();
                    stmtDestino.setStringAtName("SIGLA_EMPRESA", vCodneg);
                    stmtDestino.setStringAtName("NOME_SETOR", vSetor);
                    stmtDestino.setStringAtName("NOME_SUBSETOR", vSubsetor);
                    stmtDestino.setStringAtName("NOME_SEGMENTO", vSegmento);
                    int contagemDasInsercoes =(int)(Object) stmtDestino.executeUpdate();
                    quantidadeDeRegistrosImportados++;
                    vPapeisPorSegmento++;
                }
                iLinha++;
                double percentualCompleto = (double) quantidadeDeRegistrosImportados / quantidadeDeRegistrosEstimada * 100;
                pAndamento.setPercentualCompleto((int) percentualCompleto);
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

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass create(FileInputStream o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }}

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

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setStringAtName(String o0, String o1){ return null; }
	public MyHelperClass clearParameters(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass isClosed(){ return null; }
	public MyHelperClass setExecuteBatch(MyHelperClass o0){ return null; }}

class Workbook {

public MyHelperClass getSheetAt(int o0){ return null; }}

class Sheet {

public MyHelperClass getPhysicalNumberOfRows(){ return null; }
	public MyHelperClass getRow(int o0){ return null; }}

class LinhaDaPlanilhaDosSetores {
public MyHelperClass nomeDoSegmentoOuDaEmpresa;
	public MyHelperClass nomeDoSetor;
	public MyHelperClass siglaDaEmpresa;
	public MyHelperClass nomeDoSubsetor;
LinhaDaPlanilhaDosSetores(MyHelperClass o0){}
	LinhaDaPlanilhaDosSetores(){}}

class ProblemaNaImportacaoDeArquivo {
public MyHelperClass detalhesSobreOProblema;
	public MyHelperClass nomeDoArquivo;
	public MyHelperClass linhaProblematicaDoArquivo;
}
