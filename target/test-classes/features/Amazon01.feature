@Amazon
Feature: Amazon
  #Background: enter


  Scenario:  TC01-02 Visit Amazon App
    Given Run the App
    Given sign in an account
   Given validate sign in

  Scenario: TC03-08-09 ALL departman-Shoping list create, add, delete
   Given click burger button
   And click shop by department
   And list categories
    And select a category
   And list sub categories
    And click "List" button
    And create a list
    And add an idea on more options
    And delete idea on more options
    And delete ceated shoping list
    Scenario: TC04-05 search a product, filtering and sorting
     Given click search inbox
     And search "sony"
     And validate first product include it
     Then filters validate and click
     Then select "Over-Ear Headphones" category
     Then validate sort and click high to low
     Then scroll page and add product to a list

  Scenario: TC06 select random product add to cart
     Given select random products add to cart
     Then validate them

  Scenario: TC07 go to bottom of page
    Given click home button
    Given scroll bottom of page and click "All Departments"

# trello anahtar:8d34cd845bb10aa7ffab59c472d51663
  #trello token:c76c726b9c8d2dd8c297b5c03223f4b6910d6beda42a22748c6a253e96174c94
