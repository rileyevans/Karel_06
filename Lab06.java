   //Name Riley Date Nov. 12, 2014
 import edu.fcps.karel2.Display;
  import edu.fcps.karel2.Robot;
  import javax.swing.JOptionPane;
    
    public class Lab06
   {
       public static void main(String[] args) 
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("maps/" + filename + ".map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
      
         task_01(); 
         task_02(); 
         task_03(); 
         task_04();
         task_05(); 
         task_06(); 
      }
      
       public static void task_01() 
      { 
         Robot tom = new Robot(1, 1, Display.EAST, 0);
         
         while(tom.nextToABeeper())
         {
            tom.move();
         }
           
      
      }
       public static void task_02() 
      { 
         Robot mark = new Robot(1, 2, Display.EAST, 0);
         
         while(!mark.nextToABeeper())
         {
            mark.move();
         }
         
      }
       public static void task_03() 
      { 
         Robot chad = new Robot(1, 3, Display.EAST, 0);
         
         while(chad.frontIsClear())
         {
            chad.move();
         }
       
      }
      
       public static void task_04() 
      { 
         Robot riley = new Robot(1, 4, Display.EAST, 0);
         {
            while(riley.frontIsClear())
            {
            
              while(riley.nextToABeeper())
              {
               riley.pickBeeper();
               }
               
               riley.move();
            }
         }
       }
      
       public static void task_05() 
      {
         Robot potter = new Robot(1, 5, Display.EAST, 0);
         
         while(potter.frontIsClear())
         {
         while(potter.nextToABeeper())
         {
            potter.pickBeeper();
         }
            potter.move();
            
         }
         
         while(!potter.frontIsClear()&&potter.nextToABeeper())
         {
            potter.pickBeeper();
         }
           
        } 
      
       public static void task_06()
      { 
         Robot joey = new Robot(1, 6, Display.EAST, 0);
         while(joey.nextToABeeper())
         {
             joey.move();
         }
         
         while(!joey.nextToABeeper())
          {
               
               joey.move();
               
          }
               
      
      while(joey.nextToABeeper())
         {
             joey.move();
         }

      }
   }