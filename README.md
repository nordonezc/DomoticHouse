# DomoticHouse
Basic example of SPL with relevant interactions

## Variability diagram
![](https://i.imgur.com/MpFzMd3.png)

Developed with FeatureIDE but not included in this proyect



## Features and its description
* House: The house is the representation of a building.
* Door: The entrance of a house that can be either open or close. 
*	Window: The window of a house that can be either open or close.
*	Alarm: An alarm is device to control the access to the house. If the access is not allowed the police will be call.
*	Domotic: A domotic house allows to automatically open or close doors or windows. 


## Description of the exercise
### English
It exist a constructor enterprise that want to automatize the constructions of its houses. For that they have said the following constraints: 
* All houses have doors, but not all have windows.
* Some houses have alarms that are acoplated to the doors and also to the windows, if they have.
* Some houses could be domotic. It means that either doors and windows could be open automatically through user recognition. And this function doesnt disable the manual open or the manual close.

### Spanish
Se desea hacer la construcción de casas que sean capaces de tener cierto nivel de variabilidad, para ello, se posee como premisa:
* Toda casa tiene puertas, pero no siempre tiene ventanas. 
* La casa cuando tenga alarmas, están acopladas a las puertas y a las ventanas, en caso de que las tenga. 
* Se requiere que la casa tenga la facilidad de ser automática, o domótica, lo que consiste en que tanto las ventanas como las puertas se pueden abrir de manera automática con reconocimiento de usuario, por lo que en caso de que la casa tenga alarmas, estás solo se ejecutarán si se abre la puerta de manera manual.
