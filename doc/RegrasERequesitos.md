# Regras e Requisitos

## Regras de Negócio

* **RN1**: O acesso do cliente aos conteúdos do serviço deverá ocorrer exclusivamente por meios de entrada controlados pelo sistema, não sendo permitida a inserção direta de dados nem a manipulação direta do serviço pelo cliente.
  **RFs relacionados**: RF0

* **RN2**: A disponibilização do serviço ao cliente deverá ocorrer, sempre que possível, por meio de automações ágeis e funcionais, de modo que o cliente não seja obrigado a realizar sobrescrita de informações ou manipulação direta do serviço.
  **RFs relacionados**: RF1, RF2, RF3, RF6, RF7, RF9

* **RN3**: Após a conclusão do registro de dados pelo cliente, o serviço deverá, durante todo o seu ciclo de vida, fornecer *feedbacks* claros sobre o estado de prontidão do processamento e, em caso de falha, apresentar informações de erro de forma explícita ao cliente.
  **RFs relacionados**: RF4, RF5

* **RN4**: Após um processo concluído com sucesso, o serviço deverá criar registros locais de informações referentes ao funcionamento do cliente e, quando necessário, ao funcionamento do sistema. Em caso de falha no processo, o sistema deverá garantir que nenhum registro local de informações seja criado.
  **RFs relacionados**: RF8

## Requisitos Funcionais

* **RF0**: O sistema deve conter campos de escolha e/ou direcionamento para dados estruturados ao usuário.

* **RF1**: O sistema deverá conter um mecanismo automatizado de manipulação de diretórios e arquivos, com acesso controlado por privilégios ao respectivo sistema base.

* **RF2**: O sistema deverá conter um diretório/repositório padrão e controlado para a manipulação de arquivos `.jar` e demais artefatos de automação.

* **RF3**: O sistema deverá permitir a leitura e escrita no diretório de automação de arquivos `.jar`, disponibilizado pelo próprio sistema.

* **RF4**: O sistema deverá disponibilizar um conjunto de janelas *Pop-up* para comunicação com o usuário, incluindo mensagens de sucesso, falha e aviso.

* **RF5**: O sistema deverá conter uma interface de barra de carregamento, expondo uma variável global responsável pela contagem de registros de processamento.

* **RF6**: O sistema deverá conter funcionalidade para limpeza de campos e *reset* da variável global contadora, tanto para processos com falha quanto para processos bem-sucedidos.

* **RF7**: O sistema deverá disponibilizar processos de criação, leitura, atualização e remoção (CRUD) para a execução automatizada da passagem de arquivos `.jar`.

* **RF8**: O sistema deverá conter funcionalidade dedicada à leitura, escrita e atualização de documentos em formato `.txt` (entre outros tipos), sob responsabilidade documental do sistema.

* **RF9**: O sistema deverá conter funcionalidade de interpretação de comandos, bem como uma padronização para leitura e escrita de arquivos documentais.

## Requisitos não Funcionais

* **RNF0**: O sistema, bem como os seus respectivos processos, deverá garantir 99,9% de integridade na transmissão e no processamento de quaisquer dados relacionados a serviços e funcionalidades de persistência.

* **RNF1**: O sistema deverá ser desenvolvido utilizando a linguagem Java SE 21, sob domínio da Oracle Corporation, fazendo uso de suas APIs oficialmente disponíveis, incluindo NIO/IO para manipulação de arquivos e Swing para a interface gráfica (GUI).

* **RNF2**: O sistema deverá garantir comunicação integral com o sistema base (Sistema Operacional), possibilitando acesso administrativo e operações de criação, leitura, atualização e remoção (CRUD), respeitando as permissões e políticas do ambiente.

* **RNF3**: O sistema deverá adotar como base o padrão de organização arquitetural MVC moderno para aplicações Desktop, estabelecendo associações claras entre classes e promovendo a organização do código conforme boas práticas do padrão MVC.

* **RNF4**: O sistema deverá garantir total disponibilidade de execução nos sistemas operacionais Linux e Windows, respeitando as particularidades de cada ambiente.

* **RNF5**: O sistema deverá conter mecanismos de controle de qualidade sobre as ações executadas, abrangendo aspectos de experiência do cliente (UX), interface gráfica (UI/GUI) e operações de CRUD no sistema base (Sistema Operacional).

