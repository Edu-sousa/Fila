# Lista 01
Exercicio em Java    


5. Considerando a biblioteca Fila, já criada, faça:
Criar um projeto Java (ChamadoSim) e importe a biblioteca. Esse novo projeto simulará uma
necessidade de muitas empresas e instituições que atendem clientes, que é criar um canal de
geração de senhas para pessoas com alguma prioridade e pessoas que não tem nenhuma
prioridade.      
A classe Principal, no package view, deve ter na Main, a criação de 2 filas, a fila e a filaPrioritarios,
a inicialização das senhas dos prioritários e dos não prioritários e, por fim, deve dar ao usuário a
possibilidade de inserir uma nova senha na fila, uma nova senha na fila de prioritários ou chamar
uma pessoa para o atendimento. Um menu deve ser criado.      
A classe FilaController deve ter os métodos de validação das operações oferecidas na Main da
Classe Principal. Todos os métodos devem receber a fila criada no método Main como
parâmetro.        
• O método de inserir um novo elemento na fila;    
• O método de remover o primeiro elemento da fila, que será atendido. A fila não pode
estar vazia;    
• O método de chamado que deve seguir a seguinte regra:    
• Fazer 3 chamadas prioritárias para 1 da fila não prioritária    
• Se não houver prioritários, já se deve chamar dos não prioritários

[Lista 01 Completa](https://drive.google.com/file/d/1HlJSTR9WReHt-yPdpbqNCs1az8-6H8ZK/view)

# Lista 02
Exercicio em Java    

2.Uma determinada loja vende peças no atacado, mas, para comprar no atacado, cada cliente pode
comprar apenas um �po de peça. Criar uma aplicação java, baseada na biblioteca Fila Genérica, que faça:

A)  Criar um objeto model com os atributos: Nome String; QuantidadePecas int; ValorPecas float;

B)  Criar uma classe view (Principal.java) que, na main:
a. Inicialize uma nova fila
b. Insira 20 clientes com suas características, sendo:
i. Nome (Cliente1, Cliente2, Cliente3, ...)
ii. Quantidade de peças (Número entre 20 e 50)
iii. Valor das Peças (Número entre 5.00 e 100.00)

C)  Criar uma classe controller chamada OperacaoController, que tenha um método caixa(Fila:fila):
void, que receba a fila populada, como parâmetro, e faça, para cada Cliente:
a. Calcular o valor total da compra (quantidade * valor)
b. Exibir o nome do cliente, o valor total da compra        

D)  O método main da classe Principal.java deve chamar o método caixa(Fila: fila): void.
O método caixa(Fila: fila): void deve estar baseado nas operações da fila (insert(), remove(), list(), size(),
isEmpty())

[Lista 02 Completa](https://drive.google.com/file/d/1IRb9MC58dHtKN2Y1V3OUvfltEgAKV94E/view)



[Testes de Mesa dos outros exercicios Lista 01 e 02](https://drive.google.com/drive/u/0/folders/1-2LhjfAXoJfoy2H-34_DXX2aQw0slvY4)
