import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13747998 {
public MyHelperClass CommonConstants;
	public MyHelperClass treasureTree;
	public MyHelperClass IOUtils;
	public MyHelperClass TreasureListsParser;
	public MyHelperClass TreasureLoader;
	public MyHelperClass ErrorViewCategory;
public MyHelperClass log;

    public  void DefaultMainControl(@NotNull final FileFilter scriptFileFilter, @NotNull final String scriptExtension, @NotNull final String scriptName, final int spellType, @Nullable final String spellFile, @NotNull final String scriptsDir, final ErrorView errorView, @NotNull final EditorFactory editorFactory, final boolean forceReadFromFiles, @NotNull final GlobalSettings globalSettings, @NotNull final ConfigSourceFactory configSourceFactory, @NotNull final PathManager pathManager, @NotNull final GameObjectMatchers gameObjectMatchers, @NotNull final GameObjectFactory gameObjectFactory, @NotNull final ArchetypeTypeSet archetypeTypeSet, @NotNull final ArchetypeSet archetypeSet, @NotNull final ArchetypeChooserModel archetypeChooserModel, @NotNull final AutojoinLists autojoinLists, @NotNull final AbstractMapManager mapManager, @NotNull final PluginModel pluginModel, @NotNull final DelegatingMapValidator validators, @NotNull final ScriptedEventEditor scriptedEventEditor, @NotNull final AbstractResources resources, @NotNull final Spells numberSpells, @NotNull final Spells> gameObjectSpells, @NotNull final PluginParameterFactory pluginParameterFactory, @NotNull final ValidatorPreferences validatorPreferences, @NotNull final MapWriter mapWriter)  throws Throwable {
        final XmlHelper xmlHelper;
        try {
            xmlHelper = new XmlHelper();
        } catch (final ParserConfigurationException ex) {
            log.fatal("Cannot create XML parser: " + ex.getMessage());
            throw new MissingResourceException("Cannot create XML parser: " + ex.getMessage(), null, null);
        }
        final AttributeRangeChecker attributeRangeChecker = new AttributeRangeChecker(validatorPreferences);
        final EnvironmentChecker environmentChecker = new EnvironmentChecker(validatorPreferences);
        final DocumentBuilder documentBuilder = xmlHelper.getDocumentBuilder();
        try {
            final URL url = IOUtils.getResource(globalSettings.getConfigurationDirectory(), "GameObjectMatchers.xml");
            final ErrorViewCollector gameObjectMatchersErrorViewCollector = new ErrorViewCollector(errorView, url);
            try {
                documentBuilder.setErrorHandler(new ErrorViewCollectorErrorHandler(gameObjectMatchersErrorViewCollector, ErrorViewCategory.GAMEOBJECTMATCHERS_FILE_INVALID));
                try {
                    final GameObjectMatchersParser gameObjectMatchersParser = new GameObjectMatchersParser(documentBuilder, xmlHelper.getXPath());
                    gameObjectMatchersParser.readGameObjectMatchers(url, gameObjectMatchers, gameObjectMatchersErrorViewCollector);
                } finally {
                    documentBuilder.setErrorHandler(null);
                }
            } catch (final IOException ex) {
                gameObjectMatchersErrorViewCollector.addWarning(ErrorViewCategory.GAMEOBJECTMATCHERS_FILE_INVALID, ex.getMessage());
            }
            final ValidatorFactory<G, A, R> validatorFactory = new ValidatorFactory<G, A, R>(validatorPreferences, gameObjectMatchers, globalSettings, mapWriter);
            loadValidators(validators, validatorFactory, errorView);
            editorFactory.initMapValidators(validators, gameObjectMatchersErrorViewCollector, globalSettings, gameObjectMatchers, attributeRangeChecker, validatorPreferences);
            validators.addValidator(attributeRangeChecker);
            validators.addValidator(environmentChecker);
        } catch (final FileNotFoundException ex) {
            errorView.addWarning(ErrorViewCategory.GAMEOBJECTMATCHERS_FILE_INVALID, "GameObjectMatchers.xml: " + ex.getMessage());
        }
        final GameObjectMatcher shopSquareMatcher = gameObjectMatchers.getMatcher("system_shop_square", "shop_square");
        if (shopSquareMatcher != null) {
            final GameObjectMatcher noSpellsMatcher = gameObjectMatchers.getMatcher("system_no_spells", "no_spells");
            if (noSpellsMatcher != null) {
                final GameObjectMatcher blockedMatcher = gameObjectMatchers.getMatcher("system_blocked", "blocked");
                validators.addValidator(new ShopSquareChecker<G, A, R>(validatorPreferences, shopSquareMatcher, noSpellsMatcher, blockedMatcher));
            }
            final GameObjectMatcher paidItemMatcher = gameObjectMatchers.getMatcher("system_paid_item");
            if (paidItemMatcher != null) {
                validators.addValidator(new PaidItemShopSquareChecker<G, A, R>(validatorPreferences, shopSquareMatcher, paidItemMatcher));
            }
        }
        Map<String, TreasureTreeNode> specialTreasureLists;
        try {
            final URL url = IOUtils.getResource(globalSettings.getConfigurationDirectory(), "TreasureLists.xml");
            final ErrorViewCollector treasureListsErrorViewCollector = new ErrorViewCollector(errorView, url);
            try {
                final InputStream inputStream = url.openStream();
                try {
                    documentBuilder.setErrorHandler(new ErrorViewCollectorErrorHandler(treasureListsErrorViewCollector, ErrorViewCategory.TREASURES_FILE_INVALID));
                    try {
                        final Document specialTreasureListsDocument = documentBuilder.parse(new InputSource(inputStream));
                        specialTreasureLists = TreasureListsParser.parseTreasureLists(specialTreasureListsDocument);
                    } finally {
                        documentBuilder.setErrorHandler(null);
                    }
                } finally {
                    inputStream.close();
                }
            } catch (final IOException ex) {
                treasureListsErrorViewCollector.addWarning(ErrorViewCategory.TREASURES_FILE_INVALID, ex.getMessage());
                specialTreasureLists = Collections.emptyMap();
            } catch (final SAXException ex) {
                treasureListsErrorViewCollector.addWarning(ErrorViewCategory.TREASURES_FILE_INVALID, ex.getMessage());
                specialTreasureLists = Collections.emptyMap();
            }
        } catch (final FileNotFoundException ex) {
            errorView.addWarning(ErrorViewCategory.TREASURES_FILE_INVALID, "TreasureLists.xml: " + ex.getMessage());
            specialTreasureLists = Collections.emptyMap();
        }
        final ConfigSource configSource = forceReadFromFiles ? configSourceFactory.getFilesConfigSource() : configSourceFactory.getConfigSource(globalSettings.getConfigSourceName());
        treasureTree = TreasureLoader.parseTreasures(errorView, specialTreasureLists, configSource, globalSettings);
        final ArchetypeAttributeFactory archetypeAttributeFactory = new DefaultArchetypeAttributeFactory();
        final ArchetypeAttributeParser archetypeAttributeParser = new ArchetypeAttributeParser(archetypeAttributeFactory);
        final ArchetypeTypeParser archetypeTypeParser = new ArchetypeTypeParser(archetypeAttributeParser);
        ArchetypeTypeList eventTypeSet = null;
        try {
            final URL url = IOUtils.getResource(globalSettings.getConfigurationDirectory(), CommonConstants.TYPEDEF_FILE);
            final ErrorViewCollector typesErrorViewCollector = new ErrorViewCollector(errorView, url);
            documentBuilder.setErrorHandler(new ErrorViewCollectorErrorHandler(typesErrorViewCollector, ErrorViewCategory.GAMEOBJECTMATCHERS_FILE_INVALID));
            try {
                final ArchetypeTypeSetParser archetypeTypeSetParser = new ArchetypeTypeSetParser(documentBuilder, archetypeTypeSet, archetypeTypeParser);
                archetypeTypeSetParser.loadTypesFromXML(typesErrorViewCollector, new InputSource(url.toString()));
            } finally {
                documentBuilder.setErrorHandler(null);
            }
            final ArchetypeTypeList eventTypeSetTmp = archetypeTypeSet.getList("event");
            if (eventTypeSetTmp == null) {
                typesErrorViewCollector.addWarning(ErrorViewCategory.TYPES_ENTRY_INVALID, "list 'list_event' does not exist");
            } else {
                eventTypeSet = eventTypeSetTmp;
            }
        } catch (final FileNotFoundException ex) {
            errorView.addWarning(ErrorViewCategory.TYPES_FILE_INVALID, CommonConstants.TYPEDEF_FILE + ": " + ex.getMessage());
        }
        if (eventTypeSet == null) {
            eventTypeSet = new ArchetypeTypeList();
        }
        scriptArchUtils = editorFactory.newScriptArchUtils(eventTypeSet);
        final ScriptedEventFactory<G, A, R> scriptedEventFactory = editorFactory.newScriptedEventFactory(scriptArchUtils, gameObjectFactory, scriptedEventEditor, archetypeSet);
        scriptArchEditor = new DefaultScriptArchEditor<G, A, R>(scriptedEventFactory, scriptExtension, scriptName, scriptArchUtils, scriptFileFilter, globalSettings, mapManager, pathManager);
        scriptedEventEditor.setScriptArchEditor(scriptArchEditor);
        scriptArchData = editorFactory.newScriptArchData();
        scriptArchDataUtils = editorFactory.newScriptArchDataUtils(scriptArchUtils, scriptedEventFactory, scriptedEventEditor);
        final long timeStart = System.currentTimeMillis();
        if (log.isInfoEnabled()) {
            log.info("Start to load archetypes...");
        }
        configSource.read(globalSettings, resources, errorView);
        for (final R archetype : archetypeSet.getArchetypes()) {
            final CharSequence editorFolder = archetype.getEditorFolder();
            if (editorFolder != null && !editorFolder.equals(GameObject.EDITOR_FOLDER_INTERN)) {
                final String[] tmp = StringUtils.PATTERN_SLASH.split(editorFolder, 2);
                if (tmp.length == 2) {
                    final String panelName = tmp[0];
                    final String folderName = tmp[1];
                    archetypeChooserModel.addArchetype(panelName, folderName, archetype);
                }
            }
        }
        if (log.isInfoEnabled()) {
            log.info("Archetype loading took " + (double) (System.currentTimeMillis() - timeStart) / 1000.0 + " seconds.");
        }
        if (spellType != 0) {
            new ArchetypeSetSpellLoader<G, A, R>(gameObjectFactory).load(archetypeSet, spellType, gameObjectSpells);
            gameObjectSpells.sort();
        }
        if (spellFile != null) {
            try {
                final URL url = IOUtils.getResource(globalSettings.getConfigurationDirectory(), spellFile);
                final ErrorViewCollector errorViewCollector = new ErrorViewCollector(errorView, url);
                documentBuilder.setErrorHandler(new ErrorViewCollectorErrorHandler(errorViewCollector, ErrorViewCategory.SPELLS_FILE_INVALID));
                try {
                    XMLSpellLoader.load(errorViewCollector, url, xmlHelper.getDocumentBuilder(), numberSpells);
                } finally {
                    documentBuilder.setErrorHandler(null);
                }
            } catch (final FileNotFoundException ex) {
                errorView.addWarning(ErrorViewCategory.SPELLS_FILE_INVALID, spellFile + ": " + ex.getMessage());
            }
            numberSpells.sort();
        }
        final File scriptsFile = new File(globalSettings.getMapsDirectory(), scriptsDir);
        final PluginModelParser<G, A, R> pluginModelParser = new PluginModelParser<G, A, R>(pluginParameterFactory);
        new PluginModelLoader<G, A, R>(pluginModelParser).loadPlugins(errorView, scriptsFile, pluginModel);
        new AutojoinListsParser<G, A, R>(errorView, archetypeSet, autojoinLists).loadList(globalSettings.getConfigurationDirectory());
        ArchetypeTypeChecks.addChecks(archetypeTypeSet, attributeRangeChecker, environmentChecker);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fatal(String o0){ return null; }}

class ErrorView {

}

class EditorFactory {

}

class G {

}

class A {

}

class R {

}

class GlobalSettings {

public MyHelperClass getConfigSourceName(){ return null; }
	public MyHelperClass getConfigurationDirectory(){ return null; }}

class ConfigSourceFactory {

public MyHelperClass getFilesConfigSource(){ return null; }}

class PathManager {

}

class GameObjectMatchers {

public MyHelperClass getMatcher(String o0){ return null; }
	public MyHelperClass getMatcher(String o0, String o1){ return null; }}

class GameObjectFactory {

}

class ArchetypeTypeSet {

}

class ArchetypeSet {

}

class ArchetypeChooserModel {

}

class AutojoinLists {

}

class AbstractMapManager {

}

class PluginModel {

}

class DelegatingMapValidator {

}

class ScriptedEventEditor {

}

class AbstractResources {

}

class Spells {

}

class NumberSpell {

}

class GameObjectSpell {

}

class PluginParameterFactory {

}

class ValidatorPreferences {

}

class MapWriter {

}

class NotNull {

}

class Nullable {

}

class XmlHelper {

public MyHelperClass getDocumentBuilder(){ return null; }
	public MyHelperClass getXPath(){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class AttributeRangeChecker {

}

class EnvironmentChecker {

}

class DocumentBuilder {

}

class ErrorViewCollector {

}

class ErrorViewCollectorErrorHandler {

}

class GameObjectMatchersParser {

}

class ValidatorFactory {

}

class GameObjectMatcher {

}

class ShopSquareChecker {

}

class PaidItemShopSquareChecker {

}

class TreasureTreeNode {

}

class Document {

}

class InputSource {

}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ConfigSource {

}

class ArchetypeAttributeFactory {

}

class DefaultArchetypeAttributeFactory {

}

class ArchetypeAttributeParser {

}

class ArchetypeTypeParser {

}

class ArchetypeTypeList {

}
