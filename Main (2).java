import java. util. Scanner;

public class Main {
static Scanner keyboard=new Scanner(System. in);
static String input=keyboard. nextLine();

 public static void main(String[] args) {
  System. out. println(culc(input));
  }


 public static String culc(String input) {
  String answer="";
  String math=math(input);  //Определяем математическое действие
  String num1=numbers(input, math, 0);   //  разбиваем строку на два
  String num2=numbers(input, math, 1);   //  числа(String)+убираем пробелы
  boolean sc=isArabic(num1, num2);   //проверка на арабские цифры

  if(sc==true) {
   int numArabic1=Integer. parseInt(num1);//Преобразуем строку в цифру
   int numArabic2=Integer. parseInt(num2);
   String result=result(numArabic1, numArabic2, math);  // арифметическое действие
   answer= result;
   }

  else{
   int arabicNumberLeft=fromRomanToArabic(num1);   // из римских цифр
   int arabicNumberRight=fromRomanToArabic(num2);  // в арабские
   String result=result(arabicNumberLeft, arabicNumberRight, math); // арифметическое действие
   answer=fromArabicToRoman(Integer. parseInt(result));   // из арабских в римские
   }

  return answer;
  }


 static String math(String input) {
  String[] array={"+", "-", "*", "/"};
  String symb=" ";
  int j=0;
  int k=0;

  for(int i=0;i<4;i++) {               // определяем первое вхождение 
   if(input. indexOf(array[i])>-1) {    // символа из массива в строку
    symb=array[i];
    j=i;
    break;
   }
  }

  for(int i=3;i>=0;i--) {                  // проходим массив с конца+
   if(input. lastIndexOf(array[i])>-1) {    // последнее вхождение
    k=i;
    break;
   }
  }

  if((j!=k)||(input.indexOf(array[j]))!=(input.lastIndexOf(array[k]))) {
   throw new IllegalArgumentException("Допустимо только одно арифметическое действие");
  }

  if(symb==" ") {
   throw new IllegalArgumentException("Нет допустимого арифметического действия");
  }

  return symb;
  }


 static String numbers(String input,String math, int leftOrRight){
  if(math=="+") {
   math="\\+";
  }                           // "борьба" с метасимволами + и *
                               // для корректной работы split()
  if(math=="*") {          
   math="\\*";
  }

  String[] number=input. split(math);
  number[leftOrRight]= number[leftOrRight]. trim();
  return number[leftOrRight];
  }


 static String result(int num1, int num2, String math) {
  int z=0;
  if(((num1>10)||(num1<1))||((num2>10)||(num2<1))) {
   throw new IllegalArgumentException("Число(а) не входят в промежуток[1;10]");
     }

  switch(math){
   case "+":z=num1+num2;
   break;

   case "-":z=num1-num2;
   break;

   case "*":z=num1*num2;
   break;

   case "/":z=num1/num2;
   break;
   }

  String text=(""+z);
  return text;
  }



 static boolean isArabic(String numberLeft, String numberRight) {      // проверка системы счисления
  boolean arabicLeft=true;
  boolean arabicRight=true;
  boolean isArabic=false;

  try{                                                        // проверка левого числа     
   Integer. parseInt(numberLeft);
   arabicLeft=true;
  }
  catch(java. lang. NumberFormatException ex){
   arabicLeft=false;
  }

 try{                                                         // проверка правого числа
  Integer. parseInt(numberRight);
  arabicRight=true;
  }
 catch(NumberFormatException ex2){
  arabicRight=false;
  }

 if(arabicLeft!=arabicRight) {
  throw new IllegalArgumentException(" Нельзя вводить и арабские и римские цифры");
  }

 if(arabicLeft==true){
  isArabic=true;
  }

 return isArabic;
 }


 static int fromRomanToArabic(String roman) {   // римские-->арабские
  int arabicDigit=0;
  String[] romanDigits={"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
  for(int i=0;i<romanDigits.length;i++) {
   if(roman. compareTo(romanDigits[i])==0) {
    arabicDigit=i+1;
   }
  }
 return arabicDigit;
 }


 static String fromArabicToRoman(int arabic){
  String roman="";

  if (arabic<1){
   throw new IllegalArgumentException(arabic+" Не бывает арабских цифр меньше 1");
  }

 while(arabic==100){            //79     " "
  roman="C";
  arabic-=100;                   
 }

 while(arabic>=90){             //79      " "
  roman+="XC";
  arabic-=90;
 }

 while(arabic>=50){             //29       L
  roman+="L";
  arabic-=50;
 }

 while(arabic>=40){             //29       L
  roman+="XL";
  arabic-=40;
 }

 while(arabic>=10){             //19       LXX
  roman+="X";                   //9        LXX
  arabic-=10;
 }

 while(arabic>=9){              //0         LXXIX
  roman+="IX";
  arabic-=9;
 }

 while(arabic>=5){
  roman+="V";
  arabic-=5;
 }

 while(arabic>=4){
  roman+="IV";
  arabic-=4;
 }

 while(arabic>=1){
  roman+=("I");
  arabic-=1;
 }

 return roman;
 }
}