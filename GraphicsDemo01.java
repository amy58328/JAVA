import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
 
public class GraphicsDemo01 extends Canvas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Frame frame = new Frame("AWTDemo"); 
        frame.addWindowListener(new AdapterDemo());
        frame.setSize(200, 220);

        if(a==1)
        {
            GraphicsDemo01 canvas = new GraphicsDemo01(); 
        }
        else if (a == 2)
        {
            circle canvas = new circle(); 
        }
        else
        {
            triangle canvas = new triangle(); 
        }
        
         
        
        frame.add(canvas, BorderLayout.CENTER);
         
        frame.setVisible(true); 
    }
     
    public void paint(Graphics g) {
        // g.fillRect(40, 40, 120, 120);
        // g.clearRect(60, 60, 80, 80);
        g.setColor(Color.green);
        g.fillRect(40, 40, 120, 120);
    }    
}

class circle extends GraphicsDemo01{
    @Override
    public void paint(Graphics g) {
       g.setColor(Color.red);
       g.fillOval(10,10,100,100);
    }   
}

class triangle extends GraphicsDemo01{
    @Override
    public void paint(Graphics g) {
        int x[] = {100,50,150};
        int y[] = {50,100,100};
        Color purple = new Color(204,163,221);
        g.setColor(purple);
        g.fillPolygon(x,y,3);
    }   
}


 
class AdapterDemo extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}