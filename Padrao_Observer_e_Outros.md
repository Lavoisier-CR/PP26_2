<div align="center">
   <img src="https://www.ifpb.edu.br/imagens/logotipos/campina-grande/@@images/image-1200-119374a47048af0ba09197e64453797c.png" width="100px">

  <h2>Atividade Prática</h2>
  <h3>Uso do Padrão Observer e outros</h3>
  <h4>Disciplina: Padrões de Projetos</h4>
  <h4>Professor: Katyusco Santos</h4>
</div>

#### 1. Objetivos da Atividade
Modelar um Diagrama de Classes em UML que represente o funcionamento de um Sistema Computacional baseado em emails  que alerte alunos sobre vagas de trabalhos, estágios, pesquisas.
Para receberem esses alertas o aluno deve estar cadastrados no sistema (com email institucional). Para cada inclusão, remoção ou alteração da infomação sobre a vaga todo aluno cadastrado
deverá ser informado através do seu email. Apenas alunos representantes de turma devem ser capazes de cadastrar alunos e de postar informações sobre vagas. Para ter a vaga divulgada entre alunos os
representantes devem encaminhar a informação da vaga para um e-mail padrão, vagas4alunos@ifpb.edu.br. Cabe ao coordenador do curso cadastrar os representantes de turma. O sistema deve conter um log
que permita que para suspeita de fakenews (vagas inverídicas) seja possível a coordenação do curso saber qual representante postou a informação. 

**ATENCÃO 1.** Lembre que um sistema pode conter mais de uma padrão de projeto. Logo, você deve utilizar na sua modelagem os padrões já estudados até momento na disciplina, por exemplo uma Fachada e/ou um Singleton.
Exporte o diagrama de classe em formato PDF para entregar como resposta.

**ATENÇÂO 2.** Lembre que é IMPORTANTE fazer uso da convenção essêncial que é utilizar os nomes dos padrões utilizados nas classes que irão compor cada Padrão que você utilizará na modelagem. Por Exemplo, se o
log será um singleton, a classe deverá de Chamar SingletonLog; Se aluno fará parte do Obsever, a classe deverá se chamar ObserverAluno.

#### 2. Rregras de negócio
* Somente alunos cadastrados recebem alertas.
* O cadastro do aluno exige e-mail institucional.
* Somente representantes de turma podem cadastrar alunos.
* Somente representantes podem publicar informações sobre vagas.
* O coordenador é responsável por cadastrar os representantes.
* A divulgação da vaga utiliza o endereço vagas4alunos@ifpb.edu.br.
* Inclusões, alterações e remoções de vagas devem gerar notificações.
* As notificações são enviadas para os e-mails institucionais dos alunos.
* Toda publicação deve ser registrada no log.
* O log deve permitir identificar o representante responsável pela publicação.
* O coordenador pode consultar o log para investigar possíveis informações falsas.
* O sistema utiliza os padrões Observer, Facade e Singleton.
* Os nomes das classes indicam explicitamente os padrões utilizados, conforme a convenção solicitada.


![Observer](img/observer.png)


