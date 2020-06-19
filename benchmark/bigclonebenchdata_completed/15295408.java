import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15295408 {
public MyHelperClass RESPONSE_MODIFICATIONS_DEFAULT;
	public MyHelperClass MODIFICATION_EXCLUDES_DEFAULT;
public MyHelperClass outputFile;
	public MyHelperClass htmlFile;

    private final long test(final boolean applyFilter, final int executionCount) throws Throwable, NoSuchAlgorithmException, NoSuchPaddingException, FileNotFoundException, IOException, RuleLoadingException {
        final boolean stripHtmlEnabled = true;
        final boolean injectSecretTokensEnabled = true;
        final boolean encryptQueryStringsEnabled = true;
        final boolean protectParamsAndFormsEnabled = true;
        final boolean applyExtraProtectionForDisabledFormFields = true;
        final boolean applyExtraProtectionForReadonlyFormFields = false;
        final boolean applyExtraProtectionForRequestParamValueCount = false;
        final ContentInjectionHelper helper = new ContentInjectionHelper();
        final RuleFileLoader ruleFileLoaderModificationExcludes =(RuleFileLoader)(Object) new ClasspathZipRuleFileLoader();
        ruleFileLoaderModificationExcludes.setPath(MODIFICATION_EXCLUDES_DEFAULT.getValue());
        final ContentModificationExcludeDefinitionContainer containerModExcludes = new ContentModificationExcludeDefinitionContainer(ruleFileLoaderModificationExcludes);
        containerModExcludes.parseDefinitions();
        helper.setContentModificationExcludeDefinitions(containerModExcludes);
        MyHelperClass Pattern = new MyHelperClass();
        final AttackHandler attackHandler = new AttackHandler(null, 123, 600000, 100000, 300000, 300000, null, "MOCK", false, false, 0, false, false, Pattern.compile("sjghggfakgfjagfgajgfjasgfs"), Pattern.compile("sjghggfakgfjagfgajgfjasgfs"), true, new AttackMailHandler());
        final SessionCreationTracker sessionCreationTracker = new SessionCreationTracker(attackHandler, 0, 600000, 300000, 0, "", "", "", "");
        final RequestWrapper request = new RequestWrapper(new RequestMock(), helper, sessionCreationTracker, "123.456.789.000", false, true, true);
        final RuleFileLoader ruleFileLoaderResponseModifications =(RuleFileLoader)(Object) new ClasspathZipRuleFileLoader();
        ruleFileLoaderResponseModifications.setPath(RESPONSE_MODIFICATIONS_DEFAULT.getValue());
        final ResponseModificationDefinitionContainer container = new ResponseModificationDefinitionContainer(ruleFileLoaderResponseModifications);
        container.parseDefinitions();
        final ResponseModificationDefinition[] responseModificationDefinitions = downCast(container.getAllEnabledRequestDefinitions());
        final List<Pattern> tmpPatternsToExcludeCompleteTag = new ArrayList<Pattern>(responseModificationDefinitions.length);
        final List<Pattern> tmpPatternsToExcludeCompleteScript = new ArrayList<Pattern>(responseModificationDefinitions.length);
        final List<Pattern> tmpPatternsToExcludeLinksWithinScripts = new ArrayList<Pattern>(responseModificationDefinitions.length);
        final List<Pattern> tmpPatternsToExcludeLinksWithinTags = new ArrayList<Pattern>(responseModificationDefinitions.length);
        final List<Pattern> tmpPatternsToCaptureLinksWithinScripts = new ArrayList<Pattern>(responseModificationDefinitions.length);
        final List<Pattern> tmpPatternsToCaptureLinksWithinTags = new ArrayList<Pattern>(responseModificationDefinitions.length);
        final List<WordDictionary> tmpPrefiltersToExcludeCompleteTag = new ArrayList<WordDictionary>(responseModificationDefinitions.length);
        final List<WordDictionary> tmpPrefiltersToExcludeCompleteScript = new ArrayList<WordDictionary>(responseModificationDefinitions.length);
        final List<WordDictionary> tmpPrefiltersToExcludeLinksWithinScripts = new ArrayList<WordDictionary>(responseModificationDefinitions.length);
        final List<WordDictionary> tmpPrefiltersToExcludeLinksWithinTags = new ArrayList<WordDictionary>(responseModificationDefinitions.length);
        final List<WordDictionary> tmpPrefiltersToCaptureLinksWithinScripts = new ArrayList<WordDictionary>(responseModificationDefinitions.length);
        final List<WordDictionary> tmpPrefiltersToCaptureLinksWithinTags = new ArrayList<WordDictionary>(responseModificationDefinitions.length);
        final List<Integer[]> tmpGroupNumbersToCaptureLinksWithinScripts = new ArrayList<Integer[]>(responseModificationDefinitions.length);
        final List<Integer[]> tmpGroupNumbersToCaptureLinksWithinTags = new ArrayList<Integer[]>(responseModificationDefinitions.length);
        for (int i = 0; i < responseModificationDefinitions.length; i++) {
            final ResponseModificationDefinition responseModificationDefinition = responseModificationDefinitions[i];
            if (responseModificationDefinition.isMatchesScripts()) {
                tmpPatternsToExcludeCompleteScript.add(responseModificationDefinition.getScriptExclusionPattern());
                tmpPrefiltersToExcludeCompleteScript.add(responseModificationDefinition.getScriptExclusionPrefilter());
                tmpPatternsToExcludeLinksWithinScripts.add(responseModificationDefinition.getUrlExclusionPattern());
                tmpPrefiltersToExcludeLinksWithinScripts.add(responseModificationDefinition.getUrlExclusionPrefilter());
                tmpPatternsToCaptureLinksWithinScripts.add(responseModificationDefinition.getUrlCapturingPattern());
                tmpPrefiltersToCaptureLinksWithinScripts.add(responseModificationDefinition.getUrlCapturingPrefilter());
                MyHelperClass ServerUtils = new MyHelperClass();
                tmpGroupNumbersToCaptureLinksWithinScripts.add(ServerUtils.convertSimpleToObjectArray(responseModificationDefinition.getCapturingGroupNumbers()));
            }
            if (responseModificationDefinition.isMatchesTags()) {
                tmpPatternsToExcludeCompleteTag.add(responseModificationDefinition.getTagExclusionPattern());
                tmpPrefiltersToExcludeCompleteTag.add(responseModificationDefinition.getTagExclusionPrefilter());
                tmpPatternsToExcludeLinksWithinTags.add(responseModificationDefinition.getUrlExclusionPattern());
                tmpPrefiltersToExcludeLinksWithinTags.add(responseModificationDefinition.getUrlExclusionPrefilter());
                tmpPatternsToCaptureLinksWithinTags.add(responseModificationDefinition.getUrlCapturingPattern());
                tmpPrefiltersToCaptureLinksWithinTags.add(responseModificationDefinition.getUrlCapturingPrefilter());
                MyHelperClass ServerUtils = new MyHelperClass();
                tmpGroupNumbersToCaptureLinksWithinTags.add(ServerUtils.convertSimpleToObjectArray(responseModificationDefinition.getCapturingGroupNumbers()));
            }
        }
        MyHelperClass ServerUtils = new MyHelperClass();
        final Matcher[] matchersToExcludeCompleteTag = ServerUtils.convertListOfPatternToArrayOfMatcher(tmpPatternsToExcludeCompleteTag);
//        MyHelperClass ServerUtils = new MyHelperClass();
        final Matcher[] matchersToExcludeCompleteScript = ServerUtils.convertListOfPatternToArrayOfMatcher(tmpPatternsToExcludeCompleteScript);
//        MyHelperClass ServerUtils = new MyHelperClass();
        final Matcher[] matchersToExcludeLinksWithinScripts = ServerUtils.convertListOfPatternToArrayOfMatcher(tmpPatternsToExcludeLinksWithinScripts);
//        MyHelperClass ServerUtils = new MyHelperClass();
        final Matcher[] matchersToExcludeLinksWithinTags = ServerUtils.convertListOfPatternToArrayOfMatcher(tmpPatternsToExcludeLinksWithinTags);
//        MyHelperClass ServerUtils = new MyHelperClass();
        final Matcher[] matchersToCaptureLinksWithinScripts = ServerUtils.convertListOfPatternToArrayOfMatcher(tmpPatternsToCaptureLinksWithinScripts);
//        MyHelperClass ServerUtils = new MyHelperClass();
        final Matcher[] matchersToCaptureLinksWithinTags = ServerUtils.convertListOfPatternToArrayOfMatcher(tmpPatternsToCaptureLinksWithinTags);
        final WordDictionary[] prefiltersToExcludeCompleteTag = (WordDictionary[]) tmpPrefiltersToExcludeCompleteTag.toArray(new WordDictionary[0]);
        final WordDictionary[] prefiltersToExcludeCompleteScript = (WordDictionary[]) tmpPrefiltersToExcludeCompleteScript.toArray(new WordDictionary[0]);
        final WordDictionary[] prefiltersToExcludeLinksWithinScripts = (WordDictionary[]) tmpPrefiltersToExcludeLinksWithinScripts.toArray(new WordDictionary[0]);
        final WordDictionary[] prefiltersToExcludeLinksWithinTags = (WordDictionary[]) tmpPrefiltersToExcludeLinksWithinTags.toArray(new WordDictionary[0]);
        final WordDictionary[] prefiltersToCaptureLinksWithinScripts = (WordDictionary[]) tmpPrefiltersToCaptureLinksWithinScripts.toArray(new WordDictionary[0]);
        final WordDictionary[] prefiltersToCaptureLinksWithinTags = (WordDictionary[]) tmpPrefiltersToCaptureLinksWithinTags.toArray(new WordDictionary[0]);
//        MyHelperClass ServerUtils = new MyHelperClass();
        final int[][] groupNumbersToCaptureLinksWithinScripts = ServerUtils.convertArrayIntegerListTo2DimIntArray(tmpGroupNumbersToCaptureLinksWithinScripts);
//        MyHelperClass ServerUtils = new MyHelperClass();
        final int[][] groupNumbersToCaptureLinksWithinTags = ServerUtils.convertArrayIntegerListTo2DimIntArray(tmpGroupNumbersToCaptureLinksWithinTags);
        MyHelperClass CryptoUtils = new MyHelperClass();
        final Cipher cipher = CryptoUtils.getCipher();
//        MyHelperClass CryptoUtils = new MyHelperClass();
        final CryptoKeyAndSalt key = CryptoUtils.generateRandomCryptoKeyAndSalt(false);
        MyHelperClass Cipher = new MyHelperClass();
        Cipher.getInstance("AES");
        MessageDigest.getInstance("SHA-1");
        final ResponseWrapper response = new ResponseWrapper(new ResponseMock(), request, attackHandler, helper, false, "___ENCRYPTED___", cipher, key, "___SEC-KEY___", "___SEC-VALUE___", "___PROT-KEY___", false, false, false, false, "123.456.789.000", new HashSet(), prefiltersToExcludeCompleteScript, matchersToExcludeCompleteScript, prefiltersToExcludeCompleteTag, matchersToExcludeCompleteTag, prefiltersToExcludeLinksWithinScripts, matchersToExcludeLinksWithinScripts, prefiltersToExcludeLinksWithinTags, matchersToExcludeLinksWithinTags, prefiltersToCaptureLinksWithinScripts, matchersToCaptureLinksWithinScripts, prefiltersToCaptureLinksWithinTags, matchersToCaptureLinksWithinTags, groupNumbersToCaptureLinksWithinScripts, groupNumbersToCaptureLinksWithinTags, true, false, true, true, true, true, true, true, true, true, true, false, false, true, "", "", (short) 3, true, false, false);
        final List durations = new ArrayList();
        for (int i = 0; i < executionCount; i++) {
            final long start = System.currentTimeMillis();
            Reader reader = null;
            Writer writer = null;
            try {
                reader = new BufferedReader(new FileReader((String)(Object)this.htmlFile));
                writer = new FileWriter((String)(Object)this.outputFile);
                if (applyFilter) {
                    writer = new ResponseFilterWriter(writer, true, "http://127.0.0.1/test/sample", "/test", "/test", "___SEC-KEY___", "___SEC-VALUE___", "___PROT-KEY___", cipher, key, helper, "___ENCRYPTED___", request, response, stripHtmlEnabled, injectSecretTokensEnabled, protectParamsAndFormsEnabled, encryptQueryStringsEnabled, applyExtraProtectionForDisabledFormFields, applyExtraProtectionForReadonlyFormFields, applyExtraProtectionForRequestParamValueCount, prefiltersToExcludeCompleteScript, matchersToExcludeCompleteScript, prefiltersToExcludeCompleteTag, matchersToExcludeCompleteTag, prefiltersToExcludeLinksWithinScripts, matchersToExcludeLinksWithinScripts, prefiltersToExcludeLinksWithinTags, matchersToExcludeLinksWithinTags, prefiltersToCaptureLinksWithinScripts, matchersToCaptureLinksWithinScripts, prefiltersToCaptureLinksWithinTags, matchersToCaptureLinksWithinTags, groupNumbersToCaptureLinksWithinScripts, groupNumbersToCaptureLinksWithinTags, true, true, false, true, true, true, true, true, true, true, true, false, false, true, "", "", (short) 3, true, false);
                    writer = new BufferedWriter(writer);
                }
                char[] chars = new char[16 * 1024];
                int read;
                while ((read = reader.read(chars)) != -1) {
                    if (read > 0) {
                        writer.write(chars, 0, read);
                    }
                }
                durations.add(new Long(System.currentTimeMillis() - start));
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException ignored) {
                    }
                }
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException ignored) {
                    }
                }
            }
        }
        long sum = 0;
        for (final Iterator iter = durations.iterator(); iter.hasNext(); ) {
            Long value = (Long) iter.next();
            sum += value.longValue();
        }
        return sum / durations.size();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass convertListOfPatternToArrayOfMatcher(List<Pattern o0){ return null; }
	public MyHelperClass generateRandomCryptoKeyAndSalt(boolean o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass convertArrayIntegerListTo2DimIntArray(List<Integer[] o0){ return null; }
	public MyHelperClass getCipher(){ return null; }}

class NoSuchPaddingException extends Exception{
	public NoSuchPaddingException(String errorMessage) { super(errorMessage); }
}

class RuleLoadingException extends Exception{
	public RuleLoadingException(String errorMessage) { super(errorMessage); }
}

class ContentInjectionHelper {

public MyHelperClass setContentModificationExcludeDefinitions(ContentModificationExcludeDefinitionContainer o0){ return null; }}

class RuleFileLoader {

}

class ClasspathZipRuleFileLoader {

}

class ContentModificationExcludeDefinitionContainer {

ContentModificationExcludeDefinitionContainer(RuleFileLoader o0){}
	ContentModificationExcludeDefinitionContainer(){}
	public MyHelperClass parseDefinitions(){ return null; }}

class AttackHandler {

}

class SessionCreationTracker {

SessionCreationTracker(){}
	SessionCreationTracker(AttackHandler o0, int o1, int o2, int o3, int o4, String o5, String o6, String o7, String o8){}}

class RequestWrapper {

RequestWrapper(){}
	RequestWrapper(RequestMock o0, ContentInjectionHelper o1, SessionCreationTracker o2, String o3, boolean o4, boolean o5, boolean o6){}}

class RequestMock {

}

class ResponseModificationDefinitionContainer {

ResponseModificationDefinitionContainer(RuleFileLoader o0){}
	ResponseModificationDefinitionContainer(){}
	public MyHelperClass parseDefinitions(){ return null; }
	public MyHelperClass getAllEnabledRequestDefinitions(){ return null; }}

class ResponseModificationDefinition {

public MyHelperClass isMatchesScripts(){ return null; }
	public MyHelperClass getScriptExclusionPrefilter(){ return null; }
	public MyHelperClass getCapturingGroupNumbers(){ return null; }
	public MyHelperClass getTagExclusionPattern(){ return null; }
	public MyHelperClass isMatchesTags(){ return null; }
	public MyHelperClass getUrlExclusionPattern(){ return null; }
	public MyHelperClass getUrlCapturingPattern(){ return null; }
	public MyHelperClass getTagExclusionPrefilter(){ return null; }
	public MyHelperClass getUrlCapturingPrefilter(){ return null; }
	public MyHelperClass getUrlExclusionPrefilter(){ return null; }
	public MyHelperClass getScriptExclusionPattern(){ return null; }}

class Pattern {

}

class WordDictionary {

}

class Matcher {

}

class Cipher {

}

class CryptoKeyAndSalt {

}

class ResponseWrapper {

ResponseWrapper(){}
	ResponseWrapper(ResponseMock o0, RequestWrapper o1, AttackHandler o2, ContentInjectionHelper o3, boolean o4, String o5, Cipher o6, CryptoKeyAndSalt o7, String o8, String o9, String o10, boolean o11, boolean o12, boolean o13, boolean o14, String o15, HashSet o16, WordDictionary[] o17, Matcher[] o18, WordDictionary[] o19, Matcher[] o20, WordDictionary[] o21, Matcher[] o22, WordDictionary[] o23, Matcher[] o24, WordDictionary[] o25, Matcher[] o26, WordDictionary[] o27, Matcher[] o28, int[][] o29, int[][] o30, boolean o31, boolean o32, boolean o33, boolean o34, boolean o35, boolean o36, boolean o37, boolean o38, boolean o39, boolean o40, boolean o41, boolean o42, boolean o43, boolean o44, String o45, String o46, short o47, boolean o48, boolean o49, boolean o50){}}

class ResponseMock {

}

class ResponseFilterWriter {

ResponseFilterWriter(Writer o0, boolean o1, String o2, String o3, String o4, String o5, String o6, String o7, Cipher o8, CryptoKeyAndSalt o9, ContentInjectionHelper o10, String o11, RequestWrapper o12, ResponseWrapper o13, boolean o14, boolean o15, boolean o16, boolean o17, boolean o18, boolean o19, boolean o20, WordDictionary[] o21, Matcher[] o22, WordDictionary[] o23, Matcher[] o24, WordDictionary[] o25, Matcher[] o26, WordDictionary[] o27, Matcher[] o28, WordDictionary[] o29, Matcher[] o30, WordDictionary[] o31, Matcher[] o32, int[][] o33, int[][] o34, boolean o35, boolean o36, boolean o37, boolean o38, boolean o39, boolean o40, boolean o41, boolean o42, boolean o43, boolean o44, boolean o45, boolean o46, boolean o47, boolean o48, String o49, String o50, short o51, boolean o52, boolean o53){}
	ResponseFilterWriter(){}}

class AttackMailHandler {

}
