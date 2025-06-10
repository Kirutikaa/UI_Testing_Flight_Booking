Feature: AS a user,i want to validate the flight booking site
  Scenario: 1. As a user i want to validate the the flight booking changes with represents radio button selection
    Given the user wants to call the flight booking site
    When the radio button is selected as One Way
    Then check the FROM dropdown is displayed
    Then check the TO dropdown is displayed
    Then click the FROM dropdown
    And check the FROM dropdown list is display with departure city list
      | Adampur (AIP)     | Goa (GOI)        | Kishangarh(KQH)  | Pune(PNQ)           |
      | Ahmedabad (AMD)   | Gorakhpur (GOP)  | Kochi(COK)       | Ranchi(IXR)         |
      | Amritsar (ATQ)    | Guwahati (GAU)   | Kolkata(CCU)     | Shridi(SAG)         |
      | Bagdogra          | Gwalior (GWL)    | Kozhikode(CCJ)   | Silchar(IXS)        |
      | Belagavi (IXG)    | Hubli (HBX)      | Lakhimpur(IXI)   | Srinagar(SXR)       |
      | Bengaluru (BLR)   | Hyderabad (HYD)  | Leh(IXL)         | Surat(STV)          |
      | Bhopal (BHO       | Jabalpur (JLR)   | Madurai(IXM)     | Thiruvananthapuram  |
      | Chennai (MAA)     | Jaipur (JAI)     | Mangaluru(IXE)   | (TRV)               |
      | Coimbatore (CJB)  | Jaisalmer (JSA)  | Mumbai(BOM)      | Tirupati(TIR)       |
      | Dehradun (DED)    | Jammu (IXJ)      | Pakyong(pyg)     | Tuticorin(TCR)      |
      | Delhi (DEL)       | Jharsuguda (JRG) | Patna(PAT)       | Udaipur(UDR)        |
      | Dharamshala (DHM) | Jodhpur (JDH)    | Pondicherry(PNY) | Varanasi(VNS)       |
      | Dibrugarh (DIB)   | Kandla (IXY)     | Porbandar(PBD)   | Vijayawada(VGA)     |
      | Durgapur (RDP)    | Kanpur (KNU)     | Port Blair(IXZ)  | Vishakhapatnam(VTZ) |
    And click any city from the departure list
    Then check the To dropdown list is present with expected text
      | Bhopal(BHO)  | Delhi(DEL) | Hyderabad(HYD) | Pune(PNQ)    |
      | Chennai(MAA) | Goa(GOI)   | Mumbai(Bom)    | Udaipur(UDR) |


  Scenario: 2. As a user i want to validate the the flight booking changes with represents date selection
    Given the user wants to call the flight booking site
    When the radio button is selected as One Way
    Then check the FROM dropdown list is present with expected text
    And hover over the FROM dropdown list it should display to the departure city list
    Then check the To dropdown list is present with expected text
    And  hover over the FROM dropdown list it should not display any city
    When try to select any one from the departure city list
    Then check the To dropdown list available to select
    Then check the depart date calender is visible and enable
    Then check the return date calender is visible but it should be disable
    And click the depart calender to select the date
    And check the selected date is present in the inbox

  Scenario: 5. As a user i want to validate the the flight booking that represents passenger selection
