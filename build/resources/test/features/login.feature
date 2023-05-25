#autor Mateo Silva

  @HistoriaDeUsuario
  Feature: verify loggin
    me as USER want to enter the colorlib TO verify the validation from

  Scenario Outline: verify the validation form
    Given i enter with my credentials
      | User   | Password   |  |
      | <User> | <Password> |  |
    When i proceded with my authentication
    And go to the main view of the page
    And enter submenu form validations
    And check the title of form on the screen
    And fill all fields
      | Required   | Select   | MultipleSelect   | Url   | Email   | Password   | ConfirmPassword   | MinField   | MaxField   | Number   | Ip   | Date   | DateEarlier   |  |
      | <Required> | <Select> | <MultipleSelect> | <Url> | <Email> | <Password> | <ConfirmPassword> | <MinField> | <MaxField> | <Number> | <Ip> | <Date> | <DateEarlier> |  |
    And clic button validate
    Then file required will be empty
    Examples:
      | User  | Password | Required | Select  | MultipleSelect | Url                 | Email   | Password | ConfirmPassword | MinField | MaxField | Number | Ip          | Date       | DateEarlier |
      | admin | admin    | prueba   | option2 | option3        | http://facebook.com | a@q.com | 123      | 123             | 123456   | null     | 344    | 192.168.3.2 | 2018-12-01 | 2012/08/11  |

