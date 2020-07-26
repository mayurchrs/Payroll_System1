import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Splashing {
    public static void main(String args[])
    {
        Sframe f1 = new Sframe("Payroll System new Version");
        f1.setVisible(true);
        int i;
        int x=1;
        for(i=2;i<=600;i+=4,x+=1)
        {
            f1.setLocation((800-((i+x)/2)),500-(i/2));
            f1.setSize(i+x,i);
            try{
                Thread.sleep(10);
            }catch(Exception e)
            {
                
            }
        }
    }
    
}

class Sframe extends JFrame implements Runnable
{
    Thread t1;
    Sframe(String s)
    {
        super(s);
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icon/payroll_system.jpg"));
        Image i1 = c1.getImage().getScaledInstance(730,550,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel m1 = new JLabel(i2);
        add(m1);
        t1 = new Thread(this);
        t1.start();
    }
    public void run()
    {
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            Login f1 = new Login();
            
        }catch(Exception e)
        {
        }
    }
  
}