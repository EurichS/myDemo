
import static java. lang. System. out;
import java. util. Random;
import java. util. Scanner;

public class Main {
public static void main(String args[]) {
int h1;
int h2;
int h3;
int h4;
int h5;
int h6;
int h7;
int bot;
int l1=0;
int l2=0;
int ochko=0;
int kochko=0;
do{

Met r= new Met();
Met r2=new Met();
Met r3=new Met();
Met r4=new Met();
Met r5=new Met();
Met r6=new Met();
Met r7=new Met();
Met r8=new Met();
Met r9=new Met();
Met r10=new Met();
Met r11=new Met();
Met r12=new Met();
Met r13=new Met();
Met r14=new Met();
Met ma=new Met();
Met ma2=new Met();
Met ma3=new Met();
Met ma4=new Met();
Met ma5=new Met();
Met ma6=new Met();
Met ma7=new Met();
Met ma8=new Met();
Met ma9=new Met();
Met ma10=new Met();
Met ma11=new Met();
Met ma12=new Met();
Met ma13=new Met();
Met ma14=new Met();
int rand;
int rand2;
int rand3;
int rand4;
int rand5;
int rand6;
int rand7;
int rand8;
int rand9;
int rand10;
int rand11;
int rand12;
int rand13;
int rand14;
int m1;
int m2;
int m3;
int m4;
int m5;
int m6;
int m7;
int m8;
int m9;
int m10;
int m11;
int m12;
int m13;
int m14;
Scanner keyboard= new Scanner(System. in);
char s;
char qw;
char qw5;
char qw4;
char qw3;
char qw2;
char qw1;
out. println("Добро пожаловать в игру <<Очко>>! ");
do{
out. println("Для новой игры нажмите N(New)");
out. println("Чтобы прочитать правила нажмите R(Rules)");
out. println("Чтобы посмотреть статистику нажмите S(Statistic)");
s= keyboard. findWithinHorizon(".",0).charAt(0);
}
while (s!='n' && s!='N' && s!='r' && s!='R' && s!='S' && s!='s');
if (s =='R' ||s=='r')
{out. println("В игре <<Очко>> необходимо ");
out. println("собрать комбинацию карт наиболее близкую ");
out. println("к 21, но не больше. ");
out. println("Валет стоит 2 очка, дама 3 очка");
out. println("король 4 очка, туз 11 очков, ");
out. println("остальные по номиналу. ");
out. println("Если у игрока с двух первых карт");
 out. println ("получается собрать 22,");
out. println("то объявляется автопобеда. ");
out. println("Удачи! ");
out. println("");
out. println("Для выхода в меню нажмите");
out. println("любую клавишу");
out. print("");
char qwerty=keyboard. findWithinHorizon(".",0).charAt(0);}

if (s =='s' ||s=='S')
{out. println("Статистика: ");
out. println("Твои победы: "+l1);
out. println("Победы бота: "+l2);
out.println("У тебя очко было "+ochko+" раз");
out. println("Королевское очко случилось "+kochko+" раз");
out. println("");

out. println("Для выхода в меню нажмите");
out. println("любую клавишу");
out. print("");
char qwertyz=keyboard. findWithinHorizon(".",0).charAt(0);}

if (s =='n' ||s=='N'){



do{
out. println("");
do{
rand= new Random(). nextInt(11)+1;
}
while (rand == 5 || rand == 1);

do{
rand2= new Random(). nextInt(11)+1;
}
while (rand2 ==5 || rand2 == 1);

do{
rand3= new Random(). nextInt(11)+1;
}
while (rand3 ==5 || rand3 == 1);

do{
rand4= new Random(). nextInt(11)+1;
}
while (rand4 ==5 || rand4 == 1);

do{
rand5= new Random(). nextInt(11)+1;
}
while (rand5 ==5 || rand5 == 1);

do{
rand6= new Random(). nextInt(11)+1;
}
while (rand6 ==5 || rand6 == 1);

do{
rand7= new Random(). nextInt(11)+1;
}
while (rand7 ==5 || rand7 == 1);

do{
rand8= new Random(). nextInt(11)+1;
}
while (rand8 ==5 || rand8 == 1);

do{
rand9= new Random(). nextInt(11)+1;
}
while (rand9 ==5 || rand9 == 1);

do{
rand10= new Random(). nextInt(11)+1;
}
while (rand10 ==5 || rand10 == 1);

do{
rand11= new Random(). nextInt(11)+1;
}
while (rand11 ==5 || rand11 == 1);

do{
rand12= new Random(). nextInt(11)+1;
}
while (rand12 ==5 || rand12 == 1);


do{
rand13= new Random(). nextInt(11)+1;
}
while (rand13 ==5 || rand13 == 1);

do{
rand14= new Random(). nextInt(11)+1;
}
while (rand14 ==5 || rand14 == 1);

m1=new Random(). nextInt(4)+1;

m2=new Random(). nextInt(4)+1;

m3=new Random(). nextInt(4)+1;

m4=new Random(). nextInt(4)+1;

m5=new Random(). nextInt(4)+1;

m6=new Random(). nextInt(4)+1;

m7=new Random(). nextInt(4)+1;

m8=new Random(). nextInt(4)+1;

m9=new Random(). nextInt(4)+1;

m10=new Random(). nextInt(4)+1;

m11=new Random(). nextInt(4)+1;

m12=new Random(). nextInt(4)+1;

m13=new Random(). nextInt(4)+1;

m14=new Random(). nextInt(4)+1;

}
while(((rand==rand2 && m1==m2)||
(rand==rand3 && m1==m3)||
(rand==rand4 && m1==m4)||
(rand==rand5 && m1==m5)||
(rand==rand6 && m1==m6)||
(rand==rand7 && m1==m7)||
(rand==rand8 && m1==m8)||
(rand==rand9 && m1==m9)||
(rand==rand10 && m1==m10)||
(rand==rand11 && m1==m11)||
(rand==rand12 && m1==m12)||
(rand==rand13 && m1==m13)||
(rand==rand14 && m1==m14))||

((rand2==rand3 && m2==m3)||
(rand2==rand4 && m2==m4)||
(rand2==rand5 && m2==m5)||
(rand2==rand6 && m2==m6)||
(rand2==rand7 && m2==m7)||
(rand2==rand8 && m2==m8)||
(rand2==rand9 && m2==m9)||
(rand2==rand10 && m2==m10)||
(rand2==rand11 && m2==m11)||
(rand2==rand12 && m2==m12)||
(rand2==rand13 && m2==m13)||
(rand2==rand14 && m2==m14))||

((rand3==rand4 && m3==m4)||
(rand3==rand5 && m3==m5)||
(rand3==rand6 && m3==m6)||
(rand3==rand7 && m3==m7)||
(rand3==rand8 && m3==m8)||
(rand3==rand9 && m3==m9)||
(rand3==rand10 && m3==m10)||
(rand3==rand11 && m3==m11)||
(rand3==rand12 && m3==m12)||
(rand3==rand13 && m3==m13)||
(rand3==rand14 && m3==m14))||

((rand4==rand5 && m4==m5)||
(rand4==rand6 && m4==m6)||
(rand4==rand7 && m4==m7)||
(rand4==rand8 && m4==m8)||
(rand4==rand9 && m4==m9)||
(rand4==rand10 && m4==m10)||
(rand4==rand11 && m4==m11)||
(rand4==rand12 && m4==m12)||
(rand4==rand13 && m4==m13)||
(rand4==rand14 && m4==m14))||

((rand5==rand6 && m5==m6)||
(rand5==rand7 && m5==m7)||
(rand5==rand8 && m5==m8)||
(rand5==rand9 && m5==m9)||
(rand5==rand10 && m5==m10)||
(rand5==rand11 && m5==m11)||
(rand5==rand12 && m5==m12)||
(rand5==rand13 && m5==m13)||
(rand5==rand14 && m5==m14))||

((rand6==rand7 && m6==m7)||
(rand6==rand8 && m6==m8)||
(rand6==rand9 && m6==m9)||
(rand6==rand10 && m6==m10)||
(rand6==rand11 && m6==m11)||
(rand6==rand12 && m6==m12)||
(rand6==rand13 && m6==m13)||
(rand6==rand14 && m6==m14))||

((rand7==rand8 && m7==m8)||
(rand7==rand9 && m7==m9)||
(rand7==rand10 && m7==m10)||
(rand7==rand11 && m7==m11)&&
(rand7==rand12 && m7==m12)||
(rand7==rand13 && m7==m13)||
(rand7==rand14 && m7==m14))||

((rand8==rand9 && m8==m9)||
(rand8==rand10 && m8==m10)||
(rand8==rand11 && m8==m11)||
(rand8==rand12 && m8==m12)||
(rand8==rand13 && m8==m13)||
(rand8==rand14 && m8==m14))||

((rand9==rand10 && m9==m10)||
(rand9==rand11 && m9==m11)||
(rand9==rand12 && m9==m12)||
(rand9==rand13 && m9==m13)||
(rand9==rand14 && m9==m14))||

((rand10==rand11 && m10==m11)||
(rand10==rand12 && m10==m12)||
(rand10==rand13 && m10==m13)||
(rand10==rand14 && m10==m14))||

((rand11==rand12 && m11==m12)||
(rand11==rand13 && m11==m13)||
(rand11==rand14 && m11==m14))||

((rand12==rand13 && m12==m13)||
(rand12==rand14 && m12==m14))||
(rand13==rand14 && m13==m14));

r. j=rand;
r2. j=rand2;
r3. j=rand3;
r4. j=rand4;
r5. j=rand5;
r6. j=rand6;
r7. j=rand7;
r8. j=rand8;
r9. j=rand9;
r10. j=rand10;
r11. j=rand11;
r12. j=rand12;
r13. j=rand13;
r14. j=rand14;


ma. a=m1;
ma2. a=m2;
ma3. a=m3;
ma4. a=m4;
ma5. a=m5;
ma6. a=m6;
ma7. a=m7;
ma8. a=m8;
ma9. a=m9;
ma10. a=m10;
ma11. a=m11;
ma12. a=m12;
ma13. a=m13;
ma14. a=m14;

if(rand+rand2==21){
out. println("Твои карты: ");
out. print(r.Mett()+" "+ ma. mast());
out. println(" "+rand+" очка(ов)");
out. print(r2. Mett()+" "+ma2. mast());
out. println(" "+rand2+" очка(ов)");
out. println("Очко с двух карт! Вау! ");
h1=(rand+rand2);
}
if(rand+rand2==22){
out. println("Твои карты: ");
out. print(r.Mett()+" "+ ma. mast());
out. println(" "+rand+" очка(ов)");
out. print(r2. Mett()+" "+ma2. mast());
out. println(" "+rand2+" очка(ов)");
out. print("Как говорится, <<Королевское очко>>. Автовин! ");
h1=(rand+rand2);
}
else{

do{
out. println("Твои карты: ");
out. print(r.Mett()+" "+ ma. mast());
out. println(" "+rand+" очка(ов)");
out. print(r2. Mett()+" "+ma2. mast());
out. println(" "+rand2+" очка(ов)");
out. println("Всего "+(rand+rand2)+" очка(ов)");
out. println("Еще? ");
out. println("Для следующей карты введите N(Next)");
out. println("Если достаточно- E(Enough)");
qw= keyboard. findWithinHorizon(".",0).charAt(0);}
while (qw!='n' && qw!='N' && qw!='e' && qw!='E');
if (qw== 'e' ||qw=='E'){h1=(rand+rand2);}
else{

out. print("Новая карта: ");
out. println(r3. Mett()+" "+ma3. mast());
out. println(rand3+" очка(ов)");
out. println("Всего "+(rand+rand2+rand3)+" очков");
if (rand+rand2+rand3==21)
{out.println("Очко!");
h1=21;}
if((rand+rand2+rand3)>21)
{out.print("Перелет!");
h1=0;}
else{

do{
out. println("Еще? ");
out. println("Для следующей карты введите N(Next)");
out. println("Если достаточно- E(Enough)");
qw1= keyboard. findWithinHorizon(".",0).charAt(0);}
while (qw1!='n' && qw1!='N' && qw1!='e' && qw1!='E');

if (qw1== 'e' ||qw1=='E'){
h1=(rand+rand2+rand3);}

else{

out. print("Новая карта: ");
out. println(r4. Mett()+" "+ma4. mast());
out. println(rand4+" очка(ов)");
out. println("Всего "+(rand+rand2+rand3+rand4)+" очка(ов)");

if (rand+rand2+rand3+rand4==21)
{out.println("Очко!");
h1=21;}
if((rand+rand2+rand3+rand4)>21)
{out.print("Перелет!");
h1=0;}

else{
do{
out. println("Еще? ");
out. println("Для следующей карты введите N(Next)");
out. println("Если достаточно- E(Enough)");
qw2= keyboard. findWithinHorizon(".",0).charAt(0);}
while (qw2!='n' && qw2!='N' && qw2!='e' && qw2!='E');
if (qw2== 'E' ||qw2=='e'){h1=rand+rand2+rand3+rand4;}

else{

out. print("Новая карта: ");
out. println(r5. Mett()+" "+ma5. mast());
out. println(rand5+" очка(ов)");
out. println("Всего "+(rand+rand2+rand3+rand4+rand5)+" очка(ов)");
if (rand+rand2+rand3+rand4+rand5==21)
{out.println("Очко!");
h1=21;}
if((rand+rand2+rand3+rand4+rand5)>21)
{out.print("Перелет!");
h1=0;}

else{
do{
out. println("Еще? ");
out. println("Для следующей карты введите N(Next)");
out. println("Если достаточно- E(Enough)");
qw3= keyboard. findWithinHorizon(".",0).charAt(0);}
while (qw3!='n' && qw3!='N' && qw3!='e' && qw3!='E');
if (qw3== 'E' ||qw3=='e'){h1=rand+rand2+rand3+rand4+rand5;}

else{

out. print("Новая карта: ");
out. println(r6. Mett()+" "+ma6. mast());
out. println(rand6+" очка(ов)");
out. println("Всего "+(rand+rand2+rand3+rand4+rand5+rand6)+" очков");

if (rand+rand2+rand3+rand4+rand5+rand6==21)
{out.println("Очко!");
h1=21;}
if((rand+rand2+rand3+rand4+rand5+rand6)>21)
{out.print("Перелет!");
h1=0;}

else{
do{
out. println("Еще? ");
out. println("Для следующей карты введите N(Next)");
out. println("Если достаточно- E(Enough)");
qw4= keyboard. findWithinHorizon(".",0).charAt(0);}
while (qw4!='n' && qw4!='N' && qw4!='e' && qw4!='E');
if (qw4== 'e' ||qw4=='E'){h1=rand+rand2+rand3+rand4+rand5+rand6;}

else{

out. print("Новая карта: ");
out. println(r7. Mett()+" "+ma7. mast());
out. println(rand7+" очка(ов)");
out. println("Всего "+(rand+rand2+rand3+rand4+rand5+rand6+rand7)+" очка(ов)");
if (rand+rand2+rand3+rand4+rand5+rand6+rand7>21){
 out.println("Перебор");
 h1=0;
 out.println(h1+" очка(ов)");
 }

if(rand+rand2+rand3+rand4+rand5+rand6+rand7==21){
 out.println("Очко");
h1=rand+rand2+rand3+rand4+rand5+rand6+rand7;}

else{
do{
out. println("Еще? ");
out. println("Для следующей карты введите N(Next)");
out. println("Если достаточно- E(Enough)");
qw5= keyboard. findWithinHorizon(".",0).charAt(0);}
while (qw5!='n' && qw5!='N' && qw5!='e' && qw5!='E');

if (qw5== 'e' ||qw5=='E'){h1=rand+rand2+rand3+rand4+rand5+rand6+rand7;}

else{
out. print("Новая карта: ");
out. println(r8. Mett()+" "+ma8. mast());
out. println(rand8+" очка(ов)");
out. println("Всего "+(rand+rand2+rand3+rand4+rand5+rand6+rand7+rand8)+" очков");

if (rand+rand2+rand3+rand4+rand5+rand6+rand7+rand8>21){
 out.println("Перебор");
 h1=0;}
if(rand+rand2+rand3+rand4+rand5+rand6+rand7==21){
out.println("Очко!");
 h1=21;}

else{

out. println("Полагаю, дальше брать уже нет смысла");
h1=(rand+rand2+rand3+rand4+rand5+rand6+rand7+rand8);}

}//if qw5=n
}
}//if qw4
}
}//if qw3
}
}//if qw2
}
}// if qw1
}
}// if qw
}//end cicle of player

out. println("");
out. println("Что же там у бота? ");

out. println(r14. Mett()+" "+ma14. mast());

out. println(r13. Mett()+" "+ma13. mast());

int g;
g=(rand14+rand13);
int ha=new Random(). nextInt(100)+1;
int ha2=new Random(). nextInt(100)+1;
int ha3=new Random(). nextInt(100)+1;
int ha4=new Random(). nextInt(100)+1;
int ha5=new Random(). nextInt(100)+1;
int ha6=new Random(). nextInt(100)+1;
int ha7=new Random(). nextInt(100)+1;
int ha8=new Random(). nextInt(100)+1;
int ha9=new Random(). nextInt(100)+1;
if(g<11){
g=(rand14+rand13+rand12);
out. println(r12. Mett()+" "+ma12. mast());
if(g<11){
g=(rand14+rand13+rand12+rand11);
out. println(r11. Mett()+" "+ma11. mast());
 if(g<11){ g=(rand14+rand13+rand12+rand11+rand10);
 out. println(r10. Mett()+" "+ma10. mast());
 }
}
}
if(g==11 && ha>3 ){g=11+rand9;
out. println(r9. Mett()+" "+ma9. mast());
}
if(g==12 && ha2>7){g=12+rand9;
out. println(r9. Mett()+" "+ma9. mast());
}
if(g==13 && ha3>10){g=13+rand8;
out. println(r8. Mett()+" "+ma8. mast());
}
if(g==14 && ha4>24){g=14+rand8;
out. println(r8. Mett()+" "+ma8. mast());
}
if(g==15 && ha5>38){g=15+rand7;
out. println(r7. Mett()+" "+ma7. mast());
}
if(g==16 && ha6>55){g=16+rand7;
out. println(r7. Mett()+" "+ma7. mast());
}
if(g==17 && ha7>69){g=17+rand6;
out. println(r6. Mett()+" "+ma6. mast());
}
if(g==18 && ha8>89){g=18+rand6;
out. println(r6. Mett()+" "+ma6. mast());
}
if(g==19 && ha9>95){g=19+rand5;
out. println(r5. Mett()+" "+ma5. mast());
}
if(g==21){out.println(" У Бота Очко! ");
bot=21;}
if(g>21){out.println("У Бота перебор ("+g+" очков)");
bot=0;}
else{bot=g;
out. println("У Бота "+g+" очков");}

if ((h1==bot)&&(h1==0)){out.println("Вы с Ботом оба перебрали");
out. println("Достойная схватка! ");
}

if ((h1==bot)&&(h1 !=0)){out.println("Вы с Ботом набрали одинаково");
out. println("А Бот неплох, ");
out. println("не правда ли, Юля? ");
}
if(h1>bot){
 l1++;
 out. println("Достойная победа над железякой! ");
}
if(h1<bot){
 l2++;
 out. println("Проиграть боту... ");
 out. println("Жестко");
}
if(h1==21){ochko++;}
if(h1==22){kochko++;}
out. println("");
out. println("Для выхода в главное меню ");
out. println("нажмите любую клавишу");
char qw100= keyboard. findWithinHorizon(".",0).charAt(0);}
}

while( l1 !=1000000);
}
}



 class Met{
int j;
int a;
String ko;
String ko2;
String ko3;
String ko4;
String ko5;
String ko6;
String ko7;
String ko8;
String ko9;
String mo;

public String Mett(){
if (j==10){ko= "десятка";}
if (j==2){ko="валет";}
if (j==3){ko="дама";}
if (j==11){ko="туз";}
if (j==4){ko="король";}
if (j==6){ko="шестерка";}
if (j==7){ko="семерка";}
if (j==8){ko="восьмерка";}
if (j==9){ko="девятка";}

return ko;}





public String mast(){
if (a==1){mo="крестей";}
if(a==2){mo="пики";}
if(a==3){mo="червей";}
if(a==4){mo="бубей";}
return mo;}

}






















