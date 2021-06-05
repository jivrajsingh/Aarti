#Author: subhajit.ghosh@meganexus.com
@ActivityArea111
Feature: To test Activity area feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor
    Then User is on landing page
    And I Click on Activity Area top tab

  @HMPBerwyn_BER51_BER445_Activity_Area_Team_Add
  Scenario: Be able to add Activity Area team in system
    Given User is on Activity area page
    When I click view button on row "1" of Courses table
    And It navigates to Activity Area view page
    Then I click to add Team under the view page
    And I fill the Team page
    And verify the newly added record under Team table

  @HMPBerwyn_BER52_Activity_Area_Team_Edit
  Scenario: Be able to edit Activity Area team in system
    Given User is on Activity area page
    When I click view button on row "1" of Courses table
    And It navigates to Activity Area view page
    Then I click edit button on row "1" of Team table
    And I edit Team form
    And verify the edited record under Team table

  @HMPBerwyn_BER53_Activity_Area_Team_View
  Scenario: Be able to view Activity Area team in system
    Given User is on Activity area page
    When I click view button on row "1" of Courses table
    And It navigates to Activity Area view page
    Then I click view button on row "1" of Team table
    And verify the team form

  @HMPBerwyn_BER100_Team_List
  Scenario: Be able to verify list Activity Area in system
    Given User is on Activity area page
    When I click view button on row "1" of Courses table
    And It navigates to Activity Area view page
    Then verify the entire Team table contents

  @HMPBerwyn_BER254_Team_JMESASorting_Filtering
  Scenario: Be able to sort JMESA and filter results
    Given User is on Activity area page
    When I click view button on row "1" of Courses table
    And It navigates to Activity Area view page
    Then I click on JMESA to sort results for Team

  @HMPBerwyn_BER233_Team_RBAC
  Scenario: To check that we are able to add/edit/view team record in system
    Given User is on Activity area page
    When I click view button on row "1" of Courses table
    And It navigates to Activity Area view page
    Then I click to add Team under the view page and return to home page of Team
    And I click edit button on row "1" of Team table and return to home page of Team
    And I click view button on row "1" of Team table and return to home page of Team
