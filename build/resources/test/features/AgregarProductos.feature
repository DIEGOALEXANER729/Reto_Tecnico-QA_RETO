
#language:es

Característica: Agregar dos productos al carrito de compras
  Yo como usuario quiero validar el registro de dos productos ( 1 producto con 2 cantidades y 2 producto con 5 cantidades)

  @Agregar
  Escenario: Agregar 2 productos al carro de compras
    Dado que el usuario ingrese a la  URL
    Cuando el usuario seleccoine el  primer producto
    Y agregue  dos unidades
    Y de clic en agregar al carrito
    Y cuando el usuario seleccione el  segundo producto
    Y agregue cinco unidades
    Y de clic en agregar carrito
    Entonces  se podra visualizar la compra de los dos productos con sus cantidades
