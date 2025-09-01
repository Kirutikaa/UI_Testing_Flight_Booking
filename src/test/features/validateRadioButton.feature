Feature: AS a user,i want to validate the flight booking site
  Scenario: 1. As a user i want to validate the the flight booking changes with represents radio button selection
    Given the user wants to call the flight booking site
    When the radio button is selected as One Way
    Then check the FROM text and dropdown is displayed
    Then check the TO text and dropdown is displayed
    Then click the FROM dropdown
    And check the FROM dropdown list is display with departure city list
      | Adampur (AIP)     |
      | Ahmedabad (AMD)   |
      | Amritsar (ATQ)    |
      | Bagdogra (IXB)    |
      | Belagavi (IXG)    |
      | Bengaluru (BLR)   |
      | Bhopal (BHO)      |
      | Chennai (MAA)     |
      | Coimbatore (CJB)  |
      | Dehradun (DED)    |
      | Delhi (DEL)       |
      | Dharamshala (DHM) |
      | Dibrugarh (DIB)   |
      | Durgapur (RDP)    |

    And check the FROM dropdown list1 is display with departure city list
      | Goa (GOI)        |
      | Gorakhpur (GOP)  |
      | Guwahati (GAU)   |
      | Gwalior (GWL)    |
      | Hubli (HBX)      |
      | Hyderabad (HYD)  |
      | Jabalpur (JLR)   |
      | Jaipur (JAI)     |
      | Jaisalmer (JSA)  |
      | Jammu (IXJ)      |
      | Jharsuguda (JRG) |
      | Jodhpur (JDH)    |
      | Kandla (IXY)     |
      | Kanpur (KNU)     |

    And check the FROM dropdown list2 is display with departure city list
      | Kishangarh (KQH)  |
      | Kochi (COK)       |
      | Kolkata (CCU)     |
      | Kozhikode (CCJ)   |
      | Lakhimpur (IXI)   |
      | Leh (IXL)         |
      | Madurai (IXM)     |
      | Mangaluru (IXE)   |
      | Mumbai (BOM)      |
      | Pakyong (PYG)     |
      | Patna (PAT)       |
      | Pondicherry (PNY) |
      | Porbandar (PBD)   |
      | Port Blair (IXZ)  |

    And check the FROM dropdown list3 is display with departure city list

      | Pune (PNQ)               |
      | Ranchi (IXR)             |
      | Shirdi (SAG)             |
      | Silchar (IXS)            |
      | Srinagar (SXR)           |
      | Surat (STV)              |
      | Thiruvananthapuram (TRV) |
      | Tirupati (TIR)           |
      | Tuticorin (TCR)          |
      | Udaipur (UDR)            |
      | Varanasi (VNS)           |
      | Vijayawada (VGA)         |
      | Vishakhapatnam (VTZ)     |


  Scenario: 2. As a user i want to validate the flight booking changes with represents passenger selection
  Given the user wants to call the flight booking site
   When check the passenger selection dropdown
     | ADULT  |
     | CHILD  |
     | INFANT |
    When check the currency selection dropdown is displayed
    Then click the dropdown check for the given list
      | Select |
      | INR    |
      | AED    |
      | USD    |
    Then do some action with dropdown
    Then do some action with currency dropdown






