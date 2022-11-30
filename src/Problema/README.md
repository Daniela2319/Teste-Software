# Introdução a Teste de Softwares

### Definição

 "Testes de software é o processo de execução de um produto para determinar se ele atingiu suas
especificações e funcionou corretamente no ambiente para o qual foi projetado" (Dias Neto).


### Verificação e Validação

* **_Verificação:_** Esta construindo o sistema certo?
* **_Validação:_** Esta construindo o software certo?

### Níveis e Técnicas de Teste

 **Unidade -> Integração -> Sistema -> Regressão -> Aceitação ->**
 
#### Teste de Unidade

 O teste de unidade enfoca a verificação dos menores elementos testáveis do software. Normalmente o teste de unidade
é aplicado aos componentes representados no modelo de implementação para verificar se os fluxos de controle e de dados
estão cobertos e se eles funcionam conforme o esperado.

#### Teste de Integração

 O teste de Integração é executado para assegurar que os componentes no modelo de implementação operem adequadamente
 quando combinado para executar um caso de uso. O objetivo do teste é um pacote ou conjunto de pacote do modelo
 de implementação.
 
#### Teste de Sistema

 Tradicionalmente, o teste do sistema é feito quando software está funcionando como um todo.
 
#### Teste de Aceitação

 O teste de aceitação do usuário é a ação de teste final realizada antes de implementação do software.
 

### Técnicas de Teste

 Cada nível de teste possui técnicas diferentes.
 
#### Caixa Branca

* Conhecido como Teste Estrutural
* Validar dados, controles, fluxos e chamadas
* Garantir a qualidade da implementação
* Níveis: Unidades, Integração e Regressão.

#### Caixa Preta

* Teste funcional
* Verificar saídas usando vários tipos de entradas
* Teste sem conhecer a estrutura interna do software
* Níveis: Integração, Sistema e Aceitação.

#### Caixa Cinza

* Mecla técnicas de Caixa branca e Caixa preta
* Analisa parte lógica e também funcionalidade
* Exemplo: Ter acesso a documentação do funcionamento do código
* Engenharia Reversa.


## Testes não funcionais

 Testes não funcionais estão ligados a requisitos não funcionais:

* Comportamento do Sistema
* Performace
* Escalabilidade
* Segurança
* Infraestrutura

 Testes não funcionais tem como objetivos testar aspectos do software que não associados as 
regras de negócio, mas sim a requisito não funcionais.

 Ferramentas que usam técnicas para apurar o comportamento do sistema em determinadas circunstâncias.

#### Teste de Carga

 O teste de carga é realizada para verificar qual o volume de transações, acessos simultâneos ou usuários que um
servidor/software/sistema suporta.

* Objetivos para clareza de resultados
* Ambiente
* Cenários
* Execução de testes
* Análise de resultado

#### Teste de Stress

 Teste de stress é realizado para submeter o software a situações extremas. Basicamente, o teste de stress
baseia-se em testar os limites do software e avaliar seu comportamento. Assim, avalia -se até
quando o software pode ser exigido e quais as falhas(se existirem) decorrentes do teste.

#### Teste de Segurança

 O teste de segurança é um processo crítico de segurança cibernética que visa detectar vulnerabilidade em
sistemas, software, redes e aplicativo.


### A Pirâmide de Teste

 A pirâmide de Teste foi criada por **Mike Cohn** esse conceito em seu livro _Suceeding with Agile._ É uma ótima metáfore visual dizendo
para como pensar em diferentes camadas de teste. Ela também informa quanto teste fazer em cada camada.

 A pirâmide de teste original de **Mike Cohn** consiste em três camadas nas quais sua suíte de teste deve consistir:

1. Teste de unidades
2. Teste de serviço
3. Teste de interface do usuário


 Dessa forma para criar um conjunto de teste saudável, rápido e sustentável: Escreva muitos teste
de unidade pequenos e rápidos. Escreva alguns testes mais granulares e muito pouco testes de alto nível
que testem o seu aplicativo de ponta a ponta. 


