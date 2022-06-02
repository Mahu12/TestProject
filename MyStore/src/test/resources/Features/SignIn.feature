Feature: SignIn

  Scenario Outline: Verify that user can signin to my store application with valid credentials
    Given User is at my store login page
    And user clicks on sign in link
    When user enters registered <Emailid> and <Password>
    And click sign in button
    Then user is successfully logged in to My Account page

    Examples: 
      | Emailid           | Password |
      | abcd345@gmail.com | Ab1234   |
      
      
      
