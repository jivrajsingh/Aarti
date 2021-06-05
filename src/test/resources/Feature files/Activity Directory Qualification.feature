#Author: subhajit.ghosh@meganexus.com
@Subhajit @ActivityDirectory_Qualifications_definition
Feature: To test Course list feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor

  @HMPBerwyn_BER70_BER411_Qualifications_definition_Add
  Scenario: Be able to add Qualifications definition in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I click on Add Qualifications definition button to add Qualifications definition
    And I fill the add Qualifications definition form
    And verify the newly added record under Qualifications definition table

  @HMPBerwyn_BER71_BER497_Qualifications_definition_Edit
  Scenario: Be able to edit Qualifications definition in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I click edit button on row "1" of Qualifications definition table
    And I edit Qualifications definition form
    And verify the edited record under Qualifications definition table

  @HMPBerwyn_BER72_Qualifications_definition_View
  Scenario: Be able to view Qualifications definition in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I click view button on row "1" of Qualifications definition table
    And verify the Qualifications definition form

  @HMPBerwyn_BER93_Qualifications_definition_List
  Scenario: Be able to verify the list of Qualifications definition in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then verify the entire Qualifications definition table contents

  @HMPBerwyn_BER248_Qualifications_JMESASorting_Filtering
  Scenario: Be able to sort JMESA and filter results
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I select values to filter results for Qualifications
    And I click on JMESA to sort results for Qualifications
