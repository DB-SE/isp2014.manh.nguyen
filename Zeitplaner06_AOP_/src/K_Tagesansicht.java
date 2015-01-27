import java.awt.BorderLayout; 
import java.awt.Color; 
import java.awt.Component; 
import java.awt.Container; 
import java.awt.FlowLayout; 
import java.awt.GridLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.text.SimpleDateFormat; 
import java.util.ArrayList;
import java.util.Calendar; 
import java.util.Date; 
import java.util.GregorianCalendar; 

import javax.swing.BorderFactory; 
import javax.swing.JButton; 

import javax.swing.JComboBox; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
import javax.swing.Timer; 

public   class  K_Tagesansicht  extends JPanel {
	/**
	 * Code kopiert von:
	 *  
	 * @author Ian F. Darwin, http://www.darwinsys.com/
	 * @version $Id: Cal.java,v 1.5 2004/02/09 03:33:45 ian Exp $
	 */

	public void print() {
		JFrame f = new JFrame("Kalender");
		
	  
	    Container c = f.getContentPane();
	    c.setLayout(new FlowLayout());

	    
	    c.add(new K_Tagesansicht());

	    f.pack();
	    f.setVisible(true);
	    
	  
	    
	    System.out.println("Tagesansicht hat gewaehlt");
		System.out.println();
		System.out.println("-- Zeiplaner AOP beendet --");
		
	
	}

	
	
	static Calendar calendar = new GregorianCalendar();

	
	
	 /** The month choice */
	static  JComboBox monthChoice;

	

	  /** The year choice */
	static   JComboBox yearChoice;

	
	  
	static  int mm, dd, yy;

	
	static  JButton labs[][];

	
	  
	  /** One of the buttons. We just keep its reference for getBackground(). */
	static   JButton b0;

	

	static  String[] months = { "Januar", "Februar", "März", "April", "Mai", "Juni",
		      "Juli", "August", "September", "Oktober", "November", "Dezember" };

	
	  
	  private void setYYMMDD(int year, int month, int today) {
		    yy = year;
		    mm = month;
		    dd = today;
		  }


	  JPanel time = new JPanel();
		JPanel uhrZeit = new JPanel();
	  	JLabel uhrZeit_ = new JLabel();
	  	
 
	 
	 public static boolean isTime ()
		{
			return false;  // false -- no time;
			
		}
	 
	 public static boolean isMonthC ()
		{
			return false;   // false -- no monthChoice;
			
		}
	 
	 public static boolean isYearC ()
		{
			return false;   // false -- no yearChoice;
			
		}
	 
	 
	 
	 
	 private void  gui(){

	 	 
		
	    getAccessibleContext().setAccessibleDescription(
	        "Calendar not accessible yet. Sorry!");
	    setBorder(BorderFactory.createEtchedBorder());

	    setLayout(new BorderLayout());

 
	    	
	    if(isTime () == true){
	    Timer timer = new Timer(1000, timeInput()); 
		timer.start();
		uhrZeit.add(uhrZeit_);
	 
		add(BorderLayout.NORTH, uhrZeit);
 		}
		
	    if(isMonthC () == true){
		
		JPanel tM = new JPanel();
	    tM.add(monthChoice = new JComboBox());
	    for (int i = 0; i < months.length; i++)
	      monthChoice.addItem(months[i]);
	    monthChoice.setSelectedItem(months[mm]);
	    monthChoice.addActionListener(monthInput());
	    monthChoice.getAccessibleContext().setAccessibleName("Months");
	    monthChoice.getAccessibleContext().setAccessibleDescription("Choose a month of the year");
	    
 	    add(BorderLayout.CENTER, tM);
	    }
	    
	    if(isYearC () == true){
 	   JPanel tY = new JPanel();
	    tY.add(yearChoice = new JComboBox());
	    yearChoice.setEditable(true);
	    for (int i = yy - 5; i < yy + 5; i++)			//Yearchoose = 10
	      yearChoice.addItem(Integer.toString(i));
	    yearChoice.setSelectedItem(Integer.toString(yy));
	    yearChoice.addActionListener(yearInput());
	    
	    add(BorderLayout.EAST, tY);
	    }
	    
	    
	    JPanel bp = new JPanel();
	    bp.setLayout(new GridLayout(7, 7));
	    labs = new JButton[6][7]; // first row is days

	    bp.add(b0 = new JButton("So"));
	    bp.add( new JButton("Mo"));
	    bp.add(new JButton("Di"));
	    bp.add(new JButton("Mi"));
	    bp.add(new JButton("Do"));
	    bp.add(new JButton("Fr"));
	    bp.add(new JButton("Sa"));
	   

	    ActionListener dateSetter = new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        String num = e.getActionCommand();
	        if (!num.equals("")) {
	          // set the current day highlighted
	          setDayActive(Integer.parseInt(num));
	         
	        }
	      }
	    };

	    // Construct all the buttons, and add them.
	    for (int i = 0; i < 6; i++)
	      for (int j = 0; j < 7; j++) {
	        bp.add(labs[i][j] = new JButton(""));
	        labs[i][j].addActionListener(dateSetter);
	        
	      }
	    
	    add(BorderLayout.SOUTH, bp);
	    

	  }
	 
	 private ActionListener timeInput(){
			return new ActionListener() {   
		  	public void actionPerformed(ActionEvent e) {
		  		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy 'um' HH:mm:ss ");
				String aktuelleZeit = sdf.format(new Date());
				uhrZeit_.setText("Datum und Zeit : " + aktuelleZeit);
		     }
		   };
		  }
	 
	 
	  private ActionListener monthInput(){
			return new ActionListener() {   
		  	public void actionPerformed(ActionEvent ae) {
		      int i = monthChoice.getSelectedIndex();
		      if (i >= 0) {
		        mm = i;
		      //  System.out.println("Month=" + mm);
		        calc();
		       }
		     }
		   };
		  }
	 
	  private ActionListener yearInput(){
			return new ActionListener() {   
	      public void actionPerformed(ActionEvent ae) {
	        int i = yearChoice.getSelectedIndex();
	        if (i >= 0) {
	          yy = Integer.parseInt(yearChoice.getSelectedItem()
	              .toString());
	          // System.out.println("Year=" + yy);
	          calc();
	        }
	      }
	    };
	  }
	  /** The number of day squares to leave blank at the start of this month */
	  protected int leadGap = 0;

	
	  
	  private int activeDay = -1;

	

	  /** Set just the day, on the current month */
	  public void setDayActive(int newDay) {

	    clearDayActive();

	    // Set the new one
	    if (newDay <= 0)
	      dd = new GregorianCalendar().get(Calendar.DAY_OF_MONTH);
	    else
	      dd = newDay;
	    // Now shade the correct square
	    Component square = labs[(leadGap + newDay - 1) / 7][(leadGap + newDay - 1) % 7];
	    square.setBackground(Color.red);
	    square.repaint();
	    activeDay = newDay;
	  }

	
	  
	  private void clearDayActive() {
		    JButton b;

		    // First un-shade the previously-selected square, if any
		    if (activeDay > 0) {
		      b = labs[(leadGap + activeDay - 1) / 7][(leadGap + activeDay - 1) % 7];
		      b.setBackground(b0.getBackground());
		      b.repaint();
		      activeDay = -1;
		    }
		  }

	

	  ////////////////////////
	  
		public void calc() {
			
//			setYYMMDD(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
//			        calendar.get(Calendar.DAY_OF_MONTH));  
			
			    // System.out.println("Cal::recompute: " + yy + ":" + mm + ":" + dd);
			    if (mm < 0 || mm > 11)
			      throw new IllegalArgumentException("Month " + mm
			          + " bad, must be 0-11");
			    clearDayActive();
			    calendar = new GregorianCalendar(yy, mm, dd);

			    // Compute how much to leave before the first.
			    // getDay() returns 0 for Sunday, which is just right.
			    leadGap = new GregorianCalendar(yy, mm, 1).get(Calendar.DAY_OF_WEEK) - 1;
			    // System.out.println("leadGap = " + leadGap);

			    int daysInMonth = dom[mm];
			    if (isLeap(calendar.get(Calendar.YEAR)) && mm == 1)
//			    if (isLeap(calendar.get(Calendar.YEAR)) && mm > 1)
			      ++daysInMonth;

			    // Blank out the labels before 1st day of month
			    for (int i = 0; i < leadGap; i++) {
			      labs[0][i].setText("");
			    }

			    // Fill in numbers for the day of month.
			    for (int i = 1; i <= daysInMonth; i++) {
			      JButton b = labs[(leadGap + i - 1) / 7][(leadGap + i - 1) % 7];
			      b.setText(Integer.toString(i));
			    }

			    // 7 days/week * up to 6 rows
			    for (int i = leadGap + 1 + daysInMonth; i < 6 * 7; i++) {
			      labs[(i) / 7][(i) % 7].setText("");
			    }

			    // Shade current day, only if current month
			    if (thisYear == yy && mm == thisMonth)
			      setDayActive(dd); // shade the box for today

			    // Say we need to be drawn on the screen
			    repaint();
			  }

	
		
		public final static int dom[] = { 31, 28, 31, 30, /* jan feb mar apr */
			  31, 30, 31, 31, /* may jun jul aug */
			  30, 31, 30, 31 /* sep oct nov dec */
			  };

	
		
		 /** Today's year */
		  protected final int thisYear = calendar.get(Calendar.YEAR);

	

		  /** Today's month */
		  protected final int thisMonth = calendar.get(Calendar.MONTH);

	
		  
		/**
		   * isLeap() returns true if the given year is a Leap Year.
		   * 
		   * "a year is a leap year if it is divisible by 4 but not by 100, except
		   * that years divisible by 400 *are* leap years." -- Kernighan & Ritchie,
		   * _The C Programming Language_, p 37.
		   */
		  public boolean isLeap(int year) {
		    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		      return true;
		    return false;
		  }

	
		  
	      
		  K_Tagesansicht() {
			    super();
			    setYYMMDD(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
			        calendar.get(Calendar.DAY_OF_MONTH));
			    gui( );//monthChoice, months, mm);
			    calc();
			  }

	


}
