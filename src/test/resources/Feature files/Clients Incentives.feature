#Author: subhajit.ghosh@meganexus.com
@Client_Qualification
Feature: To test Client Qualification feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor
    Then Navigate to Clients main top-tab
    And under partner sub top tab filter with Name Surname and Prison and click on select button
    And View the client on record "1" after the search results

  @HMPBerwyn_BER40_Incentives_Add
  Scenario: Be able to add Incentives in system
    Given User is on Berwyn client profile page
    When I Click on Incentives sub-tab
    And It navigates to Incentives page
    Then I click on Add Incentives button to fill form
    And I fill the add Incentives form
    And verify the Incentives form after add

  @HMPBerwyn_BER41_Incentives_Edit
  Scenario: Be able to edit Incentives in system
    Given User is on Berwyn client profile page
    When I Click on Incentives sub-tab
    And It navigates to Incentives page
    Then I click edit button on row "1" of Incentives table and edit a record
    And verify the Incentives form after edit

  @HMPBerwyn_BER42_Incentives_View
  Scenario: Be able to view Incentives in system
    Given User is on Berwyn client profile page
    When I Click on Incentives sub-tab
    And It navigates to Incentives page
    Then I click view button on row "1" of Incentives table
    And verify the Incentives form

  @HMPBerwyn_BER77_Incentives_Archieve
  Scenario: Be able to archieve Incentives in system
    Given User is on Berwyn client profile page
    When I Click on Incentives sub-tab
    And It navigates to Incentives page
    Then I click Archieve button on row "1" of Incentives table

  @HMPBerwyn_BER292_Incentives_List
  Scenario: Be able to verify Incentives list in system
    Given User is on Berwyn client profile page
    When I Click on Incentives sub-tab
    And It navigates to Incentives page
    Then verify the entire Incentives table contents

  @HMPBerwyn_BER238_Incentives_RBAC
  Scenario: To check that we are able to add/edit Incentives(RBAC) in the system
    Given User is on Berwyn client profile page
    When I Click on Incentives sub-tab
    And It navigates to Incentives page
    Then I click to add Incentive under the view page and return to home page of Incentive
    And I click edit button on row "1" of Incentive table and return to home page of Incentive
