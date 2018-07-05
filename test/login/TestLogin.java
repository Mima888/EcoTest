
package login;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.LoginPage;

/**
 *
 * @author mica
 */
public class TestLogin {
  
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void test1 () throws IOException {
        Configuration.init();
        LoginPage loginPage = new LoginPage();
        loginPage.login();
}
}
