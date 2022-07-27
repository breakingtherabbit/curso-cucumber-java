# language: pt
Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critérios de aceitação

Cenário: Deve executar especificação
  Dado que eu criei o arquivo corretamente
  Quando executá-lo
  Então a especificação deve finalizar com sucesso

Cenario: Deve incrementar contador
  Dado que o valor do contador é 15
  Quando eu incrementar em 5
  Então o valor do contador será 20

Cenario: Deve incrementar contador
  Dado que o valor do contador é 123
  Quando eu incrementar em 35
  Então o valor do contador será 158

Cenario: Deve calcular atraso no prazo de entrega
  Dado que o prazo é dia 05/04/2018
  Quando a entrega atrasar em 2 dias
  Entao a entrega será efetuada em 07/04/2018

Cenario: Deve calcular atraso no prazo de entrega
  Dado que o prazo é dia 05/04/2018
  Quando a entrega atrasar em 2 meses
  Entao a entrega será efetuada em 05/06/2018