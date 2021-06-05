#Author: subhajit.ghosh@meganexus.com
@ActivityDirectory_Certification
Feature: To test Activity Directory feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor

  @HMPBerwyn_BER73_Certification_definition_Add
  Scenario: Be able to add Certification in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I click on Add Certifications button to add Certifications definition
    And I fill the add Certifications form
    And verify the newly added record under Certification table

  @HMPBerwyn_BER74_Certification_definition_Edit
  Scenario: Be able to edit Certifications in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I filter and click edit button on row "1" of Certifications table
    And I edit Certifications form
    And verify the edited record under Certification table

  @HMPBerwyn_BER75_Certification_definition_View
  Scenario: Be able to view Certifications in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I filter and click view button on row "1" of Certification table
    And verify the Certifications form

  @HMPBerwyn_BER95_Certifications_List
  Scenario: Be able to verify the list of Certifications in system
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then verify the entire Certification table contents

  @HMPBerwyn_BER249_Certifications_JMESASorting_Filtering
  Scenario: Be able to sort JMESA and filter results
    Given User is on landing page
    When I Click on Activity directory top tab
    And It navigates to Activity directory page
    Then I select values to filter results for Certification
    And I click on JMESA to sort results for Certification
