import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class BlackPantherWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackPantherWorld2 extends World
{
    Music m1=new Music();
    /**
     * Constructor for objects of class BlackPantherWorld2.
     * 
     */
    
      int counter =0;
     private Background2 img2, img3;
    Counter counter2 = new Counter();
    public BlackPantherWorld2()
    {    
        super(650, 350, 1, false); 
        img2 = new Background2();
        addObject(img2, getWidth ()/2, getHeight()/2);
        img3 = new Background2();
        addObject(img3, getWidth() + getWidth()/2, getHeight()/2);
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      addObject(counter2,220,20);
        Greenfoot.start();
        BlackPantherHero a=new BlackPantherHero();
        addObject(a,200,200);
        
        m1.getMyMusic().stop();
        m1=new Music("Game_of_Thrones(HBO).mp3");
         m1.getMyMusic().play();
         BlackPantherHero.level_qualified = false;    
                 BlackPantherHero.game_over = false; 
        BlackPantherHero.music = true; 
    }
    
    
    public void act() {
    
        counter ++;
        img2.scroll();
        img3.scroll();
        
       if(counter % 50 == 0)
        {
           //Level2Hurdle P1 = new Level2Hurdle();
           //GreenfootImage image = P1.getActor().getImage();
          
           //addObject(P1,getWidth(),getHeight()/2 + image.getHeight()/2);
           //addObject(P1,779,Greenfoot.getRandomNumber(360));
           //addObject(P1,779,Greenfoot.getRandomNumber(100));
           
              Creator B1 = new BlackSpiderHurdleFactory();
    
           
         GreenfootImage image1 = B1.getActor().getImage();
           //addObject(P1,getWidth(),getHeight()/2 + image.getHeight()/2);
           addObject(B1.getActor(),779,Greenfoot.getRandomNumber(360));
           addObject(B1.getActor(),779,Greenfoot.getRandomNumber(100));
           
           
           
           
          // Hurdle2 P2 = new Hurdle2();
          Creator P2 = new FrostHurdleFactory();
             
           addObject(P2.getActor(),900,Greenfoot.getRandomNumber(360));
           addObject(P2.getActor(),900,Greenfoot.getRandomNumber(100));
           
        }
        if(counter% 250==0)
        {
            Creator J1 =new PantherWorld_hurdle1();
           addObject(J1.getActor(),800,200);
        }
        
         if(counter %100 == 0)
        {
             
           Creator G3 = new VibraniumFactory(50);
           
            GreenfootImage img=G3.getActor().getImage();
            //addObject(g1,getWidth(),50);
            addObject(G3.getActor(),700,Greenfoot.getRandomNumber(100));
        }
       
        
        
         
   
        
    
    }
}
