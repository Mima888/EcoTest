
package indexSlider;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.DashboardPage;
import pages.IndexSliderPage;
import pages.LoginPage;

public class TestIndexSlider {
    
    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static IndexSliderPage indexSliderPage;
    
    @BeforeClass
    public static void setUpClass() throws IOException {
        Configuration.init();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login();
    }
    
    @AfterClass
    public static void tearDownClass() throws InterruptedException {
        Thread.sleep(3000);
        loginPage.quitDriver();
    }
    
    @Before
    public void setUp() {
        indexSliderPage = dashboardPage.goToIndexSlider();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void addNewSlider() {
        indexSliderPage.addIS();
    }
    
    @Test
    public void editIndexSlider() {
//        indexSliderPage.editFirstSlide();
//        indexSliderPage.editLastSlide();
        indexSliderPage.editRandomSlide();
        
    }
}
