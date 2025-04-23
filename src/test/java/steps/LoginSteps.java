package steps;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.LoginPage;

import java.util.Map;

public class LoginSteps {
    LoginPage loginPage;


    @Before
    public void iniciaNavegador(){
        new Driver("chrome");
    }

    @After
    public void fecharNavegador(){
        Driver.getDriver().quit();
    }

    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
        Driver.getDriver().get("https://www.advantageonlineshopping.com/");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
    }
    @Quando("for realizado um clique fora da modal")
    public void forRealizadoUmCliqueForaDaModal() {
        loginPage.clickDivFechaModal();

    }
    @Entao("a janela modal dever ser fechada")
    public void aJanelaModalDeverSerFechada() throws Exception {
        try {
            loginPage.invisibilityOfBtnfechar();
        } catch (Exception e){
            throw new Exception("A janela modal não foi fechada");
        }

    }

    @Quando("for realizado um clique no icone de fechar modal")
    public void forRealizadoUmCliqueNoIconeDeFecharModal() {
        loginPage.clickBtnFechar();
        
    }

    @Quando("for realizado um clique no link Create New Account")
    public void forRealizadoUmCliqueNoLinkCreateNewAccount() {
        loginPage.clickLinkCreateAccount();
        
    }

    @Entao("a pagina Create New Account deve ser exibida")
    public void aPaginaCreateNewAccountDeveSerExibida() {

        
    }

    @Quando("os campos de login sejam preenchidos da seguinte forma")
    public void osCamposDeLoginSejamPreenchidosDaSeguinteForma(Map<String, String> map) {
        String username = map.get("login");
        String password = map.get("password");
        boolean remember = Boolean.parseBoolean(map.get("remember"));

        loginPage.setInpUserName(username);
        loginPage.setInpPassword(password);
        if (remember) loginPage.clickInpRemember();
    }

    @Quando("for realizado o clique no botao sign in")
    public void forRealizadoOCliqueNoBotaoSignIn() {
        loginPage.clickBtnSingIn();
    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() {

    }

    @Entao("o sistema apresenta mensagem de erro")
    public void oSistemaApresentaMensagemDeErro() {
        
    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() {
        boolean enabled = loginPage.isBtnSignIn();
        Assert.assertFalse(enabled);
    }
}
