import java.util.*;
import java.awt.*;

public class test extends Canvas
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Frame frame = new Frame("draw");
		frame.addWindowListener(new AdapterDemo());
	    frame.setSize(200, 220);

	    while(sc.hasNext())
	    {
	    	int a = sc.nextInt();
			if(a == 1)
			{
				test canvas = new test();
				frame.add(canvas, BorderLayout.CENTER); 
				frame.setVisible(true); 
			}
			else if(a == 2)
			{
				circle canvas = new circle(); 
				frame.add(canvas, BorderLayout.CENTER);
				frame.setVisible(true); 
			}
			else if(a == 3)
			{
				triangle canvas = new triangle(); 
				frame.add(canvas, BorderLayout.CENTER);
				frame.setVisible(true); 
			}
	    }   
        
	}

	public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(40, 40, 120, 120);
    }  
}

class circle extends test{
    @Override
    public void paint(Graphics g) {
       g.setColor(Color.red);
       g.fillOval(10,10,100,100);
    }   
}

class triangle extends test{
    @Override
    public void paint(Graphics g) {
        int x[] = {100,50,150};
        int y[] = {50,100,100};
        Color purple = new Color(204,163,221);
        g.setColor(purple);
        g.fillPolygon(x,y,3);
    }   
}