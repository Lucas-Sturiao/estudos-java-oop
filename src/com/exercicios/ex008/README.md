# Exercício 08: Classe Conta e Controle de Saldo

### 📝 Proposta
Crie uma classe chamada **Conta** com os seguintes requisitos:

**Atributos:**
* `titular`
* `saldo`

**Construtor:**
* Deve receber o `titular` e o `saldo inicial` no momento da criação do objeto.

**Métodos:**
* `depositar(double valor)`: Aumenta o saldo atual conforme o valor informado.
* `sacar(double valor)`: Só realiza a operação se houver saldo suficiente. Caso contrário, imprime: "Saldo insuficiente".
* `mostrarSaldo()`: Imprime o nome do titular e o saldo formatado em reais (R$).

### 🚀 Execução:
1. Instancie uma **Conta** com um saldo inicial de **100**.
2. Realize um depósito de **50**.
3. Realize um saque de **30**.
4. Tente realizar um saque de **200** (deve validar a falta de saldo).
5. Chame o método `mostrarSaldo()` para exibir o status final da conta.

---
*Foco: Praticar a persistência de estado em conta bancária e validações lógicas de saque.*