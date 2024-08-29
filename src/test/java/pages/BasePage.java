package pages;

// Importaciones necesarias
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.Serenity;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    // iniciamos webdriver
    public BasePage() {
        this.driver = Serenity.getWebdriverManager().getWebdriver();  // instanciamos el webdriver de serenity
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Le damos 5 minutos de espera para iniciarce 
        maximizeWindow(); // Hacemos que la ventana sea grande para de esta manera encontrar los localizadores 
    }

    // Metodo de navegacion
    public void navigateTo(String url) {
        driver.get(url);
    }

    // Metodo para cerrar el navegador
    public void closeBrowser() {
        driver.quit();
    }

    // Método para maximizar la ventana del navegador
    private void maximizeWindow() {
        driver.manage().window().maximize();
    }

    // Metodo para clickear usando Xpath
    private WebElement find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    // Metodo para clickear elementos
    public void clickElement(String locator) {
        find(locator).click();
    }

    // Metodo para escribir texto
    public void write(String locator, String text) {
        find(locator).sendKeys(text);
    }

    // Aceptar una alerta presente
    public void acceptAlert() {
        Alert alerta = wait.until(ExpectedConditions.alertIsPresent());
        alerta.accept();
    }

    // Metodo para esperar unos segundos
    public void esperarUnosSegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Aceptar la alerta que se crea al registrar
    public String acceptarAlertaRegistro() {
        esperarUnosSegundos(2);
        Alert alert = driver.switchTo().alert();

        // Extraer el texto de la alerta y guardarlo en una variable
        String alertaTexto = alert.getText();

        alert.accept(); // Aceptar alerta

        // Retornar el texto de la alerta
        return alertaTexto;
    }
}