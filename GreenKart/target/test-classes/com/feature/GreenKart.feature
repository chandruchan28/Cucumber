Feature: GreenKart Automation
Scenario: User Buy the some Vegtables in GreenKart
Given User Launch the url
When User Serach the Vegtable
And user Click the Serach icon
And user Click the add to cart button
And user Click the items
And user Click the Proceed to Checkout
Then next page Show



Scenario: User Placed the Order

When User enter promo code
And User Click the apply button
And User the click Place Order
Then next page02 Shown


Scenario: Last Page of the Application

When User Select the Country
And User Click the Agree button
And User Click the Proceed
