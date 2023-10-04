package com.sanangel.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://sanangel.com.co/")
public class InicioPage extends PageObject {

    By  btnProducto1 = By.xpath("//*[@id=\"destacados-tab\"]/div[2]/div/ul/li[2]");
    By txtUnidad = By.xpath("//*[@id=\"quantity_651d9adc78e2a\"]");

    By btnAgregarCarrito = By.xpath("//*[@id=\"product-9543\"]/div[2]/form/button");

    By btnInicioPagina = By.xpath("//*[@id=\"sticky-wrapper\"]/header/div[2]/div");

    By btnProducto2 = By.xpath("//*[@id=\"destacados-tab\"]/div[2]/div/ul/li[3]");

    By txtProducto2 = By.id("quantity_651da14e34cfe");


    public By getBtnProducto1() {
        return btnProducto1;
    }

    public By getTxtUnidad() {
        return txtUnidad;
    }

    public By getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }

    public By getBtnInicioPagina() {
        return btnInicioPagina;
    }

    public By getBtnProducto2() {
        return btnProducto2;
    }

    public By getTxtProducto2() {
        return txtProducto2;
    }
}
