package cl.pruebasEmol;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
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
        System.out.println("el nombre de la Web es " + tituloWeb);

        //extracion de un texto usando "By.id"
        WebElement element = driver.findElement(By.id("ucHomePage_cuHeader_cuFechaModificacion_emolfecha"));
        String titulo = element.getText();
        System.out.println("el texto del elemento es: " + titulo );

        //cierre de navegador
        driver.close();
    }
}


