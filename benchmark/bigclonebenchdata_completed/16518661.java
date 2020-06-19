import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16518661 {
public MyHelperClass GUIQuebraLink;
	public MyHelperClass getLibrary(){ return null; }
	public MyHelperClass readHTML(String o0){ return null; }
public MyHelperClass QuebraLink;
	public MyHelperClass HexToChar(String o0){ return null; }
	public MyHelperClass decode64(String o0){ return null; }
	public MyHelperClass decodeAscii(String o0){ return null; }
	public MyHelperClass precisaRepassar(String o0){ return null; }
	public MyHelperClass inverteFrase(String o0){ return null; }
	public MyHelperClass decodeCifraDeCesar(String o0){ return null; }
	public MyHelperClass isValid(String o0){ return null; }

    public String quebraLink(String link) throws Throwable, StringIndexOutOfBoundsException {
        link = link.replace(".url", "");
        int cod = 0;
        final String linkInit = link.replace("#", "");
        boolean estado = false;
        char letra;
        String linkOrig;
        String newlink = "";
        linkOrig = link.replace("#", "");
        linkOrig = linkOrig.replace(".url", "");
        linkOrig = linkOrig.replace(".html", "");
        linkOrig = linkOrig.replace("http://", "");
        if (linkOrig.contains("clubedodownload")) {
            for (int i = 7; i < linkInit.length(); i++) {
                if (linkOrig.charAt(i) == '/') {
                    for (int j = i + 1; j < linkOrig.length(); j++) {
                        newlink += linkOrig.charAt(j);
                    }
                    if (newlink.contains("//:ptth")) {
                        newlink =(String)(Object) inverteFrase(newlink);
                        if ((boolean)(Object)isValid(newlink)) {
                            return newlink;
                        }
                    } else if (newlink.contains("http://")) {
                        if ((boolean)(Object)isValid(newlink)) {
                            return newlink;
                        }
                    }
                }
            }
        }
        if (linkOrig.contains("protetordelink.tv")) {
            for (int i = linkOrig.length() - 1; i >= 0; i--) {
                letra = linkOrig.charAt(i);
                if (letra == '/') {
                    for (int j = i + 1; j < linkOrig.length(); j++) {
                        newlink += linkOrig.charAt(j);
                    }
                    newlink =(String)(Object) HexToChar(newlink);
                    if (newlink.contains("ptth")) {
                        if ((boolean)(Object)precisaRepassar(newlink)) {
                            newlink = quebraLink(newlink);
                            newlink =(String)(Object) inverteFrase(newlink);
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        } else {
                            newlink =(String)(Object) inverteFrase(newlink);
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        }
                    } else {
                        if ((boolean)(Object)precisaRepassar(newlink)) {
                            newlink = quebraLink(newlink);
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        } else {
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        }
                    }
                }
            }
        }
        if (linkOrig.contains("baixeaquifilmes")) {
            for (int i = 0; i < linkOrig.length(); i++) {
                letra = linkOrig.charAt(i);
                if (letra == '?') {
                    for (int j = i + 1; j < linkOrig.length(); j++) {
                        newlink += linkOrig.charAt(j);
                    }
                    if (newlink.contains(":ptth")) {
                        newlink =(String)(Object) inverteFrase(newlink);
                        if ((boolean)(Object)precisaRepassar(newlink)) {
                            newlink = quebraLink(newlink);
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        } else {
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        }
                    } else {
                        if ((boolean)(Object)precisaRepassar(newlink)) {
                            newlink = quebraLink(newlink);
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        } else {
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        }
                    }
                }
            }
        }
        if (linkOrig.contains("downloadsgratis")) {
            for (int i = 0; i < linkOrig.length(); i++) {
                letra = linkOrig.charAt(i);
                if (letra == '!') {
                    for (int j = i + 1; j < linkOrig.length(); j++) {
                        newlink += linkOrig.charAt(j);
                    }
                    if ((boolean)(Object)precisaRepassar((String)(Object)QuebraLink.decode64(newlink))) {
                        newlink = quebraLink((String)(Object)QuebraLink.decode64(newlink));
                        if ((boolean)(Object)isValid(newlink)) {
                            return newlink;
                        }
                    } else {
                        if ((boolean)(Object)isValid(newlink)) {
                            return newlink;
                        }
                    }
                }
            }
        }
        newlink = "";
        if (linkOrig.contains("vinxp")) {
            System.out.println("é");
            for (int i = 1; i < linkOrig.length(); i++) {
                if (linkOrig.charAt(i) == '=') {
                    for (int j = i + 1; j < linkOrig.length(); j++) {
                        newlink += linkOrig.charAt(j);
                    }
                    break;
                }
            }
            if (newlink.contains(".vinxp")) {
                newlink = newlink.replace(".vinxp", "");
            }
            newlink =(String)(Object) decodeCifraDeCesar(newlink);
            System.out.println(newlink);
            return newlink;
        }
        if (linkOrig.contains("?")) {
            String linkTemporary = "";
            newlink = "";
            if (linkOrig.contains("go!")) {
                linkOrig = linkOrig.replace("?go!", "?");
            }
            if (linkOrig.contains("=")) {
                for (int i = 0; i < linkOrig.length(); i++) {
                    letra = linkOrig.charAt(i);
                    if (letra == '=') {
                        for (int j = i + 1; j < linkOrig.length(); j++) {
                            newlink += linkOrig.charAt(j);
                        }
                        linkTemporary =(String)(Object) QuebraLink.decode64(newlink);
                        break;
                    }
                }
                if (linkTemporary.contains("http")) {
                    newlink = "";
                    for (int i = 0; i < linkTemporary.length(); i++) {
                        letra = linkTemporary.charAt(i);
                        if (letra == 'h') {
                            for (int j = i; j < linkTemporary.length(); j++) {
                                newlink += linkTemporary.charAt(j);
                            }
                            newlink = newlink.replace("!og", "");
                            if ((boolean)(Object)precisaRepassar(newlink)) {
                                newlink = quebraLink(newlink);
                                if ((boolean)(Object)isValid(newlink)) {
                                    return newlink;
                                }
                            } else {
                                if ((boolean)(Object)isValid(newlink)) {
                                    return newlink;
                                }
                            }
                        }
                    }
                }
                if (linkTemporary.contains("ptth")) {
                    newlink = "";
                    linkTemporary =(String)(Object) inverteFrase(linkTemporary);
                    for (int i = 0; i < linkTemporary.length(); i++) {
                        letra = linkTemporary.charAt(i);
                        if (letra == 'h') {
                            for (int j = i; j < linkTemporary.length(); j++) {
                                newlink += linkTemporary.charAt(j);
                            }
                            newlink = newlink.replace("!og", "");
                            if ((boolean)(Object)precisaRepassar(newlink)) {
                                newlink = quebraLink(newlink);
                                if ((boolean)(Object)isValid(newlink)) {
                                    return newlink;
                                }
                            } else {
                                if ((boolean)(Object)isValid(newlink)) {
                                    return newlink;
                                }
                            }
                        }
                    }
                }
            }
            linkTemporary = "";
            for (int i = 0; i < linkOrig.length(); i++) {
                letra = linkOrig.charAt(i);
                if (letra == '?') {
                    for (int j = i + 1; j < linkOrig.length(); j++) {
                        linkTemporary += linkOrig.charAt(j);
                    }
                    link =(String)(Object) QuebraLink.decode64(linkTemporary);
                    break;
                }
            }
            if (link.contains("http")) {
                newlink = "";
                for (int i = 0; i < link.length(); i++) {
                    letra = link.charAt(i);
                    if (letra == 'h') {
                        for (int j = i; j < link.length(); j++) {
                            newlink += link.charAt(j);
                        }
                        newlink = newlink.replace("!og", "");
                        if ((boolean)(Object)precisaRepassar(newlink)) {
                            newlink = quebraLink(newlink);
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        } else {
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        }
                    }
                }
            }
            if (link.contains("ptth")) {
                newlink = "";
                linkTemporary =(String)(Object) inverteFrase(link);
                for (int i = 0; i < linkTemporary.length(); i++) {
                    letra = linkTemporary.charAt(i);
                    if (letra == 'h') {
                        for (int j = i; j < linkTemporary.length(); j++) {
                            newlink += linkTemporary.charAt(j);
                        }
                        newlink = newlink.replace("!og", "");
                        if ((boolean)(Object)precisaRepassar(newlink)) {
                            newlink = quebraLink(newlink);
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        } else {
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        }
                    }
                }
            }
            linkOrig = linkInit;
            link = linkOrig;
            newlink = "";
        }
        if (linkOrig.contains("?")) {
            String linkTemporary = "";
            newlink = "";
            if (linkOrig.contains("go!")) {
                linkOrig = linkOrig.replace("?go!", "?");
            }
            if (linkOrig.contains("=")) {
                for (int i = 0; i < linkOrig.length(); i++) {
                    letra = linkOrig.charAt(i);
                    if (letra == '=') {
                        for (int j = i + 1; j < linkOrig.length(); j++) {
                            newlink += linkOrig.charAt(j);
                        }
                        linkTemporary = linkTemporary.replace(".", "");
                        try {
                            linkTemporary =(String)(Object) HexToChar(newlink);
                        } catch (Exception e) {
                            System.err.println("erro hex 1º");
                            estado = true;
                        }
                        break;
                    }
                }
                if (linkTemporary.contains("http") && !estado) {
                    newlink = "";
                    for (int i = 0; i < linkTemporary.length(); i++) {
                        letra = linkTemporary.charAt(i);
                        if (letra == 'h') {
                            for (int j = i; j < linkTemporary.length(); j++) {
                                newlink += linkTemporary.charAt(j);
                            }
                            newlink = newlink.replace("!og", "");
                            if ((boolean)(Object)precisaRepassar(newlink)) {
                                newlink = quebraLink(newlink);
                                if ((boolean)(Object)isValid(newlink)) {
                                    return newlink;
                                }
                            } else {
                                if ((boolean)(Object)isValid(newlink)) {
                                    return newlink;
                                }
                            }
                        }
                    }
                }
                if (linkTemporary.contains("ptth") && !estado) {
                    newlink = "";
                    linkTemporary =(String)(Object) inverteFrase(linkTemporary);
                    for (int i = 0; i < linkTemporary.length(); i++) {
                        letra = linkTemporary.charAt(i);
                        if (letra == 'h') {
                            for (int j = i; j < linkTemporary.length(); j++) {
                                newlink += linkTemporary.charAt(j);
                            }
                            newlink = newlink.replace("!og", "");
                            if ((boolean)(Object)precisaRepassar(newlink)) {
                                newlink = quebraLink(newlink);
                                if ((boolean)(Object)isValid(newlink)) {
                                    return newlink;
                                }
                            } else {
                                if ((boolean)(Object)isValid(newlink)) {
                                    return newlink;
                                }
                            }
                        }
                    }
                }
            }
            estado = false;
            linkTemporary = "";
            for (int i = 0; i < linkOrig.length(); i++) {
                letra = linkOrig.charAt(i);
                if (letra == '?') {
                    for (int j = i + 1; j < linkOrig.length(); j++) {
                        linkTemporary += linkOrig.charAt(j);
                    }
                    linkTemporary = linkTemporary.replace(".", "");
                    try {
                        link =(String)(Object) HexToChar(linkTemporary);
                    } catch (Exception e) {
                        System.err.println("erro hex 2º");
                        estado = true;
                    }
                    break;
                }
            }
            if (link.contains("http") && !estado) {
                newlink = "";
                for (int i = 0; i < link.length(); i++) {
                    letra = link.charAt(i);
                    if (letra == 'h') {
                        for (int j = i; j < link.length(); j++) {
                            newlink += link.charAt(j);
                        }
                        newlink = newlink.replace("!og", "");
                        if ((boolean)(Object)precisaRepassar(newlink)) {
                            newlink = quebraLink(newlink);
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        } else {
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        }
                    }
                }
            }
            if (link.contains("ptth") && !estado) {
                newlink = "";
                linkTemporary =(String)(Object) inverteFrase(link);
                for (int i = 0; i < linkTemporary.length(); i++) {
                    letra = linkTemporary.charAt(i);
                    if (letra == 'h') {
                        for (int j = i; j < linkTemporary.length(); j++) {
                            newlink += linkTemporary.charAt(j);
                        }
                        newlink = newlink.replace("!og", "");
                        if ((boolean)(Object)precisaRepassar(newlink)) {
                            newlink = quebraLink(newlink);
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        } else {
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        }
                    }
                }
            }
            linkOrig = linkInit;
            link = linkOrig;
            newlink = "";
        }
        if (linkOrig.contains("?") && !linkOrig.contains("id=") && !linkOrig.contains("url=") && !linkOrig.contains("link=") && !linkOrig.contains("r=http") && !linkOrig.contains("r=ftp")) {
            for (int i = 0; i < linkOrig.length(); i++) {
                letra = linkOrig.charAt(i);
                if (letra == '?') {
                    newlink = "";
                    for (int j = i + 1; j < linkOrig.length(); j++) {
                        newlink += linkOrig.charAt(j);
                    }
                    if (newlink.contains("ptth")) {
                        newlink =(String)(Object) inverteFrase(newlink);
                        if ((boolean)(Object)precisaRepassar(newlink)) {
                            newlink = quebraLink(newlink);
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        } else {
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        }
                    } else {
                        if ((boolean)(Object)precisaRepassar(newlink)) {
                            newlink = quebraLink(newlink);
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        } else {
                            if ((boolean)(Object)isValid(newlink)) {
                                return newlink;
                            }
                        }
                    }
                }
            }
        }
        if ((link.contains("url=")) || (link.contains("link=")) || (link.contains("?r=http")) || (link.contains("?r=ftp"))) {
            if (!link.contains("//:ptth")) {
                for (int i = 0; i < link.length(); i++) {
                    letra = link.charAt(i);
                    if (letra == '=') {
                        for (int j = i + 1; j < link.length(); j++) {
                            letra = link.charAt(j);
                            newlink += letra;
                        }
                        break;
                    }
                }
                if ((boolean)(Object)precisaRepassar(newlink)) {
                    newlink = quebraLink(newlink);
                    if ((boolean)(Object)isValid(newlink)) {
                        return newlink;
                    }
                } else {
                    if ((boolean)(Object)isValid(newlink)) {
                        return newlink;
                    }
                }
            }
        }
        if (linkOrig.contains("//:ptth") || linkOrig.contains("//:sptth")) {
            if (linkOrig.contains("=")) {
                for (int i = 0; i < linkOrig.length(); i++) {
                    letra = linkOrig.charAt(i);
                    if (letra == '=') {
                        for (int j = linkOrig.length() - 1; j > i; j--) {
                            letra = linkOrig.charAt(j);
                            newlink += letra;
                        }
                        break;
                    }
                }
                if ((boolean)(Object)precisaRepassar(newlink)) {
                    newlink = quebraLink(newlink);
                    if ((boolean)(Object)isValid(newlink)) {
                        return newlink;
                    }
                } else {
                    if ((boolean)(Object)isValid(newlink)) {
                        return newlink;
                    }
                }
            }
            newlink =(String)(Object) inverteFrase(linkOrig);
            if ((boolean)(Object)precisaRepassar(newlink)) {
                newlink = quebraLink(newlink);
                if ((boolean)(Object)isValid(newlink)) {
                    return newlink;
                }
            } else {
                if ((boolean)(Object)isValid(newlink)) {
                    return newlink;
                }
            }
        }
        if (linkOrig.contains("?go!")) {
            linkOrig = linkOrig.replace("?go!", "?down!");
            newlink = linkOrig;
            if ((boolean)(Object)precisaRepassar(newlink)) {
                newlink = quebraLink(newlink);
                if ((boolean)(Object)isValid(newlink)) {
                    return newlink;
                }
            } else {
                if ((boolean)(Object)isValid(newlink)) {
                    return newlink;
                }
            }
        }
        if (linkOrig.contains("down!")) {
            linkOrig = linkOrig.replace("down!", "");
            return quebraLink(linkOrig);
        }
        newlink = "";
        for (int i = linkOrig.length() - 4; i >= 0; i--) {
            letra = linkOrig.charAt(i);
            if (letra == '=') {
                for (int j = i + 1; j < linkOrig.length(); j++) {
                    newlink += linkOrig.charAt(j);
                }
                break;
            }
        }
        String ltmp = "";
        try {
            ltmp =(String)(Object) HexToChar(newlink);
        } catch (Exception e) {
            System.err.println("erro hex 3º");
        }
        if (ltmp.contains("http://")) {
            if ((boolean)(Object)precisaRepassar(ltmp)) {
                ltmp = quebraLink(ltmp);
                if ((boolean)(Object)isValid(ltmp)) {
                    newlink = ltmp;
                    return newlink;
                }
            } else {
                if ((boolean)(Object)isValid(ltmp)) {
                    newlink = ltmp;
                    return newlink;
                }
            }
        } else if (ltmp.contains("//:ptth")) {
            ltmp =(String)(Object) inverteFrase(ltmp);
            if ((boolean)(Object)precisaRepassar(ltmp)) {
                ltmp = quebraLink(ltmp);
                if ((boolean)(Object)isValid(ltmp)) {
                    newlink = ltmp;
                    return newlink;
                }
            } else {
                if ((boolean)(Object)isValid(ltmp)) {
                    newlink = ltmp;
                    return newlink;
                }
            }
        } else {
            ltmp = newlink;
        }
        ltmp =(String)(Object) decode64(newlink);
        if (ltmp.contains("http://")) {
            if ((boolean)(Object)precisaRepassar(ltmp)) {
                ltmp = quebraLink(newlink);
                if ((boolean)(Object)isValid(ltmp)) {
                    newlink = ltmp;
                    return newlink;
                }
            } else {
                if ((boolean)(Object)isValid(ltmp)) {
                    newlink = ltmp;
                    return newlink;
                }
            }
        } else if (ltmp.contains("//:ptth")) {
            ltmp =(String)(Object) inverteFrase(ltmp);
            if ((boolean)(Object)precisaRepassar(ltmp)) {
                newlink = quebraLink(newlink);
                if ((boolean)(Object)isValid(ltmp)) {
                    newlink = ltmp;
                    return newlink;
                }
            } else {
                if ((boolean)(Object)isValid(ltmp)) {
                    newlink = ltmp;
                    return newlink;
                }
            }
        } else {
            ltmp = newlink;
        }
        try {
            ltmp =(String)(Object) decodeAscii(newlink);
        } catch (NumberFormatException e) {
            System.err.println("erro ascii");
        }
        if (ltmp.contains("http://")) {
            if ((boolean)(Object)precisaRepassar(ltmp)) {
                ltmp = quebraLink(newlink);
                if ((boolean)(Object)isValid(ltmp)) {
                    newlink = ltmp;
                    return newlink;
                }
            } else {
                if ((boolean)(Object)isValid(ltmp)) {
                    newlink = ltmp;
                    return newlink;
                }
            }
        } else if (ltmp.contains("//:ptth")) {
            ltmp =(String)(Object) inverteFrase(ltmp);
            if ((boolean)(Object)precisaRepassar(ltmp)) {
                ltmp = quebraLink(ltmp);
                if ((boolean)(Object)isValid(ltmp)) {
                    newlink = ltmp;
                    return newlink;
                }
            } else {
                if ((boolean)(Object)isValid(ltmp)) {
                    newlink = ltmp;
                    return newlink;
                }
            }
        } else {
            ltmp = null;
        }
        newlink = "";
        int cont = 0;
        letra = '\0';
        ltmp = "";
        newlink = "";
        for (int i = linkOrig.length() - 4; i >= 0; i--) {
            letra = linkOrig.charAt(i);
            if (letra == '=' || letra == '?') {
                for (int j = i + 1; j < linkOrig.length(); j++) {
                    if (linkOrig.charAt(j) == '.') {
                        break;
                    }
                    newlink += linkOrig.charAt(j);
                }
                break;
            }
        }
        ltmp = newlink;
        String tmp = "";
        String tmp2 = "";
        do {
            try {
                tmp =(String)(Object) HexToChar(ltmp);
                tmp2 =(String)(Object) HexToChar((String)(Object)inverteFrase(ltmp));
                if (!tmp.isEmpty() && tmp.length() > 5 && !tmp.contains("") && !tmp.contains("§") && !tmp.contains("�") && !tmp.contains("")) {
                    ltmp =(String)(Object) HexToChar(ltmp);
                } else if (!(Boolean)(Object)inverteFrase(tmp2).isEmpty() &&(int)(Object) inverteFrase(tmp2).length() > 5 && !(Boolean)(Object)inverteFrase(tmp2).contains("") && !(Boolean)(Object)inverteFrase(tmp2).contains("§") && !(Boolean)(Object)inverteFrase(tmp2).contains("�")) {
                    ltmp =(String)(Object) HexToChar((String)(Object)inverteFrase(ltmp));
                }
            } catch (NumberFormatException e) {
            }
            tmp =(String)(Object) decode64(ltmp);
            tmp2 =(String)(Object) decode64((String)(Object)inverteFrase(ltmp));
            if (!tmp.contains("�") && !tmp.contains("ޚ")) {
                ltmp =(String)(Object) decode64(ltmp);
            } else if (!tmp2.contains("�") && !tmp2.contains("ޚ")) {
                ltmp =(String)(Object) decode64((String)(Object)inverteFrase(ltmp));
            }
            try {
                tmp =(String)(Object) decodeAscii(ltmp);
                tmp2 =(String)(Object) decodeAscii((String)(Object)inverteFrase(ltmp));
                if (!tmp.contains("") && !tmp.contains("�") && !tmp.contains("§") && !tmp.contains("½") && !tmp.contains("*") && !tmp.contains("\"") && !tmp.contains("^")) {
                    ltmp =(String)(Object) decodeAscii(ltmp);
                } else if (!tmp2.contains("") && !tmp2.contains("�") && !tmp2.contains("§") && !tmp2.contains("½") && !tmp2.contains("*") && !tmp2.contains("\"") && !tmp2.contains("^")) {
                    ltmp =(String)(Object) decodeAscii((String)(Object)inverteFrase(ltmp));
                }
            } catch (NumberFormatException e) {
            }
            cont++;
            if (ltmp.contains("http")) {
                newlink = ltmp;
                if ((boolean)(Object)precisaRepassar(newlink)) {
                    newlink = quebraLink(newlink);
                    if ((boolean)(Object)isValid(newlink)) {
                        return newlink;
                    }
                } else {
                    if ((boolean)(Object)isValid(newlink)) {
                        return newlink;
                    }
                }
            } else if (ltmp.contains("ptth")) {
                newlink =(String)(Object) inverteFrase(ltmp);
                if ((boolean)(Object)precisaRepassar(newlink)) {
                    newlink = quebraLink(newlink);
                    if ((boolean)(Object)isValid(newlink)) {
                        return newlink;
                    }
                } else {
                    if ((boolean)(Object)isValid(newlink)) {
                        return newlink;
                    }
                }
            }
        } while (!(Boolean)(Object)isValid(newlink) && cont <= 20);
        tmp = null;
        tmp2 = null;
        ltmp = null;
        String leitura = "";
        try {
            leitura =(String)(Object) readHTML(linkInit);
        } catch (ArithmeticException e) {
        }
        leitura = leitura.toLowerCase();
        if (leitura.contains("trocabotao")) {
            newlink = "";
            for (int i = leitura.indexOf("trocabotao"); i < leitura.length(); i++) {
                if (Character.isDigit(leitura.charAt(i))) {
                    int tmpInt = i;
                    while (Character.isDigit(leitura.charAt(tmpInt))) {
                        newlink += leitura.charAt(tmpInt);
                        tmpInt++;
                    }
                    cod = Integer.parseInt(newlink);
                    break;
                }
            }
            if (cod != 0) {
                for (int i = 7; i < linkInit.length(); i++) {
                    letra = linkInit.charAt(i);
                    if (letra == '/') {
                        newlink = linkInit.substring(0, i + 1) + "linkdiscover.php?cod=" + cod;
                        break;
                    }
                }
                DataInputStream dat = null;
                try {
                    URL url = new URL(newlink);
                    InputStream in = url.openStream();
                    dat = new DataInputStream(new BufferedInputStream(in));
                    leitura = "";
                    int dado;
                    while ((dado = dat.read()) != -1) {
                        letra = (char) dado;
                        leitura += letra;
                    }
                    newlink = leitura.replaceAll(" ", "");
                    if ((boolean)(Object)precisaRepassar(newlink)) {
                        newlink = quebraLink(newlink);
                        if ((boolean)(Object)isValid(newlink)) {
                            return newlink;
                        }
                    } else {
                        if ((boolean)(Object)isValid(newlink)) {
                            return newlink;
                        }
                    }
                } catch (MalformedURLException ex) {
                    System.out.println("URL mal formada.");
                } catch (IOException e) {
                } finally {
                    try {
                        if (dat != null) {
                            dat.close();
                        }
                    } catch (IOException e) {
                        System.err.println("Falha ao fechar fluxo.");
                    }
                }
            }
        }
        if ((boolean)(Object)precisaRepassar(linkInit)) {
            if (linkInit.substring(8).contains("http")) {
                newlink = linkInit.substring(linkInit.indexOf("http", 8), linkInit.length());
                if ((boolean)(Object)isValid(newlink)) {
                    return newlink;
                }
            }
        }
        newlink = "";
        StringBuffer strBuf = null;
        try {
            strBuf = new StringBuffer((int)(Object)readHTML(linkInit));
            for (String tmp3 :(String[])(Object) (Object[])(Object)getLibrary()) {
                if (strBuf.toString().toLowerCase().contains(tmp3)) {
                    for (int i = strBuf.toString().indexOf(tmp3); i >= 0; i--) {
                        if (strBuf.toString().charAt(i) == '"') {
                            for (int j = i + 1; j < strBuf.length(); j++) {
                                if (strBuf.toString().charAt(j) == '"') {
                                    if ((boolean)(Object)precisaRepassar(newlink)) {
                                        newlink = quebraLink(newlink);
                                        if ((boolean)(Object)isValid(newlink)) {
                                            return newlink;
                                        }
                                    } else {
                                        if ((boolean)(Object)isValid(newlink)) {
                                            return newlink;
                                        }
                                    }
                                } else {
                                    newlink += strBuf.toString().charAt(j);
                                }
                            }
                        }
                    }
                }
            }
        } catch (IOException ex) {
        }
        GUIQuebraLink.isBroken =(MyHelperClass)(Object) false;
        return "Desculpe o link não pode ser quebrado.";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass isBroken;
public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass decode64(String o0){ return null; }
	public MyHelperClass length(){ return null; }}
