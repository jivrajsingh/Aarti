#Author: subhajit.ghosh@meganexus.com
@Client_Qualification
Feature: To test Client Groups and Barriers feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor
    Then Navigate to Clients main top-tab
    And under partner sub top tab filter with Name Surname and Prison and click on select button
    And View the client on record "1" after the search results

  @HMPBerwyn_BER29_Groups_Barriers_Edit
  Scenario: Be able to add Groups and Barriers in system
    Given User is on Berwyn client profile page
    When I Click on Groups and Barriers sub-tab
    And It navigates to Groups and Barriers page
    Then I click on Edit Groups button and fill it
    And I click on Edit Barriers button and fill it

  @HMPBerwyn_BER30_Groups_Barriers_View
  Scenario: Be able to view Groups and Barriers in system
    Given User is on Berwyn client profile page
    When I Click on Groups and Barriers sub-tab
    And It navigates to Groups and Barriers page
    Then I verify the Groups section
    And I verify the Barriers section

  @HMPBerwyn_BER237_Groups_Barriers_RBAC
  Scenario: To check that we are able to add/edit Groups and Barriers (RBAC)
    Given User is on Berwyn client profile page
    When I Click on Groups and Barriers sub-tab
    And It navigates to Groups and Barriers page
    Then I click on Edit Groups button and return to home page of Groups and Barriers
    And I click on Edit Barriers button and return to home page of Groups and Barriers
