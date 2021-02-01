package com.automationpractice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;

public class ProductregisterUserinterfaces {

    public static final Target BTN_WOMEN = Target.the("button women").locatedBy("(//a[@class='sf-with-ul' and contains (.,'Women')])[1]");
    public static final Target BTN_DRESSES = Target.the("button dresses").locatedBy("(//a[@class='sf-with-ul' and contains (.,'Dresses')])[1]");
    public static final Target BTN_TOP = Target.the("button top").locatedBy("//a[@class='sf-with-ul' and contains (.,'Tops')]");
    public static final Target BTN_BLOUSES = Target.the("button blouses").locatedBy("(//*[@class='replace-2x'])[2]");
    public static final Target ADD_TO_CART = Target.the("button ad to cart").locatedBy("//a[@class='button ajax_add_to_cart_button btn btn-default' and contains (.,'Add to cart')]");
    public static final Target MOUSE_BLOUSE = Target.the("button blouse").locatedBy("(//img[@class='replace-2x img-responsive'])[2]");
    public static final Target BTN_CONTINUE_SHOPPING = Target.the("button continue shoping").locatedBy("//*[@class='continue btn btn-default button exclusive-medium']");
    public static final Target BTN_HOME = Target.the("button home").locatedBy("//*[@class = 'logo img-responsive']");
    public static final Target BTN_EVENING_DRESSES = Target.the("button evenin dresses").locatedBy("//a[@class='subcategory-name' and contains (.,'Evening Dresses')]");
    public static final Target MOUSE_PRINTED_DRESS = Target.the("button printed dress").locatedBy("(//*[@class='replace-2x img-responsive'])[2]");
    public static final Target BTN_QUICK_VIEW = Target.the("button quick view").locatedBy("//a[@class='quick-view' and contains (.,'Quick view')]");
    public static final Target BTN_ADD_TO_CART = Target.the("button dresses").locatedBy("//*[@id=\"add_to_cart\"]/button/span");
    public static final Target BTN_CART = Target.the("cart").locatedBy("(//*[@class='ajax_cart_quantity'])[1]");
    public static final Target BTN_CANT_CART = Target.the("cart").locatedBy("(//*[@class = 'ajax_cart_quantity' and contains (.,'2')])[1]");
    public static final Target BTN_ORDER_CART = Target.the("button order cart").located(By.id("button_order_cart"));
    public static final Target CHECKOUT = Target.the("checkout").locatedBy("//*[@id=\"center_column\"]/p[2]/a[1]/span/text()");
    public static final Target AUTENTICATION = Target.the("autentication").locatedBy("//*[@class = 'icon-user left']");

}
