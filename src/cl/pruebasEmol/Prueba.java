package cl.pruebasEmol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        // Configura las opciones de Firefox
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        //tamaño y posicion
        firefoxOptions.addArguments("--window-position=800,750");
        firefoxOptions.addArguments("--window-size=800,500");
        //navegador se ejecuta sin interfaz visual headless(descomentar para utilizar)
        //firefoxOptions.addArguments("--headless");

        // Inicializa el controlador de Firefox con las opciones
        WebDriver driver = new FirefoxDriver(firefoxOptions);

        // Navegar a URL Emol
        driver.get("https://www.emol.com/");

        //modo full-screen
        driver.manage().window().fullscreen();

        //mostrar titulo de url
        String tituloWeb = driver.getTitle();
        System.out.println("el nombre de la Web es: " + tituloWeb);

        //extracion de un texto usando "By.id"
        WebElement element = driver.findElement(By.id("ucHomePage_cuHeader_cuFechaModificacion_emolfecha"));
        String titulo = element.getText();
        System.out.println("el texto del elemento es: " + titulo );

        //buscar varios elementos y retornar el numero de elementos encontrados x className
        List<WebElement> elements = driver.findElements(By.className("aspNetHidden"));
        int numberOfElements = elements.size();
        System.out.println("Número de elementos encontrados: " + numberOfElements);

        //seleccionar elementos por tagName "nav" extraer texto
        List<WebElement> tagElements = driver.findElements(By.tagName("li"));
        for (WebElement element1 : tagElements)
            System.out.println(element1.getText());
        System.out.println("-----------------------------");

        //explorar a traves de xpath
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"ucHomePage_cuHeader_menu_seccions\"]/li[4]/a"));
        String titulo2 = element2.getText();
        System.out.println("texto del elemento xpath: " + titulo2);

        //cierre de navegador
        driver.close();
    }
}


