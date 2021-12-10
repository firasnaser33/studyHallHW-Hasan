Feature:



  @Test
  Scenario Outline: Verify that we can order http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Default.aspx
    Given The user wants to login Smartbear
    Then The user wants to go order page
    Then The user wants to enter product info as "<product>" and "<quantity>"
    Then The user wants to enter address info as "<CName>" and "<street>" and "<city>" and "<state>" and "<zip>"
    Then The user wants to enter payment information as "<CType>" and "<CNumber>" and "<Expire>"

    Examples:
      |product| quantity| CName| street     |city     |state|zip    |CType       |CNumber    |Expire|
      |MyMoney| 10      | erk  |12 Fake st  |Toronto  |CO   |123456 |MasterCard  |123456789  |12/25 |