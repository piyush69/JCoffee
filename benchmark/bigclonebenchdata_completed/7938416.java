import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7938416 {
public MyHelperClass deleteAnexoFromTemp(Anexo o0){ return null; }
public MyHelperClass historicoService;
	public MyHelperClass config;
	public MyHelperClass IOUtils;
	public MyHelperClass SecurityContextHolder;
	public MyHelperClass carteiraService;
	public MyHelperClass selectById(int o0){ return null; }

//    @Override
//    @RemoteMethod
    public synchronized boolean copy(int idAnexo)  throws Throwable {
        try {
            Anexo anexo =(Anexo)(Object) selectById(idAnexo);
            Authentication auth =(Authentication)(Object) SecurityContextHolder.getContext().getAuthentication();
            Usuario usuario = (Usuario)(Usuario)(Object) auth.getPrincipal();
            if ((int)(Object)anexo.getAssinado() == 1 && anexo.getIdAssinadoPor() != usuario.getIdUsuario()) {
                deleteAnexoFromTemp(anexo);
                return false;
            }
            Carteira carteiraUsuario =(Carteira)(Object) carteiraService.selectById(usuario.getIdCarteira());
            DocumentoDetalhes documentoDetalhes =(DocumentoDetalhes)(Object) anexo.getDocumentoDetalhes();
            Set<Documento> documentos =(Set<Documento>)(Object) documentoDetalhes.getDocumentosByCarteira();
            boolean havePermission = false;
            for (Documento documento : documentos) {
                Carteira carteiraDocumento =(Carteira)(Object) documento.getCarteira();
                if (carteiraDocumento != null) {
                    if (carteiraDocumento.getIdCarteira() == carteiraUsuario.getIdCarteira()) {
                        havePermission = true;
                        System.out.println("tem permisssao: " + havePermission);
                        break;
                    }
                }
            }
            if (!havePermission) {
                System.out.println("Não tem permissao.");
                return false;
            }
            FileInputStream fis = new FileInputStream(new File(config.baseDir + "/temp/" + anexo.getAnexoCaminho()));
            FileOutputStream fos = new FileOutputStream(new File(config.baseDir + "/arquivos_upload_direto/" + anexo.getAnexoCaminho()));
            IOUtils.copy(fis, fos);
            String txtHistorico = "(Edição) -" + anexo.getAnexoNome() + "-";
            txtHistorico += usuario.getUsuLogin();
            Historico historico = new Historico();
            historico.setCarteira(carteiraUsuario);
            historico.setDataHoraHistorico(new Date());
            historico.setHistorico(txtHistorico);
            historico.setDocumentoDetalhes(documentoDetalhes);
            historico.setUsuario(usuario);
            historicoService.save(historico);
            return(boolean)(Object) deleteAnexoFromTemp(anexo);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            System.out.println("AnexoServiceImpl.copy ERRO DESCONHECIDO");
            e.printStackTrace();
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass baseDir;
public MyHelperClass getContext(){ return null; }
	public MyHelperClass copy(FileInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass save(Historico o0){ return null; }
	public MyHelperClass getAuthentication(){ return null; }
	public MyHelperClass selectById(MyHelperClass o0){ return null; }}

class RemoteMethod {

}

class Anexo {

public MyHelperClass getAnexoNome(){ return null; }
	public MyHelperClass getIdAssinadoPor(){ return null; }
	public MyHelperClass getAnexoCaminho(){ return null; }
	public MyHelperClass getAssinado(){ return null; }
	public MyHelperClass getDocumentoDetalhes(){ return null; }}

class Authentication {

public MyHelperClass getPrincipal(){ return null; }}

class Usuario {

public MyHelperClass getIdCarteira(){ return null; }
	public MyHelperClass getIdUsuario(){ return null; }
	public MyHelperClass getUsuLogin(){ return null; }}

class Carteira {

public MyHelperClass getIdCarteira(){ return null; }}

class DocumentoDetalhes {

public MyHelperClass getDocumentosByCarteira(){ return null; }}

class Documento {

public MyHelperClass getCarteira(){ return null; }}

class Historico {

public MyHelperClass setDocumentoDetalhes(DocumentoDetalhes o0){ return null; }
	public MyHelperClass setCarteira(Carteira o0){ return null; }
	public MyHelperClass setDataHoraHistorico(Date o0){ return null; }
	public MyHelperClass setHistorico(String o0){ return null; }
	public MyHelperClass setUsuario(Usuario o0){ return null; }}
