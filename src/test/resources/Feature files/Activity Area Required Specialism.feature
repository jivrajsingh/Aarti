#Author: subhajit.ghosh@meganexus.com
@ActivityArea1256
Feature: To test Activity area feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor
    Then User is on landing page
    And I Click on Activity Area top tab
    And I click on Activity Area view button and view a record for Required Specialism purpose only

  @HMPBerwyn_BER78_Activity_Area_Required_Specialism_Add
  Scenario: Be able to add Activity Area Required Specialism in system
    Given User is on Team of Activity Area page
    When Filter and click view of team table to add auxilaries
    And It navigates to Team view page
    Then I click to add Required Specialism under the view page
    And I fill the Required Specialism page
    And verify the newly added record under Required Specialism table

  @HMPBerwyn_BER79_Activity_Area_Required_Specialism_Edit
  Scenario: Be able to edit Activity Area Required Specialism in system
    Given User is on Team of Activity Area page
    When Filter and click view of team table to add auxilaries
    And It navigates to Team view page
    Then Sort and I click edit button on row "1" of Required Specialism table
    And I edit Required Specialism form
    And verify the edited record under Required Specialism table

  @HMPBerwyn_BER80_Activity_Area_Required_Specialism_View
  Scenario: Be able to view Activity Area Required Specialism in system
    Given User is on Team of Activity Area page
    When Filter and click view of team table to add auxilaries
    And It navigates to Team view page
    Then Sort and I click view button on row "1" of Required Specialism table
    And verify the Required Specialism form

  @HMPBerwyn_BER101_Activity_Area_Required_Specialism_List
  Scenario: Be able to view list Required Specialism in system
    Given User is on Team of Activity Area page
    When Filter and click view of team table to add auxilaries
    And It navigates to Team view page
    Then verify the entire Team table Required Specialism contents

  @HMPBerwyn_BER255_Required_Specialism_JMESASorting_Filter
  Scenario: Be able to sort JMESA and filter results
    Given User is on Team of Activity Area page
    When Filter and click view of team table to add auxilaries
    And It navigates to Team view page
    Then I select values to filter results for Required Specialism
    And I click on JMESA to sort results for Required Specialism
