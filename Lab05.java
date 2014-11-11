/**
*
* Description of the program goes here  // provide a brief description
*
* @author Jack Navin-Weinstein  // replace <...> with your name
* @version 08/11/14 // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {
     
     public static void main(String[] args) {
          Display.openWorld("maps/shuttle.map");
          Display.setSize(10, 10);
          Display.setSpeed(8);
          Racer Joe = new Racer(1);
          Racer Jack = new Racer(4);
          Racer Sam = new Racer(7);
          Joe.runTheRace();
          Jack.runTheRace();
          Sam.runTheRace();
          
     }
}
