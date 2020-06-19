import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3375723 {
public MyHelperClass DATA_DA_ACAO;
	public MyHelperClass AUDITOR;
	public MyHelperClass UF;
	public MyHelperClass DENOMINACAO_ANTERIOR;
	public MyHelperClass TIPO_PAPEL5;
	public MyHelperClass BOLSA8;
	public MyHelperClass DDD;
	public MyHelperClass DENOMINACAO_COMERCIAL;
	public MyHelperClass QUANT_DE_ACOES_ORDINARIAS;
	public MyHelperClass TIPO_PAPEL1;
	public MyHelperClass BOLSA9;
	public MyHelperClass TIPO_NEGOCIO4;
	public MyHelperClass TIPO_NEGOCIO2;
	public MyHelperClass TIPO_NEGOCIO5;
	public MyHelperClass TIPO_MERCADO3;
	public MyHelperClass TELEFONE;
	public MyHelperClass SITUACAO;
	public MyHelperClass TIPO_PAPEL2;
	public MyHelperClass CONTROLE_ACIONARIO;
	public MyHelperClass TIPO_MERCADO5;
	public MyHelperClass PATRIMONIO_LIQUIDO;
	public MyHelperClass DATA_DE_REGISTRO;
	public MyHelperClass TIPO_NEGOCIO3;
	public MyHelperClass MOTIVO_DO_CANCELAMENTO;
	public MyHelperClass CNPJ;
	public MyHelperClass TIPO_PAPEL4;
	public MyHelperClass TIPO_NEGOCIO1;
	public MyHelperClass DATA_DO_PATRIMONIO;
	public MyHelperClass DATA_DO_CANCELAMENTO;
	public MyHelperClass BOLSA2;
	public MyHelperClass NOME_SETOR_ATIVIDADE;
	public MyHelperClass QUANT_DE_ACOES_PREF;
	public MyHelperClass LOGRADOURO;
	public MyHelperClass COMPLEMENTO;
	public MyHelperClass SETOR_ATIVIDADE;
	public MyHelperClass TIPO_MERCADO6;
	public MyHelperClass BOLSA7;
	public MyHelperClass E_MAIL;
	public MyHelperClass BOLSA1;
	public MyHelperClass BOLSA3;
	public MyHelperClass DATA_DA_SITUACAO;
	public MyHelperClass BOLSA4;
	public MyHelperClass TIPO_PAPEL6;
	public MyHelperClass TIPO_MERCADO2;
	public MyHelperClass BOLSA5;
	public MyHelperClass FAX;
	public MyHelperClass TIPO_MERCADO4;
	public MyHelperClass CEP;
	public MyHelperClass MERCADO;
	public MyHelperClass TIPO_PAPEL3;
	public MyHelperClass DENOMINACAO_SOCIAL;
	public MyHelperClass CONJUNTO_DE_CARACTERES_DO_ARQUIVO_TEXTO_DA_CVM;
	public MyHelperClass MUNICIPIO;
	public MyHelperClass TIPO_MERCADO1;
	public MyHelperClass DRI;
	public MyHelperClass TIPO_NEGOCIO6;
	public MyHelperClass CODIGO_CVM;
	public MyHelperClass BOLSA6;
	public MyHelperClass BAIRRO;

    public void importarEmpresasAbertas(File pArquivoTXT, Andamento pAndamento) throws Throwable, FileNotFoundException, SQLException {
        int numeroDoRegistro = -1;
        Scanner in = null;
        MyHelperClass conDestino = new MyHelperClass();
        Statement stmtLimpezaInicialDestino =(Statement)(Object) conDestino.createStatement();
        String sql = "TRUNCATE TABLE TMP_TB_CIA_ABERTA";
        stmtLimpezaInicialDestino.executeUpdate(sql);
        sql = "INSERT INTO TMP_TB_CIA_ABERTA(CODIGO_CVM, DENOMINACAO_SOCIAL, DENOMINACAO_COMERCIAL, LOGRADOURO, COMPLEMENTO, BAIRRO, CEP, MUNICIPIO, UF, DDD, TELEFONE, FAX, DENOMINACAO_ANTERIOR, SETOR_ATIVIDADE, CNPJ, DRI, AUDITOR, QUANT_DE_ACOES_ORDINARIAS, QUANT_DE_ACOES_PREF, SITUACAO, DATA_DA_SITUACAO, TIPO_PAPEL1, TIPO_PAPEL2, TIPO_PAPEL3, TIPO_PAPEL4, TIPO_PAPEL5, TIPO_PAPEL6, CONTROLE_ACIONARIO, DATA_DE_REGISTRO, DATA_DO_CANCELAMENTO, MERCADO, BOLSA1, BOLSA2, BOLSA3, BOLSA4, BOLSA5, BOLSA6, BOLSA7, BOLSA8, BOLSA9, MOTIVO_DO_CANCELAMENTO, PATRIMONIO_LIQUIDO, DATA_DO_PATRIMONIO, E_MAIL, NOME_SETOR_ATIVIDADE, DATA_DA_ACAO, TIPO_NEGOCIO1, TIPO_NEGOCIO2, TIPO_NEGOCIO3, TIPO_NEGOCIO4, TIPO_NEGOCIO5, TIPO_NEGOCIO6, TIPO_MERCADO1, TIPO_MERCADO2, TIPO_MERCADO3, TIPO_MERCADO4, TIPO_MERCADO5, TIPO_MERCADO6) VALUES(:CODIGO_CVM, :DENOMINACAO_SOCIAL, :DENOMINACAO_COMERCIAL, :LOGRADOURO, :COMPLEMENTO, :BAIRRO, :CEP, :MUNICIPIO, :UF, :DDD, :TELEFONE, :FAX, :DENOMINACAO_ANTERIOR, :SETOR_ATIVIDADE, :CNPJ, :DRI, :AUDITOR, :QUANT_DE_ACOES_ORDINARIAS, :QUANT_DE_ACOES_PREF, :SITUACAO, :DATA_DA_SITUACAO, :TIPO_PAPEL1, :TIPO_PAPEL2, :TIPO_PAPEL3, :TIPO_PAPEL4, :TIPO_PAPEL5, :TIPO_PAPEL6, :CONTROLE_ACIONARIO, :DATA_DE_REGISTRO, :DATA_DO_CANCELAMENTO, :MERCADO, :BOLSA1, :BOLSA2, :BOLSA3, :BOLSA4, :BOLSA5, :BOLSA6, :BOLSA7, :BOLSA8, :BOLSA9, :MOTIVO_DO_CANCELAMENTO, :PATRIMONIO_LIQUIDO, :DATA_DO_PATRIMONIO, :E_MAIL, :NOME_SETOR_ATIVIDADE, :DATA_DA_ACAO, :TIPO_NEGOCIO1, :TIPO_NEGOCIO2, :TIPO_NEGOCIO3, :TIPO_NEGOCIO4, :TIPO_NEGOCIO5, :TIPO_NEGOCIO6, :TIPO_MERCADO1, :TIPO_MERCADO2, :TIPO_MERCADO3, :TIPO_MERCADO4, :TIPO_MERCADO5, :TIPO_MERCADO6)";
//        MyHelperClass conDestino = new MyHelperClass();
        OraclePreparedStatement stmtDestino = (OraclePreparedStatement)(OraclePreparedStatement)(Object) conDestino.prepareStatement(sql);
        MyHelperClass COMANDOS_POR_LOTE = new MyHelperClass();
        stmtDestino.setExecuteBatch(COMANDOS_POR_LOTE);
        final int TAMANHO_DO_CABECALHO_DO_ARQUIVO = 707;
        final int TAMANHO_DO_RODAPE_DO_ARQUIVO = 0;
        final int TAMANHO_DOS_METADADOS_DO_ARQUIVO = TAMANHO_DO_CABECALHO_DO_ARQUIVO + TAMANHO_DO_RODAPE_DO_ARQUIVO;
        final int TAMANHO_MEDIO_POR_REGISTRO = 659;
        long tamanhoDosArquivos = pArquivoTXT.length();
        int quantidadeDeRegistrosEstimada = (int) (tamanhoDosArquivos - TAMANHO_DOS_METADADOS_DO_ARQUIVO) / TAMANHO_MEDIO_POR_REGISTRO;
        try {
            in = new Scanner((InputStream)(Object)(Readable)(Object)(InputStream)(Object)(Readable)(Object)new FileInputStream(pArquivoTXT),(java.util.regex.Pattern)(Object)(Pattern)(Object) CONJUNTO_DE_CARACTERES_DO_ARQUIVO_TEXTO_DA_CVM.name());
            int quantidadeDeRegistrosImportada = 0;
            String registro;
            String[] campos;
            in.nextLine();
            numeroDoRegistro = 0;
            int vCODIGO_CVM;
            String vDENOMINACAO_SOCIAL, vDENOMINACAO_COMERCIAL, vLOGRADOURO, vCOMPLEMENTO, vBAIRRO;
            BigDecimal vCEP;
            String vMUNICIPIO, vUF;
            BigDecimal vDDD, vTELEFONE, vFAX;
            String vDENOMINACAO_ANTERIOR, vSETOR_ATIVIDADE;
            BigDecimal vCNPJ;
            String vDRI, vAUDITOR;
            BigDecimal vQUANT_DE_ACOES_ORDINARIAS, vQUANT_DE_ACOES_PREF;
            String vSITUACAO;
            java.sql.Date vDATA_DA_SITUACAO;
            String vTIPO_PAPEL1, vTIPO_PAPEL2, vTIPO_PAPEL3, vTIPO_PAPEL4, vTIPO_PAPEL5, vTIPO_PAPEL6, vCONTROLE_ACIONARIO;
            java.sql.Date vDATA_DE_REGISTRO, vDATA_DO_CANCELAMENTO;
            String vMERCADO, vBOLSA1, vBOLSA2, vBOLSA3, vBOLSA4, vBOLSA5, vBOLSA6, vBOLSA7, vBOLSA8, vBOLSA9, vMOTIVO_DO_CANCELAMENTO;
            BigDecimal vPATRIMONIO_LIQUIDO;
            java.sql.Date vDATA_DO_PATRIMONIO;
            String vE_MAIL, vNOME_SETOR_ATIVIDADE;
            java.sql.Date vDATA_DA_ACAO;
            String vTIPO_NEGOCIO1, vTIPO_NEGOCIO2, vTIPO_NEGOCIO3, vTIPO_NEGOCIO4, vTIPO_NEGOCIO5, vTIPO_NEGOCIO6, vTIPO_MERCADO1, vTIPO_MERCADO2, vTIPO_MERCADO3, vTIPO_MERCADO4, vTIPO_MERCADO5, vTIPO_MERCADO6;
            MyHelperClass CampoDoArquivoDasEmpresasAbertas = new MyHelperClass();
            final int QTDE_CAMPOS =(int)(Object) CampoDoArquivoDasEmpresasAbertas.values().length;
            final String SEPARADOR_DE_CAMPOS_DO_REGISTRO = ";";
            while (in.hasNextLine()) {
                ++numeroDoRegistro;
                registro = in.nextLine();
                stmtDestino.clearParameters();
                ArrayList<String> camposTmp = new ArrayList<String>(QTDE_CAMPOS);
                StringBuilder campoTmp = new StringBuilder();
                char[] registroTmp = registro.toCharArray();
                char c;
                boolean houveMesclagemDeCampos = false;
                boolean campoIniciaComEspacoEmBranco, campoPossuiConteudo, registroComExcessoDeDelimitadores;
                int quantidadeDeDelimitadoresEncontrados = (registro.length() - registro.replace(SEPARADOR_DE_CAMPOS_DO_REGISTRO, "").length());
                registroComExcessoDeDelimitadores = (quantidadeDeDelimitadoresEncontrados > (QTDE_CAMPOS - 1));
                for (int idxCaractere = 0; idxCaractere < registroTmp.length; idxCaractere++) {
                    c = registroTmp[idxCaractere];
                    if (c == SEPARADOR_DE_CAMPOS_DO_REGISTRO.charAt(0)) {
                        campoPossuiConteudo = (campoTmp.length() > 0 && campoTmp.toString().trim().length() > 0);
                        if (campoPossuiConteudo) {
                            String campoAnterior = null;
                            if (camposTmp.size() > 0) {
                                campoAnterior = camposTmp.get(camposTmp.size() - 1);
                            }
                            campoIniciaComEspacoEmBranco = campoTmp.toString().startsWith(" ");
                            if (campoAnterior != null && campoIniciaComEspacoEmBranco && registroComExcessoDeDelimitadores) {
                                camposTmp.set(camposTmp.size() - 1, (campoAnterior + campoTmp.toString()).trim());
                                houveMesclagemDeCampos = true;
                            } else {
                                camposTmp.add(campoTmp.toString().trim());
                            }
                        } else {
                            camposTmp.add(null);
                        }
                        campoTmp.setLength(0);
                    } else {
                        campoTmp.append(c);
                    }
                }
                if (registro.endsWith(SEPARADOR_DE_CAMPOS_DO_REGISTRO)) {
                    camposTmp.add(null);
                }
                if (houveMesclagemDeCampos && camposTmp.size() < QTDE_CAMPOS) {
                    camposTmp.add((int)(Object)COMPLEMENTO.ordinal(), null);
                }
                campos = camposTmp.toArray(new String[camposTmp.size()]);
                int quantidadeDeCamposEncontradosIncluindoOsVazios = campos.length;
                if (quantidadeDeCamposEncontradosIncluindoOsVazios != QTDE_CAMPOS) {
                    throw(Throwable)(Object) new CampoMalDelimitadoEmRegistroDoArquivoImportado(registro);
                }
                vCODIGO_CVM = Integer.parseInt(campos[(int)(Object)CODIGO_CVM.ordinal()]);
                vDENOMINACAO_SOCIAL = campos[(int)(Object)DENOMINACAO_SOCIAL.ordinal()];
                vDENOMINACAO_COMERCIAL = campos[(int)(Object)DENOMINACAO_COMERCIAL.ordinal()];
                vLOGRADOURO = campos[(int)(Object)LOGRADOURO.ordinal()];
                vCOMPLEMENTO = campos[(int)(Object)COMPLEMENTO.ordinal()];
                vBAIRRO = campos[(int)(Object)BAIRRO.ordinal()];
                String cepTmp = campos[(int)(Object)CEP.ordinal()];
                if (cepTmp != null && cepTmp.trim().length() > 0) {
                    vCEP = new BigDecimal(cepTmp);
                } else {
                    vCEP = null;
                }
                vMUNICIPIO = campos[(int)(Object)MUNICIPIO.ordinal()];
                vUF = campos[(int)(Object)UF.ordinal()];
                String dddTmp = campos[(int)(Object)DDD.ordinal()], foneTmp = campos[(int)(Object)TELEFONE.ordinal()], dddFone = "";
                if (dddTmp != null && dddTmp.trim().length() > 0) {
                    dddFone = dddFone + dddTmp;
                }
                if (foneTmp != null && foneTmp.trim().length() > 0) {
                    dddFone = dddFone + foneTmp;
                }
                if (dddFone != null && dddFone.trim().length() > 0) {
                    dddFone = new BigDecimal(dddFone).toString();
                    if (dddFone.length() > 10 && dddFone.endsWith("0")) {
                        dddFone = dddFone.substring(0, 10);
                    }
                    vDDD = new BigDecimal(dddFone.substring(0, 2));
                    vTELEFONE = new BigDecimal(dddFone.substring(2));
                } else {
                    vDDD = null;
                    vTELEFONE = null;
                }
                String faxTmp = campos[(int)(Object)FAX.ordinal()];
                if (faxTmp != null && faxTmp.trim().length() > 0) {
                    vFAX = new BigDecimal(faxTmp);
                } else {
                    vFAX = null;
                }
                vDENOMINACAO_ANTERIOR = campos[(int)(Object)DENOMINACAO_ANTERIOR.ordinal()];
                vSETOR_ATIVIDADE = campos[(int)(Object)SETOR_ATIVIDADE.ordinal()];
                String cnpjTmp = campos[(int)(Object)CNPJ.ordinal()];
                if (cnpjTmp != null && cnpjTmp.trim().length() > 0) {
                    vCNPJ = new BigDecimal(cnpjTmp);
                } else {
                    vCNPJ = null;
                }
                vDRI = campos[(int)(Object)DRI.ordinal()];
                vAUDITOR = campos[(int)(Object)AUDITOR.ordinal()];
                String qtdeAcoesON = campos[(int)(Object)QUANT_DE_ACOES_ORDINARIAS.ordinal()];
                if (qtdeAcoesON != null && qtdeAcoesON.trim().length() > 0) {
                    vQUANT_DE_ACOES_ORDINARIAS = new BigDecimal(qtdeAcoesON);
                } else {
                    vQUANT_DE_ACOES_ORDINARIAS = null;
                }
                String qtdeAcoesPN = campos[(int)(Object)QUANT_DE_ACOES_PREF.ordinal()];
                if (qtdeAcoesPN != null && qtdeAcoesPN.trim().length() > 0) {
                    vQUANT_DE_ACOES_PREF = new BigDecimal(qtdeAcoesPN);
                } else {
                    vQUANT_DE_ACOES_PREF = null;
                }
                vSITUACAO = campos[(int)(Object)SITUACAO.ordinal()];
                String dataDaSituacaoTmp = campos[(int)(Object)DATA_DA_SITUACAO.ordinal()];
                String[] partesDaData = dataDaSituacaoTmp.trim().split("/");
                int dia = Integer.parseInt(partesDaData[0]), mes = Integer.parseInt(partesDaData[1]) - 1, ano = Integer.parseInt(partesDaData[2]);
                Calendar calendario = Calendar.getInstance();
                calendario.clear();
                calendario.set(ano, mes, dia);
                vDATA_DA_SITUACAO = new java.sql.Date(calendario.getTimeInMillis());
                vTIPO_PAPEL1 = campos[(int)(Object)TIPO_PAPEL1.ordinal()];
                vTIPO_PAPEL2 = campos[(int)(Object)TIPO_PAPEL2.ordinal()];
                vTIPO_PAPEL3 = campos[(int)(Object)TIPO_PAPEL3.ordinal()];
                vTIPO_PAPEL4 = campos[(int)(Object)TIPO_PAPEL4.ordinal()];
                vTIPO_PAPEL5 = campos[(int)(Object)TIPO_PAPEL5.ordinal()];
                vTIPO_PAPEL6 = campos[(int)(Object)TIPO_PAPEL6.ordinal()];
                vCONTROLE_ACIONARIO = campos[(int)(Object)CONTROLE_ACIONARIO.ordinal()];
                String dataDeRegistroTmp = campos[(int)(Object)DATA_DE_REGISTRO.ordinal()];
                partesDaData = dataDeRegistroTmp.trim().split("/");
                dia = Integer.parseInt(partesDaData[0]);
                mes = Integer.parseInt(partesDaData[1]) - 1;
                ano = Integer.parseInt(partesDaData[2]);
                calendario = Calendar.getInstance();
                calendario.clear();
                calendario.set(ano, mes, dia);
                vDATA_DE_REGISTRO = new java.sql.Date(calendario.getTimeInMillis());
                String dataDoCancelamentoTmp = campos[(int)(Object)DATA_DO_CANCELAMENTO.ordinal()];
                if (dataDoCancelamentoTmp != null && dataDoCancelamentoTmp.trim().length() > 0) {
                    partesDaData = dataDoCancelamentoTmp.trim().split("/");
                    dia = Integer.parseInt(partesDaData[0]);
                    mes = Integer.parseInt(partesDaData[1]) - 1;
                    ano = Integer.parseInt(partesDaData[2]);
                    calendario = Calendar.getInstance();
                    calendario.clear();
                    calendario.set(ano, mes, dia);
                    vDATA_DO_CANCELAMENTO = new java.sql.Date(calendario.getTimeInMillis());
                } else {
                    vDATA_DO_CANCELAMENTO = null;
                }
                vMERCADO = campos[(int)(Object)MERCADO.ordinal()];
                vBOLSA1 = campos[(int)(Object)BOLSA1.ordinal()];
                vBOLSA2 = campos[(int)(Object)BOLSA2.ordinal()];
                vBOLSA3 = campos[(int)(Object)BOLSA3.ordinal()];
                vBOLSA4 = campos[(int)(Object)BOLSA4.ordinal()];
                vBOLSA5 = campos[(int)(Object)BOLSA5.ordinal()];
                vBOLSA6 = campos[(int)(Object)BOLSA6.ordinal()];
                vBOLSA7 = campos[(int)(Object)BOLSA7.ordinal()];
                vBOLSA8 = campos[(int)(Object)BOLSA8.ordinal()];
                vBOLSA9 = campos[(int)(Object)BOLSA9.ordinal()];
                vMOTIVO_DO_CANCELAMENTO = campos[(int)(Object)MOTIVO_DO_CANCELAMENTO.ordinal()];
                String patrimonioLiquidoTmp = campos[(int)(Object)PATRIMONIO_LIQUIDO.ordinal()];
                if (patrimonioLiquidoTmp != null && patrimonioLiquidoTmp.trim().length() > 0) {
                    vPATRIMONIO_LIQUIDO = new BigDecimal(patrimonioLiquidoTmp);
                } else {
                    vPATRIMONIO_LIQUIDO = null;
                }
                String dataDoPatrimonioTmp = campos[(int)(Object)DATA_DO_PATRIMONIO.ordinal()];
                if (dataDoPatrimonioTmp != null && dataDoPatrimonioTmp.trim().length() > 0) {
                    partesDaData = dataDoPatrimonioTmp.trim().split("/");
                    dia = Integer.parseInt(partesDaData[0]);
                    mes = Integer.parseInt(partesDaData[1]) - 1;
                    ano = Integer.parseInt(partesDaData[2]);
                    calendario = Calendar.getInstance();
                    calendario.clear();
                    calendario.set(ano, mes, dia);
                    vDATA_DO_PATRIMONIO = new java.sql.Date(calendario.getTimeInMillis());
                } else {
                    vDATA_DO_PATRIMONIO = null;
                }
                vE_MAIL = campos[(int)(Object)E_MAIL.ordinal()];
                vNOME_SETOR_ATIVIDADE = campos[(int)(Object)NOME_SETOR_ATIVIDADE.ordinal()];
                String dataDaAcaoTmp = campos[(int)(Object)DATA_DA_ACAO.ordinal()];
                if (dataDaAcaoTmp != null && dataDaAcaoTmp.trim().length() > 0) {
                    partesDaData = dataDaAcaoTmp.trim().split("/");
                    dia = Integer.parseInt(partesDaData[0]);
                    mes = Integer.parseInt(partesDaData[1]) - 1;
                    ano = Integer.parseInt(partesDaData[2]);
                    calendario = Calendar.getInstance();
                    calendario.clear();
                    calendario.set(ano, mes, dia);
                    vDATA_DA_ACAO = new java.sql.Date(calendario.getTimeInMillis());
                } else {
                    vDATA_DA_ACAO = null;
                }
                vTIPO_NEGOCIO1 = campos[(int)(Object)TIPO_NEGOCIO1.ordinal()];
                vTIPO_NEGOCIO2 = campos[(int)(Object)TIPO_NEGOCIO2.ordinal()];
                vTIPO_NEGOCIO3 = campos[(int)(Object)TIPO_NEGOCIO3.ordinal()];
                vTIPO_NEGOCIO4 = campos[(int)(Object)TIPO_NEGOCIO4.ordinal()];
                vTIPO_NEGOCIO5 = campos[(int)(Object)TIPO_NEGOCIO5.ordinal()];
                vTIPO_NEGOCIO6 = campos[(int)(Object)TIPO_NEGOCIO6.ordinal()];
                vTIPO_MERCADO1 = campos[(int)(Object)TIPO_MERCADO1.ordinal()];
                vTIPO_MERCADO2 = campos[(int)(Object)TIPO_MERCADO2.ordinal()];
                vTIPO_MERCADO3 = campos[(int)(Object)TIPO_MERCADO3.ordinal()];
                vTIPO_MERCADO4 = campos[(int)(Object)TIPO_MERCADO4.ordinal()];
                vTIPO_MERCADO5 = campos[(int)(Object)TIPO_MERCADO5.ordinal()];
                vTIPO_MERCADO6 = campos[(int)(Object)TIPO_MERCADO6.ordinal()];
                stmtDestino.setIntAtName("CODIGO_CVM", vCODIGO_CVM);
                stmtDestino.setStringAtName("DENOMINACAO_SOCIAL", vDENOMINACAO_SOCIAL);
                stmtDestino.setStringAtName("DENOMINACAO_COMERCIAL", vDENOMINACAO_COMERCIAL);
                stmtDestino.setStringAtName("LOGRADOURO", vLOGRADOURO);
                stmtDestino.setStringAtName("COMPLEMENTO", vCOMPLEMENTO);
                stmtDestino.setStringAtName("BAIRRO", vBAIRRO);
                stmtDestino.setBigDecimalAtName("CEP", vCEP);
                stmtDestino.setStringAtName("MUNICIPIO", vMUNICIPIO);
                stmtDestino.setStringAtName("UF", vUF);
                stmtDestino.setBigDecimalAtName("DDD", vDDD);
                stmtDestino.setBigDecimalAtName("TELEFONE", vTELEFONE);
                stmtDestino.setBigDecimalAtName("FAX", vFAX);
                stmtDestino.setStringAtName("DENOMINACAO_ANTERIOR", vDENOMINACAO_ANTERIOR);
                stmtDestino.setStringAtName("SETOR_ATIVIDADE", vSETOR_ATIVIDADE);
                stmtDestino.setBigDecimalAtName("CNPJ", vCNPJ);
                stmtDestino.setStringAtName("DRI", vDRI);
                stmtDestino.setStringAtName("AUDITOR", vAUDITOR);
                stmtDestino.setBigDecimalAtName("QUANT_DE_ACOES_ORDINARIAS", vQUANT_DE_ACOES_ORDINARIAS);
                stmtDestino.setBigDecimalAtName("QUANT_DE_ACOES_PREF", vQUANT_DE_ACOES_PREF);
                stmtDestino.setStringAtName("SITUACAO", vSITUACAO);
                stmtDestino.setDateAtName("DATA_DA_SITUACAO", vDATA_DA_SITUACAO);
                stmtDestino.setStringAtName("TIPO_PAPEL1", vTIPO_PAPEL1);
                stmtDestino.setStringAtName("TIPO_PAPEL2", vTIPO_PAPEL2);
                stmtDestino.setStringAtName("TIPO_PAPEL3", vTIPO_PAPEL3);
                stmtDestino.setStringAtName("TIPO_PAPEL4", vTIPO_PAPEL4);
                stmtDestino.setStringAtName("TIPO_PAPEL5", vTIPO_PAPEL5);
                stmtDestino.setStringAtName("TIPO_PAPEL6", vTIPO_PAPEL6);
                stmtDestino.setStringAtName("CONTROLE_ACIONARIO", vCONTROLE_ACIONARIO);
                stmtDestino.setDateAtName("DATA_DE_REGISTRO", vDATA_DE_REGISTRO);
                stmtDestino.setDateAtName("DATA_DO_CANCELAMENTO", vDATA_DO_CANCELAMENTO);
                stmtDestino.setStringAtName("MERCADO", vMERCADO);
                stmtDestino.setStringAtName("BOLSA1", vBOLSA1);
                stmtDestino.setStringAtName("BOLSA2", vBOLSA2);
                stmtDestino.setStringAtName("BOLSA3", vBOLSA3);
                stmtDestino.setStringAtName("BOLSA4", vBOLSA4);
                stmtDestino.setStringAtName("BOLSA5", vBOLSA5);
                stmtDestino.setStringAtName("BOLSA6", vBOLSA6);
                stmtDestino.setStringAtName("BOLSA7", vBOLSA7);
                stmtDestino.setStringAtName("BOLSA8", vBOLSA8);
                stmtDestino.setStringAtName("BOLSA9", vBOLSA9);
                stmtDestino.setStringAtName("MOTIVO_DO_CANCELAMENTO", vMOTIVO_DO_CANCELAMENTO);
                stmtDestino.setBigDecimalAtName("PATRIMONIO_LIQUIDO", vPATRIMONIO_LIQUIDO);
                stmtDestino.setDateAtName("DATA_DO_PATRIMONIO", vDATA_DO_PATRIMONIO);
                stmtDestino.setStringAtName("E_MAIL", vE_MAIL);
                stmtDestino.setStringAtName("NOME_SETOR_ATIVIDADE", vNOME_SETOR_ATIVIDADE);
                stmtDestino.setDateAtName("DATA_DA_ACAO", vDATA_DA_ACAO);
                stmtDestino.setStringAtName("TIPO_NEGOCIO1", vTIPO_NEGOCIO1);
                stmtDestino.setStringAtName("TIPO_NEGOCIO2", vTIPO_NEGOCIO2);
                stmtDestino.setStringAtName("TIPO_NEGOCIO3", vTIPO_NEGOCIO3);
                stmtDestino.setStringAtName("TIPO_NEGOCIO4", vTIPO_NEGOCIO4);
                stmtDestino.setStringAtName("TIPO_NEGOCIO5", vTIPO_NEGOCIO5);
                stmtDestino.setStringAtName("TIPO_NEGOCIO6", vTIPO_NEGOCIO6);
                stmtDestino.setStringAtName("TIPO_MERCADO1", vTIPO_MERCADO1);
                stmtDestino.setStringAtName("TIPO_MERCADO2", vTIPO_MERCADO2);
                stmtDestino.setStringAtName("TIPO_MERCADO3", vTIPO_MERCADO3);
                stmtDestino.setStringAtName("TIPO_MERCADO4", vTIPO_MERCADO4);
                stmtDestino.setStringAtName("TIPO_MERCADO5", vTIPO_MERCADO5);
                stmtDestino.setStringAtName("TIPO_MERCADO6", vTIPO_MERCADO6);
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
	public MyHelperClass setStringAtName(String o0, String o1){ return null; }
	public MyHelperClass setBigDecimalAtName(String o0, BigDecimal o1){ return null; }
	public MyHelperClass setDateAtName(String o0, Date o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setIntAtName(String o0, int o1){ return null; }
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
