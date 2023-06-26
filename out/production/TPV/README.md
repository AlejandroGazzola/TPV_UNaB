# Introducción:
En esta memoria de práctica nos proponemos el diseño e implementación de una TPV.  Entendiendo que una terminal de punto de venta es un dispositivo electrónico que se utiliza para procesar transacciones de venta. Esta herramienta es fundamental en la mayoría de los negocios, ya que permite la gestión y registro de las ventas en tiempo real. 
De acuerdo al planteo de la cátedra, nuestro software permitirá crear e imprimir facturas, la información de las mismas será obtenida por la carga de productos por parte del vendedor registrado en el sistema, que en forma física recibirá el pago por parte del cliente.

# Planteamiento del problema

Nos proponemos en esta primera etapa ofrecer un software sencillo de utilizar que les permita a los vendedores generar facturas en base a los productos seleccionados por los clientes.

# Diseño

![image](https://github.com/AlejandroGazzola/TPV_UNaB/assets/124055626/338564bc-057f-4a13-b23f-98687e7d343b)

# Actores principales:

__Usuario__: Es la clase padre de la clase vendedor, contiene un método abstracto que deberá ser implementado por la clase hija, el mismo debe contener la lógica para el inicio de sesión de los vendedores.

__Vendedor__: Es el usuario que realiza la operación para cargar los productos y generar la factura, si no está registrado en el sistema no podrá ingresar.

__Facturas__: Se encarga de recibir los productos seleccionados de la TPV y generar la factura correspondiente, incluido el monto total de la compra.

__Main__: Es la clase principal del programa, la misma contiene el método de ejecución main() que inicia la aplicación.


# Funcionamiento de la aplicación

En esta aplicación proponemos que el sistema se inicie con un Inicio de sesión por parte de quien sea vendedor acreditado del comercio.
Una vez realizada la selección de productos y la generación de facturas, el vendedor de manera física recibirá el pago por parte del cliente.

# Resultado

![image](https://github.com/AlejandroGazzola/TPV_UNaB/assets/124055626/580fb333-3e39-45dd-b41a-faf770c41877)

