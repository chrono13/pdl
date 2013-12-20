package ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;

/**
 * Classe permettant de gérer les chronomètres
 * @author Blanchard Kévin /Ganeshamoorthy Kavishan/ Leroy Philippe/Veillot Yann
 *
 */

public class Chrono extends JPanel implements Runnable{
    Font f;
    Color bd,lt,dk;
    int h,m,s,c;
    String time;
    Thread runner;
    JButton start,stop,init;
    JDesktopPane p;
    boolean on;
    LcdDigit[] lcd;

    public Chrono(){
        this(0,0,0,0);
    }

    public Chrono(int he,int mn, int se, int ct){
        super(new BorderLayout());

        h = he;
        m = mn;
        s = se;
        c = ct;

        p = new JDesktopPane();
        /*start = new JButton("start");
        start.addActionListener(this);
        stop = new JButton("stop");
        stop.addActionListener(this);
        init = new JButton("init");
        init.addActionListener(this);
        p.add(init);
        p.add(start);
        p.add(stop);
        add("South",p);*/

        f = new Font("TimesRoman",Font.BOLD,20);
        setFont(f);

        lt = Color.yellow;
        dk = Color.darkGray;
        bd = Color.black;

        setBackground(bd);

        time = "00:00:00:00";
        lcd = setLCD();

        runner = null;
        on = false;
    }

    private String setTime(int x, int y, int z, int v)
    {
        String s1,s2,s3,s4;
        if (h<10) s1 = "0"+h;
        else s1 = ""+h;
        if (m<10) s2 = ":0"+m;
        else s2 = ":"+m;
        if (s<10) s3 = ":0"+s;
        else s3 = ":"+s;
        if (c<10) s4 = ":0"+c;
        else s4 = ":"+c;
        return s1+s2+s3+s4;
    }

    public void pause(int time)
    {
        try{ Thread.sleep(time);}
        catch(InterruptedException e){}
    }

    public void run()
    {
        while(on)
        {
            pause(9);

            if (c<99) c+=1;
            else{
                c = 0;
                if (s<59) s+=1;
                else{
                    s = 0;
                    if (m<59) m+=1;
                    else{
                        m = 0;
                        h+=1;
                    }
                }
            }
            
            if (! on) c--;//pb de synchronisation
           
            time = setTime(h,m,s,c);
            lcd = setLCD();

            repaint();// le rapint est la afin de reactualiser l'affichage du chrono
           // update(getGraphics());
           // paintComponent(getGraphics());
        }
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        lcd[0].draw(g,10,10);
        lcd[1].draw(g,22,10);
        lcd[2].draw(g,42,10);
        lcd[3].draw(g,54,10);
        lcd[4].draw(g,74,10);
        lcd[5].draw(g,86,10);
        lcd[6].draw(g,106,10);
        lcd[7].draw(g,118,10);
    }
/*
    public void actionPerformed(ActionEvent e){
    	long milli_deb = 0;
    	long milli_fin = 0;
    	int res = 0;
        String ch = e.getActionCommand();
        runner = new Thread(this);
        /*if (ch.equals("start")){
            on = true;
            if (runner==null){
                runner = new Thread(this);
                runner.start();
            }
        }*/
        /*if (ch.equals("stop")) {
        	System.out.println(time);// on recupere le temps entre deux tops
        	milli_fin = System.currentTimeMillis();
        	on = false;
        	runner = null;
        	h = m = s = c = 0;
        	time = setTime(0,0,0,0);// reinitialisation du temps a zero
        	lcd = setLCD();
        	repaint();
        	int milli = (int) ((milli_fin-milli_deb)%1000);
        	int seconds = (int) ((milli_fin-milli_deb) / 1000) % 60 ;
        	int minutes = (int) (((milli_fin-milli_deb) / (1000*60)) % 60);
        	//int hours   = (int) ((milliseconds / (1000*60*60)) % 24);
        	System.out.println(minutes+"    " + seconds+ "      "+milli);
        	/*on = false;
            runner = null;*//*
        }
        else {
            if (!on){
            	milli_deb = System.currentTimeMillis();
            	on = true;
            	runner.start();
            }
            else {
            	System.out.println(time);// on recupere le temps entre deux tops
            	on = false;
            	runner = null;
            	h = m = s = c = 0;
            	time = setTime(0,0,0,0);// reinitialisation du temps a zero
            	lcd = setLCD();
            	repaint();
            	on = true;
            }
        }
    }*/

    
    public LcdDigit[] setLCD(){
        LcdDigit[] lc = new LcdDigit[8];
        lc[0] = new LcdDigit(Integer.parseInt(time.substring(0,1)),10,20,lt,dk);
        lc[1] = new LcdDigit(Integer.parseInt(time.substring(1,2)),10,20,lt,dk);
        lc[2] = new LcdDigit(Integer.parseInt(time.substring(3,4)),10,20,lt,dk);
        lc[3] = new LcdDigit(Integer.parseInt(time.substring(4,5)),10,20,lt,dk);
        lc[4] = new LcdDigit(Integer.parseInt(time.substring(6,7)),10,20,lt,dk);
        lc[5] = new LcdDigit(Integer.parseInt(time.substring(7,8)),10,20,lt,dk);
        lc[6] = new LcdDigit(Integer.parseInt(time.substring(9,10)),10,20,lt,dk);
        lc[7] = new LcdDigit(Integer.parseInt(time.substring(10,11)),10,20,lt,dk);
        return lc;
    }

	public void top() {
		runner = new Thread(this);
		// TODO Auto-generated method stub
		if (!on){
        	on = true;
        	runner.start();
        }
        else {
        	System.out.println(time);// on recupere le temps entre deux tops
        	on = false;
        	runner = null;
        	h = m = s = c = 0;
        	time = setTime(0,0,0,0);// reinitialisation du temps a zero
        	lcd = setLCD();
        	repaint();
        	on = true;
        }
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(time);// on recupere le temps entre deux tops
    	on = false;
    	runner = null;
    	h = m = s = c = 0;
    	time = setTime(0,0,0,0);// reinitialisation du temps a zero
    	lcd = setLCD();
    	repaint();
	}
	
	public String tops() {
		runner = new Thread(this);
		// TODO Auto-generated method stub
		String res="";
		if (!on){
        	on = true;
        	runner.start();
        }
        else {
        	res =time;// on recupere le temps entre deux tops
        	on = false;
        	runner = null;
        	h = m = s = c = 0;
        	time = setTime(0,0,0,0);// reinitialisation du temps a zero
        	lcd = setLCD();
        	repaint();
        	on = true;
        }
		return res;
	}
}

