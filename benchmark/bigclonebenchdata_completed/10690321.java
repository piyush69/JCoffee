import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10690321 {
public MyHelperClass[] toHashKey;
	public static MyHelperClass TMWtoUnicode;
	public static MyHelperClass HALF_C;
	public static MyHelperClass Manipulate;
	public MyHelperClass[] UnicodeToTMW;
	public static MyHelperClass UnicodeToTMW;
	public static MyHelperClass UnicodeUtils;
	public static MyHelperClass toHashKey;
	public static MyHelperClass NULL;
	public MyHelperClass binduMap;
	public static MyHelperClass NonUnicodeToTMW;
	public static MyHelperClass tibHash;
public MyHelperClass Manipulate;
	public static MyHelperClass ThdlDebug;
	public MyHelperClass toHashKey;
	public MyHelperClass[] NonUnicodeToTMW;
	public MyHelperClass HALF_C;
	public MyHelperClass UnicodeUtils;
	public MyHelperClass NULL;
	public MyHelperClass UnicodeToTMW;
	public static MyHelperClass validInputSequences;
	public MyHelperClass TMWtoUnicode;
//	public static MyHelperClass NonUnicodeToTMW;
	public static MyHelperClass TMWtoTM;
	public MyHelperClass tibHash;
public static MyHelperClass TMtoTMW;
	public static MyHelperClass REDUCED_C;
	public static MyHelperClass TMW;
//	public MyHelperClass[] TMWtoTM;
//	public MyHelperClass validInputSequences;
//	public MyHelperClass[] TMtoTMW;
//	public static MyHelperClass TMWtoTM;
	public static MyHelperClass TM;
	public static MyHelperClass getEscapedToken(StringTokenizer o0, StringBuffer o1){ return null; }
//public MyHelperClass REDUCED_C;
//	public MyHelperClass ThdlDebug;
//	public MyHelperClass TMtoTMW;
	public MyHelperClass DELIMITER;
//	public MyHelperClass TMW;
//	public MyHelperClass TMWtoTM;
//	public MyHelperClass NonUnicodeToTMW;
//	public MyHelperClass TM;
//	public MyHelperClass getEscapedToken(StringTokenizer o0, StringBuffer o1){ return null; }

    private static void readData()  throws Throwable {
        StringTokenizer sTok;
        HashSet topSet = NULL; //new HashSet();
        topSet = new HashSet();
        MyHelperClass tops = new MyHelperClass();
        sTok = new StringTokenizer((String)(Object)tops, ",");
//        MyHelperClass topSet = new MyHelperClass();
        while (sTok.hasMoreTokens()) topSet.add(sTok.nextToken());
        HashSet leftSet = NULL; //new HashSet();
        leftSet = new HashSet();
        MyHelperClass lefts = new MyHelperClass();
        sTok = new StringTokenizer((String)(Object)lefts, ",");
//        MyHelperClass leftSet = new MyHelperClass();
        while (sTok.hasMoreTokens()) leftSet.add(sTok.nextToken());
        HashSet rightSet = NULL; //new HashSet();
        rightSet = new HashSet();
        MyHelperClass rights = new MyHelperClass();
        sTok = new StringTokenizer((String)(Object)rights, ",");
//        MyHelperClass rightSet = new MyHelperClass();
        while (sTok.hasMoreTokens()) rightSet.add(sTok.nextToken());
        HashSet farRightSet = NULL; //new HashSet();
        farRightSet = new HashSet();
        MyHelperClass farrights = new MyHelperClass();
        sTok = new StringTokenizer((String)(Object)farrights, ",");
//        MyHelperClass farRightSet = new MyHelperClass();
        while (sTok.hasMoreTokens()) farRightSet.add(sTok.nextToken());
        HashSet vowelSet = NULL; //new HashSet();
        vowelSet = new HashSet();
        MyHelperClass vowels = new MyHelperClass();
        sTok = new StringTokenizer((String)(Object)vowels, ",");
        while (sTok.hasMoreTokens()) {
            String ntk;
//            MyHelperClass vowelSet = new MyHelperClass();
            vowelSet.add(ntk = sTok.nextToken());
            int maxEwtsVowelLength = NULL; //new int();
            if ((int)(Object)maxEwtsVowelLength < ntk.length()) maxEwtsVowelLength = ntk.length();
            MyHelperClass anyOldObjectWillDo = new MyHelperClass();
            validInputSequences.put(ntk, anyOldObjectWillDo);
        }
        HashSet puncSet = NULL; //new HashSet();
        puncSet = new HashSet();
        MyHelperClass others = new MyHelperClass();
        sTok = new StringTokenizer((String)(Object)others, ",");
        while (sTok.hasMoreTokens()) {
            String ntk;
//            MyHelperClass puncSet = new MyHelperClass();
            puncSet.add(ntk = sTok.nextToken());
            MyHelperClass anyOldObjectWillDo = new MyHelperClass();
            validInputSequences.put(ntk, anyOldObjectWillDo);
        }
        HashSet charSet = NULL; //new HashSet();
        charSet = new HashSet();
        HashSet tibSet = NULL; //new HashSet();
        tibSet = new HashSet();
        MyHelperClass tibetanConsonants = new MyHelperClass();
        sTok = new StringTokenizer((String)(Object)tibetanConsonants, ",");
        while (sTok.hasMoreTokens()) {
            String ntk;
//            MyHelperClass charSet = new MyHelperClass();
            charSet.add(ntk = sTok.nextToken());
//            MyHelperClass tibSet = new MyHelperClass();
            tibSet.add(ntk);
            MyHelperClass anyOldObjectWillDo = new MyHelperClass();
            validInputSequences.put(ntk, anyOldObjectWillDo);
        }
        HashSet sanskritStackSet = NULL; //new HashSet();
        sanskritStackSet = new HashSet();
        MyHelperClass otherConsonants = new MyHelperClass();
        sTok = new StringTokenizer((String)(Object)otherConsonants, ",");
        while (sTok.hasMoreTokens()) {
            String ntk;
//            MyHelperClass charSet = new MyHelperClass();
            charSet.add(ntk = sTok.nextToken());
//            MyHelperClass sanskritStackSet = new MyHelperClass();
            sanskritStackSet.add(ntk);
            MyHelperClass anyOldObjectWillDo = new MyHelperClass();
            validInputSequences.put(ntk, anyOldObjectWillDo);
        }
        HashSet numberSet = NULL; //new HashSet();
        numberSet = new HashSet();
        MyHelperClass numbers = new MyHelperClass();
        sTok = new StringTokenizer((String)(Object)numbers, ",");
        while (sTok.hasMoreTokens()) {
            String ntk;
//            MyHelperClass charSet = new MyHelperClass();
            charSet.add(ntk = sTok.nextToken());
//            MyHelperClass numberSet = new MyHelperClass();
            numberSet.add(ntk);
            MyHelperClass anyOldObjectWillDo = new MyHelperClass();
            validInputSequences.put(ntk, anyOldObjectWillDo);
        }
//        MyHelperClass charSet = new MyHelperClass();
        charSet.add("Y");
//        MyHelperClass charSet = new MyHelperClass();
        charSet.add("R");
//        MyHelperClass charSet = new MyHelperClass();
        charSet.add("W");
        MyHelperClass anyOldObjectWillDo = new MyHelperClass();
        validInputSequences.put("Y", anyOldObjectWillDo);
//        MyHelperClass anyOldObjectWillDo = new MyHelperClass();
        validInputSequences.put("R", anyOldObjectWillDo);
//        MyHelperClass anyOldObjectWillDo = new MyHelperClass();
        validInputSequences.put("W", anyOldObjectWillDo);
        sTok = null;
        HashSet top_vowels = NULL; //new HashSet();
        top_vowels = new HashSet();
        MyHelperClass i_VOWEL = new MyHelperClass();
        top_vowels.add(i_VOWEL);
        MyHelperClass e_VOWEL = new MyHelperClass();
        top_vowels.add(e_VOWEL);
        MyHelperClass o_VOWEL = new MyHelperClass();
        top_vowels.add(o_VOWEL);
        MyHelperClass ai_VOWEL = new MyHelperClass();
        top_vowels.add(ai_VOWEL);
        MyHelperClass au_VOWEL = new MyHelperClass();
        top_vowels.add(au_VOWEL);
        MyHelperClass reverse_i_VOWEL = new MyHelperClass();
        top_vowels.add(reverse_i_VOWEL);
        try {
            MyHelperClass fileName = new MyHelperClass();
            URL url = TibetanMachineWeb.class.getResource((String)(Object)fileName);
            if (url == null) {
//                MyHelperClass fileName = new MyHelperClass();
                System.err.println("Cannot find " + fileName + "; aborting.");
                System.exit(1);
            }
            InputStreamReader isr = new InputStreamReader(url.openStream());
            BufferedReader in = new BufferedReader(isr);
//            MyHelperClass fileName = new MyHelperClass();
            System.out.println("Reading Tibetan Machine Web code table " + fileName);
            String line;
            boolean hashOn = false;
            boolean isTibetan = false;
            boolean isSanskrit = false;
            boolean ignore = false;
            while ((line = in.readLine()) != null) {
                if (line.startsWith("<?")) {
                    if (line.equalsIgnoreCase("<?Consonants?>")) {
                        isSanskrit = false;
                        isTibetan = true;
                        hashOn = false;
                        ignore = false;
                        do {
                            line = in.readLine();
                        } while (line.startsWith("//") || line.equals(""));
                    } else if (line.equalsIgnoreCase("<?Numbers?>")) {
                        isSanskrit = false;
                        isTibetan = false;
                        hashOn = false;
                        ignore = false;
                        do {
                            line = in.readLine();
                        } while (line.startsWith("//") || line.equals(""));
                    } else if (line.equalsIgnoreCase("<?Vowels?>")) {
                        isSanskrit = false;
                        isTibetan = false;
                        hashOn = false;
                        ignore = false;
                        do {
                            line = in.readLine();
                        } while (line.startsWith("//") || line.equals(""));
                    } else if (line.equalsIgnoreCase("<?Other?>")) {
                        isSanskrit = false;
                        isTibetan = false;
                        hashOn = false;
                        ignore = false;
                        do {
                            line = in.readLine();
                        } while (line.startsWith("//") || line.equals(""));
                    } else if (line.equalsIgnoreCase("<?Input:Punctuation?>") || line.equalsIgnoreCase("<?Input:Vowels?>")) {
                        isSanskrit = false;
                        isTibetan = false;
                        hashOn = true;
                        ignore = false;
                    } else if (line.equalsIgnoreCase("<?Input:Tibetan?>")) {
                        isSanskrit = false;
                        isTibetan = true;
                        hashOn = true;
                        ignore = false;
                    } else if (line.equalsIgnoreCase("<?Input:Numbers?>")) {
                        isSanskrit = false;
                        isTibetan = false;
                        hashOn = true;
                        ignore = false;
                    } else if (line.equalsIgnoreCase("<?Input:Sanskrit?>")) {
                        isSanskrit = true;
                        isTibetan = false;
                        hashOn = true;
                        ignore = false;
                    } else if (line.equalsIgnoreCase("<?ToWylie?>")) {
                        isSanskrit = false;
                        isTibetan = false;
                        hashOn = false;
                        ignore = false;
                    } else if (line.equalsIgnoreCase("<?Ignore?>")) {
                        isSanskrit = false;
                        ignore = true;
                    }
                } else if (line.startsWith("//")) {
                    ;
                } else if (line.equals("")) {
                    ;
                } else {
                    MyHelperClass DELIMITER = new MyHelperClass();
                    StringTokenizer st = new StringTokenizer(line,(String)(Object) DELIMITER, true);
                    String wylie = null;
                    DuffCode[] duffCodes;
                    duffCodes = new DuffCode[11];
                    int k = 0;
                    StringBuffer escapedToken = new StringBuffer("");
                    MyHelperClass ThdlDebug = new MyHelperClass();
                    ThdlDebug.verify(escapedToken.length() == 0);
                    while (st.hasMoreTokens()) {
                        String val =(String)(Object) getEscapedToken(st, escapedToken);
                        if (val.equals(DELIMITER) && escapedToken.length() == 0) {
                            k++;
                        } else if (!val.equals("")) {
                            if (escapedToken.length() != 0) {
                                escapedToken = new StringBuffer("");
                                ThdlDebug.verify(escapedToken.length() == 0);
                            }
                            switch(k) {
                                case 0:
                                    wylie = val;
                                    break;
                                case 1:
                                    duffCodes[(int)(Object)TM] = new DuffCode(val, false);
                                    break;
                                case 2:
                                    if (!ignore) {
                                        duffCodes[(int)(Object)REDUCED_C] = new DuffCode(val, true);
                                    }
                                    break;
                                case 3:
                                    duffCodes[(int)(Object)TMW] = new DuffCode(val, true);
                                    if (null != duffCodes[(int)(Object)TM]) {
                                        TMtoTMW[(int)(Object)duffCodes[(int)(Object)TM].getFontNum() - 1][duffCodes[TM].getCharNum() - 32] = duffCodes[TMW];
                                    }
                                    if (null != TMWtoTM[(int)(Object)duffCodes[(int)(Object)TMW].getFontNum() - 1][duffCodes[TMW].getCharNum() - 32]) throw new Error("tibwn.ini is supposed to use the TibetanMachineWeb glyph as the unique key, but " + val + " appears two or more times.");
                                    TMWtoTM[(int)(Object)duffCodes[(int)(Object)TMW].getFontNum() - 1][duffCodes[TMW].getCharNum() - 32] = duffCodes[TM];
                                    if (wylie.toLowerCase().startsWith("\\uf0")) {
                                        int x = Integer.parseInt(wylie.substring("\\u".length()), 16);
                                        ThdlDebug.verify((x >= 0xF000 && x <= 0xF0FF));
                                        NonUnicodeToTMW[x - ''] =(MyHelperClass)(Object) new DuffCode[] { duffCodes[(int)(Object)TMW] };
                                    }
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                    if (!ignore) {
                                        try {
                                            duffCodes[k - 1] = new DuffCode(val, true);
                                        } catch (Exception e) {
                                            System.err.println("Couldn't make a DuffCode out of " + val + "; line is " + line + "; k is " + k);
                                        }
                                    }
                                    break;
                                case 10:
                                    if (!val.equals("none")) {
                                        StringBuffer unicodeBuffer = new StringBuffer();
                                        StringTokenizer uTok = new StringTokenizer(val, ",");
                                        while (uTok.hasMoreTokens()) {
                                            String subval = uTok.nextToken();
                                            ThdlDebug.verify(subval.length() == 4 || subval.length() == 3);
                                            try {
                                                int x = Integer.parseInt(subval, 16);
                                                ThdlDebug.verify((x >= 0x0F00 && x <= 0x0FFF) || x == 0x5350 || x == 0x534D || x == 0x0020 || x == 0x00A0 || x == 0x2003);
                                                unicodeBuffer.append((char) x);
                                            } catch (NumberFormatException e) {
                                                ThdlDebug.verify(false);
                                            }
                                        }
                                        TMWtoUnicode[(int)(Object)duffCodes[(int)(Object)TMW].getFontNum() - 1][duffCodes[TMW].getCharNum() - 32] = unicodeBuffer.toString();
                                        char ch;
                                        if (unicodeBuffer.length() == 1 && UnicodeUtils.isInTibetanRange(ch = unicodeBuffer.charAt(0))) {
                                            if (null != UnicodeToTMW[ch - 'ༀ'][0] && 'ༀ' != ch && '༂' != ch && '༃' != ch && '་' != ch && '༎' != ch && 'ཀ' != ch && 'ག' != ch && 'ཉ' != ch && 'ཏ' != ch && 'ད' != ch && 'ན' != ch && 'ཞ' != ch && 'ར' != ch && 'ཤ' != ch && 'ཧ' != ch && 'ཪ' != ch && 'ཱ' != ch && 'ི' != ch && 'ཱི' != ch && 'ུ' != ch && 'ཱུ' != ch && 'ྲྀ' != ch && 'ཷ' != ch && 'ླྀ' != ch && 'ཹ' != ch && 'ེ' != ch && 'ོ' != ch && 'ཾ' != ch && 'ཱྀ' != ch) {
                                                throw new Error("tibwn.ini has more than one TMW fellow listed that has the Unicode " + val + ", but it's not on the list of specially handled glyphs");
                                            }
                                            UnicodeToTMW[ch - 'ༀ'][0] = duffCodes[(int)(Object)TMW];
                                        }
                                    }
                                    break;
                                case 11:
                                    if (!ignore) {
                                        duffCodes[HALF_C] = new DuffCode(val, true);
                                    }
                                    break;
                                case 12:
                                    if (!ignore) {
                                        DuffCode binduCode = new DuffCode(val, true);
                                        binduMap.put(duffCodes[(int)(Object)TMW], binduCode);
                                    }
                                    break;
                                case 13:
                                    throw new Error("tibwn.ini has only 13 columns, you tried to use a 14th column.");
                            }
                        } else {
                            if (k == 10) {
                                throw new Error("needed none or some unicode; line is " + line);
                            }
                        }
                    }
                    if (k < 10) {
                        throw new Error("needed none or some unicode; line is " + line);
                    }
                    if (!ignore) {
                        if (null == wylie) throw new Error(fileName + " has a line ^" + DELIMITER + " which means that no Wylie is assigned.  That isn't supported.");
                        if (hashOn) {
                            tibHash.put(Manipulate.unescape(wylie), duffCodes);
                        }
                        if (isTibetan) {
                            StringBuffer wylieWithoutDashes = new StringBuffer(wylie);
                            for (int wl = 0; wl < wylieWithoutDashes.length(); wl++) {
                                if (wylieWithoutDashes.charAt(wl) == '-') {
                                    wylieWithoutDashes.deleteCharAt(wl);
                                    --wl;
                                }
                            }
                            tibSet.add(wylieWithoutDashes.toString());
                        }
                        if (isSanskrit) {
                            sanskritStackSet.add(wylie);
                        }
                        if (null == duffCodes[(int)(Object)TMW]) throw new Error(fileName + " has a line with wylie " + wylie + " but no TMW; that's not allowed");
                        int font =(int)(Object) duffCodes[(int)(Object)TMW].getFontNum();
                        int code =(int)(Object) duffCodes[(int)(Object)TMW].getCharNum() - 32;
                        toHashKey[font][code] = Manipulate.unescape(wylie);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("file Disappeared");
            ThdlDebug.noteIffyCode();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass verify(boolean o0){ return null; }
	public MyHelperClass unescape(String o0){ return null; }
	public MyHelperClass noteIffyCode(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass isInTibetanRange(char o0){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass put(String o0, MyHelperClass o1){ return null; }}

class DuffCode {

DuffCode(String o0, boolean o1){}
	DuffCode(){}
	public MyHelperClass getCharNum(){ return null; }
	public MyHelperClass getFontNum(){ return null; }}

class TibetanMachineWeb {

}
