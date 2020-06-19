import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23198240 {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws Throwable, ServletException, IOException {
        UsuarioBll usuarioBll = new UsuarioBll();
        String senha = "";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update((byte[])(Object)request.getParameter("Senha").getBytes(), 0,(int)(Object) request.getParameter("Senha").length());
            senha = new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        String[] data =(String[])(Object) request.getParameter("Nascimento").split("/");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(data[2]), Integer.parseInt(data[1]) - 1, Integer.parseInt(data[0]));
        Telefone telefone = new Telefone();
        Usuario usuario = new Usuario();
        usuario.setNome(request.getParameter("Nome"));
        telefone.setTelefone(request.getParameter("Telefone").replaceAll("\\D", ""));
        MyHelperClass TelefoneTipoBll = new MyHelperClass();
        telefone.setTelefoneTipo(TelefoneTipoBll.getTelefoneTipoByTelefoneTipoID(Integer.parseInt((String)(Object)request.getParameter("TipoTelefone"))));
        usuario.setTelefone(telefone);
        usuario.setEmail(request.getParameter("Email"));
        usuario.setCpf(request.getParameter("CPF").replaceAll("\\D", ""));
        usuario.setNascimento(calendar);
        Endereco endereco = new Endereco();
        endereco.setCep(Integer.parseInt((String)(Object)request.getParameter("CEP").replaceAll("\\D", "")));
        endereco.setNumero(request.getParameter("Numero"));
        endereco.setComplemento(request.getParameter("Complemento"));
        usuario.setEndereco(endereco);
        usuario.setSenha(senha);
        String msg = "?msg=0";
        if ((boolean)(Object)usuarioBll.addNewUsuario(usuario)) {
            msg = "?msg=1";
            MyHelperClass UsuarioBll = new MyHelperClass();
            Usuario usuarioAutenticado =(Usuario)(Object) UsuarioBll.getUsuarioByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
            HttpSession session =(HttpSession)(Object) request.getSession();
            session.setAttribute("usuario", usuarioAutenticado);
        }
        response.sendRedirect("templates/verde-rosa/cadastro.jsp" + msg);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getTelefoneTipoByTelefoneTipoID(int o0){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getUsuarioByEmailAndSenha(MyHelperClass o0, MyHelperClass o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass sendRedirect(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class UsuarioBll {

public MyHelperClass addNewUsuario(Usuario o0){ return null; }}

class Telefone {

public MyHelperClass setTelefone(MyHelperClass o0){ return null; }
	public MyHelperClass setTelefoneTipo(MyHelperClass o0){ return null; }}

class Usuario {

public MyHelperClass setNascimento(Calendar o0){ return null; }
	public MyHelperClass setNome(MyHelperClass o0){ return null; }
	public MyHelperClass setEmail(MyHelperClass o0){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass setTelefone(Telefone o0){ return null; }
	public MyHelperClass setCpf(MyHelperClass o0){ return null; }
	public MyHelperClass setSenha(String o0){ return null; }
	public MyHelperClass getSenha(){ return null; }
	public MyHelperClass setEndereco(Endereco o0){ return null; }}

class Endereco {

public MyHelperClass setNumero(MyHelperClass o0){ return null; }
	public MyHelperClass setComplemento(MyHelperClass o0){ return null; }
	public MyHelperClass setCep(int o0){ return null; }}

class HttpSession {

public MyHelperClass setAttribute(String o0, Usuario o1){ return null; }}
