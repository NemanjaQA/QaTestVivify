package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;
import tests_with_login.*;


@RunWith(Suite.class)

@Suite.SuiteClasses({
        RegistrationTest.class,
        LoginTest.class,
        CreateNewGalleryTest.class,
        EditGalleryTest.class,
        DeleteGalleryTest.class

})

public class TestSuites {
}
