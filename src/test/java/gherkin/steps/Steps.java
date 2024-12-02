package gherkin.steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import pageobjects.Carrinho;

public class Steps {

    Carrinho carrinho;

    public Steps() {
        carrinho = new Carrinho();
    }

    @Dado("que estou na tela do carrinho com pelo menos um item adicionado")
    public void acessarTelaCarrinho() {
        carrinho.carrinho();
    }

    @Quando("eu insiro o cupom {string} no campo de cupom")
    public void inserirCupom(String cupom) {
        carrinho.inserirCupom(cupom);
    }

    @Quando("clico no botão de usar cupom")
    public void clico_no_botão_de_usar_cupom() {
        carrinho.aplicarCupom();
    }

    @Entao("o cupom deve ser aplicado")
    public void o_cupom_deve_ser_aplicado() {
        carrinho.validarCupom();
    }

    @Entao("o sistema deve exibir um alerta")
    public void o_sistema_deve_exibir_um_alerta() {
        carrinho.validarAlerta();
    }

    @Dado("que estou na tela do carrinho com pelo menos um item adicionado e um cupom já aplicado")
    public void acessarCarrinhoComCupomAplicado() {
        carrinho.carrinho();
        carrinho.inserirCupom("10OFF");
        carrinho.aplicarCupom();
        carrinho.validarCupom();
    }

    @Quando("eu clico no botão remover próximo ao cupom aplicado")
    public void eu_clico_no_botão_remover_próximo_ao_cupom_aplicado() {
        carrinho.removerCupom();
    }

    @Entao("o desconto do cupom deve ser removido")
    public void validarRemocaoDesconto() {
         carrinho.validarRemocaoCupom();
    }

}
