# Projeto: Gestão de Contactos - Programação Orientada a Objetos

## 1. Introdução e Objetivo
O objetivo deste projeto é desenvolver um sistema de gestão de contactos através de uma aplicação **Java Consola**. O sistema deve permitir armazenar, pesquisar, remover e analisar estatísticas de contactos pessoais e profissionais, garantindo a persistência dos dados entre sessões através da manipulação de ficheiros.

---

## 2. Especificações do Sistema

### 2.1. Entidades do Domínio
*   **Contactos Pessoais:** Nome da pessoa e uma listagem de dados de contacto (Telefone, Telemóvel ou Mail).
*   **Contactos Profissionais:** Herda as características do contacto pessoal e acrescenta o nome da empresa.
*   **Tipos de Contacto:** 
    *   `Telefone`
    *   `Telemóvel`
    *   `Mail`

### 2.2. Regras de Persistência
*   **Estado da Aplicação:** Os dados devem ser carregados de um ficheiro (ex: `contactos.dat`) no início da execução e guardados automaticamente antes do programa terminar (opção Sair).
*   **Exportação:** As funcionalidades de "Listar" e "Encontrar" devem permitir exportar os resultados para um ficheiro de texto (`.txt`) definido pelo utilizador.
*   **Tecnologia:** Utilizar `java.io.Serializable` com `ObjectOutputStream` e `ObjectInputStream` para o estado binário, e `PrintWriter` ou `FileWriter` para exportação de texto.

### 2.3. Arquitetura Proposta
Seguindo os princípios de POO (Abstração, Encapsulamento, Herança e Polimorfismo):

*   `model.TipoContacto` (Enum): `TELEFONE`, `TELEMOVEL`, `MAIL`.
*   `model.DatoContacto` (Classe): Associa um `TipoContacto` a um valor (String).
*   `model.Contacto` (Classe Abstrata): Base para todos os contactos (Nome e `List<DatoContacto>`).
*   `model.ContactoPersonal` (Classe): Estende `Contacto`.
*   `model.ContactoProfesional` (Classe): Estende `Contacto` e adiciona o atributo `empresa`.
*   `controller.GestorContactos` (Classe): Lógica de negócio (CRUD, validações, estatísticas).
*   `utils.GestorArchivos` (Classe): Gestão de ficheiros (leitura/escrita).
*   `view.Consola` (Classe): Interface de utilizador e menus.
*   `Main`: Ponto de entrada da aplicação.

---

## 3. Funcionalidades do Menu

### 1. Listar Contactos
Apresenta todos os contactos. Permite optar por gravar a listagem num ficheiro `.txt`.

### 2. Acrescentar Contacto
Solicita o nome e, opcionalmente, o nome da empresa (definindo se é Profissional ou Pessoal). Pede iterativamente dados de contacto até o utilizador deixar vazio.
*   **Validação de Unicidade:**
    *   Se o par **Nome + Empresa** já existir: Pergunta se quer acrescentar informação ao existente ou desistir.
    *   Se a **Informação (número/email)** já existir noutro contacto: Oferece opções para criar novo, fundir com o existente ou cancelar.

### 3. Remover Contacto
Pesquisa por um critério. Se houver múltiplos resultados, solicita a escolha do contacto. Permite:
1. Remover o contacto completo.
2. Eliminar apenas um tipo de contacto específico dentro desse contacto.

### 4. Encontrar Contactos
Pesquisa por um critério (utilizando **Expressões Regulares** para pesquisas parciais e insensíveis a maiúsculas). Apresenta os resultados e permite exportar para ficheiro.

### 5. Estatísticas
Apresenta a contagem global de quantos dados de contacto de cada tipo existem no sistema (Total de Telemóveis, Telefones e Mails).

### 6. Sair
Guarda os dados no ficheiro persistente e encerra a aplicação.

---

## 4. Guia de Implementação Técnica

### Modelação e Encapsulamento
*   Atributos devem ser `private`.
*   A classe `Contacto` deve ser `abstract`.
*   Implementar `Serializable` em todas as classes de modelo.
*   Utilizar `List<DatoContacto>` (ArrayList) para coleções dinâmicas.

### Lógica de Pesquisa (Regex)
*   Utilizar `String.matches(regex)` ou `java.util.regex.Pattern`.
*   Sugerido: `"(?i).*" + criterio + ".*"` para correspondências parciais insensíveis a maiúsculas.

### Interface de Utilizador
*   Utilizar `java.util.Scanner` para entradas.
*   **Dica:** Preferir `nextLine()` e converter com `Integer.parseInt()` para evitar problemas de buffer.
*   Ciclo `do-while` com `switch-case` para o menu principal.

---

## 5. Critérios de Avaliação (100%)

1.  **Manual do Programador (10%):** Diagrama de classes, descrição de atributos e métodos.
2.  **Funcionalidades (50%):**
    *   Listar (5%)
    *   Acrescentar com Unicidade (20%)
    *   Remover Total/Parcial (10%)
    *   Encontrar (5%)
    *   Estatísticas (5%)
    *   Gravação de Ficheiros (5%)
3.  **Implementação (30%):** Nomes, comentários, indentação, estrutura de classes e coesão.
4.  **Qualitativa (10%)**

---

## 6. Entrega
*   **Data Limite:** 15/06/2026 às 23:59:00.
*   **Formato:** Ficheiro único ZIP ou RAR contendo o código e o manual.
