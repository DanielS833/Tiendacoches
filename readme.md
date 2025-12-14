Tienda de Coches - Kotlin App

¡Bienvenido a Tienda de Coches, una aplicación Android desarrollada en Kotlin para explorar y gestionar un catálogo de coches de manera sencilla y visual!

Descripción

Esta aplicación muestra una lista de coches con información básica como:

Nombre del coche

Marca

Precio

Imagen del vehículo

El objetivo principal es proporcionar una experiencia interactiva en la que se pueda visualizar el catálogo completo de coches, y en un futuro se podrían añadir funcionalidades como editar o eliminar coches de la lista.

Funcionalidades Principales

Visualización de coches
Cada coche se muestra en un RecyclerView, con su nombre, marca, precio y una imagen representativa.

Gestión de datos
La información de los coches está centralizada en un Repository, que actúa como fuente de datos. Esto facilita obtener, actualizar o eliminar coches en el futuro.

Adapter y ViewHolder

Adaptercoche gestiona cómo se muestran los coches en la lista.

ViewHCoche se encarga de renderizar cada elemento individualmente.

Accesibilidad y modularidad

El DAO (DaoCoches) permite acceder a los datos de manera segura y centralizada.

La arquitectura está preparada para añadir futuras funcionalidades, como actualizaciones o borrado de coches.

Estructura del Proyecto

MainActivity
La actividad principal que inicializa el RecyclerView y el controlador.

Coche
Clase que define los atributos de un coche: name, brand, price e image.

Repository
Contiene la lista de coches de ejemplo que se muestran en la app.

DaoCoches
Encapsula la obtención de los datos desde el Repository.

Adaptercoche
Adapter del RecyclerView que gestiona la visualización de la lista de coches.

ViewHCoche
ViewHolder encargado de renderizar la información de cada coche.

Cómo Funciona

Al iniciar la app, MainActivity crea el RecyclerView y configura su layout manager (LinearLayoutManager).

Se inicializa un Controller que se encarga de manejar la interacción con los datos y el Adapter.

El Adaptercoche toma la lista de coches del Repository y la muestra en el RecyclerView.

Cada elemento del RecyclerView muestra los datos de un coche y, opcionalmente, podría tener botones para eliminar o actualizar el coche (preparado en el Adapter).

Actualmente la app está pensada para mostrar información de coches de manera visual, pero su estructura permite expandirla con funciones de gestión más avanzadas.