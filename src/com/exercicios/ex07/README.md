# Exercício 07: Classe Lâmpada e Gerenciamento de Estado

### 📝 Proposta
Crie uma classe chamada **Lampada** com os seguintes requisitos:

**Atributos:**
* `marca`
* `potencia`
* `ligada`

**Construtor:**
* Deve receber `marca` e `potencia`.
* Toda lâmpada criada deve começar obrigatoriamente como **desligada**.

**Métodos:**
* `ligar()`: Altera o estado para ligado. Se já estiver ligada, informa ao usuário.
* `desligar()`: Altera o estado para desligado. Se já estiver desligada, informa ao usuário.
* `mostrarEstado()`: Imprime a marca, potência (em Watts) e se o estado atual é "Ligada" ou "Desligada".

### 🚀 Execução:
1. Instancie uma **Lâmpada**.
2. Chame o método `mostrarEstado()`.
3. Chame o método `ligar()`.
4. Tente chamar o método `ligar()` novamente (deve validar que já está ligada).
5. Chame o método `desligar()`.
6. Chame o método `mostrarEstado()` para conferir o estado final.

---
*Foco: Praticar lógica condicional com tipos booleanos e controle de fluxo.*