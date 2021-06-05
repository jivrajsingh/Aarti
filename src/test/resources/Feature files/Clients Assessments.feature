#Author: subhajit.ghosh@meganexus.com
@Client_Assessments
Feature: To test Client Assessments feature for HMP Berwyn

  Background: 
     Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with MIS Wales supervisor
    Then Navigate to Clients main top-tab
    And under partner sub top tab filter with Name Surname and Prison and click on select button
    And View the client on record "1" after the search results


  @HMPBerwyn_BER186_BER444_BER481_BER449_MW_Assessments_Add
  Scenario: Be able to add Assessments in system
    Given User is on Berwyn client profile page
    When I Click on Assessments sub-tab
    And It navigates to Assessments page
    Then I click on Add Assessments button to fill form
    And I fill the add Assessments form
    And verify the Assessments form after add

  @HMPBerwyn_BER185_BER450_MW_Assessments_Edit
  Scenario: Be able to edit Assessments in system
    Given User is on Berwyn client profile page
    When I Click on Assessments sub-tab
    And It navigates to Assessments page
    Then I click edit button on row "1" of Assessments table and fill it
    And verify the Assessments form after edit

  @HMPBerwyn_BER184_MW_Assessments_View
  Scenario: Be able to view Assessments in system
    Given User is on Berwyn client profile page
    When I Click on Assessments sub-tab
    And It navigates to Assessments page
    Then I click view button on row "1" of Assessments table
    And verify the Assessments form

  @HMPBerwyn_BER183_BER449_MW_Assessments_List
  Scenario: Be able to verify Assessments list in system
    Given User is on Berwyn client profile page
    When I Click on Assessments sub-tab
    And It navigates to Assessments page
    Then verify the entire Assessments table contents

  @HMPBerwyn_BER259_MW_Assessments_JMESASorting_Filtering
  Scenario: Be able to sort JMESA and filter results
    Given User is on Berwyn client profile page
    When I Click on Assessments sub-tab
    And It navigates to Assessments page
    And click on JMESA and filters and test it for MW Assessments
    
    @HMPBerwyn_BER243_MW_Assessments_RBAC
  Scenario: To check that we are able to add/edit Incentives(RBAC) in the system
    Given User is on Berwyn client profile page
    When I Click on Incentives sub-tab
    And It navigates to Incentives page
    Then I click to add Incentive under the view page and return to home page of Incentive
    And I click edit button on row "1" of Incentive table and return to home page of Incentive
