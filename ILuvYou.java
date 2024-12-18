
/**
 * Happy Mother's Day, Mama. I hope this makes you smile!
 *
 * @author Gavin Hewitt
 * @version 04/26/2022 for 05/08/2022
 */
import galapagos.*;
import java.awt.*;
import java.util.*;
public class ILuvYou
{
    public static int r(int s, int e){
        return (int)(Math.random()*(e-s+1))+s;
    }
    public static void flower(Turtle t, int rs, int re, int gs, int ge, int bs, int be, int x, int y, int fds, int fde, int cds, int cde)
    {
        for(int i = 0; i < 180; i++)
        {
            int red = r(rs, re);
            int blue = r(bs, be);
            int green = r(gs, ge);
            Color tc = new Color(red, green, blue);
            int dist = r(fds, fde);
            t.penColor(tc);
            t.jumpTo(x, y);
            t.forward(dist);
            t.jumpTo(x, y);
            t.turn(2);
        }
        for(int j = 0; j < 180; j++)
        {
            int red = 240;
            int blue = 60;
            int green = r(160, 220);
            Color tc = new Color(red, green, blue);
            int dist = r(cds, cde);
            t.penColor(tc);
            t.jumpTo(x, y);
            t.forward(dist);
            t.jumpTo(x, y);
            t.turn(2);
        }
    }
    public static void main(String[] args)
    {
        TurtleDrawingWindow canvas = new TurtleDrawingWindow();
        canvas.setVisible(true);
        
        //background
        Turtle turtle1 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        canvas.add(turtle1);
        Color bg = new Color(202, 157, 245);
        turtle1.penColor(bg);
        turtle1.penSize(5000);
        turtle1.speed(5000);
        turtle1.jumpTo(-300, 0);
        turtle1.forward(600);
        turtle1.penUp();
        turtle1.jumpTo(500, 500);
        
        //writes "Happy"
        Turtle turtle2 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        canvas.add(turtle2); 
        turtle2.speed(100);
        
        //draws "H"
        turtle2.penColor(Color.BLACK);
        turtle2.jumpTo(-56, 80);
        turtle2.heading(270);
        turtle2.forward(35);
        turtle2.forward(5);
        turtle2.jumpTo(-56, 60);
        turtle2.heading(0);
        turtle2.forward(17);
        turtle2.jumpTo(-39, 80);
        turtle2.heading(270);
        turtle2.forward(38);
        
        //draws "A"
        turtle2.jumpTo(-31, 42);
        turtle2.heading(75);
        turtle2.forward(38);
        turtle2.heading(285);
        turtle2.forward(38);
        turtle2.jumpTo(-26, 60);
        turtle2.heading(0);
        turtle2.forward(10);
        
        //draws both "P"'s
        int x = -4;
        for(int i = 0; i < 2; i++)
        {
            turtle2.jumpTo(x, 42);
            turtle2.heading(90);
            turtle2.forward(38);
            turtle2.heading(0);
            for(int j = 0; j < 19; j++)
            {
                turtle2.forward(2);
                turtle2.turn(-10);
            }
            x = 15;
        }
        
        //draws "Y"
        turtle2.jumpTo(43, 42);
        turtle2.heading(90);
        turtle2.forward(19);
        turtle2.heading(110);
        turtle2.forward(20);
        turtle2.jumpTo(43, 60);
        turtle2.heading(70);
        turtle2.forward(20);
        
        //writes "Mother's"
        Turtle turtle3 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        canvas.add(turtle3);
        turtle3.speed(100);
        
        //draws "M"
        turtle3.penColor(Color.BLACK);
        turtle3.jumpTo(-95, -20);
        turtle3.heading(90);
        turtle3.forward(38);
        turtle3.heading(310);
        turtle3.forward(17);
        turtle3.heading(50);
        turtle3.forward(17);
        turtle3.heading(270);
        turtle3.forward(38);
        
        //draws "O"
        turtle3.jumpTo(-55, 18);
        turtle3.heading(0);
        int count = 1;
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 6; j++)
            {
                turtle3.forward(2);
                turtle3.turn(-15);
            }
            if(count % 2 == 0)
            {
                turtle3.forward(5);
            } else
            {
                turtle3.forward(23.8);
            }
            count++;
        }
        
        //draws "T"
        turtle3.jumpTo(-28, -20);
        turtle3.heading(90);
        turtle3.forward(37);
        turtle3.jumpTo(-38, 17);
        turtle3.heading(0);
        turtle3.forward(20);
        
        //draws "H"
        turtle3.jumpTo(-8.5, -20);
        turtle3.heading(90);
        turtle3.forward(37);
        turtle3.jumpTo(-8.5, -1.5);
        turtle3.heading(0);
        turtle3.forward(17);
        turtle3.jumpTo(8.5, -20);
        turtle3.heading(90);
        turtle3.forward(37);
        
        //draws "E"
        turtle3.jumpTo(19, -20);
        turtle3.heading(90);
        turtle3.forward(37);
        turtle3.heading(0);
        double y = 17;
        for(int i = 0; i < 3; i++)
        {
            turtle3.jumpTo(19, y);
            turtle3.forward(17);
            y = y - 18.5;
        }
        
        //draws "R"
        turtle3.jumpTo(46, -20);
        turtle3.heading(90);
        turtle3.forward(37);
        turtle3.heading(0);
        int count2 = 1;
        for(int i = 0; i < 3; i++)
        {
            if(count2 % 2 == 0)
            {
                turtle3.forward(3);
            } else
            {
                turtle3.forward(8);
            }
            if(i < 2)
            {
                for(int j = 0; j < 6; j++)
                {
                    turtle3.forward(2);
                    turtle3.turn(-15);
                }
            }
            count2++;   
        }
        turtle3.forward(2);
        turtle3.heading(0);
        turtle3.penUp();
        turtle3.forward(8);
        turtle3.penDown();
        for(int j = 0; j < 6; j++)
        {
            turtle3.forward(2);
            turtle3.turn(-15);
        }
        turtle3.forward(13);
        
        //draws "'"
        turtle3.jumpTo(69, 16);
        turtle3.heading(270);
        turtle3.forward(8);
        
        //draws "S"
        turtle3.jumpTo(94, 16);
        turtle3.heading(180);
        turtle3.forward(3);
        for(int i = 0; i < 2; i++)
        {
            turtle3.forward(9);
            for(int j = 0; j < 6; j++)
            {
                if(i == 0)
                {
                    turtle3.turn(15);
                } else
                {
                    turtle3.turn(-15);
                }
                turtle3.forward(3);
            }
            turtle3.forward(3);
            for(int j = 0; j < 6; j++)
            {
                if(i == 0)
                {
                    turtle3.turn(15);
                } else
                {
                    turtle3.turn(-15);
                }
                turtle3.forward(3);
            }
        }
        turtle3.forward(9);
        
        //writes "Day!"
        Turtle turtle4 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        turtle4.penColor(Color.BLACK);
        turtle4.speed(100);
        canvas.add(turtle4);
        
        //draws "D"
        turtle4.jumpTo(-37, -82);
        turtle4.heading(90);
        turtle4.forward(37);
        turtle4.heading(0);
        for(int i = 0; i < 6; i++)
        {
            turtle4.forward(5);
            turtle4.turn(-15);
        }
        turtle4.forward(6);
        for(int i = 0; i < 6; i++)
        {
            turtle4.forward(5);
            turtle4.turn(-15);
        }
        turtle4.forward(4);
        
        //draws "A"
        turtle4.jumpTo(-15, -82);
        turtle4.heading(75);
        turtle4.forward(38);
        turtle4.heading(285);
        turtle4.forward(38);
        turtle4.jumpTo(-10, -64);
        turtle4.heading(0);
        turtle4.forward(10);
        
        //draws "Y"
        turtle4.jumpTo(17, -82);
        turtle4.heading(90);
        turtle4.forward(19);
        turtle4.heading(110);
        turtle4.forward(20);
        turtle4.jumpTo(17, -64);
        turtle4.heading(70);
        turtle4.forward(20);
        
        //draws "!"
        turtle4.jumpTo(34, -82);
        turtle4.heading(90);
        turtle4.forward(3);
        turtle4.jumpTo(34, -75);
        turtle4.forward(30);
        
        //flower one
        turtle4.speed(3000);
        flower(turtle4, 40, 60, 160, 180, 220, 240, -155, -75, 65, 75, 25, 30);
        
        //flower two
        turtle2.speed(3000);
        flower(turtle2, 220, 255, 215, 255, 215, 255, 140, 95, 45, 55, 15, 20);
        
        //hide turtles
        turtle4.jumpTo(500, 500);
        turtle2.jumpTo(500, 500);
        turtle3.jumpTo(500, 500);
    }
}
