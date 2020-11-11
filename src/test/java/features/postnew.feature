Feature:Gestionar los modulos de Post como usuario
  quiero acceder al sistema y poder crear y editar el modulo de post

  Scenario: Crear nuevo post
    Given El usuario se encuentra en la pagina login de opensourcecms
    When Ingresa un usuario y una contraseña hace click sobre el boton Login in
    Then Se debe redirigir a la pantalla Dashboard
    When Se ubica en el modulo de post y Agrega un nuevo post
    Then Guarda cambios y regresa al modulo post




