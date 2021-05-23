package day23;
import org.junit.runner.JUnitCore;

    public class ExecuteWithRun
    {
        public static void main(String[] args)
        {
            JUnitCore runner = new JUnitCore();
            runner.addListener(new ExecutionListener());
            runner.run(ForAllureTest.class);
        }
    }
