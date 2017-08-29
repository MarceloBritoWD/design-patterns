# Exercício de Singleton

## Problema
Num cenário em que você precisa controlar a abertura e fechamento de uma janela, você terá, que, toda vez no tempo de execução do programa, instanciar a janela para poder usar seus métodos de abrir fechar.


## Solução com Singleton
Com o uso do Design Pattern Singleton você pode controlar o instancia de um objeto, neste caso nossa janela, a solução encontrada foi criar um atributo privado e estático do tipo da classe e um método publice estático 'synchronized' que verifica se existe uma instância daquela classe e a retorna (caso não exista nenhuma instancia o mesmo cria).

## Conclusão
Dessa forma controlamos o instaciamento da classe, fazendo-a ser instanciada uma única vez, ganhando performance (pois já usamos uma instancia) e economizando consumo de memória (pois não precisamos instanciar várias vezes).