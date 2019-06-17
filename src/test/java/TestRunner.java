import base.Homepage;
import org.testng.annotations.Test;
import base.SheetsQuickstart;
import utils.Utils;

import java.io.IOException;
import java.security.GeneralSecurityException;


public class TestRunner {
    private static Homepage home;
    private static SheetsQuickstart sheets;


    @Test
    public void feature() {
        //testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//        home = new Homepage();
//        home.setUp();
        System.out.println("test execution");


        /** TODO: remove this code block */
        /** This is just a sample to check out how the html parser works */
        String myHTMLString = "<a href='https://assistant.google.com/learn/' class='h-c-link' data-g-event='devices-section' ";
               myHTMLString += "data-g-action='clicked' data-g-label='cta:learn-page'>Learn more</a> about how you can get ";
               myHTMLString += "help from your Google&nbsp;Assistant.";


        /** Here you will see the html string with any tags it might have */
        System.out.println("HTML with tags: " + myHTMLString);
        /** Here you will see the cleaned string without any tags */
        System.out.println("HTML string without tags: " + Utils.htmlToText(myHTMLString));

        try {
            sheets = new SheetsQuickstart();
            sheets.authenticate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }

    }

}