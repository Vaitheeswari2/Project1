@Select
Feature: Select Hotel Module

  @Select1
  Scenario Outline: Select first hotel
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Vaitheeswari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and hotel price
    And User select the first hotel and accept the alert
    Then User should verify after select success message "Book Hotel"

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 3-Three      |            2 |

  @Select2
  Scenario Outline: Select last hotel
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Vaitheeswari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 3-Three      |            2 |
