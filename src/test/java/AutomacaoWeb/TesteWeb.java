package AutomacaoWeb;

import core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import page.CursoPage;
import page.PrincipalPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteWeb {

   Driver driverWeb;

   WebDriver driver;

   PrincipalPage principalPage;
   CursoPage cursoPage;

    @Before
    public void inicializaTeste() {
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);
    }

    @Test
    public void primeiroTeste() {
        String titulo = principalPage.getTitulo();
        assertEquals("Porque Tempo É Conhecimento.", titulo);

    }

    @Test
    public void segundoTeste() throws InterruptedException {
        cursoPage = new CursoPage(driver);
        principalPage.clickBotao();
        String titulo = cursoPage.getTitulo2();

        assertEquals("Conheça todos os nossos cursos.", titulo);

    }

    @After
    public void finalizaTeste() {
        driver.quit();
    }
}

