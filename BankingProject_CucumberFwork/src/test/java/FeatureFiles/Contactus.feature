 Feature: Validate Contactus Functionality of GrotechMinds Banking Application

  Scenario Outline: Validate contactus functionality in GrotechMinds Banking Application
    Given user opens the url for banking application
    And user clicks on Contactus link in WebPage
    And user enters the name as "<yourname>"
    And user enters the email as "<youremail>"
    And user enters the Phonenum as "<phonenum>"
    And user enters the Address as "<address>"
    And user enters the country as "<country>"
    And user enters the zipcode as "<zipcode>"
    When user clicks on Submit button
    Then validate that user is able to submit details into the website
    And also verify that the Title of the page is showing correct value
    
    
    Examples: 
      
      |yourname|youremail |  phonenum |address |country |zipcode |      
      | Ross | dav1234@gmail.com |  4167890987 | Markham | Canada |L6E9K6 |