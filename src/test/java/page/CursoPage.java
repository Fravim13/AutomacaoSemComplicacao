package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursoPage {

    private WebDriver driver;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitulo2() throws InterruptedException {
        Thread.sleep(3000);
        String xpathTitulo = "//section[4]/div/div/div/div[1]/div/div";
        WebElement h2Titulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = h2Titulo.getText();
        return titulo;
    }
}
