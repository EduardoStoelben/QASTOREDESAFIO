package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static driver.Drivers.getDriver;
import static utils.Utils.*;

public class Carrinho {

    private WebDriver driver;

    public void validarPagina() {
        String title = getElement(By.className("cor-principal")).getText();
        Assert.assertEquals(title.toLowerCase(), "qa store desafio",
                "Não foi possível acessar a pagina");
    }

    public void adicionarProduto(){
        WebElement produto = getDriver().findElement(By.className("imagem-principal"));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(produto).perform();

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement iconeCarrinho = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("botao-comprar-ajax")));
        iconeCarrinho.click();

        WebElement iconeFechar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("fancybox-close")));
        iconeFechar.click();
    }

    public void menuProdutos() {
        WebElement produtoMenu = getDriver().findElement(By.className("categoria-id-15610605"));
        produtoMenu.click();
        adicionarProduto();
    }

    public void carrinho(){
        validarPagina();
        menuProdutos();
        WebElement iconeCarrinho = getDriver().findElement(By.className("carrinho"));
        iconeCarrinho.click();
    }

    public void inserirCupom(String cupom){
        elementSendKeys(By.id("usarCupom"),cupom);
    }

    public void aplicarCupom(){
        elementClick(By.id("btn-cupom"));
    }

    public void validarCupom(){
        isElementPresent(By.className("cupom-valor"));
    }

    public void validarAlerta(){
        isElementPresent(By.className("alert"));
    }

    public void removerCupom(){
        elementClick(By.className("remover-cupom"));
    }

    public void validarRemocaoCupom(){
        isElementPresent(By.id("usarCupom"));
    }
}