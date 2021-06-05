#Author: subhajit.ghosh@meganexus.com
@Client_Qualification
Feature: To test Client Questions feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with MIS Wales supervisor
    Then Navigate to Clients main top-tab
    And under partner sub top tab filter with Name Surname and Prison and click on select button
    And View the client on record "1" after the search results

  @HMPBerwyn_BER27_BER467_BER453_Questions_Edit
  Scenario: Be able to edit Questions in system
    Given User is on Berwyn client profile page
    When I Click on Questions sub-tab
    And It navigates to Questions page
    Then I click Edit Client button to edit client Questions page
    And then I fill and save the client Questions form

  @HMPBerwyn_BER28_Questions_View
  Scenario: Be able to view Questions in system
    Given User is on Berwyn client profile page
    When I Click on Questions sub-tab
    And It navigates to Questions page
    Then verify the client Questions page

  @HMPBerwyn_BER236_Questions_RBAC
  Scenario: To check that we are able to edit Client Questions(RBAC Check)
    Given User is on Berwyn client profile page
    When I Click on Questions sub-tab
    And It navigates to Questions page
    Then I click Edit Client button to edit client Questions page and navigates backwards
