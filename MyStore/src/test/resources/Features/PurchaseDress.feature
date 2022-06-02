Feature: Purchase Dress

  Scenario Outline: Verify that user can purchase Evening Dress from my store
    Given user is signed on to my store page with valid <Emailid> and <Password>
    When user clicks Dresses link
    And Select evening dress link
    And click on printed dress image
    And click on add to cart button
    And click on proceed to check out button in alert window
    And click proceed to check out button in shopping cart summary page
    And click procced to check out button in address page
    And Accept the terms of service and click proceed to checkout in shipping page
    And Select Pay by check option 
    And click confirm order button
    Then order is placed successfully on My Store

    Examples: 
      | Emailid           | Password |
      | abcd345@gmail.com | Ab1234   |
