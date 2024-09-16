@Book
Feature: Book Hotel Module

  @Book1
  Scenario Outline: Book hotel including GST-Card(debit and credit card)-With special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Vaitheeswari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and hotel price
    And User select the first hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    When User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Srini     | July  | 2025 | 123 |
      | Visa        | 5555555555552223 | Srini     | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Srini     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | Srini     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | Srini     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        | Card Type   |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-25 | 2024-06-26 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Veg preference | Debit Card  |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-25 | 2024-06-26 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Veg preference | Credit Card |

  @Book2
  Scenario Outline: Book hotel including GST-Card(debit card and credit)-Without special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Vaitheeswari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and hotel price
    And User select the first hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    When User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Srini     | July  | 2025 | 123 |
      | Visa        | 5555555555552223 | Srini     | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Srini     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | Srini     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | Srini     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Enter Registration No. | Enter Company Name     | Enter Company Address | Card Type   |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-25 | 2024-06-26 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Debit Card  |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-25 | 2024-06-26 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Credit Card |

  @Book3
  Scenario Outline: Book hotel without GST-Card(debit card and credit card)-with special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Vaitheeswari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and hotel price
    And User select the first hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add Special Request "<Request>"
    When User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Srini     | July  | 2025 | 123 |
      | Visa        | 5555555555552223 | Srini     | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Srini     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | Srini     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | Srini     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Request        | Card Type   |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-25 | 2024-06-26 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com | Veg preference | Debit Card  |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-25 | 2024-06-26 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com | Veg preference | Credit Card |

  @Book4
  Scenario Outline: Book hotel without GST-Card(debit card and credit card)-Without special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Vaitheeswari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and hotel price
    And User select the first hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    When User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Srini     | July  | 2025 | 123 |
      | Visa        | 5555555555552223 | Srini     | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Srini     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | Srini     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | Srini     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Card Type   |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-25 | 2024-06-26 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com | Debit Card  |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-25 | 2024-06-26 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com | Credit Card |

  @Book5
  Scenario Outline: Book hotel without enetering any field , book field and verify all the error messagw
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Vaitheeswari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and hotel price
    And User select the first hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    And User click credit card
    And User click submit without enetring payment details
    Then User should verify after payment details error message "Please select your card type","Please select your card","Please provide your card number","Please provide name on your card","Please provide your Card Expiry Date" and "Please provide your Card's security code"

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-25 | 2024-06-26 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Veg preference |

  @Book6
  Scenario Outline: Book hotel including GST-(UPI ID)-With special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Vaitheeswari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and hotel price
    And User select the first hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        | upiId                |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-25 | 2024-06-26 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Veg preference | seleniumtraining@vbc |

  @Book7
  Scenario Outline: Book hotel including GST-(UPI ID)-Without special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Vaitheeswari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and hotel price
    And User select the first hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Enter Registration No. | Enter Company Name     | Enter Company Address | upiId                |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-25 | 2024-06-26 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | seleniumtraining@vbc |

  @Book8
  Scenario Outline: Book hotel without GST-(UPI ID)-With special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Vaitheeswari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and hotel price
    And User select the first hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add Special Request "<Request>"
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Request        | upiId                |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-25 | 2024-06-26 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com | Veg preference | seleniumtraining@vbc |

  @Book9
  Scenario Outline: Book hotel without GST-(UPI ID)-Without special request
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Vaitheeswari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and hotel price
    And User select the first hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Request        | upiId                |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-25 | 2024-06-26 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com | Veg preference | seleniumtraining@vbc |

  @Book10
  Scenario Outline: Book hotel without enetering any field in upi field , book field and verify all the error message
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Vaitheeswari"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and hotel price
    And User select the first hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    And User click upi
    And User click submit without enetring payment details
    Then User should verify after payment details error message "Please provide your UPI ID"

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-25 | 2024-06-26 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Veg preference |
