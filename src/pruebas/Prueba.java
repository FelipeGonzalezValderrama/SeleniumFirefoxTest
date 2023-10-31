package pruebas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prueba {
    public static void main(String[] args) {
        // la propiedad del sistema para el controlador Gecko (GeckoDriver) esta establecida en VM-OPTION

        // Iniciar el controlador de Firefox
        WebDriver driver = new FirefoxDriver();

        // Navegar a una URL
        driver.get("https://www.emol.com/");

        // Cerrar el navegador al finalizar

    }
}

