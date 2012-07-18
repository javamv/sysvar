package org.javamv.sysvar.acceptance.testdef;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created with IntelliJ IDEA.
 * User: VMoskalenko
 * Date: 17.07.12
 * Time: 22:33
 */
@RunWith(Cucumber.class)
@Cucumber.Options(features = "classpath:check_sysvar.feature",
        glue = "classpath:org/javamv/sysvar/acceptance/stepdef")
public class CheckSysvarIT {
}
