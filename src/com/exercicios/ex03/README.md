# Exercício 03: Classe Produto e Gestão de Estoque

### 📝 Proposta
Crie uma classe chamada **Produto** com os seguintes requisitos:

**Atributos:**
* `nome`
* `preco`
* `quantidade`

**Métodos:**
* `adicionarEstoque()`: Aumenta a quantidade atual.
* `removerEstoque()`: Só remove se houver quantidade suficiente. Caso contrário, imprime: "Estoque insuficiente".
* `mostrarEstoque()`: Imprime o nome, preço e a quantidade atual em estoque.

### 🚀 Execução:
1. Instancie um objeto do tipo `Produto`.
2. Defina o nome e o preço.
3. Chame o método `adicionarEstoque()` com 10 unidades.
4. Chame o método `removerEstoque()` com 3 unidades.
5. Tente chamar o método `removerEstoque()` com 20 unidades.
6. Chame o método `mostrarEstoque()` para exibir o saldo final.

---
*Foco: Praticar métodos com parâmetros, alteração de estado e validação de estoque.*