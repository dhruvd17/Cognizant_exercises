package org.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        ServiceTest.class,
        ApiServiceTest.class,
        FileServiceTest.class,
        NetworkServiceTest.class,
        MultiReturnServiceTest.class
})
public class AllTests {
}