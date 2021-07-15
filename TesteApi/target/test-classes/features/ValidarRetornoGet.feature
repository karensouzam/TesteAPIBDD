Feature: Validar o retorno do método GET

  Scenario: Validação do retorno dos usuários cadastrados
    Given que seja acessada a API "https://jsonplaceholder.typicode.com/users/1"
    When  realizar uma requisição para verificar o se o campo "name" é "Leanne Graham"
    Then a API deverá retornar os dados do usuário cadastrado e StatusCode 200
    And o retorno deverá estar conforme padrão do schema