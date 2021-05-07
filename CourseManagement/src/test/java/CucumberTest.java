import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =  {"classpath:features"},plugin = {"pretty", "html:target/cucumber/bagbasics"},
        glue = {"MyStepdefs.java"})
public class CucumberTest {

}