import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7394826 {
public MyHelperClass Util;
	public MyHelperClass getTagValue(String o0, Element o1){ return null; }
	public MyHelperClass getServletContext(){ return null; }

    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable, ServletException, IOException {
        if (request.getParameter("acao").equals("confirmar")) {
            String uuid =(String)(Object) request.getParameter("uuid");
            MyHelperClass PMF = new MyHelperClass();
            PersistenceManager pm =(PersistenceManager)(Object) PMF.get().getPersistenceManager();
            EmpresaDAO empresaDAO = new EmpresaDAO(pm);
            Empresa empresa =(Empresa)(Object) empresaDAO.pesquisar(uuid);
            if (empresa != null) {
                empresa.setAtivo(true);
                empresaDAO.criar(empresa);
            }
            MyHelperClass Pagina = new MyHelperClass();
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher(Pagina.PAGINA_APRESENTACAO);
            dispatcher.forward(request, response);
        } else if (request.getParameter("acao").equals("logoff")) {
            HttpSession session =(HttpSession)(Object) request.getSession();
            session.setAttribute("autorizado", new Boolean("false"));
            HttpServletResponse servletResponse = (HttpServletResponse) response;
            MyHelperClass Pagina = new MyHelperClass();
            servletResponse.sendRedirect(Pagina.PAGINA_APRESENTACAO);
        } else if (request.getParameter("acao").equals("preparar")) {
            Empresa objeto = new Empresa();
            request.setAttribute("objeto", objeto);
            MyHelperClass Pagina = new MyHelperClass();
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher(Pagina.PAGINA_EMPRESA_CADASTRAR);
            dispatcher.forward(request, response);
        } else if (request.getParameter("acao").equals("cadastrar")) {
            MyHelperClass PMF = new MyHelperClass();
            PersistenceManager pm =(PersistenceManager)(Object) PMF.get().getPersistenceManager();
            EmpresaDAO empresaDAO = new EmpresaDAO(pm);
            String cnpj =(String)(Object) request.getParameter("cnpj");
            String nome =(String)(Object) request.getParameter("nome");
            String razao =(String)(Object) request.getParameter("razao");
            String bairro =(String)(Object) request.getParameter("bairro");
            String cidade =(String)(Object) request.getParameter("cidade");
            String cep =(String)(Object) request.getParameter("cep");
            String email =(String)(Object) request.getParameter("email");
            Integer numero = null;
            if (request.getParameter("numero") != null && !request.getParameter("numero").equals("")) {
                numero = new Integer((int)(Object)request.getParameter("numero"));
            }
            String complemento =(String)(Object) request.getParameter("complemento");
            String endereco =(String)(Object) request.getParameter("endereco");
            String senha =(String)(Object) request.getParameter("senha");
            boolean emailEncontrado =(boolean)(Object) empresaDAO.pesquisarEmail(email);
            boolean cnpjEncontrado =(boolean)(Object) empresaDAO.pesquisarCNPJ(cnpj);
            String uuid = UUID.randomUUID().toString();
            Empresa empresa = new Empresa(nome, razao, email, email, cnpj, endereco, numero, cep, complemento, bairro, cidade, uuid);
            if (!emailEncontrado && !cnpjEncontrado) {
                empresa =(Empresa)(Object) empresaDAO.adicionar(empresa);
                Usuario usuario = new Usuario(nome, email, senha, empresa.getId());
                UsuarioDAO usuarioDAO = new UsuarioDAO(pm);
                usuarioDAO.adicionar(usuario);
                StringBuffer corpo = new StringBuffer();
                corpo.append("<html>");
                corpo.append("<head>");
                corpo.append("</head>");
                corpo.append("<body>");
                corpo.append("<body>");
                corpo.append("<div style='font-family: 'Helvetica Neue', Arial, Helvetica, sans-serif; font-size: 13px; margin: 14px';>");
                corpo.append("<img src='http://www.appestoque.com.br/img/logo.jpg'/>");
                corpo.append("<h2 style='font-family: 'Helvetica Neue', Arial, Helvetica, sans-serif; margin: 0 0 16px; font-size: 18px; font-weight: normal'>Ol�, " + empresa.getNome() + ".</h2>");
                corpo.append("<p>Por favor, confirme sua conta do Appestoque clicando nesse link:<br>");
                MyHelperClass Constantes = new MyHelperClass();
                corpo.append("<a href='" + Constantes.URL + Constantes.URI_CONFIRMAR + "&&uuid=" + empresa.getUuid() + "'");
//                MyHelperClass Constantes = new MyHelperClass();
                corpo.append("target='_blank'>" + Constantes.URL + Constantes.URI_CONFIRMAR + "&&uuid=" + empresa.getUuid() + "</a></p>");
                corpo.append("<p>Quando voc� confirmar, voc� ter� acesso total ao Appestoque e todas as notifica��es futuras ser�o enviadas para este endere�o de e-mail.</p>");
                corpo.append("<p style='font-family: 'Helvetica Neue', Arial, Helvetica, sans-serif; font-size: 13px; line-height: 18px; border-bottom: 1px solid rgb(238, 238, 238); padding-bottom: 10px; margin: 0 0 10px'>");
                corpo.append("<span style='font: italic 13px Georgia, serif; color: rgb(102, 102, 102)'>Equipe do Appestoque</span></p>");
                corpo.append("<p style='font-family: 'Helvetica Neue', Arial, Helvetica, sans-serif; margin-top: 5px; font-size: 10px; color: #888888'>");
                corpo.append("Se voc� recebeu essa mensagem por engano e n�o criou uma conta do Appestoque, clique");
                corpo.append(" <a href='mailto:suporte@appestoque.com.br?subject=[Cadastro]Mensagem por engano&&body='target='_blank'>n�o � minha conta</a>.</p>");
                corpo.append("<p style='font-family: 'Helvetica Neue', Arial, Helvetica, sans-serif; margin-top: 5px; font-size: 10px; color: #888888'>");
                corpo.append("Por favor n�o responda esta mensagem; ela foi enviada por um endere�o");
                corpo.append("de e-mail n�o monitorado. Esta mensagem � relacionada ao seu uso do");
                corpo.append(" Appestoque. Para mais informa��es sobre a sua conta, por");
                corpo.append("favor encaminhe um e-mail para o");
                corpo.append(" <a href='mailto:suporte@appestoque.com.br' target='_blank'>Suporte do Appestoque</a>.</p>");
                corpo.append("</div>");
                corpo.append("</body>");
                corpo.append("</html>");
//                MyHelperClass Constantes = new MyHelperClass();
                Util.enviarEmail(email, Constantes.ASSUNTO_CADASTRO, corpo);
                MyHelperClass Pagina = new MyHelperClass();
                response.sendRedirect(Pagina.PAGINA_APRESENTACAO);
            } else {
                ResourceBundle bundle = ResourceBundle.getBundle("i18n",(java.util.ResourceBundle.Control)(Object)(Control)(Object) request.getLocale());
                if (emailEncontrado) {
                    request.setAttribute("mensagem", bundle.getString("app.mensagem.email.cadastrado"));
                } else if (cnpjEncontrado) {
                    request.setAttribute("mensagem", bundle.getString("app.mensagem.cnpj.cadastrado"));
                }
                request.setAttribute("objeto", empresa);
                MyHelperClass Pagina = new MyHelperClass();
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher(Pagina.PAGINA_EMPRESA_CADASTRAR);
                dispatcher.forward(request, response);
            }
        } else if (request.getParameter("acao").equals("selecionar")) {
            MyHelperClass PMF = new MyHelperClass();
            PersistenceManager pm =(PersistenceManager)(Object) PMF.get().getPersistenceManager();
            EmpresaDAO dao = new EmpresaDAO(pm);
            Long id = new Long((long)(Object)request.getParameter("id"));
            Empresa empresa =(Empresa)(Object) dao.pesquisar(id);
            HttpSession session =(HttpSession)(Object) request.getSession();
            session.setAttribute("empresa", empresa);
            MyHelperClass Pagina = new MyHelperClass();
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher(Pagina.PAGINA_MENU);
            dispatcher.forward(request, response);
        } else if (request.getParameter("acao").equals("noticia")) {
            try {
                HttpURLConnection httpSource = null;
                URL url = new URL("http://feeds.folha.uol.com.br/folha/dinheiro/rss091.xml");
                httpSource = (HttpURLConnection) url.openConnection();
                MyHelperClass DocumentBuilderFactory = new MyHelperClass();
                DocumentBuilderFactory dbFactory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder =(DocumentBuilder)(Object) dbFactory.newDocumentBuilder();
                Document doc =(Document)(Object) dBuilder.parse(httpSource.getInputStream());
                doc.getDocumentElement().normalize();
                NodeList nList =(NodeList)(Object) doc.getElementsByTagName("item");
                PrintWriter out =(PrintWriter)(Object) response.getWriter();
                response.setContentType("text/html");
                for (int temp = 0; temp < 3; temp++) {
                    Node nNode =(Node)(Object) nList.item(temp);
                    MyHelperClass Node = new MyHelperClass();
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element)(Element)(Object) nNode;
                        out.print(getTagValue("title", eElement) + "<br/><br/>");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (request.getParameter("acao").equals("pdf")) {
            try {
                ServletOutputStream servletOutputStream =(ServletOutputStream)(Object) response.getOutputStream();
                PDF pdf = new PDF(servletOutputStream);
                response.setHeader("Content-Disposition", "attachment; filename=qrcode.pdf");
                response.setContentType("application/pdf");
                MyHelperClass Letter = new MyHelperClass();
                Page page = new Page(pdf, Letter.PORTRAIT);
                QRCode qr = null;
                qr = new QRCode();
                MyHelperClass Mode = new MyHelperClass();
                qr.setTypeNumber(Mode.MODE_8BIT_BYTE);
                MyHelperClass ErrorCorrectLevel = new MyHelperClass();
                qr.setErrorCorrectLevel(ErrorCorrectLevel.M);
                qr.addData("Andr� Silva Tricano");
                qr.make();
                qr.setPosition(200, 100);
                qr.drawOn(page);
                qr = new QRCode();
//                MyHelperClass Mode = new MyHelperClass();
                qr.setTypeNumber(Mode.MODE_8BIT_BYTE);
//                MyHelperClass ErrorCorrectLevel = new MyHelperClass();
                qr.setErrorCorrectLevel(ErrorCorrectLevel.M);
                qr.addData("Alan Silva Tricano");
                qr.make();
                qr.setPosition(400, 100);
                qr.drawOn(page);
                pdf.flush();
                servletOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (request.getParameter("acao").equals("file")) {
            try {
                File file = new File("d:\\MyXMLFile.xml");
                MyHelperClass DocumentBuilderFactory = new MyHelperClass();
                DocumentBuilderFactory dbf =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
                DocumentBuilder db =(DocumentBuilder)(Object) dbf.newDocumentBuilder();
                Document doc =(Document)(Object) db.parse((InputStream)(Object)file);
                doc.getDocumentElement().normalize();
                System.out.println("Root element " + doc.getDocumentElement().getNodeName());
                NodeList nodeLst =(NodeList)(Object) doc.getElementsByTagName("employee");
                System.out.println("Information of all employees");
                for (int s = 0; s < (int)(Object)nodeLst.getLength(); s++) {
                    Node fstNode =(Node)(Object) nodeLst.item(s);
                    MyHelperClass Node = new MyHelperClass();
                    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element fstElmnt = (Element)(Element)(Object) fstNode;
                        NodeList fstNmElmntLst =(NodeList)(Object) fstElmnt.getElementsByTagName("firstname");
                        Element fstNmElmnt = (Element)(Element)(Object) fstNmElmntLst.item(0);
                        NodeList fstNm =(NodeList)(Object) fstNmElmnt.getChildNodes();
                        System.out.println("First Name : " + ((Node)(Node)(Object) fstNm.item(0)).getNodeValue());
                        NodeList lstNmElmntLst =(NodeList)(Object) fstElmnt.getElementsByTagName("lastname");
                        Element lstNmElmnt = (Element)(Element)(Object) lstNmElmntLst.item(0);
                        NodeList lstNm =(NodeList)(Object) lstNmElmnt.getChildNodes();
                        System.out.println("Last Name : " + ((Node)(Node)(Object) lstNm.item(0)).getNodeValue());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MODE_8BIT_BYTE;
	public MyHelperClass ASSUNTO_CADASTRO;
	public MyHelperClass URI_CONFIRMAR;
	public MyHelperClass PAGINA_MENU;
	public MyHelperClass M;
	public MyHelperClass PAGINA_APRESENTACAO;
	public MyHelperClass ELEMENT_NODE;
	public MyHelperClass PAGINA_EMPRESA_CADASTRAR;
	public MyHelperClass URL;
	public MyHelperClass PORTRAIT;
public MyHelperClass getPersistenceManager(){ return null; }
	public MyHelperClass normalize(){ return null; }
	public MyHelperClass get(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass enviarEmail(String o0, MyHelperClass o1, StringBuffer o2){ return null; }
	public MyHelperClass getNodeName(){ return null; }
	public MyHelperClass getRequestDispatcher(MyHelperClass o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }
	public MyHelperClass setAttribute(String o0, Empresa o1){ return null; }
	public MyHelperClass getLocale(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass sendRedirect(MyHelperClass o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class PersistenceManager {

}

class EmpresaDAO {

EmpresaDAO(){}
	EmpresaDAO(PersistenceManager o0){}
	public MyHelperClass pesquisarEmail(String o0){ return null; }
	public MyHelperClass pesquisar(String o0){ return null; }
	public MyHelperClass pesquisar(Long o0){ return null; }
	public MyHelperClass pesquisarCNPJ(String o0){ return null; }
	public MyHelperClass criar(Empresa o0){ return null; }
	public MyHelperClass adicionar(Empresa o0){ return null; }}

class Empresa {

Empresa(){}
	Empresa(String o0, String o1, String o2, String o3, String o4, String o5, Integer o6, String o7, String o8, String o9, String o10, String o11){}
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getNome(){ return null; }
	public MyHelperClass getUuid(){ return null; }
	public MyHelperClass setAtivo(boolean o0){ return null; }}

class RequestDispatcher {

public MyHelperClass forward(HttpServletRequest o0, HttpServletResponse o1){ return null; }}

class HttpSession {

public MyHelperClass setAttribute(String o0, Empresa o1){ return null; }
	public MyHelperClass setAttribute(String o0, Boolean o1){ return null; }}

class Usuario {

Usuario(){}
	Usuario(String o0, String o1, String o2, MyHelperClass o3){}}

class UsuarioDAO {

UsuarioDAO(){}
	UsuarioDAO(PersistenceManager o0){}
	public MyHelperClass adicionar(Usuario o0){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }
	public MyHelperClass getDocumentElement(){ return null; }}

class NodeList {

public MyHelperClass getLength(){ return null; }
	public MyHelperClass item(int o0){ return null; }}

class Node {

public MyHelperClass getNodeType(){ return null; }
	public MyHelperClass getNodeValue(){ return null; }}

class Element {

public MyHelperClass getElementsByTagName(String o0){ return null; }
	public MyHelperClass getChildNodes(){ return null; }}

class ServletOutputStream {

public MyHelperClass close(){ return null; }}

class PDF {

PDF(ServletOutputStream o0){}
	PDF(){}
	public MyHelperClass flush(){ return null; }}

class Page {

Page(PDF o0, MyHelperClass o1){}
	Page(){}}

class QRCode {

public MyHelperClass addData(String o0){ return null; }
	public MyHelperClass setPosition(int o0, int o1){ return null; }
	public MyHelperClass drawOn(Page o0){ return null; }
	public MyHelperClass setTypeNumber(MyHelperClass o0){ return null; }
	public MyHelperClass make(){ return null; }
	public MyHelperClass setErrorCorrectLevel(MyHelperClass o0){ return null; }}

class Control {

}
