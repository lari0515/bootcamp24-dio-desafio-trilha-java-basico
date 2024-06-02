# PROJETO IPHONE 2007
#### Autor: [Larissa Menezes](https://github.com/lari0515/)
#### &nbsp;
### DESCRIÇÃO
---

#### Este projeto tem como objetivo modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet, conforme o lançamento do iPhone em 2007.
### &nbsp;

### DIAGRAMA DE CLASSE
---
#### &nbsp;
```mermaid
classDiagram
    class ReprodutorMusical
    <<interface>> ReprodutorMusical
    ReprodutorMusical : +tocar() void
    ReprodutorMusical : +pausar() void
    ReprodutorMusical : +selecionarMusica(String musica) void

    class AparelhoTelefonico
    <<interface>> AparelhoTelefonico
    AparelhoTelefonico : +ligar(String numero) void
    AparelhoTelefonico : +atender() void
    AparelhoTelefonico : +iniciarCorreioVoz() void

    class NavegadorInternet
    <<interface>> NavegadorInternet
    NavegadorInternet : +exibirPagina(String url) void
    NavegadorInternet : +adicionarNovaAba() void
    NavegadorInternet : +atualizarPagina() void

    class IPhone

    ReprodutorMusical <|-- IPhone
    AparelhoTelefonico <|-- IPhone
    NavegadorInternet <|-- IPhone

```