#Author: subhajit.ghosh@meganexus.com
@ActivityArea
Feature: To test Activity area feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor
    Then User is on landing page
    And I Click on Activity Area top tab
    And I click on Activity Area view button and view a record for Required Specialism purpose only

  @HMPBerwyn_BER81_BER471_Activity_Area_Allocated_Client_Add
  Scenario: Be able to add Activity Area Allocated Client in system
    Given User is on Team of Activity Area page
    When Filter and click view of team table to add auxilaries
    And It navigates to Team view page
    Then I click to add Allocated Client under the view page
    And I add the Allocated Client page
    And verify the newly added record under Allocated Client table

  @HMPBerwyn_BER82_BER472_Activity_Area_Allocated_Client_Edit
  Scenario: Be able to edit Activity Area Allocated Client in system
    Given User is on Team of Activity Area page
    When Filter and click view of team table to add auxilaries
    And It navigates to Team view page
    Then I click edit button on row "1" of Allocated Client table
    And I edit Allocated Client form
    And verify the edited record under Allocated Client table

  @HMPBerwyn_BER83_Activity_Area_Allocated_Client_View
  Scenario: Be able to view Activity Area Allocated Client in system
    Given User is on Team of Activity Area page
    When Filter and click view of team table to add auxilaries
    And It navigates to Team view page
    Then I click view button on row "1" of Allocated Client table
    And verify the Allocated Client view form

  @HMPBerwyn_BER84_Allocated_Client_Archieve
  Scenario: Be able to archieve Activity Area in system
    Given User is on Team of Activity Area page
    When Filter and click view of team table to add auxilaries
    And It navigates to Team view page
    Then I filter and archieve record of Allocated Client table
    And Take a screenshot

  @HMPBerwyn_BER256_Allocated_Client_JMESASorting_Filtering
  Scenario: Be able to sort JMESA and filter results
    Given User is on Team of Activity Area page
    When Filter and click view of team table to add auxilaries
    And It navigates to Team view page
    Then I select values to filter results for Allocated Client
    And I click on JMESA to sort results for Allocated Client
