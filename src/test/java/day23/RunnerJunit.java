package day23;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class RunnerJunit {
    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            ForAllureTest
                    .class,
    })
    public class Junit4Day23Run {
    }
}
