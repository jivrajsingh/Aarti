#Author: subhajit.ghosh@meganexus.com
@Client_Allocation
Feature: To test Client Allocation feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with Berwyn supervisor
    Then Navigate to Clients main top-tab
    And under partner sub top tab filter with Name Surname and Prison and click on select button
    And View the client on record "1" after the search results

  @HMPBerwyn_BER161_Allocation_View
  Scenario: Be able to view Allocation in system
    Given User is on Berwyn client profile page
    When I Click on Allocation sub-tab
    And It navigates to Allocation page
    Then verify the Allocation form

  @HMPBerwyn_BER43_BER417_Allocation_List
  Scenario: Be able to view Allocation list in system
    Given User is on Berwyn client profile page
    When I Click on Allocation sub-tab
    And It navigates to Allocation page
    Then verify the entire Allocation table contents

  @HMPBerwyn_BER257_Allocation_JMESASorting_Filtering
  Scenario: Be able to sort JMESA and filter results
    Given User is on Berwyn client profile page
    When I Click on Allocation sub-tab
    And It navigates to Allocation page
    Then I take a screenshot for Client Allocation JMESA

  @HMPBerwyn_BER234_Client_Allocation_RBAC
  Scenario: To check that only Wales partner and Global users are able to add/edit
    Given User is on Berwyn client profile page
    When I Click on Allocation sub-tab
    And It navigates to Allocation page
    Then verify the entire Allocation table contents
    And I take a screenshot for Client Allocation RBAC
