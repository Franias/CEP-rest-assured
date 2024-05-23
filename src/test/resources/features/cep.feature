# new feature

@all
Feature: Aplicacao /test

  *Buscar apenas um CEP por código

  @cep
  Scenario Outline: GET /{CEP} - 200 OK
    Given que realizo um GET na aplicacao de CEP https://viacep.com.br/ws/ com o CEP <cep>
    And obtenho o status code 200
    Then valido o schema da response GET de CEP por um código

  Examples:
    | cep      |
    | 01001000 |

  @cep
  Scenario: GET /{CEP} - 400 OK
    Given que realizo um GET na aplicacao de CEP https://viacep.com.br/ws/ com o CEP 99999
    Then obtenho o status code 400





