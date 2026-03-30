# Exercício 06: Classe Celular e Gerenciamento de Bateria

### 📝 Proposta
Crie uma classe chamada **Celular** com os seguintes requisitos:

**Atributos:**
* `marca`
* `modelo`
* `bateria`

**Construtor:**
* Deve receber `marca`, `modelo` e `bateria` e atribuí-los utilizando a palavra-chave **`this`**.

**Métodos:**
* `usar()`: Diminui a bateria conforme o tempo de uso. Se a carga for insuficiente para o tempo solicitado, imprime: "Bateria insuficiente".
* `carregar()`: Aumenta o nível da bateria conforme o valor informado.
* `mostrarStatus()`: Imprime a marca, o modelo e a porcentagem atual da bateria.

### 🚀 Execução (App)
1. Instancie um **Celular** iniciando com **50%** de bateria.
2. Chame o método `usar()` por **20** minutos.
3. Tente chamar o método `usar()` por **40** minutos (deve validar a falta de carga).
4. Chame o método `carregar()` com **30** de carga.
5. Chame o método `mostrarStatus()` para exibir o estado final do aparelho.

---
*Foco: Praticar construtores, métodos com parâmetros e lógica de decremento/incremento de estado.*