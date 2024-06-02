/*datos de los socos*/
INSERT INTO `socios` (`fecha_nacimiento`, `numero_casa`, `personas_dependientes`, `tiempo_residencia`, `id`, `apellido`, `nombres`, `carpeta`, `cedula`, `celular`, `ciudad`, `correo`, `direccion`, `estado_civil`, `genero`, `lugar_nacimiento`, `parroquia`, `profesion`, `propietario`, `provincia`, `referencia`, `sector`, `telefono`, `telefono_propietario`, `tipo_casa`) VALUES ('1955-06-13', '1', '5', '30', NULL, 'Nieves', 'Roberto', 'Solicitud de un credito', '0105577985', '0985586935', 'Cuenca', 'rn@gmail.com', 'Chilcapamba-Via al Valle', 'Casado', 'Masculino', 'Cuenca-Ecuador', 'Gualalcay', 'Developer', 'Juan', 'Azuay', 'Iglesia', 'San Jose', '0985586935', '0123654789', 'Ladrillo');
INSERT INTO `socios` (`fecha_nacimiento`, `numero_casa`, `personas_dependientes`, `tiempo_residencia`, `id`, `apellido`, `nombres`, `carpeta`, `cedula`, `celular`, `ciudad`, `correo`, `direccion`, `estado_civil`, `genero`, `lugar_nacimiento`, `parroquia`, `profesion`, `propietario`, `provincia`, `referencia`, `sector`, `telefono`, `telefono_propietario`, `tipo_casa`) VALUES ('1955-06-13', '1', '3', '15', NULL, 'Farez', 'Bryan', 'Solicitud de un credito', '0105577986', '0985586935', 'Cuenca', 'br@gmail.com', 'Chilcapamba-Via al Valle', 'Casado', 'Masculino', 'Cuenca-Ecuador', 'Victoria', 'Docente', 'Pedro', 'Azuay', 'Via al valle', 'El cisne', '0985586935', '0123654789', 'Ladrillo');
INSERT INTO `socios` (`fecha_nacimiento`, `numero_casa`, `personas_dependientes`, `tiempo_residencia`, `id`, `apellido`, `nombres`, `carpeta`, `cedula`, `celular`, `ciudad`, `correo`, `direccion`, `estado_civil`, `genero`, `lugar_nacimiento`, `parroquia`, `profesion`, `propietario`, `provincia`, `referencia`, `sector`, `telefono`, `telefono_propietario`, `tipo_casa`) VALUES ('1955-06-13', '1', '3', '10', NULL, 'Matute', 'John', 'Solicitud de un credito', '0105577987', '0985586935', 'Cuenca', 'jm@gmail.com', 'Chilcapamba-Via al Valle', 'Casado', 'Masculino', 'Cuenca-Ecuador', 'Gualalcay', 'Developer', 'Rosa', 'Azuay', 'Iglesia-Centro', 'Chilcapamba', '0985586935', '0123654789', 'Ladrillo');
INSERT INTO `socios` (`fecha_nacimiento`, `numero_casa`, `personas_dependientes`, `tiempo_residencia`, `id`, `apellido`, `nombres`, `carpeta`, `cedula`, `celular`, `ciudad`, `correo`, `direccion`, `estado_civil`, `genero`, `lugar_nacimiento`, `parroquia`, `profesion`, `propietario`, `provincia`, `referencia`, `sector`, `telefono`, `telefono_propietario`, `tipo_casa`) VALUES ('1955-06-13', '1', '6', '30', NULL, 'Nieves', 'Luis', 'Solicitud de un credito', '0105577988', '0985586935', 'Cuenca', 'ln@gmail.com', 'Chilcapamba-Via al Valle', 'Casado', 'Masculino', 'Cuenca-Ecuador', 'Cuatro esquinas', 'Docente', 'Juan', 'Azuay', 'UE Eloy Alfaro', 'Chilcapamba', '0985586935', '0123654789', 'Bloque');

/*datos CONYUGE*/
INSERT INTO `conyugue` (`fecha_nacimiento`, `id`, `socio_id`, `apellido`, `nombre`, `area`, `cedula`, `direccion`, `ocupacion`, `profesion`, `telefono`) VALUES ('1975-06-24', NULL, '1', 'Fernandez', 'Gladys', 'Ama de casa', '0123456789', 'Victoria Alta', 'Ama de casa', 'Ama de casa', '0985583598');
INSERT INTO `conyugue` (`fecha_nacimiento`, `id`, `socio_id`, `apellido`, `nombre`, `area`, `cedula`, `direccion`, `ocupacion`, `profesion`, `telefono`) VALUES ('1985-06-24', NULL, '2', 'Loma', 'Carmen', 'salud', '0123456781', 'Victoria Alta', 'Auxiliar', 'Enfermera', '0985583591');
INSERT INTO `conyugue` (`fecha_nacimiento`, `id`, `socio_id`, `apellido`, `nombre`, `area`, `cedula`, `direccion`, `ocupacion`, `profesion`, `telefono`) VALUES ('1975-06-24', NULL, '3', 'Farez', 'Eulalia', 'Docente', '0123456782', 'Chilcapamba', 'Educacion Basica', 'Profesora', '0985583592');

/*datos inmobiliarios false=b'00000'   true=b'1'*/
INSERT INTO `inmobiliarios` (`hipotecado`, `valor`, `id`, `socio_id`, `direccion`, `institucion`, `tipo_propiedad`) VALUES (b'00000', '4000', NULL, '1', 'Chilcapamba-Via al Valle', 'Ninguna', 'Casa');
INSERT INTO `inmobiliarios` (`hipotecado`, `valor`, `id`, `socio_id`, `direccion`, `institucion`, `tipo_propiedad`) VALUES (b'1', '5200', NULL, '2', 'San Jose', 'E&A Broks', 'Casa');
INSERT INTO `inmobiliarios` (`hipotecado`, `valor`, `id`, `socio_id`, `direccion`, `institucion`, `tipo_propiedad`) VALUES (b'00000', '2000', NULL, '4', 'Chilcapamba-Via al Valle', 'Ninguna', 'Casa');

/*datos Referencias Personales*/
INSERT INTO `referencias_personales` (`confirmacion`, `id`, `socio_id`, `apellido`, `direccion`, `nombre`, `parentesco`, `telefono`) VALUES (b'1', NULL, '1', 'Perez', 'Don Bosco', 'Jeff', 'Jefe del Trabajo', '0120236548');
INSERT INTO `referencias_personales` (`confirmacion`, `id`, `socio_id`, `apellido`, `direccion`, `nombre`, `parentesco`, `telefono`) VALUES (b'1', NULL, '2', 'Villa', 'Kennedy', 'Isacc', 'Tio', '0120236545');
INSERT INTO `referencias_personales` (`confirmacion`, `id`, `socio_id`, `apellido`, `direccion`, `nombre`, `parentesco`, `telefono`) VALUES (b'1', NULL, '3', 'Benavides', 'Ricaurte', 'Jose', 'Vecino', '0120236547');

/*datos Trabajo*/
INSERT INTO `trabajo` (`anios_trabajados`, `id`, `socio_id`, `area`, `direccion`, `nombre`, `ocupacio`, `telefono`) VALUES ('25', NULL, '1', 'Software', 'Octavio Chacon 11-2 y tranversal', 'Tec Azuay', 'Developer', '1236541205');
INSERT INTO `trabajo` (`anios_trabajados`, `id`, `socio_id`, `area`, `direccion`, `nombre`, `ocupacio`, `telefono`) VALUES ('5', NULL, '2', 'Software', 'Av. Espania', 'UPS', 'Developer', '1236541208');
INSERT INTO `trabajo` (`anios_trabajados`, `id`, `socio_id`, `area`, `direccion`, `nombre`, `ocupacio`, `telefono`) VALUES ('25', NULL, '3', 'Software', 'Parque Industrial', 'Llantera', 'Obrero', '1236541405');
INSERT INTO `trabajo` (`anios_trabajados`, `id`, `socio_id`, `area`, `direccion`, `nombre`, `ocupacio`, `telefono`) VALUES ('12', NULL, '4', 'Software', 'Octavio Chacon 11-2 y tranversal', 'Tec Azuay', 'Developer', '1236588205');

/*datos vehiculo*/
INSERT INTO `vehiculos` (`anio_fabricacion`, `valor`, `id`, `socio_id`, `marca`, `numero_placa`, `tipo_vehiculo`) VALUES ('2000-06-20', '5200', NULL, '1', 'Nissan', 'AP-000050', 'Automovil');
INSERT INTO `vehiculos` (`anio_fabricacion`, `valor`, `id`, `socio_id`, `marca`, `numero_placa`, `tipo_vehiculo`) VALUES ('1990-06-20', '8200', NULL, '2', 'Toyota', 'AP-000074', 'Automovil');
INSERT INTO `vehiculos` (`anio_fabricacion`, `valor`, `id`, `socio_id`, `marca`, `numero_placa`, `tipo_vehiculo`) VALUES ('2010-06-20', '9200', NULL, '3', 'Hyundai', 'TAP-000054', 'Automovil');
INSERT INTO `vehiculos` (`anio_fabricacion`, `valor`, `id`, `socio_id`, `marca`, `numero_placa`, `tipo_vehiculo`) VALUES ('2009-06-20', '7200', NULL, '4', 'Nissan', 'AP-000216', 'Automovil');



-- Datos Negocio
INSERT INTO `negocios`(`antiguedad`, `hipotecado`, `numero_casa`, `numero_empleados`, `tiempo_local`, `socio_id`, `actividad`, `actividad_negocio`, `cuidad`, `direccion`, `institucion`, `locales`, `lugar_ventas`, `razon_social`, `referencia`, `ruc`, `subactividad`, `telefono`) VALUES (4 ,false ,345 ,10 ,6 ,1 ,'Vetna y compra de ropa','venta de ropa','Cuenca','Calle larga/Fabian Alarcon','N/A','Ninguno','Parque historico','Baratismo','Cerca del paque Calderón','11111','Compra de ropa usada','222-45-67');
INSERT INTO `negocios`(`antiguedad`, `hipotecado`, `numero_casa`, `numero_empleados`, `tiempo_local`, `socio_id`, `actividad`, `actividad_negocio`, `cuidad`, `direccion`, `institucion`, `locales`, `lugar_ventas`, `razon_social`, `referencia`, `ruc`, `subactividad`, `telefono`) VALUES (1 ,true ,265 ,5 ,4 ,2 ,'Prestacion de servicios de internet','Servicios de internet','Machala','Juan Maldonado/Jep','BanEcuador','Ninguno','Parque de la Madre','InterPlus','Al frenete del Shopping','567896','Ninguna','123-567-86');
INSERT INTO `negocios`(`antiguedad`, `hipotecado`, `numero_casa`, `numero_empleados`, `tiempo_local`, `socio_id`, `actividad`, `actividad_negocio`, `cuidad`, `direccion`, `institucion`, `locales`, `lugar_ventas`, `razon_social`, `referencia`, `ruc`, `subactividad`, `telefono`) VALUES (3 ,false ,674 ,1 ,2 ,3 ,'Venta de perfumes','Vetna de perfumes Avon','Santa Rosa','10 de agosto/Calderon','N/A','Ninguno','Subcentro deL tho','Bellaza Yess','Cerca del parque de la Madre','7890r','Venta de cosmeticos','730-11-79');

-- Datos de Activos
INSERT INTO `activos`(`bienes_inmuebles`, `cuentas_cobrar`, `depositos_financieros`, `efectivo`, `herramientas_maquinaria`, `inventario_mercaderia`, `inversion_cultivos`, `inversion_ganado`, `muebles`, `total`, `vehiculos`, `socio_id`) VALUES (1000.00, 1000.00, 2000.00, 5000.00, 30000.00, 0.0, 2000.00, 0.0,800.00, 20000.00 ,5200.00,1);
INSERT INTO `activos`(`bienes_inmuebles`, `cuentas_cobrar`, `depositos_financieros`, `efectivo`, `herramientas_maquinaria`, `inventario_mercaderia`, `inversion_cultivos`, `inversion_ganado`, `muebles`, `total`, `vehiculos`, `socio_id`) VALUES (1000.00, 1000.00, 2000.00, 5000.00, 30000.00, 0.0, 1000.00, 0.0,800.00, 22000.00 ,8200.00,2);
INSERT INTO `activos`(`bienes_inmuebles`, `cuentas_cobrar`, `depositos_financieros`, `efectivo`, `herramientas_maquinaria`, `inventario_mercaderia`, `inversion_cultivos`, `inversion_ganado`, `muebles`, `total`, `vehiculos`, `socio_id`) VALUES (1000.00, 1000.00, 2000.00, 1000.00, 20000.00, 0.0, 2000.00, 0.0,800.00, 19000.00 ,9200.00,3);

-- Datos de Pasivos
INSERT INTO `pasivos`(`deudas_almacenes`, `deudas_banco`, `deudas_cooperativas`, `deudas_otras`, `deudas_proovedores`, `deudas_tarjetas_credito`, `patromonio`, `total`, `total_pasivos`, `socio_id`) VALUES (1000.00, 1000.00, 0.0, 500.00, 500.00, 0.0,17000.00, 20000.00,3000.00,1);
INSERT INTO `pasivos`(`deudas_almacenes`, `deudas_banco`, `deudas_cooperativas`, `deudas_otras`, `deudas_proovedores`, `deudas_tarjetas_credito`, `patromonio`, `total`, `total_pasivos`, `socio_id`) VALUES (1000.00, 1000.00, 0.0, 1000.00, 1000.00, 0.0, 18000.00, 22000.00,4000.00,2);
INSERT INTO `pasivos`(`deudas_almacenes`, `deudas_banco`, `deudas_cooperativas`, `deudas_otras`, `deudas_proovedores`, `deudas_tarjetas_credito`, `patromonio`, `total`, `total_pasivos`, `socio_id`) VALUES (1000.00, 1000.00, 0.0, 5000.00, 0.0, 0.0,12000.00, 19000.00,7000.00,3);

-- Datos Credito
INSERT INTO `creditos`(`fecha_solicitud`, `plazo`, `valor_solicitado`, `socio_id`, `ciudad`, `estado`, `forma_pago`, `inversion`, `provincia`, `tipo_credito`)  VALUES ('2024-06-01', 1, 20000.00, 1, 'Cuenca', 'Habilitado', 'Mensual', 'dddd', 'Azuay', 'Microcredito');
INSERT INTO `creditos`(`fecha_solicitud`, `plazo`, `valor_solicitado`, `socio_id`, `ciudad`, `estado`, `forma_pago`, `inversion`, `provincia`, `tipo_credito`)  VALUES ('2024-06-02', 1, 60000.00, 2, 'Cuenca', 'Habilitado', 'Mensual', 'dddd', 'Azuay', 'Supercredito');
INSERT INTO `creditos`(`fecha_solicitud`, `plazo`, `valor_solicitado`, `socio_id`, `ciudad`, `estado`, `forma_pago`, `inversion`, `provincia`, `tipo_credito`)  VALUES ('2024-06-03', 1, 10000.00, 3, 'Cuenca', 'Habilitado', 'Mensual', 'dddd', 'Azuay', 'Microcredito');

-- Datos de Ingresos
INSERT INTO `ingresos`(`agricultura`, `alquiler_vehiculos`, `arriendos`, `comercio`, `ganaderia`, `intereses`, `otros_ingresos`, `pensiones`, `sueldo`, `sueldo_conyugue`, `total_ingresos`, `socio_id`) VALUES (0.0, 0.0, 0.0, 0.0, 0.0, 0.0,0.0, 0.0 ,4000.00, 0.0,4000.00, 1);
INSERT INTO `ingresos`(`agricultura`, `alquiler_vehiculos`, `arriendos`, `comercio`, `ganaderia`, `intereses`, `otros_ingresos`, `pensiones`, `sueldo`, `sueldo_conyugue`, `total_ingresos`, `socio_id`) VALUES (100.0, 100.0, 0.0, 0.0, 0.0, 0.0,0.0, 0.0 ,2000.00, 0.0,2200.00, 2);
INSERT INTO `ingresos`(`agricultura`, `alquiler_vehiculos`, `arriendos`, `comercio`, `ganaderia`, `intereses`, `otros_ingresos`, `pensiones`, `sueldo`, `sueldo_conyugue`, `total_ingresos`, `socio_id`) VALUES (0.0, 0.0, 0.0, 0.0, 0.0, 500.0,500.0, 0.0 ,1000.00, 0.0,2000.00, 3);

-- Datos de gastos
INSERT INTO `gastos`(`alimentacion`, `arriendo`, `deudas`, `educacion`, `otros_egresos`, `pensiones`, `salud`, `servicios_basico`, `total_gastos`, `transporte`, `vestimenta`, `socio_id`) VALUES (1000.00, 0.0, 0.0, 100.00 ,100.00 ,100.00,100.00 ,50.0,1600.00,50.00,100.00, 1);
INSERT INTO `gastos`(`alimentacion`, `arriendo`, `deudas`, `educacion`, `otros_egresos`, `pensiones`, `salud`, `servicios_basico`, `total_gastos`, `transporte`, `vestimenta`, `socio_id`) VALUES (500.00, 0.0, 0.0, 0.0 ,100.00 ,0.0,0.0 ,50.0, 800.00,50.00,100.00, 2);
INSERT INTO `gastos`(`alimentacion`, `arriendo`, `deudas`, `educacion`, `otros_egresos`, `pensiones`, `salud`, `servicios_basico`, `total_gastos`, `transporte`, `vestimenta`, `socio_id`) VALUES (500.00, 0.0, 0.0, 100.00 , 0.00 ,0.0,0.0 ,50.0,700.00,50.00,0.0, 3);



