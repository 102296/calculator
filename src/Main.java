import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main extends JFrame {
	private JTextField answerfield;
    private JButton one,two,three,four,five,six,seven,eight,nine,zero,add,sub,divide,multiply,equal,period,delete,reset,on,off;
    private String stp1,stp2,stpanswer;
    private double answer=0.0;
    private JPanel contentPanel;
    private JLabel lab1, lab2, lab3, lab4, lab5, lab6, lab7, lab8, lab9, lab10, lab11, lab12, lab13, lab14, lab15, lab16, lab17, lab18, lab19, lab20,lab21,lab22, lab23,lab24, lab25;
    private boolean equalsClicked=false,opChosen=false;
    char operation =' ';
    public Main() {
    	super("calculator");
    	 answerfield=new JTextField(null,33);
         answerfield.setEditable(false);
         
         
         lab1=new JLabel("");
         lab2= new JLabel("");
         reset=new JButton ("reset");
         on=new JButton ("on");
         off= new JButton ("off");
         seven= new JButton("7");
         eight= new JButton("8");
         nine= new JButton("9");
         add=new JButton("+");
         sub=new JButton("-");
         four= new JButton("4");
         five= new JButton("5");
         six= new JButton("6");
         multiply= new JButton("*");
         divide= new JButton("/");
         one= new JButton("1");
         two= new JButton("2");
         three= new JButton("3");
         lab3= new JLabel(" ");
         lab4= new JLabel(" ");
         zero= new JButton("0");
         period= new JButton(".");
         lab5= new JLabel(" ");
         delete= new JButton("delete");
         equal= new JButton("=");
         lab6= new JLabel(" ");
         lab7= new JLabel(" ");
         lab8= new JLabel(" ");
         lab9= new JLabel(" ");
         lab10= new JLabel(" ");
         lab11= new JLabel(" ");
         lab12= new JLabel(" ");
         lab13= new JLabel(" ");
         lab15= new JLabel(" ");
         lab19= new JLabel(" ");
         lab20=new JLabel("");
         lab21=new JLabel("");
         lab22=new JLabel("");
         lab23=new JLabel("");
         lab24=new JLabel("");


         
   
         equal= new JButton("=");
         
         Dimension dim = new Dimension(55,25);
        reset.setPreferredSize(dim);
         on.setPreferredSize(dim);
         off.setPreferredSize(dim);
         seven.setPreferredSize(dim);
         eight.setPreferredSize(dim);
         nine.setPreferredSize(dim);
         four.setPreferredSize(dim);
         five.setPreferredSize(dim);
         six.setPreferredSize(dim);
         one.setPreferredSize(dim);
         two.setPreferredSize(dim);
         three.setPreferredSize(dim);
         zero.setPreferredSize(dim);
         add.setPreferredSize(dim);
         sub.setPreferredSize(dim);
         multiply.setPreferredSize(dim);
         divide.setPreferredSize(dim);
         equal.setPreferredSize(dim);
         period.setPreferredSize(dim);
         lab1.setPreferredSize(dim);
         lab2.setPreferredSize(dim);
         lab3.setPreferredSize (new Dimension(20,35));
         lab4.setPreferredSize(new Dimension(20,35));
         lab5.setPreferredSize(new Dimension(20,35));
         lab6.setPreferredSize(dim);
         lab7.setPreferredSize(dim);
         lab8.setPreferredSize(dim);
         lab9.setPreferredSize(dim);
         lab13.setPreferredSize(new Dimension(15,30));
         lab11.setPreferredSize(dim);
         lab12.setPreferredSize(dim);
         lab15.setPreferredSize(new Dimension(15,30));
         lab19.setPreferredSize(new Dimension(15,30));
         lab20.setPreferredSize(dim);
         lab21.setPreferredSize(dim);
         lab22.setPreferredSize(dim);
         lab23.setPreferredSize(dim);
         lab24.setPreferredSize(dim);
         
         delete.setPreferredSize(dim);
        
         
         
    Digits d =new Digits();
     Calc c = new Calc();
     
     

     one.addActionListener(d);two.addActionListener(d);three.addActionListener(d);four.addActionListener(d);
     five.addActionListener(d);six.addActionListener(d);seven.addActionListener(d);eight.addActionListener(d);
     nine.addActionListener(d);zero.addActionListener(d);
     
     add.addActionListener(c);sub.addActionListener(c);multiply.addActionListener(c);divide.addActionListener(c);equal.addActionListener(c);
     reset.addActionListener(c);
     
         
         
   
         contentPanel=new JPanel();
         contentPanel.setBackground(Color.BLACK);
         contentPanel.setLayout(new FlowLayout());
         
         
         contentPanel .add(answerfield,BorderLayout.NORTH);
         contentPanel.add(lab1);contentPanel.add(lab2);contentPanel.add(lab6);contentPanel.add(lab8);
         contentPanel.add(reset); contentPanel.add(off);
         contentPanel.add(seven);contentPanel.add(eight);contentPanel.add(nine);contentPanel.add(lab5);contentPanel.add(lab12);
         contentPanel.add(add);;contentPanel.add(sub);contentPanel.add(four);contentPanel.add(five);contentPanel.add(six);contentPanel.add(lab5);contentPanel.add(lab7); contentPanel.add(multiply);
         contentPanel.add(divide);contentPanel.add(one);contentPanel.add(two);contentPanel.add(three);contentPanel.add(lab11);contentPanel.add(lab20);
         contentPanel.add(lab21);
         
                 
         
        
         
         contentPanel.add(zero);;contentPanel.add(period);contentPanel.add(lab22);contentPanel.add(equal);contentPanel.add(on);
         contentPanel.add(lab5);contentPanel.add(lab23);
         contentPanel.add(lab24); 
	     
	         
	 
	         this.setContentPane(contentPanel);
         
         
     }
     private class Digits implements ActionListener{
         public void actionPerformed(ActionEvent event){
             JButton src =(JButton)event.getSource();
             
             if(event.getSource()==on) {
            	 enable();
             }
             
             else if(event.getSource()==off)
             {
            	 disable();
             }
             if(src.equals(one)){
             if(opChosen==false){
                 if(stp1==null)
                 {stp1="1";
     }
                 else{
                     stp1=stp1+"1";
                
             }
             
         }else{              if(stp2==null){stp2="1";
     }
                 else{
                     stp2=stp1+"1";
                 
             }
     
             }
  
         }
             
             if(src.equals(two)){
             if(opChosen==false){
                 if(stp1==null){stp1="2";
     }
                 else{
                     stp1=stp1+"2";
                
             }
             
         }else{              if(stp2==null){stp2="2";
     }
                 else{
                     stp2=stp1+"2";
                 
             }
     
             }
  
         }
             
             if(src.equals(three)){
             if(opChosen==false){
                 if(stp1==null){stp1="3";
     }
                 else{
                     stp1=stp1+"3";
                
             }
             
         }else{              if(stp2==null){stp2="3";
     }
                 else{
                     stp2=stp1+"3";
                 
             }
     
             }
  
         }
             
             if(src.equals(four)){
             if(opChosen==false){
                 if(stp1==null){stp1="4";
     }
                 else{
                     stp1=stp1+"4";
                
             }
             
         }else{              if(stp2==null){stp2="4";
     }
                 else{
                     stp2=stp1+"4";
                 
             }
     
             }
  
         }
             
             if(src.equals(five)){
             if(opChosen==false){
                 if(stp1==null){stp1="5";
     }
                 else{
                     stp1=stp1+"5";
                
             }
             
         }else{              if(stp2==null){stp2="5";
     }
                 else{
                     stp2=stp1+"5";
                 
             }
     
             }
  
         }
             
             if(src.equals(six)){
             if(opChosen==false){
                 if(stp1==null){stp1="6";
     }
                 else{
                     stp1=stp1+"6";
                
             }
             
         }else{              if(stp2==null){stp2="6";
     }
                 else{
                     stp2=stp1+"6";
                 
             }
     
             }
  
         }
             
             if(src.equals(seven)){
             if(opChosen==false){
                 if(stp1==null){stp1="7";
     }
                 else{
                     stp1=stp1+"7";
                
             }
             
         }else{              if(stp2==null){stp2="7";
     }
                 else{
                     stp2=stp1+"7";
                 
             }
     
             }
  
         }
             
             if(src.equals(eight)){
             if(opChosen==false){
                 if(stp1==null){stp1="8";
     }
                 else{
                     stp1=stp1+"8";
                
             }
             
         }else{              if(stp2==null){stp2="8";
     }
                 else{
                     stp2=stp1+"8";
                 
             }
     
             }
  
         }
             
             if(src.equals(nine)){
             if(opChosen==false){
                 if(stp1==null){stp1="9";
     }
                 else{
                     stp1=stp1+"9";
                
             }
             
         }else{              if(stp2==null){stp2="9";
     }
                 else{
                     stp2=stp1+"9";
                 
             }
     
             }
  
         }
             
             if(src.equals(zero)){
             if(opChosen==false){
                 if(stp1==null){stp1="0";
     }
                 else{
                     stp1=stp1+"0";
                
             }
             
         }else{              if(stp2==null){stp2="0";
     }
                 else{
                     stp2=stp1+"0";
                 
             }
     
             }
  
         }
             if(equalsClicked==false){
                 if(opChosen==false){
                     answerfield.setText(stp1);
                 }else{
                     answerfield.setText(stp2);
                 }
             }
    
             
         }
 }
   
     
     
     
    
     private class Calc implements ActionListener{
  public void actionPerformed(ActionEvent event){
             JButton src =(JButton)event.getSource();
             
             if(src.equals(add)) {
            	 if(stp1==null) {
            		 System.out.println("choose numbers first");
            	 }else
            		 if(stp1 != null&&stp2 ==null) {
            			 opChosen=true;
            			 operation ='+';
            		 }else 
            			 if(stp1 !=null&&stp2 !=null) {
          
            			 System.out.println("only two operations!");
            		 }
             }
             
             if(src.equals(sub)) {
            	 if(stp1==null) {
            		 System.out.println("choose numbers first");
            	 }else
            		 if(stp1 != null&&stp2 ==null) {
            			 opChosen=true;
            			 operation='-';
            		 }else
            			 if(stp1 !=null&&stp2 !=null) {
            			 System.out.println("only two operations!");
            		 }
             }
             if(src.equals(multiply)) {
            	 if(stp1==null) {
            		 System.out.println("choose numbers first");
            	 }else
            		 if(stp1 != null&&stp2 ==null) {
            			 opChosen=true;
            			 operation='=';
            		 }else
            			 if(stp1 !=null&&stp2   !=null) {
            			 
            			 
            			 System.out.println("only two operations!");
            		 }
             }
             if(src.equals(divide)) {
            	 if(stp1==null) {
            		 System.out.println("choose numbers first");
            	 }else
            		 if(stp1 != null&&stp2 ==null) {
            			 opChosen=true;
            			 operation='/';
            		 }else
            			 if(stp1!=null&&stp2 !=null) {
            			 
            			 System.out.println("only two operations!");
            		 }
             }
             if(src.equals(equal)) {
            	 if(stp1==null) {
            		 System.out.println("choose numbers first");
            	 }else
            		 if(stp1 != null&&stp2 ==null) {
            			
            			 System.out.println("only two operations!");
            		 }
            	 if(stp1 !=null&&stp2 !=null) {
            		 double d1= 0.0, d2= 0.0;
            		 d1=Double.parseDouble(stp1);
            		 d2=Double.parseDouble(stp2);
            		 switch(operation) {
            		 case '+':
            			 answer=d1+d2;
            			 break;
            		 case'-':
            			 answer=d1-d2;
            			 break;
            		 case '*':
            			 answer=d1*d2;
            			 break;
            		 case '/':
            			 answer=d1/d2;
            			 break ;	
            		 
            	 }
            	 
            		 stpanswer =Double.toString(answer);
            		 answerfield.setText(stpanswer);
            		 
            		 if(operation == '/' &&d2 ==0.0) {
            			 answerfield.setText("DIVIDE BY 0 ERROR");
            		 }
             }
             }
             if(src.equals(reset)) {
            	 stp1=null;
            	 stp2=null;
            	 equalsClicked=false;
            	 opChosen=false;
            	 operation=' ';
            	 answerfield.setText(null);
            	 stpanswer=null;
            	 
             }
  }
     }
     public void enable() {
    	 off.setEnabled(false);
    	 on.setEnabled(true);
    	 answerfield.setEnabled(true);
    	 zero.setEnabled(true);
    	 one.setEnabled(true);
    	 two.setEnabled(true);
    	 three.setEnabled(true);
    	 four.setEnabled(true);
    	 five.setEnabled(true);
    	 six.setEnabled(true);
    	 seven.setEnabled(true);
    	 eight.setEnabled(true);
    	 nine.setEnabled(true);
    	 add.setEnabled(true);
    	 sub.setEnabled(true);
    	 multiply.setEnabled(true);
    	 divide.setEnabled(true);
    	 equal.setEnabled(true);
    	 delete.setEnabled(true);
    	 reset.setEnabled(true);
    	 period.setEnabled(true);
    	
    	 
     }
     public void disable() {
    	 answerfield.setText(" ");
    	 off.setEnabled(false);
    	 on.setEnabled(true);
    	 answerfield.setEnabled(false);
    	 zero.setEnabled(false);
    	 one.setEnabled(false);
    	 two.setEnabled(false);
    	 three.setEnabled(false);
    	 four.setEnabled(false);
    	 five.setEnabled(false);
    	 six.setEnabled(false);
    	 seven.setEnabled(false);
    	 eight.setEnabled(false);
    	 nine.setEnabled(false);
    	 add.setEnabled(false);
    	 sub.setEnabled(false);
    	 multiply.setEnabled(false);
    	 divide.setEnabled(false);
    	 equal.setEnabled(false);
    	 delete.setEnabled(false);
    	 reset.setEnabled(false);
    	 period.setEnabled(false);
    	 
    	 
    	 
     }
     
    	 
    
     }
             
             
       
      
    		 
     

     
 
     
     
         
     
       
      
         
   
            
     
         
    
     

     

    

