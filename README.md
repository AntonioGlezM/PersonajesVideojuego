## Descripción del Proyecto
Un sistema de creación y representación de personajes altamente inspirado temáticamente en Dungeons and Dragons Quinta Edición, hecho como proyecto estudiantil para la UT4 de Programación

## Features
- **Sistema de Personajes**: A partir de plantillas arquetípicas de personajes de fantasía, como el mago, el clérigo, el guerrero o el paladín, se pueden crear clases con distintas capacidades. Los arquetipos concretos se les llaman Clases porque así se les llama en Dungeons and Dragons
- **Sistema de Inventarios**: Cada personaje cuenta con espacios para un arma, que puede equiparse o no, y espacios de cantidad indefinida para consumibles. Solo se han implementado pociones
- **Sistema de Armas**: Cada arma tiene una jherarquía y una rareza que determina su daño. Quedó pendiente determinar qué personajes pueden llevar qué tipo de armas (aunque técnicamente eso corresponde más a la sección de personaje)
- **Sistema de Armaduras**: Similar a las armas, las armaduras tienen una jerarquía y determinan que tanto protegen basado en su rareza.
- **Sistema de Acciones y Capacidades**: Cada arquetipo de personajes tiene distintas capacidades (excepto la de Atacar, que la tienen todos los personajes) que modifica al objetivo. Quedó pendiente hacer un sistema dinámico que mostrase solamente las capacidades de cada personaje y permitiese seleccionar de entre dichas capacidades
- **Sistema de Conjuros**: Los Conjuros son tipos de acciones especiales que afectan el valor de ciertos atributos del personaje objetivo para los Lanzadores de Conjuros, con más variedad que si tuviesen solamente las capacidades individuales
- **Sistema de Pasivas**: Un sistema que describe algunas de las habilidades que tienen los arquetipos de personaje y las razas que se pretendían implementar. Por razones de tiempo, se dejaron solamente como descriptores de texto

## Features no implementadas o no funcionales
- **Razas**: Por razones de tiempo, las razas, de las cuales los personajes iban a heredar capacidades especiales, no se llegaron a implementar salvo como un descriptor de texto
- **Sistema de Combate**: Si bien hay una clase llamada Combate, no está terminada y no refleja todo lo que son capaces de hacer los personajes

## Autorías
Si bien en cada archivo independiente se muestra el principal autor (y a veces un contribuidor) de dicho archivo, se muestra un desglose más completo de las autorías:

**Sistema de Personajes **
- Antonio González Martel creó la clase Personaje, junto con la mayoría de sus funcionalidades, y creó la clase PersonajeFisico
- Gabriel Francisco Ruíz Bolaños creó la clase PersonajeMagico, así como las clases de los arquetipos de fantasía y modificó algunas cosas de Personaje
- Carlos Perdomo Morales implemetó en Personaje toda la lógica concerniente a la recepción de daño y su implementación en los personajes

**Sistema de Inventario y Sistema de Armas**
- Antonio González Martel creó los consumibles y las armas, la jerarquía y rareza de ambos, y su implementación en los personajes

**Sistema de Acciones y Capacidades**
- Gabriel Francisco Ruíz Bolaños creó el sistema de capacidades y acciones, y su implementación en los arquetipos de personaje

**Sistema de Conjuros**
- Alonso J Rodríguez Betancor creó el sistema de conjuros, sus efectos diversos, su jerarquía e implementación

**Sistema de Pasivas**
- Alonso J Rodríguez Betancor creó e implementó el sistema de Pasivas, así como su jerarquía.

**Sistema de Armaduras**
- Carlos Perdomo Morales creó el sistema de armaduras, su jerarquía, lógica, e implementación en los personajes
