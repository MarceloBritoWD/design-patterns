# Padrão Observer

### A - Entendam funcionamento.
- Sim, no exemplo do Source Making ele utiliza uma referência para o subject e não o contrario, como visto em sala, ele utiliza essa referência para os Observers possam se auto adicionarem no subject, diferentemente do visto em sala, que esse controle era feito apenas pelo proprio Subject.

### B - Que outras formas poderíamos implementar o mesmo comportamento?
- Poderia ser feito da mesma maneira com interfaces;
- Poderia ser feito como visto em sala, onde apenas o Subject controlaria a adição e remoção dos Observers;
- Poderia ser feito com a classe Observable do java, o que não é indicado por quê queimará seu único cartucho de Herança;
- Ou ainda, se partirmos para outras tecnologia, esse comportamento poderia ser implementado com WebSockets;



### Padrão Event Aggregator
- Pelo que entendi o Event Aggregator funciona como um Facade de eventos, no qual os Observers o assinam e os Observables o Compôe. Dessa forma, no caso de existirem varios observables no código o Event Aggregator irá diminuir o acoplamento entre Observers e Observables.