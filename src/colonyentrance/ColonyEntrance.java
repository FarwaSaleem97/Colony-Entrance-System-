package colonyentrance;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

class Farwa extends JFrame{
    private JLabel label1;
    public  Farwa(){
    super( "Information" );
    setLayout( new FlowLayout() );
    Icon bug = new ImageIcon( getClass().getResource( "bug1.png" ) );
label1 = new JLabel(); 
label1.setText( "Farwa Saleem                               03000000001                              House Num 01" );
label1.setFont(new Font("callibri", Font.BOLD, 16));
label1.setIcon( bug ); 
label1.setHorizontalTextPosition( SwingConstants.CENTER );
label1.setVerticalTextPosition( SwingConstants.BOTTOM );
 add( label1 );
}}
class Aamir  extends JFrame{
    private  JLabel label2;
    public  Aamir(){
 super( "Information" );
    setLayout( new FlowLayout() );
    Icon bug = new ImageIcon( getClass().getResource( "bug2.png" ) );
label2 = new JLabel(); 
label2.setText( "Aamir Mughal                              03000000002                              House Num 02" );
label2.setFont(new Font("callibri", Font.BOLD, 16));
label2.setIcon( bug ); 
label2.setHorizontalTextPosition( SwingConstants.CENTER );
label2.setVerticalTextPosition( SwingConstants.BOTTOM );
 add( label2);
}}
class Arslan extends JFrame{
    private  JLabel label3;
public  Arslan(){
 super( "Information" );
    setLayout( new FlowLayout() );
    Icon bug = new ImageIcon( getClass().getResource( "bug3.png" ) );
label3 = new JLabel();
label3.setText( "M. Arslan                                    03000000003                                 House Num 03" );
label3.setFont(new Font("callibri", Font.BOLD, 16));
label3.setIcon( bug );
label3.setHorizontalTextPosition( SwingConstants.CENTER );
label3.setVerticalTextPosition( SwingConstants.BOTTOM );
 add( label3);
}}
class Hamza extends JFrame{
    private JLabel label4;
public Hamza(){ 
 super( "Information" );
    setLayout( new FlowLayout() );
    Icon bug = new ImageIcon( getClass().getResource( "bug4.png" ) );
label4 = new JLabel(); 
label4.setText( "Hamza Arshad                            03000000004                              House Num 04" );
label4.setFont(new Font("callibri", Font.BOLD, 16));
label4.setIcon( bug );
label4.setHorizontalTextPosition( SwingConstants.CENTER );
label4.setVerticalTextPosition( SwingConstants.BOTTOM );
 add( label4);
}}
public class ColonyEntrance{
    public void invalid(){
    JOptionPane.showMessageDialog(null,"No Person Found! You Entered Invalid Name","INVALID",JOptionPane.ERROR_MESSAGE);
}
public static void main(String[] args) { 
    ColonyEntrance u=new ColonyEntrance();
    String name=JOptionPane.showInputDialog(null,"Enter Your Name: ","Input Name",JOptionPane.QUESTION_MESSAGE);
    while(true){
    if("Farwa".equals(name)){
         int choice = JOptionPane.showConfirmDialog(null," Person Found \n Are You Sure to See Her Info?","Name match",JOptionPane.INFORMATION_MESSAGE); 
    if (choice == JOptionPane.YES_OPTION) {
  Farwa f = new Farwa(); 
  f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  f.setSize( 600, 300 ); 
  f.setVisible( true );
  break;
    }
    else {
        JOptionPane.showMessageDialog(null,"Thank You");
        break;
}}
  if("Aamir".equals(name)){
       int choice = JOptionPane.showConfirmDialog(null," Person Found \n Are You Sure to See His Info?","Name match",JOptionPane.INFORMATION_MESSAGE); 
    if (choice == JOptionPane.YES_OPTION) {
  Aamir aa = new Aamir(); 
  aa.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  aa.setSize( 600, 300 ); 
  aa.setVisible( true );
  break;
}
    else {
        JOptionPane.showMessageDialog(null,"Thank You");
        break;
}}
  if("Arslan".equals(name)){
       int choice = JOptionPane.showConfirmDialog(null," Person Found \n Are You Sure to See His Info?","Name match",JOptionPane.INFORMATION_MESSAGE); 
    if (choice == JOptionPane.YES_OPTION) {
  Arslan ar = new Arslan(); 
 ar.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 ar.setSize( 600, 300 ); 
 ar.setVisible( true );
 break;
 }
    else {
        JOptionPane.showMessageDialog(null,"Thank You");
        break;
}}
  if("Hamza".equals(name)){
       int choice = JOptionPane.showConfirmDialog(null," Person Found \n Are You Sure to See His Info?","Name match",JOptionPane.INFORMATION_MESSAGE); 
    if (choice == JOptionPane.YES_OPTION) {
  Hamza h = new Hamza(); 
h.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
h.setSize( 600, 300 ); 
h.setVisible( true );
break;
 }
    else {
        JOptionPane.showMessageDialog(null,"Thank You");
        break;
}}
 u.invalid();
 name=JOptionPane.showInputDialog(null,"Enter Your Name Again!","Enter Again..",JOptionPane.QUESTION_MESSAGE);
}
   
}}