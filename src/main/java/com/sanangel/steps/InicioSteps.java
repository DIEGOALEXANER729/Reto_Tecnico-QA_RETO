package com.sanangel.steps;


import com.sanangel.pages.InicioPage;
import com.sanangel.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;



public class InicioSteps {

    InicioPage inicio= new InicioPage();

    @Step("abrir la url")
    public void abrirNavegador(){
        inicio.open();
    }

    @Step("Hacer click en el primer producto")
    public void clicPrimerProducto(){

        inicio.getDriver().findElement(inicio.getBtnProducto1()).click();
        EsperaImplicita.esperaImplicita(2);

    }

    @Step("limpiar campo unidades")
    public void limpiarCampoUnidades(){
        inicio.getDriver().findElement(inicio.getTxtUnidad()).clear();

    }


    @Step("ubicarme campo unidades")
    public void seleccionarCampoUnidades(){

        inicio.getDriver().findElement(inicio.getTxtUnidad()).click();

    }


    @Step("Ingresar dos unidades")
    public void ingresarProductoUnoUnidad(){

        EsperaImplicita.esperaImplicita(2);
        inicio.getDriver().findElement(inicio.getTxtUnidad()).sendKeys("2");

    }

    @Step("Clic en añadir al carrito")
    public void agregarProductoCarrito(){

        inicio.getDriver().findElement(inicio.getBtnAgregarCarrito()).click();

    }

    @Step("Clic pagina de inicio")
    public void clicPaginaInicio(){

        inicio.getDriver().findElement(inicio.getBtnInicioPagina()).click();

    }

    @Step("Hacer click en el segundo producto")
    public void clicSegundoProducto(){

        inicio.getDriver().findElement(inicio.getBtnProducto2()).click();
        EsperaImplicita.esperaImplicita(2);

    }


    @Step("limpiar campo unidades producto 2")
    public void limpiarCampoUnidadesProducto2(){
        inicio.getDriver().findElement(inicio.getTxtProducto2()).clear();

    }


    @Step("ubicarme campo unidades producto 2")
    public void seleccionarCampoUnidadesProducto2(){

        inicio.getDriver().findElement(inicio.getTxtProducto2()).click();

    }


    @Step("Ingresar dos unidades producto 2")
    public void ingresarProductoUnoUnidadProducto2(){

        EsperaImplicita.esperaImplicita(2);
        inicio.getDriver().findElement(inicio.getTxtProducto2()).sendKeys("5");

    }



}
