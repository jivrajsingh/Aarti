#Author: subhajit.ghosh@meganexus.com
@ActivityArea
Feature: To test Activity area feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor

  @HMPBerwyn_BER138_Activity_Area_Toptab_structure
  Scenario: Be able to view Activity Area top tab in system
    Given User is on landing page
    When I Click on Activity Area top tab
    And It navigates to Activity Area page

  @HMPBerwyn_BER48_Activity_Area_Add
  Scenario: Be able to add Activity Area in system
    Given User is on landing page
    When I Click on Activity Area top tab
    And It navigates to Activity Area page
    Then I click on Add Activity Area button to add Activity Area
    And I fill the add Activity Area form
    And verify the newly added record under Activity Area table

  @HMPBerwyn_BER49_Activity_Area_Edit
  Scenario: Be able to edit Activity Area in system
    Given User is on landing page
    When I Click on Activity Area top tab
    And It navigates to Activity Area page
    Then I click edit button on row "1" of Activity Area table
    And I edit Activity Area form
    And verify the edited record under Activity Area table

  @HMPBerwyn_BER50_Activity_Area_View
  Scenario: Be able to view Activity Area in system
    Given User is on landing page
    When I Click on Activity Area top tab
    And It navigates to Activity Area page
    Then I click view button on row "1" of Activity Area table
    And verify the Activity Area form

  @HMPBerwyn_BER99_Activity_List
  Scenario: Be able to verify the list of Activity Area in system
    Given User is on landing page
    When I Click on Activity Area top tab
    And It navigates to Activity Area page
    Then verify the entire Activity Area table contents

  @HMPBerwyn_BER253_Activity_Area_JMESASorting_Filtering
  Scenario: Be able to sort JMESA and filter results
    Given User is on landing page
    When I Click on Activity Area top tab
    And It navigates to Activity Area page
    Then I click on JMESA to sort results for Activity Area

  @HMPBerwyn_BER232_Activity_Area_RBAC
  Scenario: To check that we are able to add/edit/view Act Area
    Given User is on landing page
    When I Click on Activity Area top tab
    And It navigates to Activity Area page
    Then I click on Add Activity Area button to add Activity Area and return to home page of Activity Area
    And I click edit button on row "1" of Activity Area table and return to home page of Activity Area
    And I click view button on row "1" of Activity Area table and return to home page of Activity Area
