package ua.cn.dmitrykrivenko.chain.of.responsibility;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class ChainOfResponsibilityTest {

    private Parser xmlParser;
    private Parser csvParser;
    private Parser jsonParser;
    private Parser textParser;

    @Before
    public void setUp() {
        xmlParser = new XmlParser();
        csvParser = new CsvParser(xmlParser);
        jsonParser = new JsonParser(csvParser);
        textParser = new TextParser(jsonParser);
    }

    @Test
    public void testTxtParser() {
        Assert.assertTrue(textParser.parse("testfile.txt"));
    }

    @Test
    public void testXmlParser() {
        Assert.assertTrue(textParser.parse("testfile.xml"));
    }

    @Test
    public void testJsonParser() {
        Assert.assertTrue(textParser.parse("testfile.json"));
    }

    @Test
    public void testCsvParser() {
        Assert.assertTrue(textParser.parse("testfile.csv"));
    }

    @Test
    public void testUnsupportedFileFormat() {
        Assert.assertFalse(textParser.parse("testfile.doc"));
    }
}
