//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.*;

import java.io.IOException;
import java.security.GeneralSecurityException;


public class TestRunner {
    //private TestNGCucumberRunner testNGCucumberRunner;
    private static Homepage home;
    private static SheetsQuickstart sheets;

//    @BeforeClass
//    public void setUpClass() throws Exception {
//        //testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//        System.out.println("before");
//    }
//
    @Test
    public void feature() {
        //testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//        home = new Homepage();
//        home.setUp();
        System.out.println(">>>>>>> on test execution");

        try {
            sheets.authenticate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
//        System.out.println("before");
    }
//
//    /*@DataProvider
//    public Object[][] features() {
//        return testNGCucumberRunner.provideFeatures();
//    }*/
//
//    @AfterClass
//    public void tearDownClass() throws Exception {
//        //testNGCucumberRunner.finish();
//        System.out.println("after");
//    }

//    public static void main(String args[]) throws IOException, GeneralSecurityException {
        //home = new Homepage();
        //home.setUp();
        //sheets.authenticate();
//    }
}
