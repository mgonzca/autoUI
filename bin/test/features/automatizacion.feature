Feature: Enter the panorama project and create new user



  Background:
    Given El usuario se logea en la pagina

  @Build
  Scenario: Prueba 1
    When el usuario selecciona el escritorio y adciciona un articulo
    Then El usuario deberia visualziar Build your own computer


  @MensajeCarrito
  Scenario: Prueba 2
    When el usuario selecciona el escritorio y selecciona ram
    Then El usuario  deberia visualziar un mensaje The product has been added to your


  @ValidarPrecioPC
  Scenario: Prueba 3
    When el usuario selecciona el carrito de compras
    Then El usuario  deberia visualizar el precio de compra es 1,325.00

  @ValidarPrecioCamara
  Scenario: Prueba 4
    When el usuario agrega una camara a la compra
    Then El usuario  deberia visualizar nombre de la camara Leica T Mirrorless Digital Camera
    And El usuario  deberia visualizar el precio de compra camara es 530.00