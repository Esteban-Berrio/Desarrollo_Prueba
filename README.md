# Proyecto de Prueba con Gradle, Selenium, Java, Serenity, y Cucumber
## Autor

Desarrollado por [Juan Esteban Ruales Berrio](https://github.com/Esteban-Berrio).
## Descripción

Este proyecto es una prueba  automatizada que utiliza un conjunto de tecnologías y herramientas para validar la funcionalidad de una aplicación web de ejemplo. Se han implementado pruebas de automatización con el propósito de demostrar las capacidades de las herramientas seleccionadas. Las cuales son : 

- **Gradle** 🛠️
- **Cucumber**🥒
- **Java** ☕
- **Serenity**🌟
- **Selenium** 💫


## Tecnologías Utilizadas en el desarollo de este Proyecto

## Gradle

Gradle se utiliza como la herramienta de automatización y gestión de dependencias del proyecto. Proporciona una forma flexible y potente de construir y gestionar proyectos Java.

![Gradle Logo](https://cdn.worldvectorlogo.com/logos/gradle-1.svg)
- **Versión Utilizada**: 8.0.2
- **Documentación**: [https://gradle.org](https://gradle.org)

## Gradle: Descripción General

Gradle es una herramienta de automatización de construcción moderna y flexible que se utiliza para la gestión de proyectos y la construcción de aplicaciones. Ofrece un enfoque basado en scripts para la definición de tareas de construcción y es compatible con una variedad de lenguajes y plataformas. Gradle es conocido por su rendimiento, escalabilidad y capacidad de configuración avanzada.

## Características de Gradle

1. **Construcción Basada en Scripts:**
   - Gradle utiliza un enfoque basado en scripts con un lenguaje de dominio específico (DSL) basado en Groovy o Kotlin para definir y configurar tareas de construcción. Esto permite una gran flexibilidad y personalización en la gestión de proyectos.

2. **Gestión de Dependencias:**
   - Gradle proporciona una gestión de dependencias robusta, permitiendo declarar y gestionar librerías y componentes necesarios para un proyecto. Soporta la resolución automática de versiones y la integración con repositorios como Maven Central y JCenter.

3. **Construcción Incremental:**
   - Gradle optimiza el proceso de construcción mediante la ejecución de tareas incrementales, donde solo se ejecutan las tareas que han cambiado desde la última construcción. Esto mejora el tiempo de construcción y la eficiencia.

4. **Configuración Avanzada:**
   - Gradle permite una configuración avanzada a través de sus archivos de script, como `build.gradle` o `settings.gradle`. Puedes definir tareas personalizadas, configurar plugins y ajustar el comportamiento de la construcción según las necesidades del proyecto.

## Ejemplo Básico de Configuración de Gradle


```groovy
// build.gradle: Ejemplo básico de configuración para un proyecto Java
plugins {
    id 'java'
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'junit:junit:4.13.2'
}

```

## Serenity: Descripción General

Serenity es un framework de automatización de pruebas para aplicaciones web que se integra con herramientas como Selenium y Cucumber. Está diseñado para facilitar la creación de pruebas automatizadas ricas y robustas, proporcionando funcionalidades avanzadas para la generación de informes, la gestión de pruebas y la integración con diferentes herramientas de desarrollo y pruebas.

![Serenity](https://i0.wp.com/automatenow.io/wp-content/uploads/2023/12/serenity-bdd-logo.png?fit=700%2C250&ssl=1)
- **Versión Utilizada**: 4.1.20
- **Documentación**: [https://serenity](https://serenity-bdd.github.io/docs/reporting/the_serenity_reports)
### Características de Serenity

1. **Generación de Informes Avanzados:**
   - Serenity ofrece una generación de informes detallados y visuales, que incluyen capturas de pantalla, descripciones de escenarios, y detalles de los pasos ejecutados. Los informes generados facilitan la comprensión del estado de las pruebas y ayudan a identificar problemas rápidamente.

2. **Integración con Cucumber y JUnit:**
   - Serenity se integra sin problemas con Cucumber para pruebas basadas en BDD (Behavior-Driven Development) y JUnit para pruebas unitarias y de integración. Esta integración permite utilizar la sintaxis de Gherkin para definir escenarios de prueba y aprovechar las capacidades de Serenity para reportes y gestión.

3. **Manejo de Datos de Entrada:**
   - Serenity facilita el manejo de datos de entrada en las pruebas, permitiendo que los datos de prueba sean parametrizados y reutilizados en diferentes escenarios. Esto ayuda a reducir la duplicación de código y a mantener las pruebas organizadas.

4. **Soporte para Pruebas de UI:**
   - Serenity trabaja en conjunto con Selenium para proporcionar un soporte robusto para pruebas de interfaz de usuario. Ofrece capacidades avanzadas para la automatización de interacciones con elementos de la página, así como para el manejo de ventanas emergentes y alertas.

## Selenium

Selenium es una herramienta para automatizar navegadores web. Se utiliza para realizar pruebas automatizadas en navegadores web y validar la funcionalidad de aplicaciones web.

![Selenium](https://res.cloudinary.com/damien1/w_800,c_scale,f_auto,q_auto,dpr_3.0/blog/selenium_logo.png)

- **Versión Utilizada**: La versión se administra a través de las dependencias de Gradle.
- **Documentación**: [https://www.selenium.dev/documentation/](https://www.selenium.dev/documentation/)

### Características de Selenium Principales de selenium

1. **Automatización de Navegadores:**
   - Selenium permite automatizar acciones como hacer clic, escribir texto, y navegar entre páginas en varios navegadores, incluyendo Chrome, Firefox, Safari, y Edge.
   - Ofrece soporte para múltiples lenguajes de programación, como Java, C#, Python, Ruby, y JavaScript.

2. **Compatibilidad con Múltiples Plataformas:**
   - Selenium puede ejecutarse en diferentes sistemas operativos, como Windows, macOS, y Linux, lo que facilita la realización de pruebas cruzadas en entornos diversos.

3. **Integración con Herramientas de Pruebas:**
   - Se integra fácilmente con frameworks de prueba como JUnit, TestNG, y Cucumber, lo que permite combinar pruebas de interfaz de usuario con pruebas unitarias y de integración.

4. **Comunicación con Navegadores Mediante WebDriver:**
   - Selenium utiliza la API de WebDriver para interactuar con los navegadores de manera directa, lo que proporciona un control preciso y detallado sobre la automatización del navegador.


### Java JDK 17

Java Development Kit (JDK) es un entorno de desarrollo para construir aplicaciones en Java. La versión 17 proporciona nuevas características y mejoras de rendimiento.

![Java](https://elblogdelaprogramacion.wordpress.com/wp-content/uploads/2018/10/logo-de-java-portada.jpg?w=640)
- **Versión Utilizada**: 17
- **Documentación**: [https://docs.oracle.com/en/java/javase/17/](https://docs.oracle.com/en/java/javase/17/)

## Java: Descripción General

Java es un lenguaje de programación de propósito general, orientado a objetos y de alto nivel. Fue diseñado con el objetivo de tener una sintaxis simple y legible, y es ampliamente utilizado para el desarrollo de aplicaciones en diversas plataformas, desde aplicaciones de escritorio hasta aplicaciones web y móviles.

### Características de Java

1. **Orientación a Objetos:**
   - Java es un lenguaje orientado a objetos, lo que significa que permite la creación de clases y objetos para organizar el código de manera modular y reutilizable. Los conceptos fundamentales incluyen encapsulamiento, herencia, y polimorfismo.

2. **Independencia de Plataforma:**
   - Java sigue el principio "write once, run anywhere" (escribe una vez, ejecuta en cualquier lugar). Las aplicaciones Java se compilan en bytecode que se ejecuta en la Máquina Virtual de Java (JVM), lo que permite que el mismo código se ejecute en diferentes plataformas sin necesidad de recompilación.

3. **Tipado Estático:**
   - Java es un lenguaje con tipado estático, lo que significa que los tipos de datos de las variables deben ser declarados explícitamente y se verifican en tiempo de compilación. Esto ayuda a detectar errores en etapas tempranas del desarrollo.


Una muestra como ejemplo del codigo usado para java en este proyecto es : 
```bash

public class LoginSteps {
    WebDriver driver;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
    }

    @When("the user enters username and password")
    public void the_user_enters_username_and_password() {
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login"));

        username.sendKeys("validUser");
        password.sendKeys("validPassword");
        loginButton.click();
    }
```


Donde se instancian clases y adjuntamos las Acciones @Given y @When a metodos para poder crear nuestros Test.

### Cucumber
![Cucumber](https://i.pinimg.com/originals/dd/be/20/ddbe20664a0e1e16a5706655616ee870.png)
Cucumber es una herramienta de testing que soporta el desarrollo dirigido por comportamiento (BDD). Se utiliza para describir las pruebas en un formato legible por humanos, facilitando la comprensión de las especificaciones del sistema.

- **Documentación**: [https://cucumber.io/docs](https://cucumber.io/docs)
`
Aqui un poco de contexto de como funciona : 


## Gherkin: Descripción General

Gherkin es un lenguaje simple y legible para describir escenarios de prueba en BDD (Behavior-Driven Development). Es usado por herramientas como Cucumber para definir las especificaciones de comportamiento de manera clara y comprensible para todos los miembros de un equipo, incluidos aquellos sin conocimientos técnicos.

## Estructura de un Escenario

Un escenario en Gherkin sigue una estructura simple y lógica que consiste en pasos definidos por palabras clave como `Given`, `When`, `Then`, `And`, y `But`. Aquí se detalla cada uno:

1. **`Given` (Dado que):**
   - Define el contexto inicial de la prueba.
   - Establece las condiciones previas o el estado inicial del sistema antes de que ocurra una acción específica.
   - Ejemplo:
     ```gherkin
     Given el usuario está en la página de inicio de sesión
     ```

2. **`When` (Cuando):**
   - Describe una acción que se realiza por el usuario o el sistema.
   - Representa el evento o la acción que se está probando.
   - Ejemplo:
     ```gherkin
     When el usuario introduce un nombre de usuario y una contraseña válidos
     ```

3. **`Then` (Entonces):**
   - Especifica el resultado esperado o la respuesta del sistema como consecuencia de la acción realizada en el paso `When`.
   - Verifica que el sistema se comporte como se espera.
   - Ejemplo:
     ```gherkin
     Then el usuario debería ser redirigido a la página principal
     ```

4. **`And` (Y):**
   - Se utiliza para conectar múltiples pasos o condiciones en una línea de pensamiento lógica.
   - Puede usarse con cualquier otro paso (`Given`, `When`, `Then`).
   - Ejemplo:
     ```gherkin
     And el mensaje de bienvenida debería mostrarse
     ```

5. **`But` (Pero):**
   - Se utiliza para especificar una condición negativa o un contraste en la secuencia de acciones o resultados.
   - Similar a `And`, pero denota una excepción o una situación diferente.
   - Ejemplo:
     ```gherkin
     But el usuario no debería ver el mensaje de error
     ```

## Ejemplo Completo de Escenario

```gherkin
Feature: Autenticación de usuario

  Scenario: Inicio de sesión exitoso
    Given el usuario está en la página de inicio de sesión
    When el usuario introduce un nombre de usuario y una contraseña válidos
    Then el usuario debería ser redirigido a la página principal
    And el mensaje de bienvenida debería mostrarse

````

## Configuración del Entorno

Asegúrate de configurar el `PATH` para el JDK y Gradle en tu sistema:

1. **Configura el `PATH` para el JDK**:

    Asegúrate de tener el JDK 17 instalado. Luego, agrega el `PATH` del JDK a tu entorno:

    - **Windows**:
      1. Abre el Panel de Control y selecciona "Sistema".
      2. Haz clic en "Configuración avanzada del sistema".
      3. En la pestaña "Opciones avanzadas", haz clic en "Variables de entorno".
      4. En "Variables del sistema", busca la variable `PATH` y edítala.
      5. Agrega la ruta del JDK (por ejemplo, `C:\Program Files\Java\jdk-17\bin`).
      6. Guarda los cambios y reinicia la terminal o el IDE.

    - **macOS/Linux**:
      1. Abre una terminal.
      2. Edita tu archivo de perfil (`~/.bashrc`, `~/.zshrc`, o `~/.profile` dependiendo de tu shell).
      3. Agrega la línea:
         ```bash
         export PATH=/path/to/jdk-17/bin:$PATH
         ```
      4. Guarda el archivo y ejecuta `source ~/.bashrc` (o el archivo correspondiente) para aplicar los cambios.

2. **Configura el `PATH` para Gradle** (si es necesario):

    Si has instalado Gradle manualmente, también necesitarás agregar su ruta al `PATH`:

    - **Windows**:
      Similar al JDK, agrega la ruta de Gradle (por ejemplo, `C:\Gradle\gradle-8.0.2\bin`).

    - **macOS/Linux**:
      Agrega la ruta de Gradle a tu archivo de perfil:
      ```bash
      export PATH=/path/to/gradle-8.0.2/bin:$PATH
      ```

## Estructura del Proyecto

La estructura del proyecto está organizada de la siguiente manera:


### Descripción de los Directorios

- **`src/test/java/pages`**: Contiene las clases de páginas que representan diferentes páginas de la aplicación web. Estas clases contienen métodos para interactuar con los elementos de la página.

- **`src/test/java/runner`**: Contiene la clase `TestRunner` que configura y ejecuta las pruebas utilizando Cucumber y Serenity.

- **`src/test/java/steps`**: Contiene las clases de definición de pasos para Cucumber. Estas clases implementan los métodos definidos en los archivos de características (`.feature`).

- **`src/test/resources/features`**: Contiene los archivos de características de Cucumber que describen los escenarios de prueba en lenguaje Gherkin.

- **`src/test/resources/serenity.conf`**: Contiene el directiorio que se encarga de configurar las opciones y los webdrivers  donde se ejecutaran los test (Firefox O Chrome) en este caso.

## Patron de desarrollo ulitizado en el desarrollo de esta Prueba : 

## Page Object Model (POM) en Pruebas Automatizadas

El **Page Object Model (POM)** es un patrón de diseño ampliamente utilizado en la automatización de pruebas. Este patrón promueve la creación de clases que representan páginas individuales o componentes específicos de una aplicación web. Cada clase encapsula la lógica para interactuar con la UI, lo que permite que los tests sean más limpios, mantenibles y reutilizables.

### Ventajas de POM

- **Separación de Concerns**: El código de prueba y la lógica de la UI están separados, facilitando el mantenimiento.
- **Reutilización de Código**: Las clases de página se pueden reutilizar en múltiples tests, reduciendo la duplicación de código.
- **Facilita la Mantenibilidad**: Al centralizar los localizadores y métodos de interacción en las clases de página, es más sencillo actualizar las pruebas cuando la UI cambia.

### Implementación Básica

Una implementación básica de POM incluye:

1. **Clase de Página**: Representa una página o componente específico, conteniendo los localizadores de elementos y métodos para interactuar con ellos.
2. **Métodos de Acción**: Métodos que encapsulan interacciones comunes, como hacer clic en un botón o ingresar texto en un campo.
3. **Tests**: Los tests utilizan estas clases de página para realizar acciones y verificar resultados, manteniendo el código de prueba limpio y enfocado en la lógica de validación.

## Ejecución de las Pruebas

Puedes ejecutar todas las pruebas utilizando Gradle con los siguientes comandos:


 ```bash
     gradle  test // Esto va a ejecutar toda la suite de pruebas 
```
 ```bash
Para ejecutar las pruebas en el navegador deseado ya sea chrome o firefox es importante revisar el archivo "serenity.properties"
 ```

 
 ```bash
#Si se deja comentando se usara en navegador por defecto Google Chrome

#Descomentar si se desea usar firefox como Driver

#  webdriver {
#      driver = firefox // cambiar para usar navegadores
#      firefox {
#         driver = "firefox"
#         capabilities {
#             browserName = "firefox"
#             "moz:firefoxOptions" {
#                 args = [] // Sin headless para ver el navegador 
#             }
#         }
#     }
#  }

 ```

 ## Ver los resultados de las pruebas en serenity 

 Una vez corramos la suit de test serenity nos creara un reporte, ese reporte se encuentra en la siguiente ruta:

 ```
target/site/serenity/index.html

 ```

 El cual podremos visualizar usando la extencion de "Live Server"

## Como ver los reportes 

 ```bash 
Si has hecho clic derecho en la carpeta serenity:
Selecciona "Open with Live Server".
Si has hecho clic derecho en el archivo index.html:
Selecciona "Open with Live Server".
 ```

 Y de esta manera se nos abrira el navegador con el reporte creado en serenity.


 ## Limpiar los reportes generados con serenity : 

 En este desarrollo se a implementado una funcion que se ejecuta por linea de comandos, que nos permite vaciar la carpeta que genera Serenity donde se almacenan los reportes, esto se realizo con el fin de agilizar el proceso de limpieza de los reportes acumulados en el proyecto :
```
 ./gradlew cleanSerenityReports

```
## Conclusión del Desarrollo

El uso combinado de **Gradle**, **Java**, **Selenium** y **Serenity** ha demostrado ser una solución efectiva y robusta para el desarrolo de esta prueba. Gradle ha facilitado la gestión de dependencias y la construcción de nuestro proyecto, mientras que Java ha proporcionado un entorno estable y familiar para el desarrollo de las pruebas. Selenium ha sido esencial para la automatización de la interacción con la interfaz de usuario, permitiendo validar de manera precisa el comportamiento del sistema bajo prueba. Serenity, por su parte, ha añadido una capa adicional de reportes detallados y fáciles de interpretar, lo que ha mejorado significativamente la transparencia y comprensión de los resultados de las pruebas.

## Problemas de Compatibilidad de Versiones

A lo largo del desarrollo,me  enfrente con  algunos desafíos relacionados con la compatibilidad de versiones entre estas herramientas. La rápida evolución de Selenium y Serenity, en particular, ha generado incompatibilidades ocasionales que requirieron ajustes en las versiones de las dependencias. Estos problemas subrayan la importancia de mantener las herramientas actualizadas y de verificar la compatibilidad antes de realizar cualquier actualización. En algunos casos, fue necesario investigar y aplicar soluciones específicas para resolver problemas que surgían al combinar ciertas versiones de Selenium y Serenity, lo cual nos permitió continuar con el desarrollo sin interrupciones significativas.



