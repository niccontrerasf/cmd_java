# cmd_java
Herecia, package basico y compilar y exportar a .jar por linea de comandos.



Instrucciones simples:
ejecute: format.bat	##para crear los .class y el .jar
ejecute: app.bat	##para ejecutar el .jar por consola

* los .bat contiene puro comandos java, asi que deberian ser portables a linux
limpie la challa antes de continuar


**OJO que debe tener seteado el patch de los binarios de java, java, jar y javac.
lo mas facil pa ver si estan en el PATH es probar..java jar o javac por comando si responden estan en el path, sino teni que agregarlas y lo mas probable cerrar e iniciar sesion pa que las tome.
Las podi agregar a manito al PATH de wilson o de linux. Si teni mas de 1 jdk da lo mismo, elije uno.

wilson
MIPC->Propiedades->Conf avanzada Sistema->Pestaña avanzado->Variables de entorno->PATH
agregar donde estan los binarios del jdk ejemplo:
C:\Program Files\Java\jdk1.8.0_20\bin;C:\baibai\bin
Reinicie sesion.

linux #cambio temporal, pa dejarlo fijo hay que agregarlo al /etc/profile o 
export PATH=/opt/pumpa/jdk8000/bin:$PATH



**** Corfo y Nicolas se desligan de cualquier efecto colateral del programa y responsabilidad. Utilicelo bajo su propia irresponsabilidad.


Crear carpetas (da lo mismo el nombre)
java
|-src	##codigo fuente .java

Persona.java -> public class Persona{}
Tomas.java -> public class Tomas{}
Main.java -> main{}


****Clases deben ir con Mayusculas debe ser publicas y debe tener el mismo nombre la clase que el archivo.
****Las opciones adicionales a cada comando java,javac o jar...aplique ?;   java -?
 
 
Para compilar y ejecutar se debe usar el classpath y las rutas que contienen las clases y dependencias.
java -classpath "carpeta1;carpeta2;package1"
Es ideal tener una carpeta para cada cosa, una los .java (sin importar el pkg) y otra pa los class. src y bin por ejemplo.
 
Estoy parado en carpeta raiz java!!!!!!!!
 
##Compilo todos los archivos .java (pkg, dependencias, herencia) juntos que estan en src/ y le digo que me tire los .class a . (aqui mismo), por lo tanto crea la estructura del package (carpeta). bin/
javac -d . -classpath . src/*.java

##Ejecuto el .class que tenga metodo main(), ojo que no se pone la extension .class y el classpath dice que el resto de clases (pkg y herencia) estan en . (aqui, referenciandose dede la ubicacion del main bin/)
java -classpath . bin.Main

****me genera automaticamente la jerarquia de carpetas bin package com/tomastech

##para crear un .jar (ejecutable java, como un .exe pero pa la jvm)
##genera un .jar con todos los archivos de la carpeta bin (ojo con el punto . que tmbn va)
##es necesario un archivo manifest para especificar cual es la clase del main o usar un default
## https://docs.oracle.com/javase/tutorial/deployment/jar/appman.html
jar cvfe app.jar bin.Main bin

##para ejecutar el .jar por consola... doble click no funca por que es programa de consola, probar app.bat que llama al cmd y la app.
java -jar app.jar


****OJO que cada ves que compilas debes limpiar los archivos que se generan, si recompilas sobrescribe lso archivos antiguos...pero si cambias la estructura de package o borraste clases...los .class van a quedar dando vuelta.


Estructura final de archivos:

java
¦   app.bat
¦   app.jar
¦   format.bat
¦   reame no sea wom.txt
¦
+---bin
¦   ¦   Main.class
¦   ¦
¦   +---com
¦       +---tomastech
¦               Persona.class
¦               Tomas.class
¦
+---src
        Main.java
        Persona.java
        Tomas.java
 
