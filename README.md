# sistemas-distruidos-UFU-2019-2-Trab
Trabalho de sistemas distribuídos

**Descrição suscinta do serviço:** A ideia é fazer um jogo de truco(truco é um jogo de cartas), os jogadores vão acessar o jogo pelo site e neste site esses jogadores vão entrar em  salas (provavelmente grupos de 4 pessoas 2 contra 2) ao iniciar o jogo cada jogador joga sua carta apenas na sua vez e quando a carta é jogada todos os outros jogadores visualizam a jogada sem precisar recarregar a página. Se tivermos tempo podemos evoluir o jogo com um chat simples.

**Componentes**:

- **jogadores** (acessando pelo navegador)
- **servidor**
- **banco de dados**(se possivel um banco de dados mais rápido como um **no-sql** já que os dados vão ser alterados a todo momento.)

**Lista de testes a serem implementados**:

- **Testes unitários:** a lógica do truco vai ser validada automaticamente com teste unitários
- **Teste de recuperação de falhas:** validar se o servidor está salvando os dados no banco de dados.
- **Teste de concorrência / performance:** validar o numero de clientes que o servidor consegue suportar.
