<div align="center"> 
  
# *GESTÃO DE ESTOQUE AUTOMOTIVO*

</div>


<div align="center">
<img src="https://github.com/ViniRomano/Estoque_automotivo/assets/125411730/eeaa21b7-cafb-4a95-abb0-5802804713e8" width="380px" />
</div>


## *DESENVOLVEDORES*

- Alisson Enrique Martins dos Santos - 202105969
- Vinícius Polimeno Raposo Romano - 202105990

## *DESCRIÇÃO DO PROJETO*

O sistema de gestão de estoque automotivo foi realizado na disciplina de Programação Orientada a Objetos, com o propósito de implementar um mecanismo destinado à administração eficiente de uma concessionária automotiva. O referido sistema é projetado para realizar operações de cadastro, visualização, atualização e exclusão de informações relativas a veículos, proporcionando uma interface estruturada e orientada a objetos para otimizar a gestão do inventário automotivo.


## *FUNCIONALIDADE*

- **Cadastro de Veículos:** Implementação da funcionalidade para registrar novos veículos no sistema, incluindo informações cruciais como identificação única (ID), marca, modelo e ano.

- **Consulta de Veículos:** Desenvolvimento de um mecanismo que permite a visualização detalhada das informações de um veículo específico no estoque da concessionária.

- **Atualização de Dados:** Implementação de uma capacidade de atualização de informações referentes aos veículos em estoque, possibilitando a modificação de dados previamente registrados.

- **Exclusão de Veículos:** Desenvolvimento de uma funcionalidade para remover registros de veículos da base de dados da concessionária, efetuando a exclusão adequada e controlada dessas informações.


## *TECNOLOGIA EMPREGADA*

- **Linguagem de Programação:** Java

**Justificativa:** A seleção da linguagem Java fundamenta-se em sua ampla aceitação na indústria, portabilidade eficaz e robustez. Esses atributos proporcionam uma base sólida para o desenvolvimento de aplicativos corporativos, garantindo confiabilidade e eficiência.

- **Framework:** Spring Boot

**Justificativa:** A opção pelo Spring Boot deriva da sua capacidade de simplificar o desenvolvimento de aplicativos Java. Com uma configuração mínima, o Spring Boot facilita a construção de aplicativos prontos para produção. Sua estrutura eficiente e modular agiliza o processo de desenvolvimento, permitindo a criação de sistemas escaláveis e de alta qualidade.

- **Banco de Dados:** H2 Database

**Justificativa:** O H2 Database foi escolhido para ambientes de desenvolvimento e teste devido à sua natureza incorporada e facilidade de configuração. Ideal para fases iniciais do projeto, o H2 Database oferece flexibilidade e agilidade.

## *INOVAÇÃO E CRIATIVADE*

- Essa combinação de tecnologias empregadas no sistema visa estabelecer uma gestão de estoque automotivo que harmoniza a confiabilidade do Java, a eficiência do Spring Boot e a flexibilidade inicial do H2 Database, adaptando-se às diferentes necessidades do ciclo de desenvolvimento do projeto.

## *DOCUMENTAÇÃO*

**Listar Todos os Carros:**
- Método: GET
- URL: http://localhost:8080/carros
- Resposta:
  - Status 200 OK: Retorna uma lista de todos os carros.

**Consultar Carro por ID:**
- Método: GET
- URL: http://localhost:8080/carros/{id}
- Parâmetros de Caminho: {id} - ID do carro a ser recuperado.
- Respostas:
  - Status 200 OK: Retorna os detalhes do carro correspondente ao ID fornecido.
  - Status 404 Not Found: Se não encontrar um carro com o ID especificado.
  - Corpo da Resposta: { "message": "Carro não encontrado com o ID: {id}" }

**Adicionar Novo Carro:**
- Método: POST
- URL: http://localhost:8080/carros
- Corpo:
  ```json
  { "modelo": "Modelo do Carro", "marca": "Marca do Carro", "ano": 2022 }

- Respostas:
  - Status 201 Created: Retorna os detalhes do carro recém-criado.
  - Status 403 Bad Request: Se houver algum campo mal formatado.
 
**Atualizar Carro por ID:**

- Método: PUT
- URL: http://localhost:8080/carros/{id}
- Parâmetros de Caminho: {id} - ID do carro a ser atualizado.
- Corpo:
  ```json
  { "modelo": "Modelo do carro", "marca": "Marca do carro", "ano": 2023 };

- Respostas:
  - Status 200 OK: Retorna os detalhes do carro atualizado.
  - Status 404 Not Found: Se não encontrar um carro com o ID especificado.
  - Status 403 Bad Request: Se houver algum campo mal formatado.

**Excluir Carro:**

- Método: DELETE
- URL: http://localhost:8080/carros/{id}
- Parâmetros de Caminho: {id} - ID do carro a ser excluído.
- Respostas:
  - Status 200 OK:
  - Status 403 Bad Request: Se houver algum campo mal formatado.
- Corpo da Resposta:
```json
{ "message": "Carro não encontrado com o ID" }
