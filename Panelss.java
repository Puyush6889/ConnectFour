   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
   public class Panelss extends JPanel
   {
      JButton[][] buttons;
      int [][] board;
      int a = 5;
      int b = 5;
      int c = 5;
      int d = 5;
      int q = 5;
      int f = 5;
      int g = 5;
      boolean p = true;
      boolean x = true;
      public Panelss()
      {
         javax.swing.JOptionPane.showMessageDialog(null, "Welcome to Connect Four\n Instruction:\n Two players play by alternately dropping a chip down one of the columns.\n The first players to get Four chips in a row, either Vertical, horizontal, or diagonal, wins.");
         setLayout(new BorderLayout());
      
         JPanel panel = new JPanel();
         panel.setLayout(new GridLayout(1,7));
         add(panel, BorderLayout.NORTH);
      
         JButton button1 = new JButton("Click to place");
         button1.addActionListener(new Listener1());
         panel.add(button1);
         JButton button2 = new JButton("Click to place");
         button2.addActionListener(new Listener2());
         panel.add(button2);
         JButton button3 = new JButton("Click to place");
         button3.addActionListener(new Listener3());
         panel.add(button3);
         JButton button4 = new JButton("Click to place");
         button4.addActionListener(new Listener4());
         panel.add(button4);
         JButton button5 = new JButton("Click to place");
         button5.addActionListener(new Listener5());
         panel.add(button5);
         JButton button6 = new JButton("Click to place");
         button6.addActionListener(new Listener6());
         panel.add(button6);
         JButton button7 = new JButton("Click to place");
         button7.addActionListener(new Listener7());
         panel.add(button7);
      	
         JPanel panel2 = new JPanel();
         panel2.setLayout(new GridLayout(6,7,10,10));
         add(panel2, BorderLayout.CENTER);
         buttons = new JButton[6][7];
      
         double y = Math.random()*2;
         if(y>1)
         {
            x=true;
            javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
         }
         else 
         {
            x=false;
            javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
         }
         for(int r = 0; r<buttons.length; r++)
         {
            for(int c=0; c<buttons[r].length; c++)
            {
               buttons[r][c] = new JButton(" ");
               panel2.add(buttons[r][c]);
               buttons[r][c].setEnabled(false);
            }
            board = new int [7][7];
         }
      }
      private class Listener1 implements ActionListener
      {
      
         public void actionPerformed(ActionEvent e)
         {
            if(a>=0)
            {
               if(x)
               {
                  buttons[a][0].setBackground(Color.RED);
                  board[a][0] += 1;
                  x = false;
               }
               else 
               {
                  buttons[a][0].setBackground(Color.BLACK);
                  board[a][0] +=2;
                  x = true;
               }
               if(board[a][0]==board[a][1]&&board[a][0]==board[a][2]&&board[a][0]==board[a][3]&&p)
               {
                  p = false; 
                  javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[a][0]+ " wins");
                  for(int r=0;r<=5;r++)
                     for(int w=0;w<=6;w++)
                     {
                        buttons[r][w].setBackground(Color.ORANGE);
                        board[r][w]=0;
                        a = 5;
                        b = 5;
                        c = 5;
                        d = 5;
                        q = 5;
                        f = 5;
                        g = 5;
                     }
                   
                  a++;
                  double y = Math.random()*2;
                  if(y>1)
                  {
                     x=true;
                     javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                  }
                  else 
                  {
                     x=false;
                     javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                  }
               }
               if(a<3)
               {
                  if(board[a][0]==board[a+1][0]&&board[a][0]==board[a+2][0]&&board[a][0]==board[a+3][0]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[a][0]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                        
                     a++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(a>3)
               {
                  if(board[a][0]==board[a-1][1]&&board[a][0]==board[a-2][2]&&board[a][0]==board[a-3][3]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[a][0]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                        
                     a++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(a<3)
               {
                  if(board[a][0]==board[a+1][1]&&board[a][0]==board[a+2][2]&&board[a][0]==board[a+3][3]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[a][0]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                       
                     a++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               p=true;
               a--;
            }
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            if(b>=0)
            {
               if(x)
               {
                  buttons[b][1].setBackground(Color.RED);
                  board[b][1] += 1;
                  x = false;
               }
               else 
               {
                  buttons[b][1].setBackground(Color.BLACK);
                  board[b][1] +=2;
                  x = true;
               }
               if((board[b][1]==board[b][0]||board[b][1]==board[b][4])&&board[b][1]==board[b][2]&&board[b][1]==board[b][3]&&p)
               {
                  p= false; 
                  javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[b][1]+ " wins");
                  for(int r=0;r<=5;r++)
                     for(int w=0;w<=6;w++)
                     {
                        buttons[r][w].setBackground(Color.ORANGE);
                        board[r][w]=0;
                        a = 5;
                        b = 5;
                        c = 5;
                        d = 5;
                        q = 5;
                        f = 5;
                        g = 5;
                     }
                     
                  b++;
                  double y = Math.random()*2;
                  if(y>1)
                  {
                     x=true;
                     javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                  }
                  else 
                  {
                     x=false;
                     javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                  }
               }
               if(b<3)
               {
                  if(board[b][1]==board[b+1][1]&&board[b][1]==board[b+2][1]&&board[b][1]==board[b+3][1]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[b][1]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                        
                     b++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(b>3)
               {
                  if((board[b][1]==board[b+1][0]||board[b][1]==board[b-3][4])&&board[b][1]==board[b-1][2]&&board[b][1]==board[b-2][3]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[b][1]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                       
                     b++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(b<3)
               {
                  if((board[b][1]==board[b-1][0]||board[b][1]==board[b+3][4])&&board[b][1]==board[b+1][2]&&board[b][1]==board[b+2][3]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[b][1]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                       
                     b++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               p=true;
               b--;
            }
         }
      }
      private class Listener3 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            if(c>=0)
            {
               if(x)
               {
                  buttons[c][2].setBackground(Color.RED);
                  board[c][2] += 1;
                  x = false;
               }
               else 
               {
                  buttons[c][2].setBackground(Color.BLACK);
                  board[c][2] += 2;
                  x = true;
               }
               if(((board[c][2]==board[c][0]&&board[c][2]==board[c][1])||(board[c][2]==board[c][4]&&board[c][2]==board[c][5])||(board[c][2]==board[c][1]&&board[c][2]==board[c][4]))&&board[c][2]==board[c][3]&&p)
               {
                  p= false; 
                  javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[c][2]+ " wins");
                  for(int r=0;r<=5;r++)
                     for(int w=0;w<=6;w++)
                     {
                        buttons[r][w].setBackground(Color.ORANGE);
                        board[r][w]=0;
                        a = 5;
                        b = 5;
                        c = 5;
                        d = 5;
                        q = 5;
                        f = 5;
                        g = 5;
                     }
                     
                  c++;
                  double y = Math.random()*2;
                  if(y>1)
                  {
                     x=true;
                     javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                  }
                  else 
                  {
                     x=false;
                     javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                  }
               }
               if(c<3)
               {
                  if(board[c][2]==board[c+1][2]&&board[c][2]==board[c+2][2]&&board[c][2]==board[c+3][2]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[c][2]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                        
                     c++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(c>1&&c<5)
               {
               
                  if(((board[c][2]==board[c+2][0]&&board[c][2]==board[c+1][1])||(board[c][2]==board[c-2][4]&&board[c][2]==board[c-3][5])||(board[c][2]==board[c+1][1]&&board[c][2]==board[c-2][4]))&&board[c][2]==board[c-1][3]&&p)
                  
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[c][2]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                       
                     c++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(c<4)
               {
                  
                  if(((board[c][2]==board[c-2][0]&&board[c][2]==board[c-1][1])||(board[c][2]==board[c+2][4]&&board[c][2]==board[c+3][5])||(board[c][2]==board[c-1][1]&&board[c][2]==board[c+2][4]))&&board[c][2]==board[c+1][3]&&p)
                  
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[c][2]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                       
                     c++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               p=true;
               c--;
            }
         }
      }
   
      private class Listener4 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            if(d>=0)
            {
               if(x)
               {
                  buttons[d][3].setBackground(Color.RED);
                  board[d][3] += 1;
                  x = false;
               }
               else 
               {
                  buttons[d][3].setBackground(Color.BLACK);
                  board[d][3] += 2;
                  x = true;
               }
               if((board[d][3]==board[d][0]&&board[d][3]==board[d][1]&&board[d][3]==board[d][2])||(board[d][3]==board[d][4]&&board[d][3]==board[d][5]&&board[d][3]==board[d][6])||(board[d][3]==board[d][1]&&board[d][3]==board[d][2]&&board[d][3]==board[d][4])||(board[d][3]==board[d][2]&&board[d][3]==board[d][4]&&board[d][3]==board[d][5])&&p)
               {
                  p= false; 
                  javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[d][3]+ " wins");
                  for(int r=0;r<=5;r++)
                     for(int w=0;w<=6;w++)
                     {
                        buttons[r][w].setBackground(Color.ORANGE);
                        board[r][w]=0;
                        a = 5;
                        b = 5;
                        c = 5;
                        d = 5;
                        q = 5;
                        f = 5;
                        g = 5;
                     }
                     
                  d++;
                  double y = Math.random()*2;
                  if(y>1)
                  {
                     x=true;
                     javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                  }
                  else 
                  {
                     x=false;
                     javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                  }
               }
               if(d<3)
               {
                  if(board[d][3]==board[d+1][3]&&board[d][3]==board[d+2][3]&&board[d][3]==board[d+3][3]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[d][3]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                       
                     d++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(d>3)
               {
                  if(board[d][3]==board[d-1][4]&&board[d][3]==board[d-2][5]&&board[d][3]==board[d-3][5]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[d][3]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                       
                     d++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(d<3)
               {
                  if(board[d][3]==board[d+1][4]&&board[d][3]==board[d+2][5]&&board[d][3]==board[d+3][6]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[d][3]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                        
                     d++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(d>3)
               {
                  if(board[d][3]==board[d-1][2]&&board[d][3]==board[d-2][1]&&board[d][3]==board[d-3][0]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[d][3]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                        
                     d++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(d<3)
               {
                  if(board[d][3]==board[d+1][2]&&board[d][3]==board[d+2][1]&&board[d][3]==board[d+3][0]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[d][3]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                      
                     d++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               p=true;
               d--;
            }
         }
      }
   
      private class Listener5 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            if(q>=0)
            {
               if(x)
               {
                  buttons[q][4].setBackground(Color.RED);
                  board[q][4] += 1;
                  x = false;
               }
               else 
               {
                  buttons[q][4].setBackground(Color.BLACK);
                  board[q][4] += 2;
                  x = true;
               }
               if(((board[q][4]==board[q][1]&&board[q][4]==board[q][2])||(board[q][4]==board[q][2]&&board[q][4]==board[q][5])||(board[q][4]==board[q][5]&&board[q][4]==board[q][6]))&&board[q][4]==board[q][3]&&p)
               {
                  p= false; 
                  javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[q][4]+ " wins");
                  for(int r=0;r<=5;r++)
                     for(int w=0;w<=6;w++)
                     {
                        buttons[r][w].setBackground(Color.ORANGE);
                        board[r][w]=0;
                        a = 5;
                        b = 5;
                        c = 5;
                        d = 5;
                        q = 5;
                        f = 5;
                        g = 5;
                     }
                    
                  q++;
                  double y = Math.random()*2;
                  if(y>1)
                  {
                     x=true;
                     javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                  }
                  else 
                  {
                     x=false;
                     javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                  }
               }
               if(q<3)
               {
                  if(board[q][4]==board[q+1][4]&&board[q][4]==board[q+2][4]&&board[q][4]==board[q+3][4]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[q][4]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                      
                     q++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(q>3)
               {
                  if(board[q][4]==board[q-1][3]&&board[q][4]==board[q-2][2]&&board[q][4]==board[q-3][1]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[q][4]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                     
                     q++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(q<3)
               {
                  if(board[q][4]==board[q+1][3]&&board[q][4]==board[q+2][2]&&board[q][4]==board[q+3][1]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[q][4]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                     
                     q++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               p=true;
               q--; 
            }
         }
      }
   
      private class Listener6 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            if(f>=0)
            {
               if(x)
               {
                  buttons[f][5].setBackground(Color.RED);
                  board[f][5] += 1;
                  x = false;
               }
               else 
               {
                  buttons[f][5].setBackground(Color.BLACK);
                  board[f][5] += 2;
                  x = true;
               }
               if((board[f][5]==board[f][2]||board[f][5]==board[f][6])&&board[f][5]==board[f][4]&&board[f][5]==board[f][3]&&p)
               {
                  p= false; 
                  javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[f][5]+ " wins");
                  for(int r=0;r<=5;r++)
                     for(int w=0;w<=6;w++)
                     {
                        buttons[r][w].setBackground(Color.ORANGE);
                        board[r][w]=0;
                        a = 5;
                        b = 5;
                        c = 5;
                        d = 5;
                        q = 5;
                        f = 5;
                        g = 5;
                     }
                    
                  f++;
                  double y = Math.random()*2;
                  if(y>1)
                  {
                     x=true;
                     javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                  }
                  else 
                  {
                     x=false;
                     javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                  }
               }
               if(f<3)
               {
                  if(board[f][5]==board[f+1][5]&&board[f][5]==board[f+2][5]&&board[f][5]==board[f+3][5]&&p)
                  
                  
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[f][5]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                        
                     f++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(f>3)
               {
                  if(board[f][5]==board[f-1][4]&&board[f][5]==board[f-2][3]&&board[f][5]==board[f-3][2]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[f][5]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                      
                     f++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(f<3)
               {
                  if(board[f][5]==board[f+1][4]&&board[f][5]==board[f+2][3]&&board[f][5]==board[f+3][2]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[f][5]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                        
                     f++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               p = true;
               f--; 
            }
         }
      }
      private class Listener7 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            if(g>=0&&g<6)
            {
            
               if(x)
               {
                  buttons[g][6].setBackground(Color.RED);
                  board[g][6] += 1;
                  x = false;
               }
               else 
               {
                  buttons[g][6].setBackground(Color.BLACK);
                  board[g][6] += 2;
                  x = true;
               }
               if(board[g][6]==board[g][3]&&board[g][6]==board[g][4]&&board[g][6]==board[a][5]&&p)
               {
                  p= false; 
                  javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[g][6]+ " wins");
                  for(int r=0;r<=5;r++)
                     for(int w=0;w<=6;w++)
                     {
                        buttons[r][w].setBackground(Color.ORANGE);
                        board[r][w]=0;
                        a = 5;
                        b = 5;
                        c = 5;
                        d = 5;
                        q = 5;
                        f = 5;
                        g = 5;
                     }
                     
                  g++;
                  double y = Math.random()*2;
                  if(y>1)
                  {
                     x=true;
                     javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                  }
                  else 
                  {
                     x=false;
                     javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                  }
               }
               if(g<3)
               {
                  if(board[g][6]==board[g+1][6]&&board[g][6]==board[g+2][6]&&board[g][6]==board[g+3][6]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[g][6]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                      
                     g++; 
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(g>3)
               {
                  if(board[g][6]==board[g-1][5]&&board[g][6]==board[g-2][4]&&board[g][6]==board[g-3][3]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[g][6]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                        
                     g++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               if(g<3)
               {
                  if(board[g][6]==board[g+1][5]&&board[g][6]==board[g+2][4]&&board[g][6]==board[g+3][3]&&p)
                  {
                     p= false; 
                     javax.swing.JOptionPane.showMessageDialog(null, "Player "+board[g][6]+ " wins");
                     for(int r=0;r<=5;r++)
                        for(int w=0;w<=6;w++)
                        {
                           buttons[r][w].setBackground(Color.ORANGE);
                           board[r][w]=0;
                           a = 5;
                           b = 5;
                           c = 5;
                           d = 5;
                           q = 5;
                           f = 5;
                           g = 5;
                        }
                    
                     g++;
                     double y = Math.random()*2;
                     if(y>1)
                     {
                        x=true;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 1 starts");
                     }
                     else 
                     {
                        x=false;
                        javax.swing.JOptionPane.showMessageDialog(null, "Player 2 starts");
                     }
                  }
               }
               p = true;
               g--; 
            }
         }
      }
   }