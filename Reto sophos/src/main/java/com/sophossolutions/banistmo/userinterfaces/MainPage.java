package com.sophossolutions.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MainPage {

    public static final Target PRODUCTS_OPTION = Target.the("products and services option").locatedBy("//a[text()='Productos & Servicios']");
    public static final Target CREDIT_CARDS_OPTION = Target.the(" credit cards option").locatedBy("(//div[@class='row-fluid']) [5]");
    public static final Target APP = Target.the(" app options").locatedBy("(//div[@class='canal']) [2]");
}
