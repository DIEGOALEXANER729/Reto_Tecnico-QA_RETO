package com.sanangel.stepDefinitions;


import com.sanangel.steps.InicioSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;


public class AgregarProductosStepDefinitions {


    @Steps
    InicioSteps inicioSteps;

    @Dado("que el usuario ingrese a la  URL")
    public void queElUsuarioIngreseALaURL() {

        inicioSteps.abrirNavegador();

    }
    @Cuando("el usuario seleccoine el  primer producto")
    public void elUsuarioSeleccoineElPrimerProducto() {
       inicioSteps.clicPrimerProducto();

    }
    @Cuando("agregue  dos unidades")
    public void agregueDosUnidades() {
        inicioSteps.limpiarCampoUnidades();
        inicioSteps.seleccionarCampoUnidades();
        inicioSteps.ingresarProductoUnoUnidad();

    }
    @Cuando("de clic en agregar al carrito")
    public void deClicEnAgregarAlCarrito() {

        inicioSteps.agregarProductoCarrito();

    }
    @Cuando("cuando el usuario seleccione el  segundo producto")
    public void cuandoElUsuarioSeleccioneElSegundoProducto() {

        inicioSteps.clicPaginaInicio();
        inicioSteps.clicSegundoProducto();


    }
    @Cuando("agregue cinco unidades")
    public void agregueCincoUnidades() {

        inicioSteps.limpiarCampoUnidadesProducto2();
        inicioSteps.clicSegundoProducto();
        inicioSteps.ingresarProductoUnoUnidadProducto2();

    }
    @Cuando("de clic en agregar carrito")
    public void deClicEnAgregarCarrito() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("se podra visualizar la compra de los dos productos con sus cantidades")
    public void sePodraVisualizarLaCompraDeLosDosProductosConSusCantidades() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
