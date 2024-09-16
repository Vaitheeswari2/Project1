@Cancel
Feature: Cancel Booking module

  @Cancel1
  Scenario Outline: Cancel the Created Order Id - Book hotel by card (debit card and credit card-VISA)
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
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    Then User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    Then User should verify same booked Hotel Price is present or not
    When User should Cancel the new order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        | Card Type   | Modify Date |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-26 | 2024-06-27 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Veg preference | Debit Card  | 2024-06-25  |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-26 | 2024-06-27 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Veg preference | Credit Card | 2024-06-25  |

  @Cancel2
  Scenario Outline: Cancel the Created Order Id - Book hotel by  (UPI ID)
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
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    Then User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    Then User should verify same booked Hotel Price is present or not
    When User should Cancel the new order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        | upiId                | Modify Date |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-26 | 2024-06-27 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Veg preference | seleniumtraining@vbc | 2024-06-25  |

  @Cancel3
  Scenario Outline: Cancel the Created Order Id - Book hotel by card (debit card and credit card-VISA) without special request
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
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    Then User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    Then User should verify same booked Hotel Price is present or not
    When User should Cancel the new order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        | Card Type   | Modify Date |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-26 | 2024-06-27 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Veg preference | Debit Card  | 2024-06-25  |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-26 | 2024-06-27 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Veg preference | Credit Card | 2024-06-25  |

  @Cancel4
  Scenario Outline: Cancel the Created Order Id - Book hotel by card (debit card-VISA) without special request and GST
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
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    Then User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    Then User should verify same booked Hotel Price is present or not
    When User should Cancel the new order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        | Card Type   | Modify Date |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-26 | 2024-06-27 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Veg preference | Debit Card  | 2024-06-25  |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-26 | 2024-06-27 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Veg preference | Credit Card | 2024-06-25  |

  @Cancel5
  Scenario Outline: Cancel the Created Order Id - Book hotel by  (UPI ID) without special request
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
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    Then User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    Then User should verify same booked Hotel Price is present or not
    When User should Cancel the new order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        | upiId                | Modify Date |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-26 | 2024-06-27 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Veg preference | seleniumtraining@vbc | 2024-06-25  |

  @Cancel6
  Scenario Outline: Cancel the Created Order Id - Book hotel by  (UPI ID) without special request and GST
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
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    Then User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    Then User should verify same booked Hotel Price is present or not
    When User should Cancel the new order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName            | password        | state      | city       | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email               | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        | upiId                | Modify Date |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | Tamil Nadu | Coimbatore | Deluxe   | 2024-06-26 | 2024-06-27 | 1-One      | 3-Three      |            2 | Mr.               | Srinivasu  | Aruchamy  | 9487715046 | srinipmps@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Veg preference | seleniumtraining@vbc | 2024-06-25  |

  @Cancel7
  Scenario Outline: Verify Cancel the existing Order ID
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Vaitheeswari"
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User should Cancel the existing order ID "<order ID>"
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName            | password        | orderId    |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv | /"#OYZEG17936 |

  @Cancel8
  Scenario Outline: Verify Cancel the first Order ID
    Given User is on the OMR Branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify sucees message after login "Welcome Vaitheeswari"
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User should Cancel the first order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName            | password        |
      | Vaitheeswari0731@gmail.com | abEuKW6S@asg3Nv |
