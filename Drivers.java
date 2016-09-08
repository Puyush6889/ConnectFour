  import javax.swing.JFrame;
   public class Drivers
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Connect Four");
         frame.setSize(1300, 1024);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panelss());
         frame.setVisible(true);
			
      }
   }