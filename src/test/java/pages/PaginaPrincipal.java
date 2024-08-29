package pages;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

public class PaginaPrincipal extends BasePage {

    // Instancia del faker para generar datos aleatorios
    Faker faker = new Faker();

    // localizadores de pagina general
    private String botonDeRegistro = "/html/body/nav/div[1]/ul/li[8]/a";
    public String campoNombreUsuario = "//*[@id=\"sign-username\"]";
    public String campoPassword = "//*[@id=\"sign-password\"]";
    private String iniciarSesionButton = "/html/body/div[2]/div/div/div[3]/button[2]";
    public String anadirCarrito = "/html/body/div[5]/div/div[2]/div[2]/div/a";
    public String ventanaCarritoDeCompra = "//*[@id=\"cartur\"]";
    public String botonGenerarCompra = "//*[@id=\"page-wrapper\"]/div/div[2]/button";
    public String botonFinalizarCompra = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]";

    // localizadores de formulario de compra
    public String campoNombre = "//*[@id=\"name\"]";
    public String campoPais = "//*[@id=\"country\"]";
    public String campoCiudad = "//*[@id=\"city\"]";
    public String campoTarjetaCredito = "//*[@id=\"card\"]";
    public String campoMonth = "//*[@id=\"month\"]";
    public String campoYear = "//*[@id=\"year\"]";
    public String aceptarCompra = "/html/body/div[11]/div[7]/div/button";

    // Funciones para rellenar datos aleatorios en formularios
    private String nombreUsuario = faker.name().username();
    private String passwordUsuario = faker.internet().password();
    String pais = faker.country().name(); // Generar pais
    String creditCard = faker.finance().creditCard(CreditCardType.MASTERCARD); // Generar a tarjeta de credito ramdon
    String ciudad = faker.address().city(); // Generate a random city
    String mes = faker.options().option( // Generar el mes de una lista.
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December");

    String year = String.valueOf(faker.number().numberBetween(2000, 2030)); // Generar year por un rango maximo de fecha

    public PaginaPrincipal() {
        super();
    }

    public void navegacion() {
        navigateTo("https://www.demoblaze.com/");
    }

    // Selecciona una categoría en la tienda median Xpath con Filtro de texto
    public void seleccionarCategoriaDeseada(String categoria) {
        esperarUnosSegundos(1); // Pausa antes de interactuar
        clickElement(String.format("//a[contains(text(),'%s')]", categoria));
        esperarUnosSegundos(1);
    }

    // Selecciona un producto de la tienda median Xpath con Filtro de texto
    public void seleccionarProductoDeseado(String producto) {
        esperarUnosSegundos(1); // Pausa antes de interactuar
        clickElement(String.format("//a[contains(text(),'%s')]", producto));
        esperarUnosSegundos(1);
    }

    // Click en boton de registro
    public void clickRegistro() {
        clickElement(botonDeRegistro);
    }

    // Conjunto de methodos para registrar el usuario con datos aleatorios
    public void procesoRegistroDeUsuario() {
        esperarUnosSegundos(1);
        write(campoNombreUsuario, nombreUsuario);
        write(campoPassword, passwordUsuario);
        clickElement(iniciarSesionButton);
    }

    // Click boton para añadair el producto a carrito de comppra
    public void anadirAcarritoDeCompra() {
        clickElement(anadirCarrito);
    }

    // Ruta para ir a carrito de compra
    public void irAVentanaCarritoDeCompra() {
        clickElement(ventanaCarritoDeCompra);
    }

    // Click al boton ya con los productos seleccionados para proceder con la compra
    public void clickBotonOrdenCarrito() {
        clickElement(botonGenerarCompra);
    }

    public void aceptarAlertas() {
        esperarUnosSegundos(2); // Esperamos a que el mensaje sea totalmente visible
        String alerta = acceptarAlertaRegistro(); // Acepta la alerta después de hacer clic en iniciar sesión
        System.out.println("El texto de la alerta fue: " + alerta);
    }

    // Se rellena el formulario de datos requerido para la compra
    public void rellenarOrdenDeCompra() {
        esperarUnosSegundos(1); // Esperamos a que el mensaje sea totalmente visible
        write(campoNombre, nombreUsuario);
        write(campoPais, pais);
        write(campoCiudad, ciudad);
        write(campoTarjetaCredito, creditCard);
        write(campoMonth, mes);
        write(campoYear, year);
    }

    // Se finaliza el proceso de compra
    public void clickBotonPurchace() {
        esperarUnosSegundos(1);
        clickElement(botonFinalizarCompra);
    }

}