package cl.pruebasEmol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Prueba {
    public static void main(String[] args) {
        // Configura las opciones de Firefox
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        //tamaño y posicion
        firefoxOptions.addArguments("--window-position=800,750");
        firefoxOptions.addArguments("--window-size=800,500");

        // Inicializa el controlador de Firefox con las opciones
        WebDriver webDriver = new FirefoxDriver(firefoxOptions);

        // Navegar a URL Emol
        webDriver.get("https://www.emol.com/");

        //modo full-screen
        webDriver.manage().window().fullscreen();

        //cierre de navegador
        webDriver.close();
    }
}


