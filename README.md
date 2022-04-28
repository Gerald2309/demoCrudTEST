# demoCrudTEST
Haga lo siguiente:

- Agregue un endPoint de actualizacion de usuario

- Incorpore una nueva entidad/modelo(UsuarioRol) que tenga los campos (idUsuario,idRol,Rol("vendedor","cajero","consultor",etc..)) un usuario puede en un momento tener 1 o mas roles asociados. debe haber una relacion (Usuario - UsuarioRol): @ManyToOne Relation @OneToMany Relation @OneToOne Relation @ManyToMany Relation aplique la que usted considere mas apropiada y en README justifique ademas incorpore en este mismo README coloque varias ScreenShoot(capturas) de la ejecucion de la API REST.

- Implemente algunas pruebas unitarias a esa nueva entidad/modelo

Debe registrar en la tabla de abajo su nombre completo y su repositorio de github con la solucion.

Actualizar Usuario: 
![WhatsApp Image 2022-04-28 at 10 06 59 AM](https://user-images.githubusercontent.com/68652749/165793811-de3a818c-d6fe-4cb6-be44-ae249beb4658.jpeg)

Actualizar Rol:
![WhatsApp Image 2022-04-28 at 10 14 09 AM](https://user-images.githubusercontent.com/68652749/165794329-a26d2b5f-6ebc-4e82-b80c-c7e71d95b638.jpeg)

Agregar Rol:
![WhatsApp Image 2022-04-28 at 10 15 06 AM](https://user-images.githubusercontent.com/68652749/165794526-be2aea07-8894-4a7b-a6fe-078b4935727d.jpeg)

Eliminar Rol:
![WhatsApp Image 2022-04-28 at 10 16 25 AM](https://user-images.githubusercontent.com/68652749/165794824-d9a08eca-053e-4b0f-9fe2-34afc8986c80.jpeg)

Usuarios con rol:
![WhatsApp Image 2022-04-28 at 10 17 56 AM](https://user-images.githubusercontent.com/68652749/165794943-733380e3-7ab1-402d-a1fb-cf359b2dccc3.jpeg)

La relación entre rolUsuario y Usuario es OneToMany o "Uno a muchos" porque Usuario puede contener varios roles
