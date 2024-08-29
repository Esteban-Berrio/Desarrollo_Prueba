package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        // Plugins de salida
        plugin = {
                "pretty"
        },
        // Configuraciones de características
        features = "src/test/resources/features", // Ruta donde se encuentran todos lso features
        glue = "steps" // Clases de steps
// monochrome = true // Descomenta para salida sin colores

)
public class TestRunner {
}