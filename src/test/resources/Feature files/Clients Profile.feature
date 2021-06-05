#Author: subhajit.ghosh@meganexus.com
@Subhajit
 @Client_Profile
Feature: To test Client profile feature for HMP Berwyn

  Background: 
    Given As an user i will open MIS login page
    When I provide correct credentials
    And Click on Login button with SuperUser

  @HMPBerwyn_BER24_BER443_BER470_Profile_Add
  Scenario: Be able to add a client in system
    Given User is on Clients page
    When I Click on Add Client button
    And It navigates to Add Client page
    Then I fill new client profile form
    And I click on save button

  @HMPBerwyn_BER25_Profile_Edit
  Scenario: Be able to edit client profile in system
    Given User is on Clients page
    And under clients sub top tab filter client name and surname under firstname and surname
    When I Click on view button to view a client profile
    And It navigates to View Client page
    Then I click Edit Client button to edit client profile
    And I fill and save the client profile form

  @HMPBerwyn_BER26_Profile_View
  Scenario: Be able to view client profile
    Given User is on Clients page
    And under clients sub top tab filter client name and surname under firstname and surname
    When I Click on view button to view a client profile
    And It navigates to View Client page
    And verify the Client profile form on View Client page
    
    @HMPBerwyn_BER235_Profile_RBAC
  Scenario: To check that we are able to view Profile record(RBAC) in the system
     Given User is on Clients page
    And under clients sub top tab filter client name and surname under firstname and surname
    When I Click on view button to view a client profile
    And It navigates to View Client page
    
