# Lógica booleana no catálogo

A lógica booleana deste programa responde a uma pergunta de sim ou não: o nome buscado já está no catálogo?

O tipo `boolean` só aceita dois valores, `true` e `false`. Em cada busca a variável `existe` começa em `false`, ou seja, a resposta provisória é que o produto não foi encontrado.

```java
String nomeBuscado = "mochila";
boolean existe = false;
for (Produto produto : produtos) {
    if (produto.getNome().equalsIgnoreCase(nomeBuscado)) {
        existe = true;
        break;
    }
}
```

`equalsIgnoreCase` devolve um `boolean`. O `if` só entra no bloco quando essa comparação é `true`, isto é, quando o nome do produto é igual ao nome buscado, sem distinguir maiúsculas de minúsculas. Aí `existe` passa a `true` e o `break` encerra o laço, porque uma ocorrência já basta.

Na segunda busca, `existe = false` zera a resposta anterior. Sem isso, o `true` da mochila continuaria valendo para o lápis. O laço percorre caderno, caneta e mochila, nenhuma comparação é `true`, e `existe` permanece `false`.

Por isso a saída é:

```
mochila esta no catalogo? true
lapis esta no catalogo? false
```

Não há combinação de condições com `&&` ou `||`. Cada decisão é uma única comparação, e `existe` guarda o resultado dela.
