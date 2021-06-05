#Author: subhajit.ghosh@meganexus.com
@Subhajit @ActivityDirectory_Specialism
Feature: To test Activity Directory feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor

  @HMPBerwyn_BER91_ActivityDirectory_Toptab_structure
  Scenario: Be able to view Activity Directory top tab in system
    Given User is on landing page
    When I Click on Activity Directory top tab
    Then It navigates to Activity Directory page

  @HMPBerwyn_BER67_BER440_BER446_Courses_Add
  Scenario: Be able to add Activity Directory Courses in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I click on Add Courses button to add Courses
    And I fill the add Courses form
    And verify the newly added record under Courses table

  @HMPBerwyn_BER68_BER447_BER448_BER498_Courses_Edit
  Scenario: Be able to edit Activity Directory Courses in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I filter and click edit button on row "1" of Courses table
    And I edit Courses form
    And verify the edited record under Courses table

  @HMPBerwyn_BER69_Courses_View
  Scenario: Be able to view Courses in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I click view button on row "1" of Courses table
    And verify the Courses form

  @HMPBerwyn_BER96_Courses_List
  Scenario: Be able to verify the list of Activity Directory Courses in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then verify the entire Courses table contents

  @HMPBerwyn_BER247_BER439_Courses_JMESASorting_Filtering
  Scenario: Be able to sort JMESA and filter results
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I select values to filter results for Courses
    And I click on JMESA to sort results for Courses
