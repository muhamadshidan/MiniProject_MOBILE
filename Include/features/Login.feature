Feature: Login

  Scenario Outline: Login
    Given User installed and open app mobile
    When User Click widget Login button
    And User fill form login with valid data <Email> and <Password>
    Then User click Login button

    Examples: 
     | Email                   | status     |
     | stavejob@gmail.com      | olap       |
     | muhamadshidan@gmail.com |            |
     |                         | bogor12345 |
     |                         |            |
     | muhamadshidan@gmail.com | bogor12345 |