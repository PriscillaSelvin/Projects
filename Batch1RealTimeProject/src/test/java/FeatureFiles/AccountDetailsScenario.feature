  Feature: Validate AccountDetails Functionality of GrotechMinds Banking Application

  Scenario Outline: Validate AccountDetails functionality in GrotechMinds Banking Application
    Given user opens the url for banking application
    And user clicks on Account Detail link in WebPage
    And user navigates to the AccountDetails Page
    And user selects the accountusername  
    When user clicks on Loginaccountuser button
    Then validate that user is able to login into the AccountDetails Page
    Then validate the balance amount
    When user clicks on Deposit link
    And user enters the Depositamount as "<DepositAmount>"
    Then user clicks on Deposit button
    And also verify the Balance amount
    When user clicks on withdraw link
    And user enters the withdrawamount as "<WithdrawAmount>"
    Then user clicks on withdraw button
    And also verify the Balance amount
    
    
    Examples: 
      
      |DepositAmount|WithdrawAmount |  
      |4000 |1300 |