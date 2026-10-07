<div align="center">
   <img src="https://www.ifpb.edu.br/imagens/logotipos/campina-grande/@@images/image-1200-119374a47048af0ba09197e64453797c.png" width="100px">

  <h2>Atividade Prática</h2>
  <h3>Uso do Padrão Observer e outros</h3>
  <h4>Disciplina: Padrões de Projetos</h4>
  <h4>Professor: Katyusco Santos</h4>
</div>

#### 1. Objetivos da Atividade
Modele um Diagrama de Classes em UML que represente o funcionamento de um Sistema Computacional baseado em emails  que alerte alunos sobre vagas de trabalhos, estágios, pesquisas.
Para receberem esses alertas o aluno deve estar cadastrados no sistema (com email institucional). Para cada inclusão, remoção ou alteração da infomação sobre a vaga todo aluno cadastrado
deverá ser informado através do seu email. Apenas alunos representantes de turma devem ser capazes de cadastrar alunos e de postar informações sobre vagas. Para ter a vaga divulgada entre alunos os
representantes devem encaminhar a informação da vaga para um e-mail padrão, vagas4alunos@ifpb.edu.br. Cabe ao coordenador do curso cadastrar os representantes de turma. O sistema deve conter um log
que permita que para suspeita de fakenews (vagas inverídicas) seja possível a coordenação do curso saber qual representante postou a informação. 

ATENCÃO 1. Lembre que um sistema pode conter mais de uma padrão de projeto. Logo, você deve utilizar na sua modelagem os padrões já estudados até momento na disciplina, por exemplo uma Fachada e/ou um Singleton.
Exporte o diagrama de classe em formato PDF para entregar como resposta.

ATENÇÂO 2. Lembre que é IMPORTANTE fazer uso da convenção essêncial que é utilizar os nomes dos padrões utilizados nas classes que irão compor cada Padrão que você utilizará na modelagem. Por Exemplo, se o
log será um singleton, a classe deverá de Chamar SingletonLog; Se aluno fará parte do Obsever, a classe deverá se chamar ObserverAluno.


![Observer](img/observer.png)


