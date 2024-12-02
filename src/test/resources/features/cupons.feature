#language: pt
#encoding: utf-8

Funcionalidade: Aplicação de cupons no carrinho de compras
  Como um cliente
  Quero aplicar cupons de desconto no carrinho
  Para obter benefícios como descontos ou frete grátis

  Esquema do Cenário: Aplicar cupons válidos no carrinho
    Dado que estou na tela do carrinho com pelo menos um item adicionado
    Quando eu insiro o cupom "<cupom>" no campo de cupom
    E clico no botão de usar cupom
    Então o cupom deve ser aplicado

    Exemplos:
      | cupom       |
      | 10OFF       |
      | 30REAIS     |
      | FRETEGRATIS |
      | AJJFLWBHH   |

  Esquema do Cenário: Aplicar cupons inválidos no carrinho
    Dado que estou na tela do carrinho com pelo menos um item adicionado
    Quando eu insiro o cupom "<cupom>" no campo de cupom
    E clico no botão de usar cupom
    Então o sistema deve exibir um alerta

    Exemplos:
      | cupom        |
      | CUPOMVENCIDO |
      | EDU123       |

  Cenário: Remover cupom aplicado
    Dado que estou na tela do carrinho com pelo menos um item adicionado e um cupom já aplicado
    Quando eu clico no botão remover próximo ao cupom aplicado
    Então o desconto do cupom deve ser removido
