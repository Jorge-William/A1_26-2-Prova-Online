# Orientação a objetos no catálogo

O programa separa o que um produto é da lista que guarda vários produtos. `Produto` é a classe. Caderno, caneta e mochila são objetos criados a partir dela.

```java
produtos.add(new Produto("caderno", 18.90, 40));
produtos.add(new Produto("caneta", 3.50, 120));
produtos.add(new Produto("mochila", 149.00, 15));
```

`new Produto(...)` chama o construtor. Cada chamada gera um objeto com o próprio nome, preço e quantidade. Os três ocupam o mesmo modelo, mas o estado de um não altera o dos outros. A `ArrayList<Produto>` guarda as referências desses objetos.

Os atributos estão privados:

```java
private String nome;
private double preco;
private int quantidadeEstoque;
```

`private` impede que `Main` leia ou altere `nome` diretamente. O acesso passa pelos métodos públicos `getNome`, `getPreco` e `getQuantidadeEstoque`. Isso é o encapsulamento: o dado fica dentro do objeto e só sai por uma operação prevista pela classe.

A busca usa essa fronteira. `Main` não compara o campo; pede o nome ao objeto:

```java
if (produto.getNome().equalsIgnoreCase(nomeBuscado)) {
    existe = true;
    break;
}
```

`toString` é o comportamento de apresentação. Quando o laço faz `System.out.println(produto)`, o Java chama esse método e imprime nome, preço e estoque no formato definido em `Produto`.

`Main` organiza a execução: cria a lista, instancia os produtos, percorre os objetos e consulta o nome. `Produto` concentra os dados e as operações de cada item.

Este projeto aplica classe, objeto, construtor, atributo, método e encapsulamento. Não há herança nem polimorfismo: nenhuma classe estende `Produto` e não existe sobrescrita de método entre subclasses.
