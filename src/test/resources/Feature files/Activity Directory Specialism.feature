#Author: subhajit.ghosh@meganexus.com
@ActivityDirectory_Specialism
Feature: To test Activity Directory feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor

  @HMPBerwyn_BER64_Specialism_definition_Add
  Scenario: Be able to add Specialisms definition in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I click on Add Specialisms button to add Specialisms definition
    And I fill the add Specialisms definition form
    And verify the newly added record under Specialisms definition table

  @HMPBerwyn_BER65_Specialism_definition_Edit
  Scenario: Be able to edit Specialisms definition in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I filter and click edit button on row "1" of Specialisms definition table
    And I edit Specialisms definition form
    And verify the edited record under Specialisms definition table

  @HMPBerwyn_BER66_Specialism_definition_View
  Scenario: Be able to view Specialisms definition in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I filter and click view button on row "1" of Specialisms definition table
    And verify the Specialisms definition form

  @HMPBerwyn_BER94_Specialisms_List
  Scenario: Be able to view Specialisms list in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then verify the entire Specialisms definition table contents

  @HMPBerwyn_BER246_Specialisms_JMESASorting_Filtering
  Scenario: Be able to sort JMESA and filter results
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I select values to filter results for Specialisms definition
    And I click on JMESA to sort results for Specialisms definition

  @HMPBerwyn_BER123_Activity_Directory_RBAC
  Scenario: To check that we are able to add fucntionalities under Activity Directory
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I click on Add Specialisms, Add Course and Add Qualification button an return to Activity directory home page after evry activity
