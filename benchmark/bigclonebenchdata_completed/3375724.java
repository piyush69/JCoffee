import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3375724 {
public MyHelperClass CONJUNTO_DE_CARACTERES_DOS_ARQUIVOS_TEXTO_DA_BOVESPA;
	public MyHelperClass CNPJ;
	public MyHelperClass NOME;
	public MyHelperClass DATA_CRIACAO;
	public MyHelperClass SIGLA;

    public void importarEmissoresDosTitulosFinanceiros(File pArquivoTXT, Andamento pAndamento) throws Throwable, FileNotFoundException, SQLException {
        int numeroDoRegistro = -1;
        Scanner in = null;
        MyHelperClass conDestino = new MyHelperClass();
        Statement stmtLimpezaInicialDestino =(Statement)(Object) conDestino.createStatement();
        String sql = "TRUNCATE TABLE TMP_TB_EMISSOR_TITULO";
        stmtLimpezaInicialDestino.executeUpdate(sql);
        sql = "INSERT INTO TMP_TB_EMISSOR_TITULO(SIGLA, NOME, CNPJ, DATA_CRIACAO) VALUES(:SIGLA, :NOME, :CNPJ, :DATA_CRIACAO)";
//        MyHelperClass conDestino = new MyHelperClass();
        OraclePreparedStatement stmtDestino = (OraclePreparedStatement)(OraclePreparedStatement)(Object) conDestino.prepareStatement(sql);
        MyHelperClass COMANDOS_POR_LOTE = new MyHelperClass();
        stmtDestino.setExecuteBatch(COMANDOS_POR_LOTE);
        final int TAMANHO_DO_CABECALHO_DO_ARQUIVO = 0;
        final int TAMANHO_DO_RODAPE_DO_ARQUIVO = 0;
        final int TAMANHO_DOS_METADADOS_DO_ARQUIVO = TAMANHO_DO_CABECALHO_DO_ARQUIVO + TAMANHO_DO_RODAPE_DO_ARQUIVO;
        final int TAMANHO_MEDIO_POR_REGISTRO = 81;
        long tamanhoDosArquivos = pArquivoTXT.length();
        int quantidadeDeRegistrosEstimada = (int) (tamanhoDosArquivos - TAMANHO_DOS_METADADOS_DO_ARQUIVO) / TAMANHO_MEDIO_POR_REGISTRO;
        String registro;
        String[] campos;
        try {
            in = new Scanner((InputStream)(Object)(Readable)(Object)(InputStream)(Object)(Readable)(Object)new FileInputStream(pArquivoTXT),(java.util.regex.Pattern)(Object)(Pattern)(Object) CONJUNTO_DE_CARACTERES_DOS_ARQUIVOS_TEXTO_DA_BOVESPA.name());
            int quantidadeDeRegistrosImportada = 0;
            numeroDoRegistro = 0;
            String vSIGLA, vNOME;
            BigDecimal vCNPJ;
            java.sql.Date vDATA_CRIACAO;
            MyHelperClass CampoDoArquivoDosEmissoresDeTitulosFinanceiros = new MyHelperClass();
            final int QTDE_CAMPOS =(int)(Object) CampoDoArquivoDosEmissoresDeTitulosFinanceiros.values().length;
            final String SEPARADOR_DE_CAMPOS_DO_REGISTRO = ",";
            final String DELIMITADOR_DE_CAMPOS_DO_REGISTRO = "\"";
            while (in.hasNextLine()) {
                ++numeroDoRegistro;
                registro = in.nextLine();
                stmtDestino.clearParameters();
                registro = registro.substring(1, registro.length() - 1);
                if (registro.endsWith(DELIMITADOR_DE_CAMPOS_DO_REGISTRO)) {
                    registro = registro + " ";
                }
                campos = registro.split(DELIMITADOR_DE_CAMPOS_DO_REGISTRO + SEPARADOR_DE_CAMPOS_DO_REGISTRO + DELIMITADOR_DE_CAMPOS_DO_REGISTRO);
                int quantidadeDeCamposEncontradosIncluindoOsVazios = campos.length;
                if (quantidadeDeCamposEncontradosIncluindoOsVazios != QTDE_CAMPOS) {
                    throw(Throwable)(Object) new CampoMalDelimitadoEmRegistroDoArquivoImportado(registro);
                }
                vSIGLA = campos[(int)(Object)SIGLA.ordinal()];
                vNOME = campos[(int)(Object)NOME.ordinal()];
                String cnpjTmp = campos[(int)(Object)CNPJ.ordinal()];
                if (cnpjTmp != null && cnpjTmp.trim().length() > 0) {
                    vCNPJ = new BigDecimal(cnpjTmp);
                } else {
                    vCNPJ = null;
                }
                String dataDaCriacaoTmp = campos[(int)(Object)DATA_CRIACAO.ordinal()];
                if (dataDaCriacaoTmp != null && dataDaCriacaoTmp.trim().length() > 0) {
                    int dia = Integer.parseInt(dataDaCriacaoTmp.substring(6, 8)), mes = Integer.parseInt(dataDaCriacaoTmp.substring(4, 6)) - 1, ano = Integer.parseInt(dataDaCriacaoTmp.substring(0, 4));
                    Calendar calendario = Calendar.getInstance();
                    calendario.clear();
                    calendario.set(ano, mes, dia);
                    vDATA_CRIACAO = new java.sql.Date(calendario.getTimeInMillis());
                } else {
                    vDATA_CRIACAO = null;
                }
                stmtDestino.setStringAtName("SIGLA", vSIGLA);
                stmtDestino.setStringAtName("NOME", vNOME);
                stmtDestino.setBigDecimalAtName("CNPJ", vCNPJ);
                stmtDestino.setDateAtName("DATA_CRIACAO", vDATA_CRIACAO);
                int contagemDasInsercoes =(int)(Object) stmtDestino.executeUpdate();
                quantidadeDeRegistrosImportada++;
                double percentualCompleto = (double) quantidadeDeRegistrosImportada / quantidadeDeRegistrosEstimada * 100;
                pAndamento.setPercentualCompleto((int) percentualCompleto);
            }
//            MyHelperClass conDestino = new MyHelperClass();
            conDestino.commit();
        } catch (Exception ex) {
//            MyHelperClass conDestino = new MyHelperClass();
            conDestino.rollback();
            ProblemaNaImportacaoDeArquivo problemaDetalhado = new ProblemaNaImportacaoDeArquivo();
            problemaDetalhado.nomeDoArquivo =(MyHelperClass)(Object) pArquivoTXT.getName();
            problemaDetalhado.linhaProblematicaDoArquivo =(MyHelperClass)(Object) numeroDoRegistro;
            problemaDetalhado.detalhesSobreOProblema =(MyHelperClass)(Object) ex;
            throw(Throwable)(Object) problemaDetalhado;
        } finally {
            pAndamento.setPercentualCompleto(100);
            in.close();
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
public MyHelperClass length;
public MyHelperClass name(){ return null; }
	public MyHelperClass ordinal(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass values(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class Andamento {

public MyHelperClass setPercentualCompleto(int o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
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
	public MyHelperClass isClosed(){ return null; }
	public MyHelperClass setExecuteBatch(MyHelperClass o0){ return null; }}

class CampoMalDelimitadoEmRegistroDoArquivoImportado {

CampoMalDelimitadoEmRegistroDoArquivoImportado(String o0){}
	CampoMalDelimitadoEmRegistroDoArquivoImportado(){}}

class ProblemaNaImportacaoDeArquivo {
public MyHelperClass detalhesSobreOProblema;
	public MyHelperClass nomeDoArquivo;
	public MyHelperClass linhaProblematicaDoArquivo;
}

class Pattern {

}
