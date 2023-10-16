package Utils;
import PageObjectModel.PageObjectManager;

import java.io.IOException;

public class TestContext {
    public GenericUtils genericUtil;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;

    public TestContext() throws IOException
    {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebDriverManager());

    }
}
