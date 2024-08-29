package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaPrincipal;

public class PruebaSteps {

    private PaginaPrincipal landingPage;

    public PruebaSteps() {
        landingPage = new PaginaPrincipal();  //Instancia de pagina principal para poder usar los  metodos
    }

    // Generacion de Steps para el registro de un usuario

    @Given("Entro la pagina demoblaze.com")
    public void NavegacionDemo() {
        landingPage.navegacion();
    }

    @When("clickeo el boton de registrar y ingreso mis datos")
    public void clickeoBotonRegistrar() {
        landingPage.clickRegistro();
        landingPage.procesoRegistroDeUsuario();
    }

    @And("se registra el usuario y clickeo aceptar en el Alert")
    public void clickEnVentanaEmergente() {
        landingPage.aceptarAlertas();
    }



    // Generacion de Steps para el proceso de Compra de un producto

    @Given("El usuario se encuentra en la pagina principal de Product Store")
    public void NavegacionPlataforma() {
        landingPage.navegacion();
        landingPage.esperarUnosSegundos(2);
    }

    @When("El usuario selecciona la categoria deseada {string}")
    public void seleccionarLaCategoriaDeseada(String categoria) {
        landingPage.seleccionarCategoriaDeseada(categoria);
    }

    @And("El usuario elige el producto deseada {string}")
    public void seleccionarElProductoDeseado(String producto) {
        landingPage.seleccionarProductoDeseado(producto); // Cambiado a seleccionarProducto
    }

    @And("El usuario agrega el producto al carrito usando el boton")
    public void agregarProductoCarrito() {
        landingPage.esperarUnosSegundos(1);
        landingPage.anadirAcarritoDeCompra();
        landingPage.esperarUnosSegundos(2);
    }

    @Then("Al parecer la  alerta se clickea en aceptar")
    public void clickEnAlertaGenerada() {
        landingPage.aceptarAlertas(); // Método corregido a aceptarAlertaRegistro
        landingPage.esperarUnosSegundos(1);
    }

    @And("se dirige al boton de carrito de compra")
    public void clickBotonCarritoDeCompra() {
        landingPage.irAVentanaCarritoDeCompra();
        landingPage.esperarUnosSegundos(1);
    }

    @And("Se clickea el boton de Place order")
    public void procederConLaCompra() {
        landingPage.clickBotonOrdenCarrito();
        landingPage.esperarUnosSegundos(1);
    }

    @When("Al aparecer los campos de la factura se rellenan")
    public void rellenarCamposFormulario() {
        landingPage.rellenarOrdenDeCompra();
        landingPage.esperarUnosSegundos(1);
    }

    @Then("Se clickea el boton de finalizar compra")
    public void clickBotonFinalizarCompra() {
        landingPage.clickBotonPurchace();
        landingPage.esperarUnosSegundos(2);
    }

}
