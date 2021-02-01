Feature: User can add multiple items to cart

  @userCanAddWomenBlouse
  Scenario: User can add women blouse
    Given The user is on Homepage
    When the user clicks Women
    And user clicks Tops
    And User Clicks blouses
    And user clicks on add to cart
    Then the user clicks on continue shopping
    And the user is returned to the homepage


  @UserCanAddWomenEveningDress
  Scenario: user can add women evening dress
    Given the user is on Homepage
    When the user clicks Women
    And user clicks Dresses
    And User Clicks evening dresses
    And user clicks on (Quick View) printed dress
    And user clicks on add to cart from Pop up
    Then the user clicks on continue shopping
    And the user is returned to the homepage


  @UserVerifiesShoppingCartHas2ItemsInCart
  Scenario: user verifies shopping cart has 2 items in cart
    Given the user is on Homepage
    When the user clicks Cart
    And user verifies the total products = 2
    And User Clicks checkout
    Then user is taken to the Authentication screen