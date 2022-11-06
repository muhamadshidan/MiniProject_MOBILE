Feature: Register

  Scenario Outline: Register
    Given User have installed and  User open aplication mobile
    When User Click widget button and User Click Register
    And User fill the form with valid data <Fullname> and <Email> and <Password>
    Then User Click "Register"

    Examples: 
      | Fullname      | Email                   | Password   |
      | daska         | daska10@gmail.co.id     | bogor      |
      |               | muhamadshidan@gmail.com | bogor12345 |
      | muhamadshidan |                         | bogor12345 |
      | muhamadshidan | muhamadshidan@gmail.com |            |
      |               |                         |            |
      | muhamadshidan | muhamadshidan@gmail.com | bogor12345 |